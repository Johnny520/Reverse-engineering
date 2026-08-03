package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: uq */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2598uq extends AbstractC0714Qj {
    /* JADX INFO: renamed from: J */
    public static Object m5108J(Map r2, Object r3) {
        Object r0 = r2.get(r3);
        if (r0 == null) goto L5;
    L9:
        return r0;
    L5:
        if (r2.containsKey(r3) == true) goto L9;
        throw new NoSuchElementException("Key " + r3 + " is missing in the map.");
    }

    /* JADX INFO: renamed from: K */
    public static int m5109K(int r1) {
        if (r1 >= 0) goto L5;
        return r1;
    L5:
        if (r1 >= 3) goto L9;
        return r1 + 1;
    L9:
        if (r1 < 1073741824) goto L11;
        return Integer.MAX_VALUE;
    L11:
        return (int) ((r1 / 0.75f) + 1.0f);
    }

    /* JADX INFO: renamed from: L */
    public static Map m5110L(C0208Et... r5) {
        if (r5.length <= 0) goto L9;
        LinkedHashMap r0 = new LinkedHashMap(m5109K(r5.length));
        int r1 = r5.length;
        int r2 = 0;
    L5:
        if (r2 >= r1) goto L7;
        C0208Et r3 = r5[r2];
        r0.put(r3.f613a, r3.f614b);
        r2 = r2 + 1;
        goto L5
    L7:
        return r0;
    L9:
        return C0495Lf.f1620a;
    }

    /* JADX INFO: renamed from: M */
    public static Map m5111M(ArrayList r3) {
        int r0 = r3.size();
        if (r0 == 0) goto L14;
        if (r0 == 1) goto L11;
        LinkedHashMap r02 = new LinkedHashMap(m5109K(r3.size()));
        Iterator r32 = r3.iterator();
    L8:
        if (r32.hasNext() == false) goto L10;
        C0208Et r1 = (C0208Et) r32.next();
        r02.put(r1.f613a, r1.f614b);
        goto L8
    L10:
        return r02;
    L11:
        C0208Et r33 = (C0208Et) r3.get(0);
        return Collections.singletonMap(r33.f613a, r33.f614b);
    L14:
        return C0495Lf.f1620a;
    }
}
