package com.kongzue.dialogx.interfaces;

/* JADX INFO: renamed from: com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0008 implements defpackage.InterfaceC0770 {

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static java.lang.Thread f362;

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public static java.lang.ref.WeakReference f363;

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public static java.util.concurrent.CopyOnWriteArrayList f364;

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public static java.util.HashMap f365;

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public static java.lang.ref.WeakReference f366;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final boolean f367;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public boolean f368;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public boolean f369;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final int[] f370;

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final int f371;

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public long f372;

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final int f373;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f374;

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final defpackage.C2223 f375;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f376;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public java.lang.ref.WeakReference f377;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public android.content.Context f378;

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final boolean f379;

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final int[] f380;

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public boolean f381;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final androidx.lifecycle.C0005 f382;

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final long f383;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public defpackage.InterfaceC1753 f384;

    public AbstractC0008() {
            r4 = this;
            r4.<init>()
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            r0 = 1
            r4.f373 = r0
            androidx.lifecycle.ᛷᲁᛳᛳ r1 = new androidx.lifecycle.ᛷᲁᛳᛳ
            r1.<init>(r4)
            r4.f382 = r1
            r4.f367 = r0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1 = 2
            int[] r1 = new int[r1]
            r4.f370 = r1
            r1 = -1
            r4.f372 = r1
            r4.f383 = r1
            r3 = 4
            int[] r3 = new int[r3]
            r4.f380 = r3
            r4.f368 = r0
            ᲈᛴᛵᲈ r3 = defpackage.AbstractC0042.f556
            r4.f375 = r3
            int r3 = defpackage.AbstractC0042.f552
            r4.f371 = r3
            r4.f372 = r1
            r4.f383 = r1
            r4.f379 = r0
            boolean r0 = defpackage.AbstractC0042.f551
            r4.f367 = r0
            return
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public static java.util.ArrayList m240(android.view.View r3) {
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
            java.util.ArrayList r2 = m240(r2)
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

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ, reason: contains not printable characters */
    public static void m241(android.app.Activity r4) {
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            java.util.concurrent.CopyOnWriteArrayList r0 = com.kongzue.dialogx.interfaces.AbstractC0008.f364
            r1 = 0
            if (r0 == 0) goto L3e
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            java.util.concurrent.CopyOnWriteArrayList r2 = com.kongzue.dialogx.interfaces.AbstractC0008.f364
            r0.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r0.next()
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r2 = (com.kongzue.dialogx.interfaces.AbstractC0008) r2
            android.app.Activity r3 = r2.m271()
            if (r3 != r4) goto L12
            java.lang.ref.WeakReference r3 = r2.f377
            if (r3 == 0) goto L2b
            r3.clear()
        L2b:
            r2.f376 = r1
            r2.f377 = r1
            java.util.concurrent.CopyOnWriteArrayList r3 = com.kongzue.dialogx.interfaces.AbstractC0008.f364
            r3.remove(r2)
            boolean r3 = r2 instanceof defpackage.C0525
            if (r3 == 0) goto L12
            ᛳᛸᛳᛸ r2 = (defpackage.C0525) r2
            r2.m1318()
            goto L12
        L3e:
            android.app.Activity r0 = m243()
            if (r4 != r0) goto L4f
            java.lang.ref.WeakReference r4 = com.kongzue.dialogx.interfaces.AbstractC0008.f363
            if (r4 == 0) goto L4b
            r4.clear()
        L4b:
            com.kongzue.dialogx.interfaces.AbstractC0008.f363 = r1
            ᲈᛴᛵᲈ r4 = defpackage.AbstractC0042.f556
        L4f:
            return
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public static void m242(android.view.View r4) {
            if (r4 != 0) goto L4
            goto L81
        L4:
            java.lang.Object r0 = r4.getTag()
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r0 = (com.kongzue.dialogx.interfaces.AbstractC0008) r0
            java.lang.String r1 = r0.mo274()
            java.lang.String r2 = ".dismiss"
            java.lang.String r1 = r1.concat(r2)
            m245(r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = com.kongzue.dialogx.interfaces.AbstractC0008.f364
            if (r1 == 0) goto L1e
            r1.remove(r0)
        L1e:
            java.lang.ref.WeakReference r1 = r0.f376
            if (r1 == 0) goto L25
            r1.clear()
        L25:
            ᲀᲁᛵᛸ r1 = r0.f384
            if (r1 == 0) goto L2c
            r1.mo740(r0)
        L2c:
            int r1 = r0.f373
            int r1 = defpackage.AbstractC0225.m812(r1)
            r2 = 1
            if (r1 == r2) goto L5e
            r3 = 2
            if (r1 == r3) goto L48
            r3 = 3
            if (r1 == r3) goto L47
            ᛱᛵᛸᲈ r1 = new ᛱᛵᛸᲈ
            r1.<init>(r4, r0, r2)
            android.os.Handler r4 = m255()
            r4.post(r1)
        L47:
            return
        L48:
            java.lang.ref.WeakReference r4 = r0.f374
            if (r4 == 0) goto L81
            java.lang.Object r4 = r4.get()
            if (r4 == 0) goto L81
            java.lang.ref.WeakReference r4 = r0.f374
            java.lang.Object r4 = r4.get()
            ᛷᛴᲁᲈ r4 = (defpackage.C1263) r4
            r4.m3850()
            return
        L5e:
            java.lang.Object r0 = r4.getTag()
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r0 = (com.kongzue.dialogx.interfaces.AbstractC0008) r0
            if (r0 == 0) goto L81
            android.app.Activity r1 = r0.m271()
            if (r1 == 0) goto L81
            android.app.Activity r0 = r0.m271()
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.ViewParent r4 = r4.getParent()
            android.view.View r4 = (android.view.View) r4
            r0.removeViewImmediate(r4)
        L81:
            return
    }

    /* JADX INFO: renamed from: ᛲᲈᛷᛵ, reason: contains not printable characters */
    public static android.app.Activity m243() {
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0008.f363
            if (r0 == 0) goto L14
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto Lb
            goto L14
        Lb:
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0008.f363
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L14:
            r0 = 0
            m253(r0)
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0008.f363
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L23
            goto L2c
        L23:
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0008.f363
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L2c:
            android.app.Activity r0 = defpackage.C0855.m1805()
            m253(r0)
            return r0
    }

    /* JADX INFO: renamed from: ᛴᲀᲁᛴ, reason: contains not printable characters */
    public static boolean m244(java.lang.CharSequence r1) {
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

    /* JADX INFO: renamed from: ᛶᛳᲀᲈ, reason: contains not printable characters */
    public static void m245(java.lang.String r1) {
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            java.lang.String r0 = ">>>"
            java.lang.String r1 = r1.toString()
            android.util.Log.i(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛷᛷ, reason: contains not printable characters */
    public static void m246(android.widget.TextView r1, java.lang.CharSequence r2) {
            if (r1 != 0) goto L3
            return
        L3:
            boolean r0 = m244(r2)
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

    /* JADX INFO: renamed from: ᛷᛵᲇᛶ, reason: contains not printable characters */
    public static void m247(android.view.View r6) {
            if (r6 != 0) goto L4
            goto L17e
        L4:
            java.lang.Object r0 = r6.getTag()
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r0 = (com.kongzue.dialogx.interfaces.AbstractC0008) r0
            if (r0 == 0) goto L17e
            boolean r1 = r0.f369
            r2 = 0
            if (r1 == 0) goto L33
            android.view.View r1 = r0.m262()
            if (r1 == 0) goto L1f
            android.view.View r6 = r0.m262()
            r6.setVisibility(r2)
            return
        L1f:
            java.lang.Object r6 = r6.getTag()
            com.kongzue.dialogx.interfaces.ᛷᲁᛳᛳ r6 = (com.kongzue.dialogx.interfaces.AbstractC0008) r6
            java.lang.String r6 = r6.mo274()
            java.lang.String r0 = "已处于显示状态，请勿重复执行 show() 指令。"
            java.lang.String r6 = r6.concat(r0)
            m251(r6)
            return
        L33:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r6)
            r0.f376 = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = r0.mo274()
            r1.<init>(r3)
            java.lang.String r3 = ".show on "
            r1.append(r3)
            boolean r3 = r0.m272()
            if (r3 == 0) goto L53
            android.app.Activity r3 = r0.m271()
            goto L55
        L53:
            java.lang.String r3 = "window"
        L55:
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            m245(r1)
            java.util.concurrent.CopyOnWriteArrayList r1 = com.kongzue.dialogx.interfaces.AbstractC0008.f364
            if (r1 != 0) goto L6a
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            com.kongzue.dialogx.interfaces.AbstractC0008.f364 = r1
        L6a:
            r1.add(r0)
            int r1 = r0.f373
            int r1 = defpackage.AbstractC0225.m812(r1)
            r3 = 1
            if (r1 == r3) goto L14a
            r3 = 2
            r4 = 0
            if (r1 == r3) goto L122
            r3 = 3
            if (r1 == r3) goto L8e
            android.widget.FrameLayout r1 = r0.m261()
            if (r1 != 0) goto L85
            goto L17e
        L85:
            ᛱᛵᛸᲈ r1 = new ᛱᛵᛸᲈ
            r1.<init>(r6, r0, r2)
            m257(r1)
            return
        L8e:
            java.util.HashMap r6 = com.kongzue.dialogx.interfaces.AbstractC0008.f365
            if (r6 != 0) goto L99
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            com.kongzue.dialogx.interfaces.AbstractC0008.f365 = r6
        L99:
            java.lang.String r1 = r0.mo274()
            ᛷᲈᲀ r3 = new ᛷᲈᲀ
            r5 = 11
            r3.<init>(r5)
            r6.put(r1, r3)
            java.lang.ref.WeakReference r6 = com.kongzue.dialogx.util.DialogXFloatingWindowActivity.f385
            if (r6 != 0) goto Lad
            r6 = r4
            goto Lb3
        Lad:
            java.lang.Object r6 = r6.get()
            com.kongzue.dialogx.util.DialogXFloatingWindowActivity r6 = (com.kongzue.dialogx.util.DialogXFloatingWindowActivity) r6
        Lb3:
            if (r6 != 0) goto L11a
            android.content.Intent r6 = new android.content.Intent
            android.content.ContextWrapper r1 = m254()
            java.lang.Class<com.kongzue.dialogx.util.DialogXFloatingWindowActivity> r3 = com.kongzue.dialogx.util.DialogXFloatingWindowActivity.class
            r6.<init>(r1, r3)
            android.app.Activity r1 = r0.m271()
            if (r1 != 0) goto Lcb
            r1 = 268435456(0x10000000, float:2.524355E-29)
            r6.addFlags(r1)
        Lcb:
            java.lang.String r1 = "dialogXKey"
            java.lang.String r3 = r0.mo274()
            r6.putExtra(r1, r3)
            android.app.Activity r1 = r0.m271()
            if (r1 != 0) goto Ldc
        Lda:
            r1 = r2
            goto Lf3
        Ldc:
            android.app.Activity r1 = r0.m271()
            android.widget.FrameLayout r1 = m252(r1)
            if (r1 != 0) goto Le7
            goto Lda
        Le7:
            android.app.Activity r1 = r0.m271()
            android.widget.FrameLayout r1 = m252(r1)
            int r1 = r1.getSystemUiVisibility()
        Lf3:
            java.lang.String r3 = "fromActivityUiStatus"
            r6.putExtra(r3, r1)
            android.content.ContextWrapper r1 = m254()
            int r1 = r1.hashCode()
            java.lang.String r3 = "from"
            r6.putExtra(r3, r1)
            android.content.ContextWrapper r1 = m254()
            r1.startActivity(r6)
            android.app.Activity r6 = r0.m271()
            if (r6 == 0) goto L17e
            android.app.Activity r6 = r0.m271()
            r6.overridePendingTransition(r2, r2)
            return
        L11a:
            android.app.Activity r6 = r0.m271()
            r6.hashCode()
            throw r4
        L122:
            ᛷᛴᲁᲈ r6 = new ᛷᛴᲁᲈ
            r6.<init>()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            android.app.Activity r2 = r0.m271()
            r1.<init>(r2)
            android.app.Activity r1 = r0.m271()
            boolean r1 = r1 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 != 0) goto L149
            ᲈᛴᛵᲈ r1 = defpackage.AbstractC0042.f556
            java.lang.String r1 = ">>>"
            java.lang.String r2 = "DialogX.DialogFragment 模式无法支持非 AppCompatActivity 启动。"
            android.util.Log.e(r1, r2)
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r6)
            r0.f374 = r1
            return
        L149:
            throw r4
        L14a:
            android.app.Activity r0 = r0.m271()
            android.view.Window r1 = r0.getWindow()     // Catch: java.lang.Exception -> L173
            android.view.View r1 = r1.getDecorView()     // Catch: java.lang.Exception -> L173
            boolean r1 = r1.isAttachedToWindow()     // Catch: java.lang.Exception -> L173
            if (r1 == 0) goto L160
            defpackage.AbstractC2193.m3591(r0, r6)     // Catch: java.lang.Exception -> L173
            return
        L160:
            android.view.Window r1 = r0.getWindow()     // Catch: java.lang.Exception -> L173
            android.view.View r1 = r1.getDecorView()     // Catch: java.lang.Exception -> L173
            ᛱᲈᛷᲀ r3 = new ᛱᲈᛷᲀ     // Catch: java.lang.Exception -> L173
            r4 = 9
            r3.<init>(r0, r6, r4, r2)     // Catch: java.lang.Exception -> L173
            r1.post(r3)     // Catch: java.lang.Exception -> L173
            return
        L173:
            if (r0 == 0) goto L17e
            boolean r1 = r0.isDestroyed()
            if (r1 != 0) goto L17e
            defpackage.AbstractC2193.m3591(r0, r6)
        L17e:
            return
    }

    /* JADX INFO: renamed from: ᛷᛷᛱᛱ, reason: contains not printable characters */
    public static void m248(java.lang.Runnable r2, long r3) {
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 >= 0) goto L7
            return
        L7:
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            android.os.Handler r0 = m255()
            r0.postDelayed(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ᛷᛷᲀᛴ, reason: contains not printable characters */
    public static void m249(android.view.View r1) {
            if (r1 == 0) goto La
            boolean r0 = defpackage.AbstractC0042.f557
            if (r0 == 0) goto La
            r0 = 3
            r1.performHapticFeedback(r0)
        La:
            return
    }

    /* JADX INFO: renamed from: ᛷᲇᛷᛶ, reason: contains not printable characters */
    public static void m250(android.widget.TextView r2, defpackage.C0279 r3) {
            if (r3 != 0) goto L3
            goto L5
        L3:
            if (r2 != 0) goto L6
        L5:
            return
        L6:
            int r0 = r3.f1558
            r1 = 1
            if (r0 <= 0) goto Lf
            float r0 = (float) r0
            r2.setTextSize(r1, r0)
        Lf:
            int r0 = r3.f1557
            if (r0 == r1) goto L16
            r2.setTextColor(r0)
        L16:
            int r0 = r3.f1559
            r1 = -1
            if (r0 == r1) goto L1e
            r2.setGravity(r0)
        L1e:
            boolean r0 = r3.f1560
            if (r0 == 0) goto L28
            android.text.TextUtils$TruncateAt r0 = android.text.TextUtils.TruncateAt.END
            r2.setEllipsize(r0)
            goto L2c
        L28:
            r0 = 0
            r2.setEllipsize(r0)
        L2c:
            int r0 = r3.f1555
            if (r0 == r1) goto L34
            r2.setMaxLines(r0)
            goto L3a
        L34:
            r0 = 2147483647(0x7fffffff, float:NaN)
            r2.setMaxLines(r0)
        L3a:
            android.text.TextPaint r2 = r2.getPaint()
            boolean r3 = r3.f1556
            r2.setFakeBoldText(r3)
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public static void m251(java.lang.String r1) {
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            java.lang.String r0 = ">>>"
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r0, r1)
            return
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public static android.widget.FrameLayout m252(android.app.Activity r1) {
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

    /* JADX INFO: renamed from: ᲁᛴᛵᛲ, reason: contains not printable characters */
    public static void m253(android.content.Context r2) {
            if (r2 != 0) goto L6
            android.app.Activity r2 = defpackage.C0855.m1805()
        L6:
            boolean r0 = r2 instanceof android.app.Activity
            if (r0 == 0) goto L10
            r0 = r2
            android.app.Activity r0 = (android.app.Activity) r0
            m256(r0)
        L10:
            ᛸᛶᛱᛵ r0 = new ᛸᛶᛱᛵ
            r1 = 11
            r0.<init>(r1)
            defpackage.C0855.m1803(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public static android.content.ContextWrapper m254() {
            android.app.Activity r0 = m243()
            if (r0 != 0) goto L12
            android.app.Application r0 = defpackage.C0855.m1804()
            if (r0 != 0) goto L12
            java.lang.String r0 = "DialogX 未初始化(E2)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            m251(r0)
            r0 = 0
        L12:
            return r0
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static android.os.Handler m255() {
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0008.f366
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L13
            java.lang.ref.WeakReference r0 = com.kongzue.dialogx.interfaces.AbstractC0008.f366
            java.lang.Object r0 = r0.get()
            android.os.Handler r0 = (android.os.Handler) r0
            return r0
        L13:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            r0.<init>(r1)
            com.kongzue.dialogx.interfaces.AbstractC0008.f366 = r0
            java.lang.Object r0 = r0.get()
            android.os.Handler r0 = (android.os.Handler) r0
            return r0
    }

    /* JADX INFO: renamed from: ᲈᛵᲀᛱ, reason: contains not printable characters */
    public static void m256(android.app.Activity r5) {
            if (r5 != 0) goto L3
            goto L19
        L3:
            java.lang.String[] r0 = defpackage.AbstractC0042.f554
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
            com.kongzue.dialogx.interfaces.AbstractC0008.f362 = r0     // Catch: java.lang.Exception -> L2f
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference     // Catch: java.lang.Exception -> L2f
            r0.<init>(r5)     // Catch: java.lang.Exception -> L2f
            com.kongzue.dialogx.interfaces.AbstractC0008.f363 = r0     // Catch: java.lang.Exception -> L2f
            return
        L2f:
            r5 = move-exception
            r5.printStackTrace()
            java.lang.String r5 = "DialogX.init: 初始化异常，找不到Activity的根布局"
            m251(r5)
            return
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public static void m257(java.lang.Runnable r2) {
            ᲈᛴᛵᲈ r0 = defpackage.AbstractC0042.f556
            java.lang.Thread r0 = com.kongzue.dialogx.interfaces.AbstractC0008.f362
            if (r0 != 0) goto L10
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            com.kongzue.dialogx.interfaces.AbstractC0008.f362 = r0
        L10:
            if (r0 == 0) goto L2a
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.Thread r1 = com.kongzue.dialogx.interfaces.AbstractC0008.f362
            if (r1 != 0) goto L24
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            java.lang.Thread r1 = r1.getThread()
            com.kongzue.dialogx.interfaces.AbstractC0008.f362 = r1
        L24:
            if (r0 != r1) goto L2a
            r2.run()
            return
        L2a:
            android.os.Handler r0 = m255()
            r0.post(r2)
            return
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final int m258(float r1) {
            r0 = this;
            android.content.res.Resources r0 = r0.m263()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r1 = r1 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r1 = r1 + r0
            int r0 = (int) r1
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final int m259(int r2) {
            r1 = this;
            android.app.Application r0 = defpackage.C0855.m1804()
            if (r0 != 0) goto Le
            java.lang.String r1 = "DialogX 未初始化(E7)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            m251(r1)
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            return r1
        Le:
            android.content.res.Resources r1 = r1.m263()
            int r1 = r1.getColor(r2)
            return r1
    }

    /* JADX INFO: renamed from: ᛳᛳᛳᲈ, reason: contains not printable characters */
    public final void m260(defpackage.EnumC0578 r1) {
            r0 = this;
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r0.f382
            if (r0 == 0) goto L7
            r0.m113(r1)     // Catch: java.lang.Exception -> L7
        L7:
            return
    }

    /* JADX INFO: renamed from: ᛳᲁᲈᲁ, reason: contains not printable characters */
    public final android.widget.FrameLayout m261() {
            r3 = this;
            android.app.Activity r0 = r3.m271()
            boolean r1 = r3.m272()
            r2 = 0
            if (r1 == 0) goto L25
            if (r0 != 0) goto L20
            android.app.Activity r0 = m243()
            if (r0 != 0) goto L19
            java.lang.String r3 = "DialogX 错误：在 getRootFrameLayout() 时无法获取绑定的 activity，请确认是否正确初始化：\nDialogX.init(context);\n\n或者使用 .show(activity) 启动对话框\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            m251(r3)
            return r2
        L19:
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r3.f377 = r1
        L20:
            android.widget.FrameLayout r3 = m252(r0)
            goto L2f
        L25:
            android.view.View r3 = r3.m262()
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
            m251(r3)
            return r2
        L48:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            java.lang.Object r3 = r0.get()
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            return r3
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final android.view.View m262() {
            r0 = this;
            java.lang.ref.WeakReference r0 = r0.f376
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            return r0
    }

    /* JADX INFO: renamed from: ᛴᛸᲈᲈ, reason: contains not printable characters */
    public final android.content.res.Resources m263() {
            r1 = this;
            android.content.Context r0 = r1.f378
            if (r0 == 0) goto L9
            android.content.res.Resources r1 = r0.getResources()
            return r1
        L9:
            android.view.View r0 = r1.m262()
            if (r0 == 0) goto L18
            android.content.Context r1 = r0.getContext()
            android.content.res.Resources r1 = r1.getResources()
            return r1
        L18:
            android.app.Activity r0 = r1.m271()
            if (r0 == 0) goto L27
            android.app.Activity r1 = r1.m271()
            android.content.res.Resources r1 = r1.getResources()
            return r1
        L27:
            android.app.Application r1 = defpackage.C0855.m1804()
            if (r1 != 0) goto L32
            android.content.res.Resources r1 = android.content.res.Resources.getSystem()
            return r1
        L32:
            android.app.Application r1 = defpackage.C0855.m1804()
            android.content.res.Resources r1 = r1.getResources()
            return r1
    }

    @Override // defpackage.InterfaceC0770
    /* JADX INFO: renamed from: ᛵᛱᛵᛲ */
    public final androidx.lifecycle.C0005 mo0() {
            r0 = this;
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r0.f382
            return r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final int m264(boolean r1) {
            r0 = this;
            r1 = r1 ^ 1
            int[] r0 = r0.f370
            r0 = r0[r1]
            return r0
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ, reason: contains not printable characters */
    public abstract void mo265();

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.view.View m266(int r3) {
            r2 = this;
            boolean r0 = r2.m272()
            r1 = 0
            if (r0 == 0) goto L25
            android.app.Activity r0 = r2.m271()
            if (r0 != 0) goto L13
            java.lang.String r2 = "DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            m251(r2)
            return r1
        L13:
            android.content.Context r0 = r2.f378
            if (r0 == 0) goto L18
            goto L1c
        L18:
            android.app.Activity r0 = r2.m271()
        L1c:
            android.view.LayoutInflater r2 = defpackage.AbstractC1668.m3063(r0)
            android.view.View r2 = r2.inflate(r3, r1)
            return r2
        L25:
            android.content.Context r2 = r2.f378
            if (r2 == 0) goto L2a
            goto L2e
        L2a:
            android.app.Application r2 = defpackage.C0855.m1804()
        L2e:
            android.view.LayoutInflater r2 = defpackage.AbstractC1668.m3063(r2)
            android.view.View r2 = r2.inflate(r3, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final void m267() {
            r2 = this;
            r0 = 0
            r2.f381 = r0
            android.app.Activity r0 = m243()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r2.f377 = r1
            android.app.Activity r0 = r2.m271()
            if (r0 != 0) goto L2a
            boolean r0 = r2.m272()
            if (r0 == 0) goto L2a
            r0 = 0
            m253(r0)
            android.app.Activity r0 = r2.m271()
            if (r0 != 0) goto L2a
            java.lang.String r2 = "DialogX 未初始化(E5)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            m251(r2)
            return
        L2a:
            int r0 = r2.f373
            r1 = 1
            if (r0 == r1) goto L49
            android.app.Activity r0 = r2.m271()
            boolean r0 = r0 instanceof defpackage.InterfaceC0770
            if (r0 == 0) goto L49
            android.app.Activity r0 = r2.m271()
            ᛴᲁᲁᛶ r0 = (defpackage.InterfaceC0770) r0
            androidx.lifecycle.ᛷᲁᛳᛳ r0 = r0.mo0()
            com.kongzue.dialogx.interfaces.BaseDialog$7 r1 = new com.kongzue.dialogx.interfaces.BaseDialog$7
            r1.<init>(r2)
            r0.m110(r1)
        L49:
            android.app.Activity r0 = r2.m271()
            android.view.View r0 = r0.getCurrentFocus()
            if (r0 == 0) goto L67
            android.app.Activity r2 = r2.m271()
            java.lang.String r1 = "input_method"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.view.inputmethod.InputMethodManager r2 = (android.view.inputmethod.InputMethodManager) r2
            android.os.IBinder r0 = r0.getWindowToken()
            r1 = 2
            r2.hideSoftInputFromWindow(r0, r1)
        L67:
            return
    }

    /* JADX INFO: renamed from: ᲀᲀᛴᛳ, reason: contains not printable characters */
    public final void m268(android.widget.EditText r2, boolean r3) {
            r1 = this;
            android.app.Activity r0 = r1.m271()
            if (r0 != 0) goto L7
            return
        L7:
            android.app.Activity r1 = r1.m271()
            java.lang.String r0 = "input_method"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.view.inputmethod.InputMethodManager r1 = (android.view.inputmethod.InputMethodManager) r1
            r0 = 0
            if (r3 == 0) goto L1a
            r1.showSoftInput(r2, r0)
            return
        L1a:
            android.os.IBinder r2 = r2.getWindowToken()
            r1.hideSoftInputFromWindow(r2, r0)
            return
    }

    /* JADX INFO: renamed from: ᲁᛱᛲᲈ, reason: contains not printable characters */
    public void mo269() {
            r0 = this;
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᛳ, reason: contains not printable characters */
    public boolean mo270() {
            r3 = this;
            r0 = 3
            r1 = 1
            int r2 = r3.f371
            if (r2 != r0) goto L20
            android.app.Application r0 = defpackage.C0855.m1804()
            if (r0 != 0) goto Lf
            if (r2 != r1) goto L23
            goto L22
        Lf:
            android.content.res.Resources r3 = r3.m263()
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

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final android.app.Activity m271() {
            r2 = this;
            java.lang.ref.WeakReference r0 = r2.f377
            if (r0 == 0) goto La
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L15
        La:
            android.app.Activity r0 = m243()
            java.lang.ref.WeakReference r1 = new java.lang.ref.WeakReference
            r1.<init>(r0)
            r2.f377 = r1
        L15:
            java.lang.ref.WeakReference r2 = r2.f377
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            return r2
    }

    /* JADX INFO: renamed from: ᲇᛳᛴᲈ, reason: contains not printable characters */
    public final boolean m272() {
            r2 = this;
            int r2 = r2.f373
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

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final android.view.View m273(android.content.Context r3, int r4) {
            r2 = this;
            boolean r0 = r2.m272()
            r1 = 0
            if (r0 == 0) goto L21
            android.app.Activity r0 = r2.m271()
            if (r0 != 0) goto L13
            java.lang.String r2 = "DialogX 未初始化(E3)。\n请检查是否在启动对话框前进行初始化操作，使用以下代码进行初始化：\nDialogX.init(context);\n\n另外建议您前往查看 DialogX 的文档进行使用：https://github.com/kongzue/DialogX"
            m251(r2)
            return r1
        L13:
            android.content.Context r2 = r2.f378
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            android.view.LayoutInflater r2 = defpackage.AbstractC1668.m3063(r3)
            android.view.View r2 = r2.inflate(r4, r1)
            return r2
        L21:
            android.content.Context r2 = r2.f378
            if (r2 == 0) goto L26
            r3 = r2
        L26:
            android.view.LayoutInflater r2 = defpackage.AbstractC1668.m3063(r3)
            android.view.View r2 = r2.inflate(r4, r1)
            return r2
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public abstract java.lang.String mo274();
}
