package p043Y;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import p037U.AbstractC0358S;

/* JADX INFO: renamed from: Y.C */
/* JADX INFO: loaded from: classes.dex */
public class C0437C extends AbstractC0358S {

    /* JADX INFO: renamed from: A */
    public static boolean f948A = true;

    /* JADX INFO: renamed from: B */
    public static boolean f949B = true;

    /* JADX INFO: renamed from: C */
    public static boolean f950C = true;

    /* JADX INFO: renamed from: z */
    public static boolean f951z = true;

    /* JADX INFO: renamed from: A0 */
    public void mo1037A0(View r2, Matrix r3) {
        if (f948A == false) goto L10;
        AbstractC0467z.m1101c(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f948A = false;
        return;
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: l0 */
    public void mo925l0(View r3, int r4) {
        if (Build.VERSION.SDK_INT != 28) goto L6;
        super.mo925l0(r3, r4);
        return;
    L6:
        if (f950C == false) goto L14;
        AbstractC0436B.m1036a(r3, r4);     // Catch: NoSuchMethodError -> L9
        return;
    L9:
        f950C = false;
        return;
    }

    /* JADX INFO: renamed from: y0 */
    public void mo1038y0(View r2, int r3, int r4, int r5, int r6) {
        if (f949B == false) goto L10;
        AbstractC0435A.m1035a(r2, r3, r4, r5, r6);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f949B = false;
        return;
    }

    /* JADX INFO: renamed from: z0 */
    public void mo1039z0(View r2, Matrix r3) {
        if (f951z == false) goto L10;
        AbstractC0467z.m1100b(r2, r3);     // Catch: NoSuchMethodError -> L6
        return;
    L6:
        f951z = false;
        return;
    }
}
