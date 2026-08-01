package p158f0;

import java.util.HashMap;
import p095T.C1311F;
import p095T.C1381q;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p179i4.AbstractC2352g;
import p186k.C2408E;
import p186k.C2409F;
import p186k.C2444z;

/* JADX INFO: renamed from: f0.s */
/* JADX INFO: loaded from: classes.dex */
public final class C2087s {

    /* JADX INFO: renamed from: a */
    public final InterfaceC1601c f6983a;

    /* JADX INFO: renamed from: b */
    public Object f6984b;

    /* JADX INFO: renamed from: c */
    public C2444z f6985c;

    /* JADX INFO: renamed from: j */
    public boolean f6992j;

    /* JADX INFO: renamed from: k */
    public int f6993k;

    /* JADX INFO: renamed from: d */
    public int f6986d = -1;

    /* JADX INFO: renamed from: e */
    public final C2408E f6987e = AbstractC2352g.m4201n();

    /* JADX INFO: renamed from: f */
    public final C2408E f6988f = new C2408E();

    /* JADX INFO: renamed from: g */
    public final C2409F f6989g = new C2409F();

    /* JADX INFO: renamed from: h */
    public final C1483e f6990h = new C1483e(new C1311F[16]);

    /* JADX INFO: renamed from: i */
    public final C1381q f6991i = new C1381q(1, this);

    /* JADX INFO: renamed from: l */
    public final C2408E f6994l = AbstractC2352g.m4201n();

    /* JADX INFO: renamed from: m */
    public final HashMap f6995m = new HashMap();

    public C2087s(InterfaceC1601c interfaceC1601c) {
        this.f6983a = interfaceC1601c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0219 A[PHI: r23
  0x0219: PHI (r23v19 boolean) = (r23v18 boolean), (r23v20 boolean) binds: [B:92:0x01f1, B:100:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a8 A[PHI: r23
  0x02a8: PHI (r23v12 boolean) = (r23v11 boolean), (r23v13 boolean) binds: [B:123:0x0280, B:131:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04fd A[EDGE_INSN: B:244:0x04f6->B:246:0x04fd BREAK  A[LOOP:20: B:230:0x04bc->B:243:0x04f3], PHI: r2
  0x04fd: PHI (r2v10 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v14 boolean) binds: [B:224:0x04a7, B:228:0x04b8, B:244:0x04f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x056e A[PHI: r0
  0x056e: PHI (r0v8 boolean) = (r0v7 boolean), (r0v9 boolean) binds: [B:265:0x0547, B:273:0x056c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e A[PHI: r23
  0x013e: PHI (r23v29 boolean) = (r23v28 boolean), (r23v30 boolean) binds: [B:51:0x010d, B:62:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m3861a(java.util.Set r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158f0.C2087s.m3861a(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3862b(java.lang.Object r21, int r22, java.lang.Object r23, p186k.C2444z r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.f6993k
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.m4363c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.f7900c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.f7899b
            r7[r4] = r1
            int[] r3 = r3.f7900c
            r3[r4] = r2
            boolean r3 = r1 instanceof p095T.C1311F
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            T.F r2 = (p095T.C1311F) r2
            T.E r2 = r2.m2413h()
            java.util.HashMap r3 = r0.f6995m
            java.lang.Object r7 = r2.f4678f
            r3.put(r1, r7)
            k.z r2 = r2.f4677e
            k.E r3 = r0.f6994l
            p179i4.AbstractC2352g.m4181D(r3, r1)
            java.lang.Object[] r7 = r2.f7899b
            long[] r2 = r2.f7898a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            f0.v r9 = (p158f0.InterfaceC2090v) r9
            boolean r5 = r9 instanceof p158f0.AbstractC2091w
            if (r5 == 0) goto L82
            r5 = r9
            f0.w r5 = (p158f0.AbstractC2091w) r5
            r5.m3870f(r4)
        L82:
            p179i4.AbstractC2352g.m4192e(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof p158f0.AbstractC2091w
            if (r2 == 0) goto L9d
            r2 = r1
            f0.w r2 = (p158f0.AbstractC2091w) r2
            r2.m3870f(r4)
        L9d:
            k.E r2 = r0.f6987e
            r3 = r23
            p179i4.AbstractC2352g.m4192e(r2, r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p158f0.C2087s.m3862b(java.lang.Object, int, java.lang.Object, k.z):void");
    }

    /* JADX INFO: renamed from: c */
    public final void m3863c(Object obj, Object obj2) {
        C2408E c2408e = this.f6987e;
        AbstractC2352g.m4180C(c2408e, obj2, obj);
        if (!(obj2 instanceof C1311F) || c2408e.m4268c(obj2)) {
            return;
        }
        AbstractC2352g.m4181D(this.f6994l, obj2);
        this.f6995m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3864d() {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p158f0.C2087s.m3864d():void");
    }
}
