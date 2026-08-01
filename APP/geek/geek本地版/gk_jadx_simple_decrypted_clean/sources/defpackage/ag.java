package defpackage;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class ag extends o3 {
    public boolean c;
    public boolean d;
    public d4 e;

    public final d4 j(Context r5) {
        if (this.d == true) goto L5;
        g40 r0 = (g40) this.a;
        ml r1 = r0.c;
        if (r0.a != 2) goto L9;
        boolean r02 = true;
    L10:
        d4 r52 = ff.A(r5, r1, r02, this.c);
        this.e = r52;
        this.d = true;
        return r52;
    L9:
        r02 = false;
        goto L10
    L5:
        return this.e;
    }
}
