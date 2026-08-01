package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: va */
/* JADX INFO: loaded from: classes.dex */
public final class C0811va {

    /* JADX INFO: renamed from: a */
    public final HashMap f4922a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f4923b;

    public C0811va(HashMap map) {
        this.f4923b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0494mq enumC0494mq = (EnumC0494mq) entry.getValue();
            List arrayList = (List) this.f4922a.get(enumC0494mq);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f4922a.put(enumC0494mq, arrayList);
            }
            arrayList.add((C0849wa) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2554a(List list, InterfaceC0716sq interfaceC0716sq, EnumC0494mq enumC0494mq, InterfaceC0679rq interfaceC0679rq) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0849wa c0849wa = (C0849wa) list.get(size);
                Method method = c0849wa.f5076b;
                try {
                    int i = c0849wa.f5075a;
                    if (i == 0) {
                        method.invoke(interfaceC0679rq, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC0679rq, interfaceC0716sq);
                    } else if (i == 2) {
                        method.invoke(interfaceC0679rq, interfaceC0716sq, enumC0494mq);
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
