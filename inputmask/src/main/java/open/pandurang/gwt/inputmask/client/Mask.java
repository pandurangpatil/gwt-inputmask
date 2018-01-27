package open.pandurang.gwt.inputmask.client;

import com.google.gwt.core.client.JavaScriptObject;

public class Mask extends JavaScriptObject {

    protected Mask() {

    }

    public static Mask create() {
        Mask m = (Mask) createObject();
        m.setId(System.currentTimeMillis() + "");
        return m;
    }

    public final native void setId(String id)/*-{
		this.id = id;
    }-*/;

    public final native String getId() /*-{
		return this.id;
    }-*/;

    public final native void setMask(String mask)/*-{
		this.mask = mask;
    }-*/;

    public final native String getMask()/*-{
		return this.mask;
    }-*/;

    public final native void setClearIncomplete(boolean flag)/*-{
		this.clearIncomplete = flag;
    }-*/;

    public final native boolean getClearIncomplete()/*-{
		return this.clearIncomplete;
    }-*/;

    public final native void setClearMaskOnLostFocus(boolean flag)/*-{
		this.clearMaskOnLostFocus = flag;
    }-*/;

    public final native boolean getClearMaskOnLostFocus()/*-{
		return this.clearMaskOnLostFocus;
    }-*/;

    public final native void setRepeat(Integer repeat)/*-{
		this.repeat = repeat;
    }-*/;

    public final native Integer getRepeat()/*-{
		return this.repeat;
    }-*/;

    public final native void setGreedy(boolean flag)/*-{
		this.greedy = flag;
    }-*/;

    public final native boolean getGreedy()/*-{
		return this.greedy;
    }-*/;

    public final native void setPlaceholder(String placeholder)/*-{
		this.placeholder = placeholder;
    }-*/;

    public final native String getPlaceholder()/*-{
		return this.placeholder;
    }-*/;

    public final native void setShowMaskOnHover(boolean flag)/*-{
		this.showMaskOnHover = flag;
    }-*/;

    public final native boolean getShowMaskOnHover()/*-{
		return this.showMaskOnHover;
    }-*/;

    public final native void setShowMaskOnFocus(boolean flag)/*-{
		this.showMaskOnFocus = flag;
    }-*/;

    public final native boolean getShowMaskOnFocus()/*-{
		return this.showMaskOnFocus;
    }-*/;

    public final native void setNumericInput(boolean flag)/*-{
		this.numericInput = flag;
    }-*/;

    public final native boolean getNumericInput()/*-{
		return this.numericInput;
    }-*/;

    public final native void setRightAlign(boolean flag)/*-{
		this.rightAlign = flag;
    }-*/;

    public final native boolean getRightAlign()/*-{
		return this.rightAlign;
    }-*/;

    public final native void setJitMasking(boolean flag)/*-{
		this.jitMasking = flag;
    }-*/;

    public final native boolean getJitMasking()/*-{
		return this.jitMasking;
    }-*/;

    public final void setOnClearedHandler(OnClearedHandler handler) {
        InputMask.onClearedHandlersMapping.put(getId(), handler);
        exportOnCleared();
    }

    public final void setOnIncompleteHandler(OnInCompleteHandler handler) {
        InputMask.onIncompleteHandlersMapping.put(getId(), handler);
        exportOnIncomplete();
    }

    public final void setOnCompleteHandler(OnCompleteHandler handler) {
        InputMask.onCompleteHandlersMapping.put(getId(), handler);
        exportOnComplete();
    }

    private final void oncleared() {
        OnClearedHandler handler = InputMask.onClearedHandlersMapping.get(getId());
        if (handler != null)
            handler.onCleared();
    }

    private final void oncomplete() {
        OnCompleteHandler handler = InputMask.onCompleteHandlersMapping.get(getId());
        if (handler != null)
            handler.onComplete();
    }

    private final void onincomplete() {
        OnInCompleteHandler handler = InputMask.onIncompleteHandlersMapping.get(getId());
        if (handler != null)
            handler.onInComplete();
    }

    private final native void exportOnCleared()/*-{
		var that = this;
		this.oncleared = function() {
			that.@open.pandurang.gwt.inputmask.client.Mask::oncleared()();
		}
    }-*/;

    private final native void exportOnIncomplete() /*-{
		var that = this;
		this.onincomplete = function() {
			that.@open.pandurang.gwt.inputmask.client.Mask::onincomplete()();
		}
    }-*/;

    private final native void exportOnComplete() /*-{
		var that = this;
		this.oncomplete = function() {
		    Console.log('Here it comes.....');
			that.@open.pandurang.gwt.inputmask.client.Mask::oncomplete()();
		}
    }-*/;
}
