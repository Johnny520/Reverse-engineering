package io.github.cherrywechat.application;

import android.app.Application;
import java.lang.ref.WeakReference;
import p000.AbstractC0966We;
import p000.AbstractC2397q3;
import p000.C0349I4;
import p000.C0607O4;
import p000.C0923Ve;
import p000.C1456gf;
import p000.LayoutInflaterFactory2C0176E3;

/* JADX INFO: loaded from: classes.dex */
public final class MainApplication extends Application {

    /* JADX INFO: renamed from: a */
    public static MainApplication f5549a;

    public MainApplication() {
    }

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        f5549a = this;
        if (AbstractC2397q3.f8399b == (-1)) goto L18;
        AbstractC2397q3.f8399b = -1;
        Object r0 = AbstractC2397q3.f8405h;
        monitor-enter(r0);
        C0607O4 r1 = AbstractC2397q3.f8404g;     // Catch: Throwable -> L12
        r1.getClass();     // Catch: Throwable -> L12
        C0349I4 r2 = new C0349I4(r1);     // Catch: Throwable -> L12
    L8:
        if (r2.hasNext() == false) goto L14;
        AbstractC2397q3 r12 = (AbstractC2397q3) ((WeakReference) r2.next()).get();     // Catch: Throwable -> L12
        if (r12 == null) goto L8;
        ((LayoutInflaterFactory2C0176E3) r12).m350m(true, true);     // Catch: Throwable -> L12
        goto L8
    L14:
        monitor-exit(r0);     // Catch: Throwable -> L12
    L12:
        th = move-exception;
        throw th;
    L18:
        int[] r02 = AbstractC0966We.f3008a;
        new C1456gf(4);
        registerActivityLifecycleCallbacks(new C0923Ve());
    }
}
