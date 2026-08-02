package p000;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.Window;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mb3 {

    /* JADX INFO: renamed from: a */
    public final Object f6554a;

    public mb3(Window window, View view) {
        hh1 hh1Var = new hh1(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.f6554a = new ef3(window, hh1Var, 1);
        } else if (i >= 30) {
            this.f6554a = new df3(window, hh1Var, 1);
        } else {
            this.f6554a = new df3(window, hh1Var, 0);
        }
    }

    public mb3(ViewStructure viewStructure) {
        this.f6554a = viewStructure;
    }

    public mb3(ia1 ia1Var) {
        this.f6554a = new WeakReference(ia1Var);
    }
}
