package p000;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: TE */
/* JADX INFO: loaded from: classes.dex */
public class C0831TE extends AbstractC0628Oj {

    /* JADX INFO: renamed from: p */
    public static boolean f2623p = true;

    /* JADX INFO: renamed from: q */
    public static boolean f2624q = true;

    /* JADX INFO: renamed from: r */
    public static boolean f2625r = true;

    /* JADX INFO: renamed from: s */
    public static boolean f2626s = true;

    @Override // p000.AbstractC0628Oj
    /* JADX INFO: renamed from: R */
    public void mo1253R(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo1253R(view, i);
        } else if (f2626s) {
            try {
                AbstractC0788SE.m1607a(view, i);
            } catch (NoSuchMethodError unused) {
                f2626s = false;
            }
        }
    }

    /* JADX INFO: renamed from: Z */
    public void mo1656Z(View view, int i, int i2, int i3, int i4) {
        if (f2625r) {
            try {
                AbstractC0745RE.m1537a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f2625r = false;
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void mo1657a0(View view, Matrix matrix) {
        if (f2623p) {
            try {
                AbstractC0703QE.m1450b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2623p = false;
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void mo1658b0(View view, Matrix matrix) {
        if (f2624q) {
            try {
                AbstractC0703QE.m1451c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f2624q = false;
            }
        }
    }
}
