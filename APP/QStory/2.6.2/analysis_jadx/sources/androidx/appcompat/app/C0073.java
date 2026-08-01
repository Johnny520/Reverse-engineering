package androidx.appcompat.app;

import android.window.OnBackInvokedCallback;
import p144.C7553;

/* JADX INFO: renamed from: androidx.appcompat.app.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0073 implements OnBackInvokedCallback {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f226;

    public /* synthetic */ C0073(Object obj, int i) {
        this.f226 = i;
        this.f225 = obj;
    }

    public final void onBackInvoked() {
        int i = this.f226;
        Object obj = this.f225;
        switch (i) {
            case 0:
                ((LayoutInflaterFactory2C0068) obj).m225();
                break;
            case 1:
                ((Runnable) obj).run();
                break;
            default:
                ((C7553) obj).m12758();
                break;
        }
    }
}
