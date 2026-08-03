package io.sentry.android.core.internal.util;

import android.os.Handler;
import android.view.Window;
import io.sentry.EnumC1657a2;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: io.sentry.android.core.internal.util.k */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC1723k implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6248a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1727o f6249b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Window f6250c;

    public /* synthetic */ RunnableC1723k(C1727o r1, Window r2, int r3) {
        this.f6248a = r3;
        this.f6249b = r1;
        this.f6250c = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch(this.f6248a) {
            case 0: goto L15;
            default: goto L4;
        };
    L4:
        C1727o r0 = this.f6249b;
        Window r1 = this.f6250c;
    L12:
        th = move-exception;
        r0.f6259c.mo3683r(EnumC1657a2.ERROR, "Failed to remove frameMetricsAvailableListener", th);
        return;
    L6:
        if (r0.f6258b.remove(r1) == false) goto L29;
        C1715c r2 = r0.f6264h;     // Catch: Throwable -> L12
        WindowOnFrameMetricsAvailableListenerC1725m r3 = r0.f6265i;     // Catch: Throwable -> L12
        r2.getClass();     // Catch: Throwable -> L12
        if (r3 == null) goto L30;
        r1.removeOnFrameMetricsAvailableListener(r3);     // Catch: Throwable -> L12
        return;
    L30:
        return;
    L29:
        return;
    L15:
        C1727o r02 = this.f6249b;
        CopyOnWriteArraySet r12 = r02.f6258b;
        Window r22 = this.f6250c;
        if (r12.add(r22) == false) goto L32;
        C1715c r13 = r02.f6264h;     // Catch: Throwable -> L22
        WindowOnFrameMetricsAvailableListenerC1725m r32 = r02.f6265i;     // Catch: Throwable -> L22
        Handler r4 = r02.f6260d;     // Catch: Throwable -> L22
        r13.getClass();     // Catch: Throwable -> L22
        if (r32 == null) goto L33;
        r22.addOnFrameMetricsAvailableListener(r32, r4);     // Catch: Throwable -> L22
        return;
    L33:
        return;
    L22:
        th = move-exception;
        r02.f6259c.mo3683r(EnumC1657a2.ERROR, "Failed to add frameMetricsAvailableListener", th);
        return;
    }
}
