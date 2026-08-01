package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0467b {

    /* JADX INFO: renamed from: a */
    public final HashMap f1508a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f1509b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0467b(HashMap map) {
        this.f1509b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0478m enumC0478m = (EnumC0478m) entry.getValue();
            List arrayList = (List) this.f1508a.get(enumC0478m);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f1508a.put(enumC0478m, arrayList);
            }
            arrayList.add((C0468c) entry.getKey());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m921a(List list, InterfaceC0484s interfaceC0484s, EnumC0478m enumC0478m, InterfaceC0483r interfaceC0483r) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0468c c0468c = (C0468c) list.get(size);
                c0468c.getClass();
                try {
                    int i2 = c0468c.f1510a;
                    Method method = c0468c.f1511b;
                    if (i2 == 0) {
                        method.invoke(interfaceC0483r, null);
                    } else if (i2 == 1) {
                        method.invoke(interfaceC0483r, interfaceC0484s);
                    } else if (i2 == 2) {
                        method.invoke(interfaceC0483r, interfaceC0484s, enumC0478m);
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
