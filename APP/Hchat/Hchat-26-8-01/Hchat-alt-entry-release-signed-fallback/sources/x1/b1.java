package x1;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x1.f0 f20839a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x1.a1 f20840b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x1.r f20841c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public x1.i1 f20842d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x1.b2 f20843e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y0.n f20844f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j0.b f20845g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public j0.b f20846h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j0.b f20847i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public x1.z0 f20848j;

    public b1(x1.f0 r3) {
            r2 = this;
            r2.<init>()
            r2.f20839a = r3
            x1.a1 r0 = new x1.a1
            r0.<init>()
            r1 = -1
            r0.f21822j = r1
            r2.f20840b = r0
            x1.r r0 = new x1.r
            r0.<init>(r3)
            r2.f20841c = r0
            r2.f20842d = r0
            x1.b2 r3 = r0.Y
            r2.f20843e = r3
            r2.f20844f = r3
            j0.b r3 = new j0.b
            r0 = 16
            y0.o[] r0 = new y0.o[r0]
            r3.<init>(r0)
            r2.f20847i = r3
            return
    }

    public static final void a(x1.b1 r1, y0.n r2, x1.i1 r3) {
            y0.n r2 = r2.f21823k
        L2:
            if (r2 == 0) goto L28
            x1.a1 r0 = r1.f20840b
            if (r2 != r0) goto L1b
            x1.f0 r2 = r1.f20839a
            x1.f0 r2 = r2.u()
            if (r2 == 0) goto L15
            x1.b1 r2 = r2.L
            x1.r r2 = r2.f20841c
            goto L16
        L15:
            r2 = 0
        L16:
            r3.f20945w = r2
            r1.f20842d = r3
            return
        L1b:
            int r0 = r2.f21821i
            r0 = r0 & 2
            if (r0 == 0) goto L22
            goto L28
        L22:
            r2.j1(r3)
            y0.n r2 = r2.f21823k
            goto L2
        L28:
            return
    }

    public static y0.n b(y0.m r2, y0.n r3) {
            boolean r0 = r2 instanceof x1.x0
            if (r0 == 0) goto L11
            x1.x0 r2 = (x1.x0) r2
            y0.n r2 = r2.f()
            int r0 = x1.j1.f(r2)
            r2.f21821i = r0
            goto L24
        L11:
            x1.b r0 = new x1.b
            r0.<init>()
            int r1 = x1.j1.d(r2)
            r0.f21821i = r1
            r0.f20832u = r2
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r2 = r0
        L24:
            boolean r0 = r2.f21832t
            if (r0 == 0) goto L2d
            java.lang.String r0 = "A ModifierNodeElement cannot return an already attached node from create() "
            u1.a.b(r0)
        L2d:
            r0 = 1
            r2.f21827o = r0
            y0.n r0 = r3.f21824l
            if (r0 == 0) goto L38
            r0.f21823k = r2
            r2.f21824l = r0
        L38:
            r3.f21824l = r2
            r2.f21823k = r3
            return r2
    }

    public static y0.n c(y0.n r3) {
            boolean r0 = r3.f21832t
            if (r0 == 0) goto L18
            f.b0 r1 = x1.j1.f20968a
            if (r0 != 0) goto Ld
            java.lang.String r0 = "autoInvalidateRemovedNode called on unattached node"
            u1.a.b(r0)
        Ld:
            r0 = -1
            r1 = 2
            x1.j1.a(r3, r0, r1)
            r3.h1()
            r3.b1()
        L18:
            y0.n r0 = r3.f21824l
            y0.n r1 = r3.f21823k
            r2 = 0
            if (r0 == 0) goto L23
            r0.f21823k = r1
            r3.f21824l = r2
        L23:
            if (r1 == 0) goto L29
            r1.f21824l = r0
            r3.f21823k = r2
        L29:
            r1.getClass()
            return r1
    }

    public static void h(y0.m r2, y0.m r3, y0.n r4) {
            boolean r2 = r2 instanceof x1.x0
            r0 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r3 instanceof x1.x0
            if (r2 == 0) goto L1c
            x1.x0 r3 = (x1.x0) r3
            r4.getClass()
            r3.g(r4)
            boolean r2 = r4.f21832t
            if (r2 == 0) goto L19
            x1.j1.c(r4)
            return
        L19:
            r4.f21828p = r0
            return
        L1c:
            boolean r2 = r4 instanceof x1.b
            if (r2 == 0) goto L58
            r2 = r4
            x1.b r2 = (x1.b) r2
            boolean r1 = r2.f21832t
            if (r1 == 0) goto L3d
            if (r1 != 0) goto L2e
            java.lang.String r1 = "unInitializeModifier called on unattached node"
            u1.a.b(r1)
        L2e:
            int r1 = r2.f21821i
            r1 = r1 & 8
            if (r1 == 0) goto L3d
            x1.r1 r1 = x1.k.x(r2)
            y1.t r1 = (y1.t) r1
            r1.E()
        L3d:
            r2.f20832u = r3
            int r3 = x1.j1.d(r3)
            r2.f21821i = r3
            boolean r3 = r2.f21832t
            if (r3 == 0) goto L4d
            r3 = 0
            r2.k1(r3)
        L4d:
            boolean r2 = r4.f21832t
            if (r2 == 0) goto L55
            x1.j1.c(r4)
            return
        L55:
            r4.f21828p = r0
            return
        L58:
            java.lang.String r2 = "Unknown Modifier.Node type"
            u1.a.b(r2)
            return
    }

    public final boolean d(int r2) {
            r1 = this;
            y0.n r0 = r1.f20844f
            int r0 = r0.f21822j
            r2 = r2 & r0
            if (r2 == 0) goto L9
            r2 = 1
            return r2
        L9:
            r2 = 0
            return r2
    }

    public final void e() {
            r3 = this;
            y0.n r0 = r3.f20844f
        L2:
            if (r0 == 0) goto L2a
            r0.g1()
            boolean r1 = r0.f21827o
            if (r1 == 0) goto L1b
            f.b0 r1 = x1.j1.f20968a
            boolean r1 = r0.f21832t
            if (r1 != 0) goto L16
            java.lang.String r1 = "autoInvalidateInsertedNode called on unattached node"
            u1.a.b(r1)
        L16:
            r1 = -1
            r2 = 1
            x1.j1.a(r0, r1, r2)
        L1b:
            boolean r1 = r0.f21828p
            if (r1 == 0) goto L22
            x1.j1.c(r0)
        L22:
            r1 = 0
            r0.f21827o = r1
            r0.f21828p = r1
            y0.n r0 = r0.f21824l
            goto L2
        L2a:
            return
    }

    public final void f(int r32, j0.b r33, j0.b r34, y0.n r35, boolean r36) {
            r31 = this;
            r1 = r31
            x1.z0 r0 = r1.f20848j
            if (r0 != 0) goto L18
            x1.z0 r0 = new x1.z0
            r3 = r32
            r4 = r33
            r5 = r34
            r2 = r35
            r6 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r1.f20848j = r0
            goto L2c
        L18:
            r3 = r32
            r4 = r33
            r5 = r34
            r2 = r35
            r0.f21095a = r2
            r0.f21096b = r3
            r0.f21097c = r4
            r0.f21098d = r5
            r6 = r36
            r0.f21099e = r6
        L2c:
            x1.b1 r2 = r0.f21100f
            int r4 = r4.f6673i
            int r4 = r4 - r3
            int r5 = r5.f6673i
            int r5 = r5 - r3
            int r3 = r4 + r5
            r6 = 1
            int r3 = r3 + r6
            r7 = 2
            int r3 = r3 / r7
            i0.m0 r8 = new i0.m0
            int r9 = r3 * 3
            r8.<init>(r9)
            i0.m0 r9 = new i0.m0
            int r10 = r3 * 4
            r9.<init>(r10)
            r10 = 0
            r9.e(r10, r4, r10, r5)
            int r3 = r3 * r7
            int r3 = r3 + r6
            int[] r11 = new int[r3]
            int[] r12 = new int[r3]
            r13 = 5
            int[] r13 = new int[r13]
        L55:
            int r14 = r9.f5972b
            if (r14 == 0) goto L27b
            r32 = r7
            int[] r7 = r9.f5971a
            r33 = r10
            int r10 = r14 + (-1)
            r9.f5972b = r10
            r10 = r7[r10]
            r34 = 3
            int r15 = r14 + (-2)
            r9.f5972b = r15
            r15 = r7[r15]
            int r6 = r14 + (-3)
            r9.f5972b = r6
            r6 = r7[r6]
            int r14 = r14 + (-4)
            r9.f5972b = r14
            r7 = r7[r14]
            int r14 = r6 - r7
            r36 = r3
            int r3 = r10 - r15
            r16 = r11
            r11 = 1
            if (r14 < r11) goto L276
            if (r3 >= r11) goto L88
            goto L276
        L88:
            int r17 = r14 + r3
            int r17 = r17 + 1
            r35 = r11
            int r11 = r17 / 2
            int r17 = r36 / 2
            int r18 = r17 + 1
            r16[r18] = r7
            r12[r18] = r6
            r18 = r3
            r3 = r33
        L9c:
            if (r3 >= r11) goto L276
            int r19 = r14 - r18
            int r20 = java.lang.Math.abs(r19)
            r21 = r11
            r11 = r20 & 1
            r20 = r12
            r12 = r35
            if (r11 != r12) goto Lb0
            r11 = 1
            goto Lb2
        Lb0:
            r11 = r33
        Lb2:
            int r12 = -r3
            r22 = r11
            r11 = r12
        Lb6:
            r23 = 4
            if (r11 > r3) goto L148
            if (r11 == r12) goto Lde
            if (r11 == r3) goto Ld1
            int r24 = r11 + 1
            int r24 = r24 + r17
            r25 = r11
            r11 = r16[r24]
            int r24 = r25 + (-1)
            int r24 = r24 + r17
            r26 = r13
            r13 = r16[r24]
            if (r11 <= r13) goto Ld5
            goto Le2
        Ld1:
            r25 = r11
            r26 = r13
        Ld5:
            int r11 = r25 + (-1)
            int r11 = r11 + r17
            r11 = r16[r11]
            int r13 = r11 + 1
            goto Le9
        Lde:
            r25 = r11
            r26 = r13
        Le2:
            int r11 = r25 + 1
            int r11 = r11 + r17
            r11 = r16[r11]
            r13 = r11
        Le9:
            int r24 = r13 - r7
            int r24 = r24 + r15
            int r24 = r24 - r25
            if (r3 == 0) goto Lf4
            r27 = 1
            goto Lf6
        Lf4:
            r27 = r33
        Lf6:
            if (r13 != r11) goto Lfb
            r28 = 1
            goto Lfd
        Lfb:
            r28 = r33
        Lfd:
            r27 = r27 & r28
            int r27 = r24 - r27
            r30 = r24
            r24 = r11
            r11 = r30
        L107:
            if (r13 >= r6) goto L116
            if (r11 >= r10) goto L116
            boolean r28 = r0.a(r13, r11)
            if (r28 == 0) goto L116
            int r13 = r13 + 1
            int r11 = r11 + 1
            goto L107
        L116:
            int r28 = r17 + r25
            r16[r28] = r13
            if (r22 == 0) goto L13e
            r28 = r11
            int r11 = r19 - r25
            r29 = r14
            int r14 = r12 + 1
            if (r11 < r14) goto L140
            int r14 = r3 + (-1)
            if (r11 > r14) goto L140
            int r11 = r17 + r11
            r11 = r20[r11]
            if (r11 > r13) goto L140
            r26[r33] = r24
            r11 = 1
            r26[r11] = r27
            r26[r32] = r13
            r26[r34] = r28
            r26[r23] = r33
            r11 = 1
            goto L1d8
        L13e:
            r29 = r14
        L140:
            int r11 = r25 + 2
            r13 = r26
            r14 = r29
            goto Lb6
        L148:
            r26 = r13
            r29 = r14
            r11 = r19 & 1
            if (r11 != 0) goto L152
            r11 = 1
            goto L154
        L152:
            r11 = r33
        L154:
            r13 = r12
        L155:
            if (r13 > r3) goto L268
            if (r13 == r12) goto L177
            if (r13 == r3) goto L16c
            int r14 = r13 + 1
            int r14 = r14 + r17
            r14 = r20[r14]
            int r22 = r13 + (-1)
            int r22 = r22 + r17
            r24 = r11
            r11 = r20[r22]
            if (r14 >= r11) goto L16e
            goto L179
        L16c:
            r24 = r11
        L16e:
            int r11 = r13 + (-1)
            int r11 = r11 + r17
            r11 = r20[r11]
            int r14 = r11 + (-1)
            goto L180
        L177:
            r24 = r11
        L179:
            int r11 = r13 + 1
            int r11 = r11 + r17
            r11 = r20[r11]
            r14 = r11
        L180:
            int r22 = r6 - r14
            int r22 = r22 - r13
            int r22 = r10 - r22
            if (r3 == 0) goto L18b
            r25 = 1
            goto L18d
        L18b:
            r25 = r33
        L18d:
            if (r14 != r11) goto L192
            r27 = 1
            goto L194
        L192:
            r27 = r33
        L194:
            r25 = r25 & r27
            int r25 = r22 + r25
            r30 = r22
            r22 = r11
            r11 = r30
        L19e:
            if (r14 <= r7) goto L1b7
            if (r11 <= r15) goto L1b7
            r27 = r11
            int r11 = r14 + (-1)
            r28 = r13
            int r13 = r27 + (-1)
            boolean r11 = r0.a(r11, r13)
            if (r11 == 0) goto L1bb
            int r14 = r14 + (-1)
            int r11 = r27 + (-1)
            r13 = r28
            goto L19e
        L1b7:
            r27 = r11
            r28 = r13
        L1bb:
            int r13 = r17 + r28
            r20[r13] = r14
            if (r24 == 0) goto L262
            int r11 = r19 - r28
            if (r11 < r12) goto L262
            if (r11 > r3) goto L262
            int r11 = r17 + r11
            r11 = r16[r11]
            if (r11 < r14) goto L262
            r26[r33] = r14
            r11 = 1
            r26[r11] = r27
            r26[r32] = r22
            r26[r34] = r25
            r26[r23] = r11
        L1d8:
            r3 = r26[r32]
            r12 = r26[r33]
            int r3 = r3 - r12
            r12 = r26[r34]
            r13 = r26[r11]
            int r12 = r12 - r13
            int r3 = java.lang.Math.min(r3, r12)
            if (r3 <= 0) goto L243
            r3 = r26[r33]
            r12 = r26[r11]
            r11 = r26[r34]
            int r11 = r11 - r12
            r13 = r26[r32]
            int r13 = r13 - r3
            if (r11 == r13) goto L23b
            int r13 = java.lang.Math.min(r13, r11)
            r11 = r26[r23]
            if (r11 == 0) goto L1fe
            r14 = 1
            goto L200
        L1fe:
            r14 = r33
        L200:
            r17 = r26[r34]
            r18 = 1
            r19 = r26[r18]
            r35 = r3
            int r3 = r17 - r19
            r21 = r26[r32]
            r22 = r26[r33]
            r23 = r11
            int r11 = r21 - r22
            if (r3 <= r11) goto L217
            r3 = r18
            goto L219
        L217:
            r3 = r33
        L219:
            r3 = r3 | r14
            r3 = r3 ^ 1
            int r3 = r35 + r3
            if (r23 == 0) goto L223
            r11 = r18
            goto L225
        L223:
            r11 = r33
        L225:
            int r14 = r17 - r19
            r35 = r3
            int r3 = r21 - r22
            if (r14 <= r3) goto L230
            r3 = r18
            goto L232
        L230:
            r3 = r33
        L232:
            r3 = r3 ^ 1
            r3 = r3 | r11
            r3 = r3 ^ 1
            int r12 = r12 + r3
            r3 = r35
            goto L23f
        L23b:
            r35 = r3
            r18 = 1
        L23f:
            r8.d(r3, r12, r13)
            goto L245
        L243:
            r18 = r11
        L245:
            r3 = r26[r33]
            r11 = r26[r18]
            r9.e(r7, r3, r15, r11)
            r3 = r26[r32]
            r7 = r26[r34]
            r9.e(r3, r6, r7, r10)
        L253:
            r7 = r32
            r10 = r33
            r3 = r36
            r11 = r16
            r12 = r20
            r13 = r26
            r6 = 1
            goto L55
        L262:
            int r13 = r28 + 2
            r11 = r24
            goto L155
        L268:
            int r3 = r3 + 1
            r12 = r20
            r11 = r21
            r13 = r26
            r14 = r29
            r35 = 1
            goto L9c
        L276:
            r20 = r12
            r26 = r13
            goto L253
        L27b:
            r32 = r7
            r33 = r10
            r34 = 3
            int r3 = r8.f5972b
            int r6 = r3 % 3
            if (r6 != 0) goto L28a
        L287:
            r6 = r34
            goto L290
        L28a:
            java.lang.String r6 = "Array size not a multiple of 3"
            u1.a.b(r6)
            goto L287
        L290:
            if (r3 <= r6) goto L299
            int r3 = r3 - r6
            r6 = r33
            r8.f(r6, r3)
            goto L29b
        L299:
            r6 = r33
        L29b:
            r8.d(r4, r5, r6)
            r3 = r6
            r4 = r3
            r5 = r4
        L2a1:
            int r7 = r8.f5972b
            if (r3 >= r7) goto L385
            int[] r7 = r8.f5971a
            r9 = r7[r3]
            int r10 = r3 + 2
            r10 = r7[r10]
            int r9 = r9 - r10
            int r11 = r3 + 1
            r7 = r7[r11]
            int r7 = r7 - r10
            int r3 = r3 + 3
        L2b5:
            if (r4 >= r9) goto L2e4
            y0.n r11 = r0.f21095a
            y0.n r11 = r11.f21824l
            r11.getClass()
            int r12 = r11.f21821i
            r12 = r12 & 2
            if (r12 == 0) goto L2db
            x1.i1 r12 = r11.f21826n
            r12.getClass()
            x1.i1 r13 = r12.f20945w
            x1.i1 r12 = r12.f20944v
            r12.getClass()
            if (r13 == 0) goto L2d4
            r13.f20944v = r12
        L2d4:
            r12.f20945w = r13
            y0.n r13 = r0.f21095a
            a(r2, r13, r12)
        L2db:
            y0.n r11 = c(r11)
            r0.f21095a = r11
            int r4 = r4 + 1
            goto L2b5
        L2e4:
            if (r5 >= r7) goto L351
            int r9 = r0.f21096b
            int r9 = r9 + r5
            y0.n r11 = r0.f21095a
            j0.b r12 = r0.f21098d
            java.lang.Object[] r12 = r12.f6671g
            r9 = r12[r9]
            y0.m r9 = (y0.m) r9
            y0.n r9 = b(r9, r11)
            r0.f21095a = r9
            boolean r11 = r0.f21099e
            if (r11 == 0) goto L34b
            y0.n r9 = r9.f21824l
            r9.getClass()
            x1.i1 r9 = r9.f21826n
            r9.getClass()
            y0.n r11 = r0.f21095a
            x1.v r11 = x1.k.f(r11)
            if (r11 == 0) goto L329
            x1.x r12 = new x1.x
            x1.f0 r13 = r2.f20839a
            r12.<init>(r13, r11)
            y0.n r11 = r0.f21095a
            r11.j1(r12)
            y0.n r11 = r0.f21095a
            a(r2, r11, r12)
            x1.i1 r11 = r9.f20945w
            r12.f20945w = r11
            r12.f20944v = r9
            r9.f20945w = r12
            goto L32e
        L329:
            y0.n r11 = r0.f21095a
            r11.j1(r9)
        L32e:
            y0.n r9 = r0.f21095a
            r9.a1()
            y0.n r9 = r0.f21095a
            r9.g1()
            y0.n r9 = r0.f21095a
            f.b0 r11 = x1.j1.f20968a
            boolean r11 = r9.f21832t
            if (r11 != 0) goto L345
            java.lang.String r11 = "autoInvalidateInsertedNode called on unattached node"
            u1.a.b(r11)
        L345:
            r11 = -1
            r12 = 1
            x1.j1.a(r9, r11, r12)
            goto L34e
        L34b:
            r12 = 1
            r9.f21827o = r12
        L34e:
            int r5 = r5 + 1
            goto L2e4
        L351:
            r12 = 1
        L352:
            int r7 = r10 + (-1)
            if (r10 <= 0) goto L2a1
            y0.n r9 = r0.f21095a
            y0.n r9 = r9.f21824l
            r9.getClass()
            r0.f21095a = r9
            j0.b r9 = r0.f21097c
            int r10 = r0.f21096b
            int r11 = r10 + r4
            java.lang.Object[] r9 = r9.f6671g
            r9 = r9[r11]
            y0.m r9 = (y0.m) r9
            j0.b r11 = r0.f21098d
            int r10 = r10 + r5
            java.lang.Object[] r11 = r11.f6671g
            r10 = r11[r10]
            y0.m r10 = (y0.m) r10
            boolean r11 = gg.l.a(r9, r10)
            if (r11 != 0) goto L37f
            y0.n r11 = r0.f21095a
            h(r9, r10, r11)
        L37f:
            int r4 = r4 + 1
            int r5 = r5 + 1
            r10 = r7
            goto L352
        L385:
            x1.b2 r0 = r1.f20843e
            y0.n r0 = r0.f21823k
            r10 = r6
        L38a:
            if (r0 == 0) goto L398
            x1.a1 r2 = r1.f20840b
            if (r0 == r2) goto L398
            int r2 = r0.f21821i
            r10 = r10 | r2
            r0.f21822j = r10
            y0.n r0 = r0.f21823k
            goto L38a
        L398:
            return
    }

    public final void g() {
            r5 = this;
            x1.b2 r0 = r5.f20843e
            y0.n r0 = r0.f21823k
            x1.r r1 = r5.f20841c
        L6:
            x1.f0 r2 = r5.f20839a
            if (r0 == 0) goto L3b
            x1.v r3 = x1.k.f(r0)
            if (r3 == 0) goto L35
            x1.i1 r4 = r0.f21826n
            if (r4 == 0) goto L27
            x1.x r4 = (x1.x) r4
            x1.v r2 = r4.Y
            r4.U1(r3)
            if (r2 == r0) goto L2f
            x1.q1 r2 = r4.R
            if (r2 == 0) goto L2f
            y1.o1 r2 = (y1.o1) r2
            r2.c()
            goto L2f
        L27:
            x1.x r4 = new x1.x
            r4.<init>(r2, r3)
            r0.j1(r4)
        L2f:
            r1.f20945w = r4
            r4.f20944v = r1
            r1 = r4
            goto L38
        L35:
            r0.j1(r1)
        L38:
            y0.n r0 = r0.f21823k
            goto L6
        L3b:
            x1.f0 r0 = r2.u()
            if (r0 == 0) goto L46
            x1.b1 r0 = r0.L
            x1.r r0 = r0.f20841c
            goto L47
        L46:
            r0 = 0
        L47:
            r1.f20945w = r0
            r5.f20842d = r1
            return
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "["
            r0.<init>(r1)
            y0.n r1 = r5.f20844f
            java.lang.String r2 = "]"
            x1.b2 r3 = r5.f20843e
            if (r1 != r3) goto L13
            r0.append(r2)
            goto L2e
        L13:
            if (r1 == 0) goto L2e
            if (r1 == r3) goto L2e
            java.lang.String r4 = java.lang.String.valueOf(r1)
            r0.append(r4)
            y0.n r4 = r1.f21824l
            if (r4 != r3) goto L26
            r0.append(r2)
            goto L2e
        L26:
            java.lang.String r4 = ","
            r0.append(r4)
            y0.n r1 = r1.f21824l
            goto L13
        L2e:
            java.lang.String r0 = r0.toString()
            return r0
    }
}
