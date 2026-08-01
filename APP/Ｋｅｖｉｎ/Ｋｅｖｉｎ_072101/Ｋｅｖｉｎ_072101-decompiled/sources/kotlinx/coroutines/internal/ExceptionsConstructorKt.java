package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: ExceptionsConstructor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a2\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u0007\"\b\b\u0000\u0010\b*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\nH\u0002\u001a*\u0010\u000b\u001a\u0018\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005j\u0004\u0018\u0001`\u00072\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\rH\u0002\u001a1\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005j\u0002`\u00072\u0014\b\u0004\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\b\u001a!\u0010\u0010\u001a\u0004\u0018\u0001H\b\"\b\b\u0000\u0010\b*\u00020\u00062\u0006\u0010\u0011\u001a\u0002H\bH\u0000¢\u0006\u0002\u0010\u0012\u001a\u001b\u0010\u0013\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\b\b\u0002\u0010\u0014\u001a\u00020\u0003H\u0082\u0010\u001a\u0018\u0010\u0015\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000*(\b\u0002\u0010\u0017\"\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¨\u0006\u0018"}, m115d2 = {"ctorCache", "Lkotlinx/coroutines/internal/CtorCache;", "throwableFields", "", "createConstructor", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/Ctor;", "E", "clz", "Ljava/lang/Class;", "createSafeConstructor", "constructor", "Ljava/lang/reflect/Constructor;", "safeCtor", "block", "tryCopyException", "exception", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "fieldsCount", "accumulator", "fieldsCountOrDefault", "defaultValue", "Ctor", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class ExceptionsConstructorKt {
    private static final kotlinx.coroutines.internal.CtorCache ctorCache = null;
    private static final int throwableFields = 0;


    static {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            r1 = -1
            int r0 = fieldsCountOrDefault(r0, r1)
            kotlinx.coroutines.internal.ExceptionsConstructorKt.throwableFields = r0
            boolean r0 = kotlinx.coroutines.internal.FastServiceLoaderKt.getANDROID_DETECTED()     // Catch: java.lang.Throwable -> L1a
            if (r0 == 0) goto L15
            kotlinx.coroutines.internal.WeakMapCtorCache r0 = kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE     // Catch: java.lang.Throwable -> L1a
            kotlinx.coroutines.internal.CtorCache r0 = (kotlinx.coroutines.internal.CtorCache) r0     // Catch: java.lang.Throwable -> L1a
            goto L19
        L15:
            kotlinx.coroutines.internal.ClassValueCtorCache r0 = kotlinx.coroutines.internal.ClassValueCtorCache.INSTANCE     // Catch: java.lang.Throwable -> L1a
            kotlinx.coroutines.internal.CtorCache r0 = (kotlinx.coroutines.internal.CtorCache) r0     // Catch: java.lang.Throwable -> L1a
        L19:
            goto L20
        L1a:
            r0 = move-exception
            kotlinx.coroutines.internal.WeakMapCtorCache r1 = kotlinx.coroutines.internal.WeakMapCtorCache.INSTANCE
            kotlinx.coroutines.internal.CtorCache r1 = (kotlinx.coroutines.internal.CtorCache) r1
            r0 = r1
        L20:
            kotlinx.coroutines.internal.ExceptionsConstructorKt.ctorCache = r0
            return
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function1 access$createConstructor(java.lang.Class r1) {
            kotlin.jvm.functions.Function1 r0 = createConstructor(r1)
            return r0
    }

    private static final <E extends java.lang.Throwable> kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> createConstructor(java.lang.Class<E> r5) {
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1 r0 = kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$nullResult$1.INSTANCE
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            int r1 = kotlinx.coroutines.internal.ExceptionsConstructorKt.throwableFields
            r2 = 0
            int r2 = fieldsCountOrDefault(r5, r2)
            if (r1 == r2) goto Le
            return r0
        Le:
            java.lang.reflect.Constructor[] r1 = r5.getConstructors()
            r2 = 0
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$$inlined$sortedByDescending$1 r3 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createConstructor$$inlined$sortedByDescending$1
            r3.<init>()
            java.util.Comparator r3 = (java.util.Comparator) r3
            java.util.List r1 = kotlin.collections.ArraysKt.sortedWith(r1, r3)
            java.util.Iterator r2 = r1.iterator()
        L23:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L36
            java.lang.Object r3 = r2.next()
            java.lang.reflect.Constructor r3 = (java.lang.reflect.Constructor) r3
            kotlin.jvm.functions.Function1 r4 = createSafeConstructor(r3)
            if (r4 == 0) goto L23
            return r4
        L36:
            return r0
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> createSafeConstructor(java.lang.reflect.Constructor<?> r4) {
            java.lang.Class[] r0 = r4.getParameterTypes()
            int r1 = r0.length
            r2 = 0
            r3 = 0
            switch(r1) {
                case 0: goto L53;
                case 1: goto L2c;
                case 2: goto Lb;
                default: goto La;
            }
        La:
            goto L5c
        Lb:
            r1 = r0[r2]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L2b
            r1 = 1
            r1 = r0[r1]
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L2b
            r1 = 0
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$1 r2 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$1
            r2.<init>(r4)
            r3 = r2
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            goto L5c
        L2b:
            goto L5c
        L2c:
            r1 = r0[r2]
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r2 == 0) goto L40
            r1 = 0
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$2 r2 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$2
            r2.<init>(r4)
            r3 = r2
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            goto L5c
        L40:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 == 0) goto L52
            r1 = 0
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$3 r2 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$3
            r2.<init>(r4)
            r3 = r2
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            goto L5c
        L52:
            goto L5c
        L53:
            r1 = 0
            kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$4 r2 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$createSafeConstructor$$inlined$safeCtor$4
            r2.<init>(r4)
            r3 = r2
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
        L5c:
            return r3
    }

    private static final int fieldsCount(java.lang.Class<?> r11, int r12) {
            r0 = r11
            r1 = r12
        L2:
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
            r3 = 0
            r4 = 0
            int r5 = r2.length
            r6 = 0
        La:
            if (r6 >= r5) goto L1f
            r7 = r2[r6]
            int r6 = r6 + 1
            r8 = r7
            r9 = 0
            int r10 = r8.getModifiers()
            boolean r10 = java.lang.reflect.Modifier.isStatic(r10)
            if (r10 != 0) goto La
            int r4 = r4 + 1
            goto La
        L1f:
            r2 = r4
            int r1 = r1 + r2
            java.lang.Class r0 = r0.getSuperclass()
            if (r0 != 0) goto L29
            return r1
        L29:
            goto L2
    }

    static /* synthetic */ int fieldsCount$default(java.lang.Class r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            int r0 = fieldsCount(r0, r1)
            return r0
    }

    private static final int fieldsCountOrDefault(java.lang.Class<?> r5, int r6) {
            kotlin.reflect.KClass r0 = kotlin.jvm.JvmClassMappingKt.getKotlinClass(r5)
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L17
            r1 = 0
            r2 = 1
            r3 = 0
            r4 = 0
            int r2 = fieldsCount$default(r5, r4, r2, r3)     // Catch: java.lang.Throwable -> L17
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L17
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)     // Catch: java.lang.Throwable -> L17
            goto L22
        L17:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)
        L22:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            boolean r2 = kotlin.Result.m8675isFailureimpl(r0)
            if (r2 == 0) goto L2d
            r0 = r1
        L2d:
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    private static final kotlin.jvm.functions.Function1<java.lang.Throwable, java.lang.Throwable> safeCtor(kotlin.jvm.functions.Function1<? super java.lang.Throwable, ? extends java.lang.Throwable> r2) {
            r0 = 0
            kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1 r1 = new kotlinx.coroutines.internal.ExceptionsConstructorKt$safeCtor$1
            r1.<init>(r2)
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            return r1
    }

    public static final <E extends java.lang.Throwable> E tryCopyException(E r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.CopyableThrowable
            if (r0 == 0) goto L28
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L13
            r0 = 0
            r1 = r2
            kotlinx.coroutines.CopyableThrowable r1 = (kotlinx.coroutines.CopyableThrowable) r1     // Catch: java.lang.Throwable -> L13
            java.lang.Throwable r1 = r1.createCopy()     // Catch: java.lang.Throwable -> L13
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r1)     // Catch: java.lang.Throwable -> L13
            goto L1e
        L13:
            r0 = move-exception
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.ResultKt.createFailure(r0)
            java.lang.Object r0 = kotlin.Result.m8669constructorimpl(r0)
        L1e:
            boolean r1 = kotlin.Result.m8675isFailureimpl(r0)
            if (r1 == 0) goto L25
            r0 = 0
        L25:
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
        L28:
            kotlinx.coroutines.internal.CtorCache r0 = kotlinx.coroutines.internal.ExceptionsConstructorKt.ctorCache
            java.lang.Class r1 = r2.getClass()
            kotlin.jvm.functions.Function1 r0 = r0.get(r1)
            java.lang.Object r0 = r0.invoke(r2)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            return r0
    }
}
