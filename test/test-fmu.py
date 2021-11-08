# Import the load function (load_fmu)
from pyfmi import load_fmu

#Load the FMU
model = load_fmu('../build/fmus/JavaSlave.fmu')


res = model.simulate(final_time=1)

last_val = res['someReal'][-1]
assert last_val <= 1 and last_val > 0.9


