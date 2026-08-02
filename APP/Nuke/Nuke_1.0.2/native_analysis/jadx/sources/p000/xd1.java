package p000;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class xd1 {

    /* JADX INFO: renamed from: a */
    public final int f12971a;

    /* JADX INFO: renamed from: b */
    public final vb1 f12972b;

    /* JADX INFO: renamed from: c */
    public final i51 f12973c;

    /* JADX INFO: renamed from: d */
    public int f12974d;

    /* JADX INFO: renamed from: e */
    public int f12975e;

    /* JADX INFO: renamed from: f */
    public int f12976f;

    public xd1(int i) {
        this.f12971a = i;
        if (i <= 0) {
            C0676s.m4651j("maxSize <= 0");
            throw null;
        }
        this.f12972b = new vb1(1);
        this.f12973c = new i51(2);
    }

    /* JADX INFO: renamed from: a */
    public final Object m6081a(Object obj) {
        synchronized (this.f12973c) {
            vb1 vb1Var = this.f12972b;
            vb1Var.getClass();
            Object obj2 = vb1Var.f11892a.get(obj);
            if (obj2 != null) {
                this.f12975e++;
                return obj2;
            }
            this.f12976f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0084, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x008c, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m6082b(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.f12973c) {
            this.f12974d++;
            vb1 vb1Var = this.f12972b;
            vb1Var.getClass();
            objPut = vb1Var.f11892a.put(obj, obj2);
            if (objPut != null) {
                this.f12974d--;
            }
        }
        int i = this.f12971a;
        while (true) {
            synchronized (this.f12973c) {
                try {
                    if (this.f12974d < 0 || (this.f12972b.f11892a.isEmpty() && this.f12974d != 0)) {
                        break;
                    }
                    if (this.f12974d <= i || this.f12972b.f11892a.isEmpty()) {
                        break;
                    }
                    Set setEntrySet = this.f12972b.f11892a.entrySet();
                    setEntrySet.getClass();
                    Map.Entry entry = (Map.Entry) AbstractC0142du.m1160p0(setEntrySet);
                    if (entry == null) {
                        return objPut;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    vb1 vb1Var2 = this.f12972b;
                    vb1Var2.getClass();
                    key.getClass();
                    vb1Var2.f11892a.remove(key);
                    int i2 = this.f12974d;
                    value.getClass();
                    this.f12974d = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final String toString() {
        String str;
        synchronized (this.f12973c) {
            try {
                int i = this.f12975e;
                int i2 = this.f12976f + i;
                str = "LruCache[maxSize=" + this.f12971a + ",hits=" + this.f12975e + ",misses=" + this.f12976f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
