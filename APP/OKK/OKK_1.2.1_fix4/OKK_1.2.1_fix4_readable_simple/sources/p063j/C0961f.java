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

    public C0961f(int r4) {
        if (r4 <= 0) goto L7;
        this.f3411c = r4;
        this.f3409a = new LinkedHashMap(0, 0.75f, true);
        return;
    L7:
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* JADX INFO: renamed from: a */
    public final Object m2313a(Object r2) {
        if (r2 == null) goto L18;
        monitor-enter(this);
        Object r22 = this.f3409a.get(r2);     // Catch: Throwable -> L9
        if (r22 == null) goto L11;
        this.f3412d++;
        monitor-exit(this);     // Catch: Throwable -> L9
        return r22;
    L11:
        this.f3413e++;
        monitor-exit(this);     // Catch: Throwable -> L9
        return null;
    L9:
        th = move-exception;
        throw th;
    L18:
        throw new NullPointerException("key == null");
    }

    /* JADX INFO: renamed from: b */
    public final Object m2314b(Object r3, Object r4) {
        if (r3 == null) goto L38;
        monitor-enter(this);
        this.f3410b++;
        Object r32 = this.f3409a.put(r3, r4);     // Catch: Throwable -> L7
        if (r32 == null) goto L9;
        this.f3410b--;
    L9:
        monitor-exit(this);     // Catch: Throwable -> L7
        int r42 = this.f3411c;
    L11:
        monitor-enter(this);
    L19:
        th = move-exception;
        throw th;
    L13:
        if (this.f3410b < 0) goto L32;
        if (this.f3409a.isEmpty() == false) goto L22;
        if (this.f3410b != 0) goto L32;
    L22:
        if (this.f3410b <= r42) goto L29;
        if (this.f3409a.isEmpty() == true) goto L29;
        Map.Entry r02 = (Map.Entry) this.f3409a.entrySet().iterator().next();     // Catch: Throwable -> L19
        Object r1 = r02.getKey();     // Catch: Throwable -> L19
        r02.getValue();     // Catch: Throwable -> L19
        this.f3409a.remove(r1);     // Catch: Throwable -> L19
        this.f3410b--;
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
        int r1 = this.f3412d;     // Catch: Throwable -> L7
        int r2 = this.f3413e + r1;     // Catch: Throwable -> L7
        if (r2 == 0) goto L9;
        int r12 = (r1 * 100) / r2;     // Catch: Throwable -> L7
    L10:
        Locale r22 = Locale.US;     // Catch: Throwable -> L7
        String r02 = "LruCache[maxSize=" + this.f3411c + ",hits=" + this.f3412d + ",misses=" + this.f3413e + ",hitRate=" + r12 + "%]";     // Catch: Throwable -> L7
        monitor-exit(this);
        return r02;
    L9:
        r12 = 0;
    L7:
        th = move-exception;
        throw th;
    }
}
