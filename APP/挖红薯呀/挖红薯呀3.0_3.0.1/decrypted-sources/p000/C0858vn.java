package p000;

import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: vn */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class C0858vn extends gd1 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C0895wn f6750e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0858vn(C0895wn c0895wn) {
        super(1);
        this.f6750e = c0895wn;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gd1
    /* JADX INFO: renamed from: d */
    public final be1 mo1239d(be1 be1Var, List list) {
        C0895wn c0895wn = this.f6750e;
        if (!c0895wn.f7154o) {
            View childAt = c0895wn.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, c0895wn.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, c0895wn.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                return be1Var.f503a.mo4196n(iMax, iMax2, iMax3, iMax4);
            }
        }
        return be1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.gd1
    /* JADX INFO: renamed from: e */
    public final C0111d mo1240e(id1 id1Var, C0111d c0111d) {
        C0895wn c0895wn = this.f6750e;
        if (!c0895wn.f7154o) {
            View childAt = c0895wn.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, c0895wn.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, c0895wn.getHeight() - childAt.getBottom());
            if (iMax != 0 || iMax2 != 0 || iMax3 != 0 || iMax4 != 0) {
                i20 i20VarM1512a = i20.m1512a(iMax, iMax2, iMax3, iMax4);
                int i = i20VarM1512a.f2404a;
                i20 i20Var = (i20) c0111d.f919e;
                int i2 = i20VarM1512a.f2405b;
                int i3 = i20VarM1512a.f2406c;
                int i4 = i20VarM1512a.f2407d;
                return new C0111d(23, be1.m351a(i20Var, i, i2, i3, i4), be1.m351a((i20) c0111d.f920f, i, i2, i3, i4));
            }
        }
        return c0111d;
    }
}
