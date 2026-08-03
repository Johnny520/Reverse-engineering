package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: Yf */
/* JADX INFO: loaded from: classes.dex */
public final class C1053Yf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1141ag f3356a;

    public C1053Yf(C1141ag c1141ag) {
        this.f3356a = c1141ag;
    }

    /* JADX INFO: renamed from: a */
    public final void m1999a(TextInputLayout textInputLayout) {
        C1141ag c1141ag = this.f3356a;
        C1010Xf c1010Xf = c1141ag.f3627v;
        if (c1141ag.f3624s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c1141ag.f3624s;
        if (editText != null) {
            editText.removeTextChangedListener(c1010Xf);
            if (c1141ag.f3624s.getOnFocusChangeListener() == c1141ag.m2059b().mo949e()) {
                c1141ag.f3624s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c1141ag.f3624s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c1010Xf);
        }
        c1141ag.m2059b().mo954l(c1141ag.f3624s);
        c1141ag.m2067j(c1141ag.m2059b());
    }
}
