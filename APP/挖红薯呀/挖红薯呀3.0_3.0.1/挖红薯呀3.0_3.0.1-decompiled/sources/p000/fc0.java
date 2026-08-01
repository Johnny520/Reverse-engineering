package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class fc0 {

    /* JADX INFO: renamed from: a */
    public final int f1671a;

    /* JADX INFO: renamed from: b */
    public final C0910x1 f1672b;

    /* JADX INFO: renamed from: c */
    public final C0675r3 f1673c;

    /* JADX INFO: renamed from: d */
    public int f1674d;

    /* JADX INFO: renamed from: e */
    public int f1675e;

    /* JADX INFO: renamed from: f */
    public int f1676f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fc0(int i) {
        this.f1671a = i;
        if (i <= 0) {
            C0921xc.m5131l("maxSize <= 0");
            throw null;
        }
        this.f1672b = new C0910x1(14);
        this.f1673c = new C0675r3(24);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m1078a(Object obj) {
        synchronized (this.f1673c) {
            C0910x1 c0910x1 = this.f1672b;
            c0910x1.getClass();
            Object obj2 = ((LinkedHashMap) c0910x1.f7232e).get(obj);
            if (obj2 != null) {
                this.f1675e++;
                return obj2;
            }
            this.f1676f++;
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b0, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b8, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1079b(Object obj, Object obj2) {
        Object objPut;
        obj.getClass();
        synchronized (this.f1673c) {
            this.f1674d++;
            C0910x1 c0910x1 = this.f1672b;
            c0910x1.getClass();
            objPut = ((LinkedHashMap) c0910x1.f7232e).put(obj, obj2);
            if (objPut != null) {
                this.f1674d--;
            }
        }
        int i = this.f1671a;
        while (true) {
            synchronized (this.f1673c) {
                try {
                    if (this.f1674d < 0 || (((LinkedHashMap) this.f1672b.f7232e).isEmpty() && this.f1674d != 0)) {
                        break;
                    }
                    if (this.f1674d <= i || ((LinkedHashMap) this.f1672b.f7232e).isEmpty()) {
                        break;
                    }
                    Set setEntrySet = ((LinkedHashMap) this.f1672b.f7232e).entrySet();
                    setEntrySet.getClass();
                    Set set = setEntrySet;
                    Object next = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            next = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            next = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) next;
                    if (entry == null) {
                        return objPut;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C0910x1 c0910x12 = this.f1672b;
                    c0910x12.getClass();
                    key.getClass();
                    ((LinkedHashMap) c0910x12.f7232e).remove(key);
                    int i2 = this.f1674d;
                    value.getClass();
                    this.f1674d = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        String str;
        synchronized (this.f1673c) {
            try {
                int i = this.f1675e;
                int i2 = this.f1676f + i;
                str = "LruCache[maxSize=" + this.f1671a + ",hits=" + this.f1675e + ",misses=" + this.f1676f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
