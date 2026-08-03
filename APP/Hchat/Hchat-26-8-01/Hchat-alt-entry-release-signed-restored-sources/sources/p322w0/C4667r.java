package p322w0;

import java.util.HashMap;
import p069f.C0925b0;
import p069f.C0943k0;
import p069f.C0945l0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p117i0.C1832g0;
import p117i0.C1889w;
import p117i0.C1892x;
import p131j0.C2046b;
import p339x1.InterfaceC5644s1;

/* JADX INFO: renamed from: w0.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4667r {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1231l f15523a;

    /* JADX INFO: renamed from: b */
    public Object f15524b;

    /* JADX INFO: renamed from: c */
    public C0925b0 f15525c;

    /* JADX INFO: renamed from: j */
    public boolean f15532j;

    /* JADX INFO: renamed from: k */
    public int f15533k;

    /* JADX INFO: renamed from: d */
    public int f15526d = -1;

    /* JADX INFO: renamed from: e */
    public final C0943k0 f15527e = AbstractC1089i.m2781o();

    /* JADX INFO: renamed from: f */
    public final C0943k0 f15528f = new C0943k0();

    /* JADX INFO: renamed from: g */
    public final C0945l0 f15529g = new C0945l0();

    /* JADX INFO: renamed from: h */
    public final C2046b f15530h = new C2046b(new C1892x[16]);

    /* JADX INFO: renamed from: i */
    public final C1832g0 f15531i = new C1832g0(this, 1);

    /* JADX INFO: renamed from: l */
    public final C0943k0 f15534l = AbstractC1089i.m2781o();

    /* JADX INFO: renamed from: m */
    public final HashMap f15535m = new HashMap();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4667r(InterfaceC1231l interfaceC1231l) {
        this.f15523a = interfaceC1231l;
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[CONST, GOTO]}, finally: {[CONST, GOTO, IPUT] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /*  JADX ERROR: Type inference failed with stack overflow
        jadx.core.utils.exceptions.JadxOverflowException
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    /* JADX INFO: renamed from: a */
    public final boolean m9156a(java.util.Set r46) {
        /*
            r45 = this;
            r1 = r45
            r0 = r46
            i0.e r2 = p117i0.C1823e.f6052m
            boolean r3 = r0 instanceof p131j0.C2048d
            j0.b r4 = r1.f15530h
            r10 = 2
            r16 = 128(0x80, double:6.3E-322)
            f.k0 r5 = r1.f15534l
            java.util.HashMap r6 = r1.f15535m
            r18 = 255(0xff, double:1.26E-321)
            f.k0 r7 = r1.f15527e
            f.l0 r8 = r1.f15529g
            if (r3 == 0) goto L32c
            j0.d r0 = (p131j0.C2048d) r0
            f.l0 r0 = r0.f6894g
            java.lang.Object[] r3 = r0.f2976b
            long[] r0 = r0.f2975a
            r20 = 7
            int r9 = r0.length
            int r9 = r9 - r10
            if (r9 < 0) goto L323
            r11 = 0
            r12 = 0
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
        L2e:
            r23 = 8
            r13 = r0[r11]
            r46 = r11
            long r10 = ~r13
            long r10 = r10 << r20
            long r10 = r10 & r13
            long r10 = r10 & r21
            int r10 = (r10 > r21 ? 1 : (r10 == r21 ? 0 : -1))
            if (r10 == 0) goto L309
            int r11 = r46 - r9
            int r10 = ~r11
            int r10 = r10 >>> 31
            int r10 = 8 - r10
            r11 = 0
        L46:
            if (r11 >= r10) goto L2f4
            long r26 = r13 & r18
            int r26 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r26 >= 0) goto L2cc
            int r26 = r46 << 3
            int r26 = r26 + r11
            r15 = r3[r26]
            r26 = r0
            boolean r0 = r15 instanceof p322w0.AbstractC4671v
            if (r0 == 0) goto L68
            r0 = r15
            w0.v r0 = (p322w0.AbstractC4671v) r0
            r28 = r2
            r2 = 2
            boolean r0 = r0.m9164e(r2)
            if (r0 != 0) goto L6a
            goto L2d0
        L68:
            r28 = r2
        L6a:
            boolean r0 = r1.f15532j
            if (r0 != 0) goto L269
            boolean r0 = r5.m2316c(r15)
            if (r0 == 0) goto L269
            r0 = 1
            r1.f15532j = r0
            java.lang.Object r0 = r5.m2320g(r15)     // Catch: java.lang.Throwable -> L128
            if (r0 == 0) goto L254
            boolean r2 = r0 instanceof p069f.C0945l0     // Catch: java.lang.Throwable -> L128
            if (r2 == 0) goto L1d4
            f.l0 r0 = (p069f.C0945l0) r0     // Catch: java.lang.Throwable -> L128
            java.lang.Object[] r2 = r0.f2976b     // Catch: java.lang.Throwable -> L128
            long[] r0 = r0.f2975a     // Catch: java.lang.Throwable -> L128
            r29 = r2
            int r2 = r0.length     // Catch: java.lang.Throwable -> L128
            r25 = 2
            int r2 = r2 + (-2)
            if (r2 < 0) goto L1c1
            r30 = r0
            r31 = r11
            r32 = r12
            r0 = 0
        L97:
            r11 = r30[r0]     // Catch: java.lang.Throwable -> L128
            r33 = r13
            long r13 = ~r11     // Catch: java.lang.Throwable -> L128
            long r13 = r13 << r20
            long r13 = r13 & r11
            long r13 = r13 & r21
            int r13 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r13 == 0) goto L1a3
            int r13 = r0 - r2
            int r13 = ~r13     // Catch: java.lang.Throwable -> L128
            int r13 = r13 >>> 31
            int r13 = 8 - r13
            r14 = 0
        Lad:
            if (r14 >= r13) goto L191
            long r35 = r11 & r18
            int r35 = (r35 > r16 ? 1 : (r35 == r16 ? 0 : -1))
            if (r35 >= 0) goto L170
            int r35 = r0 << 3
            int r35 = r35 + r14
            r35 = r29[r35]     // Catch: java.lang.Throwable -> L128
            r36 = r3
            r3 = r35
            i0.x r3 = (p117i0.C1892x) r3     // Catch: java.lang.Throwable -> L128
            r3.getClass()     // Catch: java.lang.Throwable -> L128
            r37 = r11
            java.lang.Object r11 = r6.get(r3)     // Catch: java.lang.Throwable -> L128
            i0.e r12 = r3.f6285i     // Catch: java.lang.Throwable -> L128
            if (r12 != 0) goto Ld0
            r12 = r28
        Ld0:
            r35 = r14
            i0.w r14 = r3.m4653h()     // Catch: java.lang.Throwable -> L128
            java.lang.Object r14 = r14.f6270f     // Catch: java.lang.Throwable -> L128
            boolean r11 = r12.m4460b(r14, r11)     // Catch: java.lang.Throwable -> L128
            if (r11 != 0) goto L162
            java.lang.Object r3 = r7.m2320g(r3)     // Catch: java.lang.Throwable -> L128
            if (r3 == 0) goto L14b
            boolean r11 = r3 instanceof p069f.C0945l0     // Catch: java.lang.Throwable -> L128
            if (r11 == 0) goto L154
            f.l0 r3 = (p069f.C0945l0) r3     // Catch: java.lang.Throwable -> L128
            java.lang.Object[] r11 = r3.f2976b     // Catch: java.lang.Throwable -> L128
            long[] r3 = r3.f2975a     // Catch: java.lang.Throwable -> L128
            int r12 = r3.length     // Catch: java.lang.Throwable -> L128
            r25 = 2
            int r12 = r12 + (-2)
            if (r12 < 0) goto L14b
            r39 = r9
            r40 = r10
            r14 = 0
        Lfa:
            r9 = r3[r14]     // Catch: java.lang.Throwable -> L128
            r41 = r5
            r42 = r6
            long r5 = ~r9     // Catch: java.lang.Throwable -> L128
            long r5 = r5 << r20
            long r5 = r5 & r9
            long r5 = r5 & r21
            int r5 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r5 == 0) goto L13c
            int r5 = r14 - r12
            int r5 = ~r5     // Catch: java.lang.Throwable -> L128
            int r5 = r5 >>> 31
            int r5 = 8 - r5
            r6 = 0
        L112:
            if (r6 >= r5) goto L135
            long r43 = r9 & r18
            int r43 = (r43 > r16 ? 1 : (r43 == r16 ? 0 : -1))
            if (r43 >= 0) goto L12c
            int r32 = r14 << 3
            int r32 = r32 + r6
            r43 = r3
            r3 = r11[r32]     // Catch: java.lang.Throwable -> L128
            r8.m2328a(r3)     // Catch: java.lang.Throwable -> L128
            r32 = 1
            goto L12e
        L128:
            r0 = move-exception
            r3 = 0
            goto L266
        L12c:
            r43 = r3
        L12e:
            long r9 = r9 >> r23
            int r6 = r6 + 1
            r3 = r43
            goto L112
        L135:
            r43 = r3
            r3 = r23
            if (r5 != r3) goto L16d
            goto L13e
        L13c:
            r43 = r3
        L13e:
            if (r14 == r12) goto L16d
            int r14 = r14 + 1
            r5 = r41
            r6 = r42
            r3 = r43
            r23 = 8
            goto Lfa
        L14b:
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            goto L16d
        L154:
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r8.m2328a(r3)     // Catch: java.lang.Throwable -> L128
            r32 = 1
            goto L16d
        L162:
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r4.m5056b(r3)     // Catch: java.lang.Throwable -> L128
        L16d:
            r3 = 8
            goto L17f
        L170:
            r36 = r3
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r37 = r11
            r35 = r14
            goto L16d
        L17f:
            long r11 = r37 >> r3
            int r14 = r35 + 1
            r23 = r3
            r3 = r36
            r9 = r39
            r10 = r40
            r5 = r41
            r6 = r42
            goto Lad
        L191:
            r36 = r3
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r3 = r23
            if (r13 != r3) goto L1a0
            goto L1ad
        L1a0:
            r12 = r32
            goto L1cf
        L1a3:
            r36 = r3
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
        L1ad:
            if (r0 == r2) goto L1a0
            int r0 = r0 + 1
            r13 = r33
            r3 = r36
            r9 = r39
            r10 = r40
            r5 = r41
            r6 = r42
            r23 = 8
            goto L97
        L1c1:
            r36 = r3
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r31 = r11
            r33 = r13
        L1cf:
            r2 = r42
        L1d1:
            r3 = 0
            goto L263
        L1d4:
            r36 = r3
            r41 = r5
            r42 = r6
            r39 = r9
            r40 = r10
            r31 = r11
            r33 = r13
            i0.x r0 = (p117i0.C1892x) r0     // Catch: java.lang.Throwable -> L128
            r2 = r42
            java.lang.Object r3 = r2.get(r0)     // Catch: java.lang.Throwable -> L128
            i0.e r5 = r0.f6285i     // Catch: java.lang.Throwable -> L128
            if (r5 != 0) goto L1f0
            r5 = r28
        L1f0:
            i0.w r6 = r0.m4653h()     // Catch: java.lang.Throwable -> L128
            java.lang.Object r6 = r6.f6270f     // Catch: java.lang.Throwable -> L128
            boolean r3 = r5.m4460b(r6, r3)     // Catch: java.lang.Throwable -> L128
            if (r3 != 0) goto L24f
            java.lang.Object r0 = r7.m2320g(r0)     // Catch: java.lang.Throwable -> L128
            if (r0 == 0) goto L1d1
            boolean r3 = r0 instanceof p069f.C0945l0     // Catch: java.lang.Throwable -> L128
            if (r3 == 0) goto L24a
            f.l0 r0 = (p069f.C0945l0) r0     // Catch: java.lang.Throwable -> L128
            java.lang.Object[] r3 = r0.f2976b     // Catch: java.lang.Throwable -> L128
            long[] r0 = r0.f2975a     // Catch: java.lang.Throwable -> L128
            int r5 = r0.length     // Catch: java.lang.Throwable -> L128
            r25 = 2
            int r5 = r5 + (-2)
            if (r5 < 0) goto L1d1
            r6 = 0
        L214:
            r9 = r0[r6]     // Catch: java.lang.Throwable -> L128
            long r13 = ~r9     // Catch: java.lang.Throwable -> L128
            long r13 = r13 << r20
            long r13 = r13 & r9
            long r13 = r13 & r21
            int r11 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r11 == 0) goto L245
            int r11 = r6 - r5
            int r11 = ~r11     // Catch: java.lang.Throwable -> L128
            int r11 = r11 >>> 31
            r23 = 8
            int r13 = 8 - r11
            r11 = 0
        L22a:
            if (r11 >= r13) goto L241
            long r29 = r9 & r18
            int r14 = (r29 > r16 ? 1 : (r29 == r16 ? 0 : -1))
            if (r14 >= 0) goto L23b
            int r12 = r6 << 3
            int r12 = r12 + r11
            r12 = r3[r12]     // Catch: java.lang.Throwable -> L128
            r8.m2328a(r12)     // Catch: java.lang.Throwable -> L128
            r12 = 1
        L23b:
            r14 = 8
            long r9 = r9 >> r14
            int r11 = r11 + 1
            goto L22a
        L241:
            r14 = 8
            if (r13 != r14) goto L1d1
        L245:
            if (r6 == r5) goto L1d1
            int r6 = r6 + 1
            goto L214
        L24a:
            r8.m2328a(r0)     // Catch: java.lang.Throwable -> L128
            r12 = 1
            goto L1d1
        L24f:
            r4.m5056b(r0)     // Catch: java.lang.Throwable -> L128
            goto L1d1
        L254:
            r36 = r3
            r41 = r5
            r2 = r6
            r39 = r9
            r40 = r10
            r31 = r11
            r33 = r13
            goto L1d1
        L263:
            r1.f15532j = r3
            goto L276
        L266:
            r1.f15532j = r3
            throw r0
        L269:
            r36 = r3
            r41 = r5
            r2 = r6
            r39 = r9
            r40 = r10
            r31 = r11
            r33 = r13
        L276:
            java.lang.Object r0 = r7.m2320g(r15)
            if (r0 == 0) goto L2c9
            boolean r3 = r0 instanceof p069f.C0945l0
            if (r3 == 0) goto L2c5
            f.l0 r0 = (p069f.C0945l0) r0
            java.lang.Object[] r3 = r0.f2976b
            long[] r0 = r0.f2975a
            int r5 = r0.length
            r25 = 2
            int r5 = r5 + (-2)
            if (r5 < 0) goto L2c9
            r6 = 0
        L28e:
            r9 = r0[r6]
            long r13 = ~r9
            long r13 = r13 << r20
            long r13 = r13 & r9
            long r13 = r13 & r21
            int r11 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r11 == 0) goto L2c0
            int r11 = r6 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            r23 = 8
            int r13 = 8 - r11
            r10 = r9
            r9 = 0
        L2a5:
            if (r9 >= r13) goto L2bc
            long r14 = r10 & r18
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L2b6
            int r12 = r6 << 3
            int r12 = r12 + r9
            r12 = r3[r12]
            r8.m2328a(r12)
            r12 = 1
        L2b6:
            r14 = 8
            long r10 = r10 >> r14
            int r9 = r9 + 1
            goto L2a5
        L2bc:
            r14 = 8
            if (r13 != r14) goto L2c9
        L2c0:
            if (r6 == r5) goto L2c9
            int r6 = r6 + 1
            goto L28e
        L2c5:
            r8.m2328a(r0)
            r12 = 1
        L2c9:
            r14 = 8
            goto L2de
        L2cc:
            r26 = r0
            r28 = r2
        L2d0:
            r36 = r3
            r41 = r5
            r2 = r6
            r39 = r9
            r40 = r10
            r31 = r11
            r33 = r13
            goto L2c9
        L2de:
            long r5 = r33 >> r14
            int r11 = r31 + 1
            r23 = r14
            r0 = r26
            r3 = r36
            r9 = r39
            r10 = r40
            r13 = r5
            r5 = r41
            r6 = r2
            r2 = r28
            goto L46
        L2f4:
            r26 = r0
            r28 = r2
            r36 = r3
            r41 = r5
            r2 = r6
            r39 = r9
            r13 = r10
            r14 = r23
            if (r13 != r14) goto L329
            r9 = r39
        L306:
            r15 = r46
            goto L313
        L309:
            r26 = r0
            r28 = r2
            r36 = r3
            r41 = r5
            r2 = r6
            goto L306
        L313:
            if (r15 == r9) goto L329
            int r11 = r15 + 1
            r6 = r2
            r0 = r26
            r2 = r28
            r3 = r36
            r5 = r41
            r10 = 2
            goto L2e
        L323:
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r12 = 0
        L329:
            r5 = 0
            goto L591
        L32c:
            r28 = r2
            r41 = r5
            r2 = r6
            r20 = 7
            r21 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
        L33f:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L58e
            java.lang.Object r5 = r0.next()
            boolean r6 = r5 instanceof p322w0.AbstractC4671v
            if (r6 == 0) goto L35c
            r6 = r5
            w0.v r6 = (p322w0.AbstractC4671v) r6
            r9 = 2
            boolean r6 = r6.m9164e(r9)
            if (r6 != 0) goto L35c
            r46 = r0
            r5 = 0
            goto L58a
        L35c:
            boolean r6 = r1.f15532j
            if (r6 != 0) goto L530
            r6 = r41
            boolean r9 = r6.m2316c(r5)
            if (r9 == 0) goto L52e
            r9 = 1
            r1.f15532j = r9
            java.lang.Object r10 = r6.m2320g(r5)     // Catch: java.lang.Throwable -> L41a
            if (r10 == 0) goto L51d
            boolean r11 = r10 instanceof p069f.C0945l0     // Catch: java.lang.Throwable -> L41a
            if (r11 == 0) goto L49d
            f.l0 r10 = (p069f.C0945l0) r10     // Catch: java.lang.Throwable -> L41a
            java.lang.Object[] r11 = r10.f2976b     // Catch: java.lang.Throwable -> L41a
            long[] r10 = r10.f2975a     // Catch: java.lang.Throwable -> L41a
            int r12 = r10.length     // Catch: java.lang.Throwable -> L41a
            r25 = 2
            int r12 = r12 + (-2)
            if (r12 < 0) goto L51d
            r13 = r3
            r3 = 0
        L384:
            r14 = r10[r3]     // Catch: java.lang.Throwable -> L41a
            r26 = r10
            long r9 = ~r14     // Catch: java.lang.Throwable -> L41a
            long r9 = r9 << r20
            long r9 = r9 & r14
            long r9 = r9 & r21
            int r9 = (r9 > r21 ? 1 : (r9 == r21 ? 0 : -1))
            if (r9 == 0) goto L481
            int r9 = r3 - r12
            int r9 = ~r9     // Catch: java.lang.Throwable -> L41a
            int r9 = r9 >>> 31
            r23 = 8
            int r9 = 8 - r9
            r10 = 0
        L39c:
            if (r10 >= r9) goto L472
            long r29 = r14 & r18
            int r29 = (r29 > r16 ? 1 : (r29 == r16 ? 0 : -1))
            if (r29 >= 0) goto L456
            int r29 = r3 << 3
            int r29 = r29 + r10
            r29 = r11[r29]     // Catch: java.lang.Throwable -> L41a
            r46 = r0
            r0 = r29
            i0.x r0 = (p117i0.C1892x) r0     // Catch: java.lang.Throwable -> L41a
            r0.getClass()     // Catch: java.lang.Throwable -> L41a
            r41 = r6
            java.lang.Object r6 = r2.get(r0)     // Catch: java.lang.Throwable -> L41a
            r29 = r10
            i0.e r10 = r0.f6285i     // Catch: java.lang.Throwable -> L41a
            if (r10 != 0) goto L3c1
            r10 = r28
        L3c1:
            r30 = r11
            i0.w r11 = r0.m4653h()     // Catch: java.lang.Throwable -> L41a
            java.lang.Object r11 = r11.f6270f     // Catch: java.lang.Throwable -> L41a
            boolean r6 = r10.m4460b(r11, r6)     // Catch: java.lang.Throwable -> L41a
            if (r6 != 0) goto L44c
            java.lang.Object r0 = r7.m2320g(r0)     // Catch: java.lang.Throwable -> L41a
            if (r0 == 0) goto L445
            boolean r6 = r0 instanceof p069f.C0945l0     // Catch: java.lang.Throwable -> L41a
            if (r6 == 0) goto L43c
            f.l0 r0 = (p069f.C0945l0) r0     // Catch: java.lang.Throwable -> L41a
            java.lang.Object[] r6 = r0.f2976b     // Catch: java.lang.Throwable -> L41a
            long[] r0 = r0.f2975a     // Catch: java.lang.Throwable -> L41a
            int r10 = r0.length     // Catch: java.lang.Throwable -> L41a
            r25 = 2
            int r10 = r10 + (-2)
            if (r10 < 0) goto L445
            r31 = r14
            r11 = 0
            r15 = r13
        L3ea:
            r13 = r0[r11]     // Catch: java.lang.Throwable -> L41a
            r33 = r5
            r34 = r6
            long r5 = ~r13     // Catch: java.lang.Throwable -> L41a
            long r5 = r5 << r20
            long r5 = r5 & r13
            long r5 = r5 & r21
            int r5 = (r5 > r21 ? 1 : (r5 == r21 ? 0 : -1))
            if (r5 == 0) goto L42d
            int r5 = r11 - r10
            int r5 = ~r5     // Catch: java.lang.Throwable -> L41a
            int r5 = r5 >>> 31
            r23 = 8
            int r5 = 8 - r5
            r6 = 0
        L404:
            if (r6 >= r5) goto L424
            long r35 = r13 & r18
            int r35 = (r35 > r16 ? 1 : (r35 == r16 ? 0 : -1))
            if (r35 >= 0) goto L415
            int r15 = r11 << 3
            int r15 = r15 + r6
            r15 = r34[r15]     // Catch: java.lang.Throwable -> L41a
            r8.m2328a(r15)     // Catch: java.lang.Throwable -> L41a
            r15 = 1
        L415:
            r35 = r0
            r0 = 8
            goto L41e
        L41a:
            r0 = move-exception
            r5 = 0
            goto L52b
        L41e:
            long r13 = r13 >> r0
            int r6 = r6 + 1
            r0 = r35
            goto L404
        L424:
            r35 = r0
            r0 = 8
            if (r5 != r0) goto L42b
            goto L42f
        L42b:
            r0 = r15
            goto L44a
        L42d:
            r35 = r0
        L42f:
            if (r11 == r10) goto L43a
            int r11 = r11 + 1
            r5 = r33
            r6 = r34
            r0 = r35
            goto L3ea
        L43a:
            r13 = r15
            goto L449
        L43c:
            r33 = r5
            r31 = r14
            r8.m2328a(r0)     // Catch: java.lang.Throwable -> L41a
            r0 = 1
            goto L44a
        L445:
            r33 = r5
            r31 = r14
        L449:
            r0 = r13
        L44a:
            r13 = r0
            goto L453
        L44c:
            r33 = r5
            r31 = r14
            r4.m5056b(r0)     // Catch: java.lang.Throwable -> L41a
        L453:
            r14 = 8
            goto L463
        L456:
            r46 = r0
            r33 = r5
            r41 = r6
            r29 = r10
            r30 = r11
            r31 = r14
            goto L453
        L463:
            long r5 = r31 >> r14
            int r10 = r29 + 1
            r0 = r46
            r14 = r5
            r11 = r30
            r5 = r33
            r6 = r41
            goto L39c
        L472:
            r46 = r0
            r33 = r5
            r41 = r6
            r30 = r11
            r14 = 8
            if (r9 != r14) goto L47f
            goto L489
        L47f:
            r3 = r13
            goto L49a
        L481:
            r46 = r0
            r33 = r5
            r41 = r6
            r30 = r11
        L489:
            if (r3 == r12) goto L47f
            int r3 = r3 + 1
            r0 = r46
            r10 = r26
            r11 = r30
            r5 = r33
            r6 = r41
            r9 = 1
            goto L384
        L49a:
            r5 = 0
            goto L525
        L49d:
            r46 = r0
            r33 = r5
            r41 = r6
            i0.x r10 = (p117i0.C1892x) r10     // Catch: java.lang.Throwable -> L41a
            java.lang.Object r0 = r2.get(r10)     // Catch: java.lang.Throwable -> L41a
            i0.e r5 = r10.f6285i     // Catch: java.lang.Throwable -> L41a
            if (r5 != 0) goto L4af
            r5 = r28
        L4af:
            i0.w r6 = r10.m4653h()     // Catch: java.lang.Throwable -> L41a
            java.lang.Object r6 = r6.f6270f     // Catch: java.lang.Throwable -> L41a
            boolean r0 = r5.m4460b(r6, r0)     // Catch: java.lang.Throwable -> L41a
            if (r0 != 0) goto L518
            java.lang.Object r0 = r7.m2320g(r10)     // Catch: java.lang.Throwable -> L41a
            if (r0 == 0) goto L515
            boolean r5 = r0 instanceof p069f.C0945l0     // Catch: java.lang.Throwable -> L41a
            if (r5 == 0) goto L510
            f.l0 r0 = (p069f.C0945l0) r0     // Catch: java.lang.Throwable -> L41a
            java.lang.Object[] r5 = r0.f2976b     // Catch: java.lang.Throwable -> L41a
            long[] r0 = r0.f2975a     // Catch: java.lang.Throwable -> L41a
            int r6 = r0.length     // Catch: java.lang.Throwable -> L41a
            r25 = 2
            int r6 = r6 + (-2)
            if (r6 < 0) goto L515
            r9 = r3
            r3 = 0
        L4d4:
            r10 = r0[r3]     // Catch: java.lang.Throwable -> L41a
            long r12 = ~r10     // Catch: java.lang.Throwable -> L41a
            long r12 = r12 << r20
            long r12 = r12 & r10
            long r12 = r12 & r21
            int r12 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
            if (r12 == 0) goto L509
            int r12 = r3 - r6
            int r12 = ~r12     // Catch: java.lang.Throwable -> L41a
            int r12 = r12 >>> 31
            r23 = 8
            int r13 = 8 - r12
            r11 = r10
            r10 = 0
        L4eb:
            if (r10 >= r13) goto L502
            long r14 = r11 & r18
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L4fc
            int r9 = r3 << 3
            int r9 = r9 + r10
            r9 = r5[r9]     // Catch: java.lang.Throwable -> L41a
            r8.m2328a(r9)     // Catch: java.lang.Throwable -> L41a
            r9 = 1
        L4fc:
            r14 = 8
            long r11 = r11 >> r14
            int r10 = r10 + 1
            goto L4eb
        L502:
            r14 = 8
            if (r13 != r14) goto L507
            goto L509
        L507:
            r0 = r9
            goto L516
        L509:
            if (r3 == r6) goto L50e
            int r3 = r3 + 1
            goto L4d4
        L50e:
            r3 = r9
            goto L515
        L510:
            r8.m2328a(r0)     // Catch: java.lang.Throwable -> L41a
            r0 = 1
            goto L516
        L515:
            r0 = r3
        L516:
            r3 = r0
            goto L49a
        L518:
            r4.m5056b(r10)     // Catch: java.lang.Throwable -> L41a
            goto L49a
        L51d:
            r46 = r0
            r33 = r5
            r41 = r6
            goto L49a
        L525:
            r1.f15532j = r5
        L527:
            r0 = r3
            r3 = r33
            goto L536
        L52b:
            r1.f15532j = r5
            throw r0
        L52e:
            r41 = r6
        L530:
            r46 = r0
            r33 = r5
            r5 = 0
            goto L527
        L536:
            java.lang.Object r3 = r7.m2320g(r3)
            if (r3 == 0) goto L589
            boolean r6 = r3 instanceof p069f.C0945l0
            if (r6 == 0) goto L585
            f.l0 r3 = (p069f.C0945l0) r3
            java.lang.Object[] r6 = r3.f2976b
            long[] r3 = r3.f2975a
            int r9 = r3.length
            r25 = 2
            int r9 = r9 + (-2)
            if (r9 < 0) goto L589
            r10 = r5
        L54e:
            r11 = r3[r10]
            long r13 = ~r11
            long r13 = r13 << r20
            long r13 = r13 & r11
            long r13 = r13 & r21
            int r13 = (r13 > r21 ? 1 : (r13 == r21 ? 0 : -1))
            if (r13 == 0) goto L580
            int r13 = r10 - r9
            int r13 = ~r13
            int r13 = r13 >>> 31
            r23 = 8
            int r13 = 8 - r13
            r14 = r11
            r11 = r5
        L565:
            if (r11 >= r13) goto L57c
            long r26 = r14 & r18
            int r12 = (r26 > r16 ? 1 : (r26 == r16 ? 0 : -1))
            if (r12 >= 0) goto L576
            int r0 = r10 << 3
            int r0 = r0 + r11
            r0 = r6[r0]
            r8.m2328a(r0)
            r0 = 1
        L576:
            r12 = 8
            long r14 = r14 >> r12
            int r11 = r11 + 1
            goto L565
        L57c:
            r12 = 8
            if (r13 != r12) goto L589
        L580:
            if (r10 == r9) goto L589
            int r10 = r10 + 1
            goto L54e
        L585:
            r8.m2328a(r3)
            r0 = 1
        L589:
            r3 = r0
        L58a:
            r0 = r46
            goto L33f
        L58e:
            r12 = r3
            goto L329
        L591:
            boolean r0 = r1.f15532j
            if (r0 != 0) goto L68d
            int r0 = r4.f6893i
            if (r0 == 0) goto L68d
            java.lang.Object[] r2 = r4.f6891g
            r3 = r5
        L59c:
            if (r3 >= r0) goto L688
            r6 = r2[r3]
            i0.x r6 = (p117i0.C1892x) r6
            w0.f r8 = p322w0.AbstractC4662m.m9129j()
            long r8 = r8.mo9109g()
            int r8 = java.lang.Long.hashCode(r8)
            java.lang.Object r9 = r7.m2320g(r6)
            if (r9 == 0) goto L672
            boolean r10 = r9 instanceof p069f.C0945l0
            f.k0 r11 = r1.f15528f
            if (r10 == 0) goto L652
            f.l0 r9 = (p069f.C0945l0) r9
            java.lang.Object[] r10 = r9.f2976b
            long[] r9 = r9.f2975a
            int r13 = r9.length
            r25 = 2
            int r13 = r13 + (-2)
            if (r13 < 0) goto L648
            r14 = r5
            r46 = r6
        L5ca:
            r5 = r9[r14]
            r15 = r2
            r24 = r3
            long r2 = ~r5
            long r2 = r2 << r20
            long r2 = r2 & r5
            long r2 = r2 & r21
            int r2 = (r2 > r21 ? 1 : (r2 == r21 ? 0 : -1))
            if (r2 == 0) goto L632
            int r2 = r14 - r13
            int r2 = ~r2
            int r2 = r2 >>> 31
            r23 = 8
            int r2 = 8 - r2
            r3 = 0
        L5e3:
            if (r3 >= r2) goto L627
            long r28 = r5 & r18
            int r26 = (r28 > r16 ? 1 : (r28 == r16 ? 0 : -1))
            if (r26 >= 0) goto L613
            int r26 = r14 << 3
            int r26 = r26 + r3
            r28 = r0
            r0 = r10[r26]
            java.lang.Object r26 = r11.m2320g(r0)
            f.b0 r26 = (p069f.C0925b0) r26
            r29 = r3
            if (r26 != 0) goto L60a
            f.b0 r3 = new f.b0
            r3.<init>()
            r11.m2326m(r0, r3)
        L605:
            r26 = r4
            r4 = r46
            goto L60d
        L60a:
            r3 = r26
            goto L605
        L60d:
            r1.m9157b(r4, r8, r0, r3)
        L610:
            r3 = 8
            goto L61c
        L613:
            r28 = r0
            r29 = r3
            r26 = r4
            r4 = r46
            goto L610
        L61c:
            long r5 = r5 >> r3
            int r0 = r29 + 1
            r3 = r0
            r46 = r4
            r4 = r26
            r0 = r28
            goto L5e3
        L627:
            r28 = r0
            r26 = r4
            r3 = 8
            r4 = r46
            if (r2 != r3) goto L67d
            goto L63a
        L632:
            r28 = r0
            r26 = r4
            r3 = 8
            r4 = r46
        L63a:
            if (r14 == r13) goto L67d
            int r14 = r14 + 1
            r46 = r4
            r2 = r15
            r3 = r24
            r4 = r26
            r0 = r28
            goto L5ca
        L648:
            r28 = r0
            r15 = r2
            r24 = r3
            r26 = r4
            r3 = 8
            goto L67d
        L652:
            r28 = r0
            r15 = r2
            r24 = r3
            r26 = r4
            r4 = r6
            r3 = 8
            r25 = 2
            java.lang.Object r0 = r11.m2320g(r9)
            f.b0 r0 = (p069f.C0925b0) r0
            if (r0 != 0) goto L66e
            f.b0 r0 = new f.b0
            r0.<init>()
            r11.m2326m(r9, r0)
        L66e:
            r1.m9157b(r4, r8, r9, r0)
            goto L67d
        L672:
            r28 = r0
            r15 = r2
            r24 = r3
            r26 = r4
            r3 = 8
            r25 = 2
        L67d:
            int r0 = r24 + 1
            r3 = r0
            r2 = r15
            r4 = r26
            r0 = r28
            r5 = 0
            goto L59c
        L688:
            r26 = r4
            r26.m5061g()
        L68d:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p322w0.C4667r.m9156a(java.util.Set):boolean");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9157b(Object obj, int i9, Object obj2, C0925b0 c0925b0) {
        int i10;
        if (this.f15533k > 0) {
            return;
        }
        int iM2269c = c0925b0.m2269c(obj);
        if (iM2269c < 0) {
            iM2269c = ~iM2269c;
            i10 = -1;
        } else {
            i10 = c0925b0.f2896c[iM2269c];
        }
        c0925b0.f2895b[iM2269c] = obj;
        c0925b0.f2896c[iM2269c] = i9;
        if ((obj instanceof C1892x) && i10 != i9) {
            C1889w c1889wM4653h = ((C1892x) obj).m4653h();
            this.f15535m.put(obj, c1889wM4653h.f6270f);
            C0925b0 c0925b02 = c1889wM4653h.f6269e;
            C0943k0 c0943k0 = this.f15534l;
            AbstractC1089i.m2799x0(c0943k0, obj);
            Object[] objArr = c0925b02.f2895b;
            long[] jArr = c0925b02.f2894a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i11 = 0;
                while (true) {
                    long j3 = jArr[i11];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i12 = 8 - ((~(i11 - length)) >>> 31);
                        for (int i13 = 0; i13 < i12; i13++) {
                            if ((j3 & 255) < 128) {
                                InterfaceC4670u interfaceC4670u = (InterfaceC4670u) objArr[(i11 << 3) + i13];
                                if (interfaceC4670u instanceof AbstractC4671v) {
                                    ((AbstractC4671v) interfaceC4670u).m9165f(2);
                                }
                                AbstractC1089i.m2760c(c0943k0, interfaceC4670u, obj);
                            }
                            j3 >>= 8;
                        }
                        if (i12 != 8) {
                            break;
                        } else if (i11 == length) {
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
            }
        }
        if (i10 == -1) {
            if (obj instanceof AbstractC4671v) {
                ((AbstractC4671v) obj).m9165f(2);
            }
            AbstractC1089i.m2760c(this.f15527e, obj, obj2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m9158c(Object obj, Object obj2) {
        C0943k0 c0943k0 = this.f15527e;
        AbstractC1089i.m2798w0(c0943k0, obj2, obj);
        if (!(obj2 instanceof C1892x) || c0943k0.m2316c(obj2)) {
            return;
        }
        AbstractC1089i.m2799x0(this.f15534l, obj2);
        this.f15535m.remove(obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m9159d() {
        long[] jArr;
        long[] jArr2;
        long j3;
        char c10;
        long j4;
        int i9;
        boolean z9;
        long j5;
        C0943k0 c0943k0 = this.f15528f;
        long[] jArr3 = c0943k0.f2968a;
        int length = jArr3.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr3[i10];
            char c11 = 7;
            long j11 = -9187201950435737472L;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j10 & 255) < 128) {
                        int i14 = (i10 << 3) + i13;
                        c10 = c11;
                        Object obj = c0943k0.f2969b[i14];
                        j4 = j11;
                        C0925b0 c0925b0 = (C0925b0) c0943k0.f2970c[i14];
                        obj.getClass();
                        boolean zMo9975L = ((InterfaceC5644s1) obj).mo9975L();
                        if (!zMo9975L) {
                            Object[] objArr = c0925b0.f2895b;
                            int[] iArr = c0925b0.f2896c;
                            long[] jArr4 = c0925b0.f2894a;
                            int i15 = i11;
                            int length2 = jArr4.length - 2;
                            if (length2 >= 0) {
                                jArr2 = jArr3;
                                j3 = j10;
                                int i16 = 0;
                                while (true) {
                                    long j12 = jArr4[i16];
                                    long[] jArr5 = jArr4;
                                    z9 = zMo9975L;
                                    if ((((~j12) << c10) & j12 & j4) != j4) {
                                        int i17 = 8 - ((~(i16 - length2)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j12 & 255) < 128) {
                                                int i19 = (i16 << 3) + i18;
                                                j5 = j12;
                                                Object obj2 = objArr[i19];
                                                int i20 = iArr[i19];
                                                m9158c(obj, obj2);
                                            } else {
                                                j5 = j12;
                                            }
                                            j12 = j5 >> i15;
                                        }
                                        if (i17 != i15) {
                                            break;
                                        }
                                        if (i16 == length2) {
                                            break;
                                        }
                                        i16++;
                                        zMo9975L = z9;
                                        jArr4 = jArr5;
                                        i15 = 8;
                                    }
                                }
                            } else {
                                jArr2 = jArr3;
                                j3 = j10;
                                z9 = zMo9975L;
                            }
                            if (!z9) {
                                c0943k0.m2325l(i14);
                            }
                            i9 = 8;
                        }
                    } else {
                        jArr2 = jArr3;
                        j3 = j10;
                        c10 = c11;
                        j4 = j11;
                        i9 = i11;
                    }
                    i13++;
                    i11 = i9;
                    j10 = j3 >> i9;
                    c11 = c10;
                    j11 = j4;
                    jArr3 = jArr2;
                }
                jArr = jArr3;
                if (i12 != i11) {
                    return;
                }
            } else {
                jArr = jArr3;
            }
            if (i10 == length) {
                return;
            }
            i10++;
            jArr3 = jArr;
        }
    }
}
