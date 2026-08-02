package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class cn2 extends w92 implements mn0 {
    public final /* synthetic */ int j = 0;
    public long k;
    public int l;
    public /* synthetic */ Object m;
    public final /* synthetic */ Object n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn2(long j, b72 b72Var, t00 t00Var) {
        super(2, t00Var);
        this.k = j;
        this.n = b72Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        a83 a83Var = a83.a;
        yw2 yw2Var = (yw2) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
        }
        return ((cn2) p(t00Var, yw2Var)).r(a83Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        int i = this.j;
        Object obj2 = this.n;
        switch (i) {
            case 0:
                cn2 cn2Var = new cn2(this.k, (b72) obj2, t00Var);
                cn2Var.m = obj;
                return cn2Var;
            default:
                cn2 cn2Var2 = new cn2((o12) obj2, t00Var);
                cn2Var2.m = obj;
                return cn2Var2;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0043 -> B:13:0x0047). Please report as a decompilation issue!!! */
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
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.j
            java.lang.Object r1 = r9.n
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            k20 r4 = defpackage.k20.h
            r5 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Ld;
            }
        Ld:
            int r0 = r9.l
            if (r0 == 0) goto L21
            if (r0 != r5) goto L1d
            long r0 = r9.k
            java.lang.Object r2 = r9.m
            yw2 r2 = (defpackage.yw2) r2
            defpackage.fg1.T(r10)
            goto L47
        L1d:
            defpackage.s.l(r3)
            goto L50
        L21:
            defpackage.fg1.T(r10)
            java.lang.Object r10 = r9.m
            yw2 r10 = (defpackage.yw2) r10
            o12 r1 = (defpackage.o12) r1
            long r0 = r1.b
            za3 r2 = r10.e()
            r2.getClass()
            r2 = 40
            long r2 = r2 + r0
            r0 = r2
            r2 = r10
        L38:
            r9.m = r2
            r9.k = r0
            r9.l = r5
            r10 = 3
            java.lang.Object r10 = defpackage.ay2.b(r2, r9, r10)
            if (r10 != r4) goto L47
            r2 = r4
            goto L50
        L47:
            o12 r10 = (defpackage.o12) r10
            long r6 = r10.b
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 < 0) goto L38
            r2 = r10
        L50:
            return r2
        L51:
            b72 r1 = (defpackage.b72) r1
            int r0 = r9.l
            if (r0 == 0) goto L65
            if (r0 != r5) goto L61
            java.lang.Object r9 = r9.m
            yw2 r9 = (defpackage.yw2) r9
            defpackage.fg1.T(r10)
            goto L84
        L61:
            defpackage.s.l(r3)
            goto Lb6
        L65:
            defpackage.fg1.T(r10)
            java.lang.Object r10 = r9.m
            yw2 r10 = (defpackage.yw2) r10
            long r2 = r9.k
            s9 r0 = new s9
            r6 = 18
            r0.<init>(r6, r1)
            r9.m = r10
            r9.l = r5
            java.lang.Object r9 = defpackage.yb0.c(r10, r2, r0, r9)
            if (r9 != r4) goto L81
            r2 = r4
            goto Lb6
        L81:
            r8 = r10
            r10 = r9
            r9 = r8
        L84:
            o12 r10 = (defpackage.o12) r10
            if (r10 == 0) goto L9c
            long r0 = r1.h
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r10 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r10 == 0) goto L9c
            ua0 r2 = defpackage.ua0.i
            goto Lb6
        L9c:
            zw2 r9 = r9.m
            h12 r9 = r9.z
            java.util.List r9 = r9.a
            java.lang.Object r9 = defpackage.du.o0(r9)
            o12 r9 = (defpackage.o12) r9
            boolean r10 = defpackage.tp0.q(r9)
            if (r10 == 0) goto Lb4
            r9.a()
            ua0 r2 = defpackage.ua0.h
            goto Lb6
        Lb4:
            ua0 r2 = defpackage.ua0.k
        Lb6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn2.r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cn2(o12 o12Var, t00 t00Var) {
        super(2, t00Var);
        this.n = o12Var;
    }
}
