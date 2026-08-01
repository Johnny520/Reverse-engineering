package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class qo0 implements InterfaceC0975yt {

    /* JADX INFO: renamed from: a */
    public final f21 f5206a;

    /* JADX INFO: renamed from: b */
    public final C0399km f5207b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qo0(f21 f21Var, C0399km c0399km) {
        this.f5206a = f21Var;
        this.f5207b = c0399km;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.InterfaceC0975yt
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo998a(hz0 hz0Var, float f, InterfaceC0322ik interfaceC0322ik) throws Throwable {
        po0 po0Var;
        if (interfaceC0322ik instanceof po0) {
            po0Var = (po0) interfaceC0322ik;
            int i = po0Var.f4937i;
            if ((i & Integer.MIN_VALUE) != 0) {
                po0Var.f4937i = i - Integer.MIN_VALUE;
            } else {
                po0Var = new po0(this, (AbstractC0358jk) interfaceC0322ik);
            }
        }
        Object objM1000d = po0Var.f4935g;
        int i2 = po0Var.f4937i;
        InterfaceC0322ik interfaceC0322ik2 = null;
        if (i2 == 0) {
            w60.m4891M(objM1000d);
            C0532o c0532o = new C0532o(14, this, hz0Var);
            po0Var.f4937i = 1;
            objM1000d = this.f5206a.m1000d(hz0Var, f, c0532o, po0Var);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objM1000d == enumC1007zk) {
                return enumC1007zk;
            }
        } else {
            if (i2 != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(objM1000d);
        }
        float fFloatValue = ((Number) objM1000d).floatValue();
        C0399km c0399km = this.f5207b;
        if (c0399km.m2037l() != 0.0f && Math.abs(c0399km.m2037l()) < 0.001d) {
            int iM720g = c0399km.f3543d.f866b.m720g();
            if (c0399km.f3550k.mo501b()) {
                AbstractC0307i4.m1547w(((zn0) c0399km.f3555p.getValue()).f7955s, null, new vn0(c0399km, interfaceC0322ik2, 2), 3);
            }
            c0399km.m2044u(iM720g, 0.0f, false);
        } else {
            new Float(c0399km.m2037l());
        }
        return new Float(fFloatValue);
    }
}
