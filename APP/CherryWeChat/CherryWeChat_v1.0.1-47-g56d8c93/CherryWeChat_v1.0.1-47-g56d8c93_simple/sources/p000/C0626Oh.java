package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: Oh */
/* JADX INFO: loaded from: classes.dex */
public final class C0626Oh implements InterfaceC2321of {

    /* JADX INFO: renamed from: a */
    public final Context f1999a;

    /* JADX INFO: renamed from: b */
    public final C0583Nh f2000b;

    /* JADX INFO: renamed from: c */
    public final C0668Pg f2001c;

    /* JADX INFO: renamed from: d */
    public final Object f2002d;

    /* JADX INFO: renamed from: e */
    public Handler f2003e;

    /* JADX INFO: renamed from: f */
    public ThreadPoolExecutor f2004f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f2005g;

    /* JADX INFO: renamed from: h */
    public AbstractC1293cr f2006h;

    public C0626Oh(Context r2, C0583Nh r3) {
        this.f2002d = new Object();
        AbstractC1293cr.m2548g("Context cannot be null", r2);
        this.f1999a = r2.getApplicationContext();
        this.f2000b = r3;
        this.f2001c = C0669Ph.f2133d;
    }

    @Override // p000.InterfaceC2321of
    /* JADX INFO: renamed from: a */
    public final void mo1218a(AbstractC1293cr r10) {
        Object r1 = this.f2002d;
        monitor-enter(r1);
        this.f2006h = r10;     // Catch: Throwable -> L22
        monitor-exit(r1);     // Catch: Throwable -> L22
        Object r102 = this.f2002d;
        monitor-enter(r102);
    L12:
        th = move-exception;
        throw th;
    L9:
        if (this.f2006h != null) goto L15;
        monitor-exit(r102);     // Catch: Throwable -> L12
        return;
    L15:
        if (this.f2004f != null) goto L17;
        ThreadFactoryC1005Xa r8 = new ThreadFactoryC1005Xa("emojiCompat");     // Catch: Throwable -> L12
        ThreadPoolExecutor r12 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), r8);     // Catch: Throwable -> L12
        r12.allowCoreThreadTimeOut(true);     // Catch: Throwable -> L12
        this.f2005g = r12;     // Catch: Throwable -> L12
        this.f2004f = r12;     // Catch: Throwable -> L12
    L17:
        this.f2004f.execute(new RunnableC0562N2(12, this));     // Catch: Throwable -> L12
        monitor-exit(r102);     // Catch: Throwable -> L12
        return;
    L22:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final void m1219b() {
        Object r0 = this.f2002d;
        monitor-enter(r0);
        this.f2006h = null;     // Catch: Throwable -> L8
        Handler r2 = this.f2003e;     // Catch: Throwable -> L8
        if (r2 == null) goto L10;
        r2.removeCallbacks(null);     // Catch: Throwable -> L8
    L10:
        this.f2003e = null;     // Catch: Throwable -> L8
        ThreadPoolExecutor r22 = this.f2005g;     // Catch: Throwable -> L8
        if (r22 == null) goto L13;
        r22.shutdown();     // Catch: Throwable -> L8
    L13:
        this.f2004f = null;     // Catch: Throwable -> L8
        this.f2005g = null;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: c */
    public final C1098Zh m1220c() {
        C0668Pg r0 = this.f2001c;     // Catch: PackageManager.NameNotFoundException -> L15
        Context r1 = this.f1999a;     // Catch: PackageManager.NameNotFoundException -> L15
        C0583Nh r2 = this.f2000b;     // Catch: PackageManager.NameNotFoundException -> L15
        r0.getClass();     // Catch: PackageManager.NameNotFoundException -> L15
        Object[] r02 = {r2};     // Catch: PackageManager.NameNotFoundException -> L15
        ArrayList r22 = new ArrayList(1);     // Catch: PackageManager.NameNotFoundException -> L15
        Object r03 = r02[0];     // Catch: PackageManager.NameNotFoundException -> L15
        Objects.requireNonNull(r03);     // Catch: PackageManager.NameNotFoundException -> L15
        r22.add(r03);     // Catch: PackageManager.NameNotFoundException -> L15
        C0307H5 r04 = AbstractC0540Mh.m1036a(r1, Collections.unmodifiableList(r22));     // Catch: PackageManager.NameNotFoundException -> L15
        int r12 = r04.f1020a;
        if (r12 != 0) goto L14;
        C1098Zh[] r05 = (C1098Zh[]) ((List) r04.f1021b).get(0);
        if (r05 == null) goto L12;
        if (r05.length == 0) goto L12;
        return r05[0];
    L12:
        throw new RuntimeException("fetchFonts failed (empty result)");
    L14:
        throw new RuntimeException(AbstractC2374ph.m4813j(r12, "fetchFonts failed (", ")"));
    L15:
        e = move-exception;
        throw new RuntimeException("provider not found", e);
    }
}
