package org.example;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class BasePage extends WebPage {
	private static final long serialVersionUID = 1L;
    
	public BasePage(final PageParameters parameters) {
		super(parameters);
	}
}
