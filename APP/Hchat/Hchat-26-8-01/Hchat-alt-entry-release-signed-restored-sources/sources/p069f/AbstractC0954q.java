package p069f;

import gg.AbstractC1416l;
import java.util.ConcurrentModificationException;
import p087g.AbstractC1256a;

/* JADX INFO: renamed from: f.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0954q {

    /* JADX INFO: renamed from: a */
    public static final Object f3004a = new Object();

    /* JADX INFO: renamed from: b */
    public static final long[] f3005b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object f3006c = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final int m2349a(C0932f c0932f, Object obj, int i9) {
        int i10 = c0932f.f2922i;
        if (i10 == 0) {
            return -1;
        }
        try {
            int iM3379a = AbstractC1256a.m3379a(c0932f.f2920g, i10, i9);
            if (iM3379a < 0 || AbstractC1416l.m3825a(obj, c0932f.f2921h[iM3379a])) {
                return iM3379a;
            }
            int i11 = iM3379a + 1;
            while (i11 < i10 && c0932f.f2920g[i11] == i9) {
                if (AbstractC1416l.m3825a(obj, c0932f.f2921h[i11])) {
                    return i11;
                }
                i11++;
            }
            for (int i12 = iM3379a - 1; i12 >= 0 && c0932f.f2920g[i12] == i9; i12--) {
                if (AbstractC1416l.m3825a(obj, c0932f.f2921h[i12])) {
                    return i12;
                }
            }
            return ~i11;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }
}
