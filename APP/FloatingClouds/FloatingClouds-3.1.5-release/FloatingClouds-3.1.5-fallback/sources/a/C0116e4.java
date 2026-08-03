package a;

/* JADX INFO: renamed from: a.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0116e4 implements top.mmjz.floatingclouds.plugin.IPlugin {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile java.lang.String f450a;
    public volatile long b;
    public final android.os.Handler c;

    public C0116e4() {
            r2 = this;
            r2.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r2.c = r0
            return
    }

    public static boolean b(android.view.MenuItem r2) {
            int r0 = r2.getItemId()
            r1 = 1835102465(0x6d617101, float:4.3606713E27)
            if (r0 != r1) goto La
            goto L3a
        La:
            java.lang.CharSequence r2 = r2.getTitle()
            if (r2 == 0) goto L15
            java.lang.String r2 = r2.toString()
            goto L16
        L15:
            r2 = 0
        L16:
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            java.lang.String r0 = r0.C
            boolean r1 = a.Be.P(r0)
            if (r1 == 0) goto L29
            java.lang.String r0 = "加入密友"
        L29:
            boolean r0 = a.C0193i9.a(r2, r0)
            if (r0 != 0) goto L3a
            java.lang.String r0 = "取消密友"
            boolean r2 = a.C0193i9.a(r2, r0)
            if (r2 == 0) goto L38
            goto L3a
        L38:
            r2 = 0
            return r2
        L3a:
            r2 = 1
            return r2
    }

    public static java.lang.String c(java.lang.Object r6) {
            r0 = 0
            java.lang.String r1 = "field_username"
            java.lang.Object r1 = a.A1.h(r6, r1)     // Catch: java.lang.Throwable -> Le
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> Le
            if (r2 == 0) goto L10
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> Le
            goto L16
        Le:
            r1 = move-exception
            goto L12
        L10:
            r1 = r0
            goto L16
        L12:
            a.wd$a r1 = a.C0465xd.a(r1)
        L16:
            boolean r2 = r1 instanceof a.C0447wd.a
            if (r2 == 0) goto L1b
            r1 = r0
        L1b:
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L27
            boolean r2 = a.Be.P(r1)
            if (r2 == 0) goto L26
            goto L27
        L26:
            return r1
        L27:
            java.lang.Class r1 = r6.getClass()
        L2b:
            if (r1 == 0) goto L6d
            java.lang.reflect.Field[] r2 = r1.getDeclaredFields()
            a.G1 r2 = a.C0435w1.I(r2)
        L35:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L68
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3
            java.lang.Class r4 = r3.getType()
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            boolean r4 = a.C0193i9.a(r4, r5)
            if (r4 == 0) goto L35
            r4 = 1
            r3.setAccessible(r4)
            java.lang.Object r3 = r3.get(r6)
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L5c
            java.lang.String r3 = (java.lang.String) r3
            goto L5d
        L5c:
            r3 = r0
        L5d:
            if (r3 != 0) goto L60
            goto L35
        L60:
            boolean r4 = a.yh.a(r3)
            if (r4 == 0) goto L35
            r0 = r3
            goto L6d
        L68:
            java.lang.Class r1 = r1.getSuperclass()
            goto L2b
        L6d:
            return r0
    }

    public final void a() {
            r12 = this;
            java.lang.String r1 = r12.f450a
            if (r1 != 0) goto L6
            goto L95
        L6:
            r0 = 0
            r12.f450a = r0
            java.util.concurrent.ExecutorService r0 = a.fh.G
            boolean r0 = a.fh.a.a(r1)
            java.lang.String r8 = "CAM"
            r9 = 0
            java.lang.String r10 = "刻舟求剑"
            if (r0 == 0) goto L49
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.K3.a.o(r1)
            android.content.Context r2 = a.C0435w1.p
            if (r2 != 0) goto L23
            goto L3f
        L23:
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            boolean r3 = r0.R
            if (r3 == 0) goto L3f
            java.lang.String r0 = r0.U
            boolean r3 = a.Be.P(r0)
            if (r3 == 0) goto L37
            goto L38
        L37:
            r10 = r0
        L38:
            android.widget.Toast r0 = android.widget.Toast.makeText(r2, r10, r9)
            r0.show()
        L3f:
            java.lang.String r0 = "removeMask OK: "
            java.lang.String r0 = r0.concat(r1)
            android.util.Log.e(r8, r0)
            goto L87
        L49:
            a.K3$a r11 = a.K3.f148a
            top.mmjz.floatingclouds.bean.MaskItemBean r0 = new top.mmjz.floatingclouds.bean.MaskItemBean
            r4 = 0
            r5 = 0
            r3 = 0
            r6 = 28
            r7 = 0
            r2 = r1
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            r11.getClass()
            a.K3.a.a(r0)
            android.content.Context r0 = a.C0435w1.p
            if (r0 != 0) goto L62
            goto L7e
        L62:
            r11.getClass()
            a.jc r2 = a.K3.a.i()
            boolean r3 = r2.R
            if (r3 == 0) goto L7e
            java.lang.String r2 = r2.T
            boolean r3 = a.Be.P(r2)
            if (r3 == 0) goto L76
            goto L77
        L76:
            r10 = r2
        L77:
            android.widget.Toast r0 = android.widget.Toast.makeText(r0, r10, r9)
            r0.show()
        L7e:
            java.lang.String r0 = "addMask OK: "
            java.lang.String r0 = r0.concat(r1)
            android.util.Log.e(r8, r0)
        L87:
            a.k4 r0 = a.C0366s4.M
            if (r0 == 0) goto L8e
            r0.a()
        L8e:
            a.A3 r0 = a.C0174h8.k
            if (r0 == 0) goto L95
            r0.a()
        L95:
            return
    }

    @Override // top.mmjz.floatingclouds.plugin.IPlugin
    public final void handleHook(a.J8 r38) {
            r37 = this;
            r1 = r37
            r2 = r38
            r3 = 0
            r4 = 1
            java.lang.String r0 = "session"
            a.C0193i9.e(r2, r0)
            java.lang.String r5 = "CAM"
            java.lang.String r0 = "handleHook START"
            android.util.Log.e(r5, r0)
            java.lang.String r0 = "com.tencent.mm.ui.conversation.m3"
            java.lang.String r6 = "com.tencent.mm.ui.conversation.n3"
            java.lang.String r7 = "com.tencent.mm.ui.conversation.r3"
            java.lang.String[] r6 = new java.lang.String[]{r0, r6, r7}
            r7 = r3
            r8 = r7
        L1e:
            java.lang.String r9 = " fail: "
            java.lang.String r10 = "conv "
            r11 = 3
            java.lang.ClassLoader r12 = r2.f136a
            if (r7 >= r11) goto L85
            r13 = r6[r7]
            if (r8 != 0) goto L85
            java.lang.String r0 = "onCreateContextMenu"
            java.lang.Class<android.view.ContextMenu> r11 = android.view.ContextMenu.class
            java.lang.Class<android.view.View> r14 = android.view.View.class
            java.lang.Class<android.view.ContextMenu$ContextMenuInfo> r15 = android.view.ContextMenu.ContextMenuInfo.class
            java.lang.Object[] r11 = new java.lang.Object[]{r11, r14, r15}     // Catch: java.lang.Throwable -> L5b
            java.lang.reflect.Method r0 = a.A1.e(r13, r12, r0, r11)     // Catch: java.lang.Throwable -> L5b
            if (r0 == 0) goto L5d
            a.d4 r11 = new a.d4     // Catch: java.lang.Throwable -> L5b
            r11.<init>(r1, r3)     // Catch: java.lang.Throwable -> L5b
            a.J8.g(r2, r0, r11)     // Catch: java.lang.Throwable -> L5b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5b
            r0.<init>()     // Catch: java.lang.Throwable -> L5b
            java.lang.String r11 = "conv onCreateContextMenu hooked: "
            r0.append(r11)     // Catch: java.lang.Throwable -> L5b
            r0.append(r13)     // Catch: java.lang.Throwable -> L5b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5b
            android.util.Log.e(r5, r0)     // Catch: java.lang.Throwable -> L5b
            r8 = r4
            goto L5d
        L5b:
            r0 = move-exception
            goto L60
        L5d:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L5b
            goto L64
        L60:
            a.wd$a r0 = a.C0465xd.a(r0)
        L64:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto L83
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r10)
            r11.append(r13)
            r11.append(r9)
            r11.append(r0)
            java.lang.String r0 = r11.toString()
            android.util.Log.w(r5, r0)
        L83:
            int r7 = r7 + r4
            goto L1e
        L85:
            if (r8 != 0) goto L8c
            java.lang.String r0 = "!!! conv onCreateContextMenu NOT FOUND"
            android.util.Log.e(r5, r0)
        L8c:
            java.lang.String r0 = "com.tencent.mm.ui.conversation.k3"
            java.lang.String r6 = "com.tencent.mm.ui.conversation.l3"
            java.lang.String r7 = "com.tencent.mm.ui.conversation.p3"
            java.lang.String[] r6 = new java.lang.String[]{r0, r6, r7}
            r7 = r3
            r8 = r7
        L98:
            java.lang.Class r13 = java.lang.Integer.TYPE
            java.lang.Class<android.view.MenuItem> r14 = android.view.MenuItem.class
            java.lang.String r15 = "onMMMenuItemSelected"
            r16 = r3
            if (r7 >= r11) goto Lfa
            r3 = r6[r7]
            if (r8 != 0) goto Lfa
            java.lang.Object[] r0 = new java.lang.Object[]{r14, r13}     // Catch: java.lang.Throwable -> Lce
            java.lang.reflect.Method r0 = a.A1.e(r3, r12, r15, r0)     // Catch: java.lang.Throwable -> Lce
            if (r0 == 0) goto Ld0
            a.d4 r13 = new a.d4     // Catch: java.lang.Throwable -> Lce
            r13.<init>(r1, r4)     // Catch: java.lang.Throwable -> Lce
            a.J8.g(r2, r0, r13)     // Catch: java.lang.Throwable -> Lce
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lce
            r0.<init>()     // Catch: java.lang.Throwable -> Lce
            java.lang.String r13 = "onMMMenuItemSelected hooked: "
            r0.append(r13)     // Catch: java.lang.Throwable -> Lce
            r0.append(r3)     // Catch: java.lang.Throwable -> Lce
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lce
            android.util.Log.e(r5, r0)     // Catch: java.lang.Throwable -> Lce
            r8 = r4
            goto Ld0
        Lce:
            r0 = move-exception
            goto Ld3
        Ld0:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> Lce
            goto Ld7
        Ld3:
            a.wd$a r0 = a.C0465xd.a(r0)
        Ld7:
            java.lang.Throwable r0 = a.C0447wd.a(r0)
            if (r0 == 0) goto Lf6
            java.lang.String r0 = r0.getMessage()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r10)
            r13.append(r3)
            r13.append(r9)
            r13.append(r0)
            java.lang.String r0 = r13.toString()
            android.util.Log.w(r5, r0)
        Lf6:
            int r7 = r7 + r4
            r3 = r16
            goto L98
        Lfa:
            if (r8 != 0) goto L1bf
            java.lang.String r0 = "com.tencent.mm.ui.conversation"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r0 = r0[r16]
            java.lang.String r3 = ".a"
            java.lang.String r17 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".b"
            java.lang.String r18 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".c"
            java.lang.String r19 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".d"
            java.lang.String r20 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".e"
            java.lang.String r21 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".f"
            java.lang.String r22 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".g"
            java.lang.String r23 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".h"
            java.lang.String r24 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".i"
            java.lang.String r25 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".j"
            java.lang.String r26 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".k3"
            java.lang.String r27 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".l3"
            java.lang.String r28 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".m3"
            java.lang.String r29 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".n3"
            java.lang.String r30 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".o3"
            java.lang.String r31 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".p3"
            java.lang.String r32 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".q3"
            java.lang.String r33 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".r3"
            java.lang.String r34 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".s3"
            java.lang.String r35 = a.C0487z.f(r0, r3)
            java.lang.String r3 = ".t3"
            java.lang.String r36 = a.C0487z.f(r0, r3)
            java.lang.String[] r3 = new java.lang.String[]{r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36}
            r6 = r16
        L182:
            r0 = 20
            if (r6 >= r0) goto L1ba
            r0 = r3[r6]
            java.lang.Object[] r7 = new java.lang.Object[]{r14, r13}     // Catch: java.lang.Throwable -> L1b0
            java.lang.reflect.Method r7 = a.A1.e(r0, r12, r15, r7)     // Catch: java.lang.Throwable -> L1b0
            if (r7 == 0) goto L1b2
            a.d4 r8 = new a.d4     // Catch: java.lang.Throwable -> L1b0
            r9 = 2
            r8.<init>(r1, r9)     // Catch: java.lang.Throwable -> L1b0
            a.J8.g(r2, r7, r8)     // Catch: java.lang.Throwable -> L1b0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1b0
            r7.<init>()     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r8 = "onMMMenuItemSelected hooked (broad): "
            r7.append(r8)     // Catch: java.lang.Throwable -> L1b0
            r7.append(r0)     // Catch: java.lang.Throwable -> L1b0
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Throwable -> L1b0
            android.util.Log.e(r5, r0)     // Catch: java.lang.Throwable -> L1b0
            goto L1bf
        L1b0:
            r0 = move-exception
            goto L1b5
        L1b2:
            a.Wf r0 = a.Wf.f330a     // Catch: java.lang.Throwable -> L1b0
            goto L1b8
        L1b5:
            a.C0465xd.a(r0)
        L1b8:
            int r6 = r6 + r4
            goto L182
        L1ba:
            java.lang.String r0 = "onMMMenuItemSelected broad search failed"
            android.util.Log.w(r5, r0)
        L1bf:
            java.lang.String r0 = "ready"
            android.util.Log.e(r5, r0)
            return
    }
}
