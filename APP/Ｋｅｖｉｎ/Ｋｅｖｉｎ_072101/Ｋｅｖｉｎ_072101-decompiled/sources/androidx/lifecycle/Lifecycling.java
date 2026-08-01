package androidx.lifecycle;

/* JADX INFO: loaded from: classes2.dex */
public class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    private static java.util.Map<java.lang.Class<?>, java.lang.Integer> sCallbackCache;
    private static java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> sClassToAdapters;


    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.Lifecycling.sCallbackCache = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.lifecycle.Lifecycling.sClassToAdapters = r0
            return
    }

    private Lifecycling() {
            r0 = this;
            r0.<init>()
            return
    }

    private static androidx.lifecycle.GeneratedAdapter createGeneratedAdapter(java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> r2, java.lang.Object r3) {
            java.lang.Object[] r0 = new java.lang.Object[]{r3}     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.InstantiationException -> L12 java.lang.IllegalAccessException -> L19
            java.lang.Object r0 = r2.newInstance(r0)     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.InstantiationException -> L12 java.lang.IllegalAccessException -> L19
            androidx.lifecycle.GeneratedAdapter r0 = (androidx.lifecycle.GeneratedAdapter) r0     // Catch: java.lang.reflect.InvocationTargetException -> Lb java.lang.InstantiationException -> L12 java.lang.IllegalAccessException -> L19
            return r0
        Lb:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L12:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L19:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    private static java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> generatedConstructor(java.lang.Class<?> r8) {
            java.lang.Package r0 = r8.getPackage()     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            java.lang.String r1 = r8.getCanonicalName()     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            if (r0 == 0) goto Lf
            java.lang.String r2 = r0.getName()     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            goto L11
        Lf:
            java.lang.String r2 = ""
        L11:
            boolean r3 = r2.isEmpty()     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            r4 = 1
            if (r3 == 0) goto L1a
            r3 = r1
            goto L23
        L1a:
            int r3 = r2.length()     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            int r3 = r3 + r4
            java.lang.String r3 = r1.substring(r3)     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
        L23:
            java.lang.String r3 = getAdapterName(r3)     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            boolean r5 = r2.isEmpty()     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            if (r5 == 0) goto L2f
            r5 = r3
            goto L46
        L2f:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            r5.<init>()     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            java.lang.StringBuilder r5 = r5.append(r2)     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            java.lang.String r6 = "."
            java.lang.StringBuilder r5 = r5.append(r6)     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            java.lang.StringBuilder r5 = r5.append(r3)     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            java.lang.String r5 = r5.toString()     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
        L46:
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            java.lang.Class[] r6 = new java.lang.Class[]{r8}     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            java.lang.reflect.Constructor r6 = r5.getDeclaredConstructor(r6)     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            boolean r7 = r6.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
            if (r7 != 0) goto L5b
            r6.setAccessible(r4)     // Catch: java.lang.NoSuchMethodException -> L5c java.lang.ClassNotFoundException -> L63
        L5b:
            return r6
        L5c:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        L63:
            r0 = move-exception
            r1 = 0
            return r1
    }

    public static java.lang.String getAdapterName(java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "."
            java.lang.String r2 = "_"
            java.lang.String r1 = r3.replace(r1, r2)
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = "_LifecycleAdapter"
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @java.lang.Deprecated
    static androidx.lifecycle.GenericLifecycleObserver getCallback(java.lang.Object r2) {
            androidx.lifecycle.LifecycleEventObserver r0 = lifecycleEventObserver(r2)
            androidx.lifecycle.Lifecycling$1 r1 = new androidx.lifecycle.Lifecycling$1
            r1.<init>(r0)
            return r1
    }

    private static int getObserverConstructorType(java.lang.Class<?> r4) {
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r0 = androidx.lifecycle.Lifecycling.sCallbackCache
            java.lang.Object r0 = r0.get(r4)
            java.lang.Integer r0 = (java.lang.Integer) r0
            if (r0 == 0) goto Lf
            int r1 = r0.intValue()
            return r1
        Lf:
            int r1 = resolveObserverCallbackType(r4)
            java.util.Map<java.lang.Class<?>, java.lang.Integer> r2 = androidx.lifecycle.Lifecycling.sCallbackCache
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r2.put(r4, r3)
            return r1
    }

    private static boolean isLifecycleParent(java.lang.Class<?> r1) {
            if (r1 == 0) goto Lc
            java.lang.Class<androidx.lifecycle.LifecycleObserver> r0 = androidx.lifecycle.LifecycleObserver.class
            boolean r0 = r0.isAssignableFrom(r1)
            if (r0 == 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
    }

    static androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver(java.lang.Object r8) {
            boolean r0 = r8 instanceof androidx.lifecycle.LifecycleEventObserver
            boolean r1 = r8 instanceof androidx.lifecycle.FullLifecycleObserver
            if (r0 == 0) goto L14
            if (r1 == 0) goto L14
            androidx.lifecycle.FullLifecycleObserverAdapter r2 = new androidx.lifecycle.FullLifecycleObserverAdapter
            r3 = r8
            androidx.lifecycle.FullLifecycleObserver r3 = (androidx.lifecycle.FullLifecycleObserver) r3
            r4 = r8
            androidx.lifecycle.LifecycleEventObserver r4 = (androidx.lifecycle.LifecycleEventObserver) r4
            r2.<init>(r3, r4)
            return r2
        L14:
            if (r1 == 0) goto L20
            androidx.lifecycle.FullLifecycleObserverAdapter r2 = new androidx.lifecycle.FullLifecycleObserverAdapter
            r3 = r8
            androidx.lifecycle.FullLifecycleObserver r3 = (androidx.lifecycle.FullLifecycleObserver) r3
            r4 = 0
            r2.<init>(r3, r4)
            return r2
        L20:
            if (r0 == 0) goto L26
            r2 = r8
            androidx.lifecycle.LifecycleEventObserver r2 = (androidx.lifecycle.LifecycleEventObserver) r2
            return r2
        L26:
            java.lang.Class r2 = r8.getClass()
            int r3 = getObserverConstructorType(r2)
            r4 = 2
            if (r3 != r4) goto L74
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r4 = androidx.lifecycle.Lifecycling.sClassToAdapters
            java.lang.Object r4 = r4.get(r2)
            java.util.List r4 = (java.util.List) r4
            int r5 = r4.size()
            r6 = 1
            if (r5 != r6) goto L52
        L41:
            r5 = 0
            java.lang.Object r5 = r4.get(r5)
            java.lang.reflect.Constructor r5 = (java.lang.reflect.Constructor) r5
            androidx.lifecycle.GeneratedAdapter r5 = createGeneratedAdapter(r5, r8)
            androidx.lifecycle.SingleGeneratedAdapterObserver r6 = new androidx.lifecycle.SingleGeneratedAdapterObserver
            r6.<init>(r5)
            return r6
        L52:
            int r5 = r4.size()
            androidx.lifecycle.GeneratedAdapter[] r5 = new androidx.lifecycle.GeneratedAdapter[r5]
            r6 = 0
        L59:
            int r7 = r4.size()
            if (r6 >= r7) goto L6e
            java.lang.Object r7 = r4.get(r6)
            java.lang.reflect.Constructor r7 = (java.lang.reflect.Constructor) r7
            androidx.lifecycle.GeneratedAdapter r7 = createGeneratedAdapter(r7, r8)
            r5[r6] = r7
            int r6 = r6 + 1
            goto L59
        L6e:
            androidx.lifecycle.CompositeGeneratedAdaptersObserver r6 = new androidx.lifecycle.CompositeGeneratedAdaptersObserver
            r6.<init>(r5)
            return r6
        L74:
            androidx.lifecycle.ReflectiveGenericLifecycleObserver r4 = new androidx.lifecycle.ReflectiveGenericLifecycleObserver
            r4.<init>(r8)
            return r4
    }

    private static int resolveObserverCallbackType(java.lang.Class<?> r11) {
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.reflect.Constructor r0 = generatedConstructor(r11)
            r2 = 2
            if (r0 == 0) goto L19
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r1 = androidx.lifecycle.Lifecycling.sClassToAdapters
            java.util.List r3 = java.util.Collections.singletonList(r0)
            r1.put(r11, r3)
            return r2
        L19:
            androidx.lifecycle.ClassesInfoCache r3 = androidx.lifecycle.ClassesInfoCache.sInstance
            boolean r3 = r3.hasLifecycleMethods(r11)
            if (r3 == 0) goto L22
            return r1
        L22:
            java.lang.Class r4 = r11.getSuperclass()
            r5 = 0
            boolean r6 = isLifecycleParent(r4)
            if (r6 == 0) goto L42
            int r6 = getObserverConstructorType(r4)
            if (r6 != r1) goto L34
            return r1
        L34:
            java.util.ArrayList r6 = new java.util.ArrayList
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r7 = androidx.lifecycle.Lifecycling.sClassToAdapters
            java.lang.Object r7 = r7.get(r4)
            java.util.Collection r7 = (java.util.Collection) r7
            r6.<init>(r7)
            r5 = r6
        L42:
            java.lang.Class[] r6 = r11.getInterfaces()
            int r7 = r6.length
            r8 = 0
        L48:
            if (r8 >= r7) goto L70
            r9 = r6[r8]
            boolean r10 = isLifecycleParent(r9)
            if (r10 != 0) goto L53
            goto L6d
        L53:
            int r10 = getObserverConstructorType(r9)
            if (r10 != r1) goto L5a
            return r1
        L5a:
            if (r5 != 0) goto L62
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r5 = r10
        L62:
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r10 = androidx.lifecycle.Lifecycling.sClassToAdapters
            java.lang.Object r10 = r10.get(r9)
            java.util.Collection r10 = (java.util.Collection) r10
            r5.addAll(r10)
        L6d:
            int r8 = r8 + 1
            goto L48
        L70:
            if (r5 == 0) goto L78
            java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> r1 = androidx.lifecycle.Lifecycling.sClassToAdapters
            r1.put(r11, r5)
            return r2
        L78:
            return r1
    }
}
