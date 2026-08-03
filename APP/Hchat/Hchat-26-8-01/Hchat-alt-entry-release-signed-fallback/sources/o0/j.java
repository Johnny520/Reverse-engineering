package o0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends o0.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9496i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public java.lang.Object[] f9497j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9498k;

    public j(java.lang.Object[] r3, int r4, int r5, int r6) {
            r2 = this;
            r2.<init>(r4, r5)
            r2.f9496i = r6
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r2.f9497j = r6
            r0 = 0
            r1 = 1
            if (r4 != r5) goto Lf
            r5 = r1
            goto L10
        Lf:
            r5 = r0
        L10:
            r2.f9498k = r5
            r6[r0] = r3
            int r4 = r4 - r5
            r2.c(r4, r1)
            return
    }

    public final java.lang.Object a() {
            r3 = this;
            int r0 = r3.f9470g
            r0 = r0 & 31
            java.lang.Object[] r1 = r3.f9497j
            int r2 = r3.f9496i
            int r2 = r2 + (-1)
            r1 = r1[r2]
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r0 = r1[r0]
            return r0
    }

    public final void c(int r5, int r6) {
            r4 = this;
            int r0 = r4.f9496i
            int r0 = r0 - r6
            int r0 = r0 * 5
        L5:
            int r1 = r4.f9496i
            if (r6 >= r1) goto L21
            java.lang.Object[] r1 = r4.f9497j
            int r2 = r6 + (-1)
            r2 = r1[r2]
            r2.getClass()
            java.lang.Object[] r2 = (java.lang.Object[]) r2
            int r3 = g4.a.x(r5, r0)
            r2 = r2[r3]
            r1[r6] = r2
            int r0 = r0 + (-5)
            int r6 = r6 + 1
            goto L5
        L21:
            return
    }

    public final void d(int r3) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r2.f9470g
            int r1 = g4.a.x(r1, r0)
            if (r1 != r3) goto Lc
            int r0 = r0 + 5
            goto L1
        Lc:
            if (r0 <= 0) goto L1c
            int r3 = r2.f9496i
            int r3 = r3 + (-1)
            int r0 = r0 / 5
            int r3 = r3 - r0
            int r0 = r2.f9470g
            int r3 = r3 + 1
            r2.c(r0, r3)
        L1c:
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r4 = this;
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L1c
            java.lang.Object r0 = r4.a()
            int r1 = r4.f9470g
            r2 = 1
            int r1 = r1 + r2
            r4.f9470g = r1
            int r3 = r4.f9471h
            if (r1 != r3) goto L17
            r4.f9498k = r2
            return r0
        L17:
            r1 = 0
            r4.d(r1)
            return r0
        L1c:
            bsh.j.e()
            r0 = 0
            return r0
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r1 = this;
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L22
            int r0 = r1.f9470g
            int r0 = r0 + (-1)
            r1.f9470g = r0
            boolean r0 = r1.f9498k
            if (r0 == 0) goto L18
            r0 = 0
            r1.f9498k = r0
            java.lang.Object r0 = r1.a()
            return r0
        L18:
            r0 = 31
            r1.d(r0)
            java.lang.Object r0 = r1.a()
            return r0
        L22:
            bsh.j.e()
            r0 = 0
            return r0
    }
}
