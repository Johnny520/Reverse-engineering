package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: ef */
/* JADX INFO: loaded from: classes.dex */
public class C1368ef extends C1325df {
    @Override // p000.AbstractC1263cf
    /* JADX INFO: renamed from: a */
    public void mo2399a(C1313dA r2, C1313dA r3, Window r4, View r5, boolean r6, boolean r7) {
        AbstractC0671Pj.m1359y(r4, false);
        r2.getClass();
        r4.setStatusBarColor(0);
        r3.getClass();
        r4.setNavigationBarColor(0);
        AbstractC0688Q.m1414r(r4);
        AbstractC0688Q.m1421y(r4);
        C1517hw r22 = new C1517hw(r5, 8);
        int r32 = Build.VERSION.SDK_INT;
        if (r32 < 35) goto L6;
        AbstractC1293cr r33 = new C0618OF(r4, r22);
    L9:
        r33.mo1028T(!r6);
        r33.mo1027S(!r7);
        return;
    L6:
        if (r32 < 30) goto L8;
        r33 = new C0575NF(r4, r22);
        goto L9
    L8:
        r33 = new C0532MF(r4, r22);
        goto L9
    }
}
