package defpackage;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.Window;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class mb3 {
    public final Object a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public mb3(Window window, View view) {
        hh1 hh1Var = new hh1(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.a = new ef3(window, hh1Var, 1);
        } else if (i >= 30) {
            this.a = new df3(window, hh1Var, 1);
        } else {
            this.a = new df3(window, hh1Var, 0);
        }
    }

    public mb3(ViewStructure viewStructure) {
        this.a = viewStructure;
    }

    public mb3(ia1 ia1Var) {
        this.a = new WeakReference(ia1Var);
    }
}
