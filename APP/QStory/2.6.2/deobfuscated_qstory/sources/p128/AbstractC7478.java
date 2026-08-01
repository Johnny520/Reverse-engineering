package p128;

import android.view.ViewGroup;
import androidx.collection.C0257;
import com.alibaba.fastjson2.C2941;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7478 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7466 f20240 = new C7466();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ThreadLocal f20239 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ArrayList f20238 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C0257 m12667() {
        C0257 c0257;
        ThreadLocal threadLocal = f20239;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0257 = (C0257) weakReference.get()) != null) {
            return c0257;
        }
        C0257 c02572 = new C0257(0);
        threadLocal.set(new WeakReference(c02572));
        return c02572;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12668(ViewGroup viewGroup, AbstractC7482 abstractC7482) {
        ArrayList arrayList = f20238;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC7482 == null) {
            abstractC7482 = f20240;
        }
        AbstractC7482 abstractC7482Clone = abstractC7482.clone();
        ArrayList arrayList2 = (ArrayList) m12667().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC7482) it.next()).mo12649(viewGroup);
            }
        }
        abstractC7482Clone.m12687(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            C2941.m6336();
            return;
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC7477 viewTreeObserverOnPreDrawListenerC7477 = new ViewTreeObserverOnPreDrawListenerC7477();
        viewTreeObserverOnPreDrawListenerC7477.f20237 = abstractC7482Clone;
        viewTreeObserverOnPreDrawListenerC7477.f20236 = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC7477);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC7477);
    }
}
