package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class cj {
    public final /* synthetic */ ej a;

    public cj(ej r1) {
        this.a = r1;
    }

    public final void a(TextInputLayout r5) {
        ej r0 = this.a;
        bj r1 = r0.v;
        if (r0.s != r5.getEditText()) goto L5;
        return;
    L5:
        EditText r2 = r0.s;
        if (r2 == null) goto L10;
        r2.removeTextChangedListener(r1);
        if (r0.s.getOnFocusChangeListener() != r0.b().e()) goto L10;
        r0.s.setOnFocusChangeListener(null);
    L10:
        EditText r52 = r5.getEditText();
        r0.s = r52;
        if (r52 == null) goto L13;
        r52.addTextChangedListener(r1);
    L13:
        r0.b().l(r0.s);
        r0.j(r0.b());
    }
}
