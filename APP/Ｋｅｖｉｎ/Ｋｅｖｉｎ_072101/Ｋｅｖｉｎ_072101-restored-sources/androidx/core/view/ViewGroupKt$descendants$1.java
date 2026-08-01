package androidx.core.view;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m115d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Landroid/view/View;"}, m116k = 3, m117mv = {1, 8, 0}, m119xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "androidx.core.view.ViewGroupKt$descendants$1", m125f = "ViewGroup.kt", m126i = {0, 0, 0, 0, 1, 1, 1}, m127l = {119, 121}, m128m = "invokeSuspend", m129n = {"$this$sequence", "$this$forEach$iv", "child", "index$iv", "$this$sequence", "$this$forEach$iv", "index$iv"}, m130s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0"})
final class ViewGroupKt$descendants$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super android.view.View>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ android.view.ViewGroup $this_descendants;
    int I$0;
    int I$1;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;

    ViewGroupKt$descendants$1(android.view.ViewGroup r2, kotlin.coroutines.Continuation<? super androidx.core.view.ViewGroupKt$descendants$1> r3) {
            r1 = this;
            r1.$this_descendants = r2
            r0 = 2
            r1.<init>(r0, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.core.view.ViewGroupKt$descendants$1 r0 = new androidx.core.view.ViewGroupKt$descendants$1
            android.view.ViewGroup r1 = r2.$this_descendants
            r0.<init>(r1, r4)
            r0.L$0 = r3
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super android.view.View> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
            r1 = this;
            kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            java.lang.Object r0 = r1.invoke2(r2, r3)
            return r0
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super android.view.View> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
            r2 = this;
            kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
            androidx.core.view.ViewGroupKt$descendants$1 r0 = (androidx.core.view.ViewGroupKt$descendants$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            r13 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r13.label
            r2 = 1
            switch(r1) {
                case 0: goto L3d;
                case 1: goto L26;
                case 2: goto L12;
                default: goto La;
            }
        La:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L12:
            r1 = r13
            r3 = 0
            r4 = 0
            int r5 = r1.I$1
            int r6 = r1.I$0
            java.lang.Object r7 = r1.L$1
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            java.lang.Object r8 = r1.L$0
            kotlin.sequences.SequenceScope r8 = (kotlin.sequences.SequenceScope) r8
            kotlin.ResultKt.throwOnFailure(r14)
            goto L90
        L26:
            r1 = r13
            r3 = 0
            r4 = 0
            int r5 = r1.I$1
            int r6 = r1.I$0
            java.lang.Object r7 = r1.L$2
            android.view.View r7 = (android.view.View) r7
            java.lang.Object r8 = r1.L$1
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            java.lang.Object r9 = r1.L$0
            kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
            kotlin.ResultKt.throwOnFailure(r14)
            goto L6e
        L3d:
            kotlin.ResultKt.throwOnFailure(r14)
            r1 = r13
            java.lang.Object r3 = r1.L$0
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            android.view.ViewGroup r4 = r1.$this_descendants
            r5 = 0
            r6 = 0
            int r7 = r4.getChildCount()
        L4d:
            if (r6 >= r7) goto L9c
            android.view.View r8 = r4.getChildAt(r6)
            r9 = 0
            r1.L$0 = r3
            r1.L$1 = r4
            r1.L$2 = r8
            r1.I$0 = r6
            r1.I$1 = r7
            r1.label = r2
            java.lang.Object r10 = r3.yield(r8, r1)
            if (r10 != r0) goto L67
            return r0
        L67:
            r12 = r9
            r9 = r3
            r3 = r5
            r5 = r7
            r7 = r8
            r8 = r4
            r4 = r12
        L6e:
            boolean r10 = r7 instanceof android.view.ViewGroup
            if (r10 == 0) goto L95
            r10 = r7
            android.view.ViewGroup r10 = (android.view.ViewGroup) r10
            kotlin.sequences.Sequence r10 = androidx.core.view.ViewGroupKt.getDescendants(r10)
            r1.L$0 = r9
            r1.L$1 = r8
            r11 = 0
            r1.L$2 = r11
            r1.I$0 = r6
            r1.I$1 = r5
            r11 = 2
            r1.label = r11
            java.lang.Object r7 = r9.yieldAll(r10, r1)
            if (r7 != r0) goto L8e
            return r0
        L8e:
            r7 = r8
            r8 = r9
        L90:
            r4 = r7
            r7 = r5
            r5 = r3
            r3 = r8
            goto L99
        L95:
            r7 = r5
            r4 = r8
            r5 = r3
            r3 = r9
        L99:
            int r6 = r6 + r2
            goto L4d
        L9c:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
    }
}
