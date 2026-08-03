package io.sentry.config;

import io.sentry.util.AbstractC2038j;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import p000.AbstractC0213Ey;

/* JADX INFO: renamed from: io.sentry.config.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1860e implements InterfaceC1859d {

    /* JADX INFO: renamed from: a */
    public final String f6680a;

    /* JADX INFO: renamed from: b */
    public final Properties f6681b;

    public C1860e(String str, Properties properties) {
        this.f6680a = str;
        AbstractC1856a.m4048D("properties are required", properties);
        this.f6681b = properties;
    }

    @Override // io.sentry.config.InterfaceC1859d
    /* JADX INFO: renamed from: a */
    public final Map mo4081a() {
        String strM410h = AbstractC0213Ey.m410h(new StringBuilder(), this.f6680a, "tags.");
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f6681b.entrySet()) {
            if ((entry.getKey() instanceof String) && (entry.getValue() instanceof String)) {
                String str = (String) entry.getKey();
                if (str.startsWith(strM410h)) {
                    map.put(str.substring(strM410h.length()), AbstractC2038j.m4183b((String) entry.getValue()));
                }
            }
        }
        return map;
    }

    @Override // io.sentry.config.InterfaceC1859d
    public final String getProperty(String str) {
        return AbstractC2038j.m4183b(this.f6681b.getProperty(this.f6680a + str));
    }

    public C1860e(Properties properties) {
        this("", properties);
    }
}
