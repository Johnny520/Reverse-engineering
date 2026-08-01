package androidx.lifecycle;

import androidx.collection.C0276;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2394 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f7036;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f7037 = new HashMap();

    public C2394(HashMap map) {
        this.f7036 = map;
        for (Map.Entry entry : map.entrySet()) {
            Lifecycle$Event lifecycle$Event = (Lifecycle$Event) entry.getValue();
            List arrayList = (List) this.f7037.get(lifecycle$Event);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f7037.put(lifecycle$Event, arrayList);
            }
            arrayList.add((C2393) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m4509(List list, InterfaceC2388 interfaceC2388, Lifecycle$Event lifecycle$Event, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C2393 c2393 = (C2393) list.get(size);
                Method method = c2393.f7034;
                try {
                    int i = c2393.f7035;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC2388);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC2388, lifecycle$Event);
                    }
                } catch (IllegalAccessException e) {
                    C5925.m11313(e);
                    return;
                } catch (InvocationTargetException e2) {
                    C0276.m848("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
