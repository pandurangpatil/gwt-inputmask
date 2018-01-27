package open.pandurang.gwt.inputmask.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

public interface JsHelperResource extends ClientBundle {
    public static JsHelperResource INSTANCE = GWT.create(JsHelperResource.class);

    @Source("inputmask.js")
    public TextResource inputMask();

    @Source("inputmask.dependencyLib.js")
    public TextResource dependencyLib();

    @Source("inputmask.extensions.js")
    public TextResource inputMaskExtensions();

    @Source("inputmask.date.extensions.js")
    public TextResource inputMaskDateExtensions();

    @Source("inputmask.numeric.extensions.js")
    public TextResource inputMaskNumericExtensions();

    @Source("inputmask.phone.extensions.js")
    public TextResource inputMaskPhoneExtensions();
}
