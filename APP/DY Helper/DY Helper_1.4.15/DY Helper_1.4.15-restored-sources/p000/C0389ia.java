package p000;

/* JADX INFO: renamed from: ia */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0389ia extends p000.q01 implements p000.qp0, p000.zr1 {

    /* JADX INFO: renamed from: τ */
    public p000.a80 f4970;

    public C0389ia(p000.a80 r1) {
            r0 = this;
            r0.<init>()
            r0.f4970 = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BlockGraphicsLayerModifier(block="
            r0.<init>(r1)
            a80 r2 = r2.f4970
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @Override // p000.qp0
    /* JADX INFO: renamed from: Φ */
    public final p000.qx0 mo605(p000.dw0 r3, p000.kx0 r4, long r5) {
            r2 = this;
            ch1 r4 = r4.mo2146(r5)
            int r5 = r4.f2115
            int r6 = r4.f2116
            i3 r0 = new i3
            r1 = 2
            r0.<init>(r4, r1, r2)
            kz r2 = p000.C0493kz.f6332
            qx0 r2 = r3.mo1612(r5, r6, r2, r0)
            return r2
    }

    @Override // p000.zr1
    /* JADX INFO: renamed from: Ω */
    public final void mo600(p000.js1 r5) {
            r4 = this;
            r0 = 2
            q31 r0 = p000.h62.m2443(r4, r0)
            boolean r1 = r0.f8832
            if (r1 != 0) goto L4d
            io1 r1 = p000.h62.f4590
            if (r1 != 0) goto L15
            io1 r1 = new io1
            r1.<init>()
            p000.h62.f4590 = r1
            goto L18
        L15:
            r1.m2788()
        L18:
            io1 r1 = p000.h62.f4590
            r1.getClass()
            yp0 r2 = r0.f8839
            yr r2 = r2.f12726
            r1.f5154 = r2
            long r2 = r0.f2117
            long r2 = p000.AbstractC0782s1.m5322(r2)
            r1.f5153 = r2
            tw1 r0 = p000.e81.m1877()
            if (r0 == 0) goto L36
            a80 r2 = r0.mo2001()
            goto L37
        L36:
            r2 = 0
        L37:
            tw1 r3 = p000.e81.m1880(r0)
            a80 r4 = r4.f4970     // Catch: java.lang.Throwable -> L48
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L48
            p000.e81.m1885(r0, r3, r2)
            iv1 r4 = r1.f5150
            boolean r0 = r1.f5151
            goto L51
        L48:
            r4 = move-exception
            p000.e81.m1885(r0, r3, r2)
            throw r4
        L4d:
            iv1 r4 = r0.f8830
            boolean r0 = r0.f8831
        L51:
            if (r0 != 0) goto L54
            return
        L54:
            p000.hs1.m2529(r5, r4)
            return
    }

    @Override // p000.zr1
    /* JADX INFO: renamed from: γ */
    public final boolean mo2339() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // p000.q01
    /* JADX INFO: renamed from: ф */
    public final boolean mo1140() {
            r0 = this;
            r0 = 0
            return r0
    }
}
