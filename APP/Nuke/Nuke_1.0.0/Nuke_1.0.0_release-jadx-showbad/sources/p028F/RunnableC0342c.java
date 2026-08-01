package p028F;

import me.dartcv.nuke.BuildConfig;
import p112W2.InterfaceC1599a;

/* JADX INFO: renamed from: F.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0342c implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f1076d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC1599a f1077e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC0342c(InterfaceC1599a interfaceC1599a, int i5) {
        this.f1076d = i5;
        this.f1077e = interfaceC1599a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1076d) {
            case 0:
                this.f1077e.mo6a();
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f1077e.mo6a();
                break;
            case 2:
                this.f1077e.mo6a();
                break;
            case 3:
                this.f1077e.mo6a();
                break;
            case 4:
                this.f1077e.mo6a();
                break;
            default:
                this.f1077e.mo6a();
                break;
        }
    }
}
