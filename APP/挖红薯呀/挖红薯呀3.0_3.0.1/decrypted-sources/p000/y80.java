package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class y80 implements j21 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c90 f7568a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public y80(c90 c90Var) {
        this.f7568a = c90Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.j21
    /* JADX INFO: renamed from: a */
    public final float mo949a(float f, float f2) {
        float fAbs = Math.abs(f2);
        List list = this.f7568a.m506g().f6455k;
        int i = 0;
        if (!list.isEmpty()) {
            int size = list.size();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i += ((w80) it.next()).f7040j;
            }
            i /= size;
        }
        float f3 = fAbs - i;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        return Math.signum(f2) * f3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    @Override // p000.j21
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float mo950b(float f) {
        c90 c90Var = this.f7568a;
        List list = c90Var.m506g().f6455k;
        int size = list.size();
        float f2 = Float.POSITIVE_INFINITY;
        float f3 = Float.NEGATIVE_INFINITY;
        for (int i = 0; i < size; i++) {
            w80 w80Var = (w80) list.get(i);
            w80 w80Var2 = w80Var != null ? w80Var : null;
            if (w80Var2 == null || !w80Var2.f7043m) {
                v80 v80VarM506g = c90Var.m506g();
                int iM4421g = (int) (v80VarM506g.f6459o == um0.f6264d ? v80VarM506g.m4421g() & 4294967295L : v80VarM506g.m4421g() >> 32);
                int i2 = -c90Var.m506g().f6456l;
                int i3 = c90Var.m506g().f6460p;
                int i4 = w80Var.f7040j;
                int i5 = w80Var.f7039i;
                int i6 = c90Var.m506g().f6458n;
                float f4 = i5 - ((((iM4421g - i2) - i3) / 2) - (i4 / 2));
                if (f4 <= 0.0f && f4 > f3) {
                    f3 = f4;
                }
                if (f4 >= 0.0f && f4 < f2) {
                    f2 = f4;
                }
            }
        }
        char c = Math.abs(f) >= ((v80) c90Var.f744f.getValue()).f6453i.mo654p(400.0f) ? f > 0.0f ? (char) 1 : (char) 2 : (char) 0;
        if (c == 0) {
            if (Math.abs(f2) <= Math.abs(f3)) {
                f3 = f2;
            }
        } else if (c != 1) {
            if (c != 2) {
                f3 = 0.0f;
            }
        }
        if (f3 == Float.POSITIVE_INFINITY || f3 == Float.NEGATIVE_INFINITY) {
            return 0.0f;
        }
        return f3;
    }
}
