package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z52 {
    public final int a;
    public final long b;
    public final xm0 c;
    public final ConcurrentHashMap d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public z52() {
        y52 y52Var = y52.o;
        this.a = AIChatConfig.DefaultMaxTokens;
        this.b = 600000L;
        this.c = y52Var;
        this.d = new ConcurrentHashMap();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean a(String str) {
        ConcurrentHashMap concurrentHashMap;
        long j;
        long jLongValue = ((Number) this.c.a()).longValue();
        while (true) {
            concurrentHashMap = this.d;
            Long l = (Long) concurrentHashMap.get(str);
            j = this.b;
            if (l != null) {
                if (jLongValue - l.longValue() <= j) {
                    return false;
                }
                if (concurrentHashMap.replace(str, l, Long.valueOf(jLongValue))) {
                    break;
                }
            } else {
                if (concurrentHashMap.putIfAbsent(str, Long.valueOf(jLongValue)) == null) {
                    break;
                }
            }
        }
        int size = concurrentHashMap.size();
        int i = this.a;
        if (size <= i) {
            return true;
        }
        long j2 = jLongValue - j;
        Set<Map.Entry> setEntrySet = concurrentHashMap.entrySet();
        setEntrySet.getClass();
        for (Map.Entry entry : setEntrySet) {
            if (((Number) entry.getValue()).longValue() < j2) {
                concurrentHashMap.remove(entry.getKey(), entry.getValue());
            }
        }
        int size2 = concurrentHashMap.size() - i;
        if (size2 <= 0) {
            return true;
        }
        Set setEntrySet2 = concurrentHashMap.entrySet();
        setEntrySet2.getClass();
        for (Map.Entry entry2 : du.B0(size2, du.A0(setEntrySet2, new sl0(18)))) {
            concurrentHashMap.remove(entry2.getKey(), entry2.getValue());
        }
        return true;
    }
}
