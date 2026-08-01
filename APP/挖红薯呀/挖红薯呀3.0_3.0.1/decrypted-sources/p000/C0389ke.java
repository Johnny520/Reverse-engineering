package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ke */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0389ke {

    /* JADX INFO: renamed from: a */
    public final HashMap f3085a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f3086b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0389ke(HashMap map) {
        this.f3086b = map;
        for (Map.Entry entry : map.entrySet()) {
            q90 q90Var = (q90) entry.getValue();
            List arrayList = (List) this.f3085a.get(q90Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f3085a.put(q90Var, arrayList);
            }
            arrayList.add((C0428le) entry.getKey());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m1789a(List list, x90 x90Var, q90 q90Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0428le c0428le = (C0428le) list.get(size);
                Method method = c0428le.f3423b;
                try {
                    int i = c0428le.f3422a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, x90Var);
                    } else if (i == 2) {
                        method.invoke(obj, x90Var, q90Var);
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
