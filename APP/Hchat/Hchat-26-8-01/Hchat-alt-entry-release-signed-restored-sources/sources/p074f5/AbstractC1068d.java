package p074f5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: f5.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1068d {

    /* JADX INFO: renamed from: a */
    public static final Map f3429a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        HashMap map = new HashMap();
        map.put(0, "static-put");
        map.put(1, "static-get");
        map.put(2, "instance-put");
        map.put(3, "instance-get");
        map.put(4, "invoke-static");
        map.put(5, "invoke-instance");
        map.put(6, "invoke-constructor");
        map.put(7, "invoke-direct");
        map.put(8, "invoke-interface");
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        f3429a = mapUnmodifiableMap;
        HashMap map2 = new HashMap();
        for (Map.Entry entry : mapUnmodifiableMap.entrySet()) {
            map2.put((String) entry.getValue(), (Integer) entry.getKey());
        }
        Collections.unmodifiableMap(map2);
    }
}
