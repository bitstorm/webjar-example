package org.example;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;
import de.agilecoders.wicket.webjars.WicketWebjars;

public class WicketApplication extends WebApplication {
  

  @Override
  public Class<? extends Page> getHomePage() {
    return HomePage.class;
  }
  
  
  @Override
  protected void init() {
    super.init();
    WicketWebjars.install(this);
  }
}