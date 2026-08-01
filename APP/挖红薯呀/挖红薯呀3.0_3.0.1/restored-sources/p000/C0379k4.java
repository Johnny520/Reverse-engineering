package p000;

/* JADX INFO: renamed from: k4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0379k4 implements InterfaceC0519no {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3007a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f3008b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0379k4(int i, Object obj) {
        this.f3007a = i;
        this.f3008b = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0519no
    /* JADX INFO: renamed from: a */
    public final void mo35a() {
        int i = this.f3007a;
        Object obj = this.f3008b;
        switch (i) {
            case 0:
                ((C0659qo) obj).f5205e.invoke();
                break;
            case 1:
                DialogC1010zn dialogC1010zn = (DialogC1010zn) obj;
                dialogC1010zn.dismiss();
                C0895wn c0895wn = dialogC1010zn.f7935k;
                we1 we1Var = c0895wn.f5254f;
                if (we1Var != null) {
                    we1Var.m5011d();
                }
                c0895wn.f5254f = null;
                c0895wn.requestLayout();
                break;
            case 2:
                ((m70) obj).f3855d = null;
                break;
            case 3:
                d80 d80Var = (d80) obj;
                d50 d50Var = d80Var.f991c;
                if (d50Var != null) {
                    d50Var.f969a = false;
                }
                d80Var.f991c = null;
                break;
            case 4:
                ((y70) obj).f7564f = true;
                break;
            default:
                ((b91) obj).m334i();
                break;
        }
    }
}
