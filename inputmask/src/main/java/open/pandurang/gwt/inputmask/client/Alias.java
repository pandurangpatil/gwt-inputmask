package open.pandurang.gwt.inputmask.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Alias extends JavaScriptObject {
    protected Alias() {
    }

    public static Alias create() {
        return (Alias) createObject();
    }

    public final native void setAlias(String alias)/*-{
		this.alias = alias;
    }-*/;

    public final native String getAlias()/*-{
		return this.alias;
    }-*/;

    public final native void setInputFormat(String inputFormat)/*-{
		this.inputFormat = inputFormat;
    }-*/;

    public final native String getInputFormat()/*-{
		return this.inputFormat;
    }-*/;
}
