package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: na */
/* JADX INFO: loaded from: classes.dex */
public final class C0515na {

    /* JADX INFO: renamed from: a */
    public final HashMap f3363a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f3364b;

    public C0515na(HashMap map) {
        this.f3364b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0347iq enumC0347iq = (EnumC0347iq) entry.getValue();
            List arrayList = (List) this.f3363a.get(enumC0347iq);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f3363a.put(enumC0347iq, arrayList);
            }
            arrayList.add((C0552oa) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1924a(List list, InterfaceC0568oq interfaceC0568oq, EnumC0347iq enumC0347iq, InterfaceC0531nq interfaceC0531nq) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0552oa c0552oa = (C0552oa) list.get(size);
                Method method = c0552oa.f3517b;
                try {
                    int i = c0552oa.f3516a;
                    if (i == 0) {
                        method.invoke(interfaceC0531nq, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0531nq, interfaceC0568oq);
                    } else if (i == 2) {
                        method.invoke(interfaceC0531nq, interfaceC0568oq, enumC0347iq);
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
