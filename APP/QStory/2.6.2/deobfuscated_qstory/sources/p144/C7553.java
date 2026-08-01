package p144;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C0073;

/* JADX INFO: renamed from: 飘花落叶言子兰楪苏哲世.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7553 extends AbstractC7554 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f20450;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final OnBackInvokedCallback f20451;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f20452;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final OnBackInvokedDispatcher f20453;

    public C7553(OnBackInvokedDispatcher onBackInvokedDispatcher, int i) {
        this.f20453 = onBackInvokedDispatcher;
        this.f20452 = i;
        this.f20451 = Build.VERSION.SDK_INT == 33 ? new C0073(this, 2) : new C7552(this);
    }

    @Override // p144.AbstractC7554
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo63(boolean z) {
        OnBackInvokedCallback onBackInvokedCallback = this.f20451;
        if (z && !this.f20450) {
            this.f20453.registerOnBackInvokedCallback(this.f20452, onBackInvokedCallback);
            this.f20450 = true;
        } else {
            if (z || !this.f20450) {
                return;
            }
            this.f20453.unregisterOnBackInvokedCallback(onBackInvokedCallback);
            this.f20450 = false;
        }
    }
}
