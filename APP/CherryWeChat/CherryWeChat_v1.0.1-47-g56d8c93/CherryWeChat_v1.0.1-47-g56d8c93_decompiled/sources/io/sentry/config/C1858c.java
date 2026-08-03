package io.sentry.config;

import io.sentry.util.AbstractC2038j;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.config.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1858c implements InterfaceC1859d {
    /* JADX INFO: renamed from: e */
    public static String m4082e(String str) {
        return "SENTRY_" + str.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.InterfaceC1859d
    /* JADX INFO: renamed from: a */
    public final Map mo4081a() {
        String strM4183b;
        String str = m4082e("tags") + "_";
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
            String key = entry.getKey();
            if (key.startsWith(str) && (strM4183b = AbstractC2038j.m4183b(entry.getValue())) != null) {
                concurrentHashMap.put(key.substring(str.length()).toLowerCase(Locale.ROOT), strM4183b);
            }
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.InterfaceC1859d
    public final String getProperty(String str) {
        return AbstractC2038j.m4183b(System.getenv(m4082e(str)));
    }
}
