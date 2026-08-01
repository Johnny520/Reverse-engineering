package p000;

/* JADX INFO: renamed from: ts */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0777ts extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6038d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0814us f6039e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f6040f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0777ts(C0814us c0814us, long j, int i) {
        super(1);
        this.f6038d = i;
        this.f6039e = c0814us;
        this.f6040f = j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    @Override // p000.InterfaceC0742sw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        long jM4834b;
        int iOrdinal;
        int i = this.f6038d;
        C0814us c0814us = this.f6039e;
        switch (i) {
            case 0:
                int iOrdinal2 = ((EnumC0485ms) obj).ordinal();
                long j = this.f6040f;
                if (iOrdinal2 == 0) {
                    C0388kd c0388kd = c0814us.f6290u.f6810a.f762a;
                    if (c0388kd != null) {
                        j = ((d30) c0388kd.f3080b.invoke(new d30(j))).f953a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        C0921xc.m5129j();
                        return null;
                    }
                    C0388kd c0388kd2 = c0814us.f6291v.f2940a.f762a;
                    if (c0388kd2 != null) {
                        j = ((d30) c0388kd2.f3080b.invoke(new d30(j))).f953a;
                    }
                }
                return new d30(j);
            default:
                EnumC0485ms enumC0485ms = (EnumC0485ms) obj;
                if (c0814us.f6295z != null && c0814us.m4344w0() != null && !p30.m3002l(c0814us.f6295z, c0814us.m4344w0()) && (iOrdinal = enumC0485ms.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        C0921xc.m5129j();
                        return null;
                    }
                    C0388kd c0388kd3 = c0814us.f6291v.f2940a.f762a;
                    if (c0388kd3 != null) {
                        InterfaceC0742sw interfaceC0742sw = c0388kd3.f3080b;
                        long j2 = this.f6040f;
                        long j3 = ((d30) interfaceC0742sw.invoke(new d30(j2))).f953a;
                        C0276ha c0276haM4344w0 = c0814us.m4344w0();
                        c0276haM4344w0.getClass();
                        k50 k50Var = k50.f3015d;
                        long jM1284a = c0276haM4344w0.m1284a(j2, j3, k50Var);
                        C0276ha c0276ha = c0814us.f6295z;
                        c0276ha.getClass();
                        jM4834b = w20.m4834b(jM1284a, c0276ha.m1284a(j2, j3, k50Var));
                    } else {
                        jM4834b = 0;
                    }
                }
                return new w20(jM4834b);
        }
    }
}
