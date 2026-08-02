package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qj extends dw {
    public static final int $stable = 8;
    private final pj mLoader;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public qj() {
        ClassLoader classLoader = qj.class.getClassLoader();
        classLoader.getClass();
        this.mLoader = new pj(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
        return this.mLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.dw, defpackage.cw, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lg3.a(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onRestoreInstanceState(bundle);
        Bundle bundle2 = bundle.getBundle("android:viewHierarchyState");
        if (bundle2 != null) {
            bundle2.setClassLoader(this.mLoader);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        boolean z = (getResources().getConfiguration().uiMode & 48) == 32;
        Window window = getWindow();
        hh1 hh1Var = new hh1(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new ef3(window, hh1Var, 1) : i >= 30 ? new df3(window, hh1Var, 1) : new df3(window, hh1Var, 0)).c(!z);
    }
}
