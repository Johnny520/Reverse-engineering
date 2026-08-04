package yyds;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: yyds.ᲁᛷᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2274 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final HashMap f11204 = new HashMap();

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final HashMap f11205;

    public C2274(HashMap map) {
        this.f11205 = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0637 enumC0637 = (EnumC0637) entry.getValue();
            List arrayList = (List) this.f11204.get(enumC0637);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f11204.put(enumC0637, arrayList);
            }
            arrayList.add((C2538) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m4284(List list, InterfaceC2345 interfaceC2345, EnumC0637 enumC0637, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C2538 c2538 = (C2538) list.get(size);
                Method method = c2538.f12517;
                try {
                    int i = c2538.f12516;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, interfaceC2345);
                    } else if (i == 2) {
                        method.invoke(obj, interfaceC2345, enumC0637);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    C1693.m3442("Failed to call observer method", e2.getCause());
                    return;
                }
            }
        }
    }
}
