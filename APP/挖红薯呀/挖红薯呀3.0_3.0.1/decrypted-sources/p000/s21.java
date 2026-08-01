package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s21 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5627d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0742sw f5628e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ s21(InterfaceC0742sw interfaceC0742sw, int i) {
        this.f5627d = i;
        this.f5628e = interfaceC0742sw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f5627d;
        InterfaceC0742sw interfaceC0742sw = this.f5628e;
        switch (i) {
            case 0:
                l21 l21Var = (l21) interfaceC0742sw.invoke((q21) obj);
                synchronized (t21.f5893c) {
                    t21.f5894d = t21.f5894d.m3193e(l21Var.mo811g());
                }
                return l21Var;
            default:
                Long l = (Long) obj;
                l.getClass();
                return interfaceC0742sw.invoke(l);
        }
    }
}
