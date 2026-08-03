package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: cf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1263cf {
    /* JADX INFO: renamed from: a */
    public void mo2399a(C1313dA c1313dA, C1313dA c1313dA2, Window window, View view, boolean z, boolean z2) {
        AbstractC0671Pj.m1359y(window, false);
        window.setStatusBarColor(z ? c1313dA.f4769b : c1313dA.f4768a);
        window.setNavigationBarColor(z2 ? c1313dA2.f4769b : c1313dA2.f4768a);
        C1517hw c1517hw = new C1517hw(view, 8);
        int i = Build.VERSION.SDK_INT;
        AbstractC1293cr c0618of = i >= 35 ? new C0618OF(window, c1517hw) : i >= 30 ? new C0575NF(window, c1517hw) : new C0532MF(window, c1517hw);
        c0618of.mo1028T(!z);
        c0618of.mo1027S(!z2);
    }
}
