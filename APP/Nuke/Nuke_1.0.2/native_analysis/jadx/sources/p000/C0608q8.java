package p000;

/* JADX INFO: renamed from: q8 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0608q8 extends w92 implements mn0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8815j;

    /* JADX INFO: renamed from: k */
    public int f8816k;

    /* JADX INFO: renamed from: l */
    public /* synthetic */ Object f8817l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Object f8818m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0608q8(Object obj, t00 t00Var, int i) {
        super(2, t00Var);
        this.f8815j = i;
        this.f8818m = obj;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        int i = this.f8815j;
        a83 a83Var = a83.f116a;
        yw2 yw2Var = (yw2) obj;
        t00 t00Var = (t00) obj2;
        switch (i) {
            case 0:
                return ((C0608q8) mo13p(t00Var, yw2Var)).mo7r(a83Var);
            case 1:
                return ((C0608q8) mo13p(t00Var, yw2Var)).mo7r(a83Var);
            default:
                ((C0608q8) mo13p(t00Var, yw2Var)).mo7r(a83Var);
                return k20.f5323h;
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f8815j;
        Object obj2 = this.f8818m;
        switch (i) {
            case 0:
                C0608q8 c0608q8 = new C0608q8((C0685s8) obj2, t00Var, 0);
                c0608q8.f8817l = obj;
                return c0608q8;
            case 1:
                C0608q8 c0608q82 = new C0608q8((in0) obj2, t00Var, 1);
                c0608q82.f8817l = obj;
                return c0608q82;
            default:
                C0608q8 c0608q83 = new C0608q8((n10) obj2, t00Var, 2);
                c0608q83.f8817l = obj;
                return c0608q83;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0037 -> B:13:0x003a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00e2 -> B:45:0x00e6). Please report as a decompilation issue!!! */
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
    public final java.lang.Object mo7r(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0608q8.mo7r(java.lang.Object):java.lang.Object");
    }
}
