package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vc0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6656d = 0;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f6657e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f6658f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6659g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f6660h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ vc0(pe0 pe0Var, boolean z, int i, int i2) {
        this.f6660h = pe0Var;
        this.f6657e = z;
        this.f6658f = i;
        this.f6659g = i2;
    }

    /* JADX DEBUG: Class process forced to load method for inline: x71.a(boolean, ww, int, int, ji, int):na1 */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f6656d;
        Object obj3 = this.f6660h;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return zc0.m5515V0((pe0) obj3, this.f6657e, this.f6658f, this.f6659g, (InterfaceC0356ji) obj, iIntValue);
            default:
                int iIntValue2 = ((Integer) obj2).intValue();
                return x71.m5094e(this.f6657e, (InterfaceC0904ww) obj3, this.f6658f, this.f6659g, (InterfaceC0356ji) obj, iIntValue2);
        }
    }

    public /* synthetic */ vc0(boolean z, InterfaceC0904ww interfaceC0904ww, int i, int i2) {
        this.f6657e = z;
        this.f6660h = interfaceC0904ww;
        this.f6658f = i;
        this.f6659g = i2;
    }
}
