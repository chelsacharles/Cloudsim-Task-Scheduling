package lab.cloudsim.taskscheduling;

import java.text.DecimalFormat;
import java.util.Random;

public class RunAlgorithm
{
	public static void main(String[] args)
	{
		
	}
	public static void printSpendTime(String finishTm,long trainTm,String algorithm) {
		System.out.println("This schedule plan takes "+finishTm+" ms to finish execution, takes "+trainTm+"ms to train in "+algorithm);
	}
	public static void createTestData(String filePath)
	{
				int taskNum=50000;
		int[]taskLength=new int[taskNum];
		for(int i=0;i<taskNum;i++)
		{
			taskLength[i]=(new Random().nextInt(200)+1)*50+new Random().nextInt(500);
		}
		
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<taskNum;i++)
		{
			sb.append(taskLength[i]).append("\t");
			if(i%20==19)			{
				Ga.writeTxtAppend(filePath, sb.toString());
				sb=null;
				sb=new StringBuilder();
			}
		}
	}

}
