package top.sacz.xphelper.activity;

import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.bumptech.glide.AbstractC3065;
import p381.C8995;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class BaseActivity extends FragmentActivity {
    private final C8995 mLoader = new C8995(BaseActivity.class.getClassLoader());

    @Override // android.content.ContextWrapper, android.content.Context
    public ClassLoader getClassLoader() {
        return this.mLoader;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC3065.m6858(this);
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
