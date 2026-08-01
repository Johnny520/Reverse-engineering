package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class of0 implements p000.rx1 {

    /* JADX INFO: renamed from: ε */
    public final p000.og0 f8067;

    /* JADX INFO: renamed from: ζ */
    public final p000.j60 f8068;

    /* JADX INFO: renamed from: η */
    public boolean f8069;

    /* JADX INFO: renamed from: θ */
    public final /* synthetic */ p000.uf0 f8070;

    public of0(p000.uf0 r1, p000.og0 r2) {
            r0 = this;
            r0.<init>()
            r2.getClass()
            r0.f8070 = r1
            r0.f8067 = r2
            j60 r2 = new j60
            m6 r1 = r1.f10741
            java.lang.Object r1 = r1.f6968
            rk1 r1 = (p000.rk1) r1
            rx1 r1 = r1.f9395
            m42 r1 = r1.mo2105()
            r2.<init>(r1)
            r0.f8068 = r2
            return
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: α */
    public final p000.m42 mo2105() {
            r0 = this;
            j60 r0 = r0.f8068
            return r0
    }

    @Override // p000.rx1
    /* JADX INFO: renamed from: β */
    public long mo2106(long r3, p000.C0793sc r5) {
            r2 = this;
            uf0 r0 = r2.f8070
            r5.getClass()
            m6 r1 = r0.f10741     // Catch: java.io.IOException -> L10
            java.lang.Object r1 = r1.f6968     // Catch: java.io.IOException -> L10
            rk1 r1 = (p000.rk1) r1     // Catch: java.io.IOException -> L10
            long r2 = r1.mo2106(r3, r5)     // Catch: java.io.IOException -> L10
            return r2
        L10:
            r3 = move-exception
            a00 r4 = r0.f10740
            r4.mo3()
            vc0 r4 = p000.uf0.f10738
            r2.m4229(r4)
            throw r3
    }

    /* JADX INFO: renamed from: δ */
    public final void m4229(p000.vc0 r6) {
            r5 = this;
            r6.getClass()
            uf0 r0 = r5.f8070
            int r1 = r0.f10742
            r2 = 6
            if (r1 != r2) goto Lb
            goto L31
        Lb:
            r3 = 5
            if (r1 != r3) goto L32
            j60 r1 = r5.f8068
            m42 r3 = r1.f5341
            l42 r4 = p000.m42.f6935
            r1.f5341 = r4
            r3.mo2868()
            r3.mo2869()
            r0.f10742 = r2
            int r1 = r6.size()
            if (r1 <= 0) goto L31
            t41 r0 = r0.f10739
            if (r0 == 0) goto L31
            x r0 = r0.f10184
            if (r0 == 0) goto L31
            og0 r5 = r5.f8067
            p000.mg0.m3823(r0, r5, r6)
        L31:
            return
        L32:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            int r6 = r0.f10742
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }
}
