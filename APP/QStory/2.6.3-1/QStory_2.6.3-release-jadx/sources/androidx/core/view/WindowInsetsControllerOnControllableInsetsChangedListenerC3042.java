package androidx.core.view;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WindowInsetsControllerOnControllableInsetsChangedListenerC3042 implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6835;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6836;

    public /* synthetic */ WindowInsetsControllerOnControllableInsetsChangedListenerC3042(Object obj, int i) {
        this.f6836 = i;
        this.f6835 = obj;
    }

    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        int i2 = this.f6836;
        Object obj = this.f6835;
        switch (i2) {
            case 0:
                ((AtomicBoolean) obj).set((i & 8) != 0);
                return;
            default:
                if (((C3047) obj).f6842 == windowInsetsController) {
                    throw null;
                }
                return;
        }
    }
}
