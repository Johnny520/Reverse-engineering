package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class et {
    public final HashMap a = new HashMap();
    public final HashMap b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public et(HashMap map) {
        this.b = map;
        for (Map.Entry entry : map.entrySet()) {
            z91 z91Var = (z91) entry.getValue();
            List arrayList = (List) this.a.get(z91Var);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.a.put(z91Var, arrayList);
            }
            arrayList.add((ft) entry.getKey());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static void a(List list, ia1 ia1Var, z91 z91Var, Object obj) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ft ftVar = (ft) list.get(size);
                Method method = ftVar.b;
                try {
                    int i = ftVar.a;
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
