package kotlinx.coroutines;

/* JADX INFO: compiled from: Await.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001e\u0010\u0003\u001a\u0010\u0012\f\b\u0001\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004\"\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u001a%\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n0\u0004\"\u00020\nH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a-\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u001a\u001b\u0010\u0007\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\n0\fH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m115d2 = {"awaitAll", "", "T", "deferreds", "", "Lkotlinx/coroutines/Deferred;", "([Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinAll", "", "jobs", "Lkotlinx/coroutines/Job;", "([Lkotlinx/coroutines/Job;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "(Ljava/util/Collection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class AwaitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$1 */
    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.AwaitKt", m125f = "Await.kt", m126i = {}, m127l = {54}, m128m = "joinAll", m129n = {}, m130s = {})
    static final class C08181 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        int I$0;
        int I$1;
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C08181(kotlin.coroutines.Continuation<? super kotlinx.coroutines.AwaitKt.C08181> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.AwaitKt.joinAll(r0, r1)
                return r0
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.AwaitKt$joinAll$3 */
    /* JADX INFO: compiled from: Await.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.AwaitKt", m125f = "Await.kt", m126i = {}, m127l = {66}, m128m = "joinAll", m129n = {}, m130s = {})
    static final class C08193 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        int label;
        /* synthetic */ java.lang.Object result;

        C08193(kotlin.coroutines.Continuation<? super kotlinx.coroutines.AwaitKt.C08193> r1) {
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
                java.lang.Object r0 = kotlinx.coroutines.AwaitKt.joinAll(r0, r1)
                return r0
        }
    }

    public static final <T> java.lang.Object awaitAll(java.util.Collection<? extends kotlinx.coroutines.Deferred<? extends T>> r5, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r6) {
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto Lb
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        Lb:
            kotlinx.coroutines.AwaitAll r0 = new kotlinx.coroutines.AwaitAll
            r1 = r5
            r2 = 0
            r3 = r1
            r4 = 0
            kotlinx.coroutines.Deferred[] r4 = new kotlinx.coroutines.Deferred[r4]
            java.lang.Object[] r4 = r3.toArray(r4)
            if (r4 == 0) goto L24
            kotlinx.coroutines.Deferred[] r4 = (kotlinx.coroutines.Deferred[]) r4
            r0.<init>(r4)
            java.lang.Object r0 = r0.await(r6)
            return r0
        L24:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>"
            r0.<init>(r4)
            throw r0
    }

    public static final <T> java.lang.Object awaitAll(kotlinx.coroutines.Deferred<? extends T>[] r1, kotlin.coroutines.Continuation<? super java.util.List<? extends T>> r2) {
            int r0 = r1.length
            if (r0 != 0) goto L5
            r0 = 1
            goto L6
        L5:
            r0 = 0
        L6:
            if (r0 == 0) goto Ld
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            return r0
        Ld:
            kotlinx.coroutines.AwaitAll r0 = new kotlinx.coroutines.AwaitAll
            r0.<init>(r1)
            java.lang.Object r0 = r0.await(r2)
            return r0
    }

    public static final java.lang.Object joinAll(java.util.Collection<? extends kotlinx.coroutines.Job> r6, kotlin.coroutines.Continuation<? super kotlin.Unit> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.AwaitKt.C08193
            if (r0 == 0) goto L14
            r0 = r7
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = (kotlinx.coroutines.AwaitKt.C08193) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r7 = r0.label
            int r7 = r7 - r2
            r0.label = r7
            goto L19
        L14:
            kotlinx.coroutines.AwaitKt$joinAll$3 r0 = new kotlinx.coroutines.AwaitKt$joinAll$3
            r0.<init>(r7)
        L19:
            r7 = r0
            java.lang.Object r0 = r7.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r7.label
            switch(r2) {
                case 0: goto L37;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2d:
            r6 = 0
            r2 = 0
            java.lang.Object r3 = r7.L$0
            java.util.Iterator r3 = (java.util.Iterator) r3
            kotlin.ResultKt.throwOnFailure(r0)
            goto L42
        L37:
            kotlin.ResultKt.throwOnFailure(r0)
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r2 = 0
            java.util.Iterator r3 = r6.iterator()
            r6 = r2
        L42:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L5d
            java.lang.Object r2 = r3.next()
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            r4 = 0
            r7.L$0 = r3
            r5 = 1
            r7.label = r5
            java.lang.Object r2 = r2.join(r7)
            if (r2 != r1) goto L5b
            return r1
        L5b:
            r2 = r4
            goto L42
        L5d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }

    public static final java.lang.Object joinAll(kotlinx.coroutines.Job[] r8, kotlin.coroutines.Continuation<? super kotlin.Unit> r9) {
            boolean r0 = r9 instanceof kotlinx.coroutines.AwaitKt.C08181
            if (r0 == 0) goto L14
            r0 = r9
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = (kotlinx.coroutines.AwaitKt.C08181) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            kotlinx.coroutines.AwaitKt$joinAll$1 r0 = new kotlinx.coroutines.AwaitKt$joinAll$1
            r0.<init>(r9)
        L19:
            r9 = r0
            java.lang.Object r0 = r9.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r9.label
            switch(r2) {
                case 0: goto L3b;
                case 1: goto L2d;
                default: goto L25;
            }
        L25:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L2d:
            r8 = 0
            r2 = 0
            int r3 = r9.I$1
            int r4 = r9.I$0
            java.lang.Object r5 = r9.L$0
            kotlinx.coroutines.Job[] r5 = (kotlinx.coroutines.Job[]) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L43
        L3b:
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = 0
            int r3 = r8.length
            r4 = 0
            r5 = r8
            r8 = r2
        L43:
            if (r4 >= r3) goto L5c
            r2 = r5[r4]
            int r4 = r4 + 1
            r6 = 0
            r9.L$0 = r5
            r9.I$0 = r4
            r9.I$1 = r3
            r7 = 1
            r9.label = r7
            java.lang.Object r2 = r2.join(r9)
            if (r2 != r1) goto L5a
            return r1
        L5a:
            r2 = r6
            goto L43
        L5c:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
            return r8
    }
}
