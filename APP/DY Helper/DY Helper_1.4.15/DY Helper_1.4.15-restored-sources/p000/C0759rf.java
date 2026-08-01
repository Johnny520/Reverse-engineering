package p000;

/* JADX INFO: renamed from: rf */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class C0759rf {

    /* JADX INFO: renamed from: α */
    public final /* synthetic */ int f9357;

    /* JADX INFO: renamed from: β */
    public long f9358;

    /* JADX INFO: renamed from: γ */
    public java.lang.Object f9359;

    public C0759rf(int r3) {
            r2 = this;
            r2.f9357 = r3
            switch(r3) {
                case 1: goto Ld;
                default: goto L5;
            }
        L5:
            r2.<init>()
            r0 = 0
            r2.f9358 = r0
            return
        Ld:
            r2.<init>()
            return
    }

    public C0759rf(p000.rk1 r3) {
            r2 = this;
            r0 = 2
            r2.f9357 = r0
            r3.getClass()
            r2.<init>()
            r2.f9359 = r3
            r0 = 262144(0x40000, double:1.295163E-318)
            r2.f9358 = r0
            return
    }

    public java.lang.String toString() {
            r3 = this;
            int r0 = r3.f9357
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r3 = super.toString()
            return r3
        La:
            java.lang.Object r0 = r3.f9359
            rf r0 = (p000.C0759rf) r0
            if (r0 != 0) goto L17
            long r0 = r3.f9358
            java.lang.String r3 = java.lang.Long.toBinaryString(r0)
            goto L39
        L17:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r3.f9359
            rf r1 = (p000.C0759rf) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = "xx"
            r0.append(r1)
            long r1 = r3.f9358
            java.lang.String r3 = java.lang.Long.toBinaryString(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L39:
            return r3
    }

    /* JADX INFO: renamed from: α */
    public int m5081(int r7) {
            r6 = this;
            java.lang.Object r0 = r6.f9359
            rf r0 = (p000.C0759rf) r0
            r1 = 64
            r2 = 1
            if (r0 != 0) goto L1c
            long r4 = r6.f9358
            if (r7 < r1) goto L13
            int r6 = java.lang.Long.bitCount(r4)
            return r6
        L13:
            long r6 = r2 << r7
            long r6 = r6 - r2
            long r6 = r6 & r4
            int r6 = java.lang.Long.bitCount(r6)
            return r6
        L1c:
            if (r7 >= r1) goto L29
            long r0 = r6.f9358
            long r6 = r2 << r7
            long r6 = r6 - r2
            long r6 = r6 & r0
            int r6 = java.lang.Long.bitCount(r6)
            return r6
        L29:
            int r7 = r7 - r1
            int r7 = r0.m5081(r7)
            long r0 = r6.f9358
            int r6 = java.lang.Long.bitCount(r0)
            int r6 = r6 + r7
            return r6
    }

    /* JADX INFO: renamed from: β */
    public boolean m5082(int r5) {
            r4 = this;
            r0 = 64
            if (r5 < r0) goto L1c
            java.lang.Object r1 = r4.f9359
            rf r1 = (p000.C0759rf) r1
            if (r1 != 0) goto L12
            rf r1 = new rf
            r2 = 0
            r1.<init>(r2)
            r4.f9359 = r1
        L12:
            java.lang.Object r4 = r4.f9359
            rf r4 = (p000.C0759rf) r4
            int r5 = r5 - r0
            boolean r4 = r4.m5082(r5)
            return r4
        L1c:
            long r0 = r4.f9358
            r2 = 1
            long r4 = r2 << r5
            long r4 = r4 & r0
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 == 0) goto L2b
            r4 = 1
            return r4
        L2b:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: γ */
    public p000.vc0 m5083() {
            r7 = this;
            uc0 r0 = new uc0
            r0.<init>()
        L5:
            java.lang.Object r1 = r7.f9359
            ad r1 = (p000.InterfaceC0014ad) r1
            long r2 = r7.f9358
            java.lang.String r1 = r1.mo60(r2)
            long r2 = r7.f9358
            int r4 = r1.length()
            long r4 = (long) r4
            long r2 = r2 - r4
            r7.f9358 = r2
            int r2 = r1.length()
            if (r2 != 0) goto L24
            vc0 r7 = r0.m5839()
            return r7
        L24:
            r2 = 4
            r3 = 58
            r4 = 1
            int r2 = p000.q02.m4668(r1, r3, r4, r2)
            r5 = -1
            r6 = 0
            if (r2 == r5) goto L3e
            java.lang.String r3 = r1.substring(r6, r2)
            int r2 = r2 + 1
            java.lang.String r1 = r1.substring(r2)
            p000.v81.m6120(r0, r3, r1)
            goto L5
        L3e:
            char r2 = r1.charAt(r6)
            java.lang.String r5 = ""
            if (r2 != r3) goto L4e
            java.lang.String r1 = r1.substring(r4)
            p000.v81.m6120(r0, r5, r1)
            goto L5
        L4e:
            p000.v81.m6120(r0, r5, r1)
            goto L5
    }

    /* JADX INFO: renamed from: δ */
    public void m5084() {
            r2 = this;
            r0 = 0
            r2.f9358 = r0
            java.lang.Object r2 = r2.f9359
            rf r2 = (p000.C0759rf) r2
            if (r2 == 0) goto Ld
            r2.m5084()
        Ld:
            return
    }
}
