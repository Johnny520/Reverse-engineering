package a;

/* JADX INFO: renamed from: a.m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0259m4 implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f571a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ java.lang.Object c;
    public final /* synthetic */ top.mmjz.floatingclouds.plugin.IPlugin d;

    public /* synthetic */ RunnableC0259m4(java.lang.Object r1, boolean r2, top.mmjz.floatingclouds.plugin.IPlugin r3, int r4) {
            r0 = this;
            r0.f571a = r4
            r0.c = r1
            r0.b = r2
            r0.d = r3
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.f571a
            switch(r0) {
                case 0: goto L66;
                default: goto L5;
            }
        L5:
            boolean r0 = r9.b
            if (r0 == 0) goto Lb
            r0 = 0
            goto Ld
        Lb:
            r0 = 8
        Ld:
            java.lang.Object r1 = r9.c
            android.view.View r1 = (android.view.View) r1
            r1.setVisibility(r0)
            android.content.Context r0 = r1.getContext()
            java.lang.String r2 = "getContext(...)"
            a.C0193i9.d(r0, r2)
            top.mmjz.floatingclouds.plugin.IPlugin r3 = r9.d
            a.v5 r3 = (a.C0421v5) r3
            r3.getClass()
            int r0 = a.C0421v5.e(r0)
            android.view.ViewGroup$LayoutParams r3 = r1.getLayoutParams()
            if (r3 == 0) goto L35
            r3.width = r0
            r3.height = r0
            r1.setLayoutParams(r3)
        L35:
            android.graphics.drawable.GradientDrawable r0 = new android.graphics.drawable.GradientDrawable
            r0.<init>()
            r3 = 1
            r0.setShape(r3)
            android.content.Context r3 = r1.getContext()
            a.C0193i9.d(r3, r2)
            android.content.res.Resources r2 = r3.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            r3 = 32
            if (r2 != r3) goto L5c
            java.lang.String r2 = "#FF6B6B"
        L57:
            int r2 = android.graphics.Color.parseColor(r2)
            goto L5f
        L5c:
            java.lang.String r2 = "#FA5151"
            goto L57
        L5f:
            r0.setColor(r2)
            r1.setBackground(r0)
            return
        L66:
            a.s4$a$a r0 = a.C0366s4.a.C0005a.f679a
            java.lang.Object r1 = r9.c
            a.s4$a$a$a r1 = (a.C0366s4.a.C0005a.EnumC0006a) r1
            boolean r2 = a.C0366s4.a.C0005a.a(r1)
            boolean r3 = r9.b
            if (r2 != 0) goto La0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "[HideMainUI] toggleMute("
            r2.<init>(r4)
            r2.append(r3)
            java.lang.String r3 = ") STALE: expected="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " actual="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            r1 = 1
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            a.C0453x1.b(r0)
            goto L191
        La0:
            if (r3 == 0) goto Lb1
            a.K3$a r0 = a.K3.f148a
            r0.getClass()
            a.jc r0 = a.K3.a.i()
            boolean r0 = r0.q
            if (r0 != 0) goto Lb1
            goto L191
        Lb1:
            top.mmjz.floatingclouds.plugin.IPlugin r0 = r9.d
            a.s4 r0 = (a.C0366s4) r0
            java.lang.ClassLoader r0 = r0.k
            if (r0 != 0) goto Lbb
            goto L191
        Lbb:
            a.Eb r1 = a.Eb.f74a
            r1.getClass()
            a.K3$a r1 = a.K3.f148a
            r1.getClass()
            java.util.ArrayList r1 = a.K3.a.f()
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = a.C0312p3.g0(r1, r4)
            r2.<init>(r4)
            java.util.Iterator r1 = r1.iterator()
        Ld8:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Lec
            java.lang.Object r4 = r1.next()
            top.mmjz.floatingclouds.bean.MaskItemBean r4 = (top.mmjz.floatingclouds.bean.MaskItemBean) r4
            java.lang.String r4 = r4.getMaskId()
            r2.add(r4)
            goto Ld8
        Lec:
            java.util.Iterator r1 = r2.iterator()
        Lf0:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L191
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r4 = " mute="
            java.lang.String r5 = "MuteService"
            java.lang.String r6 = "setMute DB_OK talker="
            java.lang.String r7 = "setMute START talker="
            java.lang.String r8 = "wxid"
            a.C0193i9.e(r2, r8)
            a.K3$a r8 = a.K3.f148a     // Catch: java.lang.Throwable -> L120
            r8.getClass()     // Catch: java.lang.Throwable -> L120
            a.jc r8 = a.K3.a.i()     // Catch: java.lang.Throwable -> L120
            boolean r8 = r8.r     // Catch: java.lang.Throwable -> L120
            if (r8 != 0) goto L122
            java.lang.String r6 = "setMute skipped: hideMaskedMessageNotification disabled"
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r6}     // Catch: java.lang.Throwable -> L120
            a.C0453x1.b(r6)     // Catch: java.lang.Throwable -> L120
            goto L167
        L120:
            r6 = move-exception
            goto L16a
        L122:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L120
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L120
            r8.append(r2)     // Catch: java.lang.Throwable -> L120
            r8.append(r4)     // Catch: java.lang.Throwable -> L120
            r8.append(r3)     // Catch: java.lang.Throwable -> L120
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L120
            java.lang.Object[] r7 = new java.lang.Object[]{r5, r7}     // Catch: java.lang.Throwable -> L120
            a.C0453x1.b(r7)     // Catch: java.lang.Throwable -> L120
            boolean r7 = a.Eb.a(r2, r3)     // Catch: java.lang.Throwable -> L120
            if (r7 == 0) goto L15b
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L120
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L120
            r7.append(r2)     // Catch: java.lang.Throwable -> L120
            r7.append(r4)     // Catch: java.lang.Throwable -> L120
            r7.append(r3)     // Catch: java.lang.Throwable -> L120
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L120
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r6}     // Catch: java.lang.Throwable -> L120
            a.C0453x1.b(r6)     // Catch: java.lang.Throwable -> L120
            goto L167
        L15b:
            java.lang.String r6 = "setMute DB failed, trying Java layer e01.e2"
            java.lang.Object[] r6 = new java.lang.Object[]{r5, r6}     // Catch: java.lang.Throwable -> L120
            a.C0453x1.e(r6)     // Catch: java.lang.Throwable -> L120
            a.Eb.b(r2, r3, r0)     // Catch: java.lang.Throwable -> L120
        L167:
            a.Wf r6 = a.Wf.f330a     // Catch: java.lang.Throwable -> L120
            goto L16e
        L16a:
            a.wd$a r6 = a.C0465xd.a(r6)
        L16e:
            java.lang.Throwable r6 = a.C0447wd.a(r6)
            if (r6 == 0) goto Lf0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "setMute FAILED talker="
            r7.<init>(r8)
            r7.append(r2)
            r7.append(r4)
            r7.append(r3)
            java.lang.String r2 = r7.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r5, r2, r6}
            a.C0453x1.a(r2)
            goto Lf0
        L191:
            return
    }
}
