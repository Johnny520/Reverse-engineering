package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1262ce implements InterfaceC0879Ud {

    /* JADX INFO: renamed from: b */
    public final File f4289b;

    /* JADX INFO: renamed from: e */
    public C1219be f4292e;

    /* JADX INFO: renamed from: d */
    public final C0649P3 f4291d = new C0649P3(13);

    /* JADX INFO: renamed from: c */
    public final long f4290c = 262144000;

    /* JADX INFO: renamed from: a */
    public final C0649P3 f4288a = new C0649P3(29);

    public C1262ce(File file) {
        this.f4289b = file;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C1219be m2398a() {
        try {
            if (this.f4292e == null) {
                this.f4292e = C1219be.m2338q(this.f4289b, this.f4290c);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f4292e;
    }

    @Override // p000.InterfaceC0879Ud
    /* JADX INFO: renamed from: b */
    public final File mo1725b(InterfaceC0802Sm interfaceC0802Sm) {
        String strM1277G = this.f4288a.m1277G(interfaceC0802Sm);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC0802Sm);
        }
        try {
            C0132D2 c0132d2M2341o = m2398a().m2341o(strM1277G);
            if (c0132d2M2341o != null) {
                return ((File[]) c0132d2M2341o.f328b)[0];
            }
            return null;
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // p000.InterfaceC0879Ud
    /* JADX INFO: renamed from: d */
    public final void mo1726d(InterfaceC0802Sm interfaceC0802Sm, C2656w4 c2656w4) {
        C0965Wd c0965Wd;
        boolean z;
        String strM1277G = this.f4288a.m1277G(interfaceC0802Sm);
        C0649P3 c0649p3 = this.f4291d;
        synchronized (c0649p3) {
            c0965Wd = (C0965Wd) ((HashMap) c0649p3.f2089b).get(strM1277G);
            if (c0965Wd == null) {
                C2263n6 c2263n6 = (C2263n6) c0649p3.f2090c;
                synchronized (c2263n6.f7981a) {
                    c0965Wd = (C0965Wd) c2263n6.f7981a.poll();
                }
                if (c0965Wd == null) {
                    c0965Wd = new C0965Wd();
                }
                ((HashMap) c0649p3.f2089b).put(strM1277G, c0965Wd);
            }
            c0965Wd.f3007b++;
        }
        c0965Wd.f3006a.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC0802Sm);
            }
            try {
                C1219be c1219beM2398a = m2398a();
                if (c1219beM2398a.m2341o(strM1277G) == null) {
                    C1094Zd c1094ZdM2340l = c1219beM2398a.m2340l(strM1277G);
                    if (c1094ZdM2340l == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: ".concat(strM1277G));
                    }
                    try {
                        if (((InterfaceC0667Pf) c2656w4.f9196b).mo892c(c2656w4.f9197c, c1094ZdM2340l.m2021b(), (C2644vt) c2656w4.f9198d)) {
                            C1219be.m2334d((C1219be) c1094ZdM2340l.f3480d, c1094ZdM2340l, true);
                            c1094ZdM2340l.f3477a = true;
                        }
                        if (!z) {
                            c1094ZdM2340l.m2020a();
                        }
                    } finally {
                        if (!c1094ZdM2340l.f3477a) {
                            try {
                                c1094ZdM2340l.m2020a();
                            } catch (IOException unused) {
                            }
                        }
                    }
                }
            } catch (IOException unused2) {
            }
        } finally {
            this.f4291d.m1286Q(strM1277G);
        }
    }
}
