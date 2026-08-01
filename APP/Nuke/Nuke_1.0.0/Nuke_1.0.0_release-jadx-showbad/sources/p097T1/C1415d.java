package p097T1;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import p000A.C0038T0;
import p000A.C0066i0;
import p000A.C0072l0;
import p068N1.C1013c;
import p068N1.C1015e;
import p078P1.C1147i;
import p078P1.InterfaceC1140b;
import p078P1.InterfaceC1144f;

/* JADX INFO: renamed from: T1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1415d implements InterfaceC1412a {

    /* JADX INFO: renamed from: e */
    public final File f5062e;

    /* JADX INFO: renamed from: h */
    public C1015e f5065h;

    /* JADX INFO: renamed from: g */
    public final C0038T0 f5064g = new C0038T0(16);

    /* JADX INFO: renamed from: f */
    public final long f5063f = 262144000;

    /* JADX INFO: renamed from: d */
    public final C0038T0 f5061d = new C0038T0(17);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1415d(File file) {
        this.f5062e = file;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized C1015e m2718a() {
        try {
            if (this.f5065h == null) {
                this.f5065h = C1015e.m2092m(this.f5062e, this.f5063f);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f5065h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p097T1.InterfaceC1412a
    /* JADX INFO: renamed from: c */
    public final File mo152c(InterfaceC1144f interfaceC1144f) {
        String strM55z = this.f5061d.m55z(interfaceC1144f);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strM55z + " for for Key: " + interfaceC1144f);
        }
        try {
            C0066i0 c0066i0M2096j = m2718a().m2096j(strM55z);
            if (c0066i0M2096j != null) {
                return ((File[]) c0066i0M2096j.f297e)[0];
            }
            return null;
        } catch (IOException e5) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e5);
            return null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p097T1.InterfaceC1412a
    /* JADX INFO: renamed from: h */
    public final void mo156h(InterfaceC1144f interfaceC1144f, C0072l0 c0072l0) {
        C1413b c1413b;
        boolean z5;
        String strM55z = this.f5061d.m55z(interfaceC1144f);
        C0038T0 c0038t0 = this.f5064g;
        synchronized (c0038t0) {
            c1413b = (C1413b) ((HashMap) c0038t0.f169e).get(strM55z);
            if (c1413b == null) {
                C1414c c1414c = (C1414c) c0038t0.f170f;
                synchronized (c1414c.f5060a) {
                    c1413b = (C1413b) c1414c.f5060a.poll();
                }
                if (c1413b == null) {
                    c1413b = new C1413b();
                }
                ((HashMap) c0038t0.f169e).put(strM55z, c1413b);
            }
            c1413b.f5059b++;
        }
        c1413b.f5058a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strM55z + " for for Key: " + interfaceC1144f);
            }
            try {
                C1015e c1015eM2718a = m2718a();
                if (c1015eM2718a.m2096j(strM55z) == null) {
                    C1013c c1013cM2095f = c1015eM2718a.m2095f(strM55z);
                    if (c1013cM2095f == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM55z));
                    }
                    try {
                        if (((InterfaceC1140b) c0072l0.f307e).mo34c(c0072l0.f308f, c1013cM2095f.m2082d(), (C1147i) c0072l0.f309g)) {
                            C1015e.m2088b((C1015e) c1013cM2095f.f3131d, c1013cM2095f, true);
                            c1013cM2095f.f3128a = true;
                        }
                        if (!z5) {
                            try {
                                c1013cM2095f.m2080a();
                            } catch (IOException unused) {
                            }
                        }
                    } finally {
                        if (!c1013cM2095f.f3128a) {
                            try {
                                c1013cM2095f.m2080a();
                            } catch (IOException unused2) {
                            }
                        }
                    }
                }
            } catch (IOException e5) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e5);
                }
            }
        } finally {
            this.f5064g.m29C(strM55z);
        }
    }
}
