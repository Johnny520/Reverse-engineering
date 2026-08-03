package p001A0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: A0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0042r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0045u f109a;

    public C0042r(C0045u c0045u) {
        this.f109a = c0045u;
    }

    /* JADX INFO: renamed from: a */
    public final void m137a(TextInputLayout textInputLayout) {
        C0045u c0045u = this.f109a;
        if (c0045u.f134s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0045u.f134s;
        C0041q c0041q = c0045u.f137v;
        if (editText != null) {
            editText.removeTextChangedListener(c0041q);
            if (c0045u.f134s.getOnFocusChangeListener() == c0045u.m141b().mo60e()) {
                c0045u.f134s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0045u.f134s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0041q);
        }
        c0045u.m141b().mo63m(c0045u.f134s);
        c0045u.m149j(c0045u.m141b());
    }
}
