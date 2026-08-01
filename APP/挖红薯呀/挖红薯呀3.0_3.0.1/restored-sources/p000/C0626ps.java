package p000;

/* JADX INFO: renamed from: ps */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0626ps extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4959d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0863vs f4960e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0367jt f4961f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0626ps(C0863vs c0863vs, C0367jt c0367jt, int i) {
        super(1);
        this.f4959d = i;
        this.f4960e = c0863vs;
        this.f4961f = c0367jt;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        switch (this.f4959d) {
            case 0:
                x81 x81Var = (x81) obj;
                EnumC0485ms enumC0485ms = EnumC0485ms.f4026d;
                EnumC0485ms enumC0485ms2 = EnumC0485ms.f4027e;
                return x81Var.m5104a(enumC0485ms, enumC0485ms2) ? AbstractC0700rs.f5549a : x81Var.m5104a(enumC0485ms2, EnumC0485ms.f4028f) ? AbstractC0700rs.f5549a : AbstractC0700rs.f5549a;
            default:
                int iOrdinal = ((EnumC0485ms) obj).ordinal();
                if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                    return Float.valueOf(1.0f);
                }
                C0921xc.m5129j();
                return null;
        }
    }
}
