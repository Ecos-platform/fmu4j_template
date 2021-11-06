# Import the load function (load_fmu)
from fmpy import *
# import fmpy

fmu = '../build/fmus/JavaSlave.fmu'
#Load the FMU

result = simulate_fmu(fmu)
print(result)
print(result['someReal'])

last_val = res['someReal'][-1]
assert last_val <= 1 and last_val > 0.9
