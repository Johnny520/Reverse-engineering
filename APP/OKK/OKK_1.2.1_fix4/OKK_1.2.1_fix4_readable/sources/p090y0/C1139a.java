package p090y0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.abc.core.runtime.AbstractC0805P;
import com.google.android.material.sidesheet.SideSheetBehavior;

/* JADX INFO: renamed from: y0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1139a extends AbstractC0805P {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f4398b;

    /* JADX INFO: renamed from: c */
    public final SideSheetBehavior f4399c;

    public /* synthetic */ C1139a(SideSheetBehavior sideSheetBehavior, int i2) {
        this.f4398b = i2;
        this.f4399c = sideSheetBehavior;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: A */
    public final int mo2054A(CoordinatorLayout coordinatorLayout) {
        switch (this.f4398b) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: B */
    public final int mo2055B() {
        switch (this.f4398b) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: D */
    public final boolean mo2056D(float f2) {
        switch (this.f4398b) {
            case 0:
                if (f2 > 0.0f) {
                }
                break;
            default:
                if (f2 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: G */
    public final boolean mo2057G(View view) {
        switch (this.f4398b) {
            case 0:
                if (view.getRight() < (mo2075u() - mo2076v()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo2075u() + this.f4399c.f2421m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: H */
    public final boolean mo2058H(float f2, float f3) {
        switch (this.f4398b) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float fAbs = Math.abs(f2);
                    this.f4399c.getClass();
                    if (fAbs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float fAbs2 = Math.abs(f2);
                    this.f4399c.getClass();
                    if (fAbs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: W */
    public final boolean mo2063W(View view, float f2) {
        switch (this.f4398b) {
            case 0:
                if (Math.abs((f2 * this.f4399c.f2419k) + view.getLeft()) > 0.5f) {
                }
                break;
            default:
                if (Math.abs((f2 * this.f4399c.f2419k) + view.getRight()) > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: X */
    public final void mo2064X(ViewGroup.MarginLayoutParams marginLayoutParams, int i2, int i3) {
        switch (this.f4398b) {
            case 0:
                if (i2 <= this.f4399c.f2421m) {
                    marginLayoutParams.leftMargin = i3;
                }
                break;
            default:
                int i4 = this.f4399c.f2421m;
                if (i2 <= i4) {
                    marginLayoutParams.rightMargin = i4 - i2;
                }
                break;
        }
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: a */
    public final int mo2065a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f4398b) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: b */
    public final float mo2066b(int i2) {
        switch (this.f4398b) {
            case 0:
                float fMo2076v = mo2076v();
                return (i2 - fMo2076v) / (mo2075u() - fMo2076v);
            default:
                float f2 = this.f4399c.f2421m;
                return (f2 - i2) / (f2 - mo2075u());
        }
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: u */
    public final int mo2075u() {
        switch (this.f4398b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f4399c;
                return Math.max(0, sideSheetBehavior.f2422n + sideSheetBehavior.f2423o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f4399c;
                return Math.max(0, (sideSheetBehavior2.f2421m - sideSheetBehavior2.f2420l) - sideSheetBehavior2.f2423o);
        }
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: v */
    public final int mo2076v() {
        switch (this.f4398b) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f4399c;
                return (-sideSheetBehavior.f2420l) - sideSheetBehavior.f2423o;
            default:
                return this.f4399c.f2421m;
        }
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: x */
    public final int mo2077x() {
        switch (this.f4398b) {
            case 0:
                return this.f4399c.f2423o;
            default:
                return this.f4399c.f2421m;
        }
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: y */
    public final int mo2078y() {
        switch (this.f4398b) {
            case 0:
                return -this.f4399c.f2420l;
            default:
                return mo2075u();
        }
    }

    @Override // com.abc.core.runtime.AbstractC0805P
    /* JADX INFO: renamed from: z */
    public final int mo2079z(View view) {
        switch (this.f4398b) {
            case 0:
                return view.getRight() + this.f4399c.f2423o;
            default:
                return view.getLeft() - this.f4399c.f2423o;
        }
    }
}
