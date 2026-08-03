package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import io.sentry.util.thread.InterfaceC2040a;
import p000.RunnableC2531t8;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1716d implements InterfaceC2040a {

    /* JADX INFO: renamed from: a */
    public static final C1716d f6223a;

    /* JADX INFO: renamed from: b */
    public static volatile long f6224b;

    static {
        C1716d c1716d = new C1716d();
        new Handler(Looper.getMainLooper()).post(new RunnableC2531t8(2));
        f6223a = c1716d;
        f6224b = Process.myTid();
    }

    @Override // io.sentry.util.thread.InterfaceC2040a
    /* JADX INFO: renamed from: a */
    public final String mo3900a() {
        return mo3902c() ? "main" : Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.InterfaceC2040a
    /* JADX INFO: renamed from: b */
    public final long mo3901b() {
        return Process.myTid();
    }

    @Override // io.sentry.util.thread.InterfaceC2040a
    /* JADX INFO: renamed from: c */
    public final boolean mo3902c() {
        return Looper.getMainLooper().getThread().getId() == Thread.currentThread().getId();
    }
}
