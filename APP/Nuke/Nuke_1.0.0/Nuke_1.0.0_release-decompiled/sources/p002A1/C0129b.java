package p002A1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: A1.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0129b {

    /* JADX INFO: renamed from: a */
    public final HashMap f519a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f520b;

    public C0129b(HashMap map) {
        this.f520b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0140m enumC0140m = (EnumC0140m) entry.getValue();
            List arrayList = (List) this.f519a.get(enumC0140m);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f519a.put(enumC0140m, arrayList);
            }
            arrayList.add((C0130c) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m177a(List list, InterfaceC0145r interfaceC0145r, EnumC0140m enumC0140m, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0130c c0130c = (C0130c) list.get(size);
                Method method = c0130c.f522b;
                try {
                    int i5 = c0130c.f521a;
                    if (i5 == 0) {
                        method.invoke(obj, null);
                    } else if (i5 == 1) {
                        method.invoke(obj, interfaceC0145r);
                    } else if (i5 == 2) {
                        method.invoke(obj, interfaceC0145r, enumC0140m);
                    }
                } catch (IllegalAccessException e5) {
                    throw new RuntimeException(e5);
                } catch (InvocationTargetException e6) {
                    throw new RuntimeException("Failed to call observer method", e6.getCause());
                }
            }
        }
    }
}
