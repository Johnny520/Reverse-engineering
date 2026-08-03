package p001A0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: A0.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0042r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0045u f109a;

    public C0042r(C0045u r1) {
        this.f109a = r1;
    }

    /* JADX INFO: renamed from: a */
    public final void m137a(TextInputLayout r5) {
        C0045u r02 = this.f109a;
        if (r02.f134s != r5.getEditText()) goto L5;
        return;
    L5:
        EditText r1 = r02.f134s;
        C0041q r2 = r02.f137v;
        if (r1 == null) goto L10;
        r1.removeTextChangedListener(r2);
        if (r02.f134s.getOnFocusChangeListener() != r02.m141b().mo60e()) goto L10;
        r02.f134s.setOnFocusChangeListener(null);
    L10:
        EditText r52 = r5.getEditText();
        r02.f134s = r52;
        if (r52 == null) goto L13;
        r52.addTextChangedListener(r2);
    L13:
        r02.m141b().mo63m(r02.f134s);
        r02.m149j(r02.m141b());
    }
}
