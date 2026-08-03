package p000;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: Cp */
/* JADX INFO: loaded from: classes.dex */
public class C0118Cp {

    /* JADX INFO: renamed from: a */
    public final long f287a;

    /* JADX INFO: renamed from: b */
    public long f288b;

    /* JADX INFO: renamed from: c */
    public final Object f289c;

    public C0118Cp(long j) {
        this.f289c = new LinkedHashMap(100, 0.75f, true);
        this.f287a = j;
    }

    /* JADX INFO: renamed from: a */
    public synchronized Object m186a(Object obj) {
        C0075Bp c0075Bp;
        c0075Bp = (C0075Bp) ((LinkedHashMap) this.f289c).get(obj);
        return c0075Bp != null ? c0075Bp.f175a : null;
    }

    /* JADX INFO: renamed from: b */
    public int mo187b(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public void mo188c(Object obj, Object obj2) {
    }

    /* JADX INFO: renamed from: d */
    public synchronized Object m189d(Object obj, Object obj2) {
        int iMo187b = mo187b(obj2);
        long j = iMo187b;
        if (j >= this.f287a) {
            mo188c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f288b += j;
        }
        C0075Bp c0075Bp = (C0075Bp) ((LinkedHashMap) this.f289c).put(obj, obj2 == null ? null : new C0075Bp(iMo187b, obj2));
        if (c0075Bp != null) {
            this.f288b -= (long) c0075Bp.f176b;
            if (!c0075Bp.f175a.equals(obj2)) {
                mo188c(obj, c0075Bp.f175a);
            }
        }
        m190e(this.f287a);
        return c0075Bp != null ? c0075Bp.f175a : null;
    }

    /* JADX INFO: renamed from: e */
    public synchronized void m190e(long j) {
        while (this.f288b > j) {
            Iterator it = ((LinkedHashMap) this.f289c).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C0075Bp c0075Bp = (C0075Bp) entry.getValue();
            this.f288b -= (long) c0075Bp.f176b;
            Object key = entry.getKey();
            it.remove();
            mo188c(key, c0075Bp.f175a);
        }
    }

    public C0118Cp(long j, long j2, Date date) {
        this.f287a = j;
        this.f288b = j2;
        this.f289c = date;
    }
}
