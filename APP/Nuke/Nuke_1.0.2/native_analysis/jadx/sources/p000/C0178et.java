package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: et */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0178et {

    /* JADX INFO: renamed from: a */
    public final HashMap f2586a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final HashMap f2587b;

    public C0178et(HashMap map) {
        this.f2587b = map;
        for (Map.Entry entry : map.entrySet()) {
            z91 z91Var = (z91) entry.getValue();
            List arrayList = (List) this.f2586a.get(z91Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2586a.put(z91Var, arrayList);
            }
            arrayList.add((C0215ft) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1417a(List list, ia1 ia1Var, z91 z91Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0215ft c0215ft = (C0215ft) list.get(size);
                Method method = c0215ft.f3132b;
                try {
                    int i = c0215ft.f3131a;
                    if (i == 0) {
                        method.invoke(obj, null);
                    } else if (i == 1) {
                        method.invoke(obj, ia1Var);
                    } else if (i == 2) {
                        method.invoke(obj, ia1Var, z91Var);
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
