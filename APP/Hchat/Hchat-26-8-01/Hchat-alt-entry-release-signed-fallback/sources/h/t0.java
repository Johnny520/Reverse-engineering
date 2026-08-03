package h;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.y f4757a;

    public t0(i.y r1) {
            r0 = this;
            r0.<init>()
            r0.f4757a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L1e
        L3:
            boolean r0 = r2 instanceof h.t0
            if (r0 != 0) goto L8
            goto L1c
        L8:
            h.t0 r2 = (h.t0) r2
            r0 = 0
            int r0 = java.lang.Float.compare(r0, r0)
            if (r0 == 0) goto L12
            goto L1c
        L12:
            i.y r0 = r1.f4757a
            i.y r2 = r2.f4757a
            boolean r2 = gg.l.a(r0, r2)
            if (r2 != 0) goto L1e
        L1c:
            r2 = 0
            return r2
        L1e:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            i.y r1 = r2.f4757a
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Fade(alpha=0.0, animationSpec="
            r0.<init>(r1)
            i.y r1 = r2.f4757a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
