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

    public /* synthetic */ C1676T(int r1) {
        this.f6038a = r1;
    }

    @Override // io.sentry.InterfaceC2000s1
    /* JADX INFO: renamed from: b */
    public void mo1424b(InterfaceC1645X r3) {
        switch(this.f6038a) {
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        r3.mo3774r(new C2464rl(15, r3));
        return;
    L6:
        r3.mo3767k(C1970t.f7011b);
    }

    @Override // io.sentry.util.InterfaceC2031c
    /* JADX INFO: renamed from: c */
    public Object mo3688c() {
        switch(this.f6038a) {
            case 0: goto L15;
            case 3: goto L6;
            default: goto L5;
        };
    L6:
        ConcurrentHashMap r0 = new ConcurrentHashMap();
        EnumC1853d[] r1 = EnumC1853d.values();
        int r2 = r1.length;
        int r4 = 0;
    L7:
        if (r4 >= r2) goto L13;
        EnumC1853d r5 = r1[r4];
        EnumC1929n[] r6 = EnumC1929n.values();
        int r7 = r6.length;
        int r8 = 0;
    L9:
        if (r8 >= r7) goto L11;
        r0.put(new C1852c(r5.getReason(), r6[r8].getCategory()), new AtomicLong(0));
        r8 = r8 + 1;
        goto L9
    L11:
        r4 = r4 + 1;
        goto L7
    L13:
        return Collections.unmodifiableMap(r0);
    L5:
        return AbstractC1856a.m4065k();
    L15:
        return new Timer(true);
    }
}
