package no.ntnu.ais.fmu4j.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class FmuBuilderPlugin implements Plugin<Project> {

    private Project project;
    private FmuBuilder buildFmu;

    @Override
    public void apply(Project target) {
        this.project = target;
        this.buildFmu = target.getTasks().create("fmu4j", FmuBuilder.class);
        this.buildFmu.dependsOn(target.getTasks().getByName("build"));
        this.buildFmu.setGroup("fmu-export");
        target.getGradle().addListener(this);
    }
}
