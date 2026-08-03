package io.sentry.android.core;

import android.os.SystemClock;
import io.sentry.C2046v2;
import io.sentry.InterfaceC1935o0;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.C2029a;
import java.util.ArrayList;

/* JADX INFO: renamed from: io.sentry.android.core.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1686b0 {

    /* JADX INFO: renamed from: a */
    public static final long f6089a = SystemClock.uptimeMillis();

    /* JADX INFO: renamed from: b */
    public static final C2029a f6090b = new C2029a();

    /* JADX INFO: renamed from: a */
    public static void m3867a(C2046v2 c2046v2, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1935o0 interfaceC1935o0 : c2046v2.getIntegrations()) {
            if (z && (interfaceC1935o0 instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(interfaceC1935o0);
            }
            if (z2 && (interfaceC1935o0 instanceof SentryTimberIntegration)) {
                arrayList.add(interfaceC1935o0);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                c2046v2.getIntegrations().remove((InterfaceC1935o0) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                c2046v2.getIntegrations().remove((InterfaceC1935o0) arrayList.get(i2));
            }
        }
    }
}
