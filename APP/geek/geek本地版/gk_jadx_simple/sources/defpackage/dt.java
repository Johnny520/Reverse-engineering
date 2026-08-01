package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class dt extends ct {
    public static Map A(ArrayList r5) {
        int r0 = r5.size();
        if (r0 == 0) goto L13;
        if (r0 == 1) goto L10;
        LinkedHashMap r02 = new LinkedHashMap(z(r5.size()));
        int r1 = r5.size();
        int r2 = 0;
    L7:
        if (r2 >= r1) goto L9;
        Object r3 = r5.get(r2);
        r2 = r2 + 1;
        kx r32 = (kx) r3;
        r02.put(r32.a, r32.b);
        goto L7
    L9:
        return r02;
    L10:
        kx r52 = (kx) r5.get(0);
        ip.o("pair", r52);
        Map r53 = Collections.singletonMap(r52.a, r52.b);
        ip.n("singletonMap(...)", r53);
        return r53;
    L13:
        return zi.a;
    }

    public static int z(int r1) {
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
}
