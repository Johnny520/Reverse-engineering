package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class na {
    public final HashMap a;
    public final HashMap b;

    public na(HashMap r5) {
        this.b = r5;
        this.a = new HashMap();
        Iterator r52 = r5.entrySet().iterator();
    L4:
        if (r52.hasNext() == false) goto L9;
        Map.Entry r0 = (Map.Entry) r52.next();
        iq r1 = (iq) r0.getValue();
        List r2 = (List) this.a.get(r1);
        if (r2 != null) goto L8;
        r2 = new ArrayList();
        this.a.put(r1, r2);
    L8:
        r2.add((oa) r0.getKey());
        goto L4
    }

    public static void a(List r5, oq r6, iq r7, nq r8) {
        if (r5 == null) goto L22;
        int r0 = r5.size() - 1;
    L4:
        if (r0 < 0) goto L30;
        oa r2 = (oa) r5.get(r0);
        Method r3 = r2.b;
        int r22 = r2.a;     // Catch: IllegalAccessException -> L16 InvocationTargetException -> L19
        if (r22 == 0) goto L14;
        if (r22 != 1) goto L10;
        r3.invoke(r8, new Object[]{r6});     // Catch: IllegalAccessException -> L16 InvocationTargetException -> L19
    L15:
        r0 = r0 - 1;
        goto L4
    L10:
        if (r22 != 2) goto L15;
        r3.invoke(r8, new Object[]{r6, r7});     // Catch: IllegalAccessException -> L16 InvocationTargetException -> L19
        goto L15
    L14:
        r3.invoke(r8, null);     // Catch: IllegalAccessException -> L16 InvocationTargetException -> L19
        goto L15
    L16:
        e = move-exception;
        throw new RuntimeException(e);
    L19:
        e = move-exception;
        throw new RuntimeException("Failed to call observer method", e.getCause());
    L30:
        return;
    }
}
