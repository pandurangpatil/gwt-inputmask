package open.pandurang.gwt.inputmask.client;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.dom.client.Element;

public class InputMask {
    public static Map<String, OnCompleteHandler>   onCompleteHandlersMapping   = new HashMap<>();
    public static Map<String, OnInCompleteHandler> onIncompleteHandlersMapping = new HashMap<>();
    public static Map<String, OnClearedHandler>    onClearedHandlersMapping    = new HashMap<>();

    static {
        ScriptInjector.fromString(JsHelperResource.INSTANCE.dependencyLib().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(JsHelperResource.INSTANCE.inputMask().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(JsHelperResource.INSTANCE.inputMaskExtensions().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(JsHelperResource.INSTANCE.inputMaskDateExtensions().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(JsHelperResource.INSTANCE.inputMaskNumericExtensions().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
        ScriptInjector.fromString(JsHelperResource.INSTANCE.inputMaskPhoneExtensions().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
    }

    public final native void mask(String alias, Element element)/*-{
		$wnd.Inputmask(alias).mask(element);
    }-*/;

    public final native void mask(Alias alias, Mask mk, Element element)/*-{
		$wnd.Inputmask(alias, mk).mask(element);
    }-*/;

    public final native void mask(Alias option, Element element)/*-{
		$wnd.Inputmask(option).mask(element);
    }-*/;

    public final native void mask(Mask mask, Element element)/*-{
		$wnd.Inputmask(mask).mask(element);
    }-*/;
}
