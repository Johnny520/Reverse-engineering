package p063j;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: j.f */
/* JADX INFO: loaded from: classes.dex */
public class C0961f {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap f3409a;

    /* JADX INFO: renamed from: b */
    public int f3410b;

    /* JADX INFO: renamed from: c */
    public final int f3411c;

    /* JADX INFO: renamed from: d */
    public int f3412d;

    /* JADX INFO: renamed from: e */
    public int f3413e;

    public C0961f(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f3411c = i2;
        this.f3409a = new LinkedHashMap(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: a */
    public final Object m2313a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                Object obj2 = this.f3409a.get(obj);
                if (obj2 != null) {
                    this.f3412d++;
                    return obj2;
                }
                this.f3413e++;
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0082, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m2314b(Object obj, Object obj2) {
        Object objPut;
        if (obj == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f3410b++;
                objPut = this.f3409a.put(obj, obj2);
                if (objPut != null) {
                    this.f3410b--;
                }
            } finally {
            }
        }
        int i2 = this.f3411c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f3410b < 0 || (this.f3409a.isEmpty() && this.f3410b != 0)) {
                        break;
                    }
                    if (this.f3410b <= i2 || this.f3409a.isEmpty()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) this.f3409a.entrySet().iterator().next();
                    Object key = entry.getKey();
                    entry.getValue();
                    this.f3409a.remove(key);
                    this.f3410b--;
                } finally {
                }
            }
        }
        return objPut;
    }

    public final synchronized String toString() {
        int i2;
        try {
            int i3 = this.f3412d;
            int i4 = this.f3413e + i3;
            i2 = i4 != 0 ? (i3 * 100) / i4 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f3411c + ",hits=" + this.f3412d + ",misses=" + this.f3413e + ",hitRate=" + i2 + "%]";
    }
}
