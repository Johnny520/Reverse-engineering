package p320;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import kotlin.reflect.jvm.internal.types.AbstractC5754;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9444 extends AbstractC5754 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final SideSheetBehavior f24535;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f24536;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C9444(SideSheetBehavior sideSheetBehavior, int i) {
        super(19);
        this.f24536 = i;
        this.f24535 = sideSheetBehavior;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final void mo10451(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.f24536;
        SideSheetBehavior sideSheetBehavior = this.f24535;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.f10905) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i4 = sideSheetBehavior.f10905;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                }
                break;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final boolean mo10452(View view, float f) {
        int i = this.f24536;
        SideSheetBehavior sideSheetBehavior = this.f24535;
        switch (i) {
            case 0:
                if (Math.abs((f * sideSheetBehavior.f10912) + view.getLeft()) > 0.5f) {
                }
                break;
            default:
                if (Math.abs((f * sideSheetBehavior.f10912) + view.getRight()) > 0.5f) {
                }
                break;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final boolean mo10455(float f, float f2) {
        switch (this.f24536) {
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

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo10456(View view) {
        switch (this.f24536) {
            case 0:
                if (view.getRight() < (mo10468() - mo10469()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo10468() + this.f24535.f10905) / 2) {
                }
                break;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo10457(float f) {
        switch (this.f24536) {
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

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final int mo10463() {
        int i = this.f24536;
        SideSheetBehavior sideSheetBehavior = this.f24535;
        switch (i) {
            case 0:
                return sideSheetBehavior.f10908;
            default:
                return sideSheetBehavior.f10905;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo10464(CoordinatorLayout coordinatorLayout) {
        switch (this.f24536) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo10465() {
        switch (this.f24536) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final int mo10466() {
        switch (this.f24536) {
            case 0:
                return -this.f24535.f10913;
            default:
                return mo10468();
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo10467(View view) {
        int i = this.f24536;
        SideSheetBehavior sideSheetBehavior = this.f24535;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.f10908;
            default:
                return view.getLeft() - sideSheetBehavior.f10908;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo10468() {
        int i = this.f24536;
        SideSheetBehavior sideSheetBehavior = this.f24535;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.f10904 + sideSheetBehavior.f10908);
            default:
                return Math.max(0, (sideSheetBehavior.f10905 - sideSheetBehavior.f10913) - sideSheetBehavior.f10908);
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final int mo10469() {
        int i = this.f24536;
        SideSheetBehavior sideSheetBehavior = this.f24535;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.f10913) - sideSheetBehavior.f10908;
            default:
                return sideSheetBehavior.f10905;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final float mo10470(int i) {
        switch (this.f24536) {
            case 0:
                float fMo10469 = mo10469();
                return (i - fMo10469) / (mo10468() - fMo10469);
            default:
                float f = this.f24535.f10905;
                return (f - i) / (f - mo10468());
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC5754
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo10471(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f24536) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }
}
