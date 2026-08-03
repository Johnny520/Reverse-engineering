package io.sentry;

import io.sentry.internal.debugmeta.C1901c;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1864d2 implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6687a;

    /* JADX INFO: renamed from: b */
    public final Object f6688b;

    /* JADX INFO: renamed from: c */
    public AbstractMap f6689c;

    public /* synthetic */ C1864d2(int i, Object obj) {
        this.f6687a = i;
        this.f6688b = obj;
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) {
        switch (this.f6687a) {
            case 0:
                C1901c c1901c = (C1901c) interfaceC1652Z0;
                c1901c.m4101h();
                c1901c.m4106p("items");
                c1901c.m4112w(iLogger, (List) this.f6688b);
                HashMap map = (HashMap) this.f6689c;
                if (map != null) {
                    for (String str : map.keySet()) {
                        AbstractC1861d.m4086a((HashMap) this.f6689c, str, c1901c, str, iLogger);
                    }
                }
                c1901c.m4102k();
                break;
            default:
                C1901c c1901c2 = (C1901c) interfaceC1652Z0;
                c1901c2.m4101h();
                String str2 = (String) this.f6688b;
                if (str2 != null) {
                    c1901c2.m4106p("source");
                    c1901c2.m4112w(iLogger, str2);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f6689c;
                if (concurrentHashMap != null) {
                    for (String str3 : concurrentHashMap.keySet()) {
                        AbstractC1861d.m4087b((ConcurrentHashMap) this.f6689c, str3, c1901c2, str3, iLogger);
                    }
                }
                c1901c2.m4102k();
                break;
        }
    }
}
