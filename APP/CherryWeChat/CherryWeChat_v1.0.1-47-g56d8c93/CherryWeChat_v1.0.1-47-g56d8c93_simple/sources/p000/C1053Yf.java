package p000;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: Yf */
/* JADX INFO: loaded from: classes.dex */
public final class C1053Yf {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1141ag f3356a;

    public C1053Yf(C1141ag r1) {
        this.f3356a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final void m1999a(TextInputLayout r5) {
        C1141ag r0 = this.f3356a;
        C1010Xf r1 = r0.f3627v;
        if (r0.f3624s != r5.getEditText()) goto L5;
        return;
    L5:
        EditText r2 = r0.f3624s;
        if (r2 == null) goto L10;
        r2.removeTextChangedListener(r1);
        if (r0.f3624s.getOnFocusChangeListener() != r0.m2059b().mo949e()) goto L10;
        r0.f3624s.setOnFocusChangeListener(null);
    L10:
        EditText r52 = r5.getEditText();
        r0.f3624s = r52;
        if (r52 == null) goto L13;
        r52.addTextChangedListener(r1);
    L13:
        r0.m2059b().mo954l(r0.f3624s);
        r0.m2067j(r0.m2059b());
    }
}
