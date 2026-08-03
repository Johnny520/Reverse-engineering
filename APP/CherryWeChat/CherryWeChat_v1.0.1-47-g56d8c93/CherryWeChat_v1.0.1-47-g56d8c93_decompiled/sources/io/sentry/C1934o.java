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

    public C1934o(C2046v2 c2046v2) {
        this.f6820a = 1;
        this.f6821b = Collections.synchronizedMap(new WeakHashMap());
        this.f6822c = c2046v2;
    }

    @Override // io.sentry.InterfaceC1566C
    /* JADX INFO: renamed from: i */
    public final C1627R1 mo3585i(C1627R1 c1627r1, C1586H c1586h) {
        C1969s c1969sM3738c;
        String str;
        Long l;
        switch (this.f6820a) {
            case 0:
                if (C1628R2.class.isInstance(AbstractC1856a.m4072s(c1586h)) && (c1969sM3738c = c1627r1.m3738c()) != null && (str = c1969sM3738c.f7004a) != null && (l = c1969sM3738c.f7007d) != null) {
                    Map map = this.f6821b;
                    Long l2 = (Long) map.get(str);
                    if (l2 == null || l2.equals(l)) {
                        map.put(str, l);
                    } else {
                        this.f6822c.getLogger().mo3680e(EnumC1657a2.INFO, "Event %s has been dropped due to multi-threaded deduplication", c1627r1.f5604a);
                        c1586h.m3668c("sentry:eventDropReason", EnumC1887e.MULTITHREADED_DEDUPLICATION);
                    }
                }
                break;
            default:
                C2046v2 c2046v2 = this.f6822c;
                if (c2046v2.isEnableDeduplication()) {
                    Throwable thM3605a = c1627r1.m3605a();
                    if (thM3605a != null) {
                        Map map2 = this.f6821b;
                        if (!map2.containsKey(thM3605a)) {
                            ArrayList arrayList = new ArrayList();
                            for (Throwable cause = thM3605a; cause.getCause() != null; cause = cause.getCause()) {
                                arrayList.add(cause.getCause());
                            }
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                if (map2.containsKey(it.next())) {
                                }
                            }
                            map2.put(thM3605a, null);
                        }
                        c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c1627r1.f5604a);
                    }
                } else {
                    c2046v2.getLogger().mo3680e(EnumC1657a2.DEBUG, "Event deduplication is disabled.", new Object[0]);
                }
                break;
        }
        return c1627r1;
    }

    public C1934o(SentryAndroidOptions sentryAndroidOptions) {
        this.f6820a = 0;
        this.f6821b = Collections.synchronizedMap(new HashMap());
        this.f6822c = sentryAndroidOptions;
    }
}
