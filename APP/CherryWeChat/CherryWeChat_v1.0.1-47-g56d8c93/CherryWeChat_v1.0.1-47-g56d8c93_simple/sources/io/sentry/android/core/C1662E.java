package io.sentry.android.core;

import android.os.Handler;
import androidx.lifecycle.ProcessLifecycleOwner;
import io.sentry.C1611N0;
import io.sentry.C1981r;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.RunnableC1631S1;
import io.sentry.android.core.internal.util.C1716d;
import io.sentry.util.C2029a;
import java.io.Closeable;
import p000.RunnableC2260n3;

/* JADX INFO: renamed from: io.sentry.android.core.E */
/* JADX INFO: loaded from: classes.dex */
public final class C1662E implements Closeable {

    /* JADX INFO: renamed from: e */
    public static final C1662E f5959e = null;

    /* JADX INFO: renamed from: a */
    public final C2029a f5960a;

    /* JADX INFO: renamed from: b */
    public volatile C1661D f5961b;

    /* JADX INFO: renamed from: c */
    public final C1666I f5962c;

    /* JADX INFO: renamed from: d */
    public volatile Boolean f5963d;

    static {
        f5959e = new C1662E();
    }

    public C1662E() {
        this.f5960a = new C2029a();
        this.f5962c = new C1666I();
        this.f5963d = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m3813m();
    }

    /* JADX INFO: renamed from: d */
    public final void m3809d(InterfaceC1659B r3) {
        C1981r r0 = this.f5960a.m4173a();
        m3811i(C1611N0.f5797a);     // Catch: Throwable -> L7
        if (this.f5961b == null) goto L9;
        this.f5961b.f5957a.add(r3);     // Catch: Throwable -> L7
    L9:
        r0.close();
        return;
    L7:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    }

    /* JADX INFO: renamed from: f */
    public final void m3810f(ILogger r4) {
        C1661D r0 = this.f5961b;
        if (r0 == null) goto L11;
        ProcessLifecycleOwner.f3964i.f3970f.mo1555a(r0);     // Catch: Throwable -> L6
        return;
    L6:
        th = move-exception;
        this.f5961b = null;
        r4.mo3683r(EnumC1657a2.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
        return;
    }

    /* JADX INFO: renamed from: i */
    public final void m3811i(ILogger r4) {
        if (this.f5961b != null) goto L18;
        ProcessLifecycleOwner r0 = ProcessLifecycleOwner.f3964i;     // Catch: Throwable -> L9 ClassNotFoundException -> L14
        this.f5961b = new C1661D(this);     // Catch: Throwable -> L9 ClassNotFoundException -> L14
        if (C1716d.f6223a.mo3902c() == false) goto L11;
        m3810f(r4);     // Catch: Throwable -> L9 ClassNotFoundException -> L14
        return;
    L11:
        C1666I r02 = this.f5962c;     // Catch: Throwable -> L9 ClassNotFoundException -> L14
        RunnableC2260n3 r1 = new RunnableC2260n3(24, this, r4);     // Catch: Throwable -> L9 ClassNotFoundException -> L14
        ((Handler) r02.f5974a).post(r1);     // Catch: Throwable -> L9 ClassNotFoundException -> L14
        return;
    L14:
        r4.mo3680e(EnumC1657a2.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        return;
    L9:
        th = move-exception;
        r4.mo3683r(EnumC1657a2.ERROR, "AppState could not register lifecycle observer", th);
        return;
    }

    /* JADX INFO: renamed from: l */
    public final void m3812l(InterfaceC1659B r3) {
        C1981r r0 = this.f5960a.m4173a();
    L7:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L13
    L15:
        throw th;
    L13:
        th = move-exception;
        th.addSuppressed(th);
        goto L15
    L4:
        if (this.f5961b == null) goto L9;
        this.f5961b.f5957a.remove(r3);     // Catch: Throwable -> L7
    L9:
        r0.close();
    }

    /* JADX INFO: renamed from: m */
    public final void m3813m() {
        if (this.f5961b == null) goto L25;
        C1981r r0 = this.f5960a.m4173a();
        C1661D r1 = this.f5961b;     // Catch: Throwable -> L14
        this.f5961b.f5957a.clear();     // Catch: Throwable -> L14
        this.f5961b = null;     // Catch: Throwable -> L14
        r0.close();
        if (C1716d.f6223a.mo3902c() == false) goto L12;
        if (r1 == null) goto L24;
        ProcessLifecycleOwner.f3964i.f3970f.mo1556b(r1);
        return;
    L24:
        return;
    L12:
        C1666I r02 = this.f5962c;
        RunnableC1631S1 r2 = new RunnableC1631S1(this, r1);
        ((Handler) r02.f5974a).post(r2);
        return;
    L14:
        th = move-exception;
        r0.close();     // Catch: Throwable -> L17
    L19:
        throw th;
    L17:
        th = move-exception;
        th.addSuppressed(th);
        goto L19
    }
}
