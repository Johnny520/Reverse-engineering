package com.google.android.material.textfield;

import Yue.InterfaceC4525;
import Yue.InterfaceC6391;
import Yue.InterfaceC6490;
import Yue.InterfaceC7613;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.C1980R;

/* JADX INFO: loaded from: classes.dex */
class PasswordToggleEndIconDelegate extends EndIconDelegate {

    @InterfaceC6490
    private EditText editText;
    private int iconResId;
    private final View.OnClickListener onIconClickListener;

    public PasswordToggleEndIconDelegate(@InterfaceC6391 EndCompoundLayout endCompoundLayout, @InterfaceC4525 int i) {
        super(endCompoundLayout);
        this.iconResId = C1980R.drawable.design_password_eye;
        this.onIconClickListener = new View.OnClickListener() { // from class: com.google.android.material.textfield.ۥ۟۟۟ۧ
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f30425.lambda$new$0(view);
            }
        };
        if (i != 0) {
            this.iconResId = i;
        }
    }

    private boolean hasPasswordTransformation() {
        EditText editText = this.editText;
        return editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod);
    }

    private static boolean isInputTypePassword(EditText editText) {
        return editText != null && (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0(View view) {
        EditText editText = this.editText;
        if (editText == null) {
            return;
        }
        int selectionEnd = editText.getSelectionEnd();
        if (hasPasswordTransformation()) {
            this.editText.setTransformationMethod(null);
        } else {
            this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
        if (selectionEnd >= 0) {
            this.editText.setSelection(selectionEnd);
        }
        refreshIconState();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void beforeEditTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        refreshIconState();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @InterfaceC7613
    public int getIconContentDescriptionResId() {
        return C1980R.string.password_toggle_content_description;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    @InterfaceC4525
    public int getIconDrawableResId() {
        return this.iconResId;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public View.OnClickListener getOnIconClickListener() {
        return this.onIconClickListener;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconCheckable() {
        return true;
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public boolean isIconChecked() {
        return !hasPasswordTransformation();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void onEditTextAttached(@InterfaceC6490 EditText editText) {
        this.editText = editText;
        refreshIconState();
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void setUp() {
        if (isInputTypePassword(this.editText)) {
            this.editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }

    @Override // com.google.android.material.textfield.EndIconDelegate
    public void tearDown() {
        EditText editText = this.editText;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
