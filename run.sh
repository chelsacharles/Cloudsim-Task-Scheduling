#Round Robin
echo "Running RR"
ant rr > log/rr.log
echo "Finished"
sleep 1

#
echo "Running FCFS"
ant fcfs > log/fcfs.log
echo "Finished"
sleep 1

#
echo "Running PSO"
ant pso > log/pso.log
echo "Finished"
sleep 1

#
echo "Running SJF"
ant sjf > log/sjf.log
echo "Finished"
sleep 1

#Genetic Algorithm
echo "Running Genetic Algorithm"
ant ga > log/ga.log
echo "Finished"
sleep 1

#New Genetic Algorithm
echo "Running New Genetic Algorithm"
ant newga > log/newga.log
echo "Finished"
sleep 1

