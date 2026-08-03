package a;

/* JADX INFO: renamed from: a.e8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0120e8 extends a.ih {
    @Override // a.ih, a.T4
    public final void a(a.T4 r8) {
            r7 = this;
            a.N3 r8 = r7.b
            a.V1 r8 = (a.V1) r8
            int r0 = r8.g0
            a.V4 r1 = r7.h
            java.util.ArrayList r2 = r1.l
            java.util.Iterator r2 = r2.iterator()
            r3 = -1
            r4 = 0
            r5 = r3
        L11:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L28
            java.lang.Object r6 = r2.next()
            a.V4 r6 = (a.V4) r6
            int r6 = r6.g
            if (r5 == r3) goto L23
            if (r6 >= r5) goto L24
        L23:
            r5 = r6
        L24:
            if (r4 >= r6) goto L11
            r4 = r6
            goto L11
        L28:
            if (r0 == 0) goto L35
            r2 = 2
            if (r0 != r2) goto L2e
            goto L35
        L2e:
            int r8 = r8.i0
            int r4 = r4 + r8
            r1.d(r4)
            return
        L35:
            int r8 = r8.i0
            int r5 = r5 + r8
            r1.d(r5)
            return
    }

    @Override // a.ih
    public final void d() {
            r7 = this;
            a.N3 r0 = r7.b
            boolean r1 = r0 instanceof a.V1
            if (r1 == 0) goto Lfb
            a.V4 r1 = r7.h
            r2 = 1
            r1.b = r2
            a.V1 r0 = (a.V1) r0
            int r3 = r0.g0
            boolean r4 = r0.h0
            r5 = 8
            r6 = 0
            if (r3 == 0) goto Lc5
            if (r3 == r2) goto L8e
            r2 = 2
            if (r3 == r2) goto L57
            r2 = 3
            if (r3 == r2) goto L20
            goto Lfb
        L20:
            a.V4$a r2 = a.V4.a.g
            r1.e = r2
        L24:
            int r2 = r0.f0
            if (r6 >= r2) goto L44
            a.N3[] r2 = r0.e0
            r2 = r2[r6]
            if (r4 != 0) goto L33
            int r3 = r2.X
            if (r3 != r5) goto L33
            goto L41
        L33:
            a.og r2 = r2.e
            a.V4 r2 = r2.i
            java.util.ArrayList r3 = r2.k
            r3.add(r1)
            java.util.ArrayList r3 = r1.l
            r3.add(r2)
        L41:
            int r6 = r6 + 1
            goto L24
        L44:
            a.N3 r0 = r7.b
            a.og r0 = r0.e
            a.V4 r0 = r0.h
            r7.m(r0)
            a.N3 r0 = r7.b
            a.og r0 = r0.e
            a.V4 r0 = r0.i
            r7.m(r0)
            return
        L57:
            a.V4$a r2 = a.V4.a.f
            r1.e = r2
        L5b:
            int r2 = r0.f0
            if (r6 >= r2) goto L7b
            a.N3[] r2 = r0.e0
            r2 = r2[r6]
            if (r4 != 0) goto L6a
            int r3 = r2.X
            if (r3 != r5) goto L6a
            goto L78
        L6a:
            a.og r2 = r2.e
            a.V4 r2 = r2.h
            java.util.ArrayList r3 = r2.k
            r3.add(r1)
            java.util.ArrayList r3 = r1.l
            r3.add(r2)
        L78:
            int r6 = r6 + 1
            goto L5b
        L7b:
            a.N3 r0 = r7.b
            a.og r0 = r0.e
            a.V4 r0 = r0.h
            r7.m(r0)
            a.N3 r0 = r7.b
            a.og r0 = r0.e
            a.V4 r0 = r0.i
            r7.m(r0)
            return
        L8e:
            a.V4$a r2 = a.V4.a.e
            r1.e = r2
        L92:
            int r2 = r0.f0
            if (r6 >= r2) goto Lb2
            a.N3[] r2 = r0.e0
            r2 = r2[r6]
            if (r4 != 0) goto La1
            int r3 = r2.X
            if (r3 != r5) goto La1
            goto Laf
        La1:
            a.K8 r2 = r2.d
            a.V4 r2 = r2.i
            java.util.ArrayList r3 = r2.k
            r3.add(r1)
            java.util.ArrayList r3 = r1.l
            r3.add(r2)
        Laf:
            int r6 = r6 + 1
            goto L92
        Lb2:
            a.N3 r0 = r7.b
            a.K8 r0 = r0.d
            a.V4 r0 = r0.h
            r7.m(r0)
            a.N3 r0 = r7.b
            a.K8 r0 = r0.d
            a.V4 r0 = r0.i
            r7.m(r0)
            return
        Lc5:
            a.V4$a r2 = a.V4.a.d
            r1.e = r2
        Lc9:
            int r2 = r0.f0
            if (r6 >= r2) goto Le9
            a.N3[] r2 = r0.e0
            r2 = r2[r6]
            if (r4 != 0) goto Ld8
            int r3 = r2.X
            if (r3 != r5) goto Ld8
            goto Le6
        Ld8:
            a.K8 r2 = r2.d
            a.V4 r2 = r2.h
            java.util.ArrayList r3 = r2.k
            r3.add(r1)
            java.util.ArrayList r3 = r1.l
            r3.add(r2)
        Le6:
            int r6 = r6 + 1
            goto Lc9
        Le9:
            a.N3 r0 = r7.b
            a.K8 r0 = r0.d
            a.V4 r0 = r0.h
            r7.m(r0)
            a.N3 r0 = r7.b
            a.K8 r0 = r0.d
            a.V4 r0 = r0.i
            r7.m(r0)
        Lfb:
            return
    }

    @Override // a.ih
    public final void e() {
            r4 = this;
            a.N3 r0 = r4.b
            boolean r1 = r0 instanceof a.V1
            if (r1 == 0) goto L1c
            r1 = r0
            a.V1 r1 = (a.V1) r1
            int r1 = r1.g0
            a.V4 r2 = r4.h
            if (r1 == 0) goto L18
            r3 = 1
            if (r1 != r3) goto L13
            goto L18
        L13:
            int r1 = r2.g
            r0.Q = r1
            return
        L18:
            int r1 = r2.g
            r0.P = r1
        L1c:
            return
    }

    @Override // a.ih
    public final void f() {
            r1 = this;
            r0 = 0
            r1.c = r0
            a.V4 r0 = r1.h
            r0.c()
            return
    }

    @Override // a.ih
    public final boolean k() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void m(a.V4 r3) {
            r2 = this;
            a.V4 r0 = r2.h
            java.util.ArrayList r1 = r0.k
            r1.add(r3)
            java.util.ArrayList r3 = r3.l
            r3.add(r0)
            return
    }
}
