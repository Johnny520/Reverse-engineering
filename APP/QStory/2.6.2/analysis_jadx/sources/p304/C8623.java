package p304;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p000.AbstractC6087;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8623 extends AbstractC6087 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final SideSheetBehavior f24199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f24200;

    public /* synthetic */ C8623(SideSheetBehavior sideSheetBehavior, int i) {
        this.f24200 = i;
        this.f24199 = sideSheetBehavior;
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪兰苏 */
    public final boolean mo11431(float f, float f2) {
        switch (this.f24200) {
            case 0:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                }
                break;
            default:
                if (Math.abs(f) <= Math.abs(f2) || Math.abs(f) <= 500.0f) {
                }
                break;
        }
        return false;
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子世哲楪苏兰 */
    public final boolean mo11432(View view) {
        switch (this.f24200) {
            case 0:
                if (view.getRight() < (mo11437() - mo11436()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo11437() + this.f24199.f10555) / 2) {
                }
                break;
        }
        return true;
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰哲苏 */
    public final int mo11433(View view) {
        int i = this.f24200;
        SideSheetBehavior sideSheetBehavior = this.f24199;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.f10558;
            default:
                return view.getLeft() - sideSheetBehavior.f10558;
        }
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final int mo11434() {
        switch (this.f24200) {
            case 0:
                return -this.f24199.f10563;
            default:
                return mo11437();
        }
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final int mo11435() {
        int i = this.f24200;
        SideSheetBehavior sideSheetBehavior = this.f24199;
        switch (i) {
            case 0:
                return sideSheetBehavior.f10558;
            default:
                return sideSheetBehavior.f10555;
        }
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏兰哲 */
    public final int mo11436() {
        int i = this.f24200;
        SideSheetBehavior sideSheetBehavior = this.f24199;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.f10563) - sideSheetBehavior.f10558;
            default:
                return sideSheetBehavior.f10555;
        }
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子世楪苏哲兰 */
    public final int mo11437() {
        int i = this.f24200;
        SideSheetBehavior sideSheetBehavior = this.f24199;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.f10554 + sideSheetBehavior.f10558);
            default:
                return Math.max(0, (sideSheetBehavior.f10555 - sideSheetBehavior.f10563) - sideSheetBehavior.f10558);
        }
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子世苏兰哲楪 */
    public final boolean mo11438(float f) {
        switch (this.f24200) {
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

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲 */
    public final int mo11439() {
        switch (this.f24200) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子世苏楪哲兰 */
    public final int mo11440(CoordinatorLayout coordinatorLayout) {
        switch (this.f24200) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public final float mo11441(int i) {
        switch (this.f24200) {
            case 0:
                float fMo11436 = mo11436();
                return (i - fMo11436) / (mo11437() - fMo11436);
            default:
                float f = this.f24199.f10555;
                return (f - i) / (f - mo11437());
        }
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo11442(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f24200) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子苏世哲兰楪 */
    public final void mo11443(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.f24200;
        SideSheetBehavior sideSheetBehavior = this.f24199;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.f10555) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i4 = sideSheetBehavior.f10555;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                }
                break;
        }
    }

    @Override // p000.AbstractC6087
    /* JADX INFO: renamed from: 飘花落叶言子苏楪世兰哲 */
    public final boolean mo11444(View view, float f) {
        int i = this.f24200;
        SideSheetBehavior sideSheetBehavior = this.f24199;
        switch (i) {
            case 0:
                if (Math.abs((f * sideSheetBehavior.f10562) + view.getLeft()) > 0.5f) {
                }
                break;
            default:
                if (Math.abs((f * sideSheetBehavior.f10562) + view.getRight()) > 0.5f) {
                }
                break;
        }
        return true;
    }
}
