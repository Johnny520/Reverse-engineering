package sh;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f12692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f12693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f12695d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f12696e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f12697f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f12698g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f12699h;

    public l1(long r1, long r3, long r5, long r7, long r9, long r11, long r13, long r15) {
            r0 = this;
            r0.<init>()
            r0.f12692a = r1
            r0.f12693b = r3
            r0.f12694c = r5
            r0.f12695d = r7
            r0.f12696e = r9
            r0.f12697f = r11
            r0.f12698g = r13
            r1 = r15
            r0.f12699h = r1
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof sh.l1
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            sh.l1 r8 = (sh.l1) r8
            long r3 = r7.f12692a
            long r5 = r8.f12692a
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.f12693b
            long r5 = r8.f12693b
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L22
            return r2
        L22:
            long r3 = r7.f12694c
            long r5 = r8.f12694c
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            long r3 = r7.f12695d
            long r5 = r8.f12695d
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L38
            return r2
        L38:
            long r3 = r7.f12696e
            long r5 = r8.f12696e
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L43
            return r2
        L43:
            long r3 = r7.f12697f
            long r5 = r8.f12697f
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L4e
            return r2
        L4e:
            long r3 = r7.f12698g
            long r5 = r8.f12698g
            boolean r1 = f1.w.c(r3, r5)
            if (r1 != 0) goto L59
            return r2
        L59:
            long r3 = r7.f12699h
            long r5 = r8.f12699h
            boolean r8 = f1.w.c(r3, r5)
            if (r8 != 0) goto L64
            return r2
        L64:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = f1.w.f3132h
            long r0 = r4.f12692a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f12693b
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12694c
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12695d
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12696e
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12697f
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f12698g
            int r0 = eh.a.f(r0, r1, r2)
            long r1 = r4.f12699h
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r11 = this;
            long r0 = r11.f12692a
            java.lang.String r0 = f1.w.i(r0)
            long r1 = r11.f12693b
            java.lang.String r1 = f1.w.i(r1)
            long r2 = r11.f12694c
            java.lang.String r2 = f1.w.i(r2)
            long r3 = r11.f12695d
            java.lang.String r3 = f1.w.i(r3)
            long r4 = r11.f12696e
            java.lang.String r4 = f1.w.i(r4)
            long r5 = r11.f12697f
            java.lang.String r5 = f1.w.i(r5)
            long r6 = r11.f12698g
            java.lang.String r6 = f1.w.i(r6)
            long r7 = r11.f12699h
            java.lang.String r7 = f1.w.i(r7)
            java.lang.String r8 = ", uncheckedThumbColor="
            java.lang.String r9 = ", disabledCheckedThumbColor="
            java.lang.String r10 = "SwitchColors(checkedThumbColor="
            java.lang.StringBuilder r0 = bc.e.p(r10, r0, r8, r1, r9)
            java.lang.String r1 = ", disabledUncheckedThumbColor="
            java.lang.String r8 = ", checkedTrackColor="
            j8.b.t(r0, r2, r1, r3, r8)
            java.lang.String r1 = ", uncheckedTrackColor="
            java.lang.String r2 = ", disabledCheckedTrackColor="
            j8.b.t(r0, r4, r1, r5, r2)
            java.lang.String r1 = ", disabledUncheckedTrackColor="
            java.lang.String r2 = ")"
            java.lang.String r0 = j8.b.k(r0, r6, r1, r7, r2)
            return r0
    }
}
