package br.com.example.client.view.form;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author flachadriano
 */
public class FormView extends Composite {

    private static final FormViewUiBinder uiBinder = GWT.create(FormViewUiBinder.class);
    @UiField
    TextBox txtName;

    interface FormViewUiBinder extends UiBinder<Widget, FormView> {
    }

    public FormView() {
        initWidget(uiBinder.createAndBindUi(this));
    }
    
    @UiHandler("btnSave")
    public void onBtnSaveClick(ClickEvent e) {
        Window.alert(txtName.getText());
    }
}
