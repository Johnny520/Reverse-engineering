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
    public static final ConcurrentHashMap f7225a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public static boolean m4181a(String str, List list) {
        if (str != null && list != null && !list.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = f7225a;
            if (concurrentHashMap.containsKey(str)) {
                return ((Boolean) concurrentHashMap.get(str)).booleanValue();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((C1578F) it.next()).f5689a.equalsIgnoreCase(str)) {
                    concurrentHashMap.put(str, Boolean.TRUE);
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    Pattern pattern = ((C1578F) it2.next()).f5690b;
                    if (pattern == null ? false : pattern.matcher(str).matches()) {
                        concurrentHashMap.put(str, Boolean.TRUE);
                        return true;
                    }
                    continue;
                } catch (Throwable unused) {
                }
            }
            concurrentHashMap.put(str, Boolean.FALSE);
        }
        return false;
    }
}
