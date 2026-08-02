package defpackage;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yo1 extends w92 implements mn0 {
    public int j;
    public /* synthetic */ Object k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        ((yo1) p((t00) obj2, (yw2) obj)).r(a83.a);
        return k20.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.rj
    public final t00 p(t00 t00Var, Object obj) {
        yo1 yo1Var = new yo1(2, t00Var);
        yo1Var.k = obj;
        return yo1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[LOOP:0: B:13:0x0030->B:15:0x0036, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:12:0x0028). Please report as a decompilation issue!!! */
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
    public final java.lang.Object r(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.k
            yw2 r0 = (defpackage.yw2) r0
            int r1 = r3.j
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            defpackage.fg1.T(r4)
            goto L28
        Lf:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.s.l(r3)
            r3 = 0
            return r3
        L16:
            defpackage.fg1.T(r4)
        L19:
            r3.k = r0
            r3.j = r2
            i12 r4 = defpackage.i12.h
            java.lang.Object r4 = r0.a(r4, r3)
            k20 r1 = defpackage.k20.h
            if (r4 != r1) goto L28
            return r1
        L28:
            h12 r4 = (defpackage.h12) r4
            java.util.List r4 = r4.a
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r4.next()
            o12 r1 = (defpackage.o12) r1
            r1.a()
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo1.r(java.lang.Object):java.lang.Object");
    }
}
