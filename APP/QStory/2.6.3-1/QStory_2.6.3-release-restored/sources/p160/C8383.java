package p160;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C0920;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8383 extends AbstractC8384 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f20790;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final OnBackInvokedCallback f20791;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f20792;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final OnBackInvokedDispatcher f20793;

    public C8383(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f20793 = onBackInvokedDispatcher;
        this.f20792 = i;
        this.f20791 = Build.VERSION.SDK_INT == 33 ? new C0920(this, 2) : new C8382(this);
    }

    @Override // p160.AbstractC8384
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo623(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.f20791;
        if (z && !this.f20790) {
            this.f20793.registerOnBackInvokedCallback(this.f20792, onBackInvokedCallback);
            this.f20790 = true;
        } else {
            if (z || !this.f20790) {
                return;
            }
            this.f20793.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f20790 = false;
        }
    }
}
