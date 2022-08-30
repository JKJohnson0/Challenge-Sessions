package ChallengeList;

public class DroneFlightPlanner {

	static int calcDroneMinEnergy(int[][] route) {
		// your code goes here
		int fuel = 0;
		int fuelDeficit = 0;

		for(int i = 0; i < route.length-1 ;i++){
			fuel += route[i][2] - route[i+1][2];
			System.out.println(fuel);
			if(fuel < fuelDeficit){
				fuelDeficit = fuel;
			}
		}

		return Math.abs(fuelDeficit);
	}


}