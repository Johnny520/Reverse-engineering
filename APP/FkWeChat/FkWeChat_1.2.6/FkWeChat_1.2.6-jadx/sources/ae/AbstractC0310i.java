package ae;

import p376zd.C10018t0;

/* JADX INFO: renamed from: ae.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0310i {
    /* JADX INFO: renamed from: a */
    public static final int m946a(int[] iArr, int i10, int i11, int i12) {
        iArr.getClass();
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    /* JADX INFO: renamed from: b */
    public static final int m947b(C10018t0 c10018t0, int i10) {
        c10018t0.getClass();
        int iM946a = m946a(c10018t0.m38833O(), i10 + 1, 0, c10018t0.m38834P().length);
        return iM946a >= 0 ? iM946a : ~iM946a;
    }
}
