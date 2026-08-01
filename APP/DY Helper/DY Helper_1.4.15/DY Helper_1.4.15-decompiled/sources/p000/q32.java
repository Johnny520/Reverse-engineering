package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class q32 {

    /* JADX INFO: renamed from: γ */
    public static final p000.q32 f8846 = null;

    /* JADX INFO: renamed from: δ */
    public static final p000.q32 f8847 = null;

    /* JADX INFO: renamed from: α */
    public final int f8848;

    /* JADX INFO: renamed from: β */
    public final boolean f8849;

    static {
            q32 r0 = new q32
            r1 = 2
            r2 = 0
            r0.<init>(r1, r2)
            p000.q32.f8846 = r0
            q32 r0 = new q32
            r1 = 1
            r0.<init>(r1, r1)
            p000.q32.f8847 = r0
            return
    }

    public q32(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.f8848 = r1
            r0.f8849 = r2
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof p000.q32
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            q32 r5 = (p000.q32) r5
            int r1 = r5.f8848
            int r3 = r4.f8848
            if (r3 != r1) goto L1a
            boolean r4 = r4.f8849
            boolean r5 = r5.f8849
            if (r4 == r5) goto L19
            return r2
        L19:
            return r0
        L1a:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.f8848
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            boolean r1 = r1.f8849
            int r1 = java.lang.Boolean.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            q32 r0 = p000.q32.f8846
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto Lb
            java.lang.String r1 = "TextMotion.Static"
            return r1
        Lb:
            q32 r0 = p000.q32.f8847
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L16
            java.lang.String r1 = "TextMotion.Animated"
            return r1
        L16:
            java.lang.String r1 = "Invalid"
            return r1
    }
}
