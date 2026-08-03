package com.bumptech.glide;

/* JADX INFO: loaded from: classes.dex */
public class Glide implements android.content.ComponentCallbacks2 {
    private static final java.lang.String DEFAULT_DISK_CACHE_DIR = "image_manager_disk_cache";
    private static final java.lang.String DESTROYED_ACTIVITY_WARNING = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).";
    private static final java.lang.String TAG = "Glide";

    @Yue.InterfaceC2947("Glide.class")
    private static volatile com.bumptech.glide.Glide glide;
    private static volatile boolean isInitializing;
    private final com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool arrayPool;
    private final com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool;

    @Yue.InterfaceC2947("this")
    @Yue.InterfaceC4544
    private com.bumptech.glide.load.engine.prefill.BitmapPreFiller bitmapPreFiller;
    private final com.bumptech.glide.manager.ConnectivityMonitorFactory connectivityMonitorFactory;
    private final com.bumptech.glide.Glide.RequestOptionsFactory defaultRequestOptionsFactory;
    private final com.bumptech.glide.load.engine.Engine engine;
    private final com.bumptech.glide.GlideContext glideContext;

    @Yue.InterfaceC2947("managers")
    private final java.util.List<com.bumptech.glide.RequestManager> managers;
    private final com.bumptech.glide.load.engine.cache.MemoryCache memoryCache;
    private com.bumptech.glide.MemoryCategory memoryCategory;
    private final com.bumptech.glide.manager.RequestManagerRetriever requestManagerRetriever;

    public interface RequestOptionsFactory {
        @Yue.InterfaceC4410
        com.bumptech.glide.request.RequestOptions build();
    }

    public Glide(@Yue.InterfaceC4410 android.content.Context r15, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.Engine r16, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.cache.MemoryCache r17, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r18, @Yue.InterfaceC4410 com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r19, @Yue.InterfaceC4410 com.bumptech.glide.manager.RequestManagerRetriever r20, @Yue.InterfaceC4410 com.bumptech.glide.manager.ConnectivityMonitorFactory r21, int r22, @Yue.InterfaceC4410 com.bumptech.glide.Glide.RequestOptionsFactory r23, @Yue.InterfaceC4410 java.util.Map<java.lang.Class<?>, com.bumptech.glide.TransitionOptions<?, ?>> r24, @Yue.InterfaceC4410 java.util.List<com.bumptech.glide.request.RequestListener<java.lang.Object>> r25, @Yue.InterfaceC4410 java.util.List<com.bumptech.glide.module.GlideModule> r26, @Yue.InterfaceC4544 com.bumptech.glide.module.AppGlideModule r27, @Yue.InterfaceC4410 com.bumptech.glide.GlideExperiments r28) {
            r14 = this;
            r0 = r14
            r14.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.managers = r1
            com.bumptech.glide.MemoryCategory r1 = com.bumptech.glide.MemoryCategory.NORMAL
            r0.memoryCategory = r1
            r1 = r16
            r0.engine = r1
            r2 = r18
            r0.bitmapPool = r2
            r4 = r19
            r0.arrayPool = r4
            r2 = r17
            r0.memoryCache = r2
            r2 = r20
            r0.requestManagerRetriever = r2
            r2 = r21
            r0.connectivityMonitorFactory = r2
            r7 = r23
            r0.defaultRequestOptionsFactory = r7
            r2 = r26
            r3 = r27
            com.bumptech.glide.util.GlideSuppliers$GlideSupplier r5 = com.bumptech.glide.RegistryFactory.lazilyCreateAndInitializeRegistry(r14, r2, r3)
            com.bumptech.glide.request.target.ImageViewTargetFactory r6 = new com.bumptech.glide.request.target.ImageViewTargetFactory
            r6.<init>()
            com.bumptech.glide.GlideContext r13 = new com.bumptech.glide.GlideContext
            r2 = r13
            r3 = r15
            r8 = r24
            r9 = r25
            r10 = r16
            r11 = r28
            r12 = r22
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r0.glideContext = r13
            return
    }

    @Yue.InterfaceC6959
    @Yue.InterfaceC2947("Glide.class")
    public static void checkAndInitializeGlide(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 com.bumptech.glide.GeneratedAppGlideModule r2) {
            boolean r0 = com.bumptech.glide.Glide.isInitializing
            if (r0 != 0) goto L12
            r0 = 1
            com.bumptech.glide.Glide.isInitializing = r0
            r0 = 0
            initializeGlide(r1, r2)     // Catch: java.lang.Throwable -> Le
            com.bumptech.glide.Glide.isInitializing = r0
            return
        Le:
            r1 = move-exception
            com.bumptech.glide.Glide.isInitializing = r0
            throw r1
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Glide has been called recursively, this is probably an internal library error!"
            r1.<init>(r2)
            throw r1
    }

    @Yue.InterfaceC6959
    public static void enableHardwareBitmaps() {
            com.bumptech.glide.load.resource.bitmap.HardwareConfigState r0 = com.bumptech.glide.load.resource.bitmap.HardwareConfigState.getInstance()
            r0.unblockHardwareBitmaps()
            return
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.Glide get(@Yue.InterfaceC4410 android.content.Context r3) {
            com.bumptech.glide.Glide r0 = com.bumptech.glide.Glide.glide
            if (r0 != 0) goto L1d
            android.content.Context r0 = r3.getApplicationContext()
            com.bumptech.glide.GeneratedAppGlideModule r0 = getAnnotationGeneratedGlideModules(r0)
            java.lang.Class<com.bumptech.glide.Glide> r1 = com.bumptech.glide.Glide.class
            monitor-enter(r1)
            com.bumptech.glide.Glide r2 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto L19
            checkAndInitializeGlide(r3, r0)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r3 = move-exception
            goto L1b
        L19:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            goto L1d
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L17
            throw r3
        L1d:
            com.bumptech.glide.Glide r3 = com.bumptech.glide.Glide.glide
            return r3
    }

    @Yue.InterfaceC4544
    private static com.bumptech.glide.GeneratedAppGlideModule getAnnotationGeneratedGlideModules(android.content.Context r2) {
            java.lang.String r0 = "com.bumptech.glide.GeneratedAppGlideModuleImpl"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.NoSuchMethodException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L25 java.lang.ClassNotFoundException -> L37
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            java.lang.Class[] r1 = new java.lang.Class[]{r1}     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.NoSuchMethodException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L25 java.lang.ClassNotFoundException -> L37
            java.lang.reflect.Constructor r0 = r0.getDeclaredConstructor(r1)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.NoSuchMethodException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L25 java.lang.ClassNotFoundException -> L37
            android.content.Context r2 = r2.getApplicationContext()     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.NoSuchMethodException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L25 java.lang.ClassNotFoundException -> L37
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.NoSuchMethodException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L25 java.lang.ClassNotFoundException -> L37
            java.lang.Object r2 = r0.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.NoSuchMethodException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L25 java.lang.ClassNotFoundException -> L37
            com.bumptech.glide.GeneratedAppGlideModule r2 = (com.bumptech.glide.GeneratedAppGlideModule) r2     // Catch: java.lang.reflect.InvocationTargetException -> L1f java.lang.NoSuchMethodException -> L21 java.lang.IllegalAccessException -> L23 java.lang.InstantiationException -> L25 java.lang.ClassNotFoundException -> L37
            goto L46
        L1f:
            r2 = move-exception
            goto L27
        L21:
            r2 = move-exception
            goto L2b
        L23:
            r2 = move-exception
            goto L2f
        L25:
            r2 = move-exception
            goto L33
        L27:
            throwIncorrectGlideModule(r2)
            goto L45
        L2b:
            throwIncorrectGlideModule(r2)
            goto L45
        L2f:
            throwIncorrectGlideModule(r2)
            goto L45
        L33:
            throwIncorrectGlideModule(r2)
            goto L45
        L37:
            r2 = 5
            java.lang.String r0 = "Glide"
            boolean r2 = android.util.Log.isLoggable(r0, r2)
            if (r2 == 0) goto L45
            java.lang.String r2 = "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored"
            android.util.Log.w(r0, r2)
        L45:
            r2 = 0
        L46:
            return r2
    }

    @Yue.InterfaceC4544
    public static java.io.File getPhotoCacheDir(@Yue.InterfaceC4410 android.content.Context r1) {
            java.lang.String r0 = "image_manager_disk_cache"
            java.io.File r1 = getPhotoCacheDir(r1, r0)
            return r1
    }

    @Yue.InterfaceC4544
    public static java.io.File getPhotoCacheDir(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4410 java.lang.String r3) {
            java.io.File r2 = r2.getCacheDir()
            r0 = 0
            if (r2 == 0) goto L1b
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r3)
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L1a
            boolean r2 = r1.mkdirs()
            if (r2 == 0) goto L19
            goto L1a
        L19:
            return r0
        L1a:
            return r1
        L1b:
            r2 = 6
            java.lang.String r3 = "Glide"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L29
            java.lang.String r2 = "default disk cache dir is null"
            android.util.Log.e(r3, r2)
        L29:
            return r0
    }

    @Yue.InterfaceC4410
    private static com.bumptech.glide.manager.RequestManagerRetriever getRetriever(@Yue.InterfaceC4544 android.content.Context r1) {
            java.lang.String r0 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            com.bumptech.glide.util.Preconditions.checkNotNull(r1, r0)
            com.bumptech.glide.Glide r1 = get(r1)
            com.bumptech.glide.manager.RequestManagerRetriever r1 = r1.getRequestManagerRetriever()
            return r1
    }

    @Yue.InterfaceC6959
    public static void init(@Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 com.bumptech.glide.GlideBuilder r4) {
            com.bumptech.glide.GeneratedAppGlideModule r0 = getAnnotationGeneratedGlideModules(r3)
            java.lang.Class<com.bumptech.glide.Glide> r1 = com.bumptech.glide.Glide.class
            monitor-enter(r1)
            com.bumptech.glide.Glide r2 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            tearDown()     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L16
        L11:
            initializeGlide(r3, r4, r0)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            return
        L16:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r3
    }

    @Yue.InterfaceC6959
    @java.lang.Deprecated
    public static synchronized void init(com.bumptech.glide.Glide r2) {
            java.lang.Class<com.bumptech.glide.Glide> r0 = com.bumptech.glide.Glide.class
            monitor-enter(r0)
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> Lb
            if (r1 == 0) goto Ld
            tearDown()     // Catch: java.lang.Throwable -> Lb
            goto Ld
        Lb:
            r2 = move-exception
            goto L11
        Ld:
            com.bumptech.glide.Glide.glide = r2     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        L11:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }

    @Yue.InterfaceC2947("Glide.class")
    private static void initializeGlide(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4544 com.bumptech.glide.GeneratedAppGlideModule r2) {
            com.bumptech.glide.GlideBuilder r0 = new com.bumptech.glide.GlideBuilder
            r0.<init>()
            initializeGlide(r1, r0, r2)
            return
    }

    @Yue.InterfaceC2947("Glide.class")
    private static void initializeGlide(@Yue.InterfaceC4410 android.content.Context r8, @Yue.InterfaceC4410 com.bumptech.glide.GlideBuilder r9, @Yue.InterfaceC4544 com.bumptech.glide.GeneratedAppGlideModule r10) {
            android.content.Context r8 = r8.getApplicationContext()
            java.util.List r0 = java.util.Collections.emptyList()
            if (r10 == 0) goto L10
            boolean r1 = r10.isManifestParsingEnabled()
            if (r1 == 0) goto L19
        L10:
            com.bumptech.glide.module.ManifestParser r0 = new com.bumptech.glide.module.ManifestParser
            r0.<init>(r8)
            java.util.List r0 = r0.parse()
        L19:
            r1 = 3
            java.lang.String r2 = "Glide"
            if (r10 == 0) goto L65
            java.util.Set r3 = r10.getExcludedModuleClasses()
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L65
            java.util.Set r3 = r10.getExcludedModuleClasses()
            java.util.Iterator r4 = r0.iterator()
        L30:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L65
            java.lang.Object r5 = r4.next()
            com.bumptech.glide.module.GlideModule r5 = (com.bumptech.glide.module.GlideModule) r5
            java.lang.Class r6 = r5.getClass()
            boolean r6 = r3.contains(r6)
            if (r6 != 0) goto L47
            goto L30
        L47:
            boolean r6 = android.util.Log.isLoggable(r2, r1)
            if (r6 == 0) goto L61
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "AppGlideModule excludes manifest GlideModule: "
            r6.append(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            android.util.Log.d(r2, r5)
        L61:
            r4.remove()
            goto L30
        L65:
            boolean r1 = android.util.Log.isLoggable(r2, r1)
            if (r1 == 0) goto L94
            java.util.Iterator r1 = r0.iterator()
        L6f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L94
            java.lang.Object r3 = r1.next()
            com.bumptech.glide.module.GlideModule r3 = (com.bumptech.glide.module.GlideModule) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Discovered GlideModule from manifest: "
            r4.append(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.util.Log.d(r2, r3)
            goto L6f
        L94:
            if (r10 == 0) goto L9b
            com.bumptech.glide.manager.RequestManagerRetriever$RequestManagerFactory r1 = r10.getRequestManagerFactory()
            goto L9c
        L9b:
            r1 = 0
        L9c:
            r9.setRequestManagerFactory(r1)
            java.util.Iterator r1 = r0.iterator()
        La3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb3
            java.lang.Object r2 = r1.next()
            com.bumptech.glide.module.GlideModule r2 = (com.bumptech.glide.module.GlideModule) r2
            r2.applyOptions(r8, r9)
            goto La3
        Lb3:
            if (r10 == 0) goto Lb8
            r10.applyOptions(r8, r9)
        Lb8:
            com.bumptech.glide.Glide r9 = r9.build(r8, r0, r10)
            r8.registerComponentCallbacks(r9)
            com.bumptech.glide.Glide.glide = r9
            return
    }

    @Yue.InterfaceC6959
    public static synchronized boolean isInitialized() {
            java.lang.Class<com.bumptech.glide.Glide> r0 = com.bumptech.glide.Glide.class
            monitor-enter(r0)
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> Lc
            if (r1 == 0) goto L9
            r1 = 1
            goto La
        L9:
            r1 = 0
        La:
            monitor-exit(r0)
            return r1
        Lc:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r1
    }

    @Yue.InterfaceC6959
    public static void tearDown() {
            java.lang.Class<com.bumptech.glide.Glide> r0 = com.bumptech.glide.Glide.class
            monitor-enter(r0)
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L20
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> L1e
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L1e
            android.content.Context r1 = r1.getApplicationContext()     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.Glide r2 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> L1e
            r1.unregisterComponentCallbacks(r2)     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.Glide r1 = com.bumptech.glide.Glide.glide     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.load.engine.Engine r1 = r1.engine     // Catch: java.lang.Throwable -> L1e
            r1.shutdown()     // Catch: java.lang.Throwable -> L1e
            goto L20
        L1e:
            r1 = move-exception
            goto L25
        L20:
            r1 = 0
            com.bumptech.glide.Glide.glide = r1     // Catch: java.lang.Throwable -> L1e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            return
        L25:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r1
    }

    private static void throwIncorrectGlideModule(java.lang.Exception r2) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation."
            r0.<init>(r1, r2)
            throw r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    public static com.bumptech.glide.RequestManager with(@Yue.InterfaceC4410 android.app.Activity r0) {
            android.content.Context r0 = r0.getApplicationContext()
            com.bumptech.glide.RequestManager r0 = with(r0)
            return r0
    }

    @Yue.InterfaceC4410
    @java.lang.Deprecated
    public static com.bumptech.glide.RequestManager with(@Yue.InterfaceC4410 android.app.Fragment r1) {
            android.app.Activity r1 = r1.getActivity()
            java.lang.String r0 = "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed)."
            com.bumptech.glide.util.Preconditions.checkNotNull(r1, r0)
            android.content.Context r1 = r1.getApplicationContext()
            com.bumptech.glide.RequestManager r1 = with(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.RequestManager with(@Yue.InterfaceC4410 android.content.Context r1) {
            com.bumptech.glide.manager.RequestManagerRetriever r0 = getRetriever(r1)
            com.bumptech.glide.RequestManager r1 = r0.get(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.RequestManager with(@Yue.InterfaceC4410 android.view.View r1) {
            android.content.Context r0 = r1.getContext()
            com.bumptech.glide.manager.RequestManagerRetriever r0 = getRetriever(r0)
            com.bumptech.glide.RequestManager r1 = r0.get(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.RequestManager with(@Yue.InterfaceC4410 androidx.fragment.app.Fragment r1) {
            android.content.Context r0 = r1.getContext()
            com.bumptech.glide.manager.RequestManagerRetriever r0 = getRetriever(r0)
            com.bumptech.glide.RequestManager r1 = r0.get(r1)
            return r1
    }

    @Yue.InterfaceC4410
    public static com.bumptech.glide.RequestManager with(@Yue.InterfaceC4410 androidx.fragment.app.FragmentActivity r1) {
            com.bumptech.glide.manager.RequestManagerRetriever r0 = getRetriever(r1)
            com.bumptech.glide.RequestManager r1 = r0.get(r1)
            return r1
    }

    public void clearDiskCache() {
            r1 = this;
            com.bumptech.glide.util.Util.assertBackgroundThread()
            com.bumptech.glide.load.engine.Engine r0 = r1.engine
            r0.clearDiskCache()
            return
    }

    public void clearMemory() {
            r1 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r1.memoryCache
            r0.clearMemory()
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r1.bitmapPool
            r0.clearMemory()
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r1.arrayPool
            r0.clearMemory()
            return
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool getArrayPool() {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r1.arrayPool
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool getBitmapPool() {
            r1 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r1.bitmapPool
            return r0
    }

    public com.bumptech.glide.manager.ConnectivityMonitorFactory getConnectivityMonitorFactory() {
            r1 = this;
            com.bumptech.glide.manager.ConnectivityMonitorFactory r0 = r1.connectivityMonitorFactory
            return r0
    }

    @Yue.InterfaceC4410
    public android.content.Context getContext() {
            r1 = this;
            com.bumptech.glide.GlideContext r0 = r1.glideContext
            android.content.Context r0 = r0.getBaseContext()
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.GlideContext getGlideContext() {
            r1 = this;
            com.bumptech.glide.GlideContext r0 = r1.glideContext
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.Registry getRegistry() {
            r1 = this;
            com.bumptech.glide.GlideContext r0 = r1.glideContext
            com.bumptech.glide.Registry r0 = r0.getRegistry()
            return r0
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.manager.RequestManagerRetriever getRequestManagerRetriever() {
            r1 = this;
            com.bumptech.glide.manager.RequestManagerRetriever r0 = r1.requestManagerRetriever
            return r0
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration r1) {
            r0 = this;
            return
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
            r0 = this;
            r0.clearMemory()
            return
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int r1) {
            r0 = this;
            r0.trimMemory(r1)
            return
    }

    public synchronized void preFillBitmapPool(@Yue.InterfaceC4410 com.bumptech.glide.load.engine.prefill.PreFillType.Builder... r5) {
            r4 = this;
            monitor-enter(r4)
            com.bumptech.glide.load.engine.prefill.BitmapPreFiller r0 = r4.bitmapPreFiller     // Catch: java.lang.Throwable -> L23
            if (r0 != 0) goto L25
            com.bumptech.glide.Glide$RequestOptionsFactory r0 = r4.defaultRequestOptionsFactory     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.request.RequestOptions r0 = r0.build()     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.Options r0 = r0.getOptions()     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.Option<com.bumptech.glide.load.DecodeFormat> r1 = com.bumptech.glide.load.resource.bitmap.Downsampler.DECODE_FORMAT     // Catch: java.lang.Throwable -> L23
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.DecodeFormat r0 = (com.bumptech.glide.load.DecodeFormat) r0     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.engine.prefill.BitmapPreFiller r1 = new com.bumptech.glide.load.engine.prefill.BitmapPreFiller     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.engine.cache.MemoryCache r2 = r4.memoryCache     // Catch: java.lang.Throwable -> L23
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r3 = r4.bitmapPool     // Catch: java.lang.Throwable -> L23
            r1.<init>(r2, r3, r0)     // Catch: java.lang.Throwable -> L23
            r4.bitmapPreFiller = r1     // Catch: java.lang.Throwable -> L23
            goto L25
        L23:
            r5 = move-exception
            goto L2c
        L25:
            com.bumptech.glide.load.engine.prefill.BitmapPreFiller r0 = r4.bitmapPreFiller     // Catch: java.lang.Throwable -> L23
            r0.preFill(r5)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r4)
            return
        L2c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L23
            throw r5
    }

    public void registerRequestManager(com.bumptech.glide.RequestManager r3) {
            r2 = this;
            java.util.List<com.bumptech.glide.RequestManager> r0 = r2.managers
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.RequestManager> r1 = r2.managers     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 != 0) goto L14
            java.util.List<com.bumptech.glide.RequestManager> r1 = r2.managers     // Catch: java.lang.Throwable -> L12
            r1.add(r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            goto L1c
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "Cannot register already registered manager"
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }

    public boolean removeFromManagers(@Yue.InterfaceC4410 com.bumptech.glide.request.target.Target<?> r4) {
            r3 = this;
            java.util.List<com.bumptech.glide.RequestManager> r0 = r3.managers
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.RequestManager> r1 = r3.managers     // Catch: java.lang.Throwable -> L1e
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1e
        L9:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1e
            com.bumptech.glide.RequestManager r2 = (com.bumptech.glide.RequestManager) r2     // Catch: java.lang.Throwable -> L1e
            boolean r2 = r2.untrack(r4)     // Catch: java.lang.Throwable -> L1e
            if (r2 == 0) goto L9
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            r4 = 1
            return r4
        L1e:
            r4 = move-exception
            goto L23
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            r4 = 0
            return r4
        L23:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1e
            throw r4
    }

    @Yue.InterfaceC4410
    public com.bumptech.glide.MemoryCategory setMemoryCategory(@Yue.InterfaceC4410 com.bumptech.glide.MemoryCategory r3) {
            r2 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r2.memoryCache
            float r1 = r3.getMultiplier()
            r0.setSizeMultiplier(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r2.bitmapPool
            float r1 = r3.getMultiplier()
            r0.setSizeMultiplier(r1)
            com.bumptech.glide.MemoryCategory r0 = r2.memoryCategory
            r2.memoryCategory = r3
            return r0
    }

    public void trimMemory(int r4) {
            r3 = this;
            com.bumptech.glide.util.Util.assertMainThread()
            java.util.List<com.bumptech.glide.RequestManager> r0 = r3.managers
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.RequestManager> r1 = r3.managers     // Catch: java.lang.Throwable -> L1c
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
        Lc:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.RequestManager r2 = (com.bumptech.glide.RequestManager) r2     // Catch: java.lang.Throwable -> L1c
            r2.onTrimMemory(r4)     // Catch: java.lang.Throwable -> L1c
            goto Lc
        L1c:
            r4 = move-exception
            goto L2f
        L1e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            com.bumptech.glide.load.engine.cache.MemoryCache r0 = r3.memoryCache
            r0.trimMemory(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool r0 = r3.bitmapPool
            r0.trimMemory(r4)
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r0 = r3.arrayPool
            r0.trimMemory(r4)
            return
        L2f:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r4
    }

    public void unregisterRequestManager(com.bumptech.glide.RequestManager r3) {
            r2 = this;
            java.util.List<com.bumptech.glide.RequestManager> r0 = r2.managers
            monitor-enter(r0)
            java.util.List<com.bumptech.glide.RequestManager> r1 = r2.managers     // Catch: java.lang.Throwable -> L12
            boolean r1 = r1.contains(r3)     // Catch: java.lang.Throwable -> L12
            if (r1 == 0) goto L14
            java.util.List<com.bumptech.glide.RequestManager> r1 = r2.managers     // Catch: java.lang.Throwable -> L12
            r1.remove(r3)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            return
        L12:
            r3 = move-exception
            goto L1c
        L14:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = "Cannot unregister not yet registered manager"
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L12
            throw r3     // Catch: java.lang.Throwable -> L12
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r3
    }
}
