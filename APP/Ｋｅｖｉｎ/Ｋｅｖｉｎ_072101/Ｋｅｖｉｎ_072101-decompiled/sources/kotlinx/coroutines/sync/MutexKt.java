package kotlinx.coroutines.sync;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u001aB\u0010\u0013\u001a\u0002H\u0014\"\u0004\b\u0000\u0010\u0014*\u00020\u00102\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u0002H\u00140\u0018H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0002\u0010\u0019\"\u0016\u0010\u0000\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\"\u0016\u0010\u0006\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003\"\u0016\u0010\t\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, m115d2 = {"EMPTY_LOCKED", "Lkotlinx/coroutines/sync/Empty;", "getEMPTY_LOCKED$annotations", "()V", "EMPTY_UNLOCKED", "getEMPTY_UNLOCKED$annotations", "LOCKED", "Lkotlinx/coroutines/internal/Symbol;", "getLOCKED$annotations", "LOCK_FAIL", "getLOCK_FAIL$annotations", "UNLOCKED", "getUNLOCKED$annotations", "UNLOCK_FAIL", "getUNLOCK_FAIL$annotations", "Mutex", "Lkotlinx/coroutines/sync/Mutex;", "locked", "", "withLock", "T", "owner", "", "action", "Lkotlin/Function0;", "(Lkotlinx/coroutines/sync/Mutex;Ljava/lang/Object;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class MutexKt {
    private static final kotlinx.coroutines.sync.Empty EMPTY_LOCKED = null;
    private static final kotlinx.coroutines.sync.Empty EMPTY_UNLOCKED = null;
    private static final kotlinx.coroutines.internal.Symbol LOCKED = null;
    private static final kotlinx.coroutines.internal.Symbol LOCK_FAIL = null;
    private static final kotlinx.coroutines.internal.Symbol UNLOCKED = null;
    private static final kotlinx.coroutines.internal.Symbol UNLOCK_FAIL = null;

    /* JADX INFO: renamed from: kotlinx.coroutines.sync.MutexKt$withLock$1 */
    /* JADX INFO: compiled from: Mutex.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.sync.MutexKt", m125f = "Mutex.kt", m126i = {0, 0, 0}, m127l = {112}, m128m = "withLock", m129n = {"$this$withLock", "owner", "action"}, m130s = {"L$0", "L$1", "L$2"})
    static final class C10221<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;
        /* synthetic */ java.lang.Object result;

        C10221(kotlin.coroutines.Continuation<? super kotlinx.coroutines.sync.MutexKt.C10221> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r3) {
                r2 = this;
                r2.result = r3
                int r0 = r2.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r2.label = r0
                r0 = 0
                r1 = r2
                kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
                java.lang.Object r0 = kotlinx.coroutines.sync.MutexKt.withLock(r0, r0, r0, r1)
                return r0
        }
    }

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "LOCK_FAIL"
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.LOCK_FAIL = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "UNLOCK_FAIL"
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.UNLOCK_FAIL = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "LOCKED"
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.LOCKED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "UNLOCKED"
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.UNLOCKED = r0
            kotlinx.coroutines.sync.Empty r0 = new kotlinx.coroutines.sync.Empty
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.LOCKED
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.EMPTY_LOCKED = r0
            kotlinx.coroutines.sync.Empty r0 = new kotlinx.coroutines.sync.Empty
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.sync.MutexKt.UNLOCKED
            r0.<init>(r1)
            kotlinx.coroutines.sync.MutexKt.EMPTY_UNLOCKED = r0
            return
    }

    public static final kotlinx.coroutines.sync.Mutex Mutex(boolean r1) {
            kotlinx.coroutines.sync.MutexImpl r0 = new kotlinx.coroutines.sync.MutexImpl
            r0.<init>(r1)
            kotlinx.coroutines.sync.Mutex r0 = (kotlinx.coroutines.sync.Mutex) r0
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.sync.Mutex Mutex$default(boolean r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.sync.Mutex r0 = Mutex(r0)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.sync.Empty access$getEMPTY_LOCKED$p() {
            kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.EMPTY_LOCKED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.sync.Empty access$getEMPTY_UNLOCKED$p() {
            kotlinx.coroutines.sync.Empty r0 = kotlinx.coroutines.sync.MutexKt.EMPTY_UNLOCKED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getLOCKED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.LOCKED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getLOCK_FAIL$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.LOCK_FAIL
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getUNLOCKED$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.UNLOCKED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.Symbol access$getUNLOCK_FAIL$p() {
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.sync.MutexKt.UNLOCK_FAIL
            return r0
    }

    private static /* synthetic */ void getEMPTY_LOCKED$annotations() {
            return
    }

    private static /* synthetic */ void getEMPTY_UNLOCKED$annotations() {
            return
    }

    private static /* synthetic */ void getLOCKED$annotations() {
            return
    }

    private static /* synthetic */ void getLOCK_FAIL$annotations() {
            return
    }

    private static /* synthetic */ void getUNLOCKED$annotations() {
            return
    }

    private static /* synthetic */ void getUNLOCK_FAIL$annotations() {
            return
    }

    public static final <T> java.lang.Object withLock(kotlinx.coroutines.sync.Mutex r6, java.lang.Object r7, kotlin.jvm.functions.Function0<? extends T> r8, kotlin.coroutines.Continuation<? super T> r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.sync.MutexKt.C10221
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = (kotlinx.coroutines.sync.MutexKt.C10221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.sync.MutexKt$withLock$1 r0 = new kotlinx.coroutines.sync.MutexKt$withLock$1
            r0.<init>(r9)
        L19:
            r9 = r0
            java.lang.Object r0 = r9.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            r3 = 1
            switch(r2) {
                case 0: goto L3d;
                case 1: goto L2e;
                default: goto L26;
            }
        L26:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2e:
            r6 = 0
            java.lang.Object r7 = r9.L$2
            kotlin.jvm.functions.Function0 r7 = (kotlin.jvm.functions.Function0) r7
            java.lang.Object r8 = r9.L$1
            java.lang.Object r1 = r9.L$0
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            kotlin.ResultKt.throwOnFailure(r0)
            goto L56
        L3d:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = 0
            r9.L$0 = r6
            r9.L$1 = r7
            r9.L$2 = r8
            r9.label = r3
            java.lang.Object r4 = r6.lock(r7, r9)
            if (r4 != r1) goto L51
            return r1
        L51:
            r1 = r6
            r6 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L56:
            java.lang.Object r2 = r7.invoke()     // Catch: java.lang.Throwable -> L65
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r1.unlock(r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            return r2
        L65:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r3)
            r1.unlock(r8)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r3)
            throw r2
    }

    private static final <T> java.lang.Object withLock$$forInline(kotlinx.coroutines.sync.Mutex r3, java.lang.Object r4, kotlin.jvm.functions.Function0<? extends T> r5, kotlin.coroutines.Continuation<? super T> r6) {
            r0 = 0
            r1 = 0
            kotlin.jvm.internal.InlineMarker.mark(r1)
            r3.lock(r4, r6)
            r1 = 1
            kotlin.jvm.internal.InlineMarker.mark(r1)
            java.lang.Object r2 = r5.invoke()     // Catch: java.lang.Throwable -> L1c
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r3.unlock(r4)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            return r2
        L1c:
            r2 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r1)
            r3.unlock(r4)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r1)
            throw r2
    }

    public static /* synthetic */ java.lang.Object withLock$default(kotlinx.coroutines.sync.Mutex r1, java.lang.Object r2, kotlin.jvm.functions.Function0 r3, kotlin.coroutines.Continuation r4, int r5, java.lang.Object r6) {
            r6 = 1
            r5 = r5 & r6
            if (r5 == 0) goto L5
            r2 = 0
        L5:
            r5 = 0
            r0 = 0
            kotlin.jvm.internal.InlineMarker.mark(r0)
            r1.lock(r2, r4)
            kotlin.jvm.internal.InlineMarker.mark(r6)
            java.lang.Object r0 = r3.invoke()     // Catch: java.lang.Throwable -> L20
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
            r1.unlock(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            return r0
        L20:
            r0 = move-exception
            kotlin.jvm.internal.InlineMarker.finallyStart(r6)
            r1.unlock(r2)
            kotlin.jvm.internal.InlineMarker.finallyEnd(r6)
            throw r0
    }
}
