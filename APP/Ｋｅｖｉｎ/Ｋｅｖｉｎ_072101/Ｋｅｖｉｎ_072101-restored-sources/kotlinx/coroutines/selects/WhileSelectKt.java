package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: WhileSelect.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a2\u0010\u0000\u001a\u00020\u00012\u001f\b\u0004\u0010\u0002\u001a\u0019\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0002\b\u0006H\u0087Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, m115d2 = {"whileSelect", "", "builder", "Lkotlin/Function1;", "Lkotlinx/coroutines/selects/SelectBuilder;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class WhileSelectKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1 */
    /* JADX INFO: compiled from: WhileSelect.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 176)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.selects.WhileSelectKt", m125f = "WhileSelect.kt", m126i = {0}, m127l = {37}, m128m = "whileSelect", m129n = {"builder"}, m130s = {"L$0"})
    static final class C10211 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C10211(kotlin.coroutines.Continuation<? super kotlinx.coroutines.selects.WhileSelectKt.C10211> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.selects.WhileSelectKt.whileSelect(r0, r1)
                return r0
        }
    }

    public static final java.lang.Object whileSelect(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super java.lang.Boolean>, kotlin.Unit> r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.selects.WhileSelectKt.C10211
            if (r0 == 0) goto L14
            r0 = r10
            kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1 r0 = (kotlinx.coroutines.selects.WhileSelectKt.C10211) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L19
        L14:
            kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1 r0 = new kotlinx.coroutines.selects.WhileSelectKt$whileSelect$1
            r0.<init>(r10)
        L19:
            r10 = r0
            java.lang.Object r0 = r10.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r10.label
            switch(r2) {
                case 0: goto L3b;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2d:
            r9 = 0
            r2 = 0
            java.lang.Object r3 = r10.L$0
            kotlin.jvm.functions.Function1 r3 = (kotlin.jvm.functions.Function1) r3
            kotlin.ResultKt.throwOnFailure(r0)
            r4 = r3
            r3 = r2
            r2 = r1
            r1 = r0
            goto L73
        L3b:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = 0
            r3 = r9
            r9 = r2
        L41:
            r2 = 0
            r10.L$0 = r3
            r4 = 1
            r10.label = r4
            r4 = r10
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5 = 0
            kotlinx.coroutines.selects.SelectBuilderImpl r6 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r6.<init>(r4)
            r3.invoke(r6)     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            r7 = move-exception
            r6.handleBuilderException(r7)
        L5a:
            java.lang.Object r4 = r6.getResult()
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r5) goto L6a
            r5 = r10
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r5)
        L6a:
            if (r4 != r1) goto L6d
            return r1
        L6d:
            r8 = r1
            r1 = r0
            r0 = r4
            r4 = r3
            r3 = r2
            r2 = r8
        L73:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L80
            r0 = r1
            r1 = r2
            r3 = r4
            goto L41
        L80:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    private static final java.lang.Object whileSelect$$forInline(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.SelectBuilder<? super java.lang.Boolean>, kotlin.Unit> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            r0 = 0
        L1:
            r1 = 0
            r2 = 0
            kotlin.jvm.internal.InlineMarker.mark(r2)
            r2 = r7
            r3 = 0
            kotlinx.coroutines.selects.SelectBuilderImpl r4 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r4.<init>(r2)
            r6.invoke(r4)     // Catch: java.lang.Throwable -> L13
            goto L17
        L13:
            r5 = move-exception
            r4.handleBuilderException(r5)
        L17:
            java.lang.Object r2 = r4.getResult()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r2 != r3) goto L24
            kotlin.coroutines.jvm.internal.DebugProbesKt.probeCoroutineSuspended(r7)
        L24:
            r3 = 1
            kotlin.jvm.internal.InlineMarker.mark(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r1 = r2.booleanValue()
            if (r1 == 0) goto L31
            goto L1
        L31:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
