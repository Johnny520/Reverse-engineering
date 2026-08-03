package androidx.viewpager2.widget;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;
import p000.AbstractC1360eE;
import p000.AbstractC2185lE;
import p000.C0489LF;
import p000.InterfaceC1470gt;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsApplier implements InterfaceC1470gt {
    private WindowInsetsApplier() {
    }

    private C0489LF consumeAllInsets(C0489LF r3) {
        C0489LF r0 = C0489LF.f1601b;
        if (r0.m945g() == null) goto L6;
        return r0;
    L6:
        return r3.f1602a.mo92c().f1602a.mo91b();
    }

    public static boolean install(ViewPager2 r3) {
        ApplicationInfo r0 = r3.getContext().getApplicationInfo();
        if (Build.VERSION.SDK_INT >= 30) goto L5;
    L8:
        WindowInsetsApplier r02 = new WindowInsetsApplier();
        WeakHashMap r1 = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2640l(r3, r02);
        return true;
    L5:
        if (r0.targetSdkVersion < 30) goto L8;
        return false;
    }

    @Override // p000.InterfaceC1470gt
    public C0489LF onApplyWindowInsets(View r5, C0489LF r6) {
        ViewPager2 r52 = (ViewPager2) r5;
        C0489LF r62 = AbstractC2185lE.m4394g(r52, r6);
        if (r62.f1602a.mo94n() == false) goto L5;
        return r62;
    L5:
        RecyclerView r53 = r52.mRecyclerView;
        int r0 = r53.getChildCount();
        int r1 = 0;
    L6:
        if (r1 >= r0) goto L9;
        AbstractC2185lE.m4389b(r53.getChildAt(r1), new C0489LF(r62));
        r1 = r1 + 1;
        goto L6
    L9:
        return consumeAllInsets(r62);
    }
}
