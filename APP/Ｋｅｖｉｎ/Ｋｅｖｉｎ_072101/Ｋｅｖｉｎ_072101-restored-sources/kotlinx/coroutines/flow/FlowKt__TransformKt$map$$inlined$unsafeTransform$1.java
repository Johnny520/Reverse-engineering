package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: SafeCollector.common.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001f\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\b"}, m115d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 176)
public final class FlowKt__TransformKt$map$$inlined$unsafeTransform$1<R> implements kotlinx.coroutines.flow.Flow<R> {
    final /* synthetic */ kotlinx.coroutines.flow.Flow $this_unsafeTransform$inlined;
    final /* synthetic */ kotlin.jvm.functions.Function2 $transform$inlined$1;


    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2 */
    /* JADX INFO: compiled from: Emitters.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m115d2 = {"<anonymous>", "", "T", "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1"}, m116k = 3, m117mv = {1, 6, 0}, m119xi = 176)
    public static final class C09722<T> implements kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.jvm.internal.SuspendFunction {
        final /* synthetic */ kotlinx.coroutines.flow.FlowCollector $this_unsafeFlow;
        final /* synthetic */ kotlin.jvm.functions.Function2 $transform$inlined;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Emitters.kt */
        @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 176)
        @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2", m125f = "Transform.kt", m126i = {}, m127l = {223, 223}, m128m = "emit", m129n = {}, m130s = {})
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            java.lang.Object L$0;
            int label;
            /* synthetic */ java.lang.Object result;
            final /* synthetic */ kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.C09722 this$0;

            public AnonymousClass1(kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.C09722 r1, kotlin.coroutines.Continuation r2) {
                    r0 = this;
                    r0.this$0 = r1
                    r0.<init>(r2)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final java.lang.Object invokeSuspend(java.lang.Object r4) {
                    r3 = this;
                    r3.result = r4
                    int r0 = r3.label
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r0 = r0 | r1
                    r3.label = r0
                    kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2 r0 = r3.this$0
                    r1 = 0
                    r2 = r3
                    kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
                    java.lang.Object r0 = r0.emit(r1, r2)
                    return r0
            }
        }

        public C09722(kotlinx.coroutines.flow.FlowCollector r1, kotlin.jvm.functions.Function2 r2) {
                r0 = this;
                r0.$this_unsafeFlow = r1
                r0.$transform$inlined = r2
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final java.lang.Object emit(T r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
                r7 = this;
                boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.C09722.AnonymousClass1
                if (r0 == 0) goto L14
                r0 = r9
                kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1.C09722.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r1 = r1 & r2
                if (r1 == 0) goto L14
                int r9 = r0.label
                int r9 = r9 - r2
                r0.label = r9
                goto L19
            L14:
                kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1
                r0.<init>(r7, r9)
            L19:
                r9 = r0
                java.lang.Object r0 = r9.result
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r9.label
                switch(r2) {
                    case 0: goto L3d;
                    case 1: goto L32;
                    case 2: goto L2d;
                    default: goto L25;
                }
            L25:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L2d:
                r8 = 0
                kotlin.ResultKt.throwOnFailure(r0)
                goto L64
            L32:
                r8 = 0
                java.lang.Object r2 = r9.L$0
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.ResultKt.throwOnFailure(r0)
                r4 = r8
                r8 = r0
                goto L56
            L3d:
                kotlin.ResultKt.throwOnFailure(r0)
                r2 = r7
                kotlinx.coroutines.flow.FlowCollector r3 = r2.$this_unsafeFlow
                r4 = r9
                kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                r4 = 0
                kotlin.jvm.functions.Function2 r5 = r2.$transform$inlined
                r9.L$0 = r3
                r6 = 1
                r9.label = r6
                java.lang.Object r8 = r5.invoke(r8, r9)
                if (r8 != r1) goto L55
                return r1
            L55:
                r2 = r3
            L56:
                r3 = 0
                r9.L$0 = r3
                r3 = 2
                r9.label = r3
                java.lang.Object r8 = r2.emit(r8, r9)
                if (r8 != r1) goto L63
                return r1
            L63:
                r8 = r4
            L64:
                kotlin.Unit r8 = kotlin.Unit.INSTANCE
                return r8
        }

        public final java.lang.Object emit$$forInline(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
                r6 = this;
                r0 = 4
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2$1
                r0.<init>(r6, r8)
                r0 = 5
                kotlin.jvm.internal.InlineMarker.mark(r0)
                kotlinx.coroutines.flow.FlowCollector r0 = r6.$this_unsafeFlow
                r1 = r7
                r2 = r8
                r3 = 0
                kotlin.jvm.functions.Function2 r4 = r6.$transform$inlined
                java.lang.Object r4 = r4.invoke(r1, r8)
                r5 = 0
                kotlin.jvm.internal.InlineMarker.mark(r5)
                r0.emit(r4, r8)
                r4 = 1
                kotlin.jvm.internal.InlineMarker.mark(r4)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    public FlowKt__TransformKt$map$$inlined$unsafeTransform$1(kotlinx.coroutines.flow.Flow r1, kotlin.jvm.functions.Function2 r2) {
            r0 = this;
            r0.$this_unsafeTransform$inlined = r1
            r0.$transform$inlined$1 = r2
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r7, kotlin.coroutines.Continuation r8) {
            r6 = this;
            r0 = r7
            r1 = r8
            r2 = 0
            kotlinx.coroutines.flow.Flow r3 = r6.$this_unsafeTransform$inlined
            kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2
            kotlin.jvm.functions.Function2 r5 = r6.$transform$inlined$1
            r4.<init>(r0, r5)
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r3 = r3.collect(r4, r8)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r4) goto L19
            return r3
        L19:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }

    public java.lang.Object collect$$forInline(kotlinx.coroutines.flow.FlowCollector r7, kotlin.coroutines.Continuation r8) {
            r6 = this;
            r0 = 4
            kotlin.jvm.internal.InlineMarker.mark(r0)
            kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$1
            r0.<init>(r6, r8)
            r0 = 5
            kotlin.jvm.internal.InlineMarker.mark(r0)
            r0 = r7
            r1 = r8
            r2 = 0
            kotlinx.coroutines.flow.Flow r3 = r6.$this_unsafeTransform$inlined
            kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2 r4 = new kotlinx.coroutines.flow.FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2
            kotlin.jvm.functions.Function2 r5 = r6.$transform$inlined$1
            r4.<init>(r0, r5)
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            r5 = 0
            kotlin.jvm.internal.InlineMarker.mark(r5)
            r3.collect(r4, r8)
            r3 = 1
            kotlin.jvm.internal.InlineMarker.mark(r3)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
