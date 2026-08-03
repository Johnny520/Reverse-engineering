package lg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f8040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8041b;

    public a(float r1, float r2) {
            r0 = this;
            r0.<init>()
            r0.f8040a = r1
            r0.f8041b = r2
            return
    }

    public static boolean d(java.lang.Float r0, java.lang.Float r1) {
            float r0 = r0.floatValue()
            float r1 = r1.floatValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 > 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    public final java.lang.Comparable a() {
            r1 = this;
            float r0 = r1.f8041b
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    public final java.lang.Comparable b() {
            r1 = this;
            float r0 = r1.f8040a
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
    }

    public final boolean c() {
            r2 = this;
            float r0 = r2.f8040a
            float r1 = r2.f8041b
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof lg.a
            if (r0 == 0) goto L27
            boolean r0 = r2.c()
            if (r0 == 0) goto L13
            r0 = r3
            lg.a r0 = (lg.a) r0
            boolean r0 = r0.c()
            if (r0 != 0) goto L25
        L13:
            lg.a r3 = (lg.a) r3
            float r0 = r3.f8040a
            float r1 = r2.f8040a
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L27
            float r0 = r2.f8041b
            float r3 = r3.f8041b
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 != 0) goto L27
        L25:
            r3 = 1
            return r3
        L27:
            r3 = 0
            return r3
    }

    public final int hashCode() {
            r2 = this;
            boolean r0 = r2.c()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            float r0 = r2.f8040a
            int r0 = java.lang.Float.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r2.f8041b
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            float r1 = r2.f8040a
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            float r1 = r2.f8041b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
