package uh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f13849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uh.a f13851c;

    static {
            uh.b r0 = new uh.b
            uh.a r1 = uh.a.f13837g
            r0.<init>(r1)
            uh.b r0 = new uh.b
            uh.a r1 = uh.a.f13838h
            r0.<init>(r1)
            uh.b r0 = new uh.b
            uh.a r1 = uh.a.f13839i
            r0.<init>(r1)
            uh.b r0 = new uh.b
            uh.a r1 = uh.a.f13840j
            r0.<init>(r1)
            uh.b r0 = new uh.b
            uh.a r1 = uh.a.f13841k
            r0.<init>(r1)
            uh.b r0 = new uh.b
            uh.a r1 = uh.a.f13842l
            r0.<init>(r1)
            return
    }

    public b(float r1, float r2, uh.a r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.f13849a = r1
            r0.f13850b = r2
            r0.f13851c = r3
            return
    }

    public b(uh.a r3) {
            r2 = this;
            r0 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            float r0 = (float) r0
            r1 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r0, r1, r3)
            return
    }

    public static uh.b a(uh.b r2, float r3, uh.a r4, int r5) {
            float r0 = r2.f13849a
            r1 = r5 & 2
            if (r1 == 0) goto L8
            float r3 = r2.f13850b
        L8:
            r5 = r5 & 4
            if (r5 == 0) goto Le
            uh.a r4 = r2.f13851c
        Le:
            r2.getClass()
            r4.getClass()
            uh.b r2 = new uh.b
            r2.<init>(r0, r3, r4)
            return r2
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L2c
        L3:
            boolean r0 = r3 instanceof uh.b
            if (r0 != 0) goto L8
            goto L2a
        L8:
            uh.b r3 = (uh.b) r3
            float r0 = r2.f13849a
            float r1 = r3.f13849a
            boolean r0 = u2.f.b(r0, r1)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            float r0 = r2.f13850b
            float r1 = r3.f13850b
            int r0 = java.lang.Float.compare(r0, r1)
            if (r0 == 0) goto L20
            goto L2a
        L20:
            uh.a r0 = r2.f13851c
            uh.a r3 = r3.f13851c
            boolean r3 = gg.l.a(r0, r3)
            if (r3 != 0) goto L2c
        L2a:
            r3 = 0
            return r3
        L2c:
            r3 = 1
            return r3
    }

    public final int hashCode() {
            r3 = this;
            float r0 = r3.f13849a
            int r0 = java.lang.Float.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            float r2 = r3.f13850b
            int r0 = eh.a.d(r2, r0, r1)
            uh.a r1 = r3.f13851c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            float r0 = r3.f13849a
            java.lang.String r0 = u2.f.c(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Highlight(width="
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = ", alpha="
            r1.append(r0)
            float r0 = r3.f13850b
            r1.append(r0)
            java.lang.String r0 = ", style="
            r1.append(r0)
            uh.a r0 = r3.f13851c
            r1.append(r0)
            java.lang.String r0 = ")"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
