package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000A.AbstractC0004e;
import p000A.C0005f;
import p000A.C0010k;
import p000A.C0011l;
import p001A0.AbstractC0040p;
import p001A0.RunnableC0028d;
import p037U.AbstractC0358S;
import p089x0.C1121e;

/* JADX INFO: renamed from: androidx.emoji2.text.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0492q implements InterfaceC0484i {

    /* JADX INFO: renamed from: a */
    public final Context f1379a;

    /* JADX INFO: renamed from: b */
    public final C0005f f1380b;

    /* JADX INFO: renamed from: c */
    public final C1121e f1381c;

    /* JADX INFO: renamed from: d */
    public final Object f1382d;

    /* JADX INFO: renamed from: e */
    public Handler f1383e;

    /* JADX INFO: renamed from: f */
    public Executor f1384f;

    /* JADX INFO: renamed from: g */
    public ThreadPoolExecutor f1385g;

    /* JADX INFO: renamed from: h */
    public AbstractC0358S f1386h;

    public C0492q(Context r3, C0005f r4) {
        C1121e r02 = C0493r.f1387d;
        this.f1382d = new Object();
        AbstractC0040p.m106i(r3, "Context cannot be null");
        this.f1379a = r3.getApplicationContext();
        this.f1380b = r4;
        this.f1381c = r02;
    }

    /* JADX INFO: renamed from: a */
    public final void m1209a() {
        Object r02 = this.f1382d;
        monitor-enter(r02);
        this.f1386h = null;     // Catch: Throwable -> L8
        Handler r2 = this.f1383e;     // Catch: Throwable -> L8
        if (r2 == null) goto L10;
        r2.removeCallbacks(null);     // Catch: Throwable -> L8
    L10:
        this.f1383e = null;     // Catch: Throwable -> L8
        ThreadPoolExecutor r22 = this.f1385g;     // Catch: Throwable -> L8
        if (r22 == null) goto L13;
        r22.shutdown();     // Catch: Throwable -> L8
    L13:
        this.f1384f = null;     // Catch: Throwable -> L8
        this.f1385g = null;     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    /* JADX INFO: renamed from: b */
    public final void m1210b() {
        Object r02 = this.f1382d;
        monitor-enter(r02);
    L8:
        th = move-exception;
        throw th;
    L5:
        if (this.f1386h != null) goto L11;
        monitor-exit(r02);     // Catch: Throwable -> L8
        return;
    L11:
        if (this.f1384f != null) goto L13;
        ThreadFactoryC0476a r9 = new ThreadFactoryC0476a("emojiCompat");     // Catch: Throwable -> L8
        ThreadPoolExecutor r1 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), r9);     // Catch: Throwable -> L8
        r1.allowCoreThreadTimeOut(true);     // Catch: Throwable -> L8
        this.f1385g = r1;     // Catch: Throwable -> L8
        this.f1384f = r1;     // Catch: Throwable -> L8
    L13:
        this.f1384f.execute(new RunnableC0028d(3, this));     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
    }

    /* JADX INFO: renamed from: c */
    public final C0011l m1211c() {
        C1121e r02 = this.f1381c;     // Catch: PackageManager.NameNotFoundException -> L15
        Context r1 = this.f1379a;     // Catch: PackageManager.NameNotFoundException -> L15
        C0005f r2 = this.f1380b;     // Catch: PackageManager.NameNotFoundException -> L15
        r02.getClass();     // Catch: PackageManager.NameNotFoundException -> L15
        C0010k r03 = AbstractC0004e.m15a(r1, r2);     // Catch: PackageManager.NameNotFoundException -> L15
        int r12 = r03.f28a;
        if (r12 != 0) goto L14;
        C0011l[] r04 = (C0011l[]) r03.f29b;
        if (r04 == null) goto L12;
        if (r04.length == 0) goto L12;
        return r04[0];
    L12:
        throw new RuntimeException("fetchFonts failed (empty result)");
    L14:
        throw new RuntimeException("fetchFonts failed (" + r12 + ")");
    L15:
        e = move-exception;
        throw new RuntimeException("provider not found", e);
    }

    @Override // androidx.emoji2.text.InterfaceC0484i
    /* JADX INFO: renamed from: p */
    public final void mo350p(AbstractC0358S r2) {
        Object r02 = this.f1382d;
        monitor-enter(r02);
        this.f1386h = r2;     // Catch: Throwable -> L8
        monitor-exit(r02);     // Catch: Throwable -> L8
        m1210b();
        return;
    L8:
        th = move-exception;
        throw th;
    }
}
