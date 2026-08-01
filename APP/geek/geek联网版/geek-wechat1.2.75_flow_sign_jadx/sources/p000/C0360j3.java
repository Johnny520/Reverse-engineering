package p000;

import android.window.OnBackInvokedCallback;
import com.github.megatronking.stringfog.Base64;

/* JADX INFO: renamed from: j3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0360j3 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2651a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f2652b;

    public /* synthetic */ C0360j3(int i, Object obj) {
        this.f2651a = i;
        this.f2652b = obj;
    }

    public final void onBackInvoked() {
        switch (this.f2651a) {
            case Base64.DEFAULT /* 0 */:
                ((LayoutInflaterFactory2C0656r3) this.f2652b).m2207D();
                break;
            case Base64.NO_PADDING /* 1 */:
                InterfaceC0379jm interfaceC0379jm = (InterfaceC0379jm) this.f2652b;
                AbstractC0493mp.m1857g("$onBackInvoked", interfaceC0379jm);
                interfaceC0379jm.mo474a();
                break;
            default:
                ((Runnable) this.f2652b).run();
                break;
        }
    }
}
