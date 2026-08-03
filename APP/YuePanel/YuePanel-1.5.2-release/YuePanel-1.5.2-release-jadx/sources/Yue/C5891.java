package Yue;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۨۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5891<K, V> {

    /* JADX INFO: renamed from: ۥ */
    public final LinkedHashMap<K, V> f1757;

    /* JADX INFO: renamed from: ۥ۟ */
    public int f1758;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public int f14606;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public int f14607;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public int f14608;

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public int f14609;

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int f14610;

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public int f14611;

    public C5891(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f14606 = i;
        this.f1757 = new LinkedHashMap<>(0, 0.75f, true);
    }

    public final synchronized String toString() {
        int i;
        int i2;
        try {
            i = this.f14610;
            i2 = this.f14611 + i;
        } catch (Throwable th) {
            throw th;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f14606), Integer.valueOf(this.f14610), Integer.valueOf(this.f14611), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public V m2558(@InterfaceC6391 K k) {
        return null;
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final synchronized int m2559() {
        return this.f14608;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m18253(boolean z, @InterfaceC6391 K k, @InterfaceC6391 V v, @InterfaceC6490 V v2) {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m18254() {
        m18268(-1);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final synchronized int m18255() {
        return this.f14609;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final V m18256(@InterfaceC6391 K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v = this.f1757.get(k);
                if (v != null) {
                    this.f14610++;
                    return v;
                }
                this.f14611++;
                V vM2558 = m2558(k);
                if (vM2558 == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.f14608++;
                        vPut = this.f1757.put(k, vM2558);
                        if (vPut != null) {
                            this.f1757.put(k, vPut);
                        } else {
                            this.f1758 += m18264(k, vM2558);
                        }
                    } finally {
                    }
                }
                if (vPut != null) {
                    m18253(false, k, vM2558, vPut);
                    return vPut;
                }
                m18268(this.f14606);
                return vM2558;
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public final synchronized int m18257() {
        return this.f14610;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final synchronized int m18258() {
        return this.f14606;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public final synchronized int m18259() {
        return this.f14611;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final V m18260(@InterfaceC6391 K k, @InterfaceC6391 V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f14607++;
                this.f1758 += m18264(k, v);
                vPut = this.f1757.put(k, v);
                if (vPut != null) {
                    this.f1758 -= m18264(k, vPut);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vPut != null) {
            m18253(false, k, vPut, v);
        }
        m18268(this.f14606);
        return vPut;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public final synchronized int m18261() {
        return this.f14607;
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final V m18262(@InterfaceC6391 K k) {
        V vRemove;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                vRemove = this.f1757.remove(k);
                if (vRemove != null) {
                    this.f1758 -= m18264(k, vRemove);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (vRemove != null) {
            m18253(false, k, vRemove, null);
        }
        return vRemove;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void m18263(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        synchronized (this) {
            this.f14606 = i;
        }
        m18268(i);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public final int m18264(K k, V v) {
        int iM18266 = m18266(k, v);
        if (iM18266 >= 0) {
            return iM18266;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public final synchronized int m18265() {
        return this.f1758;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public int m18266(@InterfaceC6391 K k, @InterfaceC6391 V v) {
        return 1;
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public final synchronized Map<K, V> m18267() {
        return new LinkedHashMap(this.f1757);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m18268(int i) {
        K key;
        V value;
        while (true) {
            synchronized (this) {
                try {
                    if (this.f1758 < 0 || (this.f1757.isEmpty() && this.f1758 != 0)) {
                        break;
                    }
                    if (this.f1758 <= i || this.f1757.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.f1757.entrySet().iterator().next();
                    key = next.getKey();
                    value = next.getValue();
                    this.f1757.remove(key);
                    this.f1758 -= m18264(key, value);
                    this.f14609++;
                } finally {
                }
            }
            m18253(true, key, value, null);
        }
    }
}
