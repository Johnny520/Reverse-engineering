package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: jt */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0386jt extends AbstractC0259gf {
    /* JADX INFO: renamed from: f0 */
    public static int m1617f0(int i) {
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

    /* JADX INFO: renamed from: g0 */
    public static Map m1618g0(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return C0070bj.f733a;
        }
        if (size == 1) {
            C0723sx c0723sx = (C0723sx) arrayList.get(0);
            AbstractC0493mp.m1857g("pair", c0723sx);
            Map mapSingletonMap = Collections.singletonMap(c0723sx.f4373a, c0723sx.f4374b);
            AbstractC0493mp.m1856f("singletonMap(...)", mapSingletonMap);
            return mapSingletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m1617f0(arrayList.size()));
        int size2 = arrayList.size();
        int i = 0;
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            C0723sx c0723sx2 = (C0723sx) obj;
            linkedHashMap.put(c0723sx2.f4373a, c0723sx2.f4374b);
        }
        return linkedHashMap;
    }
}
