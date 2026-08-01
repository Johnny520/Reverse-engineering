package p144;

import android.view.ViewGroup;
import androidx.collection.C1104;
import com.alibaba.fastjson2.C3775;
import com.davemorrissey.labs.subscaleview.C0328R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: 飘花落叶言子兰世哲楪苏.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8308 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C8296 f20580 = new C8296();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final ThreadLocal f20579 = new ThreadLocal();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final ArrayList f20578 = new ArrayList();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C1104 m13255() {
        C1104 c1104;
        ThreadLocal threadLocal = f20579;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1104 = (C1104) weakReference.get()) != null) {
            return c1104;
        }
        C1104 c11042 = new C1104(0);
        threadLocal.set(new WeakReference(c11042));
        return c11042;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m13256(ViewGroup viewGroup, AbstractC8312 abstractC8312) {
        ArrayList arrayList = f20578;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut()) {
            return;
        }
        arrayList.add(viewGroup);
        if (abstractC8312 == null) {
            abstractC8312 = f20580;
        }
        AbstractC8312 abstractC8312Clone = abstractC8312.clone();
        ArrayList arrayList2 = (ArrayList) m13255().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC8312) it.next()).mo13235(viewGroup);
            }
        }
        abstractC8312Clone.m13275(viewGroup, true);
        if (viewGroup.getTag(C0328R.id.transition_current_scene) != null) {
            C3775.m6954();
            return;
        }
        viewGroup.setTag(C0328R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC8307 viewTreeObserverOnPreDrawListenerC8307 = new ViewTreeObserverOnPreDrawListenerC8307();
        viewTreeObserverOnPreDrawListenerC8307.f20577 = abstractC8312Clone;
        viewTreeObserverOnPreDrawListenerC8307.f20576 = viewGroup;
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC8307);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC8307);
    }
}
