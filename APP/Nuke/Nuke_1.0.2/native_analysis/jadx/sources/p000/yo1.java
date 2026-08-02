package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class yo1 extends w92 implements mn0 {

    /* JADX INFO: renamed from: j */
    public int f13546j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f13547k;

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        ((yo1) mo13p((t00) obj2, (yw2) obj)).mo7r(a83.f116a);
        return k20.f5323h;
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        yo1 yo1Var = new yo1(2, t00Var);
        yo1Var.f13547k = obj;
        return yo1Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[LOOP:0: B:13:0x0030->B:15:0x0036, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo7r(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13547k
            yw2 r0 = (p000.yw2) r0
            int r1 = r3.f13546j
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            p000.fg1.m1627T(r4)
            goto L28
        Lf:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            p000.C0676s.m4653l(r3)
            r3 = 0
            return r3
        L16:
            p000.fg1.m1627T(r4)
        L19:
            r3.f13547k = r0
            r3.f13546j = r2
            i12 r4 = p000.i12.f4216h
            java.lang.Object r4 = r0.m6363a(r4, r3)
            k20 r1 = p000.k20.f5323h
            if (r4 != r1) goto L28
            return r1
        L28:
            h12 r4 = (p000.h12) r4
            java.util.List r4 = r4.f3776a
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r4.next()
            o12 r1 = (p000.o12) r1
            r1.m3463a()
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yo1.mo7r(java.lang.Object):java.lang.Object");
    }
}
