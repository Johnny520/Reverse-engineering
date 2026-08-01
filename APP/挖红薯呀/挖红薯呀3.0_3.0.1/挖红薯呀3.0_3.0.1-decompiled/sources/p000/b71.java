package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class b71 extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: e */
    public static final b71 f443e = new b71(1, 0);

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f444d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b71(int i) {
        super(1);
        this.f444d = 4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        switch (this.f444d) {
            case 0:
                throw null;
            case 1:
                return new d30((((long) ((int) (((d30) obj).f953a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 2:
                return new d30((((long) ((int) (((d30) obj).f953a >> 32))) << 32) | (((long) 0) & 4294967295L));
            case 3:
                x81 x81Var = (x81) obj;
                EnumC0485ms enumC0485ms = EnumC0485ms.f4026d;
                EnumC0485ms enumC0485ms2 = EnumC0485ms.f4027e;
                return x81Var.m5104a(enumC0485ms, enumC0485ms2) ? AbstractC0700rs.f5550b : x81Var.m5104a(enumC0485ms2, EnumC0485ms.f4028f) ? AbstractC0700rs.f5550b : AbstractC0700rs.f5550b;
            default:
                return Boolean.valueOf(((C0149dv) obj).m731w0());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b71(int i, int i2) {
        super(i);
        this.f444d = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b71(C0814us c0814us) {
        super(1);
        this.f444d = 3;
    }
}
