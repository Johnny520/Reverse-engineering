package p195l2;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: l2.k */
/* JADX INFO: loaded from: classes.dex */
public class C2507k {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f8021a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b */
    public final long f8022b;

    /* JADX INFO: renamed from: c */
    public long f8023c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2507k(long j5) {
        this.f8022b = j5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized Object m4447a(Object obj) {
        C2506j c2506j;
        c2506j = (C2506j) this.f8021a.get(obj);
        return c2506j != null ? c2506j.f8019a : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public int mo2719b(Object obj) {
        return 1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    public final synchronized Object m4448d(Object obj, Object obj2) {
        int iMo2719b = mo2719b(obj2);
        long j5 = iMo2719b;
        if (j5 >= this.f8022b) {
            mo2720c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f8023c += j5;
        }
        C2506j c2506j = (C2506j) this.f8021a.put(obj, obj2 == null ? null : new C2506j(iMo2719b, obj2));
        if (c2506j != null) {
            this.f8023c -= (long) c2506j.f8020b;
            if (!c2506j.f8019a.equals(obj2)) {
                mo2720c(obj, c2506j.f8019a);
            }
        }
        m4449e(this.f8022b);
        return c2506j != null ? c2506j.f8019a : null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public final synchronized void m4449e(long j5) {
        while (this.f8023c > j5) {
            Iterator it = this.f8021a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            C2506j c2506j = (C2506j) entry.getValue();
            this.f8023c -= (long) c2506j.f8020b;
            Object key = entry.getKey();
            it.remove();
            mo2720c(key, c2506j.f8019a);
        }
    }

    /* JADX INFO: renamed from: c */
    public void mo2720c(Object obj, Object obj2) {
    }
}
