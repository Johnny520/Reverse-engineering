package e9;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements java.lang.Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f2456g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f2457h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2458i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f2459j;

    public /* synthetic */ o(java.lang.Object r1, java.lang.Object r2, int r3, int r4) {
            r0 = this;
            r0.f2456g = r4
            r0.f2458i = r1
            r0.f2459j = r2
            r0.f2457h = r3
            r0.<init>()
            return
    }

    public /* synthetic */ o(t3.a r2, int r3, java.lang.Object r4) {
            r1 = this;
            r0 = 3
            r1.f2456g = r0
            r1.<init>()
            r1.f2458i = r2
            r1.f2457h = r3
            r1.f2459j = r4
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r9 = this;
            int r0 = r9.f2456g
            r1 = 1
            r2 = 0
            r3 = 0
            java.lang.Object r4 = r9.f2459j
            int r5 = r9.f2457h
            java.lang.Object r6 = r9.f2458i
            switch(r0) {
                case 0: goto Lb9;
                case 1: goto L4d;
                case 2: goto L16;
                default: goto Le;
            }
        Le:
            t3.a r6 = (t3.a) r6
            t3.e r0 = r6.f13033b
            r0.c(r5, r4)
            return
        L16:
            nb.w r6 = (nb.w) r6
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L1e
            java.lang.String r4 = ""
        L1e:
            boolean r0 = r6.f9328r
            if (r0 != 0) goto L4c
            int r0 = r4.length()
            if (r0 != 0) goto L29
            goto L4c
        L29:
            java.lang.String r0 = r6.f9326p
            boolean r0 = r4.equals(r0)
            if (r0 != 0) goto L32
            goto L4c
        L32:
            nb.l r0 = r6.f9325o
            boolean r1 = r0 instanceof nb.n
            if (r1 == 0) goto L3b
            r3 = r0
            nb.n r3 = (nb.n) r3
        L3b:
            if (r3 == 0) goto L4c
            int r0 = r6.f9327q
            int r0 = r0 + r5
            java.lang.String r1 = r3.f9297a
            int r1 = r1.length()
            int r0 = r9.e0.r(r0, r2, r1)
            r3.f9298b = r0
        L4c:
            return
        L4d:
            lb.i r6 = (lb.i) r6
            android.view.View r4 = (android.view.View) r4
            java.lang.String r0 = "m"
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.readField(r4, r0)
            if (r0 == 0) goto L6e
            java.lang.String r7 = "j"
            java.lang.Object[] r8 = new java.lang.Object[r2]
            java.lang.Object r0 = h.Hchat.utils.KavaReflector.invokeMethod(r0, r7, r8)
            if (r0 == 0) goto L6e
            boolean r7 = r0 instanceof android.view.View
            if (r7 == 0) goto L6a
            android.view.View r0 = (android.view.View) r0
            goto L6b
        L6a:
            r0 = r3
        L6b:
            if (r0 == 0) goto L6e
            r3 = r0
        L6e:
            if (r3 == 0) goto Lb8
            r3.setFocusable(r1)
            r3.setFocusableInTouchMode(r1)
            r3.requestFocusFromTouch()
            r3.requestFocus()
            boolean r0 = r3 instanceof android.widget.EditText
            if (r0 == 0) goto L90
            r0 = r3
            android.widget.EditText r0 = (android.widget.EditText) r0
            android.text.Editable r7 = r0.getText()
            if (r7 == 0) goto L8d
            int r2 = r7.length()
        L8d:
            r0.setSelection(r2)
        L90:
            r3.performClick()
            android.content.Context r0 = r3.getContext()
            java.lang.Class<android.view.inputmethod.InputMethodManager> r2 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r0 = r0.getSystemService(r2)
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            if (r0 == 0) goto La4
            r0.showSoftInput(r3, r1)
        La4:
            r0 = 2
            if (r5 >= r0) goto Lb8
            boolean r0 = r3.hasFocus()
            if (r0 != 0) goto Lb8
            int r5 = r5 + r1
            e9.o r0 = new e9.o
            r0.<init>(r6, r4, r5, r1)
            r1 = 120(0x78, double:5.93E-322)
            r4.postDelayed(r0, r1)
        Lb8:
            return
        Lb9:
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r4 = (java.lang.String) r4
            boolean r0 = ya.i.f(r6, r4, r1)
            if (r0 == 0) goto L138
            java.util.concurrent.atomic.AtomicBoolean r0 = e9.q.f2460a
            java.lang.String r0 = "notification"
            java.lang.Object r0 = r6.getSystemService(r0)
            boolean r1 = r0 instanceof android.app.NotificationManager
            if (r1 == 0) goto Ld2
            r3 = r0
            android.app.NotificationManager r3 = (android.app.NotificationManager) r3
        Ld2:
            if (r3 == 0) goto L138
            r3.cancel(r5)     // Catch: java.lang.Throwable -> L110
            android.service.notification.StatusBarNotification[] r0 = r3.getActiveNotifications()     // Catch: java.lang.Throwable -> L110
            r0.getClass()     // Catch: java.lang.Throwable -> L110
            int r1 = r0.length     // Catch: java.lang.Throwable -> L110
            r5 = r2
        Le0:
            if (r5 >= r1) goto L120
            r6 = r0[r5]     // Catch: java.lang.Throwable -> L110
            android.app.Notification r7 = r6.getNotification()     // Catch: java.lang.Throwable -> L110
            if (r7 == 0) goto L11d
            android.os.Bundle r7 = r7.extras     // Catch: java.lang.Throwable -> L110
            if (r7 == 0) goto L11d
            java.lang.String r8 = "hchat_custom_notification"
            boolean r8 = r7.getBoolean(r8, r2)     // Catch: java.lang.Throwable -> L110
            if (r8 == 0) goto L11d
            java.lang.String r8 = "hchat_custom_notification_talker"
            java.lang.String r7 = r7.getString(r8)     // Catch: java.lang.Throwable -> L110
            boolean r7 = gg.l.a(r7, r4)     // Catch: java.lang.Throwable -> L110
            if (r7 == 0) goto L11d
            java.lang.String r7 = r6.getTag()     // Catch: java.lang.Throwable -> L110
            if (r7 != 0) goto L112
            int r6 = r6.getId()     // Catch: java.lang.Throwable -> L110
            r3.cancel(r6)     // Catch: java.lang.Throwable -> L110
            goto L11d
        L110:
            r0 = move-exception
            goto L123
        L112:
            java.lang.String r7 = r6.getTag()     // Catch: java.lang.Throwable -> L110
            int r6 = r6.getId()     // Catch: java.lang.Throwable -> L110
            r3.cancel(r7, r6)     // Catch: java.lang.Throwable -> L110
        L11d:
            int r5 = r5 + 1
            goto Le0
        L120:
            sf.n r0 = sf.n.f12433a     // Catch: java.lang.Throwable -> L110
            goto L129
        L123:
            sf.f r1 = new sf.f
            r1.<init>(r0)
            r0 = r1
        L129:
            java.lang.Throwable r0 = sf.g.b(r0)
            if (r0 == 0) goto L138
            java.lang.String r1 = "[Hchat:CustomNotification] 清理会话通知失败: "
            java.lang.String r1 = r1.concat(r4)
            fb.v0.n(r1, r0)
        L138:
            return
    }
}
