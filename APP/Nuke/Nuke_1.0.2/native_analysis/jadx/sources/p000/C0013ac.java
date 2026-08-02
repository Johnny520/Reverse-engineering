package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* JADX INFO: renamed from: ac */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0013ac extends wd3 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f140j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ ViewGroup f141k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0013ac(ViewGroup viewGroup, int i) {
        super(1);
        this.f140j = i;
        this.f141k = viewGroup;
    }

    @Override // p000.wd3
    /* JADX INFO: renamed from: d */
    public final cf3 mo127d(cf3 cf3Var, List list) {
        int i = this.f140j;
        ViewGroup viewGroup = this.f141k;
        switch (i) {
            case 0:
                return ((ab3) viewGroup).m2323g(cf3Var);
            default:
                m80 m80Var = (m80) viewGroup;
                if (m80Var.f6508t) {
                    return cf3Var;
                }
                View childAt = m80Var.getChildAt(0);
                int iMax = Math.max(0, childAt.getLeft());
                int iMax2 = Math.max(0, childAt.getTop());
                int iMax3 = Math.max(0, m80Var.getWidth() - childAt.getRight());
                int iMax4 = Math.max(0, m80Var.getHeight() - childAt.getBottom());
                return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? cf3Var : cf3Var.f1518a.mo4170r(iMax, iMax2, iMax3, iMax4);
        }
    }

    @Override // p000.wd3
    /* JADX INFO: renamed from: e */
    public final dq1 mo128e(ge3 ge3Var, dq1 dq1Var) {
        int i = this.f140j;
        ViewGroup viewGroup = this.f141k;
        switch (i) {
            case 0:
                qz0 qz0Var = (qz0) ((ab3) viewGroup).f4531G.f9372M.f12033d;
                if (!qz0Var.f9293Y.f10770u) {
                    return dq1Var;
                }
                long jM5346J = tp0.m5346J(qz0Var.mo646M(0L));
                int i2 = (int) (jM5346J >> 32);
                if (i2 < 0) {
                    i2 = 0;
                }
                int i3 = (int) (jM5346J & 4294967295L);
                if (i3 < 0) {
                    i3 = 0;
                }
                long jMo645L = s11.m4665J(qz0Var).mo645L();
                int i4 = (int) (jMo645L >> 32);
                int i5 = (int) (jMo645L & 4294967295L);
                long j = qz0Var.f10440j;
                long jM5346J2 = tp0.m5346J(qz0Var.mo646M((((long) Float.floatToRawIntBits((int) (j >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L)));
                int i6 = i4 - ((int) (jM5346J2 >> 32));
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - ((int) (jM5346J2 & 4294967295L));
                int i8 = i7 >= 0 ? i7 : 0;
                return (i2 == 0 && i3 == 0 && i6 == 0 && i8 == 0) ? dq1Var : new dq1(21, AbstractC0309ic.m2322f((zz0) dq1Var.f2147i, i2, i3, i6, i8), AbstractC0309ic.m2322f((zz0) dq1Var.f2148j, i2, i3, i6, i8));
            default:
                m80 m80Var = (m80) viewGroup;
                if (m80Var.f6508t) {
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
                zz0 zz0VarM6518b = zz0.m6518b(iMax, iMax2, iMax3, iMax4);
                int i9 = zz0VarM6518b.f14157a;
                zz0 zz0Var = (zz0) dq1Var.f2147i;
                int i10 = zz0VarM6518b.f14158b;
                int i11 = zz0VarM6518b.f14159c;
                int i12 = zz0VarM6518b.f14160d;
                return new dq1(21, cf3.m768a(zz0Var, i9, i10, i11, i12), cf3.m768a((zz0) dq1Var.f2148j, i9, i10, i11, i12));
        }
    }
}
