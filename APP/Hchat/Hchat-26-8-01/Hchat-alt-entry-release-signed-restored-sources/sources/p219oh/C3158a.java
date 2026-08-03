package p219oh;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: oh.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3158a extends InheritableThreadLocal {
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
