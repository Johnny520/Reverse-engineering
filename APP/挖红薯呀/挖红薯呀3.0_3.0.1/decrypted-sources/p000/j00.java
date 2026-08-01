package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j00 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2651d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ m00 f2652e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2653f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ DialogC0402kp f2654g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ j00(m00 m00Var, int i, DialogC0402kp dialogC0402kp, int i2) {
        this.f2651d = i2;
        this.f2652e = m00Var;
        this.f2653f = i;
        this.f2654g = dialogC0402kp;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2651d;
        DialogC0402kp dialogC0402kp = this.f2654g;
        int i2 = this.f2653f;
        m00 m00Var = this.f2652e;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return m00.m2237f3(m00Var, i2, dialogC0402kp, iIntValue, iIntValue2);
            default:
                return m00.m2131G2(m00Var, i2, dialogC0402kp, iIntValue, iIntValue2);
        }
    }
}
