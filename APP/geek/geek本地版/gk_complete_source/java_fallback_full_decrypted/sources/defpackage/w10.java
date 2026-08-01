package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class w10 extends defpackage.g implements defpackage.qe {
    public final defpackage.m50 d;

    public w10(defpackage.ge r2, defpackage.m50 r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r0)
            r1.d = r3
            return
    }

    @Override // defpackage.wp
    public final boolean B() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.qe
    public final defpackage.qe c() {
            r1 = this;
            m50 r0 = r1.d
            if (r0 == 0) goto L5
            return r0
        L5:
            r0 = 0
            return r0
    }

    @Override // defpackage.wp
    public void k(java.lang.Object r2) {
            r1 = this;
            m50 r0 = r1.d
            ld r0 = defpackage.ip.z(r0)
            java.lang.Object r2 = defpackage.a80.A(r2)
            defpackage.a80.B(r0, r2)
            return
    }

    @Override // defpackage.wp
    public void l(java.lang.Object r2) {
            r1 = this;
            m50 r0 = r1.d
            java.lang.Object r2 = defpackage.a80.A(r2)
            r0.f(r2)
            return
    }
}
