package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public enum kf0 extends java.lang.Enum {

    /* JADX INFO: renamed from: ε */
    public static final p000.kf0 f5886 = null;

    /* JADX INFO: renamed from: ζ */
    public static final p000.kf0 f5887 = null;

    /* JADX INFO: renamed from: η */
    public static final /* synthetic */ p000.kf0[] f5888 = null;

    static {
            kf0 r0 = new kf0
            java.lang.String r1 = "MILLISECONDS"
            r2 = 0
            r0.<init>(r1, r2)
            p000.kf0.f5886 = r0
            kf0 r1 = new kf0
            java.lang.String r2 = "SECONDS"
            r3 = 1
            r1.<init>(r2, r3)
            p000.kf0.f5887 = r1
            kf0[] r0 = new p000.kf0[]{r0, r1}
            p000.kf0.f5888 = r0
            return
    }

    public static p000.kf0 valueOf(java.lang.String r1) {
            java.lang.Class<kf0> r0 = p000.kf0.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kf0 r1 = (p000.kf0) r1
            return r1
    }

    public static p000.kf0[] values() {
            kf0[] r0 = p000.kf0.f5888
            java.lang.Object r0 = r0.clone()
            kf0[] r0 = (p000.kf0[]) r0
            return r0
    }

    /* JADX INFO: renamed from: α */
    public final long m3240(long r7) {
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            return r0
        L7:
            int r6 = r6.ordinal()
            if (r6 == 0) goto L24
            r2 = 1
            if (r6 != r2) goto L1e
            r2 = 1000(0x3e8, double:4.94E-321)
            long r4 = r7 / r2
            long r7 = r7 % r2
            int r6 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r6 != 0) goto L1a
            goto L1c
        L1a:
            r0 = 1
        L1c:
            long r4 = r4 + r0
            return r4
        L1e:
            p000.C1080.m7272()
            r6 = 0
            return r6
        L24:
            return r7
    }

    /* JADX INFO: renamed from: β */
    public final long m3241(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 > 0) goto L7
            return r0
        L7:
            int r3 = r3.ordinal()
            if (r3 == 0) goto L24
            r0 = 1
            if (r3 != r0) goto L1e
            r0 = 9223372036854775(0x20c49ba5e353f7, double:4.663754807431093E-308)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 <= 0) goto L1a
            r4 = r0
        L1a:
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r0
            return r4
        L1e:
            p000.C1080.m7272()
            r3 = 0
            return r3
        L24:
            return r4
    }
}
