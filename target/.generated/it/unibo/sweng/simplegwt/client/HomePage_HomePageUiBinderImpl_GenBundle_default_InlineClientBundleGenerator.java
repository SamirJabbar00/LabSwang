package it.unibo.sweng.simplegwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ResourcePrototype;

public class HomePage_HomePageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator implements it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenBundle {
  private static HomePage_HomePageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator _instance0 = new HomePage_HomePageUiBinderImpl_GenBundle_default_InlineClientBundleGenerator();
  private void styleInitializer() {
    style = new it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenCss_style() {
      private boolean injected;
      public boolean ensureInjected() {
        if (!injected) {
          injected = true;
          com.google.gwt.dom.client.StyleInjector.inject(getText());
          return true;
        }
        return false;
      }
      public String getName() {
        return "style";
      }
      public String getText() {
        return com.google.gwt.i18n.client.LocaleInfo.getCurrentLocale().isRTL() ? (("#Informazioni{margin-right:" + ("300px")  + ";margin-top:" + ("50px")  + ";}#immagine{margin-right:" + ("110px")  + ";}")) : (("#Informazioni{margin-left:" + ("300px")  + ";margin-top:" + ("50px")  + ";}#immagine{margin-left:" + ("110px")  + ";}"));
      }
    }
    ;
  }
  private static class styleInitializer {
    static {
      _instance0.styleInitializer();
    }
    static it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenCss_style get() {
      return style;
    }
  }
  public it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenCss_style style() {
    return styleInitializer.get();
  }
  private static java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype> resourceMap;
  private static it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenCss_style style;
  
  public ResourcePrototype[] getResources() {
    return new ResourcePrototype[] {
      style(), 
    };
  }
  public ResourcePrototype getResource(String name) {
    if (GWT.isScript()) {
      return getResourceNative(name);
    } else {
      if (resourceMap == null) {
        resourceMap = new java.util.HashMap<java.lang.String, com.google.gwt.resources.client.ResourcePrototype>();
        resourceMap.put("style", style());
      }
      return resourceMap.get(name);
    }
  }
  private native ResourcePrototype getResourceNative(String name) /*-{
    switch (name) {
      case 'style': return this.@it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl_GenBundle::style()();
    }
    return null;
  }-*/;
}
