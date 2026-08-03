package d9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f2131b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.graphics.Bitmap f2132c;

    public n(long r1, long r3, android.graphics.Bitmap r5) {
            r0 = this;
            r0.<init>()
            r0.f2130a = r1
            r0.f2131b = r3
            r0.f2132c = r5
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L28
        L3:
            boolean r0 = r5 instanceof d9.n
            if (r0 != 0) goto L8
            goto L26
        L8:
            d9.n r5 = (d9.n) r5
            long r0 = r4.f2130a
            long r2 = r5.f2130a
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L13
            goto L26
        L13:
            long r0 = r4.f2131b
            long r2 = r5.f2131b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1c
            goto L26
        L1c:
            android.graphics.Bitmap r0 = r4.f2132c
            android.graphics.Bitmap r5 = r5.f2132c
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L28
        L26:
            r5 = 0
            return r5
        L28:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.f2130a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f2131b
            int r0 = eh.a.f(r0, r1, r2)
            android.graphics.Bitmap r1 = r4.f2132c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = "CacheEntry(modified="
            java.lang.String r1 = ", size="
            long r2 = r4.f2130a
            java.lang.StringBuilder r0 = p.a.o(r2, r0, r1)
            long r1 = r4.f2131b
            r0.append(r1)
            java.lang.String r1 = ", bitmap="
            r0.append(r1)
            android.graphics.Bitmap r1 = r4.f2132c
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
