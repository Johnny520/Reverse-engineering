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
    public void onCreate(Bundle r4) {
        super.onCreate(r4);
        AbstractC2257n0 r42 = getSupportActionBar();
        if (r42 == null) goto L5;
        r42.mo4506f();
    L5:
        Window r43 = getWindow();
        C1517hw r1 = new C1517hw(getWindow().getDecorView(), 8);
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 35) goto L9;
        AbstractC1293cr r02 = new C0618OF(r43, r1);
    L12:
        r02.mo1028T(!AbstractC0295Gu.m628u(this));
        r02.mo1027S(!AbstractC0295Gu.m628u(this));
        Resources r44 = getResources();
        ThreadLocal r03 = AbstractC0125Cw.f295a;
        int r45 = r44.getColor(R.color.colorBackground, null);
        Window r04 = getWindow();
        if (r04 == null) goto L15;
        r04.setStatusBarColor(r45);
    L15:
        Window r05 = getWindow();
        if (r05 == null) goto L18;
        r05.setNavigationBarColor(r45);
    L18:
        Window r06 = getWindow();
        if (r06 == null) goto L21;
        r06.setNavigationBarDividerColor(r45);
    L21:
        onCreate();
        return;
    L9:
        if (r0 < 30) goto L11;
        r02 = new C0575NF(r43, r1);
        goto L12
    L11:
        r02 = new C0532MF(r43, r1);
        goto L12
    }
}
