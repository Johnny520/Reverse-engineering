package p108h7;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: h7.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2897h {
    /* JADX INFO: renamed from: a */
    public static final boolean m10545a(Map map, String str) {
        map.getClass();
        str.getClass();
        if (str.length() == 0 || map.containsKey(str)) {
            return true;
        }
        if (map.containsKey(str + ".size")) {
            return true;
        }
        Set<String> setKeySet = map.keySet();
        if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
            for (String str2 : setKeySet) {
                if (AbstractC8611a0.m33075T(str2, str, false, 2, null) && str2.length() > str.length() && str2.charAt(str.length()) == '.') {
                    return true;
                }
            }
        }
        return false;
    }
}
