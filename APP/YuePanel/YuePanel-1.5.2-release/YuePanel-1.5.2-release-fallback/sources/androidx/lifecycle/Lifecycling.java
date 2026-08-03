package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC4201(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002J\u001e\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0014\u0010\u0015\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0001H\u0007J\u0014\u0010\u001a\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\t\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "()V", "GENERATED_CALLBACK", "", "REFLECTIVE_CALLBACK", "callbackCache", "", "Ljava/lang/Class;", "classToAdapters", "", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "createGeneratedAdapter", "constructor", "object", "generatedConstructor", "klass", "getAdapterName", "", "className", "getObserverConstructorType", "isLifecycleParent", "", "lifecycleEventObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "resolveObserverCallbackType", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20023})
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;

    @Yue.InterfaceC4418
    public static final androidx.lifecycle.Lifecycling INSTANCE = null;
    private static final int REFLECTIVE_CALLBACK = 1;

    @Yue.InterfaceC4418
    private static final java.util.Map<java.lang.Class<?>, java.lang.Integer> callbackCache = null;

    @Yue.InterfaceC4418
    private static final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> classToAdapters = null;

    static {
            androidx.lifecycle.Lifecycling r0 = new androidx.lifecycle.Lifecycling
            r0.<init>()
            androidx.lifecycle.Lifecycling.INSTANCE = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.Lifecycling.callbackCache = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.Lifecycling.classToAdapters = r0
            return
    }

    private Lifecycling() {
            r0 = this;
            r0.<init>()
            return
    }

    private final androidx.lifecycle.GeneratedAdapter createGeneratedAdapter(java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L12 java.lang.IllegalAccessException -> L14
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L12 java.lang.IllegalAccessException -> L14
            java.lang.String r2 = "{\n            constructo…tance(`object`)\n        }"
            Yue.C3329.m13905(r1, r2)     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L12 java.lang.IllegalAccessException -> L14
            androidx.lifecycle.GeneratedAdapter r1 = (androidx.lifecycle.GeneratedAdapter) r1     // Catch: java.lang.reflect.InvocationTargetException -> L10 java.lang.InstantiationException -> L12 java.lang.IllegalAccessException -> L14
            return r1
        L10:
            r1 = move-exception
            goto L16
        L12:
            r1 = move-exception
            goto L1c
        L14:
            r1 = move-exception
            goto L22
        L16:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L1c:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
        L22:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            r2.<init>(r1)
            throw r2
    }

    private final java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> generatedConstructor(java.lang.Class<?> r5) {
            r4 = this;
            java.lang.Package r0 = r5.getPackage()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            java.lang.String r1 = r5.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.getName()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            goto L13
        Lf:
            r5 = move-exception
            goto L72
        L11:
            java.lang.String r0 = ""
        L13:
            java.lang.String r2 = "fullPackage"
            Yue.C3329.m13905(r0, r2)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            int r2 = r0.length()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            r3 = 1
            if (r2 != 0) goto L20
            goto L33
        L20:
            java.lang.String r2 = "name"
            Yue.C3329.m13905(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            int r2 = r0.length()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            int r2 = r2 + r3
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            java.lang.String r2 = "this as java.lang.String).substring(startIndex)"
            Yue.C3329.m13905(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
        L33:
            java.lang.String r2 = "if (fullPackage.isEmpty(…g(fullPackage.length + 1)"
            Yue.C3329.m13905(r1, r2)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            java.lang.String r1 = getAdapterName(r1)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            int r2 = r0.length()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            if (r2 != 0) goto L43
            goto L57
        L43:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            r2.<init>()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            r2.append(r0)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            r0 = 46
            r2.append(r0)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            r2.append(r1)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            java.lang.String r1 = r2.toString()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
        L57:
            java.lang.Class r0 = java.lang.Class.forName(r1)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>"
            Yue.C3329.m13904(r0, r1)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            java.lang.Class[] r5 = new java.lang.Class[]{r5}     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            java.lang.reflect.Constructor r5 = r0.getDeclaredConstructor(r5)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            boolean r0 = r5.isAccessible()     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            if (r0 != 0) goto L79
            r5.setAccessible(r3)     // Catch: java.lang.NoSuchMethodException -> Lf java.lang.ClassNotFoundException -> L78
            goto L79
        L72:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
        L78:
            r5 = 0
        L79:
            return r5
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final java.lang.String getAdapterName(@Yue.InterfaceC4418 java.lang.String r7) {
            java.lang.String r0 = "className"
            Yue.C3329.m13906(r7, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r5 = 4
            r6 = 0
            java.lang.String r2 = "."
            java.lang.String r3 = "_"
            r4 = 0
            r1 = r7
            java.lang.String r7 = Yue.C5988.m22305(r1, r2, r3, r4, r5, r6)
            r0.append(r7)
            java.lang.String r7 = "_LifecycleAdapter"
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            return r7
    }

    private final int getObserverConstructorType(java.lang.Class<?> r4) {
            r3 = this;
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r0 = androidx.lifecycle.Lifecycling.callbackCache
            java.lang.Object r1 = r0.get(r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Lf
            int r4 = r1.intValue()
            return r4
        Lf:
            int r1 = r3.resolveObserverCallbackType(r4)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.put(r4, r2)
            return r1
    }

    private final boolean isLifecycleParent(java.lang.Class<?> r2) {
            r1 = this;
            if (r2 == 0) goto Lc
            java.lang.Class<androidx.lifecycle.LifecycleObserver> r0 = androidx.lifecycle.LifecycleObserver.class
            boolean r2 = r0.isAssignableFrom(r2)
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    @Yue.InterfaceC4418
    @Yue.InterfaceC3427
    public static final androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver(@Yue.InterfaceC4418 java.lang.Object r6) {
            java.lang.String r0 = "object"
            Yue.C3329.m13906(r6, r0)
            boolean r0 = r6 instanceof androidx.lifecycle.LifecycleEventObserver
            boolean r1 = r6 instanceof androidx.lifecycle.DefaultLifecycleObserver
            if (r0 == 0) goto L18
            if (r1 == 0) goto L18
            androidx.lifecycle.DefaultLifecycleObserverAdapter r0 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            r1 = r6
            androidx.lifecycle.DefaultLifecycleObserver r1 = (androidx.lifecycle.DefaultLifecycleObserver) r1
            androidx.lifecycle.LifecycleEventObserver r6 = (androidx.lifecycle.LifecycleEventObserver) r6
            r0.<init>(r1, r6)
            return r0
        L18:
            if (r1 == 0) goto L23
            androidx.lifecycle.DefaultLifecycleObserverAdapter r0 = new androidx.lifecycle.DefaultLifecycleObserverAdapter
            androidx.lifecycle.DefaultLifecycleObserver r6 = (androidx.lifecycle.DefaultLifecycleObserver) r6
            r1 = 0
            r0.<init>(r6, r1)
            return r0
        L23:
            if (r0 == 0) goto L28
            androidx.lifecycle.LifecycleEventObserver r6 = (androidx.lifecycle.LifecycleEventObserver) r6
            return r6
        L28:
            java.lang.Class r0 = r6.getClass()
            androidx.lifecycle.Lifecycling r1 = androidx.lifecycle.Lifecycling.INSTANCE
            int r2 = r1.getObserverConstructorType(r0)
            r3 = 2
            if (r2 != r3) goto L77
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r2 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r0 = r2.get(r0)
            Yue.C3329.m13903(r0)
            java.util.List r0 = (java.util.List) r0
            int r2 = r0.size()
            r3 = 0
            r4 = 1
            if (r2 != r4) goto L58
            java.lang.Object r0 = r0.get(r3)
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0
            androidx.lifecycle.GeneratedAdapter r6 = r1.createGeneratedAdapter(r0, r6)
            androidx.lifecycle.SingleGeneratedAdapterObserver r0 = new androidx.lifecycle.SingleGeneratedAdapterObserver
            r0.<init>(r6)
            return r0
        L58:
            int r1 = r0.size()
            androidx.lifecycle.GeneratedAdapter[] r2 = new androidx.lifecycle.GeneratedAdapter[r1]
        L5e:
            if (r3 >= r1) goto L71
            androidx.lifecycle.Lifecycling r4 = androidx.lifecycle.Lifecycling.INSTANCE
            java.lang.Object r5 = r0.get(r3)
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            androidx.lifecycle.GeneratedAdapter r4 = r4.createGeneratedAdapter(r5, r6)
            r2[r3] = r4
            int r3 = r3 + 1
            goto L5e
        L71:
            androidx.lifecycle.CompositeGeneratedAdaptersObserver r6 = new androidx.lifecycle.CompositeGeneratedAdaptersObserver
            r6.<init>(r2)
            return r6
        L77:
            androidx.lifecycle.ReflectiveGenericLifecycleObserver r0 = new androidx.lifecycle.ReflectiveGenericLifecycleObserver
            r0.<init>(r6)
            return r0
    }

    private final int resolveObserverCallbackType(java.lang.Class<?> r9) {
            r8 = this;
            java.lang.String r0 = r9.getCanonicalName()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.reflect.Constructor r0 = r8.generatedConstructor(r9)
            r2 = 2
            if (r0 == 0) goto L19
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r1 = androidx.lifecycle.Lifecycling.classToAdapters
            java.util.List r0 = Yue.C1207.m6190(r0)
            r1.put(r9, r0)
            return r2
        L19:
            androidx.lifecycle.ClassesInfoCache r0 = androidx.lifecycle.ClassesInfoCache.sInstance
            boolean r0 = r0.hasLifecycleMethods(r9)
            if (r0 == 0) goto L22
            return r1
        L22:
            java.lang.Class r0 = r9.getSuperclass()
            boolean r3 = r8.isLifecycleParent(r0)
            if (r3 == 0) goto L49
            java.lang.String r3 = "superclass"
            Yue.C3329.m13905(r0, r3)
            int r3 = r8.getObserverConstructorType(r0)
            if (r3 != r1) goto L38
            return r1
        L38:
            java.util.ArrayList r3 = new java.util.ArrayList
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r4 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r0 = r4.get(r0)
            Yue.C3329.m13903(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r3.<init>(r0)
            goto L4a
        L49:
            r3 = 0
        L4a:
            java.lang.Class[] r0 = r9.getInterfaces()
            java.lang.String r4 = "klass.interfaces"
            Yue.C3329.m13905(r0, r4)
            int r4 = r0.length
            r5 = 0
        L55:
            if (r5 >= r4) goto L84
            r6 = r0[r5]
            boolean r7 = r8.isLifecycleParent(r6)
            if (r7 != 0) goto L60
            goto L81
        L60:
            java.lang.String r7 = "intrface"
            Yue.C3329.m13905(r6, r7)
            int r7 = r8.getObserverConstructorType(r6)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            if (r3 != 0) goto L73
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L73:
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r7 = androidx.lifecycle.Lifecycling.classToAdapters
            java.lang.Object r6 = r7.get(r6)
            Yue.C3329.m13903(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            r3.addAll(r6)
        L81:
            int r5 = r5 + 1
            goto L55
        L84:
            if (r3 == 0) goto L8c
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r0 = androidx.lifecycle.Lifecycling.classToAdapters
            r0.put(r9, r3)
            return r2
        L8c:
            return r1
    }
}
