package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class be0 implements v90 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f500d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f501e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ be0(int i, Object obj) {
        this.f500d = i;
        this.f501e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.v90
    /* JADX INFO: renamed from: e */
    public final void mo350e(x90 x90Var, q90 q90Var) {
        int i = this.f500d;
        Object obj = this.f501e;
        switch (i) {
            case 0:
                de0 de0Var = (de0) obj;
                de0Var.getClass();
                if (q90Var == q90.ON_DESTROY) {
                    de0Var.m686a();
                }
                break;
            default:
                mx0 mx0Var = (mx0) obj;
                if (q90Var == q90.ON_START) {
                    mx0Var.f4067h = true;
                } else if (q90Var == q90.ON_STOP) {
                    mx0Var.f4067h = false;
                }
                break;
        }
    }
}
