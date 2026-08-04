package yyds;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: yyds.ᛱᛳᛱᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0088 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final HashMap f683 = new HashMap();

    static {
        new HashMap();
        m486(AbstractC1544.class);
        m486(AbstractC0159.class);
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m486(Class cls) {
        HashMap map = f683;
        synchronized (map) {
            try {
                LinkedHashSet linkedHashSet = (LinkedHashSet) map.get(Object.class);
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                    map.put(Object.class, linkedHashSet);
                }
                linkedHashSet.add(cls);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
