package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class wd1 implements x93 {

    /* JADX INFO: renamed from: h */
    public final long f12466h;

    /* JADX INFO: renamed from: i */
    public long f12467i;

    /* JADX INFO: renamed from: j */
    public final Object f12468j;

    public wd1(z93 z93Var) {
        this.f12468j = z93Var;
        this.f12466h = ((long) (z93Var.mo738r() + z93Var.mo736k())) * 1000000;
        this.f12467i = 0L;
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: a */
    public boolean mo121a() {
        return true;
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: b */
    public long mo1171b(AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        return Long.MAX_VALUE;
    }

    /* JADX INFO: renamed from: c */
    public synchronized Object m5869c(Object obj) {
        vd1 vd1Var;
        vd1Var = (vd1) ((LinkedHashMap) this.f12468j).get(obj);
        return vd1Var != null ? vd1Var.f11909a : null;
    }

    /* JADX INFO: renamed from: d */
    public int mo5870d(Object obj) {
        return 1;
    }

    /* JADX INFO: renamed from: f */
    public synchronized Object m5871f(Object obj, Object obj2) {
        int iMo5870d = mo5870d(obj2);
        long j = iMo5870d;
        if (j >= this.f12466h) {
            mo1655e(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f12467i += j;
        }
        vd1 vd1Var = (vd1) ((LinkedHashMap) this.f12468j).put(obj, obj2 == null ? null : new vd1(iMo5870d, obj2));
        if (vd1Var != null) {
            this.f12467i -= (long) vd1Var.f11910b;
            if (!vd1Var.f11909a.equals(obj2)) {
                mo1655e(obj, vd1Var.f11909a);
            }
        }
        m5874i(this.f12466h);
        return vd1Var != null ? vd1Var.f11909a : null;
    }

    /* JADX INFO: renamed from: g */
    public long m5872g(long j) {
        long j2 = j + this.f12467i;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.f12466h;
        return j2 - ((j2 / j3) * j3);
    }

    /* JADX INFO: renamed from: h */
    public AbstractC0494nd m5873h(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        long j2 = this.f12467i;
        long j3 = j + j2;
        long j4 = this.f12466h;
        return j3 > j4 ? ((z93) this.f12468j).mo737q(j4 - j2, abstractC0494nd, abstractC0494nd3, abstractC0494nd2) : abstractC0494nd2;
    }

    /* JADX INFO: renamed from: i */
    public synchronized void m5874i(long j) {
        while (this.f12467i > j) {
            Iterator it = ((LinkedHashMap) this.f12468j).entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            vd1 vd1Var = (vd1) entry.getValue();
            this.f12467i -= (long) vd1Var.f11910b;
            Object key = entry.getKey();
            it.remove();
            mo1655e(key, vd1Var.f11909a);
        }
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: q */
    public AbstractC0494nd mo737q(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        return ((z93) this.f12468j).mo737q(m5872g(j), abstractC0494nd, abstractC0494nd2, m5873h(j, abstractC0494nd, abstractC0494nd3, abstractC0494nd2));
    }

    @Override // p000.x93
    /* JADX INFO: renamed from: s */
    public AbstractC0494nd mo739s(long j, AbstractC0494nd abstractC0494nd, AbstractC0494nd abstractC0494nd2, AbstractC0494nd abstractC0494nd3) {
        return ((z93) this.f12468j).mo739s(m5872g(j), abstractC0494nd, abstractC0494nd2, m5873h(j, abstractC0494nd, abstractC0494nd3, abstractC0494nd2));
    }

    public wd1(long j) {
        this.f12468j = new LinkedHashMap(100, 0.75f, true);
        this.f12466h = j;
    }

    /* JADX INFO: renamed from: e */
    public void mo1655e(Object obj, Object obj2) {
    }
}
