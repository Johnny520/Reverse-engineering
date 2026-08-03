package p000;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: sq */
/* JADX INFO: loaded from: classes.dex */
public final class C2512sq {
    /* JADX INFO: renamed from: a */
    public static void m4994a(Object obj, Object obj2) {
        C2469rq c2469rq = (C2469rq) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (c2469rq.isEmpty()) {
            return;
        }
        Iterator it = c2469rq.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2469rq m4995b(Object obj, Object obj2) {
        C2469rq c2469rqM4962c = (C2469rq) obj;
        C2469rq c2469rq = (C2469rq) obj2;
        if (!c2469rq.isEmpty()) {
            if (!c2469rqM4962c.f8693a) {
                c2469rqM4962c = c2469rqM4962c.m4962c();
            }
            c2469rqM4962c.m4961b();
            if (!c2469rq.isEmpty()) {
                c2469rqM4962c.putAll(c2469rq);
            }
        }
        return c2469rqM4962c;
    }
}
