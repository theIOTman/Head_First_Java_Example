package chap04BattleShip;

public class TestBattleShipDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BattleShip dot = new BattleShip();
		
		int[] locations = {2, 3, 4};
		dot.setLocationCells(locations);
		
		String userGuess = "1";
		String result = dot.checkYourSelf(userGuess);
		String testResult = "failed";
		
		if (result.equals("hit")) {
			testResult = "passed";
		}
		
		System.out.println(testResult);
	}

}
