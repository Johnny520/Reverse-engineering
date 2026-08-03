package com.google.android.material.theme;

import Yue.C3277;
import Yue.C3284;
import Yue.C3287;
import Yue.C3320;
import Yue.C3343;
import Yue.C3353;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;

/* JADX INFO: loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C3353 {
    @Override // Yue.C3353
    @InterfaceC6391
    public C3277 createAutoCompleteTextView(@InterfaceC6391 Context context, @InterfaceC6490 AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }

    @Override // Yue.C3353
    @InterfaceC6391
    public C3284 createButton(@InterfaceC6391 Context context, @InterfaceC6391 AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // Yue.C3353
    @InterfaceC6391
    public C3287 createCheckBox(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // Yue.C3353
    @InterfaceC6391
    public C3320 createRadioButton(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // Yue.C3353
    @InterfaceC6391
    public C3343 createTextView(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
