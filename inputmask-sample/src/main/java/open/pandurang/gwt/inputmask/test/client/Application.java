package open.pandurang.gwt.inputmask.test.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;

import gwt.material.design.client.ui.MaterialTextBox;
import open.pandurang.gwt.inputmask.client.Alias;
import open.pandurang.gwt.inputmask.client.InputMask;
import open.pandurang.gwt.inputmask.client.Mask;
import open.pandurang.gwt.inputmask.client.OnClearedHandler;
import open.pandurang.gwt.inputmask.client.OnCompleteHandler;
import open.pandurang.gwt.inputmask.client.OnInCompleteHandler;

public class Application implements EntryPoint {

    public void onModuleLoad() {
        MaterialTextBox mtb = new MaterialTextBox();
        MaterialTextBox date = new MaterialTextBox();
        MaterialTextBox randomMask = new MaterialTextBox();
        MaterialTextBox emptyBox = new MaterialTextBox();
        TextBox tb = new TextBox();
        RootPanel.get().add(tb);
        RootPanel.get().add(mtb);
        RootPanel.get().add(date);
        RootPanel.get().add(randomMask);
        RootPanel.get().add(emptyBox);
        InputMask inpm = new InputMask();
        inpm.mask("email", tb.getElement());
        inpm.mask("aa-999-**", mtb.getElement().getFirstChildElement());
        final Alias op = Alias.create();
        op.setAlias("datetime");
        op.setInputFormat("dd/mm/yyyy");
        Mask msk = Mask.create();
        // msk.setPlaceholder("&");
        msk.setOnCompleteHandler(new OnCompleteHandler() {

            @Override
            public void onComplete() {
                Window.alert("Date completion also works...");
            }
        });
        inpm.mask(op, msk, date.getElement().getFirstChildElement());

        Mask mask = Mask.create();
        mask.setMask("9999 - 999999");
        mask.setClearIncomplete(false);
        mask.setPlaceholder("*");
        mask.setRightAlign(true);
        // mask.setJitMasking(true);
        mask.setOnClearedHandler(new OnClearedHandler() {

            @Override
            public void onCleared() {
                GWT.log("On cleared also works");
            }
        });
        mask.setOnCompleteHandler(new OnCompleteHandler() {

            @Override
            public void onComplete() {
                GWT.log("Even this works");
            }
        });
        mask.setOnIncompleteHandler(new OnInCompleteHandler() {

            @Override
            public void onInComplete() {
                GWT.log("Incomplete also works");
            }
        });
        inpm.mask(mask, randomMask.getElement().getFirstChildElement());
        
        Button btn = new Button("TEST");
        RootPanel.get().add(btn);
        btn.addClickHandler(new ClickHandler() {
            
            @Override
            public void onClick(ClickEvent event) {
                // TODO Auto-generated method stub
                GWT.log("Date value - > " +  date.getValue());
                if(inpm.isValid(date.getValue(), op)) {
                    GWT.log("This is valid");
                }else {
                    GWT.log("This is invalid");
                }
                GWT.log("sample Mask  value - > " +  randomMask.getValue());
                if(inpm.isValid(randomMask.getValue(), mask)) {
                    GWT.log("This sample is valid");
                }else {
                    GWT.log("This sample is invalid");
                }
            }
        });
    }
}
