package io.sentry.android.core;

import io.sentry.EnumC1929n;
import io.sentry.InterfaceC1645X;
import io.sentry.InterfaceC2000s1;
import io.sentry.clientreport.C1852c;
import io.sentry.clientreport.EnumC1853d;
import io.sentry.config.AbstractC1856a;
import io.sentry.protocol.C1970t;
import io.sentry.util.InterfaceC2031c;
import java.util.Collections;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import p000.C2464rl;

/* JADX INFO: renamed from: io.sentry.android.core.T */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1676T implements InterfaceC2031c, InterfaceC2000s1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6038a;

    public /* synthetic */ C1676T(int i) {
        this.f6038a = i;
    }

    @Override // io.sentry.InterfaceC2000s1
    /* JADX INFO: renamed from: b */
    public void mo1424b(InterfaceC1645X interfaceC1645X) {
        switch (this.f6038a) {
            case 2:
                interfaceC1645X.mo3767k(C1970t.f7011b);
                break;
            default:
                interfaceC1645X.mo3774r(new C2464rl(15, interfaceC1645X));
                break;
        }
    }

    @Override // io.sentry.util.InterfaceC2031c
    /* JADX INFO: renamed from: c */
    public Object mo3688c() {
        switch (this.f6038a) {
            case 0:
                return new Timer(true);
            case 3:
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (EnumC1853d enumC1853d : EnumC1853d.values()) {
                    for (EnumC1929n enumC1929n : EnumC1929n.values()) {
                        concurrentHashMap.put(new C1852c(enumC1853d.getReason(), enumC1929n.getCategory()), new AtomicLong(0L));
                    }
                }
                return Collections.unmodifiableMap(concurrentHashMap);
            default:
                return AbstractC1856a.m4065k();
        }
    }
}
