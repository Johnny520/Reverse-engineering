package f1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f1.q0 f3108d = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f3111c;

    static {
            f1.q0 r0 = new f1.q0
            r1 = 4278190080(0xff000000, double:2.113706745E-314)
            long r2 = f1.c0.d(r1)
            r4 = 0
            r1 = 0
            r0.<init>(r1, r2, r4)
            f1.q0.f3108d = r0
            return
    }

    public q0(float r1, long r2, long r4) {
            r0 = this;
            r0.<init>()
            r0.f3109a = r2
            r0.f3110b = r4
            r0.f3111c = r1
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L28
        L3:
            boolean r0 = r5 instanceof f1.q0
            if (r0 != 0) goto L8
            goto L2a
        L8:
            f1.q0 r5 = (f1.q0) r5
            long r0 = r5.f3109a
            long r2 = r4.f3109a
            boolean r0 = f1.w.c(r2, r0)
            if (r0 != 0) goto L15
            goto L2a
        L15:
            long r0 = r4.f3110b
            long r2 = r5.f3110b
            boolean r0 = e1.b.b(r0, r2)
            if (r0 != 0) goto L20
            goto L2a
        L20:
            float r0 = r4.f3111c
            float r5 = r5.f3111c
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 != 0) goto L2a
        L28:
            r5 = 1
            return r5
        L2a:
            r5 = 0
            return r5
    }

    public final int hashCode() {
            r4 = this;
            int r0 = f1.w.f3132h
            long r0 = r4.f3109a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f3110b
            int r0 = eh.a.f(r0, r1, r2)
            float r1 = r4.f3111c
            int r1 = java.lang.Float.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Shadow(color="
            r0.<init>(r1)
            long r1 = r3.f3109a
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", offset="
            r0.append(r1)
            long r1 = r3.f3110b
            java.lang.String r1 = e1.b.g(r1)
            r0.append(r1)
            java.lang.String r1 = ", blurRadius="
            r0.append(r1)
            float r1 = r3.f3111c
            r2 = 41
            java.lang.String r0 = eh.a.o(r0, r1, r2)
            return r0
    }
}
