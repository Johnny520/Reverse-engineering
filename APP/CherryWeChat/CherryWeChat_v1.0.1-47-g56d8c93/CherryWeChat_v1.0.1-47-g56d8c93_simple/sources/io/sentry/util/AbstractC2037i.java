package io.sentry.util;

import io.sentry.C1578F;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: io.sentry.util.i */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2037i {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentHashMap f7225a = null;

    static {
        f7225a = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public static boolean m4181a(String r5, List r6) {
        if (r5 == null) goto L31;
        if (r6 == null) goto L31;
        if (r6.isEmpty() == true) goto L31;
        ConcurrentHashMap r1 = f7225a;
        if (r1.containsKey(r5) == true) goto L11;
        Iterator r2 = r6.iterator();
    L14:
        if (r2.hasNext() == false) goto L19;
        if (((C1578F) r2.next()).f5689a.equalsIgnoreCase(r5) == false) goto L14;
        r1.put(r5, Boolean.TRUE);
        return true;
    L19:
        Iterator r62 = r6.iterator();
    L21:
        if (r62.hasNext() == false) goto L30;
        Pattern r22 = ((C1578F) r62.next()).f5690b;     // Catch: Throwable -> L32
        if (r22 != null) goto L26;
        boolean r23 = false;
    L27:
        if (r23 == false) goto L21;
        r1.put(r5, Boolean.TRUE);     // Catch: Throwable -> L32
        return true;
    L26:
        r23 = r22.matcher(r5).matches();     // Catch: Throwable -> L32
        goto L27
    L30:
        r1.put(r5, Boolean.FALSE);
        goto L31
    L11:
        return ((Boolean) r1.get(r5)).booleanValue();
    L31:
        return false;
    }
}
