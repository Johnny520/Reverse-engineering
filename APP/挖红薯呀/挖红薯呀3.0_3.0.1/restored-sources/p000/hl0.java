package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class hl0 extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2286d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0149dv f2287e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0149dv f2288f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2289g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0697rp f2290h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2291i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl0(C0149dv c0149dv, C0149dv c0149dv2, Object obj, int i, C0697rp c0697rp, int i2) {
        super(1);
        this.f2286d = i2;
        this.f2287e = c0149dv;
        this.f2288f = c0149dv2;
        this.f2291i = obj;
        this.f2289g = i;
        this.f2290h = c0697rp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f2286d;
        C0697rp c0697rp = this.f2290h;
        int i2 = this.f2289g;
        Object obj2 = this.f2291i;
        C0149dv c0149dv = this.f2288f;
        C0149dv c0149dv2 = this.f2287e;
        switch (i) {
            case 0:
                InterfaceC0165ea interfaceC0165ea = (InterfaceC0165ea) obj;
                if (c0149dv2 != ((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(c0149dv)).getFocusOwner()).m5612f()) {
                    return Boolean.TRUE;
                }
                boolean zM4887I = w60.m4887I(c0149dv, (C0149dv) obj2, i2, c0697rp);
                Boolean boolValueOf = Boolean.valueOf(zM4887I);
                if (zM4887I || !interfaceC0165ea.mo499a()) {
                    return boolValueOf;
                }
                return null;
            default:
                InterfaceC0165ea interfaceC0165ea2 = (InterfaceC0165ea) obj;
                if (c0149dv2 != ((C1017zu) ((ViewTreeObserverOnGlobalLayoutListenerC0875w3) pf1.m3040R(c0149dv)).getFocusOwner()).m5612f()) {
                    return Boolean.TRUE;
                }
                boolean zM5427N = z60.m5427N(i2, c0697rp, c0149dv, (st0) obj2);
                Boolean boolValueOf2 = Boolean.valueOf(zM5427N);
                if (zM5427N || !interfaceC0165ea2.mo499a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
