package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
public final class x3 {
    public final TextView a;
    public final l0 b;

    public x3(TextView r2) {
        this.a = r2;
        this.b = new l0(r2);
    }

    public final void a(AttributeSet r4, int r5) {
        TypedArray r42 = this.a.getContext().obtainStyledAttributes(r4, xy.i, r5, 0);
        boolean r1 = true;
        if (r42.hasValue(14) == false) goto L9;
        r1 = r42.getBoolean(14, true);     // Catch: Throwable -> L7
    L9:
        r42.recycle();
        c(r1);
        return;
    L7:
        th = move-exception;
        r42.recycle();
        throw th;
    }

    public final void b(boolean r2) {
        ((a80) this.b.b).C(r2);
    }

    public final void c(boolean r2) {
        ((a80) this.b.b).D(r2);
    }
}
