package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class yy0 implements aj0 {

    /* JADX INFO: renamed from: d */
    public final lz0 f7739d;

    /* JADX INFO: renamed from: e */
    public boolean f7740e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public yy0(lz0 lz0Var, boolean z) {
        this.f7739d = lz0Var;
        this.f7740e = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.aj0
    /* JADX INFO: renamed from: A */
    public final long mo176A(int i, long j, long j2) {
        if (!this.f7740e) {
            return 0L;
        }
        lz0 lz0Var = this.f7739d;
        if (lz0Var.f3621a.mo501b()) {
            return 0L;
        }
        return lz0Var.m2097h(lz0Var.m2093d(lz0Var.f3621a.mo504e(lz0Var.m2093d(lz0Var.m2096g(j2)))));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // p000.aj0
    /* JADX INFO: renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo178R(long j, long j2, InterfaceC0322ik interfaceC0322ik) throws Throwable {
        xy0 xy0Var;
        long jM3438d;
        if (interfaceC0322ik instanceof xy0) {
            xy0Var = (xy0) interfaceC0322ik;
            int i = xy0Var.f7465j;
            if ((i & Integer.MIN_VALUE) != 0) {
                xy0Var.f7465j = i - Integer.MIN_VALUE;
            } else {
                xy0Var = new xy0(this, (AbstractC0358jk) interfaceC0322ik);
            }
        }
        Object objM2090a = xy0Var.f7463h;
        int i2 = xy0Var.f7465j;
        if (i2 == 0) {
            w60.m4891M(objM2090a);
            jM3438d = 0;
            if (this.f7740e) {
                lz0 lz0Var = this.f7739d;
                if (!lz0Var.f3629i) {
                    xy0Var.f7462g = j2;
                    xy0Var.f7465j = 1;
                    objM2090a = lz0Var.m2090a(j2, xy0Var);
                    EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
                    if (objM2090a == enumC1007zk) {
                        return enumC1007zk;
                    }
                }
                jM3438d = rb1.m3438d(j2, jM3438d);
            }
            return new rb1(jM3438d);
        }
        if (i2 != 1) {
            C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = xy0Var.f7462g;
        w60.m4891M(objM2090a);
        jM3438d = ((rb1) objM2090a).f5348a;
        jM3438d = rb1.m3438d(j2, jM3438d);
        return new rb1(jM3438d);
    }
}
