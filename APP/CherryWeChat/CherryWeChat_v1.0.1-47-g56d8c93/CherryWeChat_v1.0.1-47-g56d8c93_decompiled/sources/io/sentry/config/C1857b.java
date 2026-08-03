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

    public C1857b(ArrayList arrayList) {
        this.f6679a = arrayList;
    }

    @Override // io.sentry.config.InterfaceC1859d
    /* JADX INFO: renamed from: a */
    public final Map mo4081a() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        Iterator it = this.f6679a.iterator();
        while (it.hasNext()) {
            concurrentHashMap.putAll(((InterfaceC1859d) it.next()).mo4081a());
        }
        return concurrentHashMap;
    }

    @Override // io.sentry.config.InterfaceC1859d
    public final String getProperty(String str) {
        Iterator it = this.f6679a.iterator();
        while (it.hasNext()) {
            String property = ((InterfaceC1859d) it.next()).getProperty(str);
            if (property != null) {
                return property;
            }
        }
        return null;
    }
}
