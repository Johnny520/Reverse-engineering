package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;
import p160.C8383;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0920 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f570;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f571;

    public /* synthetic */ C0920(Object obj, int i) {
        this.f571 = i;
        this.f570 = obj;
    }

    public final void onBackInvoked() {
        int i = this.f571;
        Object obj = this.f570;
        switch (i) {
            case 0:
                ((LayoutInflaterFactory2C0915) obj).m786();
                break;
            case 1:
                ((Runnable) obj).run();
                break;
            default:
                ((C8383) obj).m13346();
                break;
        }
    }
}
