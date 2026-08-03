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
    public static final C1716d f6223a = null;

    /* JADX INFO: renamed from: b */
    public static volatile long f6224b;

    static {
        C1716d r0 = new C1716d();
        new Handler(Looper.getMainLooper()).post(new RunnableC2531t8(2));
        f6223a = r0;
        f6224b = Process.myTid();
    }

    @Override // io.sentry.util.thread.InterfaceC2040a
    /* JADX INFO: renamed from: a */
    public final String mo3900a() {
        if (mo3902c() == false) goto L7;
        return "main";
    L7:
        return Thread.currentThread().getName();
    }

    @Override // io.sentry.util.thread.InterfaceC2040a
    /* JADX INFO: renamed from: b */
    public final long mo3901b() {
        return Process.myTid();
    }

    @Override // io.sentry.util.thread.InterfaceC2040a
    /* JADX INFO: renamed from: c */
    public final boolean mo3902c() {
        long r0 = Thread.currentThread().getId();
        if (Looper.getMainLooper().getThread().getId() != r0) goto L6;
        return true;
    L6:
        return false;
    }
}
