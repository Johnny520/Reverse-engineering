package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1861d {
    /* JADX INFO: renamed from: a */
    public static void m4086a(HashMap r0, String r1, C1901c r2, String r3, ILogger r4) {
        Object r02 = r0.get(r1);
        r2.m4106p(r3);
        r2.m4112w(r4, r02);
    }

    /* JADX INFO: renamed from: b */
    public static void m4087b(ConcurrentHashMap r0, String r1, C1901c r2, String r3, ILogger r4) {
        Object r02 = r0.get(r1);
        r2.m4106p(r3);
        r2.m4112w(r4, r02);
    }
}
