package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12804h;

    public r0(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15) {
            r0 = this;
            r0.<init>()
            r0.f12797a = r1
            r0.f12798b = r3
            r0.f12799c = r5
            r0.f12800d = r7
            r0.f12801e = r9
            r0.f12802f = r11
            r0.f12803g = r13
            r1 = r15
            r0.f12804h = r1
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof sh.r0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sh.r0 r8 = (sh.r0) r8
            long r3 = r7.f12797a
            long r5 = r8.f12797a
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f12798b
            long r5 = r8.f12798b
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L22
            return r2
        L22:
            long r3 = r7.f12799c
            long r5 = r8.f12799c
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            long r3 = r7.f12800d
            long r5 = r8.f12800d
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L38
            return r2
        L38:
            long r3 = r7.f12801e
            long r5 = r8.f12801e
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L43
            return r2
        L43:
            long r3 = r7.f12802f
            long r5 = r8.f12802f
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            long r3 = r7.f12803g
            long r5 = r8.f12803g
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L59
            return r2
        L59:
            long r3 = r7.f12804h
            long r5 = r8.f12804h
            boolean r8 = f1.w.c(r3, r5)
            if (r8 != 0) goto L64
            return r2
        L64:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = f1.w.f3132h
            long r0 = r4.f12797a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f12798b
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12799c
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12800d
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12801e
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12802f
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12803g
            int r0 = eh.a.f(r0, r1, r2)
            long r1 = r4.f12804h
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r11 = this;
            long r0 = r11.f12797a
            java.lang.String r0 = f1.w.i(r0)
            long r1 = r11.f12798b
            java.lang.String r1 = f1.w.i(r1)
            long r2 = r11.f12799c
            java.lang.String r2 = f1.w.i(r2)
            long r3 = r11.f12800d
            java.lang.String r3 = f1.w.i(r3)
            long r4 = r11.f12801e
            java.lang.String r4 = f1.w.i(r4)
            long r5 = r11.f12802f
            java.lang.String r5 = f1.w.i(r5)
            long r6 = r11.f12803g
            java.lang.String r6 = f1.w.i(r6)
            long r7 = r11.f12804h
            java.lang.String r7 = f1.w.i(r7)
            java.lang.String r8 = ", disabledForegroundColor="
            java.lang.String r9 = ", backgroundColor="
            java.lang.String r10 = "SliderColors(foregroundColor="
            java.lang.StringBuilder r0 = bc.e.p(r10, r0, r8, r1, r9)
            java.lang.String r1 = ", disabledBackgroundColor="
            java.lang.String r8 = ", thumbColor="
            j8.b.t(r0, r2, r1, r3, r8)
            java.lang.String r1 = ", disabledThumbColor="
            java.lang.String r2 = ", keyPointColor="
            j8.b.t(r0, r4, r1, r5, r2)
            java.lang.String r1 = ", keyPointForegroundColor="
            java.lang.String r2 = ")"
            java.lang.String r0 = j8.b.k(r0, r6, r1, r7, r2)
            return r0
    }
}
