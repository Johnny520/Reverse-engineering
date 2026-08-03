package w;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14574a;

    public /* synthetic */ n0(int r1) {
            r0 = this;
            r0.f14574a = r1
            r0.<init>()
            return
    }

    public final w.m0 a(android.view.KeyEvent r13) {
            r12 = this;
            int r0 = r12.f14574a
            switch(r0) {
                case 0: goto L217;
                default: goto L5;
            }
        L5:
            int r0 = w.s.v(r13)
            int r1 = w.s.f14647g
            r1 = 9
            r2 = 0
            if (r0 != r1) goto L44
            int r0 = r13.getKeyCode()
            long r0 = q1.d.a(r0)
            long r3 = q1.a.f10576f
            boolean r3 = q1.a.a(r0, r3)
            if (r3 == 0) goto L23
            w.m0 r2 = w.m0.W
            goto L85
        L23:
            long r3 = q1.a.f10577g
            boolean r3 = q1.a.a(r0, r3)
            if (r3 == 0) goto L2e
            w.m0 r2 = w.m0.X
            goto L85
        L2e:
            long r3 = q1.a.f10574d
            boolean r3 = q1.a.a(r0, r3)
            if (r3 == 0) goto L39
            w.m0 r2 = w.m0.O
            goto L85
        L39:
            long r3 = q1.a.f10575e
            boolean r0 = q1.a.a(r0, r3)
            if (r0 == 0) goto L85
            w.m0 r2 = w.m0.P
            goto L85
        L44:
            r1 = 1
            if (r0 != r1) goto L85
            int r0 = r13.getKeyCode()
            long r0 = q1.d.a(r0)
            long r3 = q1.a.f10576f
            boolean r3 = q1.a.a(r0, r3)
            if (r3 == 0) goto L5a
            w.m0 r2 = w.m0.f14557p
            goto L85
        L5a:
            long r3 = q1.a.f10577g
            boolean r3 = q1.a.a(r0, r3)
            if (r3 == 0) goto L65
            w.m0 r2 = w.m0.f14558q
            goto L85
        L65:
            long r3 = q1.a.f10574d
            boolean r3 = q1.a.a(r0, r3)
            if (r3 == 0) goto L70
            w.m0 r2 = w.m0.f14564w
            goto L85
        L70:
            long r3 = q1.a.f10575e
            boolean r3 = q1.a.a(r0, r3)
            if (r3 == 0) goto L7b
            w.m0 r2 = w.m0.f14565x
            goto L85
        L7b:
            long r3 = q1.a.f10589s
            boolean r0 = q1.a.a(r0, r3)
            if (r0 == 0) goto L85
            w.m0 r2 = w.m0.F
        L85:
            if (r2 != 0) goto L216
            m.a r0 = w.s.f14643c
            r0.getClass()
            int r1 = w.s.f14648h
            int r1 = w.s.v(r13)
            int r2 = r13.getKeyCode()
            long r2 = q1.d.a(r2)
            long r4 = q1.a.f10589s
            boolean r4 = q1.a.a(r2, r4)
            w.m0 r5 = w.m0.B
            r6 = 10
            r7 = 2
            r8 = 8
            r9 = 0
            if (r4 == 0) goto Lc2
            if (r1 != 0) goto Lad
            goto Lb6
        Lad:
            if (r1 != r8) goto Lb0
            goto Lb6
        Lb0:
            int r2 = w.s.f14649i
            r2 = 12
            if (r1 != r2) goto Lb8
        Lb6:
            r1 = r5
            goto Ldf
        Lb8:
            if (r1 != r7) goto Lbb
            goto Lbd
        Lbb:
            if (r1 != r6) goto Lc0
        Lbd:
            w.m0 r1 = w.m0.D
            goto Ldf
        Lc0:
            r1 = r9
            goto Ldf
        Lc2:
            long r10 = q1.a.f10588r
            boolean r4 = q1.a.a(r2, r10)
            if (r4 != 0) goto Ld2
            long r10 = q1.a.E
            boolean r2 = q1.a.a(r2, r10)
            if (r2 == 0) goto Lc0
        Ld2:
            if (r1 != 0) goto Ld5
            goto Ldd
        Ld5:
            if (r1 != r8) goto Ld8
            goto Ldd
        Ld8:
            if (r1 != r7) goto Ldb
            goto Ldd
        Ldb:
            if (r1 != r6) goto Lc0
        Ldd:
            w.m0 r1 = w.m0.Z
        Ldf:
            if (r1 == 0) goto Le4
            r2 = r1
            goto L216
        Le4:
            int r1 = w.s.v(r13)
            if (r1 != r6) goto L149
            int r1 = r13.getKeyCode()
            long r1 = q1.d.a(r1)
            long r3 = q1.a.f10576f
            boolean r3 = q1.a.a(r1, r3)
            if (r3 != 0) goto L145
            long r3 = q1.a.H
            boolean r3 = q1.a.a(r1, r3)
            if (r3 == 0) goto L103
            goto L145
        L103:
            long r3 = q1.a.f10577g
            boolean r3 = q1.a.a(r1, r3)
            if (r3 != 0) goto L141
            long r3 = q1.a.I
            boolean r3 = q1.a.a(r1, r3)
            if (r3 == 0) goto L114
            goto L141
        L114:
            long r3 = q1.a.f10574d
            boolean r3 = q1.a.a(r1, r3)
            if (r3 != 0) goto L13d
            long r3 = q1.a.F
            boolean r3 = q1.a.a(r1, r3)
            if (r3 == 0) goto L125
            goto L13d
        L125:
            long r3 = q1.a.f10575e
            boolean r3 = q1.a.a(r1, r3)
            if (r3 != 0) goto L139
            long r3 = q1.a.G
            boolean r1 = q1.a.a(r1, r3)
            if (r1 == 0) goto L136
            goto L139
        L136:
            r5 = r9
            goto L209
        L139:
            w.m0 r5 = w.m0.S
            goto L209
        L13d:
            w.m0 r5 = w.m0.T
            goto L209
        L141:
            w.m0 r5 = w.m0.R
            goto L209
        L145:
            w.m0 r5 = w.m0.Q
            goto L209
        L149:
            if (r1 != r7) goto L1c3
            int r1 = r13.getKeyCode()
            long r1 = q1.d.a(r1)
            long r3 = q1.a.f10576f
            boolean r3 = q1.a.a(r1, r3)
            if (r3 != 0) goto L1c0
            long r3 = q1.a.H
            boolean r3 = q1.a.a(r1, r3)
            if (r3 == 0) goto L164
            goto L1c0
        L164:
            long r3 = q1.a.f10577g
            boolean r3 = q1.a.a(r1, r3)
            if (r3 != 0) goto L1bd
            long r3 = q1.a.I
            boolean r3 = q1.a.a(r1, r3)
            if (r3 == 0) goto L175
            goto L1bd
        L175:
            long r3 = q1.a.f10574d
            boolean r3 = q1.a.a(r1, r3)
            if (r3 != 0) goto L1ba
            long r3 = q1.a.F
            boolean r3 = q1.a.a(r1, r3)
            if (r3 == 0) goto L186
            goto L1ba
        L186:
            long r3 = q1.a.f10575e
            boolean r3 = q1.a.a(r1, r3)
            if (r3 != 0) goto L1b7
            long r3 = q1.a.G
            boolean r3 = q1.a.a(r1, r3)
            if (r3 == 0) goto L197
            goto L1b7
        L197:
            long r3 = q1.a.f10581k
            boolean r3 = q1.a.a(r1, r3)
            if (r3 == 0) goto L1a1
            goto L209
        L1a1:
            long r3 = q1.a.f10590t
            boolean r3 = q1.a.a(r1, r3)
            if (r3 == 0) goto L1ac
            w.m0 r5 = w.m0.E
            goto L209
        L1ac:
            long r3 = q1.a.B
            boolean r1 = q1.a.a(r1, r3)
            if (r1 == 0) goto L136
            w.m0 r5 = w.m0.Y
            goto L209
        L1b7:
            w.m0 r5 = w.m0.f14553l
            goto L209
        L1ba:
            w.m0 r5 = w.m0.f14554m
            goto L209
        L1bd:
            w.m0 r5 = w.m0.f14551j
            goto L209
        L1c0:
            w.m0 r5 = w.m0.f14552k
            goto L209
        L1c3:
            if (r1 != r8) goto L1f4
            int r1 = r13.getKeyCode()
            long r1 = q1.d.a(r1)
            long r3 = q1.a.f10592v
            boolean r3 = q1.a.a(r1, r3)
            if (r3 != 0) goto L1f1
            long r3 = q1.a.J
            boolean r3 = q1.a.a(r1, r3)
            if (r3 == 0) goto L1de
            goto L1f1
        L1de:
            long r3 = q1.a.f10593w
            boolean r3 = q1.a.a(r1, r3)
            if (r3 != 0) goto L1ee
            long r3 = q1.a.K
            boolean r1 = q1.a.a(r1, r3)
            if (r1 == 0) goto L136
        L1ee:
            w.m0 r5 = w.m0.V
            goto L209
        L1f1:
            w.m0 r5 = w.m0.U
            goto L209
        L1f4:
            r2 = 1
            if (r1 != r2) goto L136
            int r1 = r13.getKeyCode()
            long r1 = q1.d.a(r1)
            long r3 = q1.a.f10590t
            boolean r1 = q1.a.a(r1, r3)
            if (r1 == 0) goto L136
            w.m0 r5 = w.m0.G
        L209:
            if (r5 != 0) goto L215
            java.lang.Object r0 = r0.f8069h
            w.n0 r0 = (w.n0) r0
            w.m0 r13 = r0.a(r13)
            r2 = r13
            goto L216
        L215:
            r2 = r5
        L216:
            return r2
        L217:
            int r0 = w.s.v(r13)
            r1 = 10
            w.m0 r2 = w.m0.f14547c0
            if (r0 != r1) goto L233
            int r13 = r13.getKeyCode()
            long r0 = q1.d.a(r13)
            long r3 = q1.a.f10585o
            boolean r13 = q1.a.a(r0, r3)
            if (r13 == 0) goto L472
            goto L473
        L233:
            w.m0 r1 = w.m0.f14566y
            w.m0 r3 = w.m0.A
            w.m0 r4 = w.m0.f14567z
            r5 = 2
            if (r0 != r5) goto L298
            int r13 = r13.getKeyCode()
            long r5 = q1.d.a(r13)
            long r7 = q1.a.f10580j
            boolean r13 = q1.a.a(r5, r7)
            if (r13 != 0) goto L295
            long r7 = q1.a.f10594x
            boolean r13 = q1.a.a(r5, r7)
            if (r13 != 0) goto L295
            long r7 = q1.a.N
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L25d
            goto L295
        L25d:
            long r0 = q1.a.f10582l
            boolean r13 = q1.a.a(r5, r0)
            if (r13 == 0) goto L268
        L265:
            r2 = r4
            goto L473
        L268:
            long r0 = q1.a.f10583m
            boolean r13 = q1.a.a(r5, r0)
            if (r13 == 0) goto L273
        L270:
            r2 = r3
            goto L473
        L273:
            long r0 = q1.a.f10579i
            boolean r13 = q1.a.a(r5, r0)
            if (r13 == 0) goto L27f
            w.m0 r2 = w.m0.H
            goto L473
        L27f:
            long r0 = q1.a.f10584n
            boolean r13 = q1.a.a(r5, r0)
            if (r13 == 0) goto L289
            goto L473
        L289:
            long r0 = q1.a.f10585o
            boolean r13 = q1.a.a(r5, r0)
            if (r13 == 0) goto L472
            w.m0 r2 = w.m0.f14546b0
            goto L473
        L295:
            r2 = r1
            goto L473
        L298:
            r2 = 8
            if (r0 != r2) goto L362
            int r13 = r13.getKeyCode()
            long r0 = q1.d.a(r13)
            long r2 = q1.a.f10576f
            boolean r13 = q1.a.a(r0, r2)
            if (r13 != 0) goto L35e
            long r2 = q1.a.H
            boolean r13 = q1.a.a(r0, r2)
            if (r13 == 0) goto L2b6
            goto L35e
        L2b6:
            long r2 = q1.a.f10577g
            boolean r13 = q1.a.a(r0, r2)
            if (r13 != 0) goto L35a
            long r2 = q1.a.I
            boolean r13 = q1.a.a(r0, r2)
            if (r13 == 0) goto L2c8
            goto L35a
        L2c8:
            long r2 = q1.a.f10574d
            boolean r13 = q1.a.a(r0, r2)
            if (r13 != 0) goto L356
            long r2 = q1.a.F
            boolean r13 = q1.a.a(r0, r2)
            if (r13 == 0) goto L2da
            goto L356
        L2da:
            long r2 = q1.a.f10575e
            boolean r13 = q1.a.a(r0, r2)
            if (r13 != 0) goto L352
            long r2 = q1.a.G
            boolean r13 = q1.a.a(r0, r2)
            if (r13 == 0) goto L2ec
            goto L352
        L2ec:
            long r2 = q1.a.C
            boolean r13 = q1.a.a(r0, r2)
            if (r13 != 0) goto L34e
            long r2 = q1.a.L
            boolean r13 = q1.a.a(r0, r2)
            if (r13 == 0) goto L2fd
            goto L34e
        L2fd:
            long r2 = q1.a.D
            boolean r13 = q1.a.a(r0, r2)
            if (r13 != 0) goto L34a
            long r2 = q1.a.M
            boolean r13 = q1.a.a(r0, r2)
            if (r13 == 0) goto L30e
            goto L34a
        L30e:
            long r2 = q1.a.f10592v
            boolean r13 = q1.a.a(r0, r2)
            if (r13 != 0) goto L346
            long r2 = q1.a.J
            boolean r13 = q1.a.a(r0, r2)
            if (r13 == 0) goto L31f
            goto L346
        L31f:
            long r2 = q1.a.f10593w
            boolean r13 = q1.a.a(r0, r2)
            if (r13 != 0) goto L342
            long r2 = q1.a.K
            boolean r13 = q1.a.a(r0, r2)
            if (r13 == 0) goto L330
            goto L342
        L330:
            long r2 = q1.a.f10594x
            boolean r13 = q1.a.a(r0, r2)
            if (r13 != 0) goto L265
            long r2 = q1.a.N
            boolean r13 = q1.a.a(r0, r2)
            if (r13 == 0) goto L472
            goto L265
        L342:
            w.m0 r2 = w.m0.V
            goto L473
        L346:
            w.m0 r2 = w.m0.U
            goto L473
        L34a:
            w.m0 r2 = w.m0.N
            goto L473
        L34e:
            w.m0 r2 = w.m0.M
            goto L473
        L352:
            w.m0 r2 = w.m0.L
            goto L473
        L356:
            w.m0 r2 = w.m0.K
            goto L473
        L35a:
            w.m0 r2 = w.m0.J
            goto L473
        L35e:
            w.m0 r2 = w.m0.I
            goto L473
        L362:
            if (r0 != 0) goto L472
            int r13 = r13.getKeyCode()
            long r5 = q1.d.a(r13)
            long r7 = q1.a.f10576f
            boolean r13 = q1.a.a(r5, r7)
            if (r13 != 0) goto L46f
            long r7 = q1.a.H
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L37e
            goto L46f
        L37e:
            long r7 = q1.a.f10577g
            boolean r13 = q1.a.a(r5, r7)
            if (r13 != 0) goto L46c
            long r7 = q1.a.I
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L390
            goto L46c
        L390:
            long r7 = q1.a.f10574d
            boolean r13 = q1.a.a(r5, r7)
            if (r13 != 0) goto L469
            long r7 = q1.a.F
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L3a2
            goto L469
        L3a2:
            long r7 = q1.a.f10575e
            boolean r13 = q1.a.a(r5, r7)
            if (r13 != 0) goto L466
            long r7 = q1.a.G
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L3b4
            goto L466
        L3b4:
            long r7 = q1.a.f10578h
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L3c0
            w.m0 r2 = w.m0.f14561t
            goto L473
        L3c0:
            long r7 = q1.a.C
            boolean r13 = q1.a.a(r5, r7)
            if (r13 != 0) goto L463
            long r7 = q1.a.L
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L3d2
            goto L463
        L3d2:
            long r7 = q1.a.D
            boolean r13 = q1.a.a(r5, r7)
            if (r13 != 0) goto L460
            long r7 = q1.a.M
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L3e4
            goto L460
        L3e4:
            long r7 = q1.a.f10592v
            boolean r13 = q1.a.a(r5, r7)
            if (r13 != 0) goto L45d
            long r7 = q1.a.J
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L3f6
            goto L45d
        L3f6:
            long r7 = q1.a.f10593w
            boolean r13 = q1.a.a(r5, r7)
            if (r13 != 0) goto L45a
            long r7 = q1.a.K
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L407
            goto L45a
        L407:
            long r7 = q1.a.f10588r
            boolean r13 = q1.a.a(r5, r7)
            if (r13 != 0) goto L457
            long r7 = q1.a.E
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L418
            goto L457
        L418:
            long r7 = q1.a.f10589s
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L423
            w.m0 r2 = w.m0.B
            goto L473
        L423:
            long r7 = q1.a.f10590t
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L42e
            w.m0 r2 = w.m0.C
            goto L473
        L42e:
            long r7 = q1.a.A
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L438
            goto L265
        L438:
            long r7 = q1.a.f10595y
            boolean r13 = q1.a.a(r5, r7)
            if (r13 == 0) goto L442
            goto L270
        L442:
            long r2 = q1.a.f10596z
            boolean r13 = q1.a.a(r5, r2)
            if (r13 == 0) goto L44c
            goto L295
        L44c:
            long r0 = q1.a.f10586p
            boolean r13 = q1.a.a(r5, r0)
            if (r13 == 0) goto L472
            w.m0 r2 = w.m0.f14545a0
            goto L473
        L457:
            w.m0 r2 = w.m0.Z
            goto L473
        L45a:
            w.m0 r2 = w.m0.f14556o
            goto L473
        L45d:
            w.m0 r2 = w.m0.f14555n
            goto L473
        L460:
            w.m0 r2 = w.m0.f14563v
            goto L473
        L463:
            w.m0 r2 = w.m0.f14562u
            goto L473
        L466:
            w.m0 r2 = w.m0.f14560s
            goto L473
        L469:
            w.m0 r2 = w.m0.f14559r
            goto L473
        L46c:
            w.m0 r2 = w.m0.f14550i
            goto L473
        L46f:
            w.m0 r2 = w.m0.f14549h
            goto L473
        L472:
            r2 = 0
        L473:
            return r2
    }
}
