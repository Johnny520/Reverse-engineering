package p000a;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: renamed from: a.aa */
/* JADX INFO: loaded from: classes.dex */
public class C0480aa extends C0726n9 {
    /* JADX INFO: renamed from: C */
    public static int m1169C(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: D */
    public static <K, V> Map<K, V> m1170D(C0710mc<? extends K, ? extends V> c0710mc) {
        C0631i9.m1482e(c0710mc, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(c0710mc.f2680a, c0710mc.f2681b);
        C0631i9.m1481d(mapSingletonMap, "singletonMap(...)");
        return mapSingletonMap;
    }
}
