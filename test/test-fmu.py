# Import the load function (load_fmu)
from pyfmi import load_fmu

#Load the FMU
model = load_fmu('../build/fmus/JavaSlave.fmu')


res = model.simulate(final_time=1)
print(res['someReal'])


