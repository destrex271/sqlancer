package lama.mysql.ast;

import lama.Randomly;

public class MySQLOrderByTerm extends MySQLExpression {
	
	private final MySQLOrder order;
	private final MySQLExpression expr;

	public enum MySQLOrder {
		ASC, DESC;

		public static MySQLOrder getRandomOrder() {
			return Randomly.fromOptions(MySQLOrder.values());
		}
	}
	
	public MySQLOrderByTerm(MySQLExpression expr, MySQLOrder order) {
		this.expr = expr;
		this.order = order;
	}

	public MySQLOrder getOrder() {
		return order;
	}

	public MySQLExpression getExpr() {
		return expr;
	}

	@Override
	public MySQLConstant getExpectedValue() {
		throw new AssertionError(this);
	}

}
