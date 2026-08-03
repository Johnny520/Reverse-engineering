package p000;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Objects;

/* JADX INFO: renamed from: ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1262ce implements InterfaceC0879Ud {

    /* JADX INFO: renamed from: a */
    public final C0649P3 f4288a;

    /* JADX INFO: renamed from: b */
    public final File f4289b;

    /* JADX INFO: renamed from: c */
    public final long f4290c;

    /* JADX INFO: renamed from: d */
    public final C0649P3 f4291d;

    /* JADX INFO: renamed from: e */
    public C1219be f4292e;

    public C1262ce(File r3) {
        this.f4291d = new C0649P3(13);
        this.f4289b = r3;
        this.f4290c = 262144000;
        this.f4288a = new C0649P3(29);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized C1219be m2398a() {
        monitor-enter(this);
    L6:
        th = move-exception;
        throw th;
    L4:
        if (this.f4292e != null) goto L8;
        this.f4292e = C1219be.m2338q(this.f4289b, this.f4290c);     // Catch: Throwable -> L6
    L8:
        C1219be r0 = this.f4292e;     // Catch: Throwable -> L6
        monitor-exit(this);
        return r0;
    }

    @Override // p000.InterfaceC0879Ud
    /* JADX INFO: renamed from: b */
    public final File mo1725b(InterfaceC0802Sm r4) {
        String r0 = this.f4288a.m1277G(r4);
        if (Log.isLoggable("DiskLruCacheWrapper", 2) == false) goto L11;
        Objects.toString(r4);
    L11:
        C0132D2 r02 = m2398a().m2341o(r0);     // Catch: IOException -> L10
        if (r02 == null) goto L13;
        return ((File[]) r02.f328b)[0];
    L13:
        return null;
    L14:
        return null;
    }

    @Override // p000.InterfaceC0879Ud
    /* JADX INFO: renamed from: d */
    public final void mo1726d(InterfaceC0802Sm r7, C2656w4 r8) {
        String r1 = this.f4288a.m1277G(r7);
        C0649P3 r2 = this.f4291d;
        monitor-enter(r2);
        C0965Wd r3 = (C0965Wd) ((HashMap) r2.f2089b).get(r1);     // Catch: Throwable -> L14
        if (r3 != null) goto L19;
        C2263n6 r32 = (C2263n6) r2.f2090c;     // Catch: Throwable -> L14
        ArrayDeque r4 = r32.f7981a;     // Catch: Throwable -> L14
        monitor-enter(r4);     // Catch: Throwable -> L14
        r3 = (C0965Wd) r32.f7981a.poll();     // Catch: Throwable -> L16
        monitor-exit(r4);     // Catch: Throwable -> L16
        if (r3 != null) goto L12;
        r3 = new C0965Wd();     // Catch: Throwable -> L14
    L12:
        ((HashMap) r2.f2089b).put(r1, r3);     // Catch: Throwable -> L14
        goto L19
    L16:
        th = move-exception;
        throw th;     // Catch: Throwable -> L14
    L19:
        r3.f3007b++;
        monitor-exit(r2);     // Catch: Throwable -> L14
        r3.f3006a.lock();
    L26:
        th = move-exception;
        this.f4291d.m1286Q(r1);
        throw th;
    L23:
        if (Log.isLoggable("DiskLruCacheWrapper", 2) == false) goto L59;
        Objects.toString(r7);     // Catch: Throwable -> L26
    L59:
        C1219be r72 = m2398a();     // Catch: Throwable -> L26 IOException -> L52
        if (r72.m2341o(r1) != null) goto L30;
        C1094Zd r73 = r72.m2340l(r1);     // Catch: Throwable -> L26 IOException -> L52
        if (r73 == null) goto L46;
    L40:
        th = move-exception;
        if (r73.f3477a == false) goto L53;
    L44:
        throw th;     // Catch: Throwable -> L26 IOException -> L52
    L53:
        r73.m2020a();     // Catch: Throwable -> L26 IOException -> L51
        goto L44
    L35:
        if (((InterfaceC0667Pf) r8.f9196b).mo892c(r8.f9197c, r73.m2021b(), (C2644vt) r8.f9198d) == false) goto L38;
        C1219be.m2334d((C1219be) r73.f3480d, r73, true);     // Catch: Throwable -> L40
        r73.f3477a = true;     // Catch: Throwable -> L40
    L38:
        if (r73.f3477a == true) goto L30;
        r73.m2020a();     // Catch: Throwable -> L26 IOException -> L52
        goto L30
    L46:
        throw new IllegalStateException("Had two simultaneous puts for: ".concat(r1));     // Catch: Throwable -> L26 IOException -> L52
    L30:
        this.f4291d.m1286Q(r1);
        return;
    L14:
        th = move-exception;
        throw th;
    }
}
