package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class xl implements defpackage.wl {
    public final int a;
    public final /* synthetic */ defpackage.yl b;

    public xl(defpackage.yl r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @Override // defpackage.wl
    public final boolean a(java.util.ArrayList r4, java.util.ArrayList r5) {
            r3 = this;
            yl r0 = r3.b
            ml r1 = r0.q
            int r2 = r3.a
            if (r1 == 0) goto L16
            if (r2 >= 0) goto L16
            yl r1 = r1.g()
            boolean r1 = r1.G()
            if (r1 == 0) goto L16
            r4 = 0
            return r4
        L16:
            r1 = 1
            boolean r4 = r0.H(r4, r5, r2, r1)
            return r4
    }
}
