package defpackage;

import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h50 extends tw2 implements mn0 {
    public final /* synthetic */ int l;
    public int m;
    public Object n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(d91 d91Var, int i, t00 t00Var) {
        super(2, t00Var);
        this.l = 3;
        this.n = d91Var;
        this.m = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) throws Throwable {
        int i = this.l;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                return ((h50) p((t00) obj2, (j20) obj)).r(a83Var);
            case 1:
                return ((h50) p((t00) obj2, (j20) obj)).r(a83Var);
            case 2:
                return ((h50) p((t00) obj2, (j20) obj)).r(a83Var);
            case 3:
                ((h50) p((t00) obj2, (kl2) obj)).r(a83Var);
                return a83Var;
            case 4:
                ((h50) p((t00) obj2, (j20) obj)).r(a83Var);
                return k20.h;
            case 5:
                return ((h50) p((t00) obj2, (j20) obj)).r(a83Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ((h50) p((t00) obj2, (j20) obj)).r(a83Var);
            case 7:
                return ((h50) p((t00) obj2, (j20) obj)).r(a83Var);
            case 8:
                return ((h50) p((t00) obj2, (j20) obj)).r(a83Var);
            case 9:
                return ((h50) p((t00) obj2, (j20) obj)).r(a83Var);
            default:
                return ((h50) p((t00) obj2, (j20) obj)).r(a83Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = 2;
        switch (this.l) {
            case 0:
                return new h50((i50) this.n, t00Var, 0);
            case 1:
                return new h50((ul0) this.n, t00Var, 1);
            case 2:
                return new h50((sz0) this.n, t00Var, i);
            case 3:
                return new h50((d91) this.n, this.m, t00Var);
            case 4:
                return new h50((ge1) this.n, t00Var, 4);
            case 5:
                return new h50((si1) this.n, t00Var, 5);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                h50 h50Var = new h50(i, t00Var, 6);
                h50Var.n = obj;
                return h50Var;
            case 7:
                return new h50((ep1) this.n, t00Var, 7);
            case 8:
                return new h50(i, t00Var, 8);
            case 9:
                return new h50((zw2) this.n, t00Var, 9);
            default:
                return new h50((v30) this.n, t00Var, 10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:34:0x007a */
    /* JADX DEBUG: Multi-variable search result rejected for r1v13, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v6, resolved type: java.lang.Object */
    /* JADX DEBUG: Multi-variable search result rejected for r1v7, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0227  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0207 -> B:114:0x01f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0220 -> B:124:0x0223). Please report as a decompilation issue!!! */
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
    public final java.lang.Object r(java.lang.Object r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r4 = r17
            int r0 = r4.l
            a20 r1 = r4.i
            r2 = 24
            r3 = 0
            r5 = 2
            a83 r6 = defpackage.a83.a
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            k20 r8 = defpackage.k20.h
            r9 = 1
            r10 = 0
            switch(r0) {
                case 0: goto L2be;
                case 1: goto L29e;
                case 2: goto L261;
                case 3: goto L22d;
                case 4: goto L1dc;
                case 5: goto L1b1;
                case 6: goto L175;
                case 7: goto L141;
                case 8: goto L65;
                case 9: goto L41;
                default: goto L15;
            }
        L15:
            int r0 = r4.m
            if (r0 == 0) goto L24
            if (r0 != r9) goto L1f
            defpackage.fg1.T(r18)
            goto L40
        L1f:
            defpackage.s.l(r7)
            r6 = r10
            goto L40
        L24:
            defpackage.fg1.T(r18)
            java.lang.Object r0 = r4.n
            v30 r0 = (defpackage.v30) r0
            r4.m = r9
            r0.getClass()
            u30 r1 = new u30
            r1.<init>(r0, r10)
            java.lang.Object r0 = defpackage.te.u(r1, r4)
            if (r0 != r8) goto L3c
            goto L3d
        L3c:
            r0 = r6
        L3d:
            if (r0 != r8) goto L40
            r6 = r8
        L40:
            return r6
        L41:
            java.lang.Object r0 = r4.n
            zw2 r0 = (defpackage.zw2) r0
            int r1 = r4.m
            if (r1 == 0) goto L56
            if (r1 == r9) goto L4d
            if (r1 != r5) goto L51
        L4d:
            defpackage.fg1.T(r18)
            goto L64
        L51:
            defpackage.s.l(r7)
            r6 = r10
            goto L64
        L56:
            defpackage.fg1.T(r18)
            androidx.compose.ui.input.pointer.PointerInputEventHandler r1 = r0.x
            r4.m = r5
            java.lang.Object r0 = r1.invoke(r0, r4)
            if (r0 != r8) goto L64
            r6 = r8
        L64:
            return r6
        L65:
            int r0 = r4.m
            r1 = 3
            if (r0 == 0) goto L9b
            if (r0 == r9) goto L92
            if (r0 == r5) goto L83
            if (r0 != r1) goto L7d
            java.lang.Object r0 = r4.n
            r1 = r0
            il1 r1 = (defpackage.il1) r1
            defpackage.fg1.T(r18)     // Catch: java.lang.Throwable -> L7a
            goto L12f
        L7a:
            r0 = move-exception
            goto L13b
        L7d:
            defpackage.s.l(r7)
            r6 = r10
            goto L134
        L83:
            java.lang.Object r0 = r4.n
            r2 = r0
            il1 r2 = (defpackage.il1) r2
            defpackage.fg1.T(r18)     // Catch: java.lang.Throwable -> L8e
            r0 = r18
            goto Lc0
        L8e:
            r0 = move-exception
            r1 = r2
            goto L13b
        L92:
            java.lang.Object r0 = r4.n
            il1 r0 = (defpackage.il1) r0
            defpackage.fg1.T(r18)
        L99:
            r2 = r0
            goto Lac
        L9b:
            defpackage.fg1.T(r18)
            kl1 r0 = defpackage.sq1.c
            r4.n = r0
            r4.m = r9
            java.lang.Object r2 = r0.d(r4)
            if (r2 != r8) goto L99
            goto L12c
        Lac:
            java.util.LinkedHashMap r0 = defpackage.sq1.r     // Catch: java.lang.Throwable -> L8e
            r0.clear()     // Catch: java.lang.Throwable -> L8e
            wj2 r0 = defpackage.sq1.m     // Catch: java.lang.Throwable -> L8e
            if (r0 == 0) goto L135
            r4.n = r2     // Catch: java.lang.Throwable -> L8e
            r4.m = r5     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r0.o(r4)     // Catch: java.lang.Throwable -> L8e
            if (r0 != r8) goto Lc0
            goto L12c
        Lc0:
            sk2 r0 = (defpackage.sk2) r0     // Catch: java.lang.Throwable -> L8e
            java.util.List r0 = r0.a     // Catch: java.lang.Throwable -> L8e
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8e
            r3.<init>()     // Catch: java.lang.Throwable -> L8e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L8e
        Lcd:
            boolean r5 = r0.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r5 == 0) goto Le2
            java.lang.Object r5 = r0.next()     // Catch: java.lang.Throwable -> L8e
            r7 = r5
            tk2 r7 = (defpackage.tk2) r7     // Catch: java.lang.Throwable -> L8e
            java.lang.Throwable r7 = r7.c     // Catch: java.lang.Throwable -> L8e
            if (r7 == 0) goto Lcd
            r3.add(r5)     // Catch: java.lang.Throwable -> L8e
            goto Lcd
        Le2:
            java.util.Iterator r0 = r3.iterator()     // Catch: java.lang.Throwable -> L8e
        Le6:
            boolean r3 = r0.hasNext()     // Catch: java.lang.Throwable -> L8e
            if (r3 == 0) goto L120
            java.lang.Object r3 = r0.next()     // Catch: java.lang.Throwable -> L8e
            tk2 r3 = (defpackage.tk2) r3     // Catch: java.lang.Throwable -> L8e
            b5 r11 = defpackage.sq1.h     // Catch: java.lang.Throwable -> L8e
            if (r11 == 0) goto L11a
            ph2 r12 = defpackage.ph2.k     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = r3.a     // Catch: java.lang.Throwable -> L8e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            r7.<init>()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r9 = "Unable to stop script "
            r7.append(r9)     // Catch: java.lang.Throwable -> L8e
            r7.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = " for security mode."
            r7.append(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r13 = r7.toString()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r14 = r3.a     // Catch: java.lang.Throwable -> L8e
            java.lang.Throwable r15 = r3.c     // Catch: java.lang.Throwable -> L8e
            r16 = 16
            defpackage.b5.x(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L8e
            goto Le6
        L11a:
            java.lang.String r0 = "scriptLogger"
            defpackage.t11.S(r0)     // Catch: java.lang.Throwable -> L8e
            throw r10     // Catch: java.lang.Throwable -> L8e
        L120:
            sq1 r0 = defpackage.sq1.a     // Catch: java.lang.Throwable -> L8e
            r4.n = r2     // Catch: java.lang.Throwable -> L8e
            r4.m = r1     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r0 = r0.j(r4)     // Catch: java.lang.Throwable -> L8e
            if (r0 != r8) goto L12e
        L12c:
            r6 = r8
            goto L134
        L12e:
            r1 = r2
        L12f:
            kl1 r1 = (defpackage.kl1) r1
            r1.f(r10)
        L134:
            return r6
        L135:
            java.lang.String r0 = "runtimeManager"
            defpackage.t11.S(r0)     // Catch: java.lang.Throwable -> L8e
            throw r10     // Catch: java.lang.Throwable -> L8e
        L13b:
            kl1 r1 = (defpackage.kl1) r1
            r1.f(r10)
            throw r0
        L141:
            int r0 = r4.m
            if (r0 == 0) goto L150
            if (r0 != r9) goto L14b
            defpackage.fg1.T(r18)
            goto L174
        L14b:
            defpackage.s.l(r7)
            r6 = r10
            goto L174
        L150:
            defpackage.fg1.T(r18)
            java.lang.Object r0 = r4.n
            ep1 r0 = (defpackage.ep1) r0
            sc r0 = r0.b
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r3)
            r2 = 1126825984(0x432a0000, float:170.0)
            r3 = 4
            r5 = 1059984507(0x3f2e147b, float:0.68)
            qt2 r2 = defpackage.up0.G(r5, r2, r10, r3)
            r4.m = r9
            r3 = 0
            r5 = 12
            java.lang.Object r0 = defpackage.sc.c(r0, r1, r2, r3, r4, r5)
            if (r0 != r8) goto L174
            r6 = r8
        L174:
            return r6
        L175:
            int r0 = r4.m
            if (r0 == 0) goto L188
            if (r0 != r9) goto L183
            java.lang.Object r0 = r4.n
            j20 r0 = (defpackage.j20) r0
            defpackage.fg1.T(r18)
            goto L18f
        L183:
            defpackage.s.l(r7)
            r6 = r10
            goto L1b0
        L188:
            defpackage.fg1.T(r18)
            java.lang.Object r0 = r4.n
            j20 r0 = (defpackage.j20) r0
        L18f:
            a20 r3 = r0.g()
            boolean r3 = defpackage.xe1.I(r3)
            if (r3 == 0) goto L1b0
            nx0 r3 = new nx0
            r3.<init>(r2)
            r4.n = r0
            r4.m = r9
            r1.getClass()
            xb r5 = defpackage.qp0.A(r1)
            java.lang.Object r3 = r5.a(r3, r4)
            if (r3 != r8) goto L18f
            r6 = r8
        L1b0:
            return r6
        L1b1:
            int r0 = r4.m
            if (r0 == 0) goto L1c2
            if (r0 != r9) goto L1bd
            defpackage.fg1.T(r18)
            r0 = r18
            goto L1db
        L1bd:
            defpackage.s.l(r7)
            r0 = r10
            goto L1db
        L1c2:
            defpackage.fg1.T(r18)
            java.lang.Object r0 = r4.n
            si1 r0 = (defpackage.si1) r0
            jn r0 = r0.g
            r4.m = r9
            a2 r1 = new a2
            r2 = 18
            r1.<init>(r0, r10, r2)
            java.lang.Object r0 = defpackage.te.u(r1, r4)
            if (r0 != r8) goto L1db
            r0 = r8
        L1db:
            return r0
        L1dc:
            java.lang.Object r0 = r4.n
            ge1 r0 = (defpackage.ge1) r0
            int r3 = r4.m
            if (r3 == 0) goto L1f5
            if (r3 == r9) goto L1f1
            if (r3 != r5) goto L1ec
            defpackage.fg1.T(r18)
            goto L223
        L1ec:
            defpackage.s.l(r7)
            r8 = r10
            goto L222
        L1f1:
            defpackage.fg1.T(r18)
            goto L205
        L1f5:
            defpackage.fg1.T(r18)
        L1f8:
            jn r3 = r0.F
            if (r3 == 0) goto L205
            r4.m = r9
            java.lang.Object r3 = r3.w(r4)
            if (r3 != r8) goto L205
            goto L222
        L205:
            e02 r3 = r0.A
            if (r3 == 0) goto L1f8
            nx0 r3 = new nx0
            r3.<init>(r2)
            r4.m = r5
            r1.getClass()
            xb r6 = defpackage.qp0.A(r1)
            gq0 r7 = new gq0
            r7.<init>(r3, r9)
            java.lang.Object r3 = r6.a(r7, r4)
            if (r3 != r8) goto L223
        L222:
            return r8
        L223:
            e02 r3 = r0.A
            if (r3 == 0) goto L1f8
            g02 r3 = (defpackage.g02) r3
            r3.d()
            goto L1f8
        L22d:
            defpackage.fg1.T(r18)
            java.lang.Object r0 = r4.n
            d91 r0 = (defpackage.d91) r0
            int r1 = r4.m
            os r2 = r0.e
            java.lang.Object r3 = r2.b
            kx1 r3 = (defpackage.kx1) r3
            int r3 = r3.g()
            if (r3 != r1) goto L24c
            java.lang.Object r3 = r2.c
            kx1 r3 = (defpackage.kx1) r3
            int r3 = r3.g()
            if (r3 == 0) goto L253
        L24c:
            x71 r3 = r0.n
            r3.c()
            r3.b = r10
        L253:
            r3 = 0
            r2.b(r1, r3)
            r2.d = r10
            r61 r0 = r0.k
            if (r0 == 0) goto L260
            r0.k()
        L260:
            return r6
        L261:
            int r0 = r4.m
            if (r0 == 0) goto L270
            if (r0 != r9) goto L26b
            defpackage.fg1.T(r18)
            goto L29d
        L26b:
            defpackage.s.l(r7)
            r6 = r10
            goto L29d
        L270:
            defpackage.fg1.T(r18)
            java.lang.Object r0 = r4.n
            sz0 r0 = (defpackage.sz0) r0
            java.lang.Object r0 = r0.j
            id r0 = (defpackage.id) r0
            java.lang.Float r1 = new java.lang.Float
            r1.<init>(r3)
            java.lang.Float r2 = new java.lang.Float
            r5 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r5)
            r5 = 1137180672(0x43c80000, float:400.0)
            qt2 r2 = defpackage.up0.G(r3, r5, r2, r9)
            r4.m = r9
            ml2 r3 = new ml2
            r5 = 25
            r3.<init>(r5)
            java.lang.Object r0 = defpackage.te.n(r0, r1, r2, r3, r4)
            if (r0 != r8) goto L29d
            r6 = r8
        L29d:
            return r6
        L29e:
            int r0 = r4.m
            if (r0 == 0) goto L2ad
            if (r0 != r9) goto L2a8
            defpackage.fg1.T(r18)
            goto L2bd
        L2a8:
            defpackage.s.l(r7)
            r6 = r10
            goto L2bd
        L2ad:
            defpackage.fg1.T(r18)
            java.lang.Object r0 = r4.n
            ul0 r0 = (defpackage.ul0) r0
            r4.m = r9
            java.lang.Object r0 = defpackage.rg3.r(r0, r10, r4)
            if (r0 != r8) goto L2bd
            r6 = r8
        L2bd:
            return r6
        L2be:
            int r0 = r4.m
            if (r0 == 0) goto L2cd
            if (r0 != r9) goto L2c8
            defpackage.fg1.T(r18)
            goto L2f8
        L2c8:
            defpackage.s.l(r7)
            r6 = r10
            goto L2f8
        L2cd:
            defpackage.fg1.T(r18)
            a72 r12 = new a72
            r12.<init>()
            a72 r13 = new a72
            r13.<init>()
            a72 r14 = new a72
            r14.<init>()
            java.lang.Object r0 = r4.n
            r15 = r0
            i50 r15 = (defpackage.i50) r15
            bk1 r0 = r15.v
            lq2 r0 = r0.a
            lq r11 = new lq
            r16 = 2
            r11.<init>(r12, r13, r14, r15, r16)
            r4.m = r9
            r0.getClass()
            defpackage.lq2.i(r0, r11, r4)
            r6 = r8
        L2f8:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h50.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h50(int i, t00 t00Var, int i2) {
        super(i, t00Var);
        this.l = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h50(Object obj, t00 t00Var, int i) {
        super(2, t00Var);
        this.l = i;
        this.n = obj;
    }
}
