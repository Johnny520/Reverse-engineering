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

    private C0489LF consumeAllInsets(C0489LF c0489lf) {
        C0489LF c0489lf2 = C0489LF.f1601b;
        return c0489lf2.m945g() != null ? c0489lf2 : c0489lf.f1602a.mo92c().f1602a.mo91b();
    }

    public static boolean install(ViewPager2 viewPager2) {
        ApplicationInfo applicationInfo = viewPager2.getContext().getApplicationInfo();
        if (Build.VERSION.SDK_INT >= 30 && applicationInfo.targetSdkVersion >= 30) {
            return false;
        }
        WindowInsetsApplier windowInsetsApplier = new WindowInsetsApplier();
        WeakHashMap weakHashMap = AbstractC2185lE.f7617a;
        AbstractC1360eE.m2640l(viewPager2, windowInsetsApplier);
        return true;
    }

    @Override // p000.InterfaceC1470gt
    public C0489LF onApplyWindowInsets(View view, C0489LF c0489lf) {
        ViewPager2 viewPager2 = (ViewPager2) view;
        C0489LF c0489lfM4394g = AbstractC2185lE.m4394g(viewPager2, c0489lf);
        if (c0489lfM4394g.f1602a.mo94n()) {
            return c0489lfM4394g;
        }
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            AbstractC2185lE.m4389b(recyclerView.getChildAt(i), new C0489LF(c0489lfM4394g));
        }
        return consumeAllInsets(c0489lfM4394g);
    }
}
