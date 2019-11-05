class Test{
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Preetikant");

		//conversion from StringBuffer to StrinBuilder
		String str = sb.toString();
		StringBuilder sbdr = new StringBuilder(str);
		System.out.println(sbdr);
	}
}