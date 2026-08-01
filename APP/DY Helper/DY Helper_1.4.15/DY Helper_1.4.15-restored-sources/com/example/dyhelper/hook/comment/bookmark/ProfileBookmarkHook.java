package com.example.dyhelper.hook.comment.bookmark;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class ProfileBookmarkHook {
    public static final int $stable = 0;
    private static final java.lang.String ACTIVITY_CLASS = null;
    private static final java.lang.String BUTTON_TAG = "dyhelper_profile_bookmark_btn";
    public static final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook INSTANCE = null;
    private static final int MAX_RETRY = 10;
    private static final long RETRY_DELAY_MS = 180;
    private static final java.lang.String TAG = "ProfileBookmarkHook";
    private static volatile com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord currentProfileRecord;
    private static boolean end;
    private static final java.util.concurrent.atomic.AtomicBoolean installed = null;
    private static final android.os.Handler mainHandler = null;
    private static final java.util.WeakHashMap<android.widget.TextView, p000.s62> managedButtons = null;
    private static final p000.p70 storeChangedListener = null;

    static {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.INSTANCE = r0
            java.lang.String r0 = "~79483057E7CA3B343415F96C2AB217F7DD3E100350CFB712CECCA21FDEA59E6D1E697316E64ED89B0A30DD15E164C9063C01C2F6CC0352"
            java.lang.String r0 = p000.jf0.m2957(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.ACTIVITY_CLASS = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.installed = r0
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.mainHandler = r0
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.managedButtons = r0
            kt0 r0 = new kt0
            r1 = 22
            r0.<init>(r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.storeChangedListener = r0
            r0 = 8
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.$stable = r0
            return
    }

    private ProfileBookmarkHook() {
            r0 = this;
            r0.<init>()
            return
    }

    private final android.widget.TextView createBookmarkButton(android.content.Context r6) {
            r5 = this;
            android.widget.TextView r5 = new android.widget.TextView
            r5.<init>(r6)
            java.lang.String r0 = "dyhelper_profile_bookmark_btn"
            r5.setTag(r0)
            r0 = 1094713344(0x41400000, float:12.0)
            r5.setTextSize(r0)
            android.graphics.Typeface r0 = android.graphics.Typeface.DEFAULT_BOLD
            r5.setTypeface(r0)
            r0 = 0
            r5.setIncludeFontPadding(r0)
            r1 = 17
            r5.setGravity(r1)
            r1 = 1
            r5.setClickable(r1)
            r5.setFocusable(r1)
            r5.setSelected(r0)
            r5.setLongClickable(r0)
            r5.setMaxLines(r1)
            r0 = 0
            r5.setElevation(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.INSTANCE
            r1 = 28
            int r1 = r0.m1450dp(r6, r1)
            r5.setMinimumHeight(r1)
            r1 = 72
            int r1 = r0.m1450dp(r6, r1)
            r5.setMinimumWidth(r1)
            r1 = 10
            int r2 = r0.m1450dp(r6, r1)
            r3 = 4
            int r4 = r0.m1450dp(r6, r3)
            int r1 = r0.m1450dp(r6, r1)
            int r0 = r0.m1450dp(r6, r3)
            r5.setPadding(r2, r4, r1, r0)
            java.lang.String r0 = "添加书签"
            r5.setContentDescription(r0)
            xx r0 = p000.jx0.m3049(r6)
            java.lang.String r0 = r0.f12348
            xx r1 = p000.jx0.m3049(r6)
            java.lang.String r1 = r1.f12358
            r2 = 12
            android.graphics.drawable.RippleDrawable r6 = p000.jx0.m3059(r2, r6, r0, r1)
            r5.setBackground(r6)
            return r5
    }

    /* JADX INFO: renamed from: dp */
    private final int m1450dp(android.content.Context r1, int r2) {
            r0 = this;
            int r0 = p000.jx0.m3056(r1, r2)
            return r0
    }

    private final android.widget.TextView findButton(android.view.ViewGroup r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    private static final void getOrCreateInfoButton$lambda$22$lambda$21(android.view.View r1) {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.INSTANCE
            r1.getClass()
            r0.onButtonClick(r1)
            return
    }

    private final void hookProfileActivity(java.lang.ClassLoader r5) {
            r4 = this;
            java.lang.Object r0 = p000.qe0.f8982
            java.lang.String r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.ACTIVITY_CLASS
            java.lang.Class r5 = p000.qe0.m4877(r5, r0)
            java.lang.String r1 = "ProfileBookmarkHook"
            if (r5 != 0) goto L18
            java.lang.String r4 = "target activity not found: "
            java.lang.String r4 = r4.concat(r0)
            r5 = 4
            r0 = 0
            p000.C0888ux.m5988(r1, r4, r0, r5, r0)
            return
        L18:
            java.lang.String r0 = "onCreate"
            java.lang.Class<android.os.Bundle> r2 = android.os.Bundle.class
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook$hookProfileActivity$1$1 r3 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook$hookProfileActivity$1$1     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2a
            java.lang.Object[] r2 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L2a
            l01 r0 = p000.qe0.m4873(r5, r0, r2)     // Catch: java.lang.Throwable -> L2a
            goto L31
        L2a:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L31:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L3c
            java.lang.String r2 = "hook onCreate failed"
            p000.C0888ux.m5977(r1, r2, r0)
        L3c:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L4e
            java.lang.String r0 = "onResume"
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook$hookProfileActivity$3$1 r2 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook$hookProfileActivity$3$1     // Catch: java.lang.Throwable -> L4e
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L4e
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Throwable -> L4e
            l01 r0 = p000.qe0.m4873(r5, r0, r2)     // Catch: java.lang.Throwable -> L4e
            goto L55
        L4e:
            r0 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r0)
            r0 = r2
        L55:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L60
            java.lang.String r2 = "hook onResume failed"
            p000.C0888ux.m5977(r1, r2, r0)
        L60:
            java.lang.Object r0 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L74
            java.lang.String r0 = "onWindowFocusChanged"
            java.lang.Class r2 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L74
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook$hookProfileActivity$5$1 r3 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook$hookProfileActivity$5$1     // Catch: java.lang.Throwable -> L74
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L74
            java.lang.Object[] r4 = new java.lang.Object[]{r2, r3}     // Catch: java.lang.Throwable -> L74
            l01 r4 = p000.qe0.m4873(r5, r0, r4)     // Catch: java.lang.Throwable -> L74
            goto L7b
        L74:
            r4 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r4)
            r4 = r0
        L7b:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto L86
            java.lang.String r0 = "hook onWindowFocusChanged failed"
            p000.C0888ux.m5977(r1, r0, r4)
        L86:
            java.lang.Object r4 = p000.qe0.f8982     // Catch: java.lang.Throwable -> L98
            java.lang.String r4 = "onDestroy"
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook$hookProfileActivity$7$1 r0 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook$hookProfileActivity$7$1     // Catch: java.lang.Throwable -> L98
            r0.<init>()     // Catch: java.lang.Throwable -> L98
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L98
            l01 r4 = p000.qe0.m4873(r5, r4, r0)     // Catch: java.lang.Throwable -> L98
            goto L9f
        L98:
            r4 = move-exception
            eo1 r5 = new eo1
            r5.<init>(r4)
            r4 = r5
        L9f:
            java.lang.Throwable r4 = p000.fo1.m2190(r4)
            if (r4 == 0) goto Laa
            java.lang.String r5 = "hook onDestroy failed"
            p000.C0888ux.m5977(r1, r5, r4)
        Laa:
            return
    }

    private final void install(java.lang.ClassLoader r7) {
            r6 = this;
            java.lang.String r0 = "profile_bookmark_hook_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)
            r2 = 4
            java.lang.String r3 = "ProfileBookmarkHook"
            r4 = 0
            if (r0 != 0) goto L13
            java.lang.String r6 = "profile bookmark hook disabled by config"
            p000.C0888ux.m5988(r3, r6, r4, r2, r4)
            return
        L13:
            java.util.concurrent.atomic.AtomicBoolean r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.installed
            r5 = 1
            boolean r0 = r0.compareAndSet(r1, r5)
            if (r0 != 0) goto L1d
            return
        L1d:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L27
            p70 r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.storeChangedListener     // Catch: java.lang.Throwable -> L27
            r0.addListener(r1)     // Catch: java.lang.Throwable -> L27
            s62 r0 = p000.s62.f9751     // Catch: java.lang.Throwable -> L27
            goto L2e
        L27:
            r0 = move-exception
            eo1 r1 = new eo1
            r1.<init>(r0)
            r0 = r1
        L2e:
            java.lang.Throwable r0 = p000.fo1.m2190(r0)
            if (r0 == 0) goto L39
            java.lang.String r1 = "add store listener failed"
            p000.C0888ux.m5977(r3, r1, r0)
        L39:
            r6.hookProfileActivity(r7)
            java.lang.String r6 = "installed"
            p000.C0888ux.m5988(r3, r6, r4, r2, r4)
            return
    }

    private final void onButtonClick(android.view.View r7) {
            r6 = this;
            android.content.Context r0 = r7.getContext()
            boolean r1 = r0 instanceof android.app.Activity
            r2 = 0
            if (r1 == 0) goto Lc
            android.app.Activity r0 = (android.app.Activity) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            android.view.View r1 = r7.getRootView()
            boolean r3 = r1 instanceof android.view.ViewGroup
            if (r3 == 0) goto L18
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L18:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.currentProfileRecord
            if (r1 == 0) goto L26
            java.lang.String r3 = r1.uniqueKey()
            boolean r3 = p000.q02.m4671(r3)
            if (r3 == 0) goto L3a
        L26:
            if (r0 == 0) goto L2f
            if (r2 == 0) goto L2f
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = r6.resolveCurrentProfileRecord(r0, r2)
            goto L35
        L2f:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.INSTANCE
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = r1.getLastProfileRecord()
        L35:
            if (r1 == 0) goto L3a
            r6.setCurrentProfileRecord(r1)
        L3a:
            r2 = 0
            if (r1 == 0) goto L88
            java.lang.String r3 = r1.uniqueKey()
            boolean r3 = p000.q02.m4671(r3)
            if (r3 == 0) goto L48
            goto L88
        L48:
            java.lang.String r3 = r1.uniqueKey()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r4 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            boolean r5 = r4.isBookmarked(r1)
            if (r5 == 0) goto L68
            r4.remove(r3)
            android.content.Context r7 = r7.getContext()
            java.lang.String r0 = "已取消书签"
            android.widget.Toast r7 = android.widget.Toast.makeText(r7, r0, r2)
            r7.show()
            r6.refreshAllButtons()
            return
        L68:
            if (r0 != 0) goto L78
            android.content.Context r6 = r7.getContext()
            java.lang.String r7 = "当前页面不可用"
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r2)
            r6.show()
            return
        L78:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog r6 = new com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkAddDialog
            g71 r7 = new g71
            r2 = 9
            r7.<init>(r0, r2)
            r6.<init>(r0, r1, r7)
            r6.show()
            return
        L88:
            android.content.Context r6 = r7.getContext()
            java.lang.String r7 = "未识别到当前主页，请稍后再试"
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r2)
            r6.show()
            return
    }

    private static final p000.s62 onButtonClick$lambda$25(android.app.Activity r5, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r6) {
            r6.getClass()
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            r0.add(r6)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.INSTANCE
            java.lang.String r2 = r6.uniqueKey()
            java.util.List r1 = r1.getLatestAwemeItems(r2)
            boolean r2 = r1.isEmpty()
            r3 = 0
            if (r2 != 0) goto L2b
            java.lang.String r2 = r6.uniqueKey()
            int r4 = r1.size()
            r0.updateAwemeSnapshot(r2, r1, r4, r3)
            java.lang.String r1 = r6.uniqueKey()
            r0.markRead(r1)
        L2b:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.INSTANCE
            r0.setCurrentProfileRecord(r6)
            java.lang.String r6 = "已添加书签"
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r3)
            r5.show()
            s62 r5 = p000.s62.f9751
            return r5
    }

    private final void postToMain(p000.p70 r3) {
            r2 = this;
            android.os.Looper r2 = android.os.Looper.myLooper()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            boolean r2 = p000.ln0.m3626(r2, r0)
            if (r2 == 0) goto L12
            r3.invoke()
            return
        L12:
            android.os.Handler r2 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.mainHandler
            r0 r0 = new r0
            r1 = 6
            r0.<init>(r1, r3)
            r2.post(r0)
            return
    }

    private static final void postToMain$lambda$26(p000.p70 r0) {
            r0.invoke()
            return
    }

    private final void refreshAllButtons() {
            r2 = this;
            kt0 r0 = new kt0
            r1 = 21
            r0.<init>(r1)
            r2.postToMain(r0)
            return
    }

    private static final p000.s62 refreshAllButtons$lambda$20() {
            java.util.WeakHashMap<android.widget.TextView, s62> r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.managedButtons
            monitor-enter(r0)
            java.util.Set r1 = r0.keySet()     // Catch: java.lang.Throwable -> L22
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L22
        Lb:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L22
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L22
            android.widget.TextView r2 = (android.widget.TextView) r2     // Catch: java.lang.Throwable -> L22
            if (r2 != 0) goto L1a
            goto Lb
        L1a:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook r3 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.INSTANCE     // Catch: java.lang.Throwable -> L22
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r4 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.currentProfileRecord     // Catch: java.lang.Throwable -> L22
            r3.styleButton(r2, r4)     // Catch: java.lang.Throwable -> L22
            goto Lb
        L22:
            r1 = move-exception
            goto L28
        L24:
            monitor-exit(r0)
            s62 r0 = p000.s62.f9751
            return r0
        L28:
            monitor-exit(r0)
            throw r1
    }

    private final com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord resolveCurrentProfileRecord(android.app.Activity r2, android.view.ViewGroup r3) {
            r1 = this;
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkProfileHook.INSTANCE
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = r1.getLastProfileRecord()
            if (r1 == 0) goto L13
            java.lang.String r0 = r1.uniqueKey()
            boolean r0 = p000.q02.m4671(r0)
            if (r0 != 0) goto L13
            return r1
        L13:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect r1 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkReflect.INSTANCE     // Catch: java.lang.Throwable -> L22
            android.content.Intent r0 = r2.getIntent()     // Catch: java.lang.Throwable -> L22
            java.lang.Object[] r2 = new java.lang.Object[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L22
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = r1.findProfileRecordFromRoots(r2)     // Catch: java.lang.Throwable -> L22
            goto L29
        L22:
            r1 = move-exception
            eo1 r2 = new eo1
            r2.<init>(r1)
            r1 = r2
        L29:
            boolean r2 = r1 instanceof p000.eo1
            r3 = 0
            if (r2 == 0) goto L2f
            r1 = r3
        L2f:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1 = (com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord) r1
            if (r1 == 0) goto L3e
            java.lang.String r2 = r1.uniqueKey()
            boolean r2 = p000.q02.m4671(r2)
            if (r2 != 0) goto L3e
            r3 = r1
        L3e:
            return r3
    }

    private final void scheduleAttach(android.app.Activity r3, java.lang.String r4, int r5) {
            r2 = this;
            boolean r0 = r3.isFinishing()
            if (r0 == 0) goto L7
            return
        L7:
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            boolean r0 = p000.ln0.m3626(r0, r1)
            if (r0 == 0) goto L19
            r2.tryAttach(r3, r4, r5)
            return
        L19:
            android.os.Handler r2 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.mainHandler
            ej1 r0 = new ej1
            r1 = 0
            r0.<init>(r3, r4, r5, r1)
            r2.post(r0)
            return
    }

    public static /* synthetic */ void scheduleAttach$default(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook r0, android.app.Activity r1, java.lang.String r2, int r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.scheduleAttach(r1, r2, r3)
            return
    }

    private static final void scheduleAttach$lambda$13(android.app.Activity r1, java.lang.String r2, int r3) {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.INSTANCE
            r0.tryAttach(r1, r2, r3)
            return
    }

    private final void setCurrentProfileRecord(com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto Le
            java.lang.String r1 = r3.uniqueKey()
            boolean r1 = p000.q02.m4671(r1)
            if (r1 != 0) goto Le
            goto Lf
        Le:
            r3 = r0
        Lf:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.currentProfileRecord = r3
            r2.refreshAllButtons()
            return
    }

    private static final p000.s62 storeChangedListener$lambda$0() {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.INSTANCE
            r0.refreshAllButtons()
            s62 r0 = p000.s62.f9751
            return r0
    }

    private final void styleButton(android.widget.TextView r5, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r6) {
            r4 = this;
            android.content.Context r4 = r5.getContext()
            r4.getClass()
            xx r4 = p000.jx0.m3049(r4)
            java.lang.String r0 = r4.f12348
            r1 = 0
            if (r6 == 0) goto L1a
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r2 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE
            boolean r6 = r2.isBookmarked(r6)
            if (r6 == 0) goto L1a
            r6 = 1
            goto L1b
        L1a:
            r6 = r1
        L1b:
            if (r6 == 0) goto L20
            java.lang.String r2 = "取消书签"
            goto L22
        L20:
            java.lang.String r2 = "添加书签"
        L22:
            r5.setText(r2)
            java.lang.CharSequence r2 = r5.getText()
            r5.setContentDescription(r2)
            r2 = 12
            r3 = -1
            if (r6 == 0) goto L45
            r5.setTextColor(r3)
            android.content.Context r6 = r5.getContext()
            r6.getClass()
            java.lang.String r4 = r4.f12371
            android.graphics.drawable.RippleDrawable r4 = p000.jx0.m3059(r2, r6, r0, r4)
            r5.setBackground(r4)
            goto L58
        L45:
            r5.setTextColor(r3)
            android.content.Context r6 = r5.getContext()
            r6.getClass()
            java.lang.String r4 = r4.f12358
            android.graphics.drawable.RippleDrawable r4 = p000.jx0.m3059(r2, r6, r0, r4)
            r5.setBackground(r4)
        L58:
            r4 = 1065353216(0x3f800000, float:1.0)
            r5.setAlpha(r4)
            r5.setVisibility(r1)
            return
    }

    private final void tryAttach(android.app.Activity r4, java.lang.String r5, int r6) {
            r3 = this;
            boolean r0 = r4.isFinishing()
            if (r0 == 0) goto L7
            goto L47
        L7:
            android.view.Window r0 = r4.getWindow()
            r1 = 0
            if (r0 == 0) goto L13
            android.view.View r0 = r0.getDecorView()
            goto L14
        L13:
            r0 = r1
        L14:
            boolean r2 = r0 instanceof android.view.ViewGroup
            if (r2 == 0) goto L1b
            r1 = r0
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
        L1b:
            if (r1 != 0) goto L1e
            goto L47
        L1e:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = r3.resolveCurrentProfileRecord(r4, r1)
            if (r0 == 0) goto L27
            r3.setCurrentProfileRecord(r0)
        L27:
            r3.refreshAllButtons()
            r3 = 10
            if (r6 >= r3) goto L47
            if (r0 == 0) goto L3a
            java.lang.String r3 = r0.uniqueKey()
            boolean r3 = p000.q02.m4671(r3)
            if (r3 == 0) goto L47
        L3a:
            android.os.Handler r3 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.mainHandler
            ej1 r0 = new ej1
            r1 = 1
            r0.<init>(r4, r5, r6, r1)
            r4 = 180(0xb4, double:8.9E-322)
            r3.postDelayed(r0, r4)
        L47:
            return
    }

    private static final void tryAttach$lambda$14(android.app.Activity r1, java.lang.String r2, int r3) {
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.INSTANCE
            int r3 = r3 + 1
            r0.tryAttach(r1, r2, r3)
            return
    }

    /* JADX INFO: renamed from: α */
    public static /* synthetic */ void m1451(p000.p70 r0) {
            postToMain$lambda$26(r0)
            return
    }

    /* JADX INFO: renamed from: β */
    public static /* synthetic */ void m1452(android.view.View r0) {
            getOrCreateInfoButton$lambda$22$lambda$21(r0)
            return
    }

    /* JADX INFO: renamed from: γ */
    public static /* synthetic */ p000.s62 m1453(android.app.Activity r0, com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r1) {
            s62 r0 = onButtonClick$lambda$25(r0, r1)
            return r0
    }

    /* JADX INFO: renamed from: δ */
    public static /* synthetic */ void m1454(android.app.Activity r0, java.lang.String r1, int r2) {
            tryAttach$lambda$14(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: ε */
    public static /* synthetic */ p000.s62 m1455() {
            s62 r0 = refreshAllButtons$lambda$20()
            return r0
    }

    /* JADX INFO: renamed from: ζ */
    public static /* synthetic */ void m1456(android.app.Activity r0, java.lang.String r1, int r2) {
            scheduleAttach$lambda$13(r0, r1, r2)
            return
    }

    /* JADX INFO: renamed from: η */
    public static /* synthetic */ p000.s62 m1457() {
            s62 r0 = storeChangedListener$lambda$0()
            return r0
    }

    public final android.widget.TextView getOrCreateInfoButton(android.content.Context r3) {
            r2 = this;
            r3.getClass()
            android.widget.TextView r3 = r2.createBookmarkButton(r3)
            pa r0 = new pa
            r1 = 5
            r0.<init>(r1)
            r3.setOnClickListener(r0)
            java.util.WeakHashMap<android.widget.TextView, s62> r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.managedButtons
            monitor-enter(r0)
            s62 r1 = p000.s62.f9751     // Catch: java.lang.Throwable -> L1f
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkRecord r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.currentProfileRecord
            r2.styleButton(r3, r0)
            return r3
        L1f:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public final void init(android.content.Context r3, java.lang.ClassLoader r4) {
            r2 = this;
            r3.getClass()
            r4.getClass()
            java.lang.String r0 = "profile_bookmark_hook_enabled"
            r1 = 0
            boolean r0 = p000.ui1.m5887(r0, r1)
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkHook.end = r0
            java.lang.String r1 = "ProfileBookmarkHook"
            if (r0 != 0) goto L1b
            java.lang.String r2 = "ProfileBookmarkHook 初始化跳过"
            r3 = 4
            r4 = 0
            p000.C0888ux.m5988(r1, r2, r4, r3, r4)
            return
        L1b:
            android.content.Context r0 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L30
            if (r0 != 0) goto L22
            goto L23
        L22:
            r3 = r0
        L23:
            com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore r0 = com.example.dyhelper.hook.comment.bookmark.ProfileBookmarkStore.INSTANCE     // Catch: java.lang.Throwable -> L30
            r0.init(r3)     // Catch: java.lang.Throwable -> L30
            com.example.dyhelper.hook.comment.bookmark.ProbeNotifier r0 = com.example.dyhelper.hook.comment.bookmark.ProbeNotifier.INSTANCE     // Catch: java.lang.Throwable -> L30
            r0.init(r3)     // Catch: java.lang.Throwable -> L30
            s62 r3 = p000.s62.f9751     // Catch: java.lang.Throwable -> L30
            goto L37
        L30:
            r3 = move-exception
            eo1 r0 = new eo1
            r0.<init>(r3)
            r3 = r0
        L37:
            java.lang.Throwable r3 = p000.fo1.m2190(r3)
            if (r3 == 0) goto L42
            java.lang.String r0 = "init store failed"
            p000.C0888ux.m5977(r1, r0, r3)
        L42:
            r2.install(r4)
            return
    }

    public final void init(java.lang.ClassLoader r1) {
            r0 = this;
            r1.getClass()
            r0.install(r1)
            return
    }
}
