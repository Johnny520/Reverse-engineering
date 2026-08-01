package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class fh0 extends av0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: f */
    public C0410kx f1725f;

    /* JADX INFO: renamed from: g */
    public gh0 f1726g;

    /* JADX INFO: renamed from: h */
    public long[] f1727h;

    /* JADX INFO: renamed from: i */
    public int f1728i;

    /* JADX INFO: renamed from: j */
    public int f1729j;

    /* JADX INFO: renamed from: k */
    public /* synthetic */ Object f1730k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ gh0 f1731l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ C0410kx f1732m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fh0(gh0 gh0Var, C0410kx c0410kx, InterfaceC0322ik interfaceC0322ik) {
        super(interfaceC0322ik);
        this.f1731l = gh0Var;
        this.f1732m = c0410kx;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        fh0 fh0Var = new fh0(this.f1731l, this.f1732m, interfaceC0322ik);
        fh0Var.f1730k = obj;
        return fh0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((fh0) mo15g((q01) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        q01 q01Var;
        gh0 gh0Var;
        long[] jArr;
        int i;
        C0410kx c0410kx;
        int i2 = this.f1729j;
        if (i2 == 0) {
            w60.m4891M(obj);
            q01Var = (q01) this.f1730k;
            gh0Var = this.f1731l;
            eh0 eh0Var = gh0Var.f1995e;
            jArr = eh0Var.f1450c;
            i = eh0Var.f1452e;
            c0410kx = this.f1732m;
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.f1728i;
            jArr = this.f1727h;
            gh0Var = this.f1726g;
            c0410kx = this.f1725f;
            q01Var = (q01) this.f1730k;
            w60.m4891M(obj);
        }
        if (i == Integer.MAX_VALUE) {
            return na1.f4229a;
        }
        int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
        c0410kx.f3281e = i;
        Object obj2 = gh0Var.f1995e.f1449b[i];
        this.f1730k = q01Var;
        this.f1725f = c0410kx;
        this.f1726g = gh0Var;
        this.f1727h = jArr;
        this.f1728i = i3;
        this.f1729j = 1;
        q01Var.m3184b(this, obj2);
        return EnumC1007zk.f7916d;
    }
}
