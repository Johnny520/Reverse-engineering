package kotlinx.coroutines;

/* JADX INFO: renamed from: kotlinx.coroutines.α */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0479 extends p000.AbstractC1093 implements p000.InterfaceC0806sp {

    /* JADX INFO: renamed from: ζ */
    public static final p000.C0918vp f6066 = null;

    static {
            vp r0 = new vp
            x r1 = p000.C0966x.f11916
            hm r2 = new hm
            r3 = 6
            r2.<init>(r3)
            r0.<init>(r1, r2)
            kotlinx.coroutines.AbstractC0479.f6066 = r0
            return
    }

    public AbstractC0479() {
            r1 = this;
            x r0 = p000.C0966x.f11916
            r1.<init>(r0)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r2 = p000.AbstractC1021yh.m6855(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.AbstractC1093, p000.InterfaceC0880up
    /* JADX INFO: renamed from: θ */
    public final p000.InterfaceC0806sp mo1785(p000.InterfaceC0843tp r4) {
            r3 = this;
            r4.getClass()
            boolean r0 = r4 instanceof p000.C0918vp
            r1 = 0
            if (r0 == 0) goto L1f
            vp r4 = (p000.C0918vp) r4
            tp r0 = r3.f13410
            if (r0 == r4) goto L14
            tp r2 = r4.f11358
            if (r2 != r0) goto L13
            goto L14
        L13:
            return r1
        L14:
            a80 r4 = r4.f11357
            java.lang.Object r3 = r4.invoke(r3)
            sp r3 = (p000.InterfaceC0806sp) r3
            if (r3 == 0) goto L24
            return r3
        L1f:
            x r0 = p000.C0966x.f11916
            if (r0 != r4) goto L24
            return r3
        L24:
            return r1
    }

    @Override // p000.AbstractC1093, p000.InterfaceC0880up
    /* JADX INFO: renamed from: ξ */
    public final p000.InterfaceC0880up mo1788(p000.InterfaceC0843tp r3) {
            r2 = this;
            r3.getClass()
            boolean r0 = r3 instanceof p000.C0918vp
            if (r0 == 0) goto L1e
            vp r3 = (p000.C0918vp) r3
            tp r0 = r2.f13410
            if (r0 == r3) goto L13
            tp r1 = r3.f11358
            if (r1 != r0) goto L12
            goto L13
        L12:
            return r2
        L13:
            a80 r3 = r3.f11357
            java.lang.Object r3 = r3.invoke(r2)
            sp r3 = (p000.InterfaceC0806sp) r3
            if (r3 == 0) goto L24
            goto L22
        L1e:
            x r0 = p000.C0966x.f11916
            if (r0 != r3) goto L24
        L22:
            hz r2 = p000.C0377hz.f4846
        L24:
            return r2
    }

    /* JADX INFO: renamed from: ρ */
    public abstract void mo1950(p000.InterfaceC0880up r1, java.lang.Runnable r2);

    /* JADX INFO: renamed from: σ */
    public boolean mo3392(p000.InterfaceC0880up r1) {
            r0 = this;
            boolean r0 = r0 instanceof p000.p62
            r0 = r0 ^ 1
            return r0
    }

    /* JADX INFO: renamed from: τ */
    public kotlinx.coroutines.AbstractC0479 mo3393(int r2) {
            r1 = this;
            p000.h62.m2405(r2)
            qr0 r0 = new qr0
            r0.<init>(r1, r2)
            return r0
    }
}
