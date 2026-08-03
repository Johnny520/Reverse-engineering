package lg;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class b implements java.lang.Iterable, hg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f8042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f8043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8044i;

    public b(int r2, int r3, int r4) {
            r1 = this;
            r1.<init>()
            if (r4 == 0) goto L1b
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L14
            r1.f8042g = r2
            int r2 = oh.h.A(r2, r3, r4)
            r1.f8043h = r2
            r1.f8044i = r4
            return
        L14:
            java.lang.String r2 = "Step must be greater than Int.MIN_VALUE to avoid overflow on negation."
            j8.o.t(r2)
            r2 = 0
            throw r2
        L1b:
            java.lang.String r2 = "Step must be non-zero."
            j8.o.t(r2)
            r2 = 0
            throw r2
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof lg.b
            if (r0 == 0) goto L29
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            lg.b r0 = (lg.b) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L27
        L13:
            lg.b r3 = (lg.b) r3
            int r0 = r3.f8042g
            int r1 = r2.f8042g
            if (r1 != r0) goto L29
            int r0 = r2.f8043h
            int r1 = r3.f8043h
            if (r0 != r1) goto L29
            int r0 = r2.f8044i
            int r3 = r3.f8044i
            if (r0 != r3) goto L29
        L27:
            r3 = 1
            return r3
        L29:
            r3 = 0
            return r3
    }

    public int hashCode() {
            r2 = this;
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L8
            r0 = -1
            return r0
        L8:
            int r0 = r2.f8042g
            int r0 = r0 * 31
            int r1 = r2.f8043h
            int r0 = r0 + r1
            int r0 = r0 * 31
            int r1 = r2.f8044i
            int r0 = r0 + r1
            return r0
    }

    public boolean isEmpty() {
            r5 = this;
            r0 = 0
            r1 = 1
            int r2 = r5.f8043h
            int r3 = r5.f8044i
            int r4 = r5.f8042g
            if (r3 <= 0) goto Le
            if (r4 <= r2) goto Ld
            return r1
        Ld:
            return r0
        Le:
            if (r4 >= r2) goto L11
            return r1
        L11:
            return r0
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
            r4 = this;
            lg.c r0 = new lg.c
            int r1 = r4.f8043h
            int r2 = r4.f8044i
            int r3 = r4.f8042g
            r0.<init>(r3, r1, r2)
            return r0
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.String r0 = " step "
            int r1 = r5.f8043h
            int r2 = r5.f8044i
            int r3 = r5.f8042g
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            if (r2 <= 0) goto L25
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = ".."
            r4.append(r3)
            r4.append(r1)
            r4.append(r0)
            r4.append(r2)
        L20:
            java.lang.String r0 = r4.toString()
            return r0
        L25:
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = " downTo "
            r4.append(r3)
            r4.append(r1)
            r4.append(r0)
            int r0 = -r2
            r4.append(r0)
            goto L20
    }
}
