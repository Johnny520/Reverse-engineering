package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class h32 {

    /* JADX INFO: renamed from: γ */
    public static final p000.h32 f4565 = null;

    /* JADX INFO: renamed from: α */
    public final long f4566;

    /* JADX INFO: renamed from: β */
    public final long f4567;

    static {
            h32 r0 = new h32
            r1 = 0
            long r2 = p000.u81.m5807(r1)
            long r4 = p000.u81.m5807(r1)
            r0.<init>(r2, r4)
            p000.h32.f4565 = r0
            return
    }

    public h32(long r1, long r3) {
            r0 = this;
            r0.<init>()
            r0.f4566 = r1
            r0.f4567 = r3
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof p000.h32
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h32 r8 = (p000.h32) r8
            long r3 = r8.f4566
            long r5 = r7.f4566
            boolean r1 = p000.y32.m6818(r5, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f4567
            long r7 = r8.f4567
            boolean r7 = p000.y32.m6818(r3, r7)
            if (r7 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            z32[] r0 = p000.y32.f12440
            long r0 = r3.f4566
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            long r1 = r3.f4567
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "TextIndent(firstLine="
            r0.<init>(r1)
            long r1 = r3.f4566
            java.lang.String r1 = p000.y32.m6821(r1)
            r0.append(r1)
            java.lang.String r1 = ", restLine="
            r0.append(r1)
            long r1 = r3.f4567
            java.lang.String r3 = p000.y32.m6821(r1)
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
