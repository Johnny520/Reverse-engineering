package i2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2.f0 f6354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i2.f0 f6355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.f0 f6356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i2.f0 f6357d;

    public l0(i2.f0 r1, i2.f0 r2, i2.f0 r3, i2.f0 r4) {
            r0 = this;
            r0.<init>()
            r0.f6354a = r1
            r0.f6355b = r2
            r0.f6356c = r3
            r0.f6357d = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L3b
            boolean r2 = r5 instanceof i2.l0
            if (r2 != 0) goto Lc
            goto L3b
        Lc:
            i2.l0 r5 = (i2.l0) r5
            i2.f0 r2 = r5.f6354a
            i2.f0 r3 = r4.f6354a
            boolean r2 = gg.l.a(r3, r2)
            if (r2 != 0) goto L19
            return r1
        L19:
            i2.f0 r2 = r4.f6355b
            i2.f0 r3 = r5.f6355b
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L24
            return r1
        L24:
            i2.f0 r2 = r4.f6356c
            i2.f0 r3 = r5.f6356c
            boolean r2 = gg.l.a(r2, r3)
            if (r2 != 0) goto L2f
            return r1
        L2f:
            i2.f0 r2 = r4.f6357d
            i2.f0 r5 = r5.f6357d
            boolean r5 = gg.l.a(r2, r5)
            if (r5 != 0) goto L3a
            return r1
        L3a:
            return r0
        L3b:
            return r1
    }

    public final int hashCode() {
            r3 = this;
            r0 = 0
            i2.f0 r1 = r3.f6354a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            i2.f0 r2 = r3.f6355b
            if (r2 == 0) goto L16
            int r2 = r2.hashCode()
            goto L17
        L16:
            r2 = r0
        L17:
            int r1 = r1 + r2
            int r1 = r1 * 31
            i2.f0 r2 = r3.f6356c
            if (r2 == 0) goto L23
            int r2 = r2.hashCode()
            goto L24
        L23:
            r2 = r0
        L24:
            int r1 = r1 + r2
            int r1 = r1 * 31
            i2.f0 r2 = r3.f6357d
            if (r2 == 0) goto L2f
            int r0 = r2.hashCode()
        L2f:
            int r1 = r1 + r0
            return r1
    }
}
