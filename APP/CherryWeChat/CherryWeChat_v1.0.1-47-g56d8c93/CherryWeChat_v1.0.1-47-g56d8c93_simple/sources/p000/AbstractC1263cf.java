package p000;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: renamed from: cf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1263cf {
    /* JADX INFO: renamed from: a */
    public void mo2399a(C1313dA r2, C1313dA r3, Window r4, View r5, boolean r6, boolean r7) {
        AbstractC0671Pj.m1359y(r4, false);
        if (r6 == false) goto L5;
        int r22 = r2.f4769b;
    L6:
        r4.setStatusBarColor(r22);
        if (r7 == false) goto L9;
        int r23 = r3.f4769b;
    L10:
        r4.setNavigationBarColor(r23);
        C1517hw r24 = new C1517hw(r5, 8);
        int r32 = Build.VERSION.SDK_INT;
        if (r32 < 35) goto L14;
        AbstractC1293cr r33 = new C0618OF(r4, r24);
    L17:
        r33.mo1028T(!r6);
        r33.mo1027S(!r7);
        return;
    L14:
        if (r32 < 30) goto L16;
        r33 = new C0575NF(r4, r24);
        goto L17
    L16:
        r33 = new C0532MF(r4, r24);
        goto L17
    L9:
        r23 = r3.f4768a;
        goto L10
    L5:
        r22 = r2.f4768a;
        goto L6
    }
}
