package defpackage;

/* JADX INFO: renamed from: ᲈᛲᛵᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C2190 implements android.content.ComponentCallbacks2, defpackage.InterfaceC1960 {

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public static final defpackage.C0972 f9284 = null;

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final defpackage.C0023 f9285;

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public final java.util.concurrent.CopyOnWriteArrayList f9286;

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final defpackage.C0972 f9287;

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public final defpackage.RunnableC0439 f9288;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final defpackage.InterfaceC1280 f9289;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final android.content.Context f9290;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final com.bumptech.glide.ComponentCallbacks2C0007 f9291;

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public final defpackage.InterfaceC1563 f9292;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final defpackage.C0542 f9293;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.C1654 f9294;

    static {
            ᛵᲁᛷᲁ r0 = new ᛵᲁᛷᲁ
            r0.<init>()
            java.lang.Class<android.graphics.Bitmap> r1 = android.graphics.Bitmap.class
            ᲇᛴᛸᲇ r0 = r0.m3441(r1)
            ᛵᲁᛷᲁ r0 = (defpackage.C0972) r0
            r1 = 1
            r0.f8804 = r1
            defpackage.ComponentCallbacks2C2190.f9284 = r0
            ᛵᲁᛷᲁ r0 = new ᛵᲁᛷᲁ
            r0.<init>()
            java.lang.Class<ᛶᛴᲁᛱ> r2 = defpackage.C1064.class
            ᲇᛴᛸᲇ r0 = r0.m3441(r2)
            ᛵᲁᛷᲁ r0 = (defpackage.C0972) r0
            r0.f8804 = r1
            ᛵᲁᛷᲁ r0 = new ᛵᲁᛷᲁ
            r0.<init>()
            ᛸᛶᛵᛲ r1 = defpackage.C1506.f6656
            ᲇᛴᛸᲇ r0 = r0.m3439(r1)
            ᛵᲁᛷᲁ r0 = (defpackage.C0972) r0
            ᲇᛴᛸᲇ r0 = r0.m3434()
            ᛵᲁᛷᲁ r0 = (defpackage.C0972) r0
            ᲇᛴᛸᲇ r0 = r0.m3448()
            ᛵᲁᛷᲁ r0 = (defpackage.C0972) r0
            return
    }

    public ComponentCallbacks2C2190(com.bumptech.glide.ComponentCallbacks2C0007 r7, defpackage.InterfaceC1280 r8, defpackage.C1654 r9, android.content.Context r10) {
            r6 = this;
            ᛳᲀᛴᲈ r0 = new ᛳᲀᛴᲈ
            r0.<init>()
            ᛸᛶᛱᛵ r1 = r7.f350
            r6.<init>()
            ᛱᛱᛶᛵ r2 = new ᛱᛱᛶᛵ
            r2.<init>()
            r6.f9285 = r2
            ᛳᛳᛵᛲ r2 = new ᛳᛳᛵᛲ
            r3 = 14
            r2.<init>(r3, r6)
            r6.f9288 = r2
            r6.f9291 = r7
            r6.f9289 = r8
            r6.f9294 = r9
            r6.f9293 = r0
            r6.f9290 = r10
            android.content.Context r9 = r10.getApplicationContext()
            ᛸᲈ r10 = new ᛸᲈ
            r10.<init>(r6, r0)
            r1.getClass()
            java.lang.String r0 = "ConnectivityMonitor"
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            r5 = 0
            if (r3 >= r4) goto L54
            java.lang.String r3 = "android.permission.POST_NOTIFICATIONS"
            boolean r3 = android.text.TextUtils.equals(r3, r1)
            if (r3 == 0) goto L54
            ᲇᲈᛱᛷ r1 = new ᲇᲈᛱᛷ
            r1.<init>(r9)
            android.app.NotificationManager r1 = r1.f9176
            boolean r1 = r1.areNotificationsEnabled()
            if (r1 == 0) goto L52
            r1 = r5
            goto L60
        L52:
            r1 = -1
            goto L60
        L54:
            int r3 = android.os.Process.myPid()
            int r4 = android.os.Process.myUid()
            int r1 = r9.checkPermission(r1, r3, r4)
        L60:
            r3 = 1
            if (r1 != 0) goto L65
            r1 = r3
            goto L66
        L65:
            r1 = r5
        L66:
            r4 = 3
            boolean r4 = android.util.Log.isLoggable(r0, r4)
            if (r4 == 0) goto L77
            if (r1 == 0) goto L72
            java.lang.String r4 = "ACCESS_NETWORK_STATE permission granted, registering connectivity monitor"
            goto L74
        L72:
            java.lang.String r4 = "ACCESS_NETWORK_STATE permission missing, cannot register connectivity monitor"
        L74:
            android.util.Log.d(r0, r4)
        L77:
            if (r1 == 0) goto L7f
            ᛳᛱᛸᛶ r0 = new ᛳᛱᛸᛶ
            r0.<init>(r9, r10)
            goto L84
        L7f:
            ᛲᛵᲇᛴ r0 = new ᛲᛵᲇᛴ
            r0.<init>()
        L84:
            r6.f9292 = r0
            java.util.ArrayList r9 = r7.f351
            monitor-enter(r9)
            java.util.ArrayList r10 = r7.f351     // Catch: java.lang.Throwable -> Lf6
            boolean r10 = r10.contains(r6)     // Catch: java.lang.Throwable -> Lf6
            if (r10 != 0) goto Lf8
            java.util.ArrayList r10 = r7.f351     // Catch: java.lang.Throwable -> Lf6
            r10.add(r6)     // Catch: java.lang.Throwable -> Lf6
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lf6
            android.os.Looper r9 = android.os.Looper.myLooper()
            android.os.Looper r10 = android.os.Looper.getMainLooper()
            if (r9 != r10) goto La2
            r5 = r3
        La2:
            if (r5 != 0) goto Lac
            android.os.Handler r9 = defpackage.AbstractC1754.m3141()
            r9.post(r2)
            goto Laf
        Lac:
            r8.mo232(r6)
        Laf:
            r8.mo232(r0)
            java.util.concurrent.CopyOnWriteArrayList r8 = new java.util.concurrent.CopyOnWriteArrayList
            ᛵᛶᛳᲇ r9 = r7.f352
            java.util.List r9 = r9.f4136
            r8.<init>(r9)
            r6.f9286 = r8
            ᛵᛶᛳᲇ r7 = r7.f352
            monitor-enter(r7)
            ᛵᲁᛷᲁ r8 = r7.f4134     // Catch: java.lang.Throwable -> Lce
            if (r8 != 0) goto Ld0
            ᛵᲁᛷᲁ r8 = new ᛵᲁᛷᲁ     // Catch: java.lang.Throwable -> Lce
            r8.<init>()     // Catch: java.lang.Throwable -> Lce
            r8.f8804 = r3     // Catch: java.lang.Throwable -> Lce
            r7.f4134 = r8     // Catch: java.lang.Throwable -> Lce
            goto Ld0
        Lce:
            r6 = move-exception
            goto Lf4
        Ld0:
            monitor-exit(r7)
            monitor-enter(r6)
            ᲇᛴᛸᲇ r7 = r8.mo3092()     // Catch: java.lang.Throwable -> Lf1
            ᛵᲁᛷᲁ r7 = (defpackage.C0972) r7     // Catch: java.lang.Throwable -> Lf1
            boolean r8 = r7.f8804     // Catch: java.lang.Throwable -> Lf1
            if (r8 == 0) goto Le9
            boolean r8 = r7.f8801     // Catch: java.lang.Throwable -> Lf1
            if (r8 == 0) goto Le1
            goto Le9
        Le1:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf1
            java.lang.String r8 = "You cannot auto lock an already locked options object, try clone() first"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lf1
            throw r7     // Catch: java.lang.Throwable -> Lf1
        Le9:
            r7.f8801 = r3     // Catch: java.lang.Throwable -> Lf1
            r7.f8804 = r3     // Catch: java.lang.Throwable -> Lf1
            r6.f9287 = r7     // Catch: java.lang.Throwable -> Lf1
            monitor-exit(r6)
            return
        Lf1:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lf1
            throw r7
        Lf4:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> Lce
            throw r6
        Lf6:
            r6 = move-exception
            goto L100
        Lf8:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf6
            java.lang.String r7 = "Cannot register already registered manager"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Lf6
            throw r6     // Catch: java.lang.Throwable -> Lf6
        L100:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lf6
            throw r6
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int r1) {
            r0 = this;
            return
    }

    public final synchronized java.lang.String toString() {
            r2 = this;
            monitor-enter(r2)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2c
            r0.<init>()     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = super.toString()     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "{tracker="
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            ᛳᲀᛴᲈ r1 = r2.f9293     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = ", treeNode="
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            ᲀᛴᛱᛱ r1 = r2.f9294     // Catch: java.lang.Throwable -> L2c
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r1 = "}"
            r0.append(r1)     // Catch: java.lang.Throwable -> L2c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r2)
            return r0
        L2c:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2c
            throw r0
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᛲᛲᛵ */
    public final synchronized void mo321() {
            r3 = this;
            monitor-enter(r3)
            ᛱᛱᛶᛵ r0 = r3.f9285     // Catch: java.lang.Throwable -> L64
            r0.mo321()     // Catch: java.lang.Throwable -> L64
            r3.m3585()     // Catch: java.lang.Throwable -> L64
            ᛳᲀᛴᲈ r0 = r3.f9293     // Catch: java.lang.Throwable -> L64
            java.lang.Object r1 = r0.f2669     // Catch: java.lang.Throwable -> L64
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r1 = defpackage.AbstractC1754.m3151(r1)     // Catch: java.lang.Throwable -> L64
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L64
        L17:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L64
            if (r2 == 0) goto L27
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L64
            ᲇᛶᲁᛴ r2 = (defpackage.InterfaceC2076) r2     // Catch: java.lang.Throwable -> L64
            r0.m1332(r2)     // Catch: java.lang.Throwable -> L64
            goto L17
        L27:
            java.lang.Object r0 = r0.f2672     // Catch: java.lang.Throwable -> L64
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L64
            r0.clear()     // Catch: java.lang.Throwable -> L64
            ᛷᛵᲁ r0 = r3.f9289     // Catch: java.lang.Throwable -> L64
            r0.mo233(r3)     // Catch: java.lang.Throwable -> L64
            ᛷᛵᲁ r0 = r3.f9289     // Catch: java.lang.Throwable -> L64
            ᛸᲀᲁᛵ r1 = r3.f9292     // Catch: java.lang.Throwable -> L64
            r0.mo233(r1)     // Catch: java.lang.Throwable -> L64
            ᛳᛳᛵᛲ r0 = r3.f9288     // Catch: java.lang.Throwable -> L64
            android.os.Handler r1 = defpackage.AbstractC1754.m3141()     // Catch: java.lang.Throwable -> L64
            r1.removeCallbacks(r0)     // Catch: java.lang.Throwable -> L64
            com.bumptech.glide.ᛷᲁᛳᛳ r0 = r3.f9291     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r1 = r0.f351     // Catch: java.lang.Throwable -> L64
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r2 = r0.f351     // Catch: java.lang.Throwable -> L58
            boolean r2 = r2.contains(r3)     // Catch: java.lang.Throwable -> L58
            if (r2 == 0) goto L5a
            java.util.ArrayList r0 = r0.f351     // Catch: java.lang.Throwable -> L58
            r0.remove(r3)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            monitor-exit(r3)
            return
        L58:
            r0 = move-exception
            goto L62
        L5a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L58
            java.lang.String r2 = "Cannot unregister not yet registered manager"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L58
        L62:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r0     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L64
            throw r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public final void m3583(defpackage.InterfaceC0721 r4) {
            r3 = this;
            if (r4 != 0) goto L3
            goto L3b
        L3:
            boolean r0 = r3.m3587(r4)
            ᲇᛶᲁᛴ r1 = r4.mo736()
            if (r0 != 0) goto L3b
            com.bumptech.glide.ᛷᲁᛳᛳ r3 = r3.f9291
            java.util.ArrayList r0 = r3.f351
            monitor-enter(r0)
            java.util.ArrayList r3 = r3.f351     // Catch: java.lang.Throwable -> L2c
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2c
        L18:
            boolean r2 = r3.hasNext()     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r3.next()     // Catch: java.lang.Throwable -> L2c
            ᲈᛲᛵᲀ r2 = (defpackage.ComponentCallbacks2C2190) r2     // Catch: java.lang.Throwable -> L2c
            boolean r2 = r2.m3587(r4)     // Catch: java.lang.Throwable -> L2c
            if (r2 == 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            return
        L2c:
            r3 = move-exception
            goto L39
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            if (r1 == 0) goto L3b
            r3 = 0
            r4.mo731(r3)
            r1.clear()
            return
        L39:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2c
            throw r3
        L3b:
            return
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public final synchronized void m3584() {
            r4 = this;
            monitor-enter(r4)
            ᛳᲀᛴᲈ r0 = r4.f9293     // Catch: java.lang.Throwable -> L31
            r1 = 1
            r0.f2670 = r1     // Catch: java.lang.Throwable -> L31
            java.lang.Object r1 = r0.f2669     // Catch: java.lang.Throwable -> L31
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L31
            java.util.ArrayList r1 = defpackage.AbstractC1754.m3151(r1)     // Catch: java.lang.Throwable -> L31
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L31
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L2f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L31
            ᲇᛶᲁᛴ r2 = (defpackage.InterfaceC2076) r2     // Catch: java.lang.Throwable -> L31
            boolean r3 = r2.isRunning()     // Catch: java.lang.Throwable -> L31
            if (r3 == 0) goto L12
            r2.mo922()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r3 = r0.f2672     // Catch: java.lang.Throwable -> L31
            java.util.HashSet r3 = (java.util.HashSet) r3     // Catch: java.lang.Throwable -> L31
            r3.add(r2)     // Catch: java.lang.Throwable -> L31
            goto L12
        L2f:
            monitor-exit(r4)
            return
        L31:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L31
            throw r0
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public final synchronized void m3585() {
            r2 = this;
            monitor-enter(r2)
            ᛱᛱᛶᛵ r0 = r2.f9285     // Catch: java.lang.Throwable -> L1d
            java.util.Set r0 = r0.f464     // Catch: java.lang.Throwable -> L1d
            java.util.ArrayList r0 = defpackage.AbstractC1754.m3151(r0)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L1d
        Ld:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L1d
            ᛴᛸᛲᛲ r1 = (defpackage.InterfaceC0721) r1     // Catch: java.lang.Throwable -> L1d
            r2.m3583(r1)     // Catch: java.lang.Throwable -> L1d
            goto Ld
        L1d:
            r0 = move-exception
            goto L28
        L1f:
            ᛱᛱᛶᛵ r0 = r2.f9285     // Catch: java.lang.Throwable -> L1d
            java.util.Set r0 = r0.f464     // Catch: java.lang.Throwable -> L1d
            r0.clear()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r2)
            return
        L28:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1d
            throw r0
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᛸᛵᛸᛷ */
    public final synchronized void mo322() {
            r1 = this;
            monitor-enter(r1)
            r1.m3588()     // Catch: java.lang.Throwable -> Lb
            ᛱᛱᛶᛵ r0 = r1.f9285     // Catch: java.lang.Throwable -> Lb
            r0.mo322()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public final defpackage.C1706 m3586(java.lang.String r5) {
            r4 = this;
            ᲀᛷᛴᲀ r0 = new ᲀᛷᛴᲀ
            com.bumptech.glide.ᛷᲁᛳᛳ r1 = r4.f9291
            android.content.Context r2 = r4.f9290
            java.lang.Class<android.graphics.drawable.Drawable> r3 = android.graphics.drawable.Drawable.class
            r0.<init>(r1, r4, r3, r2)
            ᲀᛷᛴᲀ r4 = r0.m3096(r5)
            return r4
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public final synchronized boolean m3587(defpackage.InterfaceC0721 r4) {
            r3 = this;
            monitor-enter(r3)
            ᲇᛶᲁᛴ r0 = r4.mo736()     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            if (r0 != 0) goto La
            monitor-exit(r3)
            return r1
        La:
            ᛳᲀᛴᲈ r2 = r3.f9293     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r2.m1332(r0)     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L21
            ᛱᛱᛶᛵ r0 = r3.f9285     // Catch: java.lang.Throwable -> L1f
            java.util.Set r0 = r0.f464     // Catch: java.lang.Throwable -> L1f
            r0.remove(r4)     // Catch: java.lang.Throwable -> L1f
            r0 = 0
            r4.mo731(r0)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)
            return r1
        L1f:
            r4 = move-exception
            goto L24
        L21:
            monitor-exit(r3)
            r3 = 0
            return r3
        L24:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r4
    }

    @Override // defpackage.InterfaceC1960
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final synchronized void mo323() {
            r1 = this;
            monitor-enter(r1)
            ᛱᛱᛶᛵ r0 = r1.f9285     // Catch: java.lang.Throwable -> Lb
            r0.mo323()     // Catch: java.lang.Throwable -> Lb
            r1.m3584()     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public final synchronized void m3588() {
            r4 = this;
            monitor-enter(r4)
            ᛳᲀᛴᲈ r0 = r4.f9293     // Catch: java.lang.Throwable -> L37
            r1 = 0
            r0.f2670 = r1     // Catch: java.lang.Throwable -> L37
            java.lang.Object r1 = r0.f2669     // Catch: java.lang.Throwable -> L37
            java.util.Set r1 = (java.util.Set) r1     // Catch: java.lang.Throwable -> L37
            java.util.ArrayList r1 = defpackage.AbstractC1754.m3151(r1)     // Catch: java.lang.Throwable -> L37
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L37
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L37
            ᲇᛶᲁᛴ r2 = (defpackage.InterfaceC2076) r2     // Catch: java.lang.Throwable -> L37
            boolean r3 = r2.mo921()     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L12
            boolean r3 = r2.isRunning()     // Catch: java.lang.Throwable -> L37
            if (r3 != 0) goto L12
            r2.mo927()     // Catch: java.lang.Throwable -> L37
            goto L12
        L2e:
            java.lang.Object r0 = r0.f2672     // Catch: java.lang.Throwable -> L37
            java.util.HashSet r0 = (java.util.HashSet) r0     // Catch: java.lang.Throwable -> L37
            r0.clear()     // Catch: java.lang.Throwable -> L37
            monitor-exit(r4)
            return
        L37:
            r0 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L37
            throw r0
    }
}
