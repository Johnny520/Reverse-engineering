package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: StackTraceRecovery.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0014\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0001H\u0007\u001a9\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\u0006\u0010\u000e\u001a\u0002H\u000b2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002\u001a1\u0010\u0016\u001a\u00020\u00172\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a+\u0010\u001f\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a,\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030#H\u0080\b¢\u0006\u0002\u0010$\u001a!\u0010%\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\u001a \u0010&\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0080\b¢\u0006\u0002\u0010\"\u001a\u001f\u0010'\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a1\u0010(\u001a\u0018\u0012\u0004\u0012\u0002H\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00190)\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010*\u001a\u001c\u0010+\u001a\u00020,*\u00060\u0007j\u0002`\b2\n\u0010-\u001a\u00060\u0007j\u0002`\bH\u0002\u001a#\u0010.\u001a\u00020/*\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0006\u00100\u001a\u00020\u0001H\u0002¢\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0017*\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u00103\u001a\u00020,*\u00060\u0007j\u0002`\bH\u0000\u001a\u001b\u00104\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u00105\"\u00020\u00142\u00020\u0014*\f\b\u0000\u00106\"\u00020\u00072\u00020\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, m115d2 = {"baseContinuationImplClass", "", "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "artificialFrame", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "message", "createFinalException", "E", "", "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", "", "recoveredStacktrace", "", "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", "", "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "tryCopyAndVerify", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", "", "e", "frameIndex", "", "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class StackTraceRecoveryKt {
    private static final java.lang.String baseContinuationImplClass = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
    private static final java.lang.String baseContinuationImplClassName = null;
    private static final java.lang.String stackTraceRecoveryClass = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
    private static final java.lang.String stackTraceRecoveryClassName = null;

    static {
            java.lang.String r0 = "kotlinx.coroutines.internal.StackTraceRecoveryKt"
            java.lang.String r1 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl"
            kotlin.Result$Companion r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L14
            r2 = 0
            java.lang.Class r3 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L14
            java.lang.String r3 = r3.getCanonicalName()     // Catch: java.lang.Throwable -> L14
            java.lang.Object r2 = kotlin.Result.m8669constructorimpl(r3)     // Catch: java.lang.Throwable -> L14
            goto L1f
        L14:
            r2 = move-exception
            kotlin.Result$Companion r3 = kotlin.Result.Companion
            java.lang.Object r2 = kotlin.ResultKt.createFailure(r2)
            java.lang.Object r2 = kotlin.Result.m8669constructorimpl(r2)
        L1f:
            java.lang.Throwable r3 = kotlin.Result.m8672exceptionOrNullimpl(r2)
            if (r3 != 0) goto L27
            r1 = r2
            goto L2a
        L27:
            r2 = r3
            r3 = 0
        L2a:
            java.lang.String r1 = (java.lang.String) r1
            kotlinx.coroutines.internal.StackTraceRecoveryKt.baseContinuationImplClassName = r1
            kotlin.Result$Companion r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L3f
            r1 = 0
            java.lang.Class r2 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r2.getCanonicalName()     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r1 = kotlin.Result.m8669constructorimpl(r2)     // Catch: java.lang.Throwable -> L3f
            goto L4a
        L3f:
            r1 = move-exception
            kotlin.Result$Companion r2 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r1)
            java.lang.Object r1 = kotlin.Result.m8669constructorimpl(r1)
        L4a:
            java.lang.Throwable r2 = kotlin.Result.m8672exceptionOrNullimpl(r1)
            if (r2 != 0) goto L52
            r0 = r1
            goto L55
        L52:
            r1 = r2
            r2 = 0
        L55:
            java.lang.String r0 = (java.lang.String) r0
            kotlinx.coroutines.internal.StackTraceRecoveryKt.stackTraceRecoveryClassName = r0
            return
    }

    public static /* synthetic */ void CoroutineStackFrame$annotations() {
            return
    }

    public static /* synthetic */ void StackTraceElement$annotations() {
            return
    }

    public static final /* synthetic */ java.lang.Throwable access$recoverFromStackFrame(java.lang.Throwable r1, kotlin.coroutines.jvm.internal.CoroutineStackFrame r2) {
            java.lang.Throwable r0 = recoverFromStackFrame(r1, r2)
            return r0
    }

    public static final java.lang.StackTraceElement artificialFrame(java.lang.String r4) {
            java.lang.StackTraceElement r0 = new java.lang.StackTraceElement
            java.lang.String r1 = "\b\b\b("
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r4)
            java.lang.String r2 = "\b"
            r3 = -1
            r0.<init>(r1, r2, r2, r3)
            return r0
    }

    private static final <E extends java.lang.Throwable> kotlin.Pair<E, java.lang.StackTraceElement[]> causeAndStacktrace(E r10) {
            java.lang.Throwable r0 = r10.getCause()
            r1 = 0
            if (r0 == 0) goto L3d
            java.lang.Class r2 = r0.getClass()
            java.lang.Class r3 = r10.getClass()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 == 0) goto L3d
            java.lang.StackTraceElement[] r2 = r10.getStackTrace()
            r3 = r2
            r4 = 0
            int r5 = r3.length
            r6 = r1
        L1d:
            if (r6 >= r5) goto L2d
            r7 = r3[r6]
            int r6 = r6 + 1
            r8 = r7
            r9 = 0
            boolean r8 = isArtificial(r8)
            if (r8 == 0) goto L1d
            r5 = 1
            goto L2e
        L2d:
            r5 = r1
        L2e:
            if (r5 == 0) goto L35
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r0, r2)
            goto L44
        L35:
            r3 = 0
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r10, r1)
            goto L44
        L3d:
            r2 = 0
            java.lang.StackTraceElement[] r1 = new java.lang.StackTraceElement[r1]
            kotlin.Pair r1 = kotlin.TuplesKt.m122to(r10, r1)
        L44:
            return r1
    }

    private static final <E extends java.lang.Throwable> E createFinalException(E r8, E r9, java.util.ArrayDeque<java.lang.StackTraceElement> r10) {
            java.lang.String r0 = "Coroutine boundary"
            java.lang.StackTraceElement r0 = artificialFrame(r0)
            r10.addFirst(r0)
            java.lang.StackTraceElement[] r0 = r8.getStackTrace()
            java.lang.String r1 = kotlinx.coroutines.internal.StackTraceRecoveryKt.baseContinuationImplClassName
            int r1 = frameIndex(r0, r1)
            r2 = -1
            r3 = 0
            if (r1 != r2) goto L33
            r2 = r10
            java.util.Collection r2 = (java.util.Collection) r2
            r4 = 0
            r5 = r2
            java.lang.StackTraceElement[] r3 = new java.lang.StackTraceElement[r3]
            java.lang.Object[] r3 = r5.toArray(r3)
            if (r3 == 0) goto L2b
            java.lang.StackTraceElement[] r3 = (java.lang.StackTraceElement[]) r3
            r9.setStackTrace(r3)
            return r9
        L2b:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r6 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r3.<init>(r6)
            throw r3
        L33:
            int r2 = r10.size()
            int r2 = r2 + r1
            java.lang.StackTraceElement[] r2 = new java.lang.StackTraceElement[r2]
            r4 = r3
        L3b:
            if (r4 >= r1) goto L45
            r5 = r4
            int r4 = r4 + 1
            r6 = r0[r5]
            r2[r5] = r6
            goto L3b
        L45:
            java.util.Iterator r4 = r10.iterator()
        L49:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5d
            r5 = r3
            int r3 = r3 + 1
            java.lang.Object r6 = r4.next()
            java.lang.StackTraceElement r6 = (java.lang.StackTraceElement) r6
            int r7 = r1 + r5
            r2[r7] = r6
            goto L49
        L5d:
            r9.setStackTrace(r2)
            return r9
    }

    private static final java.util.ArrayDeque<java.lang.StackTraceElement> createStackTrace(kotlin.coroutines.jvm.internal.CoroutineStackFrame r4) {
            java.util.ArrayDeque r0 = new java.util.ArrayDeque
            r0.<init>()
            java.lang.StackTraceElement r1 = r4.getStackTraceElement()
            if (r1 != 0) goto Lc
            goto L10
        Lc:
            r2 = 0
            r0.add(r1)
        L10:
            r1 = r4
        L11:
            boolean r2 = r1 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            r3 = 0
            if (r2 == 0) goto L19
            r2 = r1
            goto L1a
        L19:
            r2 = r3
        L1a:
            if (r2 != 0) goto L1d
            goto L21
        L1d:
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = r2.getCallerFrame()
        L21:
            if (r3 != 0) goto L24
            return r0
        L24:
            r1 = r3
            java.lang.StackTraceElement r2 = r1.getStackTraceElement()
            if (r2 != 0) goto L2c
            goto L11
        L2c:
            r3 = 0
            r0.add(r2)
            goto L11
    }

    private static final boolean elementWiseEquals(java.lang.StackTraceElement r2, java.lang.StackTraceElement r3) {
            int r0 = r2.getLineNumber()
            int r1 = r3.getLineNumber()
            if (r0 != r1) goto L36
            java.lang.String r0 = r2.getMethodName()
            java.lang.String r1 = r3.getMethodName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r2.getFileName()
            java.lang.String r1 = r3.getFileName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = r2.getClassName()
            java.lang.String r1 = r3.getClassName()
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r1)
            if (r0 == 0) goto L36
            r0 = 1
            goto L37
        L36:
            r0 = 0
        L37:
            return r0
    }

    private static final int frameIndex(java.lang.StackTraceElement[] r8, java.lang.String r9) {
            r0 = r8
            r1 = 0
            int r2 = r0.length
            r3 = 0
        L4:
            if (r3 >= r2) goto L17
            r4 = r3
            int r3 = r3 + 1
            r5 = r0[r4]
            r6 = 0
            java.lang.String r7 = r5.getClassName()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r7)
            if (r5 == 0) goto L4
            goto L18
        L17:
            r4 = -1
        L18:
            return r4
    }

    public static final void initCause(java.lang.Throwable r0, java.lang.Throwable r1) {
            r0.initCause(r1)
            return
    }

    public static final boolean isArtificial(java.lang.StackTraceElement r5) {
            java.lang.String r0 = r5.getClassName()
            r1 = 2
            r2 = 0
            java.lang.String r3 = "\b\b\b"
            r4 = 0
            boolean r0 = kotlin.text.StringsKt.startsWith$default(r0, r3, r4, r1, r2)
            return r0
    }

    private static final void mergeRecoveredTraces(java.lang.StackTraceElement[] r8, java.util.ArrayDeque<java.lang.StackTraceElement> r9) {
            r0 = r8
            r1 = 0
            int r2 = r0.length
            r3 = 0
        L4:
            r4 = -1
            if (r3 >= r2) goto L14
            r5 = r3
            int r3 = r3 + 1
            r6 = r0[r5]
            r7 = 0
            boolean r6 = isArtificial(r6)
            if (r6 == 0) goto L4
            goto L15
        L14:
            r5 = r4
        L15:
            int r5 = r5 + 1
            int r0 = r8.length
            int r0 = r0 + (-1)
            if (r5 > r0) goto L37
            r1 = r0
        L1d:
            r2 = r1
            int r1 = r1 + r4
            r3 = r8[r2]
            java.lang.Object r6 = r9.getLast()
            java.lang.StackTraceElement r6 = (java.lang.StackTraceElement) r6
            boolean r6 = elementWiseEquals(r3, r6)
            if (r6 == 0) goto L30
            r9.removeLast()
        L30:
            r6 = r8[r2]
            r9.addFirst(r6)
            if (r2 != r5) goto L1d
        L37:
            return
    }

    public static final java.lang.Object recoverAndThrow(java.lang.Throwable r4, kotlin.coroutines.Continuation<?> r5) {
            r0 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 == 0) goto L16
            r1 = r5
            r2 = 0
            boolean r3 = r1 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r3 != 0) goto Le
            throw r4
        Le:
            r3 = r1
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r3
            java.lang.Throwable r3 = access$recoverFromStackFrame(r4, r3)
            throw r3
        L16:
            throw r4
    }

    private static final java.lang.Object recoverAndThrow$$forInline(java.lang.Throwable r4, kotlin.coroutines.Continuation<?> r5) {
            r0 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 == 0) goto L1a
            r1 = 0
            kotlin.jvm.internal.InlineMarker.mark(r1)
            r1 = r5
            r2 = 0
            boolean r3 = r1 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r3 != 0) goto L12
            throw r4
        L12:
            r3 = r1
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r3 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r3
            java.lang.Throwable r3 = access$recoverFromStackFrame(r4, r3)
            throw r3
        L1a:
            throw r4
    }

    private static final <E extends java.lang.Throwable> E recoverFromStackFrame(E r5, kotlin.coroutines.jvm.internal.CoroutineStackFrame r6) {
            kotlin.Pair r0 = causeAndStacktrace(r5)
            java.lang.Object r1 = r0.component1()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r0 = r0.component2()
            java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
            java.lang.Throwable r2 = tryCopyAndVerify(r1)
            if (r2 != 0) goto L17
            return r5
        L17:
            java.util.ArrayDeque r3 = createStackTrace(r6)
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L22
            return r5
        L22:
            if (r1 == r5) goto L27
            mergeRecoveredTraces(r0, r3)
        L27:
            java.lang.Throwable r4 = createFinalException(r1, r2, r3)
            return r4
    }

    public static final <E extends java.lang.Throwable> E recoverStackTrace(E r2) {
            boolean r0 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.lang.Throwable r0 = tryCopyAndVerify(r2)
            if (r0 != 0) goto Le
            return r2
        Le:
            java.lang.Throwable r1 = sanitizeStackTrace(r0)
            return r1
    }

    public static final <E extends java.lang.Throwable> E recoverStackTrace(E r2, kotlin.coroutines.Continuation<?> r3) {
            r0 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 == 0) goto L14
            boolean r1 = r3 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 != 0) goto Lc
            goto L14
        Lc:
            r1 = r3
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r1 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r1
            java.lang.Throwable r1 = access$recoverFromStackFrame(r2, r1)
            return r1
        L14:
            return r2
    }

    private static final <E extends java.lang.Throwable> E sanitizeStackTrace(E r10) {
            java.lang.StackTraceElement[] r0 = r10.getStackTrace()
            int r1 = r0.length
            java.lang.String r2 = kotlinx.coroutines.internal.StackTraceRecoveryKt.stackTraceRecoveryClassName
            int r2 = frameIndex(r0, r2)
            int r3 = r2 + 1
            java.lang.String r4 = kotlinx.coroutines.internal.StackTraceRecoveryKt.baseContinuationImplClassName
            int r4 = frameIndex(r0, r4)
            r5 = -1
            r6 = 0
            if (r4 != r5) goto L19
            r5 = r6
            goto L1b
        L19:
            int r5 = r1 - r4
        L1b:
            int r7 = r1 - r2
            int r7 = r7 - r5
            java.lang.StackTraceElement[] r8 = new java.lang.StackTraceElement[r7]
        L20:
            if (r6 >= r7) goto L36
            if (r6 != 0) goto L2b
            java.lang.String r9 = "Coroutine boundary"
            java.lang.StackTraceElement r9 = artificialFrame(r9)
            goto L31
        L2b:
            int r9 = r3 + r6
            int r9 = r9 + (-1)
            r9 = r0[r9]
        L31:
            r8[r6] = r9
            int r6 = r6 + 1
            goto L20
        L36:
            r6 = r8
            r10.setStackTrace(r6)
            return r10
    }

    private static final <E extends java.lang.Throwable> E tryCopyAndVerify(E r4) {
            java.lang.Throwable r0 = kotlinx.coroutines.internal.ExceptionsConstructorKt.tryCopyException(r4)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r4 instanceof kotlinx.coroutines.CopyableThrowable
            if (r2 != 0) goto L1b
            java.lang.String r2 = r0.getMessage()
            java.lang.String r3 = r4.getMessage()
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r3)
            if (r2 != 0) goto L1b
            return r1
        L1b:
            return r0
    }

    public static final <E extends java.lang.Throwable> E unwrap(E r2) {
            r0 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r1 != 0) goto L9
            r1 = r2
            goto Ld
        L9:
            java.lang.Throwable r1 = unwrapImpl(r2)
        Ld:
            return r1
    }

    public static final <E extends java.lang.Throwable> E unwrapImpl(E r9) {
            java.lang.Throwable r0 = r9.getCause()
            if (r0 == 0) goto L32
            java.lang.Class r1 = r0.getClass()
            java.lang.Class r2 = r9.getClass()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r2)
            if (r1 != 0) goto L15
            goto L32
        L15:
            java.lang.StackTraceElement[] r1 = r9.getStackTrace()
            r2 = 0
            int r3 = r1.length
            r4 = 0
            r5 = r4
        L1d:
            if (r5 >= r3) goto L2d
            r6 = r1[r5]
            int r5 = r5 + 1
            r7 = r6
            r8 = 0
            boolean r7 = isArtificial(r7)
            if (r7 == 0) goto L1d
            r4 = 1
            goto L2e
        L2d:
        L2e:
            if (r4 == 0) goto L31
            return r0
        L31:
            return r9
        L32:
            return r9
    }
}
