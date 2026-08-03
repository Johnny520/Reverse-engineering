package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final android.graphics.ColorFilter f3077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3079c;

    public n(long r4, int r6) {
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L16
            f1.a.j()
            int r0 = f1.c0.w(r4)
            android.graphics.BlendMode r1 = f1.c0.s(r6)
            android.graphics.BlendModeColorFilter r0 = f1.a.c(r0, r1)
            goto L23
        L16:
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            int r1 = f1.c0.w(r4)
            android.graphics.PorterDuff$Mode r2 = f1.c0.z(r6)
            r0.<init>(r1, r2)
        L23:
            r3.<init>()
            r3.f3077a = r0
            r3.f3078b = r4
            r3.f3079c = r6
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof f1.n
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            f1.n r8 = (f1.n) r8
            long r3 = r8.f3078b
            long r5 = r7.f3078b
            boolean r1 = f1.w.c(r5, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            int r1 = r7.f3079c
            int r8 = r8.f3079c
            if (r1 != r8) goto L1e
            return r0
        L1e:
            return r2
    }

    public final int hashCode() {
            r2 = this;
            int r0 = f1.w.f3132h
            long r0 = r2.f3078b
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            int r1 = r2.f3079c
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BlendModeColorFilter(color="
            r0.<init>(r1)
            long r1 = r3.f3078b
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", blendMode="
            r0.append(r1)
            int r1 = r3.f3079c
            java.lang.String r1 = f1.c0.A(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
