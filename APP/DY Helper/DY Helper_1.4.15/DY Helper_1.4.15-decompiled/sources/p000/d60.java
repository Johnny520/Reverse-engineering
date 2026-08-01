package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class d60 implements java.lang.Comparable {

    /* JADX INFO: renamed from: ζ */
    public static final p000.d60 f2920 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.d60 f2921 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.d60 f2922 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.d60 f2923 = null;

    /* JADX INFO: renamed from: ε */
    public final int f2924;

    static {
            d60 r0 = new d60
            r1 = 100
            r0.<init>(r1)
            d60 r1 = new d60
            r2 = 200(0xc8, float:2.8E-43)
            r1.<init>(r2)
            d60 r2 = new d60
            r3 = 300(0x12c, float:4.2E-43)
            r2.<init>(r3)
            d60 r3 = new d60
            r4 = 400(0x190, float:5.6E-43)
            r3.<init>(r4)
            d60 r4 = new d60
            r5 = 500(0x1f4, float:7.0E-43)
            r4.<init>(r5)
            d60 r5 = new d60
            r6 = 600(0x258, float:8.41E-43)
            r5.<init>(r6)
            p000.d60.f2920 = r5
            d60 r6 = new d60
            r7 = 700(0x2bc, float:9.81E-43)
            r6.<init>(r7)
            d60 r7 = new d60
            r8 = 800(0x320, float:1.121E-42)
            r7.<init>(r8)
            d60 r8 = new d60
            r9 = 900(0x384, float:1.261E-42)
            r8.<init>(r9)
            p000.d60.f2921 = r3
            p000.d60.f2922 = r5
            p000.d60.f2923 = r6
            d60[] r0 = new p000.d60[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            p000.AbstractC1021yh.m6897(r0)
            return
    }

    public d60(int r3) {
            r2 = this;
            r2.<init>()
            r2.f2924 = r3
            r2 = 0
            r0 = 1
            if (r0 > r3) goto Le
            r1 = 1001(0x3e9, float:1.403E-42)
            if (r3 >= r1) goto Le
            r2 = r0
        Le:
            if (r2 != 0) goto L21
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = "Font weight can be in range [1, 1000]. Current value: "
            r2.<init>(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            p000.bm0.m982(r2)
        L21:
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r1) {
            r0 = this;
            d60 r1 = (p000.d60) r1
            int r0 = r0.f2924
            int r1 = r1.f2924
            int r0 = p000.ln0.m3632(r0, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof p000.d60
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            d60 r4 = (p000.d60) r4
            int r4 = r4.f2924
            int r3 = r3.f2924
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.f2924
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FontWeight(weight="
            r0.<init>(r1)
            int r2 = r2.f2924
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
