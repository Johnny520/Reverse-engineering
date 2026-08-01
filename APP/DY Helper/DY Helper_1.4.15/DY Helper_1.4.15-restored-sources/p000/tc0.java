package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tc0 {

    /* JADX INFO: renamed from: δ */
    public static final p000.C0208dd f10305 = null;

    /* JADX INFO: renamed from: ε */
    public static final p000.C0208dd f10306 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.C0208dd f10307 = null;

    /* JADX INFO: renamed from: η */
    public static final p000.C0208dd f10308 = null;

    /* JADX INFO: renamed from: θ */
    public static final p000.C0208dd f10309 = null;

    /* JADX INFO: renamed from: ι */
    public static final p000.C0208dd f10310 = null;

    /* JADX INFO: renamed from: α */
    public final p000.C0208dd f10311;

    /* JADX INFO: renamed from: β */
    public final p000.C0208dd f10312;

    /* JADX INFO: renamed from: γ */
    public final int f10313;

    static {
            dd r0 = p000.C0208dd.f3085
            java.lang.String r0 = ":"
            dd r0 = p000.C0381i2.m2592(r0)
            p000.tc0.f10305 = r0
            java.lang.String r0 = ":status"
            dd r0 = p000.C0381i2.m2592(r0)
            p000.tc0.f10306 = r0
            java.lang.String r0 = ":method"
            dd r0 = p000.C0381i2.m2592(r0)
            p000.tc0.f10307 = r0
            java.lang.String r0 = ":path"
            dd r0 = p000.C0381i2.m2592(r0)
            p000.tc0.f10308 = r0
            java.lang.String r0 = ":scheme"
            dd r0 = p000.C0381i2.m2592(r0)
            p000.tc0.f10309 = r0
            java.lang.String r0 = ":authority"
            dd r0 = p000.C0381i2.m2592(r0)
            p000.tc0.f10310 = r0
            return
    }

    public tc0(p000.C0208dd r1, p000.C0208dd r2) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.f10311 = r1
            r0.f10312 = r2
            int r1 = r1.mo1701()
            int r1 = r1 + 32
            int r2 = r2.mo1701()
            int r2 = r2 + r1
            r0.f10313 = r2
            return
    }

    public tc0(p000.C0208dd r2, java.lang.String r3) {
            r1 = this;
            r2.getClass()
            r3.getClass()
            dd r0 = p000.C0208dd.f3085
            dd r3 = p000.C0381i2.m2592(r3)
            r1.<init>(r2, r3)
            return
    }

    public tc0(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            dd r0 = p000.C0208dd.f3085
            dd r2 = p000.C0381i2.m2592(r2)
            dd r3 = p000.C0381i2.m2592(r3)
            r1.<init>(r2, r3)
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.tc0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            tc0 r5 = (p000.tc0) r5
            dd r1 = r4.f10311
            dd r3 = r5.f10311
            boolean r1 = p000.ln0.m3626(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            dd r4 = r4.f10312
            dd r5 = r5.f10312
            boolean r4 = p000.ln0.m3626(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r1 = this;
            dd r0 = r1.f10311
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            dd r1 = r1.f10312
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            dd r1 = r2.f10311
            java.lang.String r1 = r1.m1710()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            dd r2 = r2.f10312
            java.lang.String r2 = r2.m1710()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
