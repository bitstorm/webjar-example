package org.example;

import de.agilecoders.wicket.webjars.WicketWebjars;
import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

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