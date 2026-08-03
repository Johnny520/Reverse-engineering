package t2;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t2.i f13007d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13010c;

    static {
            t2.i r0 = new t2.i
            float r1 = t2.f.f13002c
            r2 = 17
            r3 = 0
            r0.<init>(r1, r2, r3)
            t2.i.f13007d = r0
            return
    }

    public i(float r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f13008a = r1
            r0.f13009b = r2
            r0.f13010c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof t2.i
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            t2.i r5 = (t2.i) r5
            float r1 = r5.f13008a
            float r3 = t2.f.f13001b
            float r3 = r4.f13008a
            int r1 = java.lang.Float.compare(r3, r1)
            if (r1 != 0) goto L25
            int r1 = r4.f13009b
            int r3 = r5.f13009b
            if (r1 != r3) goto L25
            int r1 = r4.f13010c
            int r5 = r5.f13010c
            if (r1 != r5) goto L25
            return r0
        L25:
            return r2
    }

    public final int hashCode() {
            r3 = this;
            float r0 = t2.f.f13001b
            float r0 = r3.f13008a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.f13009b
            int r0 = eh.a.e(r2, r0, r1)
            int r1 = r3.f13010c
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LineHeightStyle(alignment="
            r0.<init>(r1)
            float r1 = r5.f13008a
            java.lang.String r1 = t2.f.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", trim="
            r0.append(r1)
            java.lang.String r1 = "Invalid"
            int r2 = r5.f13009b
            r3 = 1
            if (r2 != r3) goto L1f
            java.lang.String r2 = "LineHeightStyle.Trim.FirstLineTop"
            goto L33
        L1f:
            r4 = 16
            if (r2 != r4) goto L26
            java.lang.String r2 = "LineHeightStyle.Trim.LastLineBottom"
            goto L33
        L26:
            r4 = 17
            if (r2 != r4) goto L2d
            java.lang.String r2 = "LineHeightStyle.Trim.Both"
            goto L33
        L2d:
            if (r2 != 0) goto L32
            java.lang.String r2 = "LineHeightStyle.Trim.None"
            goto L33
        L32:
            r2 = r1
        L33:
            r0.append(r2)
            java.lang.String r2 = ",mode="
            r0.append(r2)
            int r2 = r5.f13010c
            if (r2 != 0) goto L42
            java.lang.String r1 = "LineHeightStyle.Mode.Fixed"
            goto L4c
        L42:
            if (r2 != r3) goto L47
            java.lang.String r1 = "LineHeightStyle.Mode.Minimum"
            goto L4c
        L47:
            r3 = 2
            if (r2 != r3) goto L4c
            java.lang.String r1 = "LineHeightStyle.Mode.Tight"
        L4c:
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
