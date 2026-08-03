package b3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b3.a f444e = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f448d;

    static {
            b3.a r0 = new b3.a
            r1 = 0
            r0.<init>(r1, r1, r1, r1)
            b3.a.f444e = r0
            return
    }

    public a(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.f445a = r1
            r0.f446b = r2
            r0.f447c = r3
            r0.f448d = r4
            return
    }

    public static b3.a a(b3.a r4, b3.a r5) {
            int r0 = r4.f445a
            int r1 = r5.f445a
            int r0 = java.lang.Math.max(r0, r1)
            int r1 = r4.f446b
            int r2 = r5.f446b
            int r1 = java.lang.Math.max(r1, r2)
            int r2 = r4.f447c
            int r3 = r5.f447c
            int r2 = java.lang.Math.max(r2, r3)
            int r4 = r4.f448d
            int r5 = r5.f448d
            int r4 = java.lang.Math.max(r4, r5)
            b3.a r4 = b(r0, r1, r2, r4)
            return r4
    }

    public static b3.a b(int r1, int r2, int r3, int r4) {
            if (r1 != 0) goto Lb
            if (r2 != 0) goto Lb
            if (r3 != 0) goto Lb
            if (r4 != 0) goto Lb
            b3.a r1 = b3.a.f444e
            return r1
        Lb:
            b3.a r0 = new b3.a
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static b3.a c(android.graphics.Insets r3) {
            int r0 = androidx.lifecycle.a0.a(r3)
            int r1 = androidx.lifecycle.a0.e(r3)
            int r2 = androidx.lifecycle.a0.q(r3)
            int r3 = androidx.lifecycle.a0.w(r3)
            b3.a r3 = b(r0, r1, r2, r3)
            return r3
    }

    public final android.graphics.Insets d() {
            r4 = this;
            int r0 = r4.f447c
            int r1 = r4.f448d
            int r2 = r4.f445a
            int r3 = r4.f446b
            android.graphics.Insets r0 = b2.a.h(r2, r3, r0, r1)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L2f
            java.lang.Class<b3.a> r2 = b3.a.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L10
            goto L2f
        L10:
            b3.a r5 = (b3.a) r5
            int r2 = r4.f448d
            int r3 = r5.f448d
            if (r2 == r3) goto L19
            return r1
        L19:
            int r2 = r4.f445a
            int r3 = r5.f445a
            if (r2 == r3) goto L20
            return r1
        L20:
            int r2 = r4.f447c
            int r3 = r5.f447c
            if (r2 == r3) goto L27
            return r1
        L27:
            int r2 = r4.f446b
            int r5 = r5.f446b
            if (r2 == r5) goto L2e
            return r1
        L2e:
            return r0
        L2f:
            return r1
    }

    public final int hashCode() {
            r2 = this;
            int r0 = r2.f445a
            int r0 = r0 * 31
            int r1 = r2.f446b
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f447c
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f448d
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Insets{left="
            r0.<init>(r1)
            int r1 = r3.f445a
            r0.append(r1)
            java.lang.String r1 = ", top="
            r0.append(r1)
            int r1 = r3.f446b
            r0.append(r1)
            java.lang.String r1 = ", right="
            r0.append(r1)
            int r1 = r3.f447c
            r0.append(r1)
            java.lang.String r1 = ", bottom="
            r0.append(r1)
            int r1 = r3.f448d
            r2 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = p.a.n(r0, r1, r2)
            return r0
    }
}
