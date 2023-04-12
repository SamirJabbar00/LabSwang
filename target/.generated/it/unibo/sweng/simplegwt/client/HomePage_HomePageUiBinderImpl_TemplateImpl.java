package it.unibo.sweng.simplegwt.client;

public class HomePage_HomePageUiBinderImpl_TemplateImpl implements it.unibo.sweng.simplegwt.client.HomePage_HomePageUiBinderImpl.Template {
  
  public com.google.gwt.safehtml.shared.SafeHtml html1(java.lang.String arg0,java.lang.String arg1,java.lang.String arg2,java.lang.String arg3,java.lang.String arg4) {
    StringBuilder sb = new java.lang.StringBuilder();
    sb.append("<nav class='navbar navbar-expand-lg navbar-light bg-light'> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg0));
    sb.append("'></span> <button aria-controls='navbarTogglerDemo02' aria-expanded='false' aria-label='Toggle navigation' class='navbar-toggler' data-target='#navbarTogglerDemo02' data-toggle='collapse' type='button'> <span class='navbar-toggler-icon'></span> </button> <div class='collapse navbar-collapse' id='navbarTogglerDemo02'> <ul class='navbar-nav mr-auto mt-2 mt-lg-0'> <li class='nav-item active'> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg1));
    sb.append("'></span> </li> <li class='nav-item'> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg2));
    sb.append("'></span> </li> <li class='nav-item'> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg3));
    sb.append("'></span> </li> </ul> <form class='form-inline my-2 my-lg-0'> <span id='");
    sb.append(com.google.gwt.safehtml.shared.SafeHtmlUtils.htmlEscape(arg4));
    sb.append("'></span>  </form> </div> </nav>  <div id='Informazioni'> <h2>Cenni Storici</h2> <p>Le origini della nostra Università risalgono al 1175 circa, quando Pillio da Medicina, dottore in leggi attivo a Bologna, venne invitato a Modena dall'élite dirigente del Comune per aprire una scuola di formazione giuridica incentrata sul diritto romano.<br>Si tratta dunque di una delle più antiche Università europee, dopo quella di Bologna e di Parigi.</p>  <h2>Sede</h2> <dl id='Sedi' style='list-style-type:circle'> <dt> Sede di Modena</dt> <dt> Sede di Reggio Emilia</dt>  </dl> </div>   <div id='immagine'> <img src='unimore.jpg'> </div>");
return new com.google.gwt.safehtml.shared.OnlyToBeUsedInGeneratedCodeStringBlessedAsSafeHtml(sb.toString());
}
}
