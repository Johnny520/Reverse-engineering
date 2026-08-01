package androidx.core.view;

import android.view.WindowInsetsController;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子世苏哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WindowInsetsControllerOnControllableInsetsChangedListenerC2209 implements WindowInsetsController.OnControllableInsetsChangedListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ Object f6489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f6490;

    public /* synthetic */ WindowInsetsControllerOnControllableInsetsChangedListenerC2209(Object obj, int i) {
        this.f6490 = i;
        this.f6489 = obj;
    }

    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i) {
        int i2 = this.f6490;
        Object obj = this.f6489;
        switch (i2) {
            case 0:
                ((AtomicBoolean) obj).set((i & 8) != 0);
                return;
            default:
                if (((C2214) obj).f6496 == windowInsetsController) {
                    throw null;
                }
                return;
        }
    }
}
