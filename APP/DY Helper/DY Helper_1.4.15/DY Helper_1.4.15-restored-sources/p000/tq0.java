package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class tq0 {

    /* JADX INFO: renamed from: α */
    public static final java.util.concurrent.atomic.AtomicBoolean f10430 = null;

    static {
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            p000.tq0.f10430 = r0
            return
    }

    /* JADX INFO: renamed from: α */
    public static final void m5728(android.view.View r4, java.lang.String r5, java.lang.String r6) {
            r0 = 4
            r4.setVisibility(r0)
            r1 = 0
            r4.setAlpha(r1)
            r1 = 0
            r4.setClickable(r1)
            r4.setFocusable(r1)
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            if (r2 == 0) goto L26
            r2.width = r1
            r2.height = r1
            boolean r3 = r2 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r3 == 0) goto L23
            r3 = r2
            android.view.ViewGroup$MarginLayoutParams r3 = (android.view.ViewGroup.MarginLayoutParams) r3
            r3.setMargins(r1, r1, r1, r1)
        L23:
            r4.setLayoutParams(r2)
        L26:
            jb r1 = new jb
            r2 = 27
            r1.<init>(r4, r2)
            r4.post(r1)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            java.lang.String r1 = " reason="
            java.lang.String r2 = " view="
            java.lang.String r3 = "已隐藏右侧控件 control="
            java.lang.StringBuilder r5 = p000.lz1.m3695(r3, r5, r1, r6, r2)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "FeedRightControlsHideLegacy"
            r6 = 0
            p000.C0888ux.m5988(r5, r4, r6, r0, r6)
            return
    }

    /* JADX INFO: renamed from: β */
    public static java.lang.reflect.Field m5729(java.lang.Class r3, java.lang.String r4) {
        L0:
            r0 = 0
            if (r3 == 0) goto L27
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L27
            java.lang.reflect.Field r1 = r3.getDeclaredField(r4)     // Catch: java.lang.Throwable -> L10
            goto L17
        L10:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L17:
            boolean r2 = r1 instanceof p000.eo1
            if (r2 == 0) goto L1c
            goto L1d
        L1c:
            r0 = r1
        L1d:
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
            if (r0 == 0) goto L22
            return r0
        L22:
            java.lang.Class r3 = r3.getSuperclass()
            goto L0
        L27:
            return r0
    }

    /* JADX INFO: renamed from: γ */
    public static void m5730(java.lang.ClassLoader r7, java.lang.String r8, java.lang.String r9) {
            java.lang.Class r7 = r7.loadClass(r8)     // Catch: java.lang.Throwable -> L5
            goto Lc
        L5:
            r7 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r7)
            r7 = r0
        Lc:
            boolean r0 = r7 instanceof p000.eo1
            r1 = 0
            if (r0 == 0) goto L12
            r7 = r1
        L12:
            java.lang.Class r7 = (java.lang.Class) r7
            r0 = 4
            java.lang.String r2 = " class="
            java.lang.String r3 = "FeedRightControlsHideLegacy"
            if (r7 != 0) goto L25
            java.lang.String r7 = "未找到右侧控件模块类 control="
            java.lang.String r7 = p000.a12.m18(r7, r9, r2, r8)
            p000.C0888ux.m5988(r3, r7, r1, r0, r1)
            return
        L25:
            xq0 r4 = p000.xq0.f12253
            sq0 r5 = new sq0
            r6 = 0
            r5.<init>(r6, r7, r9)
            java.lang.String r6 = "onCreateView"
            r4.m6774(r7, r6, r5)
            sq0 r5 = new sq0
            r6 = 1
            r5.<init>(r6, r7, r9)
            java.lang.String r6 = "onViewCreated"
            r4.m6774(r7, r6, r5)
            java.lang.String r7 = "已安装右侧控件模块旧版 Hook control="
            java.lang.String r7 = p000.a12.m18(r7, r9, r2, r8)
            p000.C0888ux.m5988(r3, r7, r1, r0, r1)
            return
    }
}
