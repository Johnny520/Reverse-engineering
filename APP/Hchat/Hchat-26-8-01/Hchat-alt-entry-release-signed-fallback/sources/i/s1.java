package i;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i.q f5784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i.v f5785b;

    public s1(i.q r1, i.v r2) {
            r0 = this;
            r0.<init>()
            r0.f5784a = r1
            r0.f5785b = r2
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof i.s1
            if (r1 != 0) goto L9
            goto L20
        L9:
            i.s1 r4 = (i.s1) r4
            i.q r1 = r3.f5784a
            i.q r2 = r4.f5784a
            boolean r1 = gg.l.a(r1, r2)
            if (r1 != 0) goto L16
            goto L20
        L16:
            i.v r1 = r3.f5785b
            i.v r4 = r4.f5785b
            boolean r4 = gg.l.a(r1, r4)
            if (r4 != 0) goto L22
        L20:
            r4 = 0
            return r4
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            i.q r0 = r2.f5784a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            i.v r1 = r2.f5785b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            r0 = 0
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "VectorizedKeyframeSpecElementInfo(vectorValue="
            r0.<init>(r1)
            i.q r1 = r2.f5784a
            r0.append(r1)
            java.lang.String r1 = ", easing="
            r0.append(r1)
            i.v r1 = r2.f5785b
            r0.append(r1)
            java.lang.String r1 = ", arcMode=ArcMode(value=0))"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
