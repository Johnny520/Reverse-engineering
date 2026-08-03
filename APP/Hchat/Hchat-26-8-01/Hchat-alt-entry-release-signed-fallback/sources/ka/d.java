package ka;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f7548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final java.lang.String f7549b;

    public d(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            r0.f7548a = r1
            r0.f7549b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof ka.d
            if (r0 != 0) goto L8
            goto L1f
        L8:
            ka.d r3 = (ka.d) r3
            java.lang.String r0 = r2.f7548a
            java.lang.String r1 = r3.f7548a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.lang.String r0 = r2.f7549b
            java.lang.String r3 = r3.f7549b
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L21
        L1f:
            r3 = 0
            return r3
        L21:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.f7548a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.f7549b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = ", customSinger="
            java.lang.String r1 = ")"
            java.lang.String r2 = "MusicCommand(keyword="
            java.lang.String r3 = r5.f7548a
            java.lang.String r4 = r5.f7549b
            java.lang.String r0 = bc.e.k(r2, r3, r0, r4, r1)
            return r0
    }
}
