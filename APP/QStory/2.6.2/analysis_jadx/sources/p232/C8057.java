package p232;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8057 implements InterfaceC8056 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile boolean f22238;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f22239 = Collections.newSetFromMap(new WeakHashMap());

    @Override // p232.InterfaceC8056
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final void mo12251(FragmentActivity fragmentActivity) {
        if (!this.f22238 && this.f22239.add(fragmentActivity)) {
            View decorView = fragmentActivity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC8058(this, decorView));
        }
    }
}
