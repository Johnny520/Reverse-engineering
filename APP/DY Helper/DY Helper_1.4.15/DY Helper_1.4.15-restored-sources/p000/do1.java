package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class do1 extends p000.co1 implements p000.n80 {

    /* JADX INFO: renamed from: ζ */
    public final int f3230;

    public do1(p000.InterfaceC0631op r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 2
            r0.f3230 = r1
            return
    }

    @Override // p000.n80
    public final int getArity() {
            r0 = this;
            int r0 = r0.f3230
            return r0
    }

    @Override // p000.AbstractC0715q8
    public final java.lang.String toString() {
            r1 = this;
            op r0 = r1.f8903
            if (r0 != 0) goto Le
            wm1 r0 = p000.vm1.f11350
            r0.getClass()
            java.lang.String r1 = p000.wm1.m6397(r1)
            return r1
        Le:
            java.lang.String r1 = super.toString()
            return r1
    }
}
