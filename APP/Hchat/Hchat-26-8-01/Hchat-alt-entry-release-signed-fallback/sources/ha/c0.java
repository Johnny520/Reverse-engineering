package ha;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.lang.String f5168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.lang.String f5170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5171d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ha.d0 f5172e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final java.lang.String f5173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final java.lang.Object f5174g;

    public c0(java.lang.String r1, long r2, java.lang.String r4, long r5, ha.d0 r7, java.lang.String r8, java.lang.Object r9) {
            r0 = this;
            r4.getClass()
            r9.getClass()
            r0.<init>()
            r0.f5168a = r1
            r0.f5169b = r2
            r0.f5170c = r4
            r0.f5171d = r5
            r0.f5172e = r7
            r0.f5173f = r8
            r0.f5174g = r9
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            if (r4 != r5) goto L3
            goto L50
        L3:
            boolean r0 = r5 instanceof ha.c0
            if (r0 != 0) goto L8
            goto L4e
        L8:
            ha.c0 r5 = (ha.c0) r5
            java.lang.String r0 = r4.f5168a
            java.lang.String r1 = r5.f5168a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L4e
        L15:
            long r0 = r4.f5169b
            long r2 = r5.f5169b
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L1e
            goto L4e
        L1e:
            java.lang.String r0 = r4.f5170c
            java.lang.String r1 = r5.f5170c
            boolean r0 = gg.l.a(r0, r1)
            if (r0 != 0) goto L29
            goto L4e
        L29:
            long r0 = r4.f5171d
            long r2 = r5.f5171d
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L32
            goto L4e
        L32:
            ha.d0 r0 = r4.f5172e
            ha.d0 r1 = r5.f5172e
            if (r0 == r1) goto L39
            goto L4e
        L39:
            java.lang.String r0 = r4.f5173f
            java.lang.String r1 = r5.f5173f
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L44
            goto L4e
        L44:
            java.lang.Object r0 = r4.f5174g
            java.lang.Object r5 = r5.f5174g
            boolean r5 = gg.l.a(r0, r5)
            if (r5 != 0) goto L50
        L4e:
            r5 = 0
            return r5
        L50:
            r5 = 1
            return r5
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.f5168a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.f5169b
            int r0 = eh.a.f(r0, r1, r2)
            java.lang.String r2 = r4.f5170c
            int r0 = eh.a.g(r0, r1, r2)
            long r2 = r4.f5171d
            int r0 = eh.a.f(r0, r1, r2)
            ha.d0 r2 = r4.f5172e
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            java.lang.String r0 = r4.f5173f
            int r0 = eh.a.g(r2, r1, r0)
            java.lang.Object r1 = r4.f5174g
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = "MomentsPostRecord(key="
            java.lang.String r1 = ", snsId="
            java.lang.String r2 = r5.f5168a
            long r3 = r5.f5169b
            java.lang.StringBuilder r0 = eh.a.v(r0, r2, r1, r3)
            java.lang.String r1 = ", userName="
            r0.append(r1)
            java.lang.String r1 = r5.f5170c
            r0.append(r1)
            java.lang.String r1 = ", createTimeSeconds="
            r0.append(r1)
            long r1 = r5.f5171d
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            ha.d0 r1 = r5.f5172e
            r0.append(r1)
            java.lang.String r1 = ", text="
            r0.append(r1)
            java.lang.String r1 = r5.f5173f
            r0.append(r1)
            java.lang.String r1 = ", nativeInfo="
            r0.append(r1)
            java.lang.Object r1 = r5.f5174g
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
