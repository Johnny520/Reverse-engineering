package p248;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: 飘花落叶言楪世苏兰哲子.飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8887 implements InterfaceC8886 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public volatile boolean f22581;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f22582 = Collections.newSetFromMap(new WeakHashMap());

    @Override // p248.InterfaceC8886
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final void mo12837(FragmentActivity fragmentActivity) {
        if (!this.f22581 && this.f22582.add(fragmentActivity)) {
            View decorView = fragmentActivity.getWindow().getDecorView();
            decorView.getViewTreeObserver().addOnDrawListener(new ViewTreeObserverOnDrawListenerC8888(this, decorView));
        }
    }
}
