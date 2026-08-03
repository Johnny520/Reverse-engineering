package io.sentry.protocol;

import io.sentry.AbstractC1861d;
import io.sentry.ILogger;
import io.sentry.InterfaceC1567C0;
import io.sentry.InterfaceC1652Z0;
import io.sentry.internal.debugmeta.C1901c;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: io.sentry.protocol.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1960j implements InterfaceC1567C0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6950a = 1;

    /* JADX INFO: renamed from: b */
    public String f6951b;

    /* JADX INFO: renamed from: c */
    public Object f6952c;

    /* JADX INFO: renamed from: d */
    public AbstractMap f6953d;

    public /* synthetic */ C1960j() {
    }

    @Override // io.sentry.InterfaceC1567C0
    public final void serialize(InterfaceC1652Z0 interfaceC1652Z0, ILogger iLogger) throws IOException {
        switch (this.f6950a) {
            case 0:
                C1901c c1901c = (C1901c) interfaceC1652Z0;
                c1901c.m4101h();
                c1901c.m4106p("value");
                c1901c.m4114y((Number) this.f6952c);
                String str = this.f6951b;
                if (str != null) {
                    c1901c.m4106p("unit");
                    c1901c.m4115z(str);
                }
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.f6953d;
                if (concurrentHashMap != null) {
                    for (String str2 : concurrentHashMap.keySet()) {
                        AbstractC1861d.m4087b((ConcurrentHashMap) this.f6953d, str2, c1901c, str2, iLogger);
                    }
                }
                c1901c.m4102k();
                break;
            default:
                C1901c c1901c2 = (C1901c) interfaceC1652Z0;
                c1901c2.m4101h();
                c1901c2.m4106p("type");
                c1901c2.m4112w(iLogger, this.f6951b);
                c1901c2.m4106p("value");
                c1901c2.m4112w(iLogger, this.f6952c);
                HashMap map = (HashMap) this.f6953d;
                if (map != null) {
                    for (String str3 : map.keySet()) {
                        AbstractC1861d.m4086a((HashMap) this.f6953d, str3, c1901c2, str3, iLogger);
                    }
                }
                c1901c2.m4102k();
                break;
        }
    }

    public C1960j(Number number, String str) {
        this.f6952c = number;
        this.f6951b = str;
    }
}
