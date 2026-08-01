package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class y50 extends defpackage.zt {
    public final /* synthetic */ defpackage.gt e;
    public final /* synthetic */ defpackage.a60 f;

    public y50(defpackage.a60 r1, defpackage.gt r2) {
            r0 = this;
            r0.<init>()
            r0.f = r1
            r0.e = r2
            return
    }

    @Override // defpackage.zt
    public final void I(int r3) {
            r2 = this;
            a60 r0 = r2.f
            r1 = 1
            r0.m = r1
            gt r0 = r2.e
            r0.p(r3)
            return
    }

    @Override // defpackage.zt
    public final void J(android.graphics.Typeface r3) {
            r2 = this;
            a60 r0 = r2.f
            int r1 = r0.c
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
            r0.n = r3
            r3 = 1
            r0.m = r3
            android.graphics.Typeface r3 = r0.n
            r0 = 0
            gt r1 = r2.e
            r1.q(r3, r0)
            return
    }
}
