package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends gg.m implements fg.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f21074g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ x1.v0 f21075h;

    public /* synthetic */ u0(x1.v0 r1, int r2) {
            r0 = this;
            r0.f21074g = r2
            r0.f21075h = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // fg.a
    public final java.lang.Object invoke() {
            r10 = this;
            int r0 = r10.f21074g
            switch(r0) {
                case 0: goto L84;
                case 1: goto L74;
                default: goto L5;
            }
        L5:
            x1.v0 r0 = r10.f21075h
            x1.j0 r1 = r0.f21076l
            x1.i1 r2 = r1.a()
            x1.i1 r2 = r2.f20945w
            if (r2 == 0) goto L15
            v1.k0 r2 = r2.f21000r
            if (r2 != 0) goto L21
        L15:
            x1.f0 r2 = r1.f20951a
            x1.r1 r2 = x1.i0.a(r2)
            y1.t r2 = (y1.t) r2
            v1.a1 r2 = r2.getPlacementScope()
        L21:
            fg.l r3 = r0.M
            i1.b r4 = r0.N
            if (r4 == 0) goto L3f
            x1.i1 r1 = r1.a()
            long r5 = r0.O
            float r0 = r0.P
            r2.getClass()
            v1.a1.e(r2, r1)
            long r2 = r1.f13904k
            long r2 = u2.j.d(r5, r2)
            r1.B0(r2, r0, r4)
            goto L71
        L3f:
            if (r3 != 0) goto L5a
            x1.i1 r1 = r1.a()
            long r3 = r0.O
            float r0 = r0.P
            r2.getClass()
            v1.a1.e(r2, r1)
            long r5 = r1.f13904k
            long r2 = u2.j.d(r3, r5)
            r4 = 0
            r1.A0(r2, r0, r4)
            goto L71
        L5a:
            x1.i1 r1 = r1.a()
            long r4 = r0.O
            float r0 = r0.P
            r2.getClass()
            v1.a1.e(r2, r1)
            long r6 = r1.f13904k
            long r4 = u2.j.d(r4, r6)
            r1.A0(r4, r0, r3)
        L71:
            sf.n r0 = sf.n.f12433a
            return r0
        L74:
            x1.v0 r0 = r10.f21075h
            x1.j0 r1 = r0.f21076l
            x1.i1 r1 = r1.a()
            long r2 = r0.H
            r1.Q(r2)
            sf.n r0 = sf.n.f12433a
            return r0
        L84:
            x1.v0 r0 = r10.f21075h
            x1.j0 r1 = r0.f21076l
            r2 = 0
            r1.f20959i = r2
            x1.f0 r3 = r1.f20951a
            j0.b r3 = r3.y()
            java.lang.Object[] r4 = r3.f6671g
            int r3 = r3.f6673i
            r5 = r2
        L96:
            r6 = 2147483647(0x7fffffff, float:NaN)
            if (r5 >= r3) goto Lb8
            r7 = r4[r5]
            x1.f0 r7 = (x1.f0) r7
            x1.j0 r7 = r7.M
            x1.v0 r7 = r7.f20966p
            int r8 = r7.f21079o
            r7.f21078n = r8
            r7.f21079o = r6
            r7.f21090z = r2
            x1.d0 r6 = r7.f21082r
            x1.d0 r8 = x1.d0.f20869h
            if (r6 != r8) goto Lb5
            x1.d0 r6 = x1.d0.f20870i
            r7.f21082r = r6
        Lb5:
            int r5 = r5 + 1
            goto L96
        Lb8:
            x1.f0 r3 = r1.f20951a
            x1.f0 r1 = r1.f20951a
            j0.b r3 = r3.y()
            java.lang.Object[] r4 = r3.f6671g
            int r3 = r3.f6673i
            r5 = r2
        Lc5:
            if (r5 >= r3) goto Ld7
            r7 = r4[r5]
            x1.f0 r7 = (x1.f0) r7
            x1.j0 r7 = r7.M
            x1.v0 r7 = r7.f20966p
            x1.g0 r7 = r7.D
            r7.getClass()
            int r5 = r5 + 1
            goto Lc5
        Ld7:
            x1.r r3 = r0.A()
            boolean r3 = r3.f20999q
            if (r3 == 0) goto Lfe
            java.util.List r3 = r1.n()
            f.d0 r3 = (f.d0) r3
            java.lang.Object r4 = r3.f2789h
            j0.b r4 = (j0.b) r4
            int r4 = r4.f6673i
            r5 = r2
        Lec:
            if (r5 >= r4) goto Lfe
            java.lang.Object r7 = r3.get(r5)
            x1.f0 r7 = (x1.f0) r7
            x1.b1 r7 = r7.L
            x1.i1 r7 = r7.f20842d
            r8 = 1
            r7.f20999q = r8
            int r5 = r5 + 1
            goto Lec
        Lfe:
            x1.r r3 = r0.A()
            v1.o0 r3 = r3.Z0()
            r3.f()
            x1.r r0 = r0.A()
            boolean r0 = r0.f20999q
            if (r0 == 0) goto L12f
            java.util.List r0 = r1.n()
            f.d0 r0 = (f.d0) r0
            java.lang.Object r3 = r0.f2789h
            j0.b r3 = (j0.b) r3
            int r3 = r3.f6673i
            r4 = r2
        L11e:
            if (r4 >= r3) goto L12f
            java.lang.Object r5 = r0.get(r4)
            x1.f0 r5 = (x1.f0) r5
            x1.b1 r5 = r5.L
            x1.i1 r5 = r5.f20842d
            r5.f20999q = r2
            int r4 = r4 + 1
            goto L11e
        L12f:
            j0.b r0 = r1.y()
            java.lang.Object[] r3 = r0.f6671g
            int r0 = r0.f6673i
            r4 = r2
        L138:
            if (r4 >= r0) goto L170
            r5 = r3[r4]
            x1.f0 r5 = (x1.f0) r5
            x1.j0 r7 = r5.M
            x1.v0 r8 = r7.f20966p
            int r8 = r8.f21078n
            int r9 = r5.v()
            if (r8 == r9) goto L16d
            r1.O()
            r1.B()
            int r8 = r5.v()
            if (r8 != r6) goto L16d
            boolean r8 = r7.f20953c
            if (r8 != 0) goto L160
            boolean r5 = x1.k.q(r5)
            if (r5 == 0) goto L168
        L160:
            x1.r0 r5 = r7.f20967q
            r5.getClass()
            r5.K0(r2)
        L168:
            x1.v0 r5 = r7.f20966p
            r5.M0()
        L16d:
            int r4 = r4 + 1
            goto L138
        L170:
            j0.b r0 = r1.y()
            java.lang.Object[] r1 = r0.f6671g
            int r0 = r0.f6673i
            r3 = r2
        L179:
            if (r3 >= r0) goto L18d
            r4 = r1[r3]
            x1.f0 r4 = (x1.f0) r4
            x1.j0 r4 = r4.M
            x1.v0 r4 = r4.f20966p
            x1.g0 r4 = r4.D
            r4.getClass()
            r4.f20917c = r2
            int r3 = r3 + 1
            goto L179
        L18d:
            sf.n r0 = sf.n.f12433a
            return r0
    }
}
