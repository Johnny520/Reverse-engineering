package com.bumptech.glide.manager;

/* JADX INFO: loaded from: classes.dex */
public class RequestManagerRetriever implements android.os.Handler.Callback {
    private static final com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory DEFAULT_FACTORY = null;

    @Yue.InterfaceC6959
    static final java.lang.String FRAGMENT_TAG = "com.bumptech.glide.manager";
    private volatile com.bumptech.glide.RequestManager applicationManager;
    private final com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory factory;
    private final com.bumptech.glide.manager.FrameWaiter frameWaiter;
    private final com.bumptech.glide.manager.LifecycleRequestManagerRetriever lifecycleRequestManagerRetriever;
    private final Yue.C0573<android.view.View, androidx.fragment.app.Fragment> tempViewToSupportFragment;


    public interface RequestManagerFactory {
        @Yue.InterfaceC4410
        com.bumptech.glide.RequestManager build(@Yue.InterfaceC4410 com.bumptech.glide.Glide r1, @Yue.InterfaceC4410 com.bumptech.glide.manager.Lifecycle r2, @Yue.InterfaceC4410 com.bumptech.glide.manager.RequestManagerTreeNode r3, @Yue.InterfaceC4410 android.content.Context r4);
    }

    static {
            com.bumptech.glide.manager.RequestManagerRetriever$1 r0 = new com.bumptech.glide.manager.RequestManagerRetriever$1
            r0.<init>()
            com.bumptech.glide.manager.RequestManagerRetriever.DEFAULT_FACTORY = r0
            return
    }

    public RequestManagerRetriever(@Yue.InterfaceC4544 com.bumptech.glide.manager.RequestManagerRetriever.RequestManagerFactory r2) {
            r1 = this;
            r1.<init>()
            Yue.ۥ۟ۡۨۡ r0 = new Yue.ۥ۟ۡۨۡ
            r0.<init>()
            r1.tempViewToSupportFragment = r0
            if (r2 == 0) goto Ld
            goto Lf
        Ld:
            com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory r2 = com.bumptech.glide.manager.RequestManagerRetriever.DEFAULT_FACTORY
        Lf:
            r1.factory = r2
            com.bumptech.glide.manager.LifecycleRequestManagerRetriever r0 = new com.bumptech.glide.manager.LifecycleRequestManagerRetriever
            r0.<init>(r2)
            r1.lifecycleRequestManagerRetriever = r0
            com.bumptech.glide.manager.FrameWaiter r2 = buildFrameWaiter()
            r1.frameWaiter = r2
            return
    }

    @android.annotation.TargetApi(17)
    private static void assertNotDestroyed(@Yue.InterfaceC4410 android.app.Activity r1) {
            boolean r1 = r1.isDestroyed()
            if (r1 != 0) goto L7
            return
        L7:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load for a destroyed activity"
            r1.<init>(r0)
            throw r1
    }

    private static com.bumptech.glide.manager.FrameWaiter buildFrameWaiter() {
            boolean r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.HARDWARE_BITMAPS_SUPPORTED
            if (r0 == 0) goto Lf
            boolean r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.BLOCK_HARDWARE_BITMAPS_WHEN_GL_CONTEXT_MIGHT_NOT_BE_INITIALIZED
            if (r0 != 0) goto L9
            goto Lf
        L9:
            com.bumptech.glide.manager.FirstFrameWaiter r0 = new com.bumptech.glide.manager.FirstFrameWaiter
            r0.<init>()
            return r0
        Lf:
            com.bumptech.glide.manager.DoNothingFirstFrameWaiter r0 = new com.bumptech.glide.manager.DoNothingFirstFrameWaiter
            r0.<init>()
            return r0
    }

    @Yue.InterfaceC4544
    private static android.app.Activity findActivity(@Yue.InterfaceC4410 android.content.Context r1) {
            boolean r0 = r1 instanceof android.app.Activity
            if (r0 == 0) goto L7
            android.app.Activity r1 = (android.app.Activity) r1
            return r1
        L7:
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L16
            android.content.ContextWrapper r1 = (android.content.ContextWrapper) r1
            android.content.Context r1 = r1.getBaseContext()
            android.app.Activity r1 = findActivity(r1)
            return r1
        L16:
            r1 = 0
            return r1
    }

    private static void findAllSupportFragmentsWithViews(@Yue.InterfaceC4544 java.util.Collection<androidx.fragment.app.Fragment> r2, @Yue.InterfaceC4410 java.util.Map<android.view.View, androidx.fragment.app.Fragment> r3) {
            if (r2 != 0) goto L3
            return
        L3:
            java.util.Iterator r2 = r2.iterator()
        L7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L2f
            java.lang.Object r0 = r2.next()
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L7
            android.view.View r1 = r0.getView()
            if (r1 != 0) goto L1c
            goto L7
        L1c:
            android.view.View r1 = r0.getView()
            r3.put(r1, r0)
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.util.List r0 = r0.m29162()
            findAllSupportFragmentsWithViews(r0, r3)
            goto L7
        L2f:
            return
    }

    @Yue.InterfaceC4544
    private androidx.fragment.app.Fragment findSupportFragment(@Yue.InterfaceC4410 android.view.View r3, @Yue.InterfaceC4410 androidx.fragment.app.FragmentActivity r4) {
            r2 = this;
            Yue.ۥ۟ۡۨۡ<android.view.View, androidx.fragment.app.Fragment> r0 = r2.tempViewToSupportFragment
            r0.clear()
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            java.util.List r0 = r0.m29162()
            Yue.ۥ۟ۡۨۡ<android.view.View, androidx.fragment.app.Fragment> r1 = r2.tempViewToSupportFragment
            findAllSupportFragmentsWithViews(r0, r1)
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r0)
            r0 = 0
        L1a:
            boolean r1 = r3.equals(r4)
            if (r1 != 0) goto L3a
            Yue.ۥ۟ۡۨۡ<android.view.View, androidx.fragment.app.Fragment> r0 = r2.tempViewToSupportFragment
            java.lang.Object r0 = r0.get(r3)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L2b
            goto L3a
        L2b:
            android.view.ViewParent r1 = r3.getParent()
            boolean r1 = r1 instanceof android.view.View
            if (r1 == 0) goto L3a
            android.view.ViewParent r3 = r3.getParent()
            android.view.View r3 = (android.view.View) r3
            goto L1a
        L3a:
            Yue.ۥ۟ۡۨۡ<android.view.View, androidx.fragment.app.Fragment> r3 = r2.tempViewToSupportFragment
            r3.clear()
            return r0
    }

    @Yue.InterfaceC4410
    private com.bumptech.glide.RequestManager getApplicationManager(@Yue.InterfaceC4410 android.content.Context r5) {
            r4 = this;
            com.bumptech.glide.RequestManager r0 = r4.applicationManager
            if (r0 != 0) goto L2e
            monitor-enter(r4)
            com.bumptech.glide.RequestManager r0 = r4.applicationManager     // Catch: java.lang.Throwable -> L28
            if (r0 != 0) goto L2a
            android.content.Context r0 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.Glide r0 = com.bumptech.glide.Glide.get(r0)     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory r1 = r4.factory     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.manager.ApplicationLifecycle r2 = new com.bumptech.glide.manager.ApplicationLifecycle     // Catch: java.lang.Throwable -> L28
            r2.<init>()     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.manager.EmptyRequestManagerTreeNode r3 = new com.bumptech.glide.manager.EmptyRequestManagerTreeNode     // Catch: java.lang.Throwable -> L28
            r3.<init>()     // Catch: java.lang.Throwable -> L28
            android.content.Context r5 = r5.getApplicationContext()     // Catch: java.lang.Throwable -> L28
            com.bumptech.glide.RequestManager r5 = r1.build(r0, r2, r3, r5)     // Catch: java.lang.Throwable -> L28
            r4.applicationManager = r5     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r5 = move-exception
            goto L2c
        L2a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L28
            goto L2e
        L2c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L28
            throw r5
        L2e:
            com.bumptech.glide.RequestManager r5 = r4.applicationManager
            return r5
    }

    private static boolean isActivityVisible(android.content.Context r0) {
            android.app.Activity r0 = findActivity(r0)
            if (r0 == 0) goto Lf
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    public com.bumptech.glide.RequestManager get(@Yue.InterfaceC4410 android.app.Activity r1) {
            r0 = this;
            android.content.Context r1 = r1.getApplicationContext()
            com.bumptech.glide.RequestManager r1 = r0.get(r1)
            return r1
    }

    @Yue.InterfaceC4410
    @android.annotation.TargetApi(17)
    @java.lang.Deprecated
    public com.bumptech.glide.RequestManager get(@Yue.InterfaceC4410 android.app.Fragment r2) {
            r1 = this;
            android.app.Activity r0 = r2.getActivity()
            if (r0 == 0) goto L13
            android.app.Activity r2 = r2.getActivity()
            android.content.Context r2 = r2.getApplicationContext()
            com.bumptech.glide.RequestManager r2 = r1.get(r2)
            return r2
        L13:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load on a fragment before it is attached"
            r2.<init>(r0)
            throw r2
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestManager get(@Yue.InterfaceC4410 android.content.Context r3) {
            r2 = this;
            if (r3 == 0) goto L36
            boolean r0 = com.bumptech.glide.util.Util.isOnMainThread()
            if (r0 == 0) goto L31
            boolean r0 = r3 instanceof android.app.Application
            if (r0 != 0) goto L31
            boolean r0 = r3 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L17
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            return r3
        L17:
            boolean r0 = r3 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L31
            r0 = r3
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r1 = r0.getBaseContext()
            android.content.Context r1 = r1.getApplicationContext()
            if (r1 == 0) goto L31
            android.content.Context r3 = r0.getBaseContext()
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            return r3
        L31:
            com.bumptech.glide.RequestManager r3 = r2.getApplicationManager(r3)
            return r3
        L36:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "You cannot start a load on a null Context"
            r3.<init>(r0)
            throw r3
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestManager get(@Yue.InterfaceC4410 android.view.View r3) {
            r2 = this;
            boolean r0 = com.bumptech.glide.util.Util.isOnBackgroundThread()
            if (r0 == 0) goto L13
            android.content.Context r3 = r3.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            return r3
        L13:
            com.bumptech.glide.util.Preconditions.checkNotNull(r3)
            android.content.Context r0 = r3.getContext()
            java.lang.String r1 = "Unable to obtain a request manager for a view without a Context"
            com.bumptech.glide.util.Preconditions.checkNotNull(r0, r1)
            android.content.Context r0 = r3.getContext()
            android.app.Activity r0 = findActivity(r0)
            if (r0 != 0) goto L36
            android.content.Context r3 = r3.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            return r3
        L36:
            boolean r1 = r0 instanceof androidx.fragment.app.FragmentActivity
            if (r1 == 0) goto L4c
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            androidx.fragment.app.Fragment r3 = r2.findSupportFragment(r3, r0)
            if (r3 == 0) goto L47
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            goto L4b
        L47:
            com.bumptech.glide.RequestManager r3 = r2.get(r0)
        L4b:
            return r3
        L4c:
            android.content.Context r3 = r3.getContext()
            android.content.Context r3 = r3.getApplicationContext()
            com.bumptech.glide.RequestManager r3 = r2.get(r3)
            return r3
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestManager get(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r9) {
            r8 = this;
            android.content.Context r0 = r9.getContext()
            java.lang.String r1 = "You cannot start a load on a fragment before it is attached or after it is destroyed"
            com.bumptech.glide.util.Preconditions.checkNotNull(r0, r1)
            boolean r0 = com.bumptech.glide.util.Util.isOnBackgroundThread()
            if (r0 == 0) goto L1c
            android.content.Context r9 = r9.getContext()
            android.content.Context r9 = r9.getApplicationContext()
            com.bumptech.glide.RequestManager r9 = r8.get(r9)
            return r9
        L1c:
            androidx.fragment.app.FragmentActivity r0 = r9.getActivity()
            if (r0 == 0) goto L2b
            com.bumptech.glide.manager.FrameWaiter r0 = r8.frameWaiter
            androidx.fragment.app.FragmentActivity r1 = r9.getActivity()
            r0.registerSelf(r1)
        L2b:
            androidx.fragment.app.FragmentManager r6 = r9.getChildFragmentManager()
            android.content.Context r3 = r9.getContext()
            android.content.Context r0 = r3.getApplicationContext()
            com.bumptech.glide.Glide r4 = com.bumptech.glide.Glide.get(r0)
            com.bumptech.glide.manager.LifecycleRequestManagerRetriever r2 = r8.lifecycleRequestManagerRetriever
            androidx.lifecycle.Lifecycle r5 = r9.getLifecycle()
            boolean r7 = r9.isVisible()
            com.bumptech.glide.RequestManager r9 = r2.getOrCreate(r3, r4, r5, r6, r7)
            return r9
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.RequestManager get(@Yue.InterfaceC4410 androidx.fragment.app.FragmentActivity r8) {
            r7 = this;
            boolean r0 = com.bumptech.glide.util.Util.isOnBackgroundThread()
            if (r0 == 0) goto Lf
            android.content.Context r8 = r8.getApplicationContext()
            com.bumptech.glide.RequestManager r8 = r7.get(r8)
            return r8
        Lf:
            assertNotDestroyed(r8)
            com.bumptech.glide.manager.FrameWaiter r0 = r7.frameWaiter
            r0.registerSelf(r8)
            boolean r6 = isActivityVisible(r8)
            android.content.Context r0 = r8.getApplicationContext()
            com.bumptech.glide.Glide r3 = com.bumptech.glide.Glide.get(r0)
            com.bumptech.glide.manager.LifecycleRequestManagerRetriever r1 = r7.lifecycleRequestManagerRetriever
            androidx.lifecycle.Lifecycle r4 = r8.getLifecycle()
            androidx.fragment.app.FragmentManager r5 = r8.getSupportFragmentManager()
            r2 = r8
            com.bumptech.glide.RequestManager r8 = r1.getOrCreate(r2, r3, r4, r5, r6)
            return r8
    }

    @Override // android.os.Handler.Callback
    @java.lang.Deprecated
    public boolean handleMessage(android.os.Message r1) {
            r0 = this;
            r1 = 0
            return r1
    }
}
