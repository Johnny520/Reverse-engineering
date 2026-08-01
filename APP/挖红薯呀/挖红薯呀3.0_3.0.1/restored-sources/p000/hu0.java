package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class hu0 {

    /* JADX INFO: renamed from: a */
    public final int f2366a;

    /* JADX INFO: renamed from: b */
    public final h81 f2367b;

    /* JADX INFO: renamed from: c */
    public float f2368c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hu0(int i, h81 h81Var) {
        this.f2366a = i;
        this.f2367b = h81Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1507a(float f, AbstractC0358jk abstractC0358jk) {
        gu0 gu0Var;
        if (abstractC0358jk instanceof gu0) {
            gu0Var = (gu0) abstractC0358jk;
            int i = gu0Var.f2055i;
            if ((i & Integer.MIN_VALUE) != 0) {
                gu0Var.f2055i = i - Integer.MIN_VALUE;
            } else {
                gu0Var = new gu0(this, abstractC0358jk);
            }
        }
        Object objInvoke = gu0Var.f2053g;
        int i2 = gu0Var.f2055i;
        if (i2 == 0) {
            w60.m4891M(objInvoke);
            Float f2 = new Float(f);
            gu0Var.f2055i = 1;
            objInvoke = this.f2367b.invoke(f2, gu0Var);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objInvoke == enumC1007zk) {
                return enumC1007zk;
            }
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(objInvoke);
        }
        this.f2368c += ((Number) objInvoke).floatValue();
        return na1.f4229a;
    }
}
