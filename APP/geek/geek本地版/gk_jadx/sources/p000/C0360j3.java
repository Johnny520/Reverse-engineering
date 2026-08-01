package p000;

import android.window.OnBackInvokedCallback;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: j3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0360j3 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2542a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2543b;

    public /* synthetic */ C0360j3(int i, Object obj) {
        this.f2542a = i;
        this.f2543b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f2542a) {
            case Base64.DEFAULT /* 0 */:
                ((LayoutInflaterFactory2C0657r3) this.f2543b).m2196D();
                break;
            case Base64.NO_PADDING /* 1 */:
                InterfaceC0303hm interfaceC0303hm = (InterfaceC0303hm) this.f2543b;
                AbstractC0346ip.m1503o("$onBackInvoked", interfaceC0303hm);
                interfaceC0303hm.mo10a();
                break;
            default:
                ((Runnable) this.f2543b).run();
                break;
        }
    }
}
