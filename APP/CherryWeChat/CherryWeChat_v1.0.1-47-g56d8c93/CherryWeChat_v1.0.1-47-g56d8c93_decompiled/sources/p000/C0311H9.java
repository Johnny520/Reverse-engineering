package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: H9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0311H9 {

    /* JADX INFO: renamed from: a */
    public final HashMap f1030a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f1031b;

    public C0311H9(HashMap map) {
        this.f1031b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0632On enumC0632On = (EnumC0632On) entry.getValue();
            List arrayList = (List) this.f1030a.get(enumC0632On);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1030a.put(enumC0632On, arrayList);
            }
            arrayList.add((C0354I9) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m661a(List list, InterfaceC1061Yn interfaceC1061Yn, EnumC0632On enumC0632On, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0354I9 c0354i9 = (C0354I9) list.get(size);
                Method method = c0354i9.f1189b;
                try {
                    int i = c0354i9.f1188a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC1061Yn);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC1061Yn, enumC0632On);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
