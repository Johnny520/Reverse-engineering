package com.kongzue.dialogx.util;

/* JADX INFO: loaded from: classes2.dex */
public class WindowUtil {
    public static com.kongzue.dialogx.util.WindowUtil.WindowSettings windowSettings;



    public static abstract class WindowSettings {
        public WindowSettings() {
                r0 = this;
                r0.<init>()
                return
        }

        public android.view.ViewGroup overrideRootView(android.content.Context r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public abstract android.view.WindowManager.LayoutParams overrideWindowLayoutParamsInterface(android.content.Context r1, android.view.View r2, android.view.WindowManager.LayoutParams r3);
    }

    public WindowUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void access$000(android.app.Activity r0, android.view.View r1, boolean r2) {
            showNow(r0, r1, r2)
            return
    }

    public static void dismiss(android.view.View r2) {
            java.lang.Object r0 = r2.getTag()
            com.kongzue.dialogx.interfaces.BaseDialog r0 = (com.kongzue.dialogx.interfaces.BaseDialog) r0
            if (r0 == 0) goto L23
            android.app.Activity r1 = r0.getOwnActivity()
            if (r1 == 0) goto L23
            android.app.Activity r0 = r0.getOwnActivity()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.ViewParent r2 = r2.getParent()
            android.view.View r2 = (android.view.View) r2
            r0.removeViewImmediate(r2)
        L23:
            return
    }

    public static void show(android.app.Activity r2, android.view.View r3, boolean r4) {
            android.view.Window r0 = r2.getWindow()     // Catch: java.lang.Exception -> L23
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L23
            boolean r0 = r0.isAttachedToWindow()     // Catch: java.lang.Exception -> L23
            if (r0 == 0) goto L12
            showNow(r2, r3, r4)     // Catch: java.lang.Exception -> L23
            goto L2e
        L12:
            android.view.Window r0 = r2.getWindow()     // Catch: java.lang.Exception -> L23
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L23
            com.kongzue.dialogx.util.WindowUtil$1 r1 = new com.kongzue.dialogx.util.WindowUtil$1     // Catch: java.lang.Exception -> L23
            r1.<init>(r2, r3, r4)     // Catch: java.lang.Exception -> L23
            r0.post(r1)     // Catch: java.lang.Exception -> L23
            goto L2e
        L23:
            if (r2 == 0) goto L2e
            boolean r0 = r2.isDestroyed()
            if (r0 != 0) goto L2e
            showNow(r2, r3, r4)
        L2e:
            return
    }

    private static void showNow(android.app.Activity r6, android.view.View r7, boolean r8) {
            boolean r0 = com.kongzue.dialogx.DialogX.globalHoverWindow
            r1 = 1
            if (r0 == 0) goto L22
            boolean r0 = android.provider.Settings.canDrawOverlays(r6)
            if (r0 != 0) goto L22
            java.lang.String r7 = "使用 DialogX.globalHoverWindow 必须开启悬浮窗权限"
            android.widget.Toast r7 = android.widget.Toast.makeText(r6, r7, r1)
            r7.show()
            android.content.Intent r7 = new android.content.Intent
            r7.<init>()
            java.lang.String r8 = "android.settings.action.MANAGE_OVERLAY_PERMISSION"
            r7.setAction(r8)
            r6.startActivity(r7)
            return
        L22:
            com.kongzue.dialogx.util.WindowUtil$WindowSettings r0 = com.kongzue.dialogx.util.WindowUtil.windowSettings
            if (r0 == 0) goto L2b
            android.view.ViewGroup r0 = r0.overrideRootView(r6)
            goto L2c
        L2b:
            r0 = 0
        L2c:
            if (r0 != 0) goto L33
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r6)
        L33:
            android.view.ViewParent r2 = r7.getParent()
            if (r2 == 0) goto L42
            android.view.ViewParent r2 = r7.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r2.removeView(r7)
        L42:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r0.addView(r7, r2)
            java.lang.String r2 = "window"
            java.lang.Object r2 = r6.getSystemService(r2)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r3.<init>()
            r4 = 16
            r3.gravity = r4
            r5 = -2
            r3.format = r5
            boolean r5 = com.kongzue.dialogx.DialogX.globalHoverWindow
            if (r5 == 0) goto L68
            r5 = 2038(0x7f6, float:2.856E-42)
            r3.type = r5
            goto L6c
        L68:
            r5 = 1003(0x3eb, float:1.406E-42)
            r3.type = r5
        L6c:
            r5 = 201327872(0xc000500, float:9.862266E-32)
            r3.flags = r5
            r3.softInputMode = r4
            if (r8 != 0) goto L7d
            com.kongzue.dialogx.util.WindowUtil$2 r8 = new com.kongzue.dialogx.util.WindowUtil$2
            r8.<init>(r6)
            r7.setOnTouchListener(r8)
        L7d:
            int r8 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r8 < r4) goto L86
            Yue.C1836.m8599(r3, r1)
        L86:
            com.kongzue.dialogx.util.WindowUtil$WindowSettings r8 = com.kongzue.dialogx.util.WindowUtil.windowSettings
            if (r8 == 0) goto L91
            android.view.WindowManager$LayoutParams r6 = r8.overrideWindowLayoutParamsInterface(r6, r7, r3)
            if (r6 == 0) goto L91
            r3 = r6
        L91:
            r2.addView(r0, r3)
            return
    }
}
