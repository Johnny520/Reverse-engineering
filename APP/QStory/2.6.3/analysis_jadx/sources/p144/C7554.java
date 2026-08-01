package p144;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C0073;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7554 extends AbstractC7555 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f20445;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final OnBackInvokedCallback f20446;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f20447;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final OnBackInvokedDispatcher f20448;

    public C7554(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f20448 = onBackInvokedDispatcher;
        this.f20447 = i;
        this.f20446 = Build.VERSION.SDK_INT == 33 ? new C0073(this, 2) : new C7553(this);
    }

    @Override // p144.AbstractC7555
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo63(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.f20446;
        if (z && !this.f20445) {
            this.f20448.registerOnBackInvokedCallback(this.f20447, onBackInvokedCallback);
            this.f20445 = true;
        } else {
            if (z || !this.f20445) {
                return;
            }
            this.f20448.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f20445 = false;
        }
    }
}
