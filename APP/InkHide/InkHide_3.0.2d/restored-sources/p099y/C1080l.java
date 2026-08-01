package p099y;

import android.util.Log;
import android.view.ViewParent;
import androidx.core.widget.NestedScrollView;

/* JADX INFO: renamed from: y.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1080l {

    /* JADX INFO: renamed from: a */
    public ViewParent f3715a;

    /* JADX INFO: renamed from: b */
    public ViewParent f3716b;

    /* JADX INFO: renamed from: c */
    public final NestedScrollView f3717c;

    /* JADX INFO: renamed from: d */
    public boolean f3718d;

    /* JADX INFO: renamed from: e */
    public int[] f3719e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1080l(NestedScrollView nestedScrollView) {
        this.f3717c = nestedScrollView;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m2357a(float f, float f2) {
        ViewParent viewParentM2359c;
        if (this.f3718d && (viewParentM2359c = m2359c(0)) != null) {
            try {
                return AbstractC1052P.m2297b(viewParentM2359c, this.f3717c, f, f2);
            } catch (AbstractMethodError e2) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM2359c + " does not implement interface method onNestedPreFling", e2);
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m2358b(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        ViewParent viewParentM2359c;
        int i7;
        int i8;
        int[] iArr3;
        if (this.f3718d && (viewParentM2359c = m2359c(i6)) != null) {
            if (i2 != 0 || i3 != 0 || i4 != 0 || i5 != 0) {
                NestedScrollView nestedScrollView = this.f3717c;
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    i7 = iArr[0];
                    i8 = iArr[1];
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                if (iArr2 == null) {
                    if (this.f3719e == null) {
                        this.f3719e = new int[2];
                    }
                    int[] iArr4 = this.f3719e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM2359c instanceof InterfaceC1082n) {
                    ((InterfaceC1082n) viewParentM2359c).mo663d(nestedScrollView, i2, i3, i4, i5, i6, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i4;
                    iArr3[1] = iArr3[1] + i5;
                    if (viewParentM2359c instanceof InterfaceC1081m) {
                        ((InterfaceC1081m) viewParentM2359c).mo664e(nestedScrollView, i2, i3, i4, i5, i6);
                    } else if (i6 == 0) {
                        try {
                            AbstractC1052P.m2299d(viewParentM2359c, nestedScrollView, i2, i3, i4, i5);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM2359c + " does not implement interface method onNestedScroll", e2);
                        }
                    }
                }
                if (iArr != null) {
                    nestedScrollView.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i7;
                    iArr[1] = iArr[1] - i8;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final ViewParent m2359c(int i2) {
        if (i2 == 0) {
            return this.f3715a;
        }
        if (i2 != 1) {
            return null;
        }
        return this.f3716b;
    }
}
