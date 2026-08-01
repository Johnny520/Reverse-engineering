package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class kz0 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public long f3289h;

    /* JADX INFO: renamed from: i */
    public int f3290i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ long f3291j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ lz0 f3292k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz0(lz0 lz0Var, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f3292k = lz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        kz0 kz0Var = new kz0(this.f3292k, interfaceC0322ik);
        kz0Var.f3291j = ((rb1) obj).f5348a;
        return kz0Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        long j = ((rb1) obj).f5348a;
        kz0 kz0Var = new kz0(this.f3292k, (InterfaceC0322ik) obj2);
        kz0Var.f3291j = j;
        return kz0Var.mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo16m(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        int i = this.f3290i;
        lz0 lz0Var = this.f3292k;
        EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
        if (i == 0) {
            w60.m4891M(obj);
            j = this.f3291j;
            C0948y2 c0948y2 = lz0Var.f3626f;
            this.f3291j = j;
            this.f3290i = 1;
            obj = c0948y2.m5205f(j, this);
            if (obj != enumC1007zk) {
            }
            return enumC1007zk;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j4 = this.f3289h;
                j3 = this.f3291j;
                w60.m4891M(obj);
                return new rb1(rb1.m3438d(j3, rb1.m3438d(j4, ((rb1) obj).f5348a)));
            }
            j2 = this.f3289h;
            j = this.f3291j;
            w60.m4891M(obj);
            long j5 = ((rb1) obj).f5348a;
            C0948y2 c0948y22 = lz0Var.f3626f;
            long jM3438d = rb1.m3438d(j2, j5);
            this.f3291j = j;
            this.f3289h = j5;
            this.f3290i = 3;
            obj = c0948y22.m5204d(jM3438d, j5, this);
            if (obj != enumC1007zk) {
                j3 = j;
                j4 = j5;
                return new rb1(rb1.m3438d(j3, rb1.m3438d(j4, ((rb1) obj).f5348a)));
            }
            return enumC1007zk;
        }
        j = this.f3291j;
        w60.m4891M(obj);
        long jM3438d2 = rb1.m3438d(j, ((rb1) obj).f5348a);
        this.f3291j = j;
        this.f3289h = jM3438d2;
        this.f3290i = 2;
        obj = lz0Var.m2090a(jM3438d2, this);
        if (obj != enumC1007zk) {
            j2 = jM3438d2;
            long j52 = ((rb1) obj).f5348a;
            C0948y2 c0948y222 = lz0Var.f3626f;
            long jM3438d3 = rb1.m3438d(j2, j52);
            this.f3291j = j;
            this.f3289h = j52;
            this.f3290i = 3;
            obj = c0948y222.m5204d(jM3438d3, j52, this);
            if (obj != enumC1007zk) {
            }
        }
        return enumC1007zk;
    }
}
