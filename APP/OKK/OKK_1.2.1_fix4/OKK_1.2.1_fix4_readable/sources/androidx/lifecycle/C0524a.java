package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0524a {

    /* JADX INFO: renamed from: a */
    public final HashMap f1473a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Map f1474b;

    public C0524a(HashMap map) {
        this.f1474b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0535l enumC0535l = (EnumC0535l) entry.getValue();
            List arrayList = (List) this.f1473a.get(enumC0535l);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1473a.put(enumC0535l, arrayList);
            }
            arrayList.add((C0525b) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1248a(List list, InterfaceC0541r interfaceC0541r, EnumC0535l enumC0535l, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0525b c0525b = (C0525b) list.get(size);
                c0525b.getClass();
                try {
                    int i2 = c0525b.f1475a;
                    Method method = c0525b.f1476b;
                    if (i2 == 0) {
                        method.invoke(obj, null);
                    } else if (i2 == 1) {
                        method.invoke(obj, interfaceC0541r);
                    } else if (i2 == 2) {
                        method.invoke(obj, interfaceC0541r, enumC0535l);
                    }
                } catch (IllegalAccessException e2) {
                    throw new RuntimeException(e2);
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException("Failed to call observer method", e3.getCause());
                }
            }
        }
    }
}
