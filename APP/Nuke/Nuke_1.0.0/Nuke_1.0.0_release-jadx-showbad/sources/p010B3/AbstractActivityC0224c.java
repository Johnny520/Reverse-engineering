package p010B3;

import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import com.bumptech.glide.AbstractC1926h;
import p117X2.AbstractC1665j;
import p135b.AbstractActivityC1823k;
import p229r1.C3072d0;
import p229r1.C3074e0;
import p229r1.C3076f0;

/* JADX INFO: renamed from: B3.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC0224c extends AbstractActivityC1823k {
    public static final int $stable = 8;
    private final C0223b mLoader;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractActivityC0224c() {
        ClassLoader classLoader = AbstractActivityC0224c.class.getClassLoader();
        AbstractC1665j.m2984d(classLoader, "getClassLoader(...)");
        this.mLoader = new C0223b(classLoader);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
        return this.mLoader;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p135b.AbstractActivityC1823k, p194l1.AbstractActivityC2494b, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1926h.m3560c(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        AbstractC1665j.m2985e(bundle, "savedInstanceState");
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
        boolean z5 = (getResources().getConfiguration().uiMode & 48) == 32;
        Window window = getWindow();
        getWindow().getDecorView();
        int i5 = Build.VERSION.SDK_INT;
        (i5 >= 35 ? new C3076f0(window) : i5 >= 30 ? new C3074e0(window) : new C3072d0(window)).mo3585D(!z5);
    }
}
