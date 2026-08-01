package p000;

/* JADX INFO: renamed from: v1 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0824v1 implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6372d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0298hw f6373e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0824v1(int i, InterfaceC0298hw interfaceC0298hw) {
        this.f6372d = i;
        this.f6373e = interfaceC0298hw;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f6372d;
        InterfaceC0298hw interfaceC0298hw = this.f6373e;
        switch (i) {
            case 0:
                interfaceC0298hw.invoke();
                break;
            case 1:
                interfaceC0298hw.invoke();
                break;
            case 2:
                hk0.m1329A(interfaceC0298hw);
                break;
            case 3:
                hk0.m1330B(interfaceC0298hw);
                break;
            case 4:
                hk0.m1332D(interfaceC0298hw);
                break;
            case 5:
                hk0.m1336H(interfaceC0298hw);
                break;
            case 6:
                hk0.m1333E(interfaceC0298hw);
                break;
            case 7:
                hk0.m1334F(interfaceC0298hw);
                break;
            default:
                hk0.m1335G(interfaceC0298hw);
                break;
        }
    }
}
