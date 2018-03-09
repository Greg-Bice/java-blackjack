package pkgEnum;

public enum eRank {

	TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11, 10, 10), QUEEN(12, 10, 10), KING(13, 10, 10), ACE(14, 1, 11);

	private int iRankNbr;
	private int iMin;
	private int iMax;

	private eRank(int iRankNbr) {
		this(iRankNbr, iRankNbr, iRankNbr);
	}
	
	private eRank( int iRankNbr, int iMin, int iMax ) {
		this.iRankNbr = iRankNbr;
		this.iMin = iMin;
		this.iMax = iMax;
	}

	public int getiRankNbr() {
		return iRankNbr;
	}
	
	public int getMin() {
		return iMin;
	}

	public int getMax() {
		return iMax;
	}
	
}
