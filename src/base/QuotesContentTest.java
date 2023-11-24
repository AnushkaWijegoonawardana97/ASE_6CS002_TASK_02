package base;

import org.junit.Test;

public class QuotesContentTest {

	@Test
	public void testQuotesContentArrayNotNull() {
		assertNotNull(QuotesContent.stuff);
	}

	@Test
	public void testQuotesContentArrayNotEmpty() {
		assertTrue(QuotesContent.stuff.length > 0);
	}

	@Test
	public void testIndividualQuotesNotNullAndNotEmpty() {
		for (String quote : QuotesContent.stuff) {
			assertNotNull(quote);
			assertFalse(quote.isEmpty());
		}
	}
}
