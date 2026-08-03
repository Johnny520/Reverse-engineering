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
    public void mo1253R(View r3, int r4) {
        if (Build.VERSION.SDK_INT != 28) goto L7;
        super.mo1253R(r3, r4);
        return;
    L7:
        if (f2626s == false) goto L14;
        AbstractC0788SE.m1607a(r3, r4);     // Catch: NoSuchMethodError -> L10
        return;
    L10:
        f2626s = false;
        return;
    }

    /* JADX INFO: renamed from: Z */
    public void mo1656Z(View r2, int r3, int r4, int r5, int r6) {
        if (f2625r == false) goto L10;
        AbstractC0745RE.m1537a(r2, r3, r4, r5, r6);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f2625r = false;
        return;
    }

    /* JADX INFO: renamed from: a0 */
    public void mo1657a0(View r2, Matrix r3) {
        if (f2623p == false) goto L10;
        AbstractC0703QE.m1450b(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f2623p = false;
        return;
    }

    /* JADX INFO: renamed from: b0 */
    public void mo1658b0(View r2, Matrix r3) {
        if (f2624q == false) goto L10;
        AbstractC0703QE.m1451c(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f2624q = false;
        return;
    }
}
