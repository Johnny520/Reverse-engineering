package p009E0;

import java.util.LinkedHashMap;
import java.util.Map;
import p001A0.AbstractC0040p;
import p007D0.C0139e;

/* JADX INFO: renamed from: E0.x */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0193x extends AbstractC0040p {
    /* JADX INFO: renamed from: g0 */
    public static int m563g0(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: h0 */
    public static Map m564h0(C0139e... c0139eArr) {
        if (c0139eArr.length <= 0) {
            return C0191v.f402a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(m563g0(c0139eArr.length));
        m565i0(linkedHashMap, c0139eArr);
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: i0 */
    public static final void m565i0(LinkedHashMap linkedHashMap, C0139e[] c0139eArr) {
        for (C0139e c0139e : c0139eArr) {
            linkedHashMap.put(c0139e.f328a, c0139e.f329b);
        }
    }
}
