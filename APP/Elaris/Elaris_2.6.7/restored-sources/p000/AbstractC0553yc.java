package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: yc */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0553yc {

    /* JADX INFO: renamed from: a */
    public static final Map f1110a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b */
    public static final Map f1111b = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: c */
    public static final Map f1112c = Collections.synchronizedMap(new WeakHashMap());

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1171a(ViewGroup viewGroup) {
        boolean zContainsKey;
        if (viewGroup != null) {
            Map map = f1110a;
            synchronized (map) {
                zContainsKey = map.containsKey(viewGroup);
            }
            if (zContainsKey) {
                m1173c(viewGroup, 1.0f);
                int childCount = viewGroup.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = viewGroup.getChildAt(i);
                    m1173c(childAt, 1.0f);
                    if (childAt != null && Float.compare(childAt.getRotationY(), 0.0f) != 0) {
                        try {
                            childAt.setRotationY(0.0f);
                        } catch (Throwable unused) {
                        }
                    }
                }
                Map map2 = f1110a;
                synchronized (map2) {
                    map2.remove(viewGroup);
                    f1111b.remove(viewGroup);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m1172b() {
        ArrayList arrayList = new ArrayList();
        Map map = f1110a;
        synchronized (map) {
            arrayList.addAll(map.keySet());
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m1171a((ViewGroup) it.next());
        }
        f1112c.clear();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public static boolean m1173c(View view, float f) {
        if (view != null && Float.compare(view.getScaleX(), f) != 0) {
            try {
                view.setScaleX(f);
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
