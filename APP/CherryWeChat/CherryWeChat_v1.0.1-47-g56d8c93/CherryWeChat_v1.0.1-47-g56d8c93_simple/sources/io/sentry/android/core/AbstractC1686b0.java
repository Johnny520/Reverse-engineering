package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.C2046v2;
import io.sentry.InterfaceC1935o0;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.C2029a;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.sentry.android.core.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1686b0 {

    /* JADX INFO: renamed from: a */
    public static final long f6089a = 0;

    /* JADX INFO: renamed from: b */
    public static final C2029a f6090b = null;

    static {
        f6089a = SystemClock.uptimeMillis();
        f6090b = new C2029a();
    }

    /* JADX INFO: renamed from: a */
    public static void m3867a(C2046v2 r5, boolean r6, boolean r7) {
        ArrayList r0 = new ArrayList();
        ArrayList r1 = new ArrayList();
        Iterator<InterfaceC1935o0> r2 = r5.getIntegrations().iterator();
    L4:
        if (r2.hasNext() == false) goto L14;
        InterfaceC1935o0 r3 = r2.next();
        if (r6 == true) goto L8;
    L10:
        if (r7 == false) goto L4;
        if ((r3 instanceof SentryTimberIntegration) == false) goto L4;
        r0.add(r3);
        goto L4
    L8:
        if ((r3 instanceof FragmentLifecycleIntegration) == false) goto L10;
        r1.add(r3);
        goto L10
    L14:
        int r72 = 0;
        if (r1.size() <= 1) goto L21;
        int r62 = 0;
    L18:
        if (r62 >= (r1.size() - 1)) goto L21;
        r5.getIntegrations().remove((InterfaceC1935o0) r1.get(r62));
        r62 = r62 + 1;
    L21:
        if (r0.size() > 1) goto L23;
        return;
    L23:
        if (r72 >= (r0.size() - 1)) goto L35;
        r5.getIntegrations().remove((InterfaceC1935o0) r0.get(r72));
        r72 = r72 + 1;
        goto L23
    }
}
