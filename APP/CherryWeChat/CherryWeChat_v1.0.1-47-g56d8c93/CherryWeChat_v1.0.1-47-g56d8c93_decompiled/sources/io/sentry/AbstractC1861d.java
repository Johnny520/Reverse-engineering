package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.d */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1861d {
    /* JADX INFO: renamed from: a */
    public static void m4086a(HashMap map, String str, C1901c c1901c, String str2, ILogger iLogger) {
        Object obj = map.get(str);
        c1901c.m4106p(str2);
        c1901c.m4112w(iLogger, obj);
    }

    /* JADX INFO: renamed from: b */
    public static void m4087b(ConcurrentHashMap concurrentHashMap, String str, C1901c c1901c, String str2, ILogger iLogger) {
        Object obj = concurrentHashMap.get(str);
        c1901c.m4106p(str2);
        c1901c.m4112w(iLogger, obj);
    }
}
