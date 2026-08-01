package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lc0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f3412d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f3413e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ lc0(int i, int i2) {
        this.f3412d = i2;
        this.f3413e = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f3412d;
        InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
        int iIntValue = ((Integer) obj2).intValue();
        int i2 = this.f3413e;
        switch (i) {
            case 0:
                return zc0.m5504Q(i2, interfaceC0356ji, iIntValue);
            case 1:
                return zc0.m5519X0(i2, interfaceC0356ji, iIntValue);
            default:
                return zc0.m5509S0(i2, interfaceC0356ji, iIntValue);
        }
    }
}
