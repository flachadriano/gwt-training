/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.example.client;

import br.com.example.client.view.form.FormView;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Main entry point.
 *
 * @author flachadriano
 */
public class PatientEntryPoint implements EntryPoint {

    public PatientEntryPoint() {
    }

    @Override
    public void onModuleLoad() {
        RootPanel.get().add(new FormView());
    }
}
