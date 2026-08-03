package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0524a {

    /* JADX INFO: renamed from: a */
    public final HashMap f1473a;

    /* JADX INFO: renamed from: b */
    public final Map f1474b;

    public C0524a(HashMap r5) {
        this.f1474b = r5;
        this.f1473a = new HashMap();
        Iterator r52 = r5.entrySet().iterator();
    L4:
        if (r52.hasNext() == false) goto L9;
        Map.Entry r02 = (Map.Entry) r52.next();
        EnumC0535l r1 = (EnumC0535l) r02.getValue();
        List r2 = (List) this.f1473a.get(r1);
        if (r2 != null) goto L8;
        r2 = new ArrayList();
        this.f1473a.put(r1, r2);
    L8:
        r2.add((C0525b) r02.getKey());
        goto L4
    }

    /* JADX INFO: renamed from: a */
    public static void m1248a(List r5, InterfaceC0541r r6, EnumC0535l r7, Object r8) {
        if (r5 == null) goto L25;
        int r02 = r5.size() - 1;
    L4:
        if (r02 < 0) goto L33;
        C0525b r2 = (C0525b) r5.get(r02);
        r2.getClass();
        int r3 = r2.f1475a;     // Catch: IllegalAccessException -> L14 InvocationTargetException -> L16
        Method r22 = r2.f1476b;
        if (r3 == 0) goto L19;
        if (r3 != 1) goto L11;
        r22.invoke(r8, new Object[]{r6});     // Catch: IllegalAccessException -> L14 InvocationTargetException -> L16
    L20:
        r02 = r02 - 1;
        goto L4
    L11:
        if (r3 != 2) goto L20;
        r22.invoke(r8, new Object[]{r6, r7});     // Catch: IllegalAccessException -> L14 InvocationTargetException -> L16
        goto L20
    L19:
        r22.invoke(r8, null);     // Catch: IllegalAccessException -> L14 InvocationTargetException -> L16
        goto L20
    L14:
        e = move-exception;
        throw new RuntimeException(e);
    L16:
        e = move-exception;
        throw new RuntimeException("Failed to call observer method", e.getCause());
    L33:
        return;
    }
}
