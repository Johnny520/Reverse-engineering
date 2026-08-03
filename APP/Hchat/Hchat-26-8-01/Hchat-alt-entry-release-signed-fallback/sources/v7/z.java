package v7;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z extends o7.e implements q7.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final r7.f f14199m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final v7.a0 f14200n;

    public z(int r4) {
            r3 = this;
            r0 = 2
            r3.<init>(r0)
            r7.f r0 = new r7.f
            r0.<init>(r4)
            r3.f14199m = r0
            v7.a0 r1 = new v7.a0
            int r4 = r4 + (-4)
            r2 = 0
            r1.<init>(r4, r2)
            r3.f14200n = r1
            r4 = 0
            r3.P(r4, r0)
            r4 = 1
            r3.P(r4, r1)
            r0.f7391j = r3
            return
    }

    public static java.lang.String Q(int r2, java.lang.String r3) {
            int r0 = r3.length()
            if (r0 < r2) goto L7
            return r3
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            int r2 = r2 - r0
            r3 = 0
        L11:
            if (r3 >= r2) goto L1b
            r0 = 35
            r1.append(r0)
            int r3 = r3 + 1
            goto L11
        L1b:
            java.lang.String r2 = r1.toString()
            return r2
    }

    public static boolean R(byte[] r4) {
            r0 = 1
            if (r4 != 0) goto L4
            return r0
        L4:
            r1 = 0
            r2 = r1
        L6:
            int r3 = r4.length
            if (r2 >= r3) goto L11
            r3 = r4[r2]
            if (r3 == 0) goto Le
            return r1
        Le:
            int r2 = r2 + 1
            goto L6
        L11:
            return r0
    }

    public static char[] S(char[] r6) {
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            r1 = -1
            r2 = 0
            r4 = r1
            r3 = r2
        L8:
            int r5 = r6.length
            if (r3 >= r5) goto L13
            char r5 = r6[r3]
            if (r5 == 0) goto L10
            r4 = r3
        L10:
            int r3 = r3 + 1
            goto L8
        L13:
            if (r4 != r1) goto L16
            return r0
        L16:
            int r4 = r4 + 1
            int r0 = r6.length
            if (r4 != r0) goto L1c
            return r6
        L1c:
            char[] r0 = new char[r4]
            java.lang.System.arraycopy(r6, r2, r0, r2, r4)
            return r0
    }

    @Override // k7.c
    public final void M() {
            r2 = this;
            int r0 = r2.p()
            r7.f r1 = r2.f14199m
            r1.k(r0)
            return
    }

    @Override // o7.e, k7.c
    public final void N() {
            r0 = this;
            return
    }

    @Override // q7.a
    public final void m(k7.a r2) {
            r1 = this;
            r7.f r0 = r1.f14199m
            if (r2 != r0) goto Ld
            int r2 = r0.f11560n
            int r2 = r2 + (-4)
            v7.a0 r0 = r1.f14200n
            r0.Q(r2)
        Ld:
            return
    }
}
