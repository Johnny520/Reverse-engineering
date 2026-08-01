package p000;

/* JADX INFO: renamed from: y4 */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0950y4 extends c50 implements InterfaceC0742sw {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f7519d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ DialogC1010zn f7520e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0950y4(DialogC1010zn dialogC1010zn, int i) {
        super(1);
        this.f7519d = i;
        this.f7520e = dialogC1010zn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.InterfaceC0742sw
    public final Object invoke(Object obj) {
        int i = this.f7519d;
        DialogC1010zn dialogC1010zn = this.f7520e;
        switch (i) {
            case 0:
                dialogC1010zn.show();
                return new C0379k4(1, dialogC1010zn);
            default:
                if (dialogC1010zn.f7933i.f7376a) {
                    dialogC1010zn.f7932h.invoke();
                }
                return na1.f4229a;
        }
    }
}
