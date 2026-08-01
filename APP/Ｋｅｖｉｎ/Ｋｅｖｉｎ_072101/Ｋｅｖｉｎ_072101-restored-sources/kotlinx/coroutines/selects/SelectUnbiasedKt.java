package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: SelectUnbiased.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u001f\b\u0004\u0010\u0002\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m115d2 = {"selectUnbiased", "R", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class SelectUnbiasedKt {
    public static final <R> java.lang.Object selectUnbiased(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super R> r6) {
            r0 = 0
            r1 = r6
            r2 = 0
            kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl r3 = new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl
            r3.<init>(r1)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> Ld
            goto L11
        Ld:
            r4 = move-exception
            r3.handleBuilderException(r4)
        L11:
            java.lang.Object r1 = r3.initSelectResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L1e
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L1e:
            return r1
    }

    private static final <R> java.lang.Object selectUnbiased$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super R>, kotlin.Unit> r5, kotlin.coroutines.Continuation<? super R> r6) {
            r0 = 0
            r1 = 0
            kotlin.jvm.internal.InlineMarker.mark(r1)
            r1 = r6
            r2 = 0
            kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl r3 = new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl
            r3.<init>(r1)
            r5.invoke(r3)     // Catch: java.lang.Throwable -> L11
            goto L15
        L11:
            r4 = move-exception
            r3.handleBuilderException(r4)
        L15:
            java.lang.Object r1 = r3.initSelectResult()
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r1 != r2) goto L22
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r6)
        L22:
            r2 = 1
            kotlin.jvm.internal.InlineMarker.mark(r2)
            return r1
    }
}
