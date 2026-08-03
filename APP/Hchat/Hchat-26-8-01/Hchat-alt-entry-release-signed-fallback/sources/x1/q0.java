package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21022g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x1.r0 f21023h;

    public /* synthetic */ q0(x1.r0 r1, int r2) {
            r0 = this;
            r0.f21022g = r2
            r0.f21023h = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r9 = this;
            int r0 = r9.f21022g
            switch(r0) {
                case 0: goto L69;
                case 1: goto L1c;
                default: goto L5;
            }
        L5:
            x1.r0 r0 = r9.f21023h
            x1.j0 r1 = r0.f21025l
            x1.i1 r1 = r1.a()
            x1.o0 r1 = r1.p1()
            r1.getClass()
            long r2 = r0.E
            r1.Q(r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L1c:
            x1.r0 r0 = r9.f21023h
            x1.j0 r1 = r0.f21025l
            x1.f0 r2 = r1.f20951a
            boolean r2 = x1.k.q(r2)
            r3 = 0
            if (r2 != 0) goto L3e
            boolean r2 = r1.f20953c
            if (r2 != 0) goto L3e
            x1.i1 r2 = r1.a()
            x1.i1 r2 = r2.f20945w
            if (r2 == 0) goto L48
            x1.o0 r2 = r2.p1()
            if (r2 == 0) goto L48
            v1.k0 r3 = r2.f21000r
            goto L48
        L3e:
            x1.i1 r2 = r1.a()
            x1.i1 r2 = r2.f20945w
            if (r2 == 0) goto L48
            v1.k0 r3 = r2.f21000r
        L48:
            if (r3 != 0) goto L56
            x1.f0 r2 = r1.f20951a
            x1.r1 r2 = x1.i0.a(r2)
            y1.t r2 = (y1.t) r2
            v1.a1 r3 = r2.getPlacementScope()
        L56:
            x1.i1 r1 = r1.a()
            x1.o0 r1 = r1.p1()
            r1.getClass()
            long r4 = r0.f21033t
            v1.a1.C(r3, r1, r4)
            sf.n r0 = sf.n.f12433a
            return r0
        L69:
            x1.r0 r0 = r9.f21023h
            x1.j0 r1 = r0.f21025l
            r2 = 0
            r1.f20958h = r2
            x1.f0 r3 = r1.f20951a
            j0.b r3 = r3.y()
            java.lang.Object[] r4 = r3.f6671g
            int r3 = r3.f6673i
            r5 = r2
        L7b:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 >= r3) goto L9e
            r7 = r4[r5]
            x1.f0 r7 = (x1.f0) r7
            x1.j0 r7 = r7.M
            x1.r0 r7 = r7.f20967q
            r7.getClass()
            int r8 = r7.f21028o
            r7.f21027n = r8
            r7.f21028o = r6
            x1.d0 r6 = r7.f21029p
            x1.d0 r8 = x1.d0.f20869h
            if (r6 != r8) goto L9b
            x1.d0 r6 = x1.d0.f20870i
            r7.f21029p = r6
        L9b:
            int r5 = r5 + 1
            goto L7b
        L9e:
            x1.f0 r3 = r1.f20951a
            x1.f0 r1 = r1.f20951a
            j0.b r3 = r3.y()
            java.lang.Object[] r4 = r3.f6671g
            int r3 = r3.f6673i
            r5 = r2
        Lab:
            if (r5 >= r3) goto Lc0
            r7 = r4[r5]
            x1.f0 r7 = (x1.f0) r7
            x1.j0 r7 = r7.M
            x1.r0 r7 = r7.f20967q
            r7.getClass()
            x1.g0 r7 = r7.f21037x
            r7.getClass()
            int r5 = r5 + 1
            goto Lab
        Lc0:
            x1.r r3 = r0.A()
            x1.q r3 = r3.Z
            if (r3 == 0) goto Lee
            boolean r3 = r3.f20999q
            java.util.List r4 = r1.n()
            f.d0 r4 = (f.d0) r4
            java.lang.Object r5 = r4.f2789h
            j0.b r5 = (j0.b) r5
            int r5 = r5.f6673i
            r7 = r2
        Ld7:
            if (r7 >= r5) goto Lee
            java.lang.Object r8 = r4.get(r7)
            x1.f0 r8 = (x1.f0) r8
            x1.b1 r8 = r8.L
            x1.i1 r8 = r8.f20842d
            x1.o0 r8 = r8.p1()
            if (r8 == 0) goto Leb
            r8.f20999q = r3
        Leb:
            int r7 = r7 + 1
            goto Ld7
        Lee:
            x1.r r3 = r0.A()
            x1.q r3 = r3.Z
            r3.getClass()
            v1.o0 r3 = r3.Z0()
            r3.f()
            x1.r r0 = r0.A()
            x1.q r0 = r0.Z
            if (r0 == 0) goto L12a
            java.util.List r0 = r1.n()
            f.d0 r0 = (f.d0) r0
            java.lang.Object r3 = r0.f2789h
            j0.b r3 = (j0.b) r3
            int r3 = r3.f6673i
            r4 = r2
        L113:
            if (r4 >= r3) goto L12a
            java.lang.Object r5 = r0.get(r4)
            x1.f0 r5 = (x1.f0) r5
            x1.b1 r5 = r5.L
            x1.i1 r5 = r5.f20842d
            x1.o0 r5 = r5.p1()
            if (r5 == 0) goto L127
            r5.f20999q = r2
        L127:
            int r4 = r4 + 1
            goto L113
        L12a:
            j0.b r0 = r1.y()
            java.lang.Object[] r3 = r0.f6671g
            int r0 = r0.f6673i
            r4 = r2
        L133:
            if (r4 >= r0) goto L14f
            r5 = r3[r4]
            x1.f0 r5 = (x1.f0) r5
            x1.j0 r5 = r5.M
            x1.r0 r5 = r5.f20967q
            r5.getClass()
            int r7 = r5.f21027n
            int r8 = r5.f21028o
            if (r7 == r8) goto L14c
            if (r8 != r6) goto L14c
            r7 = 1
            r5.K0(r7)
        L14c:
            int r4 = r4 + 1
            goto L133
        L14f:
            j0.b r0 = r1.y()
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r3 = r2
        L158:
            if (r3 >= r0) goto L16f
            r4 = r1[r3]
            x1.f0 r4 = (x1.f0) r4
            x1.j0 r4 = r4.M
            x1.r0 r4 = r4.f20967q
            r4.getClass()
            x1.g0 r4 = r4.f21037x
            r4.getClass()
            r4.f20917c = r2
            int r3 = r3 + 1
            goto L158
        L16f:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
