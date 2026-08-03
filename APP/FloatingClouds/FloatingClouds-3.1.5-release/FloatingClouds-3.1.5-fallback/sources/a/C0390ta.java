package a;

/* JADX INFO: renamed from: a.ta, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0390ta implements top.mmjz.floatingclouds.plugin.IPlugin {
    public static void a(android.view.ViewGroup r4, a.V7 r5) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1d
            android.view.View r2 = r4.getChildAt(r1)
            a.C0193i9.b(r2)
            r5.f(r2)
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1a
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            a(r2, r5)
        L1a:
            int r1 = r1 + 1
            goto L5
        L1d:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r5) {
            r4 = this;
            java.lang.String r0 = "session"
            a.C0193i9.e(r5, r0)
            java.lang.String r0 = "FC_DEBUG"
            java.lang.String r1 = "MaskUIManager.handleHook START"
            android.util.Log.e(r0, r1)
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]
            a.O8 r1 = new a.O8
            r2 = 15
            r1.<init>(r4, r2)
            java.lang.String r2 = "com.tencent.mm.plugin.setting.ui.setting.SettingsCareModeIntro"
            java.lang.String r3 = "initView"
            a.J8.a(r5, r2, r3, r0, r1)
            return
    }
}
