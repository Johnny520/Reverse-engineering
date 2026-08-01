package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k00 implements InterfaceC0904ww {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f2974d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ m00 f2975e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2976f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ k00(m00 m00Var, int i, int i2) {
        this.f2974d = i2;
        this.f2975e = m00Var;
        this.f2976f = i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0904ww
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f2974d;
        int i2 = this.f2976f;
        m00 m00Var = this.f2975e;
        int iIntValue = ((Integer) obj).intValue();
        int iIntValue2 = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                return m00.m2257j3(m00Var, i2, iIntValue, iIntValue2);
            default:
                return m00.m2143J2(m00Var, i2, iIntValue, iIntValue2);
        }
    }
}
