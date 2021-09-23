package example;

import no.ntnu.ais.fmu4j.export.fmi2.Fmi2Slave;
import no.ntnu.ais.fmu4j.export.fmi2.ScalarVariable;
import no.ntnu.ais.fmu4j.modeldescription.fmi2.Fmi2Causality;
import no.ntnu.ais.fmu4j.modeldescription.fmi2.Fmi2Variability;

import java.util.Map;

public class JavaSlave extends Fmi2Slave {

    @ScalarVariable(causality = Fmi2Causality.output)
    private double someReal = 0;

    private int someManuallyRegisteredInt = -99;

    public JavaSlave(Map<String, ?> args) {
        super(args);
    }

    @Override
    protected void registerVariables() {

        register(integer("someInt", () -> someManuallyRegisteredInt)
                .setter((value -> someManuallyRegisteredInt = value))
                .causality(Fmi2Causality.parameter)
                .variability(Fmi2Variability.fixed));

    }

    @Override
    public void setupExperiment(double startTime, double stopTime, double tolerance) {
        super.setupExperiment(startTime, stopTime, tolerance);
    }

    @Override
    public void enterInitialisationMode() {
        super.enterInitialisationMode();
    }

    @Override
    public void exitInitialisationMode() {
        super.exitInitialisationMode();
    }

    @Override
    public void doStep(double currentTime, double dt) {

        someReal = currentTime;

    }

    @Override
    public void terminate() {
        super.terminate();
    }

}
