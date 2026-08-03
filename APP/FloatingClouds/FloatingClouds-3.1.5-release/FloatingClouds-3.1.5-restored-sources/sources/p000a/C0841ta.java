package p000a;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import top.mmjz.floatingclouds.plugin.IPlugin;

/* JADX INFO: renamed from: a.ta */
/* JADX INFO: loaded from: classes.dex */
public final class C0841ta implements IPlugin {
    /* JADX INFO: renamed from: a */
    public static void m1963a(ViewGroup viewGroup, C0387V7 c0387v7) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            C0631i9.m1479b(childAt);
            c0387v7.mo53f(childAt);
            if (childAt instanceof ViewGroup) {
                m1963a((ViewGroup) childAt, c0387v7);
            }
        }
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(C0173J8 c0173j8) {
        C0631i9.m1482e(c0173j8, "session");
        Log.e("FC_DEBUG", "MaskUIManager.handleHook START");
        C0173J8.m463a(c0173j8, "com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro", "initView", new Class[0], new C0263O8(this, 15));
    }
}
