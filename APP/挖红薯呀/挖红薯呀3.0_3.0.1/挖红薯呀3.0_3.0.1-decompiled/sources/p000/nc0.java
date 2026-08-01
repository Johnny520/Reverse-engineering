package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nc0 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f4236d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f4237e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f4238f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4239g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ nc0(int i, int i2, String str, String str2) {
        this.f4236d = i2;
        this.f4237e = str;
        this.f4238f = str2;
        this.f4239g = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f4236d;
        int i2 = this.f4239g;
        String str = this.f4238f;
        String str2 = this.f4237e;
        InterfaceC0356ji interfaceC0356ji = (InterfaceC0356ji) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return zc0.m5473A0(str2, str, i2, interfaceC0356ji, iIntValue);
            default:
                return zc0.m5575x0(str2, str, i2, interfaceC0356ji, iIntValue);
        }
    }
}
