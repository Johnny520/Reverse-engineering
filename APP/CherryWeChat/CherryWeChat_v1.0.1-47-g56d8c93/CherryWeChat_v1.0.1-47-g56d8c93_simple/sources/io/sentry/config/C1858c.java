package io.sentry.config;

import io.sentry.util.AbstractC2038j;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.config.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1858c implements InterfaceC1859d {
    /* JADX INFO: renamed from: e */
    public static String m4082e(String r3) {
        return "SENTRY_" + r3.replace(".", "_").replace("-", "_").toUpperCase(Locale.ROOT);
    }

    @Override // io.sentry.config.InterfaceC1859d
    /* JADX INFO: renamed from: a */
    public final Map mo4081a() {
        String r0 = m4082e("tags") + "_";
        ConcurrentHashMap r1 = new ConcurrentHashMap();
        Iterator<Map.Entry<String, String>> r2 = System.getenv().entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L10;
        Map.Entry<String, String> r3 = r2.next();
        String r4 = r3.getKey();
        if (r4.startsWith(r0) == false) goto L4;
        String r32 = AbstractC2038j.m4183b(r3.getValue());
        if (r32 == null) goto L4;
        r1.put(r4.substring(r0.length()).toLowerCase(Locale.ROOT), r32);
        goto L4
    L10:
        return r1;
    }

    @Override // io.sentry.config.InterfaceC1859d
    public final String getProperty(String r1) {
        return AbstractC2038j.m4183b(System.getenv(m4082e(r1)));
    }
}
