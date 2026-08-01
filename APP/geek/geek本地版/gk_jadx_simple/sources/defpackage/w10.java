package defpackage;

/* JADX INFO: loaded from: classes.dex */
public class w10 extends g implements qe {
    public final m50 d;

    public w10(ge r2, m50 r3) {
        super(r2, true);
        this.d = r3;
    }

    @Override // defpackage.wp
    public final boolean B() {
        return true;
    }

    @Override // defpackage.qe
    public final qe c() {
        m50 r0 = this.d;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return null;
    }

    @Override // defpackage.wp
    public void k(Object r2) {
        a80.B(ip.z(this.d), a80.A(r2));
    }

    @Override // defpackage.wp
    public void l(Object r2) {
        this.d.f(a80.A(r2));
    }
}
