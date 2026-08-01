package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: iq */
/* JADX INFO: loaded from: classes.dex */
public final class C0347iq extends AbstractC0274gu {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2575f;

    /* JADX INFO: renamed from: g */
    public final SideSheetBehavior f2576g;

    public /* synthetic */ C0347iq(SideSheetBehavior sideSheetBehavior, int i) {
        this.f2575f = i;
        this.f2576g = sideSheetBehavior;
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: A */
    public final boolean mo1323A(float f, float f2) {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
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

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: K */
    public final boolean mo1326K(View view, float f) {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f2576g;
                float fAbs = Math.abs((f * sideSheetBehavior.f1080k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f2576g;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.f1080k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: N */
    public final void mo1327N(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                if (i <= this.f2576g.f1082m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.f2576g.f1082m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: a */
    public final int mo1328a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: b */
    public final float mo1329b(int i) {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                float fMo1331l = mo1331l();
                return (i - fMo1331l) / (mo1330k() - fMo1331l);
            default:
                float f = this.f2576g.f1082m;
                return (f - i) / (f - mo1330k());
        }
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: k */
    public final int mo1330k() {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                SideSheetBehavior sideSheetBehavior = this.f2576g;
                return Math.max(0, sideSheetBehavior.f1083n + sideSheetBehavior.f1084o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f2576g;
                return Math.max(0, (sideSheetBehavior2.f1082m - sideSheetBehavior2.f1081l) - sideSheetBehavior2.f1084o);
        }
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: l */
    public final int mo1331l() {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                SideSheetBehavior sideSheetBehavior = this.f2576g;
                return (-sideSheetBehavior.f1081l) - sideSheetBehavior.f1084o;
            default:
                return this.f2576g.f1082m;
        }
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: n */
    public final int mo1332n() {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                return this.f2576g.f1084o;
            default:
                return this.f2576g.f1082m;
        }
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: o */
    public final int mo1333o() {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                return -this.f2576g.f1081l;
            default:
                return mo1330k();
        }
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: q */
    public final int mo1334q(View view) {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                return view.getRight() + this.f2576g.f1084o;
            default:
                return view.getLeft() - this.f2576g.f1084o;
        }
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: r */
    public final int mo1335r(CoordinatorLayout coordinatorLayout) {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: s */
    public final int mo1336s() {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: w */
    public final boolean mo1338w(float f) {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
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

    @Override // p000.AbstractC0274gu
    /* JADX INFO: renamed from: z */
    public final boolean mo1339z(View view) {
        switch (this.f2575f) {
            case Base64.DEFAULT /* 0 */:
                if (view.getRight() < (mo1330k() - mo1331l()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo1330k() + this.f2576g.f1082m) / 2) {
                }
                break;
        }
        return false;
    }
}
