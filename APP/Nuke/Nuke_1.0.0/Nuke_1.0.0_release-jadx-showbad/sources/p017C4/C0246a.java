package p017C4;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: C4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0246a extends InheritableThreadLocal {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.InheritableThreadLocal
    public final Object childValue(Object obj) {
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }
}
