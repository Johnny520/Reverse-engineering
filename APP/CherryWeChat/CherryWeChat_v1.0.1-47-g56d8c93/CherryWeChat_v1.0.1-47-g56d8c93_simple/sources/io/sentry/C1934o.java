package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.config.AbstractC1856a;
import io.sentry.hints.EnumC1887e;
import io.sentry.protocol.C1969s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: io.sentry.o */
/* JADX INFO: loaded from: classes.dex */
public final class C1934o implements InterfaceC1566C {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6820a;

    /* JADX INFO: renamed from: b */
    public final Map f6821b;

    /* JADX INFO: renamed from: c */
    public final C2046v2 f6822c;

    public C1934o(C2046v2 r2) {
        this.f6820a = 1;
        this.f6821b = Collections.synchronizedMap(new WeakHashMap());
        this.f6822c = r2;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 r7, C1586H r8) {
        switch(this.f6820a) {
            case 0: goto L25;
            default: goto L4;
        };
    L4:
        C2046v2 r82 = this.f6822c;
        if (r82.isEnableDeduplication() == false) goto L22;
        Throwable r0 = r7.m3605a();
        if (r0 == null) goto L47;
        Map r1 = this.f6821b;
        if (r1.containsKey(r0) == true) goto L21;
        ArrayList r2 = new ArrayList();
        Throwable r4 = r0;
    L12:
        if (r4.getCause() == null) goto L14;
        r2.add(r4.getCause());
        r4 = r4.getCause();
        goto L12
    L14:
        Iterator r22 = r2.iterator();
    L16:
        if (r22.hasNext() == false) goto L20;
        if (r1.containsKey(r22.next()) == false) goto L16;
    L20:
        r1.put(r0, null);
        return r7;
    L21:
        r82.getLogger().mo3680e(EnumC1657a2.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", new Object[]{r7.f5604a});
        return null;
    L47:
        return r7;
    L22:
        r82.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event deduplication is disabled.", new Object[0]);
        return r7;
    L25:
        if (C1628R2.class.isInstance(AbstractC1856a.m4072s(r8)) == false) goto L51;
        C1969s r02 = r7.m3738c();
        if (r02 == null) goto L52;
        String r12 = r02.f7004a;
        if (r12 == null) goto L53;
        Long r03 = r02.f7007d;
        if (r03 == null) goto L54;
        Map r23 = this.f6821b;
        Long r3 = (Long) r23.get(r12);
        if (r3 != null) goto L39;
    L41:
        r23.put(r12, r03);
        return r7;
    L39:
        if (r3.equals(r03) == true) goto L41;
        this.f6822c.getLogger().mo3680e(EnumC1657a2.INFO, "Event %s has been dropped due to multi-threaded deduplication", new Object[]{r7.f5604a});
        r8.m3668c("sentry:eventDropReason", EnumC1887e.MULTITHREADED_DEDUPLICATION);
        return null;
    L54:
        return r7;
    L53:
        return r7;
    L52:
        return r7;
    L51:
        return r7;
    }

    public C1934o(SentryAndroidOptions r2) {
        this.f6820a = 0;
        this.f6821b = Collections.synchronizedMap(new HashMap());
        this.f6822c = r2;
    }
}
