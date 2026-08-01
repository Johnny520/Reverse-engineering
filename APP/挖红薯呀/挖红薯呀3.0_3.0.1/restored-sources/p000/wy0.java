package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wy0 {

    /* JADX INFO: renamed from: a */
    public static final sx0 f7219a = new sx0(13);

    /* JADX INFO: renamed from: b */
    public static final ty0 f7220b = new ty0();

    /* JADX INFO: renamed from: c */
    public static final C0099co f7221c = new C0099co(1);

    /* JADX INFO: renamed from: d */
    public static final no0 f7222d = new no0(1);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5064a(lz0 lz0Var, long j, AbstractC0358jk abstractC0358jk) {
        uy0 uy0Var;
        wt0 wt0Var;
        lz0 lz0Var2;
        if (abstractC0358jk instanceof uy0) {
            uy0Var = (uy0) abstractC0358jk;
            int i = uy0Var.f6351j;
            if ((i & Integer.MIN_VALUE) != 0) {
                uy0Var.f6351j = i - Integer.MIN_VALUE;
            } else {
                uy0Var = new uy0(abstractC0358jk);
            }
        }
        Object obj = uy0Var.f6350i;
        int i2 = uy0Var.f6351j;
        if (i2 == 0) {
            w60.m4891M(obj);
            wt0Var = new wt0();
            C0228g c0228g = new C0228g(lz0Var, j, wt0Var, null, 2);
            uy0Var.f6348g = lz0Var;
            uy0Var.f6349h = wt0Var;
            uy0Var.f6351j = 1;
            Object objM2095f = lz0Var.m2095f(vh0.f6718d, c0228g, uy0Var);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objM2095f == enumC1007zk) {
                return enumC1007zk;
            }
            lz0Var2 = lz0Var;
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wt0 wt0Var2 = uy0Var.f6349h;
            lz0 lz0Var3 = uy0Var.f6348g;
            w60.m4891M(obj);
            wt0Var = wt0Var2;
            lz0Var2 = lz0Var3;
        }
        return new ok0(lz0Var2.m2097h(wt0Var.f7189d));
    }
}
