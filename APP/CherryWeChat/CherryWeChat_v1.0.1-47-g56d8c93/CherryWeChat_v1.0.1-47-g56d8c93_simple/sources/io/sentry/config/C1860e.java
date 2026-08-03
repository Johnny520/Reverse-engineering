package io.sentry.config;

import io.sentry.util.AbstractC2038j;
import java.util.HashMap;
import java.util.Iterator;
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

    public C1860e(String r1, Properties r2) {
        this.f6680a = r1;
        AbstractC1856a.m4048D("properties are required", r2);
        this.f6681b = r2;
    }

    @Override // io.sentry.config.InterfaceC1859d
    /* JADX INFO: renamed from: a */
    public final Map mo4081a() {
        String r0 = AbstractC0213Ey.m410h(new StringBuilder(), this.f6680a, "tags.");
        HashMap r1 = new HashMap();
        Iterator r2 = this.f6681b.entrySet().iterator();
    L4:
        if (r2.hasNext() == false) goto L12;
        Map.Entry r3 = (Map.Entry) r2.next();
        if ((r3.getKey() instanceof String) == false) goto L4;
        if ((r3.getValue() instanceof String) == false) goto L4;
        String r4 = (String) r3.getKey();
        if (r4.startsWith(r0) == false) goto L4;
        String r32 = AbstractC2038j.m4183b((String) r3.getValue());
        r1.put(r4.substring(r0.length()), r32);
        goto L4
    L12:
        return r1;
    }

    @Override // io.sentry.config.InterfaceC1859d
    public final String getProperty(String r3) {
        return AbstractC2038j.m4183b(this.f6681b.getProperty(this.f6680a + r3));
    }

    public C1860e(Properties r2) {
        this("", r2);
    }
}
