package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public abstract class ch1 {

    /* JADX INFO: renamed from: ε */
    public int f2115;

    /* JADX INFO: renamed from: ζ */
    public int f2116;

    /* JADX INFO: renamed from: η */
    public long f2117;

    /* JADX INFO: renamed from: θ */
    public long f2118;

    /* JADX INFO: renamed from: ι */
    public long f2119;

    public ch1() {
            r6 = this;
            r6.<init>()
            r0 = 0
            long r0 = (long) r0
            r2 = 32
            long r2 = r0 << r2
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r4
            long r0 = r0 | r2
            r6.f2117 = r0
            long r0 = p000.dh1.f3163
            r6.f2118 = r0
            r0 = 0
            r6.f2119 = r0
            return
    }

    /* JADX INFO: renamed from: λ */
    public abstract java.lang.Object mo1183();

    /* JADX INFO: renamed from: м */
    public int mo1184() {
            r4 = this;
            long r0 = r4.f2117
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            int r4 = (int) r0
            return r4
    }

    /* JADX INFO: renamed from: н */
    public int mo1185() {
            r2 = this;
            long r0 = r2.f2117
            r2 = 32
            long r0 = r0 >> r2
            int r2 = (int) r0
            return r2
    }

    /* JADX INFO: renamed from: р */
    public final void m1186() {
            r9 = this;
            long r0 = r9.f2117
            r2 = 32
            long r0 = r0 >> r2
            int r0 = (int) r0
            long r3 = r9.f2118
            int r1 = p000.C1028yo.m6955(r3)
            long r3 = r9.f2118
            int r3 = p000.C1028yo.m6953(r3)
            int r0 = p000.j81.m2906(r0, r1, r3)
            r9.f2115 = r0
            long r0 = r9.f2117
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r0 = (int) r0
            long r5 = r9.f2118
            int r1 = p000.C1028yo.m6954(r5)
            long r5 = r9.f2118
            int r5 = p000.C1028yo.m6952(r5)
            int r0 = p000.j81.m2906(r0, r1, r5)
            r9.f2116 = r0
            int r1 = r9.f2115
            long r5 = r9.f2117
            long r7 = r5 >> r2
            int r7 = (int) r7
            int r1 = r1 - r7
            int r1 = r1 / 2
            long r5 = r5 & r3
            int r5 = (int) r5
            int r0 = r0 - r5
            int r0 = r0 / 2
            long r5 = (long) r1
            long r1 = r5 << r2
            long r5 = (long) r0
            long r3 = r3 & r5
            long r0 = r1 | r3
            r9.f2119 = r0
            return
    }

    /* JADX INFO: renamed from: у */
    public abstract void mo1187(long r1, float r3, p000.a80 r4);

    /* JADX INFO: renamed from: ф */
    public final void m1188(long r3) {
            r2 = this;
            long r0 = r2.f2117
            boolean r0 = p000.bn0.m985(r0, r3)
            if (r0 != 0) goto Ld
            r2.f2117 = r3
            r2.m1186()
        Ld:
            return
    }

    /* JADX INFO: renamed from: х */
    public final void m1189(long r3) {
            r2 = this;
            long r0 = r2.f2118
            boolean r0 = p000.C1028yo.m6947(r0, r3)
            if (r0 != 0) goto Ld
            r2.f2118 = r3
            r2.m1186()
        Ld:
            return
    }
}
