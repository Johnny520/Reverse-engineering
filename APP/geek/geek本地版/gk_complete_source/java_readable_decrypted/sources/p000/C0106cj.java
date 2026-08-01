package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: cj */
/* JADX INFO: loaded from: classes.dex */
public final class C0106cj {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0189ej f962a;

    public C0106cj(C0189ej c0189ej) {
        this.f962a = c0189ej;
    }

    /* JADX INFO: renamed from: a */
    public final void m691a(TextInputLayout textInputLayout) {
        C0189ej c0189ej = this.f962a;
        C0070bj c0070bj = c0189ej.f1807v;
        if (c0189ej.f1804s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0189ej.f1804s;
        if (editText != null) {
            editText.removeTextChangedListener(c0070bj);
            if (c0189ej.f1804s.getOnFocusChangeListener() == c0189ej.m1036b().mo1217e()) {
                c0189ej.f1804s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0189ej.f1804s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0070bj);
        }
        c0189ej.m1036b().mo1224l(c0189ej.f1804s);
        c0189ej.m1044j(c0189ej.m1036b());
    }
}
