package top.sacz.xphelper.activity;

import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.AbstractC3888;
import p398.C9830;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class BaseActivity extends FragmentActivity {
    private final C9830 mLoader = new C9830(BaseActivity.class.getClassLoader());

    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
        return this.mLoader;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC3888.m7247(this);
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("android:viewHierarchyState");
        if (bundle2 != null) {
            bundle2.setClassLoader(this.mLoader);
        }
        super.onRestoreInstanceState(bundle);
    }

    public void requestTranslucentStatusBar() {
        Window window = getWindow();
        window.clearFlags(201326592);
        window.getDecorView().setSystemUiVisibility(1792);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
    }
}
