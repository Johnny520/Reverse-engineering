package p000;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: uA */
/* JADX INFO: loaded from: classes.dex */
public final class C2576uA implements TextWatcher {

    /* JADX INFO: renamed from: a */
    public int f8926a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f8927b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ TextInputLayout f8928c;

    public C2576uA(TextInputLayout textInputLayout, EditText editText) {
        this.f8928c = textInputLayout;
        this.f8927b = editText;
        this.f8926a = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.f8928c;
        textInputLayout.m2495w(!textInputLayout.f4594B0, false);
        if (textInputLayout.f4639l) {
            textInputLayout.m2488p(editable);
        }
        if (textInputLayout.f4655t) {
            textInputLayout.m2496x(editable);
        }
        EditText editText = this.f8927b;
        int lineCount = editText.getLineCount();
        int i = this.f8926a;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.f4658u0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.f8926a = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
