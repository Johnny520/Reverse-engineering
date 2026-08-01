package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class xl implements wl {
    public final int a;
    public final /* synthetic */ yl b;

    public xl(yl r1, int r2) {
        this.b = r1;
        this.a = r2;
    }

    @Override // defpackage.wl
    public final boolean a(ArrayList r4, ArrayList r5) {
        yl r0 = this.b;
        ml r1 = r0.q;
        int r2 = this.a;
        if (r1 == null) goto L10;
        if (r2 >= 0) goto L10;
        if (r1.g().G() == false) goto L10;
        return false;
    L10:
        return r0.H(r4, r5, r2, 1);
    }
}
