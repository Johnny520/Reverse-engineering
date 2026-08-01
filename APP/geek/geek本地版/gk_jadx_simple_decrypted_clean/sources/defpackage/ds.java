package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ds {
    public final LinkedHashMap a;
    public int b;
    public final int c;
    public int d;
    public int e;

    public ds(int r4) {
        if (r4 <= 0) goto L7;
        this.c = r4;
        this.a = new LinkedHashMap(0, 0.75f, true);
        return;
    L7:
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object a(Object r2) {
        if (r2 == null) goto L18;
        monitor-enter(this);
        Object r22 = this.a.get(r2);     // Catch: Throwable -> L9
        if (r22 == null) goto L11;
        this.d++;
        monitor-exit(this);     // Catch: Throwable -> L9
        return r22;
    L11:
        this.e++;
        monitor-exit(this);     // Catch: Throwable -> L9
        return null;
    L9:
        th = move-exception;
        throw th;
    L18:
        throw new NullPointerException("key == null");
    }

    public final Object b(Object r3, Object r4) {
        if (r3 == null) goto L38;
        monitor-enter(this);
        this.b++;
        Object r32 = this.a.put(r3, r4);     // Catch: Throwable -> L7
        if (r32 == null) goto L9;
        this.b--;
    L9:
        monitor-exit(this);     // Catch: Throwable -> L7
        int r42 = this.c;
    L11:
        monitor-enter(this);
    L19:
        th = move-exception;
        throw th;
    L13:
        if (this.b < 0) goto L32;
        if (this.a.isEmpty() == false) goto L22;
        if (this.b != 0) goto L32;
    L22:
        if (this.b <= r42) goto L29;
        if (this.a.isEmpty() == true) goto L29;
        Map.Entry r0 = (Map.Entry) this.a.entrySet().iterator().next();     // Catch: Throwable -> L19
        Object r1 = r0.getKey();     // Catch: Throwable -> L19
        r0.getValue();     // Catch: Throwable -> L19
        this.a.remove(r1);     // Catch: Throwable -> L19
        this.b--;
        monitor-exit(this);     // Catch: Throwable -> L19
    L29:
        monitor-exit(this);     // Catch: Throwable -> L19
        return r32;
    L32:
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");     // Catch: Throwable -> L19
    L7:
        th = move-exception;
        throw th;
    L38:
        throw new NullPointerException("key == null || value == null");
    }

    public final synchronized String toString() {
        monitor-enter(this);
        int r1 = this.d;     // Catch: Throwable -> L7
        int r2 = this.e;     // Catch: Throwable -> L7
        int r3 = r1 + r2;     // Catch: Throwable -> L7
        if (r3 == 0) goto L9;
        int r4 = (r1 * 100) / r3;     // Catch: Throwable -> L7
    L10:
        Locale r32 = Locale.US;     // Catch: Throwable -> L7
        String r0 = "LruCache[maxSize=" + this.c + ",hits=" + r1 + ",misses=" + r2 + ",hitRate=" + r4 + "%]";     // Catch: Throwable -> L7
        monitor-exit(this);
        return r0;
    L9:
        r4 = 0;
    L7:
        th = move-exception;
        throw th;
    }
}
