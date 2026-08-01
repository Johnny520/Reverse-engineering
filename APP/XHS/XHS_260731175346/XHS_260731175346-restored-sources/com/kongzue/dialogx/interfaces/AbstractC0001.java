package com.kongzue.dialogx.interfaces;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0001 implements xhss.InterfaceC0386 {

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public static java.util.concurrent.CopyOnWriteArrayList f74;

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static java.lang.ref.WeakReference f75;

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public static java.lang.Thread f76;

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public static java.util.HashMap f77;

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public static java.lang.ref.WeakReference f78;

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f79;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f80;

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public boolean f81;

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public final int f82;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public xhss.InterfaceC0901 f83;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f84;

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public long f85;

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public boolean f86;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public android.content.Context f87;

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final int f88;

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final long f89;

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public boolean f90;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final int[] f91;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final androidx.lifecycle.C0000 f92;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final boolean f93;

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public final int[] f94;

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final xhss.C0564 f95;

    public AbstractC0001() {
            r4 = this;
            r4.<init>()
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            r0 = 1
            r4.f82 = r0
            androidx.lifecycle.ᛷᛵᛵᲈ r1 = new androidx.lifecycle.ᛷᛵᛵᲈ
            r1.<init>(r4)
            r4.f92 = r1
            r4.f93 = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1 = 2
            int[] r1 = new int[r1]
            r4.f91 = r1
            r1 = -1
            r4.f85 = r1
            r4.f89 = r1
            r3 = 4
            int[] r3 = new int[r3]
            r4.f94 = r3
            r4.f86 = r0
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            r4.f95 = r0
            int r0 = xhss.AbstractC1069.f3452
            r4.f88 = r0
            r4.f85 = r1
            r4.f89 = r1
            boolean r0 = xhss.AbstractC1069.f3453
            r4.f93 = r0
            return
    }

    /* JADX INFO: renamed from: ᛱᲈᛳᛴ, reason: contains not printable characters */
    public static void m32(android.view.View r5) {
            if (r5 != 0) goto L4
            goto L166
        L4:
            java.lang.Object r0 = r5.getTag()
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r0 = (com.kongzue.dialogx.interfaces.AbstractC0001) r0
            if (r0 == 0) goto L166
            boolean r1 = r0.f90
            r2 = 0
            if (r1 == 0) goto L33
            android.view.View r1 = r0.m59()
            if (r1 == 0) goto L1f
            android.view.View r5 = r0.m59()
            r5.setVisibility(r2)
            return
        L1f:
            java.lang.Object r5 = r5.getTag()
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r5 = (com.kongzue.dialogx.interfaces.AbstractC0001) r5
            java.lang.String r5 = r5.mo56()
            java.lang.String r0 = "已处于显示状态，请勿重复执行 show() 指令。"
            java.lang.String r5 = r5.concat(r0)
            m40(r5)
            return
        L33:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r5)
            r0.f79 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = r0.mo56()
            r1.<init>(r3)
            java.lang.String r3 = ".show on "
            r1.append(r3)
            boolean r3 = r0.m61()
            if (r3 == 0) goto L53
            android.app.Activity r3 = r0.m54()
            goto L55
        L53:
            java.lang.String r3 = "window"
        L55:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            xhss.ᛶᛵᲇᛸ r3 = xhss.AbstractC1069.f3451
            java.lang.String r1 = r1.toString()
            java.lang.String r3 = ">>>"
            android.util.Log.i(r3, r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = com.kongzue.dialogx.interfaces.AbstractC0001.f74
            if (r1 != 0) goto L72
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            com.kongzue.dialogx.interfaces.AbstractC0001.f74 = r1
        L72:
            r1.add(r0)
            int r1 = r0.f82
            int r1 = xhss.AbstractC0390.m784(r1)
            r4 = 1
            if (r1 == r4) goto L133
            r4 = 2
            if (r1 == r4) goto L115
            r3 = 3
            if (r1 == r3) goto L95
            android.widget.FrameLayout r1 = r0.m57()
            if (r1 != 0) goto L8c
            goto L166
        L8c:
            xhss.ᛲᲇᲁᛷ r1 = new xhss.ᛲᲇᲁᛷ
            r1.<init>(r5, r0, r2)
            m43(r1)
            return
        L95:
            java.util.HashMap r5 = com.kongzue.dialogx.interfaces.AbstractC0001.f77
            if (r5 != 0) goto La0
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            com.kongzue.dialogx.interfaces.AbstractC0001.f77 = r5
        La0:
            java.lang.String r1 = r0.mo56()
            xhss.ᛳᛴᲀᲁ r3 = new xhss.ᛳᛴᲀᲁ
            r4 = 16
            r3.<init>(r4)
            r5.put(r1, r3)
            int r5 = xhss.AbstractActivityC0963.f3166
            android.content.Intent r5 = new android.content.Intent
            android.content.ContextWrapper r1 = m37()
            java.lang.Class<xhss.ᲁᛶᲇᛲ> r3 = xhss.AbstractActivityC0963.class
            r5.<init>(r1, r3)
            android.app.Activity r1 = r0.m54()
            if (r1 != 0) goto Lc6
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r5.addFlags(r1)
        Lc6:
            java.lang.String r1 = "dialogXKey"
            java.lang.String r3 = r0.mo56()
            r5.putExtra(r1, r3)
            android.app.Activity r1 = r0.m54()
            if (r1 != 0) goto Ld7
        Ld5:
            r1 = r2
            goto Lee
        Ld7:
            android.app.Activity r1 = r0.m54()
            android.widget.FrameLayout r1 = m38(r1)
            if (r1 != 0) goto Le2
            goto Ld5
        Le2:
            android.app.Activity r1 = r0.m54()
            android.widget.FrameLayout r1 = m38(r1)
            int r1 = r1.getSystemUiVisibility()
        Lee:
            java.lang.String r3 = "fromActivityUiStatus"
            r5.putExtra(r3, r1)
            android.content.ContextWrapper r1 = m37()
            int r1 = r1.hashCode()
            java.lang.String r3 = "from"
            r5.putExtra(r3, r1)
            android.content.ContextWrapper r1 = m37()
            r1.startActivity(r5)
            android.app.Activity r5 = r0.m54()
            if (r5 == 0) goto L166
            android.app.Activity r5 = r0.m54()
            r5.overridePendingTransition(r2, r2)
            return
        L115:
            xhss.ᲁᲇᛳᛴ r5 = new xhss.ᲁᲇᛳᛴ
            r5.<init>()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            android.app.Activity r2 = r0.m54()
            r1.<init>(r2)
            r0.m54()
            java.lang.String r1 = "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。"
            android.util.Log.e(r3, r1)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r5)
            r0.f80 = r1
            return
        L133:
            android.app.Activity r0 = r0.m54()
            android.view.Window r1 = r0.getWindow()     // Catch: java.lang.Exception -> L15b
            android.view.View r1 = r1.getDecorView()     // Catch: java.lang.Exception -> L15b
            boolean r1 = r1.isAttachedToWindow()     // Catch: java.lang.Exception -> L15b
            if (r1 == 0) goto L149
            xhss.AbstractC0060.m181(r0, r5)     // Catch: java.lang.Exception -> L15b
            return
        L149:
            android.view.Window r1 = r0.getWindow()     // Catch: java.lang.Exception -> L15b
            android.view.View r1 = r1.getDecorView()     // Catch: java.lang.Exception -> L15b
            xhss.ᛳᛵᛲᲇ r2 = new xhss.ᛳᛵᛲᲇ     // Catch: java.lang.Exception -> L15b
            r3 = 4
            r2.<init>(r3, r0, r5)     // Catch: java.lang.Exception -> L15b
            r1.post(r2)     // Catch: java.lang.Exception -> L15b
            return
        L15b:
            if (r0 == 0) goto L166
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto L166
            xhss.AbstractC0060.m181(r0, r5)
        L166:
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲀᲈ, reason: contains not printable characters */
    public static boolean m33(java.lang.CharSequence r1) {
            java.lang.String r0 = java.lang.String.valueOf(r1)
            if (r1 == 0) goto L23
            java.lang.String r1 = r0.trim()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L23
            java.lang.String r1 = "null"
            boolean r1 = r1.equals(r0)
            if (r1 != 0) goto L23
            java.lang.String r1 = "(null)"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L21
            goto L23
        L21:
            r1 = 0
            return r1
        L23:
            r1 = 1
            return r1
    }

    /* JADX INFO: renamed from: ᛳᛶᛷᲀ, reason: contains not printable characters */
    public static void m34(android.view.View r1) {
            if (r1 == 0) goto L8
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            r0 = 3
            r1.performHapticFeedback(r0)
        L8:
            return
    }

    /* JADX INFO: renamed from: ᛴᲈᛱᛴ, reason: contains not printable characters */
    public static android.app.Activity m35() {
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0001.f75
            if (r0 == 0) goto L14
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lb
            goto L14
        Lb:
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0001.f75
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L14:
            r0 = 0
            m48(r0)
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0001.f75
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L23
            goto L2c
        L23:
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0001.f75
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L2c:
            android.app.Activity r0 = xhss.C0932.m1531()
            m48(r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛵᛲᲁᛶ, reason: contains not printable characters */
    public static void m36(java.lang.Runnable r2, long r3) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L7
            return
        L7:
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            android.os.Handler r0 = m47()
            r0.postDelayed(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ᛶᲇᲈᛸ, reason: contains not printable characters */
    public static android.content.ContextWrapper m37() {
            android.app.Activity r0 = m35()
            if (r0 != 0) goto L12
            android.app.Application r0 = xhss.C0932.m1533()
            if (r0 != 0) goto L12
            java.lang.String r0 = "DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            m40(r0)
            r0 = 0
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᲁ, reason: contains not printable characters */
    public static android.widget.FrameLayout m38(android.app.Activity r1) {
            if (r1 == 0) goto L20
            android.view.Window r0 = r1.getWindow()
            if (r0 == 0) goto L20
            android.view.Window r0 = r1.getWindow()
            android.view.View r0 = r0.getDecorView()
            boolean r0 = r0 instanceof android.widget.FrameLayout
            if (r0 != 0) goto L15
            goto L20
        L15:
            android.view.Window r1 = r1.getWindow()
            android.view.View r1 = r1.getDecorView()
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            return r1
        L20:
            r1 = 0
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛲᲀᛵ, reason: contains not printable characters */
    public static java.util.ArrayList m39(android.view.View r3) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            boolean r1 = r3 instanceof android.view.ViewGroup
            if (r1 == 0) goto L22
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r1 = 0
        Lc:
            int r2 = r3.getChildCount()
            if (r1 >= r2) goto L22
            android.view.View r2 = r3.getChildAt(r1)
            java.util.ArrayList r2 = m39(r2)
            if (r2 == 0) goto L1f
            r0.addAll(r2)
        L1f:
            int r1 = r1 + 1
            goto Lc
        L22:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L29
            return r0
        L29:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public static void m40(java.lang.String r1) {
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            java.lang.String r0 = ">>>"
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛸᛴᛸᛲ, reason: contains not printable characters */
    public static void m41(android.widget.TextView r1, java.lang.CharSequence r2) {
            if (r1 != 0) goto L3
            return
        L3:
            boolean r0 = m33(r2)
            if (r0 == 0) goto L14
            r2 = 8
            r1.setVisibility(r2)
            java.lang.String r2 = ""
            r1.setText(r2)
            return
        L14:
            r0 = 0
            r1.setVisibility(r0)
            r1.setText(r2)
            return
    }

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public static void m42(android.view.View r4) {
            if (r4 != 0) goto L4
            goto L89
        L4:
            java.lang.Object r0 = r4.getTag()
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r0 = (com.kongzue.dialogx.interfaces.AbstractC0001) r0
            java.lang.String r1 = r0.mo56()
            java.lang.String r2 = ".dismiss"
            java.lang.String r1 = r1.concat(r2)
            xhss.ᛶᛵᲇᛸ r2 = xhss.AbstractC1069.f3451
            java.lang.String r2 = ">>>"
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r2, r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = com.kongzue.dialogx.interfaces.AbstractC0001.f74
            if (r1 == 0) goto L26
            r1.remove(r0)
        L26:
            java.lang.ref.WeakReference r1 = r0.f79
            if (r1 == 0) goto L2d
            r1.clear()
        L2d:
            xhss.ᲀᲀᲁᲀ r1 = r0.f83
            if (r1 == 0) goto L34
            r1.mo965(r0)
        L34:
            int r1 = r0.f82
            int r1 = xhss.AbstractC0390.m784(r1)
            r2 = 1
            if (r1 == r2) goto L66
            r3 = 2
            if (r1 == r3) goto L50
            r3 = 3
            if (r1 == r3) goto L89
            xhss.ᛲᲇᲁᛷ r1 = new xhss.ᛲᲇᲁᛷ
            r1.<init>(r4, r0, r2)
            android.os.Handler r4 = m47()
            r4.post(r1)
            return
        L50:
            java.lang.ref.WeakReference r4 = r0.f80
            if (r4 == 0) goto L89
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L89
            java.lang.ref.WeakReference r4 = r0.f80
            java.lang.Object r4 = r4.get()
            xhss.ᲁᲇᛳᛴ r4 = (xhss.C0991) r4
            r4.m1291()
            return
        L66:
            java.lang.Object r0 = r4.getTag()
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r0 = (com.kongzue.dialogx.interfaces.AbstractC0001) r0
            if (r0 == 0) goto L89
            android.app.Activity r1 = r0.m54()
            if (r1 == 0) goto L89
            android.app.Activity r0 = r0.m54()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.ViewParent r4 = r4.getParent()
            android.view.View r4 = (android.view.View) r4
            r0.removeViewImmediate(r4)
        L89:
            return
    }

    /* JADX INFO: renamed from: ᲁᛴᛴᛸ, reason: contains not printable characters */
    public static void m43(java.lang.Runnable r2) {
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            java.lang.Thread r0 = com.kongzue.dialogx.interfaces.AbstractC0001.f76
            if (r0 != 0) goto L10
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            com.kongzue.dialogx.interfaces.AbstractC0001.f76 = r0
        L10:
            if (r0 == 0) goto L2a
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = com.kongzue.dialogx.interfaces.AbstractC0001.f76
            if (r1 != 0) goto L24
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            com.kongzue.dialogx.interfaces.AbstractC0001.f76 = r1
        L24:
            if (r0 != r1) goto L2a
            r2.run()
            return
        L2a:
            android.os.Handler r0 = m47()
            r0.post(r2)
            return
    }

    /* JADX INFO: renamed from: ᲁᛴᲇᛲ, reason: contains not printable characters */
    public static void m44(android.app.Activity r5) {
            if (r5 != 0) goto L3
            goto L19
        L3:
            java.lang.String[] r0 = xhss.AbstractC1069.f3449
            int r1 = r0.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.Class r4 = r5.getClass()
            java.lang.String r4 = r4.getName()
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L1a
        L19:
            return
        L1a:
            int r2 = r2 + 1
            goto L7
        L1d:
            android.os.Looper r0 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> L2f
            java.lang.Thread r0 = r0.getThread()     // Catch: java.lang.Exception -> L2f
            com.kongzue.dialogx.interfaces.AbstractC0001.f76 = r0     // Catch: java.lang.Exception -> L2f
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L2f
            r0.<init>(r5)     // Catch: java.lang.Exception -> L2f
            com.kongzue.dialogx.interfaces.AbstractC0001.f75 = r0     // Catch: java.lang.Exception -> L2f
            return
        L2f:
            r5 = move-exception
            r5.printStackTrace()
            java.lang.String r5 = "DialogX.init: 初始化异常，找不到Activity的根布局"
            m40(r5)
            return
    }

    /* JADX INFO: renamed from: ᲁᛷᲇᲇ, reason: contains not printable characters */
    public static void m45(android.widget.TextView r2, xhss.C0584 r3) {
            if (r3 != 0) goto L3
            goto L5
        L3:
            if (r2 != 0) goto L6
        L5:
            return
        L6:
            int r0 = r3.f2037
            r1 = 1
            if (r0 <= 0) goto Lf
            float r0 = (float) r0
            r2.setTextSize(r1, r0)
        Lf:
            int r0 = r3.f2035
            if (r0 == r1) goto L16
            r2.setTextColor(r0)
        L16:
            int r0 = r3.f2034
            r1 = -1
            if (r0 == r1) goto L1e
            r2.setGravity(r0)
        L1e:
            boolean r0 = r3.f2039
            if (r0 == 0) goto L28
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r0)
            goto L2c
        L28:
            r0 = 0
            r2.setEllipsize(r0)
        L2c:
            int r0 = r3.f2036
            if (r0 == r1) goto L34
            r2.setMaxLines(r0)
            goto L3a
        L34:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.setMaxLines(r0)
        L3a:
            android.text.TextPaint r2 = r2.getPaint()
            boolean r3 = r3.f2038
            r2.setFakeBoldText(r3)
            return
    }

    /* JADX INFO: renamed from: ᲁᲁᛴᲁ, reason: contains not printable characters */
    public static void m46(android.app.Activity r4) {
            xhss.ᛶᛵᲇᛸ r0 = xhss.AbstractC1069.f3451
            java.util.concurrent.CopyOnWriteArrayList r0 = com.kongzue.dialogx.interfaces.AbstractC0001.f74
            r1 = 0
            if (r0 == 0) goto L3e
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.concurrent.CopyOnWriteArrayList r2 = com.kongzue.dialogx.interfaces.AbstractC0001.f74
            r0.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r0.next()
            com.kongzue.dialogx.interfaces.ᛷᛵᛵᲈ r2 = (com.kongzue.dialogx.interfaces.AbstractC0001) r2
            android.app.Activity r3 = r2.m54()
            if (r3 != r4) goto L12
            java.lang.ref.WeakReference r3 = r2.f84
            if (r3 == 0) goto L2b
            r3.clear()
        L2b:
            r2.f79 = r1
            r2.f84 = r1
            java.util.concurrent.CopyOnWriteArrayList r3 = com.kongzue.dialogx.interfaces.AbstractC0001.f74
            r3.remove(r2)
            boolean r3 = r2 instanceof xhss.C0259
            if (r3 == 0) goto L12
            xhss.ᛳᛴᛵ r2 = (xhss.C0259) r2
            r2.m573()
            goto L12
        L3e:
            android.app.Activity r0 = m35()
            if (r4 != r0) goto L4f
            java.lang.ref.WeakReference r4 = com.kongzue.dialogx.interfaces.AbstractC0001.f75
            if (r4 == 0) goto L4b
            r4.clear()
        L4b:
            com.kongzue.dialogx.interfaces.AbstractC0001.f75 = r1
            xhss.ᛶᛵᲇᛸ r4 = xhss.AbstractC1069.f3451
        L4f:
            return
    }

    /* JADX INFO: renamed from: ᲇᛸᛳᲁ, reason: contains not printable characters */
    public static android.os.Handler m47() {
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0001.f78
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L13
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0001.f78
            java.lang.Object r0 = r0.get()
            android.os.Handler r0 = (android.os.Handler) r0
            return r0
        L13:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.AbstractC0001.f78 = r0
            java.lang.Object r0 = r0.get()
            android.os.Handler r0 = (android.os.Handler) r0
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛲᛵᲁ, reason: contains not printable characters */
    public static void m48(android.content.ContextWrapper r2) {
            if (r2 != 0) goto L6
            android.app.Activity r2 = xhss.C0932.m1531()
        L6:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L10
            r0 = r2
            android.app.Activity r0 = (android.app.Activity) r0
            m44(r0)
        L10:
            xhss.ᛳᛴᲀᲁ r0 = new xhss.ᛳᛴᲀᲁ
            r1 = 15
            r0.<init>(r1)
            xhss.C0932.m1532(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final void m49() {
            r2 = this;
            r0 = 0
            r2.f81 = r0
            android.app.Activity r0 = m35()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r2.f84 = r1
            android.app.Activity r0 = r2.m54()
            if (r0 != 0) goto L2a
            boolean r0 = r2.m61()
            if (r0 == 0) goto L2a
            r0 = 0
            m48(r0)
            android.app.Activity r0 = r2.m54()
            if (r0 != 0) goto L2a
            java.lang.String r2 = "DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            m40(r2)
            return
        L2a:
            int r0 = r2.f82
            r1 = 1
            if (r0 == r1) goto L49
            android.app.Activity r0 = r2.m54()
            boolean r0 = r0 instanceof xhss.InterfaceC0386
            if (r0 == 0) goto L49
            android.app.Activity r0 = r2.m54()
            xhss.ᛴᛷᲀᲁ r0 = (xhss.InterfaceC0386) r0
            androidx.lifecycle.ᛷᛵᛵᲈ r0 = r0.mo63()
            com.kongzue.dialogx.interfaces.BaseDialog$7 r1 = new com.kongzue.dialogx.interfaces.BaseDialog$7
            r1.<init>(r2)
            r0.m26(r1)
        L49:
            android.app.Activity r0 = r2.m54()
            android.view.View r0 = r0.getCurrentFocus()
            if (r0 == 0) goto L67
            android.app.Activity r2 = r2.m54()
            java.lang.String r1 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            android.os.IBinder r0 = r0.getWindowToken()
            r1 = 2
            r2.hideSoftInputFromWindow(r0, r1)
        L67:
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᲁᲈ, reason: contains not printable characters */
    public boolean mo50() {
            r3 = this;
            r0 = 3
            r1 = 1
            int r2 = r3.f88
            if (r2 != r0) goto L20
            android.app.Application r0 = xhss.C0932.m1533()
            if (r0 != 0) goto Lf
            if (r2 != r1) goto L23
            goto L22
        Lf:
            android.content.res.Resources r3 = r3.m58()
            android.content.res.Configuration r3 = r3.getConfiguration()
            int r3 = r3.uiMode
            r3 = r3 & 48
            r0 = 16
            if (r3 != r0) goto L23
            goto L22
        L20:
            if (r2 != r1) goto L23
        L22:
            return r1
        L23:
            r3 = 0
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛲ, reason: contains not printable characters */
    public void mo51() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᛳᛸᛵᲀ, reason: contains not printable characters */
    public abstract void mo52();

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final android.view.View m53(int r3) {
            r2 = this;
            boolean r0 = r2.m61()
            r1 = 0
            if (r0 == 0) goto L25
            android.app.Activity r0 = r2.m54()
            if (r0 != 0) goto L13
            java.lang.String r2 = "DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            m40(r2)
            return r1
        L13:
            android.content.Context r0 = r2.f87
            if (r0 == 0) goto L18
            goto L1c
        L18:
            android.app.Activity r0 = r2.m54()
        L1c:
            android.view.LayoutInflater r2 = xhss.AbstractC0968.m1604(r0)
            android.view.View r2 = r2.inflate(r3, r1)
            return r2
        L25:
            android.content.Context r2 = r2.f87
            if (r2 == 0) goto L2a
            goto L2e
        L2a:
            android.app.Application r2 = xhss.C0932.m1533()
        L2e:
            android.view.LayoutInflater r2 = xhss.AbstractC0968.m1604(r2)
            android.view.View r2 = r2.inflate(r3, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛳᲈᲈᛲ, reason: contains not printable characters */
    public final android.app.Activity m54() {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.f84
            if (r0 == 0) goto La
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L15
        La:
            android.app.Activity r0 = m35()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r2.f84 = r1
        L15:
            java.lang.ref.WeakReference r2 = r2.f84
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            return r2
    }

    /* JADX INFO: renamed from: ᛵᛷᛲᛸ, reason: contains not printable characters */
    public final void m55(xhss.EnumC0064 r2) {
            r1 = this;
            androidx.lifecycle.ᛷᛵᛵᲈ r1 = r1.f92
            if (r1 == 0) goto Lc
            java.lang.String r0 = "setCurrentState"
            r1.m24(r0)     // Catch: java.lang.Exception -> Lc
            r1.m25(r2)     // Catch: java.lang.Exception -> Lc
        Lc:
            return
    }

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public abstract java.lang.String mo56();

    /* JADX INFO: renamed from: ᛸᛲᛷᛱ, reason: contains not printable characters */
    public final android.widget.FrameLayout m57() {
            r3 = this;
            android.app.Activity r0 = r3.m54()
            boolean r1 = r3.m61()
            r2 = 0
            if (r1 == 0) goto L25
            if (r0 != 0) goto L20
            android.app.Activity r0 = m35()
            if (r0 != 0) goto L19
            java.lang.String r3 = "DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            m40(r3)
            return r2
        L19:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r3.f84 = r1
        L20:
            android.widget.FrameLayout r3 = m38(r0)
            goto L2f
        L25:
            android.view.View r3 = r3.m59()
            android.view.ViewParent r3 = r3.getParent()
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
        L2f:
            if (r3 != 0) goto L48
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "DialogX 错误：在 getRootFrameLayout() 时无法获 activity("
            r3.<init>(r1)
            r3.append(r0)
            java.lang.String r0 = ") 的 decorView，请检查该 activity 是否正常显示且可以使 DialogX 基于其显示。\n若该 activity 不可用，可通过以下代码配置豁免 DialogX 对话框绑定至该 activity，例如：\nDialogX.unsupportedActivitiesPackageNames = new String[]{\n        \"com.bytedance.sdk.openadsdk.stub.activity\",\n        \"com.mobile.auth.gatewayauth\",\n        \"com.google.android.gms.ads\"\n};\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            m40(r3)
            return r2
        L48:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            java.lang.Object r3 = r0.get()
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            return r3
    }

    /* JADX INFO: renamed from: ᛸᛶᛴᲈ, reason: contains not printable characters */
    public final android.content.res.Resources m58() {
            r1 = this;
            android.content.Context r0 = r1.f87
            if (r0 == 0) goto L9
            android.content.res.Resources r1 = r0.getResources()
            return r1
        L9:
            android.view.View r0 = r1.m59()
            if (r0 == 0) goto L18
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            return r1
        L18:
            android.app.Activity r0 = r1.m54()
            if (r0 == 0) goto L27
            android.app.Activity r1 = r1.m54()
            android.content.res.Resources r1 = r1.getResources()
            return r1
        L27:
            android.app.Application r1 = xhss.C0932.m1533()
            if (r1 != 0) goto L32
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            return r1
        L32:
            android.app.Application r1 = xhss.C0932.m1533()
            android.content.res.Resources r1 = r1.getResources()
            return r1
    }

    /* JADX INFO: renamed from: ᛸᛶᲈᛶ, reason: contains not printable characters */
    public final android.view.View m59() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f79
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
    }

    /* JADX INFO: renamed from: ᛸᛷᲈᲈ, reason: contains not printable characters */
    public final int m60(int r2) {
            r1 = this;
            android.app.Application r0 = xhss.C0932.m1533()
            if (r0 != 0) goto Le
            java.lang.String r1 = "DialogX 未初始化(E7)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            m40(r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            return r1
        Le:
            android.content.res.Resources r1 = r1.m58()
            int r1 = r1.getColor(r2)
            return r1
    }

    /* JADX INFO: renamed from: ᲀᛷᲁᲀ, reason: contains not printable characters */
    public final boolean m61() {
            r2 = this;
            int r2 = r2.f82
            r0 = 1
            if (r2 == r0) goto Le
            r1 = 4
            if (r2 == r1) goto Le
            r1 = 3
            if (r2 != r1) goto Lc
            goto Le
        Lc:
            r2 = 0
            return r2
        Le:
            return r0
    }

    /* JADX INFO: renamed from: ᲁᛲᛴᛴ, reason: contains not printable characters */
    public final void m62(android.widget.EditText r2) {
            r1 = this;
            android.app.Activity r0 = r1.m54()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.Activity r1 = r1.m54()
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            android.os.IBinder r2 = r2.getWindowToken()
            r0 = 0
            r1.hideSoftInputFromWindow(r2, r0)
            return
    }

    @Override // xhss.InterfaceC0386
    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final androidx.lifecycle.C0000 mo63() {
            r0 = this;
            androidx.lifecycle.ᛷᛵᛵᲈ r0 = r0.f92
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final int m64(float r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.m58()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛳᲀ, reason: contains not printable characters */
    public final int m65(boolean r1) {
            r0 = this;
            r1 = r1 ^ 1
            int[] r0 = r0.f91
            r0 = r0[r1]
            return r0
    }
}
