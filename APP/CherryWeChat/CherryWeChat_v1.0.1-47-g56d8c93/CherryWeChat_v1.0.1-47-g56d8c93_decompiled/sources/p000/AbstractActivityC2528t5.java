package p000;

import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import io.github.cherrywechat.R;

/* JADX INFO: renamed from: t5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractActivityC2528t5 extends AbstractActivityC1244c3 {
    public AbstractActivityC2528t5() {
        getSavedStateRegistry().m2898c("androidx:appcompat", new C1121a3(this));
        addOnContextAvailableListener(new C1201b3(this));
    }

    public abstract void onCreate();

    @Override // p000.AbstractActivityC2148ki, p000.AbstractActivityC0833Ta, p000.AbstractActivityC0790Sa, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC2257n0 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.mo4506f();
        }
        Window window = getWindow();
        C1517hw c1517hw = new C1517hw(getWindow().getDecorView(), 8);
        int i = Build.VERSION.SDK_INT;
        AbstractC1293cr c0618of = i >= 35 ? new C0618OF(window, c1517hw) : i >= 30 ? new C0575NF(window, c1517hw) : new C0532MF(window, c1517hw);
        c0618of.mo1028T(!AbstractC0295Gu.m628u(this));
        c0618of.mo1027S(!AbstractC0295Gu.m628u(this));
        Resources resources = getResources();
        ThreadLocal threadLocal = AbstractC0125Cw.f295a;
        int color = resources.getColor(R.color.colorBackground, null);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setStatusBarColor(color);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setNavigationBarColor(color);
        }
        Window window4 = getWindow();
        if (window4 != null) {
            window4.setNavigationBarDividerColor(color);
        }
        onCreate();
    }
}
