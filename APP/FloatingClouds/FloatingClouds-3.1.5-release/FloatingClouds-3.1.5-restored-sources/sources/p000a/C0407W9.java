package p000a;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: a.W9 */
/* JADX INFO: loaded from: classes.dex */
public class C0407W9<K, V> {

    /* JADX INFO: renamed from: a */
    public final LinkedHashMap<K, V> f1550a;

    /* JADX INFO: renamed from: b */
    public int f1551b;

    /* JADX INFO: renamed from: c */
    public final int f1552c;

    /* JADX INFO: renamed from: d */
    public int f1553d;

    /* JADX INFO: renamed from: e */
    public int f1554e;

    public C0407W9(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f1552c = i;
        this.f1550a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: a */
    public final V m1052a(K k) {
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v = this.f1550a.get(k);
                if (v != null) {
                    this.f1553d++;
                    return v;
                }
                this.f1554e++;
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
    public final V m1053b(K k, V v) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f1551b++;
                vPut = this.f1550a.put(k, v);
                if (vPut != null) {
                    this.f1551b--;
                }
            } finally {
            }
        }
        int i = this.f1552c;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f1551b < 0 || (this.f1550a.isEmpty() && this.f1551b != 0)) {
                        break;
                    }
                    if (this.f1551b <= i || this.f1550a.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.f1550a.entrySet().iterator().next();
                    K key = next.getKey();
                    next.getValue();
                    this.f1550a.remove(key);
                    this.f1551b--;
                } finally {
                }
            }
        }
        return vPut;
    }

    public final synchronized String toString() {
        int i;
        int i2;
        int i3;
        try {
            i = this.f1553d;
            i2 = this.f1554e;
            int i4 = i + i2;
            i3 = i4 != 0 ? (i * 100) / i4 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.f1552c + ",hits=" + i + ",misses=" + i2 + ",hitRate=" + i3 + "%]";
    }
}
