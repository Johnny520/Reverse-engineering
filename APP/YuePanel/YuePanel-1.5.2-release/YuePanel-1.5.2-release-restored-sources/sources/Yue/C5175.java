package Yue;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: renamed from: Yue.ۥۣ۠ۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C5175 {
    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ */
    public static InterfaceC5171 m1949(@InterfaceC6391 View view, @InterfaceC6391 ViewGroup viewGroup, @InterfaceC6490 Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? C5173.m1947(view, viewGroup, matrix) : C5174.m1948(view, viewGroup, matrix);
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public static void m1950(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            C5173.m15855(view);
        } else {
            C5174.m15859(view);
        }
    }
}
