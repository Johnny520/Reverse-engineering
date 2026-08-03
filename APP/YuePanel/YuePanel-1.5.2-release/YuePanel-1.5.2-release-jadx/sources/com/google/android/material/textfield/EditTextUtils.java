package com.google.android.material.textfield;

import Yue.InterfaceC6391;
import android.widget.EditText;

/* JADX INFO: loaded from: classes.dex */
class EditTextUtils {
    private EditTextUtils() {
    }

    public static boolean isEditable(@InterfaceC6391 EditText editText) {
        return editText.getInputType() != 0;
    }
}
