package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class q8 extends w92 implements mn0 {
    public final /* synthetic */ int j;
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8(Object obj, t00 t00Var, int i) {
        super(2, t00Var);
        this.j = i;
        this.m = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        a83 a83Var = a83.a;
        yw2 yw2Var = (yw2) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                return ((q8) p(t00Var, yw2Var)).r(a83Var);
            case 1:
                return ((q8) p(t00Var, yw2Var)).r(a83Var);
            default:
                ((q8) p(t00Var, yw2Var)).r(a83Var);
                return k20.h;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.j;
        Object obj2 = this.m;
        switch (i) {
            case 0:
                q8 q8Var = new q8((s8) obj2, t00Var, 0);
                q8Var.l = obj;
                return q8Var;
            case 1:
                q8 q8Var2 = new q8((in0) obj2, t00Var, 1);
                q8Var2.l = obj;
                return q8Var2;
            default:
                q8 q8Var3 = new q8((n10) obj2, t00Var, 2);
                q8Var3.l = obj;
                return q8Var3;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e2 -> B:45:0x00e6). Please report as a decompilation issue!!! */
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
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.j
            a83 r1 = defpackage.a83.a
            i12 r2 = defpackage.i12.i
            r3 = 2
            java.lang.Object r4 = r14.m
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            k20 r6 = defpackage.k20.h
            r7 = 1
            r8 = 0
            switch(r0) {
                case 0: goto L9d;
                case 1: goto L4c;
                default: goto L12;
            }
        L12:
            int r0 = r14.k
            if (r0 == 0) goto L25
            if (r0 != r7) goto L20
            java.lang.Object r0 = r14.l
            yw2 r0 = (defpackage.yw2) r0
            defpackage.fg1.T(r15)
            goto L3a
        L20:
            defpackage.s.l(r5)
            r6 = r8
            goto L39
        L25:
            defpackage.fg1.T(r15)
            java.lang.Object r15 = r14.l
            yw2 r15 = (defpackage.yw2) r15
            r0 = r15
        L2d:
            r14.l = r0
            r14.k = r7
            i12 r15 = defpackage.i12.h
            java.lang.Object r15 = r0.a(r15, r14)
            if (r15 != r6) goto L3a
        L39:
            return r6
        L3a:
            h12 r15 = (defpackage.h12) r15
            r1 = r4
            n10 r1 = (defpackage.n10) r1
            boolean r15 = defpackage.dn2.a(r15)
            r15 = r15 ^ r7
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r1.j(r15)
            goto L2d
        L4c:
            int r0 = r14.k
            if (r0 == 0) goto L65
            if (r0 == r7) goto L5d
            if (r0 != r3) goto L58
            defpackage.fg1.T(r15)
            goto L95
        L58:
            defpackage.s.l(r5)
            r1 = r8
            goto L9c
        L5d:
            java.lang.Object r0 = r14.l
            yw2 r0 = (defpackage.yw2) r0
            defpackage.fg1.T(r15)
            goto L78
        L65:
            defpackage.fg1.T(r15)
            java.lang.Object r15 = r14.l
            r0 = r15
            yw2 r0 = (defpackage.yw2) r0
            r14.l = r0
            r14.k = r7
            java.lang.Object r15 = defpackage.rg3.i(r0, r14)
            if (r15 != r6) goto L78
            goto L93
        L78:
            o12 r15 = (defpackage.o12) r15
            r15.a()
            in0 r4 = (defpackage.in0) r4
            long r9 = r15.c
            rs1 r15 = new rs1
            r15.<init>(r9)
            r4.j(r15)
            r14.l = r8
            r14.k = r3
            java.lang.Object r15 = defpackage.ay2.h(r0, r2, r14)
            if (r15 != r6) goto L95
        L93:
            r1 = r6
            goto L9c
        L95:
            o12 r15 = (defpackage.o12) r15
            if (r15 == 0) goto L9c
            r15.a()
        L9c:
            return r1
        L9d:
            s8 r4 = (defpackage.s8) r4
            int r0 = r14.k
            if (r0 == 0) goto Lbd
            if (r0 == r7) goto Lb5
            if (r0 != r3) goto Laf
            java.lang.Object r0 = r14.l
            yw2 r0 = (defpackage.yw2) r0
            defpackage.fg1.T(r15)
            goto Le6
        Laf:
            defpackage.s.l(r5)
            r1 = r8
            goto L147
        Lb5:
            java.lang.Object r0 = r14.l
            yw2 r0 = (defpackage.yw2) r0
            defpackage.fg1.T(r15)
            goto Ld0
        Lbd:
            defpackage.fg1.T(r15)
            java.lang.Object r15 = r14.l
            r0 = r15
            yw2 r0 = (defpackage.yw2) r0
            r14.l = r0
            r14.k = r7
            java.lang.Object r15 = defpackage.ay2.b(r0, r14, r3)
            if (r15 != r6) goto Ld0
            goto Le4
        Ld0:
            o12 r15 = (defpackage.o12) r15
            long r9 = r15.a
            r4.h = r9
            long r9 = r15.c
            r4.b = r9
        Lda:
            r14.l = r0
            r14.k = r3
            java.lang.Object r15 = r0.a(r2, r14)
            if (r15 != r6) goto Le6
        Le4:
            r1 = r6
            goto L147
        Le6:
            h12 r15 = (defpackage.h12) r15
            java.util.List r15 = r15.a
            java.util.ArrayList r5 = new java.util.ArrayList
            int r7 = r15.size()
            r5.<init>(r7)
            int r7 = r15.size()
            r9 = 0
            r10 = r9
        Lf9:
            if (r10 >= r7) goto L10c
            java.lang.Object r11 = r15.get(r10)
            r12 = r11
            o12 r12 = (defpackage.o12) r12
            boolean r12 = r12.d
            if (r12 == 0) goto L109
            r5.add(r11)
        L109:
            int r10 = r10 + 1
            goto Lf9
        L10c:
            int r15 = r5.size()
        L110:
            if (r9 >= r15) goto L127
            java.lang.Object r7 = r5.get(r9)
            r10 = r7
            o12 r10 = (defpackage.o12) r10
            long r10 = r10.a
            long r12 = r4.h
            boolean r10 = defpackage.up0.s(r10, r12)
            if (r10 == 0) goto L124
            goto L128
        L124:
            int r9 = r9 + 1
            goto L110
        L127:
            r7 = r8
        L128:
            o12 r7 = (defpackage.o12) r7
            if (r7 != 0) goto L133
            java.lang.Object r15 = defpackage.du.q0(r5)
            r7 = r15
            o12 r7 = (defpackage.o12) r7
        L133:
            if (r7 == 0) goto L13d
            long r9 = r7.a
            r4.h = r9
            long r9 = r7.c
            r4.b = r9
        L13d:
            boolean r15 = r5.isEmpty()
            if (r15 == 0) goto Lda
            r14 = -1
            r4.h = r14
        L147:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q8.r(java.lang.Object):java.lang.Object");
    }
}
