package p128;

import android.view.ViewGroup;
import androidx.collection.C0257;
import com.alibaba.fastjson2.C2942;
import com.davemorrissey.labs.subscaleview.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7479 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C7467 f20235 = new C7467();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ThreadLocal f20234 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ArrayList f20233 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C0257 m12696() {
        C0257 c0257;
        ThreadLocal threadLocal = f20234;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c0257 = (C0257) weakReference.get()) != null) {
            return c0257;
        }
        C0257 c02572 = new C0257(0);
        threadLocal.set(new WeakReference(c02572));
        return c02572;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m12697(ViewGroup viewGroup, AbstractC7483 abstractC7483) {
        ArrayList arrayList = f20233;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC7483 == null) {
            abstractC7483 = f20235;
        }
        AbstractC7483 abstractC7483Clone = abstractC7483.clone();
        ArrayList arrayList2 = (ArrayList) m12696().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC7483) it.next()).mo12676(viewGroup);
            }
        }
        abstractC7483Clone.m12716(viewGroup, true);
        if (viewGroup.getTag(R.id.transition_current_scene) != null) {
            C2942.m6394();
            return;
        }
        viewGroup.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC7478 viewTreeObserverOnPreDrawListenerC7478 = new ViewTreeObserverOnPreDrawListenerC7478();
        viewTreeObserverOnPreDrawListenerC7478.f20232 = abstractC7483Clone;
        viewTreeObserverOnPreDrawListenerC7478.f20231 = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC7478);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC7478);
    }
}
