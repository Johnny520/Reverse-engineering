package f9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f3369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final java.lang.String f3372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f3373f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.String f3374g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final java.lang.String f3375h;

    public /* synthetic */ g() {
            r10 = this;
            r1 = 0
            r9 = 0
            java.lang.String r3 = ""
            r7 = 0
            r8 = 0
            r4 = r3
            r5 = r3
            r6 = r3
            r0 = r10
            r0.<init>(r1, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    public g(long r1, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, boolean r8, boolean r9) {
            r0 = this;
            r0.<init>()
            r0.f3368a = r7
            r0.f3369b = r8
            r0.f3370c = r1
            r0.f3371d = r9
            r0.f3372e = r3
            r0.f3373f = r4
            r0.f3374g = r5
            r0.f3375h = r6
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L55
        L3:
            boolean r0 = r5 instanceof f9.g
            if (r0 != 0) goto L8
            goto L53
        L8:
            f9.g r5 = (f9.g) r5
            boolean r0 = r4.f3368a
            boolean r1 = r5.f3368a
            if (r0 == r1) goto L11
            goto L53
        L11:
            boolean r0 = r4.f3369b
            boolean r1 = r5.f3369b
            if (r0 == r1) goto L18
            goto L53
        L18:
            long r0 = r4.f3370c
            long r2 = r5.f3370c
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L21
            goto L53
        L21:
            boolean r0 = r4.f3371d
            boolean r1 = r5.f3371d
            if (r0 == r1) goto L28
            goto L53
        L28:
            java.lang.String r0 = r4.f3372e
            java.lang.String r1 = r5.f3372e
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L33
            goto L53
        L33:
            java.lang.String r0 = r4.f3373f
            java.lang.String r1 = r5.f3373f
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L3e
            goto L53
        L3e:
            java.lang.String r0 = r4.f3374g
            java.lang.String r1 = r5.f3374g
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L49
            goto L53
        L49:
            java.lang.String r0 = r4.f3375h
            java.lang.String r5 = r5.f3375h
            boolean r5 = gg.l.a(r0, r5)
            if (r5 != 0) goto L55
        L53:
            r5 = 0
            return r5
        L55:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            boolean r0 = r4.f3368a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            boolean r2 = r4.f3369b
            int r0 = eh.a.h(r0, r1, r2)
            long r2 = r4.f3370c
            int r0 = eh.a.f(r0, r1, r2)
            boolean r2 = r4.f3371d
            int r0 = eh.a.h(r0, r1, r2)
            java.lang.String r2 = r4.f3372e
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f3373f
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r2 = r4.f3374g
            int r0 = eh.a.g(r0, r1, r2)
            java.lang.String r1 = r4.f3375h
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "EditMessageUpdate(success="
            r0.<init>(r1)
            boolean r1 = r5.f3368a
            r0.append(r1)
            java.lang.String r1 = ", requiresReload="
            r0.append(r1)
            boolean r1 = r5.f3369b
            r0.append(r1)
            java.lang.String r1 = ", msgId="
            r0.append(r1)
            long r1 = r5.f3370c
            r0.append(r1)
            java.lang.String r1 = ", isTransfer="
            r0.append(r1)
            boolean r1 = r5.f3371d
            r0.append(r1)
            java.lang.String r1 = ", oldContent="
            java.lang.String r2 = ", newContent="
            java.lang.String r3 = r5.f3372e
            java.lang.String r4 = r5.f3373f
            j8.b.t(r0, r1, r3, r2, r4)
            java.lang.String r1 = ", oldDisplayText="
            java.lang.String r2 = ", newDisplayText="
            java.lang.String r3 = r5.f3374g
            java.lang.String r4 = r5.f3375h
            j8.b.t(r0, r1, r3, r2, r4)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
