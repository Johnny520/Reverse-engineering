package defpackage;

/* JADX INFO: renamed from: ᲀᛳᛶᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1646 implements android.os.Handler.Callback {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C1929 f7338 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public volatile defpackage.ComponentCallbacks2C2190 f7339;

    static {
            ᲁᲁᛷᲈ r0 = new ᲁᲁᛷᲈ
            r1 = 5
            r0.<init>(r1)
            defpackage.C1646.f7338 = r0
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public static android.app.Activity m3017(android.content.Context r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L7
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        L7:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L16
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            android.app.Activity r1 = m3017(r1)
            return r1
        L16:
            r1 = 0
            return r1
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(android.os.Message r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.ComponentCallbacks2C2190 m3018(android.content.Context r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L9b
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r1 != r2) goto L67
            boolean r1 = r5 instanceof android.app.Application
            if (r1 != 0) goto L67
            boolean r1 = r5 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L4d
            androidx.fragment.app.FragmentActivity r5 = (androidx.fragment.app.FragmentActivity) r5
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            if (r1 != r2) goto L23
            r1 = 1
            goto L24
        L23:
            r1 = 0
        L24:
            if (r1 != 0) goto L2f
            android.content.Context r5 = r5.getApplicationContext()
            ᲈᛲᛵᲀ r4 = r4.m3018(r5)
            return r4
        L2f:
            boolean r4 = r5.isDestroyed()
            if (r4 != 0) goto L47
            android.app.Activity r4 = m3017(r5)
            if (r4 == 0) goto L3f
            boolean r4 = r4.isFinishing()
        L3f:
            android.content.Context r4 = r5.getApplicationContext()
            com.bumptech.glide.ComponentCallbacks2C0007.m235(r4)
            throw r0
        L47:
            java.lang.String r4 = "You cannot start a load for a destroyed activity"
            defpackage.C2264.m3684(r4)
            return r0
        L4d:
            boolean r0 = r5 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L67
            r0 = r5
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r1 = r0.getBaseContext()
            android.content.Context r1 = r1.getApplicationContext()
            if (r1 == 0) goto L67
            android.content.Context r5 = r0.getBaseContext()
            ᲈᛲᛵᲀ r4 = r4.m3018(r5)
            return r4
        L67:
            ᲈᛲᛵᲀ r0 = r4.f7339
            if (r0 != 0) goto L98
            monitor-enter(r4)
            ᲈᛲᛵᲀ r0 = r4.f7339     // Catch: java.lang.Throwable -> L92
            if (r0 != 0) goto L94
            android.content.Context r0 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L92
            com.bumptech.glide.ᛷᲁᛳᛳ r0 = com.bumptech.glide.ComponentCallbacks2C0007.m235(r0)     // Catch: java.lang.Throwable -> L92
            ᲀᛴᛱᛱ r1 = new ᲀᛴᛱᛱ     // Catch: java.lang.Throwable -> L92
            r2 = 10
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L92
            ᲀᛴᛱᛱ r2 = new ᲀᛴᛱᛱ     // Catch: java.lang.Throwable -> L92
            r3 = 21
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L92
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L92
            ᲈᛲᛵᲀ r3 = new ᲈᛲᛵᲀ     // Catch: java.lang.Throwable -> L92
            r3.<init>(r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L92
            r4.f7339 = r3     // Catch: java.lang.Throwable -> L92
            goto L94
        L92:
            r5 = move-exception
            goto L96
        L94:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L92
            goto L98
        L96:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L92
            throw r5
        L98:
            ᲈᛲᛵᲀ r4 = r4.f7339
            return r4
        L9b:
            java.lang.String r4 = "You cannot start a load on a null Context"
            defpackage.C2264.m3684(r4)
            return r0
    }
}
