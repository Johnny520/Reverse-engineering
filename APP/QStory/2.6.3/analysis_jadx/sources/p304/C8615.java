package p304;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import kotlin.reflect.jvm.internal.types.AbstractC4922;

/* JADX INFO: renamed from: 飘花落叶言楪苏兰世哲子.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8615 extends AbstractC4922 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final SideSheetBehavior f24190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final /* synthetic */ int f24191;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8615(SideSheetBehavior sideSheetBehavior, int i) {
        super(19);
        this.f24191 = i;
        this.f24190 = sideSheetBehavior;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子世兰哲苏楪 */
    public final void mo9892(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        int i3 = this.f24191;
        SideSheetBehavior sideSheetBehavior = this.f24190;
        switch (i3) {
            case 0:
                if (i <= sideSheetBehavior.f10560) {
                    marginLayoutParams.leftMargin = i2;
                }
                break;
            default:
                int i4 = sideSheetBehavior.f10560;
                if (i <= i4) {
                    marginLayoutParams.rightMargin = i4 - i;
                }
                break;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子世兰苏哲楪 */
    public final boolean mo9893(View view, float f) {
        int i = this.f24191;
        SideSheetBehavior sideSheetBehavior = this.f24190;
        switch (i) {
            case 0:
                if (Math.abs((f * sideSheetBehavior.f10567) + view.getLeft()) > 0.5f) {
                }
                break;
            default:
                if (Math.abs((f * sideSheetBehavior.f10567) + view.getRight()) > 0.5f) {
                }
                break;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子世楪兰苏哲 */
    public final boolean mo9896(float f, float f2) {
        switch (this.f24191) {
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

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲兰苏 */
    public final boolean mo9897(View view) {
        switch (this.f24191) {
            case 0:
                if (view.getRight() < (mo9909() - mo9910()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo9909() + this.f24190.f10560) / 2) {
                }
                break;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子世楪哲苏兰 */
    public final boolean mo9898(float f) {
        switch (this.f24191) {
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

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲 */
    public final int mo9904() {
        int i = this.f24191;
        SideSheetBehavior sideSheetBehavior = this.f24190;
        switch (i) {
            case 0:
                return sideSheetBehavior.f10563;
            default:
                return sideSheetBehavior.f10560;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final int mo9905(CoordinatorLayout coordinatorLayout) {
        switch (this.f24191) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世 */
    public final int mo9906() {
        switch (this.f24191) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final int mo9907() {
        switch (this.f24191) {
            case 0:
                return -this.f24190.f10568;
            default:
                return mo9909();
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世 */
    public final int mo9908(View view) {
        int i = this.f24191;
        SideSheetBehavior sideSheetBehavior = this.f24190;
        switch (i) {
            case 0:
                return view.getRight() + sideSheetBehavior.f10563;
            default:
                return view.getLeft() - sideSheetBehavior.f10563;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final int mo9909() {
        int i = this.f24191;
        SideSheetBehavior sideSheetBehavior = this.f24190;
        switch (i) {
            case 0:
                return Math.max(0, sideSheetBehavior.f10559 + sideSheetBehavior.f10563);
            default:
                return Math.max(0, (sideSheetBehavior.f10560 - sideSheetBehavior.f10568) - sideSheetBehavior.f10563);
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final int mo9910() {
        int i = this.f24191;
        SideSheetBehavior sideSheetBehavior = this.f24190;
        switch (i) {
            case 0:
                return (-sideSheetBehavior.f10568) - sideSheetBehavior.f10563;
            default:
                return sideSheetBehavior.f10560;
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final float mo9911(int i) {
        switch (this.f24191) {
            case 0:
                float fMo9910 = mo9910();
                return (i - fMo9910) / (mo9909() - fMo9910);
            default:
                float f = this.f24190.f10560;
                return (f - i) / (f - mo9909());
        }
    }

    @Override // kotlin.reflect.jvm.internal.types.AbstractC4922
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo9912(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f24191) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }
}
