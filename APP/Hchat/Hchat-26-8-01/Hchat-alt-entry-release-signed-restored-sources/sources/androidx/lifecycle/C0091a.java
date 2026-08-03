package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p012ah.C0086a;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0091a {

    /* JADX INFO: renamed from: a */
    public final HashMap f273a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f274b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0091a(HashMap map) {
        this.f274b = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC0106k enumC0106k = (EnumC0106k) entry.getValue();
            List arrayList = (List) this.f273a.get(enumC0106k);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f273a.put(enumC0106k, arrayList);
            }
            arrayList.add((C0093b) entry.getKey());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m508a(List list, InterfaceC0112q interfaceC0112q, EnumC0106k enumC0106k, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0093b c0093b = (C0093b) list.get(size);
                Method method = c0093b.f276b;
                try {
                    int i9 = c0093b.f275a;
                    if (i9 == 0) {
                        method.invoke(obj, null);
                    } else if (i9 == 1) {
                        method.invoke(obj, interfaceC0112q);
                    } else if (i9 == 2) {
                        method.invoke(obj, interfaceC0112q, enumC0106k);
                    }
                } catch (IllegalAccessException e6) {
                    throw new RuntimeException(e6);
                } catch (InvocationTargetException e7) {
                    C0086a.m457p("Failed to call observer method", e7.getCause());
                    return;
                }
            }
        }
    }
}
