package list;

public class Ranking_of_application {
	public static void main(String[] args) {
		// Ranking_of_application r1= new Ranking_of_application();
		RankAssignAlgorithm r1= new RankAssignAlgorithm();
		
		RankingApp[] RP = { new RankingApp("facebook", 0), new RankingApp("instagram", 0),
				new RankingApp("snapchat", 0), new RankingApp("linkedin", 0) };
		r1.rankAssign(RP);
		for (RankingApp name : RP) {
		System.out.println("Ranking app name is " + name);
		}

		
		
		
	}

	static class RankingApp {
		String AppName;
		int score;

		public RankingApp(String AppName, int score) {
			super();
			this.AppName = AppName;
			this.score = score;
		}

		@Override
		public String toString() {
			return AppName + " (score: " + score + ")";
		}
	}

	static class RankAssignAlgorithm
	{
	public 	void rankAssign(RankingApp[] names)
		{
			for (RankingApp name  :  names)
			{
				name.score =assignScore(name.AppName);
			}
		}
	private int assignScore(String AppName)
	{
		if(AppName. equalsIgnoreCase("facebook"))
			return  75;
		else if(AppName. equalsIgnoreCase("instagram"))
			return  105;
		else if(AppName. equalsIgnoreCase("snapchat"))
			return  85;
		else
			return  90;
	}
	}
	
	
}
