package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ac extends wd3 {
    public final /* synthetic */ int j;
    public final /* synthetic */ ViewGroup k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac(ViewGroup viewGroup, int i) {
        super(1);
        this.j = i;
        this.k = viewGroup;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd3
    public final cf3 d(cf3 cf3Var, List list) {
        int i = this.j;
        ViewGroup viewGroup = this.k;
        switch (i) {
            case 0:
                return ((ab3) viewGroup).g(cf3Var);
            default:
                m80 m80Var = (m80) viewGroup;
                if (m80Var.t) {
                    return cf3Var;
                }
                View childAt = m80Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, m80Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, m80Var.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? cf3Var : cf3Var.a.r(iMax, iMax2, iMax3, iMax4);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.wd3
    public final dq1 e(ge3 ge3Var, dq1 dq1Var) {
        int i = this.j;
        ViewGroup viewGroup = this.k;
        switch (i) {
            case 0:
                qz0 qz0Var = (qz0) ((ab3) viewGroup).G.M.d;
                if (!qz0Var.Y.u) {
                    return dq1Var;
                }
                long J = tp0.J(qz0Var.M(0L));
                int i2 = (int) (J >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (J & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long jL = s11.J(qz0Var).L();
                int i4 = (int) (jL >> 32);
                int i5 = (int) (jL & 4294967295L);
                long j = qz0Var.j;
                long J2 = tp0.J(qz0Var.M((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (J2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (J2 & 4294967295L));
                int i8 = i7 >= 0 ? i7 : 0;
                return (i2 == 0 && i3 == 0 && i6 == 0 && i8 == 0) ? dq1Var : new dq1(21, ic.f((zz0) dq1Var.i, i2, i3, i6, i8), ic.f((zz0) dq1Var.j, i2, i3, i6, i8));
            default:
                m80 m80Var = (m80) viewGroup;
                if (m80Var.t) {
                    return dq1Var;
                }
                View childAt = m80Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, m80Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, m80Var.getHeight() - childAt.getBottom());
                if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                    return dq1Var;
                }
                zz0 zz0VarB = zz0.b(iMax, iMax2, iMax3, iMax4);
                int i9 = zz0VarB.a;
                zz0 zz0Var = (zz0) dq1Var.i;
                int i10 = zz0VarB.b;
                int i11 = zz0VarB.c;
                int i12 = zz0VarB.d;
                return new dq1(21, cf3.a(zz0Var, i9, i10, i11, i12), cf3.a((zz0) dq1Var.j, i9, i10, i11, i12));
        }
    }
}
