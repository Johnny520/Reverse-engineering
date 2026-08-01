package p000;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.megatronking.stringfog.Base64;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: eq */
/* JADX INFO: loaded from: classes.dex */
public final class C0196eq extends AbstractC0979zt {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f1832e;

    /* JADX INFO: renamed from: f */
    public final SideSheetBehavior f1833f;

    public /* synthetic */ C0196eq(SideSheetBehavior sideSheetBehavior, int i) {
        this.f1832e = i;
        this.f1833f = sideSheetBehavior;
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: A */
    public final boolean mo1053A(float f) {
        switch (this.f1832e) {
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

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: C */
    public final boolean mo1054C(View view) {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                if (view.getRight() < (mo1060l() - mo1061m()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo1060l() + this.f1833f.f1157m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: D */
    public final boolean mo1055D(float f, float f2) {
        switch (this.f1832e) {
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

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: P */
    public final boolean mo1056P(View view, float f) {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f1833f;
                float fAbs = Math.abs((f * sideSheetBehavior.f1155k) + left);
                sideSheetBehavior.getClass();
                if (fAbs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f1833f;
                float fAbs2 = Math.abs((f * sideSheetBehavior2.f1155k) + right);
                sideSheetBehavior2.getClass();
                if (fAbs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: R */
    public final void mo1057R(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                if (i <= this.f1833f.f1157m) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i3 = this.f1833f.f1157m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                }
                break;
        }
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: a */
    public final int mo1058a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: b */
    public final float mo1059b(int i) {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                float fMo1061m = mo1061m();
                return (i - fMo1061m) / (mo1060l() - fMo1061m);
            default:
                float f = this.f1833f.f1157m;
                return (f - i) / (f - mo1060l());
        }
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: l */
    public final int mo1060l() {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                SideSheetBehavior sideSheetBehavior = this.f1833f;
                return Math.max(0, sideSheetBehavior.f1158n + sideSheetBehavior.f1159o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1833f;
                return Math.max(0, (sideSheetBehavior2.f1157m - sideSheetBehavior2.f1156l) - sideSheetBehavior2.f1159o);
        }
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: m */
    public final int mo1061m() {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                SideSheetBehavior sideSheetBehavior = this.f1833f;
                return (-sideSheetBehavior.f1156l) - sideSheetBehavior.f1159o;
            default:
                return this.f1833f.f1157m;
        }
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: n */
    public final int mo1062n() {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                return this.f1833f.f1159o;
            default:
                return this.f1833f.f1157m;
        }
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: o */
    public final int mo1063o() {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                return -this.f1833f.f1156l;
            default:
                return mo1060l();
        }
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: q */
    public final int mo1064q(View view) {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                return view.getRight() + this.f1833f.f1159o;
            default:
                return view.getLeft() - this.f1833f.f1159o;
        }
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: u */
    public final int mo1065u(CoordinatorLayout coordinatorLayout) {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p000.AbstractC0979zt
    /* JADX INFO: renamed from: v */
    public final int mo1066v() {
        switch (this.f1832e) {
            case Base64.DEFAULT /* 0 */:
                return 1;
            default:
                return 0;
        }
    }
}
