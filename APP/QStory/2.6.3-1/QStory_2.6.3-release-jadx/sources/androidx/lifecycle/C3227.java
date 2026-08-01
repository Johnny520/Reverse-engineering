package androidx.lifecycle;

import androidx.collection.C1123;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.lifecycle.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3227 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final HashMap f7381;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final HashMap f7382 = new HashMap();

    public C3227(HashMap map) {
        this.f7381 = map;
        for (Map.Entry entry : map.entrySet()) {
            Lifecycle$Event lifecycle$Event = (Lifecycle$Event) entry.getValue();
            List arrayList = (List) this.f7382.get(lifecycle$Event);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f7382.put(lifecycle$Event, arrayList);
            }
            arrayList.add((C3226) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m5069(List list, InterfaceC3221 interfaceC3221, Lifecycle$Event lifecycle$Event, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C3226 c3226 = (C3226) list.get(size);
                Method method = c3226.f7379;
                try {
                    int i = c3226.f7380;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC3221);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC3221, lifecycle$Event);
                    }
                } catch (IllegalAccessException e) {
                    C6755.m11872(e);
                    return;
                } catch (InvocationTargetException e2) {
                    C1123.m1408("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
