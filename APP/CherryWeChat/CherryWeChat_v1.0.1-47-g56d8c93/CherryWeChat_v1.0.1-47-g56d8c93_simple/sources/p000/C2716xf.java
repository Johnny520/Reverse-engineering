package p000;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: renamed from: xf */
/* JADX INFO: loaded from: classes.dex */
public final class C2716xf implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f9293a;

    /* JADX INFO: renamed from: b */
    public C2673wf f9294b;

    public C2716xf(TextView r1) {
        this.f9293a = r1;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence r4, int r5, int r6, Spanned r7, int r8, int r9) {
        TextView r0 = this.f9293a;
        if (r0.isInEditMode() == true) goto L33;
        int r1 = C2372pf.m4798a().m4799b();
        if (r1 != 0) goto L8;
    L27:
        C2372pf r52 = C2372pf.m4798a();
        if (this.f9294b != null) goto L30;
        this.f9294b = new C2673wf(r0, this);
    L30:
        r52.m4803f(this.f9294b);
        return r4;
    L8:
        if (r1 != 1) goto L10;
        if (r9 != 0) goto L19;
        if (r8 != 0) goto L19;
        if (r7.length() != 0) goto L19;
        if (r4 != r0.getText()) goto L19;
        return r4;
    L19:
        if (r4 == null) goto L32;
        if (r5 == 0) goto L22;
    L24:
        r4 = r4.subSequence(r5, r6);
    L26:
        return C2372pf.m4798a().m4802e(r4, 0, r4.length());
    L22:
        if (r6 != r4.length()) goto L24;
    L32:
        return r4;
    L10:
        if (r1 == 3) goto L27;
        return r4;
    L33:
        return r4;
    }
}
