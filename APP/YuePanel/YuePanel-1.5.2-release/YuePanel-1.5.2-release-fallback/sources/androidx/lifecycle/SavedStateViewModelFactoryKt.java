package androidx.lifecycle;

/* JADX INFO: loaded from: classes.dex */
@Yue.InterfaceC4201(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a6\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\u0000\u001aI\u0010\t\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0000¢\u0006\u0002\u0010\u000f\"\u0018\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"ANDROID_VIEWMODEL_SIGNATURE", "", "Ljava/lang/Class;", "VIEWMODEL_SIGNATURE", "findMatchingConstructor", "Ljava/lang/reflect/Constructor;", "T", "modelClass", "signature", "newInstance", "Landroidx/lifecycle/ViewModel;", "constructor", "params", "", "", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@Yue.InterfaceC5383({Yue.InterfaceC5383.EnumC5384.f20021})
public final class SavedStateViewModelFactoryKt {

    @Yue.InterfaceC4418
    private static final java.util.List<java.lang.Class<?>> ANDROID_VIEWMODEL_SIGNATURE = null;

    @Yue.InterfaceC4418
    private static final java.util.List<java.lang.Class<?>> VIEWMODEL_SIGNATURE = null;

    static {
            java.lang.Class<android.app.Application> r0 = android.app.Application.class
            java.lang.Class<androidx.lifecycle.SavedStateHandle> r1 = androidx.lifecycle.SavedStateHandle.class
            java.lang.Class[] r0 = new java.lang.Class[]{r0, r1}
            java.util.List r0 = Yue.C1208.m6217(r0)
            androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE = r0
            java.util.List r0 = Yue.C1207.m6190(r1)
            androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE = r0
            return
    }

    public static final /* synthetic */ java.util.List access$getANDROID_VIEWMODEL_SIGNATURE$p() {
            java.util.List<java.lang.Class<?>> r0 = androidx.lifecycle.SavedStateViewModelFactoryKt.ANDROID_VIEWMODEL_SIGNATURE
            return r0
    }

    public static final /* synthetic */ java.util.List access$getVIEWMODEL_SIGNATURE$p() {
            java.util.List<java.lang.Class<?>> r0 = androidx.lifecycle.SavedStateViewModelFactoryKt.VIEWMODEL_SIGNATURE
            return r0
    }

    @Yue.InterfaceC4543
    public static final <T> java.lang.reflect.Constructor<T> findMatchingConstructor(@Yue.InterfaceC4418 java.lang.Class<T> r6, @Yue.InterfaceC4418 java.util.List<? extends java.lang.Class<?>> r7) {
            java.lang.String r0 = "modelClass"
            Yue.C3329.m13906(r6, r0)
            java.lang.String r0 = "signature"
            Yue.C3329.m13906(r7, r0)
            java.lang.reflect.Constructor[] r0 = r6.getConstructors()
            java.lang.String r1 = "modelClass.constructors"
            Yue.C3329.m13905(r0, r1)
            int r1 = r0.length
            r2 = 0
        L15:
            if (r2 >= r1) goto L69
            r3 = r0[r2]
            java.lang.Class[] r4 = r3.getParameterTypes()
            java.lang.String r5 = "constructor.parameterTypes"
            Yue.C3329.m13905(r4, r5)
            java.util.List r4 = Yue.C0595.m3982(r4)
            boolean r5 = Yue.C3329.m13897(r7, r4)
            if (r5 == 0) goto L32
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>"
            Yue.C3329.m13904(r3, r6)
            return r3
        L32:
            int r3 = r7.size()
            int r5 = r4.size()
            if (r3 != r5) goto L66
            boolean r3 = r4.containsAll(r7)
            if (r3 != 0) goto L43
            goto L66
        L43:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Class "
            r1.append(r2)
            java.lang.String r6 = r6.getSimpleName()
            r1.append(r6)
            java.lang.String r6 = " must have parameters in the proper order: "
            r1.append(r6)
            r1.append(r7)
            java.lang.String r6 = r1.toString()
            r0.<init>(r6)
            throw r0
        L66:
            int r2 = r2 + 1
            goto L15
        L69:
            r6 = 0
            return r6
    }

    public static final <T extends androidx.lifecycle.ViewModel> T newInstance(@Yue.InterfaceC4418 java.lang.Class<T> r2, @Yue.InterfaceC4418 java.lang.reflect.Constructor<T> r3, @Yue.InterfaceC4418 java.lang.Object... r4) {
            java.lang.String r0 = "modelClass"
            Yue.C3329.m13906(r2, r0)
            java.lang.String r0 = "constructor"
            Yue.C3329.m13906(r3, r0)
            java.lang.String r0 = "params"
            Yue.C3329.m13906(r4, r0)
            int r0 = r4.length     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L1d java.lang.IllegalAccessException -> L1f
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L1d java.lang.IllegalAccessException -> L1f
            java.lang.Object r3 = r3.newInstance(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L1d java.lang.IllegalAccessException -> L1f
            androidx.lifecycle.ViewModel r3 = (androidx.lifecycle.ViewModel) r3     // Catch: java.lang.reflect.InvocationTargetException -> L1b java.lang.InstantiationException -> L1d java.lang.IllegalAccessException -> L1f
            return r3
        L1b:
            r3 = move-exception
            goto L21
        L1d:
            r3 = move-exception
            goto L3c
        L1f:
            r3 = move-exception
            goto L58
        L21:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "An exception happened in constructor of "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.Throwable r3 = r3.getCause()
            r4.<init>(r2, r3)
            throw r4
        L3c:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = " cannot be instantiated."
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2, r3)
            throw r4
        L58:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to access "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r4.<init>(r2, r3)
            throw r4
    }
}
