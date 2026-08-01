package p075l;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: l.f */
/* JADX INFO: loaded from: classes.dex */
public class C0748f {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f2533a;

    /* JADX INFO: renamed from: b */
    public int f2534b;

    /* JADX INFO: renamed from: c */
    public final int f2535c;

    /* JADX INFO: renamed from: d */
    public int f2536d;

    /* JADX INFO: renamed from: e */
    public int f2537e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0748f(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f2535c = i2;
        this.f2533a = new LinkedHashMap(0, 0.75f, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m1410a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f2533a.get(obj);
                if (obj2 != null) {
                    this.f2536d++;
                    return obj2;
                }
                this.f2537e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m1411b(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f2534b++;
                objPut = this.f2533a.put(obj, obj2);
                if (objPut != null) {
                    this.f2534b--;
                }
            } finally {
            }
        }
        int i2 = this.f2535c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f2534b < 0 || (this.f2533a.isEmpty() && this.f2534b != 0)) {
                        break;
                    }
                    if (this.f2534b <= i2 || this.f2533a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f2533a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f2533a.remove(key);
                    this.f2534b--;
                } finally {
                }
            }
        }
        return objPut;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final synchronized String toString() {
        int i2;
        int i3;
        int i4;
        try {
            i2 = this.f2536d;
            i3 = this.f2537e;
            int i5 = i2 + i3;
            i4 = i5 != 0 ? (i2 * 100) / i5 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f2535c + ",hits=" + i2 + ",misses=" + i3 + ",hitRate=" + i4 + "%]";
    }
}
