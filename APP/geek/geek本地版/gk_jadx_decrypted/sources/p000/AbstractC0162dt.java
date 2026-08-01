package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: dt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0162dt extends AbstractC0126ct {
    /* JADX INFO: renamed from: A */
    public static Map m959A(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C0968zi.f5560a;
        }
        if (size == 1) {
            C0427kx c0427kx = (C0427kx) arrayList.get(0);
            AbstractC0346ip.m1503o("pair", c0427kx);
            Map mapSingletonMap = Collections.singletonMap(c0427kx.f2976a, c0427kx.f2977b);
            AbstractC0346ip.m1502n("singletonMap(...)", mapSingletonMap);
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m960z(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            C0427kx c0427kx2 = (C0427kx) obj;
            linkedHashMap.put(c0427kx2.f2976a, c0427kx2.f2977b);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: z */
    public static int m960z(int i) {
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
}
