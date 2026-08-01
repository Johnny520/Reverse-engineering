package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class vk implements di {
    public final Context a;
    public final y1 b;
    public final vh c;
    public final Object d;
    public Handler e;
    public ThreadPoolExecutor f;
    public ThreadPoolExecutor g;
    public ip h;

    public vk(Context r2, y1 r3) {
        this.d = new Object();
        zt.f("Context cannot be null", r2);
        this.a = r2.getApplicationContext();
        this.b = r3;
        this.c = wk.d;
    }

    public final void a() {
        Object r0 = this.d;
        monitor-enter(r0);
        this.h = null;     // Catch: Throwable -> L8
        Handler r2 = this.e;     // Catch: Throwable -> L8
        if (r2 == null) goto L10;
        r2.removeCallbacks(null);     // Catch: Throwable -> L8
    L10:
        this.e = null;     // Catch: Throwable -> L8
        ThreadPoolExecutor r22 = this.g;     // Catch: Throwable -> L8
        if (r22 == null) goto L13;
        r22.shutdown();     // Catch: Throwable -> L8
    L13:
        this.f = null;     // Catch: Throwable -> L8
        this.g = null;     // Catch: Throwable -> L8
        monitor-exit(r0);     // Catch: Throwable -> L8
        return;
    L8:
        th = move-exception;
        throw th;
    }

    public final gl b() {
        vh r0 = this.c;     // Catch: PackageManager.NameNotFoundException -> L15
        Context r1 = this.a;     // Catch: PackageManager.NameNotFoundException -> L15
        y1 r2 = this.b;     // Catch: PackageManager.NameNotFoundException -> L15
        r0.getClass();     // Catch: PackageManager.NameNotFoundException -> L15
        f2 r02 = a80.m(r1, r2);     // Catch: PackageManager.NameNotFoundException -> L15
        int r12 = r02.a;
        if (r12 != 0) goto L14;
        gl[] r03 = (gl[]) r02.b;
        if (r03 == null) goto L12;
        if (r03.length == 0) goto L12;
        return r03[0];
    L12:
        throw new RuntimeException("fetchFonts failed (empty result)");
    L14:
        throw new RuntimeException("fetchFonts failed (" + r12 + ")");
    L15:
        e = move-exception;
        throw new RuntimeException("provider not found", e);
    }

    @Override // defpackage.di
    public final void e(ip r10) {
        Object r1 = this.d;
        monitor-enter(r1);
        this.h = r10;     // Catch: Throwable -> L22
        monitor-exit(r1);     // Catch: Throwable -> L22
        Object r102 = this.d;
        monitor-enter(r102);
    L12:
        th = move-exception;
        throw th;
    L9:
        if (this.h != null) goto L15;
        monitor-exit(r102);     // Catch: Throwable -> L12
        return;
    L15:
        if (this.f != null) goto L17;
        yb r8 = new yb("emojiCompat");     // Catch: Throwable -> L12
        ThreadPoolExecutor r12 = new ThreadPoolExecutor(0, 1, 15, TimeUnit.SECONDS, new LinkedBlockingDeque(), r8);     // Catch: Throwable -> L12
        r12.allowCoreThreadTimeOut(true);     // Catch: Throwable -> L12
        this.g = r12;     // Catch: Throwable -> L12
        this.f = r12;     // Catch: Throwable -> L12
    L17:
        this.f.execute(new p1(7, this));     // Catch: Throwable -> L12
        monitor-exit(r102);     // Catch: Throwable -> L12
        return;
    L22:
        th = move-exception;
        throw th;
    }
}
