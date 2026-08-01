package androidx.lifecycle;

import androidx.collection.C0276;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2394 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f7035;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f7036 = new HashMap();

    public C2394(HashMap map) {
        this.f7035 = map;
        for (Map.Entry entry : map.entrySet()) {
            Lifecycle$Event lifecycle$Event = (Lifecycle$Event) entry.getValue();
            List arrayList = (List) this.f7036.get(lifecycle$Event);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f7036.put(lifecycle$Event, arrayList);
            }
            arrayList.add((C2393) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4499(List list, InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C2393 c2393 = (C2393) list.get(size);
                Method method = c2393.f7033;
                try {
                    int i = c2393.f7034;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC2388);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC2388, lifecycle$Event);
                    }
                } catch (IllegalAccessException e) {
                    C5919.m11252(e);
                    return;
                } catch (InvocationTargetException e2) {
                    C0276.m847("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
