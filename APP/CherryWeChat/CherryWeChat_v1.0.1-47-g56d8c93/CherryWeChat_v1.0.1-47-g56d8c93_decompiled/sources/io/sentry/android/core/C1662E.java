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
    public static final C1662E f5959e = new C1662E();

    /* JADX INFO: renamed from: b */
    public volatile C1661D f5961b;

    /* JADX INFO: renamed from: a */
    public final C2029a f5960a = new C2029a();

    /* JADX INFO: renamed from: c */
    public final C1666I f5962c = new C1666I();

    /* JADX INFO: renamed from: d */
    public volatile Boolean f5963d = null;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m3813m();
    }

    /* JADX INFO: renamed from: d */
    public final void m3809d(InterfaceC1659B interfaceC1659B) {
        C1981r c1981rM4173a = this.f5960a.m4173a();
        try {
            m3811i(C1611N0.f5797a);
            if (this.f5961b != null) {
                this.f5961b.f5957a.add(interfaceC1659B);
            }
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3810f(ILogger iLogger) {
        C1661D c1661d = this.f5961b;
        if (c1661d != null) {
            try {
                ProcessLifecycleOwner.f3964i.f3970f.mo1555a(c1661d);
            } catch (Throwable th) {
                this.f5961b = null;
                iLogger.mo3683r(EnumC1657a2.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th);
            }
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m3811i(ILogger iLogger) {
        if (this.f5961b != null) {
            return;
        }
        try {
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.f3964i;
            this.f5961b = new C1661D(this);
            if (C1716d.f6223a.mo3902c()) {
                m3810f(iLogger);
                return;
            }
            C1666I c1666i = this.f5962c;
            ((Handler) c1666i.f5974a).post(new RunnableC2260n3(24, this, iLogger));
        } catch (ClassNotFoundException unused) {
            iLogger.mo3680e(EnumC1657a2.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th) {
            iLogger.mo3683r(EnumC1657a2.ERROR, "AppState could not register lifecycle observer", th);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m3812l(InterfaceC1659B interfaceC1659B) {
        C1981r c1981rM4173a = this.f5960a.m4173a();
        try {
            if (this.f5961b != null) {
                this.f5961b.f5957a.remove(interfaceC1659B);
            }
            c1981rM4173a.close();
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m3813m() {
        if (this.f5961b == null) {
            return;
        }
        C1981r c1981rM4173a = this.f5960a.m4173a();
        try {
            C1661D c1661d = this.f5961b;
            this.f5961b.f5957a.clear();
            this.f5961b = null;
            c1981rM4173a.close();
            if (C1716d.f6223a.mo3902c()) {
                if (c1661d != null) {
                    ProcessLifecycleOwner.f3964i.f3970f.mo1556b(c1661d);
                }
            } else {
                C1666I c1666i = this.f5962c;
                ((Handler) c1666i.f5974a).post(new RunnableC1631S1(this, c1661d));
            }
        } catch (Throwable th) {
            try {
                c1981rM4173a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
