package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: sq */
/* JADX INFO: loaded from: classes.dex */
public final class C2512sq {
    /* JADX INFO: renamed from: a */
    public static void m4994a(Object r0, Object r1) {
        C2469rq r02 = (C2469rq) r0;
        if (r1 != null) goto L13;
        if (r02.isEmpty() == true) goto L14;
        Iterator r03 = r02.entrySet().iterator();
        if (r03.hasNext() == true) goto L10;
        return;
    L10:
        Map.Entry r04 = (Map.Entry) r03.next();
        r04.getKey();
        r04.getValue();
        throw null;
    L14:
        return;
    L13:
        throw new ClassCastException();
    }

    /* JADX INFO: renamed from: b */
    public static C2469rq m4995b(Object r1, Object r2) {
        C2469rq r12 = (C2469rq) r1;
        C2469rq r22 = (C2469rq) r2;
        if (r22.isEmpty() == false) goto L5;
    L10:
        return r12;
    L5:
        if (r12.f8693a == true) goto L7;
        r12 = r12.m4962c();
    L7:
        r12.m4961b();
        if (r22.isEmpty() == true) goto L10;
        r12.putAll(r22);
        goto L10
    }
}
