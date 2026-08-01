package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class cz0 extends m51 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: h */
    public int f914h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ dz0 f915i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ float f916j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ float f917k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz0(dz0 dz0Var, float f, float f2, InterfaceC0322ik interfaceC0322ik) {
        super(2, interfaceC0322ik);
        this.f915i = dz0Var;
        this.f916j = f;
        this.f917k = f2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: g */
    public final InterfaceC0322ik mo15g(Object obj, InterfaceC0322ik interfaceC0322ik) {
        return new cz0(this.f915i, this.f916j, this.f917k, interfaceC0322ik);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        return ((cz0) mo15g((InterfaceC0966yk) obj, (InterfaceC0322ik) obj2)).mo16m(na1.f4229a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.AbstractC0955y9
    /* JADX INFO: renamed from: m */
    public final Object mo16m(Object obj) {
        int i = this.f914h;
        if (i == 0) {
            w60.m4891M(obj);
            lz0 lz0Var = this.f915i.f1231Q;
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(this.f916j)) << 32) | (((long) Float.floatToRawIntBits(this.f917k)) & 4294967295L);
            this.f914h = 1;
            Object objM5064a = wy0.m5064a(lz0Var, jFloatToRawIntBits, this);
            EnumC1007zk enumC1007zk = EnumC1007zk.f7916d;
            if (objM5064a == enumC1007zk) {
                return enumC1007zk;
            }
        } else {
            if (i != 1) {
                C0921xc.m5134o("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            w60.m4891M(obj);
        }
        return na1.f4229a;
    }
}
