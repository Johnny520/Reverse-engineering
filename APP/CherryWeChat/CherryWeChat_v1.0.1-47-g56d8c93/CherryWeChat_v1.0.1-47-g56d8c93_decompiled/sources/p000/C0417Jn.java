package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: Jn */
/* JADX INFO: loaded from: classes.dex */
public final class C0417Jn extends AbstractC0628Oj {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f1397p;

    /* JADX INFO: renamed from: q */
    public final SideSheetBehavior f1398q;

    public /* synthetic */ C0417Jn(SideSheetBehavior sideSheetBehavior, int i) {
        this.f1397p = i;
        this.f1398q = sideSheetBehavior;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: G */
    public final boolean mo865G(float f) {
        switch (this.f1397p) {
            case 0:
                if (f > 0.0f) {
                }
                break;
            default:
                if (f < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: J */
    public final boolean mo866J(View view) {
        switch (this.f1397p) {
            case 0:
                if (view.getRight() < (mo872q() - mo873r()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo872q() + this.f1398q.f4574m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: K */
    public final boolean mo867K(float f, float f2) {
        switch (this.f1397p) {
            case 0:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500) {
                }
                break;
        }
        return false;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: S */
    public final boolean mo868S(View view, float f) {
        switch (this.f1397p) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f1398q;
                float fAbs = Math.abs((f * sideSheetBehavior.f4572k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f1398q;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.f4572k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: X */
    public final void mo869X(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f1397p) {
            case 0:
                if (i <= this.f1398q.f4574m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.f1398q.f4574m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: d */
    public final int mo870d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1397p) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: e */
    public final float mo871e(int i) {
        switch (this.f1397p) {
            case 0:
                float fMo873r = mo873r();
                return (i - fMo873r) / (mo872q() - fMo873r);
            default:
                float f = this.f1398q.f4574m;
                return (f - i) / (f - mo872q());
        }
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: q */
    public final int mo872q() {
        switch (this.f1397p) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1398q;
                return Math.max(0, sideSheetBehavior.f4575n + sideSheetBehavior.f4576o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1398q;
                return Math.max(0, (sideSheetBehavior2.f4574m - sideSheetBehavior2.f4573l) - sideSheetBehavior2.f4576o);
        }
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: r */
    public final int mo873r() {
        switch (this.f1397p) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1398q;
                return (-sideSheetBehavior.f4573l) - sideSheetBehavior.f4576o;
            default:
                return this.f1398q.f4574m;
        }
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: s */
    public final int mo874s() {
        switch (this.f1397p) {
            case 0:
                return this.f1398q.f4576o;
            default:
                return this.f1398q.f4574m;
        }
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: t */
    public final int mo875t() {
        switch (this.f1397p) {
            case 0:
                return -this.f1398q.f4573l;
            default:
                return mo872q();
        }
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: w */
    public final int mo876w(View view) {
        switch (this.f1397p) {
            case 0:
                return view.getRight() + this.f1398q.f4576o;
            default:
                return view.getLeft() - this.f1398q.f4576o;
        }
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: x */
    public final int mo877x(CoordinatorLayout coordinatorLayout) {
        switch (this.f1397p) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: z */
    public final int mo878z() {
        switch (this.f1397p) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }
}
