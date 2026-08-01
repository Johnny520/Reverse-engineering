package defpackage;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class li implements InputFilter {
    public final TextView a;
    public ki b;

    public li(TextView r1) {
        this.a = r1;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence r4, int r5, int r6, Spanned r7, int r8, int r9) {
        TextView r0 = this.a;
        if (r0.isInEditMode() == true) goto L33;
        int r1 = ei.a().b();
        if (r1 != 0) goto L8;
    L27:
        ei r52 = ei.a();
        if (this.b != null) goto L30;
        this.b = new ki(r0, this);
    L30:
        r52.f(this.b);
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
        return ei.a().e(r4, 0, r4.length());
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
