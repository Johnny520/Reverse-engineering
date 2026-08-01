package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: ej */
/* JADX INFO: loaded from: classes.dex */
public final class C0189ej {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0263gj f1587a;

    public C0189ej(C0263gj c0263gj) {
        this.f1587a = c0263gj;
    }

    /* JADX INFO: renamed from: a */
    public final void m998a(TextInputLayout textInputLayout) {
        C0263gj c0263gj = this.f1587a;
        C0153dj c0153dj = c0263gj.f2018v;
        if (c0263gj.f2015s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = c0263gj.f2015s;
        if (editText != null) {
            editText.removeTextChangedListener(c0153dj);
            if (c0263gj.f2015s.getOnFocusChangeListener() == c0263gj.m1284b().mo601e()) {
                c0263gj.f2015s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        c0263gj.f2015s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(c0153dj);
        }
        c0263gj.m1284b().mo604l(c0263gj.f2015s);
        c0263gj.m1292j(c0263gj.m1284b());
    }
}
