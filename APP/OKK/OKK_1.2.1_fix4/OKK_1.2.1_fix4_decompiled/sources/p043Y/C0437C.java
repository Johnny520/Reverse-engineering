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
    public void mo1037A0(View view, Matrix matrix) {
        if (f948A) {
            try {
                AbstractC0467z.m1101c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f948A = false;
            }
        }
    }

    @Override // p037U.AbstractC0358S
    /* JADX INFO: renamed from: l0 */
    public void mo925l0(View view, int i2) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo925l0(view, i2);
        } else if (f950C) {
            try {
                AbstractC0436B.m1036a(view, i2);
            } catch (NoSuchMethodError unused) {
                f950C = false;
            }
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void mo1038y0(View view, int i2, int i3, int i4, int i5) {
        if (f949B) {
            try {
                AbstractC0435A.m1035a(view, i2, i3, i4, i5);
            } catch (NoSuchMethodError unused) {
                f949B = false;
            }
        }
    }

    /* JADX INFO: renamed from: z0 */
    public void mo1039z0(View view, Matrix matrix) {
        if (f951z) {
            try {
                AbstractC0467z.m1100b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f951z = false;
            }
        }
    }
}
