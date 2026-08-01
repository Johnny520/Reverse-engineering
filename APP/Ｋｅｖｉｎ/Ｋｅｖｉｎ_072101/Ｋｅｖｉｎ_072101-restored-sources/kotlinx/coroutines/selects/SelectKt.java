package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00004\n\u0000\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u0010\u001a\u0002H\u0011\"\u0004\b\u0000\u0010\u00112\u001f\b\u0004\u0010\u0012\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0002\b\u0016H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0002\u0010\u0017\u001aN\u0010\u0018\u001a\u00020\u0015\"\u0004\b\u0000\u0010\u0011*\b\u0012\u0004\u0012\u0002H\u00110\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\u001c\u0010\u001b\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00110\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0013H\u0007ø\u0001\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001d\u0010\u001e\"\u001c\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005\"\u001c\u0010\u0006\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\b\u0010\u0005\"\u0016\u0010\t\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\n\u0010\u0003\"\u0016\u0010\u000b\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\u0003\"\u0016\u0010\r\u001a\u00020\u000e8\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, m115d2 = {"ALREADY_SELECTED", "", "getALREADY_SELECTED$annotations", "()V", "getALREADY_SELECTED", "()Ljava/lang/Object;", "NOT_SELECTED", "getNOT_SELECTED$annotations", "getNOT_SELECTED", "RESUMED", "getRESUMED$annotations", "UNDECIDED", "getUNDECIDED$annotations", "selectOpSequenceNumber", "Lkotlinx/coroutines/selects/SeqNumber;", "getSelectOpSequenceNumber$annotations", "select", "R", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTimeout", "timeout", "Lkotlin/time/Duration;", "block", "Lkotlin/coroutines/Continuation;", "onTimeout-8Mi8wO0", "(Lkotlinx/coroutines/selects/SelectBuilder;JLkotlin/jvm/functions/Function1;)V", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class SelectKt {
    private static final java.lang.Object ALREADY_SELECTED = null;
    private static final java.lang.Object NOT_SELECTED = null;
    private static final java.lang.Object RESUMED = null;
    private static final java.lang.Object UNDECIDED = null;
    private static final kotlinx.coroutines.selects.SeqNumber selectOpSequenceNumber = null;

    static {
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "NOT_SELECTED"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.NOT_SELECTED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "ALREADY_SELECTED"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.ALREADY_SELECTED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "UNDECIDED"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.UNDECIDED = r0
            kotlinx.coroutines.internal.Symbol r0 = new kotlinx.coroutines.internal.Symbol
            java.lang.String r1 = "RESUMED"
            r0.<init>(r1)
            kotlinx.coroutines.selects.SelectKt.RESUMED = r0
            kotlinx.coroutines.selects.SeqNumber r0 = new kotlinx.coroutines.selects.SeqNumber
            r0.<init>()
            kotlinx.coroutines.selects.SelectKt.selectOpSequenceNumber = r0
            return
    }

    public static final /* synthetic */ java.lang.Object access$getRESUMED$p() {
            java.lang.Object r0 = kotlinx.coroutines.selects.SelectKt.RESUMED
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.selects.SeqNumber access$getSelectOpSequenceNumber$p() {
            kotlinx.coroutines.selects.SeqNumber r0 = kotlinx.coroutines.selects.SelectKt.selectOpSequenceNumber
            return r0
    }

    public static final /* synthetic */ java.lang.Object access$getUNDECIDED$p() {
            java.lang.Object r0 = kotlinx.coroutines.selects.SelectKt.UNDECIDED
            return r0
    }

    public static final java.lang.Object getALREADY_SELECTED() {
            java.lang.Object r0 = kotlinx.coroutines.selects.SelectKt.ALREADY_SELECTED
            return r0
    }

    public static /* synthetic */ void getALREADY_SELECTED$annotations() {
            return
    }

    public static final java.lang.Object getNOT_SELECTED() {
            java.lang.Object r0 = kotlinx.coroutines.selects.SelectKt.NOT_SELECTED
            return r0
    }

    public static /* synthetic */ void getNOT_SELECTED$annotations() {
            return
    }

    private static /* synthetic */ void getRESUMED$annotations() {
            return
    }

    private static /* synthetic */ void getSelectOpSequenceNumber$annotations() {
            return
    }

    private static /* synthetic */ void getUNDECIDED$annotations() {
            return
    }

    /* JADX INFO: renamed from: onTimeout-8Mi8wO0, reason: not valid java name */
    public static final <R> void m10232onTimeout8Mi8wO0(kotlinx.coroutines.selects.SelectBuilder<? super R> r2, long r3, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            long r0 = kotlinx.coroutines.DelayKt.m10159toDelayMillisLRDsOJo(r3)
            r2.onTimeout(r0, r5)
            return
    }

    public static final <R> java.lang.Object select(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super R> r6) {
            r0 = 0
            r1 = r6
            r2 = 0
            kotlinx.coroutines.selects.SelectBuilderImpl r3 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r3.<init>(r1)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> Le
            goto L12
        Le:
            r4 = move-exception
            r3.handleBuilderException(r4)
        L12:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L1f
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L1f:
            return r1
    }

    private static final <R> java.lang.Object select$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super R> r6) {
            r0 = 0
            r1 = 0
            kotlin.jvm.internal.InlineMarker.mark(r1)
            r1 = r6
            r2 = 0
            kotlinx.coroutines.selects.SelectBuilderImpl r3 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r3.<init>(r1)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r4 = move-exception
            r3.handleBuilderException(r4)
        L16:
            java.lang.Object r1 = r3.getResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L23
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L23:
            r2 = 1
            kotlin.jvm.internal.InlineMarker.mark(r2)
            return r1
    }
}
