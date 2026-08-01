package p135b;

import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bumptech.glide.AbstractC1924f;
import com.bumptech.glide.AbstractC1926h;
import p117X2.AbstractC1665j;
import p229r1.C3072d0;
import p229r1.C3074e0;
import p229r1.C3076f0;

/* JADX INFO: renamed from: b.q */
/* JADX INFO: loaded from: classes.dex */
public class C1829q extends C1828p {
    @Override // p135b.C1827o
    /* JADX INFO: renamed from: b */
    public void mo3297b(C1812D c1812d, C1812D c1812d2, Window window, View view, boolean z5, boolean z6) {
        AbstractC1665j.m2985e(c1812d, "statusBarStyle");
        AbstractC1665j.m2985e(c1812d2, "navigationBarStyle");
        AbstractC1665j.m2985e(window, "window");
        AbstractC1665j.m2985e(view, "view");
        AbstractC1924f.m3511y(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        int i5 = Build.VERSION.SDK_INT;
        AbstractC1926h c3076f0 = i5 >= 35 ? new C3076f0(window) : i5 >= 30 ? new C3074e0(window) : new C3072d0(window);
        c3076f0.mo3585D(!z5);
        c3076f0.mo3584C(!z6);
    }
}
