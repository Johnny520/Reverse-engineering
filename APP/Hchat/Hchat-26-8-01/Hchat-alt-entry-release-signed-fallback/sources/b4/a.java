package b4;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.a f458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f459b;

    public a(a4.a r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f458a = r1
            r0.f459b = r2
            return
    }

    public a(android.graphics.Rect r2, float r3) {
            r1 = this;
            a4.a r0 = new a4.a
            r0.<init>(r2)
            r1.<init>()
            r1.f458a = r0
            r1.f459b = r3
            return
    }

    public final android.graphics.Rect a() {
            r5 = this;
            a4.a r0 = r5.f458a
            r0.getClass()
            android.graphics.Rect r1 = new android.graphics.Rect
            int r2 = r0.f51a
            int r3 = r0.f52b
            int r4 = r0.f53c
            int r0 = r0.f54d
            r1.<init>(r2, r3, r4, r0)
            return r1
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            if (r5 == 0) goto Lb
            java.lang.Class r1 = r5.getClass()
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.Class<b4.a> r2 = b4.a.class
            boolean r1 = r2.equals(r1)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            r5.getClass()
            b4.a r5 = (b4.a) r5
            a4.a r1 = r4.f458a
            a4.a r3 = r5.f458a
            boolean r1 = gg.l.a(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            float r1 = r4.f459b
            float r5 = r5.f459b
            int r5 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r5 != 0) goto L2f
            return r0
        L2f:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            a4.a r0 = r2.f458a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            float r1 = r2.f459b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WindowMetrics(_bounds="
            r0.<init>(r1)
            a4.a r1 = r3.f458a
            r0.append(r1)
            java.lang.String r1 = ", density="
            r0.append(r1)
            float r1 = r3.f459b
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
