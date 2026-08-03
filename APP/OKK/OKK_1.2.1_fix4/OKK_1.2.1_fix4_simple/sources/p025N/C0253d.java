package p025N;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import androidx.emoji2.text.C0485j;

/* JADX INFO: renamed from: N.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0253d implements InputFilter {

    /* JADX INFO: renamed from: a */
    public final TextView f533a;

    /* JADX INFO: renamed from: b */
    public C0252c f534b;

    public C0253d(TextView r1) {
        this.f533a = r1;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence r4, int r5, int r6, Spanned r7, int r8, int r9) {
        TextView r02 = this.f533a;
        if (r02.isInEditMode() == false) goto L5;
        return r4;
    L5:
        int r1 = C0485j.m1199a().m1200b();
        if (r1 != 0) goto L8;
    L27:
        C0485j r52 = C0485j.m1199a();
        if (this.f534b != null) goto L30;
        this.f534b = new C0252c(r02, this);
    L30:
        r52.m1205g(this.f534b);
        return r4;
    L8:
        if (r1 != 1) goto L10;
        if (r9 != 0) goto L19;
        if (r8 != 0) goto L19;
        if (r7.length() != 0) goto L19;
        if (r4 != r02.getText()) goto L19;
        return r4;
    L19:
        if (r4 == null) goto L32;
        if (r5 == 0) goto L22;
    L24:
        r4 = r4.subSequence(r5, r6);
    L26:
        return C0485j.m1199a().m1204f(r4, 0, r4.length());
    L22:
        if (r6 != r4.length()) goto L24;
    L32:
        return r4;
    L10:
        if (r1 == 3) goto L27;
        return r4;
    }
}
