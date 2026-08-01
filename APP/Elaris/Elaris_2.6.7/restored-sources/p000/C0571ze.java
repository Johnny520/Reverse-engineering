package p000;

import android.os.IBinder;
import io.github.libxposed.service.XposedService;
import io.github.libxposed.service.XposedServiceHelper;

/* JADX INFO: renamed from: ze */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0571ze implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1166a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ XposedService f1167b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0571ze(XposedService xposedService, int i) {
        this.f1166a = i;
        this.f1167b = xposedService;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.f1166a;
        XposedService xposedService = this.f1167b;
        switch (i) {
            case 0:
                XposedServiceHelper.lambda$registerListener$1(xposedService);
                break;
            default:
                XposedServiceHelper.lambda$onBinderReceived$0(xposedService);
                break;
        }
    }
}
