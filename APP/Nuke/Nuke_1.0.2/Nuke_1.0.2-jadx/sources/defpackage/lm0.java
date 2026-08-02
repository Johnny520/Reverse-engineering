package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lm0 extends w92 implements mn0 {
    public final /* synthetic */ int j;
    public int k;
    public Object l;
    public Object m;
    public final /* synthetic */ Object n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm0(Object obj, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.j = i;
        this.m = obj;
        this.n = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((lm0) p((t00) obj2, (yw2) obj)).r(a83Var);
            case 1:
                return ((lm0) p((t00) obj2, (yw2) obj)).r(a83Var);
            case 2:
                return ((lm0) p((t00) obj2, (vo2) obj)).r(a83Var);
            case 3:
                ((lm0) p((t00) obj2, (yw2) obj)).r(a83Var);
                return k20.h;
            default:
                return ((lm0) p((t00) obj2, (yw2) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.j;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                lm0 lm0Var = new lm0((a20) this.m, (mn0) obj2, t00Var, 0);
                lm0Var.l = obj;
                return lm0Var;
            case 1:
                lm0 lm0Var2 = new lm0((kz2) obj2, t00Var, 1);
                lm0Var2.l = obj;
                return lm0Var2;
            case 2:
                lm0 lm0Var3 = new lm0((xm0) obj2, t00Var, 2);
                lm0Var3.m = obj;
                return lm0Var3;
            case 3:
                lm0 lm0Var4 = new lm0((xk1) this.m, (xk1) obj2, t00Var, 3);
                lm0Var4.l = obj;
                return lm0Var4;
            default:
                lm0 lm0Var5 = new lm0((i12) this.m, (o72) obj2, t00Var, 4);
                lm0Var5.l = obj;
                return lm0Var5;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:120:0x0235 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:128:0x01e0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v10, resolved type: mn0 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: yw2 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: yw2 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v3, resolved type: yw2 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v35, resolved type: yw2 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v36, resolved type: yw2 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:112:0x021b A[Catch: CancellationException -> 0x0201, TRY_ENTER, TryCatch #0 {CancellationException -> 0x0201, blocks: (B:112:0x021b, B:115:0x0229, B:102:0x01fc, B:107:0x0209), top: B:128:0x01e0 }] */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:118:0x0232 -> B:110:0x0215). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:124:0x0244 -> B:110:0x0215). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a6 -> B:34:0x00aa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00fd -> B:53:0x0100). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0154 -> B:66:0x0155). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x01ac -> B:83:0x01b0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object r(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r17
            int r0 = r1.j
            i12 r2 = defpackage.i12.i
            i12 r3 = defpackage.i12.j
            r5 = 2
            a83 r6 = defpackage.a83.a
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            k20 r8 = defpackage.k20.h
            r9 = 1
            java.lang.Object r10 = r1.n
            r11 = 0
            switch(r0) {
                case 0: goto L1d8;
                case 1: goto L158;
                case 2: goto L123;
                case 3: goto Ldd;
                default: goto L16;
            }
        L16:
            o72 r10 = (defpackage.o72) r10
            int r0 = r1.k
            yc1 r2 = defpackage.yc1.a
            if (r0 == 0) goto L3d
            if (r0 == r9) goto L33
            if (r0 != r5) goto L2d
            java.lang.Object r0 = r1.l
            yw2 r0 = (defpackage.yw2) r0
            defpackage.fg1.T(r18)
            r4 = r18
            goto Laa
        L2d:
            defpackage.s.l(r7)
            r6 = r11
            goto Ldc
        L33:
            java.lang.Object r0 = r1.l
            yw2 r0 = (defpackage.yw2) r0
            defpackage.fg1.T(r18)
            r7 = r18
            goto L53
        L3d:
            defpackage.fg1.T(r18)
            java.lang.Object r0 = r1.l
            yw2 r0 = (defpackage.yw2) r0
        L44:
            java.lang.Object r7 = r1.m
            i12 r7 = (defpackage.i12) r7
            r1.l = r0
            r1.k = r9
            java.lang.Object r7 = r0.a(r7, r1)
            if (r7 != r8) goto L53
            goto La8
        L53:
            h12 r7 = (defpackage.h12) r7
            java.util.List r11 = r7.a
            int r12 = r11.size()
            r13 = 0
        L5c:
            if (r13 >= r12) goto Lce
            java.lang.Object r14 = r11.get(r13)
            o12 r14 = (defpackage.o12) r14
            boolean r14 = defpackage.tp0.p(r14)
            if (r14 != 0) goto Lca
            int r7 = r7.c
            if (r7 != r5) goto L74
            ad1 r0 = defpackage.ad1.a
            r10.i = r0
            goto Ldc
        L74:
            int r7 = r11.size()
            r12 = 0
        L79:
            if (r12 >= r7) goto L9d
            java.lang.Object r13 = r11.get(r12)
            o12 r13 = (defpackage.o12) r13
            boolean r14 = r13.b()
            if (r14 != 0) goto L9a
            zw2 r14 = r0.m
            long r14 = r14.E
            long r4 = r0.c()
            boolean r4 = defpackage.tp0.z(r13, r14, r4)
            if (r4 == 0) goto L96
            goto L9a
        L96:
            int r12 = r12 + 1
            r5 = 2
            goto L79
        L9a:
            r10.i = r2
            goto Ldc
        L9d:
            r1.l = r0
            r4 = 2
            r1.k = r4
            java.lang.Object r4 = r0.a(r3, r1)
            if (r4 != r8) goto Laa
        La8:
            r6 = r8
            goto Ldc
        Laa:
            h12 r4 = (defpackage.h12) r4
            java.util.List r4 = r4.a
            int r5 = r4.size()
            r7 = 0
        Lb3:
            if (r7 >= r5) goto Lc7
            java.lang.Object r11 = r4.get(r7)
            o12 r11 = (defpackage.o12) r11
            boolean r11 = r11.b()
            if (r11 == 0) goto Lc4
            r10.i = r2
            goto Ldc
        Lc4:
            int r7 = r7 + 1
            goto Lb3
        Lc7:
            r5 = 2
            goto L44
        Lca:
            int r13 = r13 + 1
            r5 = 2
            goto L5c
        Lce:
            zc1 r0 = new zc1
            r3 = 0
            java.lang.Object r1 = r11.get(r3)
            o12 r1 = (defpackage.o12) r1
            r0.<init>(r1)
            r10.i = r0
        Ldc:
            return r6
        Ldd:
            java.lang.Object r0 = r1.l
            yw2 r0 = (defpackage.yw2) r0
            int r3 = r1.k
            if (r3 == 0) goto Lf2
            if (r3 != r9) goto Led
            defpackage.fg1.T(r18)
            r3 = r18
            goto L100
        Led:
            defpackage.s.l(r7)
            r8 = r11
            goto Lff
        Lf2:
            defpackage.fg1.T(r18)
        Lf5:
            r1.l = r0
            r1.k = r9
            java.lang.Object r3 = r0.a(r2, r1)
            if (r3 != r8) goto L100
        Lff:
            return r8
        L100:
            h12 r3 = (defpackage.h12) r3
            java.util.List r3 = r3.a
            java.lang.Object r3 = defpackage.du.q0(r3)
            o12 r3 = (defpackage.o12) r3
            if (r3 == 0) goto Lf5
            java.lang.Object r4 = r1.m
            xk1 r4 = (defpackage.xk1) r4
            long r5 = r3.c
            rs1 r3 = new rs1
            r3.<init>(r5)
            r4.setValue(r3)
            r3 = r10
            xk1 r3 = (defpackage.xk1) r3
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.setValue(r4)
            goto Lf5
        L123:
            int r0 = r1.k
            if (r0 == 0) goto L138
            if (r0 != r9) goto L133
            java.lang.Object r0 = r1.l
            java.lang.Object r2 = r1.m
            vo2 r2 = (defpackage.vo2) r2
            defpackage.fg1.T(r18)
            goto L155
        L133:
            defpackage.s.l(r7)
            r6 = r11
            goto L157
        L138:
            defpackage.fg1.T(r18)
            java.lang.Object r0 = r1.m
            vo2 r0 = (defpackage.vo2) r0
            r2 = r0
        L140:
            r0 = r10
            xm0 r0 = (defpackage.xm0) r0
            java.lang.Object r0 = r0.a()
            if (r0 == 0) goto L154
            r1.m = r2
            r1.l = r0
            r1.k = r9
            r2.b(r1, r0)
            r6 = r8
            goto L157
        L154:
            r0 = r11
        L155:
            if (r0 != 0) goto L140
        L157:
            return r6
        L158:
            r3 = 0
            kz2 r10 = (defpackage.kz2) r10
            int r0 = r1.k
            if (r0 == 0) goto L183
            if (r0 == r9) goto L178
            r4 = 2
            if (r0 != r4) goto L173
            java.lang.Object r0 = r1.m
            o12 r0 = (defpackage.o12) r0
            java.lang.Object r4 = r1.l
            yw2 r4 = (defpackage.yw2) r4
            defpackage.fg1.T(r18)
            r5 = r4
            r4 = r18
            goto L1b0
        L173:
            defpackage.s.l(r7)
            r6 = r11
            goto L1d7
        L178:
            java.lang.Object r0 = r1.l
            yw2 r0 = (defpackage.yw2) r0
            defpackage.fg1.T(r18)
            r5 = r18
            r4 = 2
            goto L196
        L183:
            defpackage.fg1.T(r18)
            java.lang.Object r0 = r1.l
            yw2 r0 = (defpackage.yw2) r0
            r1.l = r0
            r1.k = r9
            r4 = 2
            java.lang.Object r5 = defpackage.ay2.b(r0, r1, r4)
            if (r5 != r8) goto L196
            goto L1ae
        L196:
            o12 r5 = (defpackage.o12) r5
            long r11 = r5.c
            r10.d()
            r16 = r5
            r5 = r0
            r0 = r16
        L1a2:
            r1.l = r5
            r1.m = r0
            r1.k = r4
            java.lang.Object r4 = r5.a(r2, r1)
            if (r4 != r8) goto L1b0
        L1ae:
            r6 = r8
            goto L1d7
        L1b0:
            h12 r4 = (defpackage.h12) r4
            java.util.List r4 = r4.a
            int r7 = r4.size()
            r9 = r3
        L1b9:
            if (r9 >= r7) goto L1d4
            java.lang.Object r11 = r4.get(r9)
            o12 r11 = (defpackage.o12) r11
            long r12 = r11.a
            long r14 = r0.a
            boolean r12 = defpackage.up0.s(r12, r14)
            if (r12 == 0) goto L1d1
            boolean r11 = r11.d
            if (r11 == 0) goto L1d1
            r4 = 2
            goto L1a2
        L1d1:
            int r9 = r9 + 1
            goto L1b9
        L1d4:
            r10.c()
        L1d7:
            return r6
        L1d8:
            java.lang.Object r0 = r1.m
            r2 = r0
            a20 r2 = (defpackage.a20) r2
            int r0 = r1.k
            r4 = 3
            if (r0 == 0) goto L20d
            if (r0 == r9) goto L204
            r5 = 2
            if (r0 == r5) goto L1f7
            if (r0 != r4) goto L1f2
            java.lang.Object r0 = r1.l
            yw2 r0 = (defpackage.yw2) r0
            defpackage.fg1.T(r18)
            r5 = r0
            goto L1ff
        L1f2:
            defpackage.s.l(r7)
            r6 = r11
            goto L249
        L1f7:
            java.lang.Object r0 = r1.l
            r5 = r0
            yw2 r5 = (defpackage.yw2) r5
            defpackage.fg1.T(r18)     // Catch: java.util.concurrent.CancellationException -> L201
        L1ff:
            r7 = 2
            goto L215
        L201:
            r0 = move-exception
            r7 = 2
            goto L236
        L204:
            java.lang.Object r0 = r1.l
            r5 = r0
            yw2 r5 = (defpackage.yw2) r5
            defpackage.fg1.T(r18)     // Catch: java.util.concurrent.CancellationException -> L201
            goto L229
        L20d:
            defpackage.fg1.T(r18)
            java.lang.Object r0 = r1.l
            yw2 r0 = (defpackage.yw2) r0
            r5 = r0
        L215:
            boolean r0 = defpackage.xe1.I(r2)
            if (r0 == 0) goto L249
            r0 = r10
            mn0 r0 = (defpackage.mn0) r0     // Catch: java.util.concurrent.CancellationException -> L201
            r1.l = r5     // Catch: java.util.concurrent.CancellationException -> L201
            r1.k = r9     // Catch: java.util.concurrent.CancellationException -> L201
            java.lang.Object r0 = r0.g(r5, r1)     // Catch: java.util.concurrent.CancellationException -> L201
            if (r0 != r8) goto L229
            goto L246
        L229:
            r1.l = r5     // Catch: java.util.concurrent.CancellationException -> L201
            r7 = 2
            r1.k = r7     // Catch: java.util.concurrent.CancellationException -> L235
            java.lang.Object r0 = defpackage.sp0.o(r5, r3, r1)     // Catch: java.util.concurrent.CancellationException -> L235
            if (r0 != r8) goto L215
            goto L246
        L235:
            r0 = move-exception
        L236:
            boolean r11 = defpackage.xe1.I(r2)
            if (r11 == 0) goto L248
            r1.l = r5
            r1.k = r4
            java.lang.Object r0 = defpackage.sp0.o(r5, r3, r1)
            if (r0 != r8) goto L215
        L246:
            r6 = r8
            goto L249
        L248:
            throw r0
        L249:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm0.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lm0(Object obj, t00 t00Var, int i) {
        super(2, t00Var);
        this.j = i;
        this.n = obj;
    }
}
