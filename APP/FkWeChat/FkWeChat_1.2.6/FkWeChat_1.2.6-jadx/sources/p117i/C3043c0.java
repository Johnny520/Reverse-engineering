package p117i;

import p132j.AbstractC3492d;
import p132j.C3490b;
import p132j.C3491c;
import p172l8.C4700i0;

/* JADX INFO: renamed from: i.c0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C3043c0 {

    /* JADX INFO: renamed from: a */
    public int f8079a;

    /* JADX INFO: renamed from: b */
    public final C3491c f8080b;

    /* JADX INFO: renamed from: c */
    public final C3490b f8081c;

    /* JADX INFO: renamed from: d */
    public int f8082d;

    /* JADX INFO: renamed from: e */
    public int f8083e;

    /* JADX INFO: renamed from: f */
    public int f8084f;

    /* JADX INFO: renamed from: g */
    public int f8085g;

    /* JADX INFO: renamed from: h */
    public int f8086h;

    /* JADX INFO: renamed from: i */
    public int f8087i;

    public C3043c0(int i10) {
        this.f8079a = i10;
        if (!(i10 > 0)) {
            AbstractC3492d.m13015a("maxSize <= 0");
        }
        this.f8080b = new C3491c(0, 0.75f);
        this.f8081c = new C3490b();
    }

    /* JADX INFO: renamed from: a */
    public Object m11253a(Object obj) {
        obj.getClass();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m11254b(boolean z10, Object obj, Object obj2, Object obj3) {
        obj.getClass();
        obj2.getClass();
    }

    /* JADX INFO: renamed from: c */
    public final Object m11255c(Object obj) {
        Object objM13013d;
        obj.getClass();
        synchronized (this.f8081c) {
            Object objM13010a = this.f8080b.m13010a(obj);
            if (objM13010a != null) {
                this.f8086h++;
                return objM13010a;
            }
            this.f8087i++;
            Object objM11253a = m11253a(obj);
            if (objM11253a == null) {
                return null;
            }
            synchronized (this.f8081c) {
                try {
                    this.f8084f++;
                    objM13013d = this.f8080b.m13013d(obj, objM11253a);
                    if (objM13013d != null) {
                        this.f8080b.m13013d(obj, objM13013d);
                    } else {
                        this.f8082d += m11258f(obj, objM11253a);
                        C4700i0 c4700i0 = C4700i0.f13910a;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objM13013d != null) {
                m11254b(false, obj, objM11253a, objM13013d);
                return objM13013d;
            }
            m11260h(this.f8079a);
            return objM11253a;
        }
    }

    /* JADX INFO: renamed from: d */
    public final Object m11256d(Object obj, Object obj2) {
        Object objM13013d;
        obj.getClass();
        obj2.getClass();
        synchronized (this.f8081c) {
            try {
                this.f8083e++;
                this.f8082d += m11258f(obj, obj2);
                objM13013d = this.f8080b.m13013d(obj, obj2);
                if (objM13013d != null) {
                    this.f8082d -= m11258f(obj, objM13013d);
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objM13013d != null) {
            m11254b(false, obj, objM13013d, obj2);
        }
        m11260h(this.f8079a);
        return objM13013d;
    }

    /* JADX INFO: renamed from: e */
    public final Object m11257e(Object obj) {
        Object objM13014e;
        obj.getClass();
        synchronized (this.f8081c) {
            try {
                objM13014e = this.f8080b.m13014e(obj);
                if (objM13014e != null) {
                    this.f8082d -= m11258f(obj, objM13014e);
                }
                C4700i0 c4700i0 = C4700i0.f13910a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objM13014e != null) {
            m11254b(false, obj, objM13014e, null);
        }
        return objM13014e;
    }

    /* JADX INFO: renamed from: f */
    public final int m11258f(Object obj, Object obj2) {
        int iM11259g = m11259g(obj, obj2);
        if (!(iM11259g >= 0)) {
            AbstractC3492d.m13016b("Negative size: " + obj + '=' + obj2);
        }
        return iM11259g;
    }

    /* JADX INFO: renamed from: g */
    public int m11259g(Object obj, Object obj2) {
        obj.getClass();
        obj2.getClass();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:
    
        return;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m11260h(int r7) {
        /*
            r6 = this;
        L0:
            j.b r0 = r6.f8081c
            monitor-enter(r0)
            int r1 = r6.f8082d     // Catch: java.lang.Throwable -> L15
            r2 = 1
            if (r1 < 0) goto L19
            j.c r1 = r6.f8080b     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.m13012c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L17
            int r1 = r6.f8082d     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L19
            goto L17
        L15:
            r7 = move-exception
            goto L63
        L17:
            r1 = r2
            goto L1a
        L19:
            r1 = 0
        L1a:
            if (r1 != 0) goto L21
            java.lang.String r1 = "LruCache.sizeOf() is reporting inconsistent results!"
            p132j.AbstractC3492d.m13016b(r1)     // Catch: java.lang.Throwable -> L15
        L21:
            int r1 = r6.f8082d     // Catch: java.lang.Throwable -> L15
            if (r1 <= r7) goto L61
            j.c r1 = r6.f8080b     // Catch: java.lang.Throwable -> L15
            boolean r1 = r1.m13012c()     // Catch: java.lang.Throwable -> L15
            if (r1 == 0) goto L2e
            goto L61
        L2e:
            j.c r1 = r6.f8080b     // Catch: java.lang.Throwable -> L15
            java.util.Set r1 = r1.m13011b()     // Catch: java.lang.Throwable -> L15
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = p185m8.AbstractC5081g0.m20577k0(r1)     // Catch: java.lang.Throwable -> L15
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L15
            if (r1 != 0) goto L40
            monitor-exit(r0)
            return
        L40:
            java.lang.Object r3 = r1.getKey()     // Catch: java.lang.Throwable -> L15
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L15
            j.c r4 = r6.f8080b     // Catch: java.lang.Throwable -> L15
            r4.m13014e(r3)     // Catch: java.lang.Throwable -> L15
            int r4 = r6.f8082d     // Catch: java.lang.Throwable -> L15
            int r5 = r6.m11258f(r3, r1)     // Catch: java.lang.Throwable -> L15
            int r4 = r4 - r5
            r6.f8082d = r4     // Catch: java.lang.Throwable -> L15
            int r4 = r6.f8085g     // Catch: java.lang.Throwable -> L15
            int r4 = r4 + r2
            r6.f8085g = r4     // Catch: java.lang.Throwable -> L15
            monitor-exit(r0)
            r0 = 0
            r6.m11254b(r2, r3, r1, r0)
            goto L0
        L61:
            monitor-exit(r0)
            return
        L63:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p117i.C3043c0.m11260h(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.f8081c) {
            try {
                int i10 = this.f8086h;
                int i11 = this.f8087i + i10;
                str = "LruCache[maxSize=" + this.f8079a + ",hits=" + this.f8086h + ",misses=" + this.f8087i + ",hitRate=" + (i11 != 0 ? (i10 * 100) / i11 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
