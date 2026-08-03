package p0;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class d extends p0.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final s0.g f10055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public java.lang.Object f10056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f10057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10058m;

    public d(s0.g r2, p0.k[] r3) {
            r1 = this;
            p0.j r0 = r2.f12190h
            r1.<init>(r0, r3)
            r1.f10055j = r2
            int r2 = r2.f12192j
            r1.f10058m = r2
            return
    }

    public final void d(int r6, p0.j r7, java.lang.Object r8, int r9) {
            r5 = this;
            int r0 = r9 * 5
            r1 = 30
            p0.k[] r2 = r5.f10052g
            if (r0 <= r1) goto L2b
            r6 = r2[r9]
            java.lang.Object[] r7 = r7.f10069d
            int r0 = r7.length
            r1 = 0
            r6.a(r7, r0, r1)
        L11:
            r6 = r2[r9]
            java.lang.Object[] r7 = r6.f10070g
            int r6 = r6.f10072i
            r6 = r7[r6]
            boolean r6 = gg.l.a(r6, r8)
            if (r6 != 0) goto L28
            r6 = r2[r9]
            int r7 = r6.f10072i
            int r7 = r7 + 2
            r6.f10072i = r7
            goto L11
        L28:
            r5.f10053h = r9
            return
        L2b:
            int r0 = be.h.B(r6, r0)
            r1 = 1
            int r0 = r1 << r0
            boolean r3 = r7.h(r0)
            if (r3 == 0) goto L4e
            int r6 = r7.f(r0)
            r8 = r2[r9]
            java.lang.Object[] r0 = r7.f10069d
            int r7 = r7.f10066a
            int r7 = java.lang.Integer.bitCount(r7)
            int r7 = r7 * 2
            r8.a(r0, r7, r6)
            r5.f10053h = r9
            return
        L4e:
            int r0 = r7.t(r0)
            p0.j r3 = r7.s(r0)
            r2 = r2[r9]
            java.lang.Object[] r4 = r7.f10069d
            int r7 = r7.f10066a
            int r7 = java.lang.Integer.bitCount(r7)
            int r7 = r7 * 2
            r2.a(r4, r7, r0)
            int r9 = r9 + r1
            r5.d(r6, r3, r8, r9)
            return
    }

    @Override // p0.c, java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            s0.g r0 = r2.f10055j
            int r0 = r0.f12192j
            int r1 = r2.f10058m
            if (r0 != r1) goto L27
            boolean r0 = r2.f10054i
            if (r0 == 0) goto L22
            p0.k[] r0 = r2.f10052g
            int r1 = r2.f10053h
            r0 = r0[r1]
            java.lang.Object[] r1 = r0.f10070g
            int r0 = r0.f10072i
            r0 = r1[r0]
            r2.f10056k = r0
            r0 = 1
            r2.f10057l = r0
            java.lang.Object r0 = super.next()
            return r0
        L22:
            bsh.j.e()
            r0 = 0
            return r0
        L27:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    @Override // p0.c, java.util.Iterator
    public final void remove() {
            r5 = this;
            boolean r0 = r5.f10057l
            if (r0 == 0) goto L47
            boolean r0 = r5.f10054i
            r1 = 0
            s0.g r2 = r5.f10055j
            if (r0 == 0) goto L34
            if (r0 == 0) goto L30
            p0.k[] r0 = r5.f10052g
            int r3 = r5.f10053h
            r0 = r0[r3]
            java.lang.Object[] r3 = r0.f10070g
            int r0 = r0.f10072i
            r0 = r3[r0]
            java.lang.Object r3 = r5.f10056k
            java.util.Map r4 = gg.x.b(r2)
            r4.remove(r3)
            if (r0 == 0) goto L29
            int r3 = r0.hashCode()
            goto L2a
        L29:
            r3 = r1
        L2a:
            p0.j r4 = r2.f12190h
            r5.d(r3, r4, r0, r1)
            goto L3d
        L30:
            bsh.j.e()
            return
        L34:
            java.lang.Object r0 = r5.f10056k
            java.util.Map r3 = gg.x.b(r2)
            r3.remove(r0)
        L3d:
            r0 = 0
            r5.f10056k = r0
            r5.f10057l = r1
            int r0 = r2.f12192j
            r5.f10058m = r0
            return
        L47:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }
}
