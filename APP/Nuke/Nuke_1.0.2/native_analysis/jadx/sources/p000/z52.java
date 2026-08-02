package p000;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class z52 {

    /* JADX INFO: renamed from: a */
    public final int f13732a;

    /* JADX INFO: renamed from: b */
    public final long f13733b;

    /* JADX INFO: renamed from: c */
    public final xm0 f13734c;

    /* JADX INFO: renamed from: d */
    public final ConcurrentHashMap f13735d;

    public z52() {
        y52 y52Var = y52.f13314o;
        this.f13732a = AIChatConfig.DefaultMaxTokens;
        this.f13733b = 600000L;
        this.f13734c = y52Var;
        this.f13735d = new ConcurrentHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final boolean m6383a(String str) {
        ConcurrentHashMap concurrentHashMap;
        long j;
        long jLongValue = ((Number) this.f13734c.mo6a()).longValue();
        while (true) {
            concurrentHashMap = this.f13735d;
            Long l = (Long) concurrentHashMap.get(str);
            j = this.f13733b;
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
        int i = this.f13732a;
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
        for (Map.Entry entry2 : AbstractC0142du.m1144B0(size2, AbstractC0142du.m1143A0(setEntrySet2, new sl0(18)))) {
            concurrentHashMap.remove(entry2.getKey(), entry2.getValue());
        }
        return true;
    }
}
