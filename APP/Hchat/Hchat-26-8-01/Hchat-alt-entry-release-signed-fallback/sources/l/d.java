package l;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f7623e;

    public d(long r1, long r3, long r5, long r7, long r9) {
            r0 = this;
            r0.<init>()
            r0.f7619a = r1
            r0.f7620b = r3
            r0.f7621c = r5
            r0.f7622d = r7
            r0.f7623e = r9
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            r1 = 0
            if (r7 == 0) goto L46
            boolean r2 = r7 instanceof l.d
            if (r2 != 0) goto Lc
            goto L46
        Lc:
            l.d r7 = (l.d) r7
            long r2 = r7.f7619a
            long r4 = r6.f7619a
            boolean r2 = f1.w.c(r4, r2)
            if (r2 != 0) goto L19
            return r1
        L19:
            long r2 = r6.f7620b
            long r4 = r7.f7620b
            boolean r2 = f1.w.c(r2, r4)
            if (r2 != 0) goto L24
            return r1
        L24:
            long r2 = r6.f7621c
            long r4 = r7.f7621c
            boolean r2 = f1.w.c(r2, r4)
            if (r2 != 0) goto L2f
            return r1
        L2f:
            long r2 = r6.f7622d
            long r4 = r7.f7622d
            boolean r2 = f1.w.c(r2, r4)
            if (r2 != 0) goto L3a
            return r1
        L3a:
            long r2 = r6.f7623e
            long r4 = r7.f7623e
            boolean r7 = f1.w.c(r2, r4)
            if (r7 != 0) goto L45
            return r1
        L45:
            return r0
        L46:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            int r0 = f1.w.f3132h
            long r0 = r4.f7619a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f7620b
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f7621c
            int r0 = eh.a.f(r0, r1, r2)
            long r2 = r4.f7622d
            int r0 = eh.a.f(r0, r1, r2)
            long r1 = r4.f7623e
            int r1 = java.lang.Long.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContextMenuColors(backgroundColor="
            r0.<init>(r1)
            long r1 = r3.f7619a
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", textColor="
            r0.append(r1)
            long r1 = r3.f7620b
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", iconColor="
            r0.append(r1)
            long r1 = r3.f7621c
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", disabledTextColor="
            r0.append(r1)
            long r1 = r3.f7622d
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            java.lang.String r1 = ", disabledIconColor="
            r0.append(r1)
            long r1 = r3.f7623e
            java.lang.String r1 = f1.w.i(r1)
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
