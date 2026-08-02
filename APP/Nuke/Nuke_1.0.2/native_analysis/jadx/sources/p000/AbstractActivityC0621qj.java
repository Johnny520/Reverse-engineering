package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;

/* JADX INFO: renamed from: qj */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0621qj extends AbstractActivityC0144dw {
    public static final int $stable = 8;
    private final C0582pj mLoader;

    public AbstractActivityC0621qj() {
        ClassLoader classLoader = AbstractActivityC0621qj.class.getClassLoader();
        classLoader.getClass();
        this.mLoader = new C0582pj(classLoader);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
        return this.mLoader;
    }

    @Override // p000.AbstractActivityC0144dw, p000.AbstractActivityC0108cw, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        lg3.m2909a(this);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onRestoreInstanceState(bundle);
        Bundle bundle2 = bundle.getBundle("android:viewHierarchyState");
        if (bundle2 != null) {
            bundle2.setClassLoader(this.mLoader);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        boolean z = (getResources().getConfiguration().uiMode & 48) == 32;
        Window window = getWindow();
        hh1 hh1Var = new hh1(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        (i >= 35 ? new ef3(window, hh1Var, 1) : i >= 30 ? new df3(window, hh1Var, 1) : new df3(window, hh1Var, 0)).mo1014c(!z);
    }
}
