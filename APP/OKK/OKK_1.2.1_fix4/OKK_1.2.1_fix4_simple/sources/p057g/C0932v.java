package p057g;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import p001A0.AbstractC0040p;
import p006D.C0095d;
import p048b.AbstractC0550a;

/* JADX INFO: renamed from: g.v */
/* JADX INFO: loaded from: classes.dex */
public final class C0932v {

    /* JADX INFO: renamed from: a */
    public final TextView f3305a;

    /* JADX INFO: renamed from: b */
    public final C0095d f3306b;

    public C0932v(TextView r2) {
        this.f3305a = r2;
        this.f3306b = new C0095d(r2);
    }

    /* JADX INFO: renamed from: a */
    public final void m2262a(AttributeSet r4, int r5) {
        TypedArray r42 = this.f3305a.getContext().obtainStyledAttributes(r4, AbstractC0550a.f1622g, r5, 0);
        boolean r1 = true;
        if (r42.hasValue(14) == false) goto L9;
        r1 = r42.getBoolean(14, true);     // Catch: Throwable -> L7
    L9:
        r42.recycle();
        ((AbstractC0040p) this.f3306b.f251b).mo128R(r1);
        return;
    L7:
        th = move-exception;
        r42.recycle();
        throw th;
    }
}
