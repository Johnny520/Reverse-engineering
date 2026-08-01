package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class vo1 extends p000.vp0 {

    /* JADX INFO: renamed from: β */
    public static final p000.vo1 f11355 = null;

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f11356;

    static {
            vo1 r0 = new vo1
            r1 = 0
            r0.<init>(r1)
            p000.vo1.f11355 = r0
            return
    }

    public /* synthetic */ vo1(int r1) {
            r0 = this;
            r0.f11356 = r1
            r0.<init>()
            return
    }

    @Override // p000.px0
    /* JADX INFO: renamed from: ε */
    public final p000.qx0 mo1688(p000.rx0 r8, java.util.List r9, long r10) {
            r7 = this;
            int r7 = r7.f11356
            switch(r7) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "Undefined measure and it is required"
            r7.<init>(r8)
            throw r7
        Ld:
            int r7 = r9.size()
            kz r0 = p000.C0493kz.f6332
            if (r7 == 0) goto L7b
            r1 = 1
            r2 = 0
            if (r7 == r1) goto L5a
            java.util.ArrayList r7 = new java.util.ArrayList
            int r1 = r9.size()
            r7.<init>(r1)
            int r1 = r9.size()
            r3 = r2
            r4 = r3
        L28:
            if (r2 >= r1) goto L46
            java.lang.Object r5 = r9.get(r2)
            kx0 r5 = (p000.kx0) r5
            ch1 r5 = r5.mo2146(r10)
            int r6 = r5.f2115
            int r3 = java.lang.Math.max(r6, r3)
            int r6 = r5.f2116
            int r4 = java.lang.Math.max(r6, r4)
            r7.add(r5)
            int r2 = r2 + 1
            goto L28
        L46:
            int r9 = p000.AbstractC1065zo.m7212(r3, r10)
            int r10 = p000.AbstractC1065zo.m7211(r4, r10)
            b0 r11 = new b0
            r1 = 16
            r11.<init>(r1, r7)
            qx0 r7 = r8.mo1612(r9, r10, r0, r11)
            goto L89
        L5a:
            java.lang.Object r7 = r9.get(r2)
            kx0 r7 = (p000.kx0) r7
            ch1 r7 = r7.mo2146(r10)
            int r9 = r7.f2115
            int r9 = p000.AbstractC1065zo.m7212(r9, r10)
            int r1 = r7.f2116
            int r10 = p000.AbstractC1065zo.m7211(r1, r10)
            t0 r11 = new t0
            r1 = 2
            r11.<init>(r7, r1)
            qx0 r7 = r8.mo1612(r9, r10, r0, r11)
            goto L89
        L7b:
            int r7 = p000.C1028yo.m6955(r10)
            int r9 = p000.C1028yo.m6954(r10)
            a1 r10 = p000.C0002a1.f17
            qx0 r7 = r8.mo1612(r7, r9, r0, r10)
        L89:
            return r7
    }
}
