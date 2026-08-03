package io.sentry.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.config.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1857b implements InterfaceC1859d {

    /* JADX INFO: renamed from: a */
    public final ArrayList f6679a;

    public C1857b(ArrayList r1) {
        this.f6679a = r1;
    }

    @Override // io.sentry.config.InterfaceC1859d
    /* JADX INFO: renamed from: a */
    public final Map mo4081a() {
        ConcurrentHashMap r0 = new ConcurrentHashMap();
        Iterator r1 = this.f6679a.iterator();
    L4:
        if (r1.hasNext() == false) goto L6;
        r0.putAll(((InterfaceC1859d) r1.next()).mo4081a());
        goto L4
    L6:
        return r0;
    }

    @Override // io.sentry.config.InterfaceC1859d
    public final String getProperty(String r3) {
        Iterator r0 = this.f6679a.iterator();
    L4:
        if (r0.hasNext() == false) goto L8;
        String r1 = ((InterfaceC1859d) r0.next()).getProperty(r3);
        if (r1 == null) goto L4;
        return r1;
    L8:
        return null;
    }
}
