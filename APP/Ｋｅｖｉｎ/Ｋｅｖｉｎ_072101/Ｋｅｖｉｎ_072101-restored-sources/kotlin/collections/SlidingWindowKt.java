package kotlin.collections;

/* JADX INFO: compiled from: SlidingWindow.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u001aH\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u0006\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\b0\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000\u001aD\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\b0\u00070\u000e\"\u0004\b\u0000\u0010\b*\b\u0012\u0004\u0012\u0002H\b0\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0000¨\u0006\u000f"}, m115d2 = {"checkWindowSizeStep", "", "size", "", "step", "windowedIterator", "", "", "T", "iterator", "partialWindows", "", "reuseBuffer", "windowedSequence", "Lkotlin/sequences/Sequence;", "kotlin-stdlib"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class SlidingWindowKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlin.collections.SlidingWindowKt$windowedIterator$1 */
    /* JADX INFO: compiled from: SlidingWindow.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H\u008a@"}, m115d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, m116k = 3, m117mv = {1, 9, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", m125f = "SlidingWindow.kt", m126i = {0, 0, 0, 2, 2, 3, 3}, m127l = {34, 40, 49, 55, 58}, m128m = "invokeSuspend", m129n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, m130s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
    static final class C07191<T> extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super java.util.List<? extends T>>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ java.util.Iterator<T> $iterator;
        final /* synthetic */ boolean $partialWindows;
        final /* synthetic */ boolean $reuseBuffer;
        final /* synthetic */ int $size;
        final /* synthetic */ int $step;
        int I$0;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C07191(int r2, int r3, java.util.Iterator<? extends T> r4, boolean r5, boolean r6, kotlin.coroutines.Continuation<? super kotlin.collections.SlidingWindowKt.C07191> r7) {
                r1 = this;
                r1.$size = r2
                r1.$step = r3
                r1.$iterator = r4
                r1.$reuseBuffer = r5
                r1.$partialWindows = r6
                r0 = 2
                r1.<init>(r0, r7)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r9, kotlin.coroutines.Continuation<?> r10) {
                r8 = this;
                kotlin.collections.SlidingWindowKt$windowedIterator$1 r7 = new kotlin.collections.SlidingWindowKt$windowedIterator$1
                int r1 = r8.$size
                int r2 = r8.$step
                java.util.Iterator<T> r3 = r8.$iterator
                boolean r4 = r8.$reuseBuffer
                boolean r5 = r8.$partialWindows
                r0 = r7
                r6 = r10
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r7.L$0 = r9
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                return r7
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke(r2, r3)
                return r0
        }

        public final java.lang.Object invoke(kotlin.sequences.SequenceScope<? super java.util.List<? extends T>> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                kotlin.collections.SlidingWindowKt$windowedIterator$1 r0 = (kotlin.collections.SlidingWindowKt.C07191) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                r2 = 0
                switch(r1) {
                    case 0: goto L58;
                    case 1: goto L41;
                    case 2: goto L3b;
                    case 3: goto L29;
                    case 4: goto L18;
                    case 5: goto L12;
                    default: goto La;
                }
            La:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L12:
                r0 = r12
                kotlin.ResultKt.throwOnFailure(r13)
                goto L19a
            L18:
                r1 = r12
                java.lang.Object r3 = r1.L$1
                kotlin.collections.RingBuffer r3 = (kotlin.collections.RingBuffer) r3
                java.lang.Object r4 = r1.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r13)
                r10 = r1
                r1 = r0
                r0 = r10
                goto L178
            L29:
                r1 = r12
                java.lang.Object r3 = r1.L$2
                java.util.Iterator r3 = (java.util.Iterator) r3
                java.lang.Object r4 = r1.L$1
                kotlin.collections.RingBuffer r4 = (kotlin.collections.RingBuffer) r4
                java.lang.Object r5 = r1.L$0
                kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
                kotlin.ResultKt.throwOnFailure(r13)
                goto L13c
            L3b:
                r0 = r12
                kotlin.ResultKt.throwOnFailure(r13)
                goto Le8
            L41:
                r1 = r12
                int r3 = r1.I$0
                java.lang.Object r4 = r1.L$2
                java.util.Iterator r4 = (java.util.Iterator) r4
                java.lang.Object r5 = r1.L$1
                java.util.ArrayList r5 = (java.util.ArrayList) r5
                java.lang.Object r6 = r1.L$0
                kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
                kotlin.ResultKt.throwOnFailure(r13)
                r7 = r6
                r10 = r1
                r1 = r0
                r0 = r10
                goto Laf
            L58:
                kotlin.ResultKt.throwOnFailure(r13)
                r1 = r12
                java.lang.Object r3 = r1.L$0
                kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
                int r4 = r1.$size
                r5 = 1024(0x400, float:1.435E-42)
                int r4 = kotlin.ranges.RangesKt.coerceAtMost(r4, r5)
                int r5 = r1.$step
                int r6 = r1.$size
                int r5 = r5 - r6
                if (r5 < 0) goto Lea
                java.util.ArrayList r6 = new java.util.ArrayList
                r6.<init>(r4)
                r4 = r6
                r6 = 0
                java.util.Iterator<T> r7 = r1.$iterator
                r10 = r1
                r1 = r0
                r0 = r10
                r11 = r7
                r7 = r3
                r3 = r5
                r5 = r4
                r4 = r11
            L80:
                boolean r8 = r4.hasNext()
                if (r8 == 0) goto Lc0
                java.lang.Object r8 = r4.next()
                if (r6 <= 0) goto L8f
                int r6 = r6 + (-1)
                goto L80
            L8f:
                r5.add(r8)
                int r8 = r5.size()
                int r9 = r0.$size
                if (r8 != r9) goto L80
                r6 = r0
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r0.L$0 = r7
                r0.L$1 = r5
                r0.L$2 = r4
                r0.I$0 = r3
                r8 = 1
                r0.label = r8
                java.lang.Object r6 = r7.yield(r5, r6)
                if (r6 != r1) goto Laf
                return r1
            Laf:
                boolean r6 = r0.$reuseBuffer
                if (r6 == 0) goto Lb7
                r5.clear()
                goto Lbe
            Lb7:
                java.util.ArrayList r5 = new java.util.ArrayList
                int r6 = r0.$size
                r5.<init>(r6)
            Lbe:
                r6 = r3
                goto L80
            Lc0:
                r3 = r5
                java.util.Collection r3 = (java.util.Collection) r3
                boolean r3 = r3.isEmpty()
                if (r3 != 0) goto L19c
                boolean r3 = r0.$partialWindows
                if (r3 != 0) goto Ld5
                int r3 = r5.size()
                int r4 = r0.$size
                if (r3 != r4) goto L19c
            Ld5:
                r3 = r0
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                r0.L$0 = r2
                r0.L$1 = r2
                r0.L$2 = r2
                r2 = 2
                r0.label = r2
                java.lang.Object r2 = r7.yield(r5, r3)
                if (r2 != r1) goto Le8
                return r1
            Le8:
                goto L19c
            Lea:
                kotlin.collections.RingBuffer r5 = new kotlin.collections.RingBuffer
                r5.<init>(r4)
                r4 = r5
                java.util.Iterator<T> r5 = r1.$iterator
                r10 = r5
                r5 = r3
                r3 = r10
            Lf5:
                boolean r6 = r3.hasNext()
                if (r6 == 0) goto L142
                java.lang.Object r6 = r3.next()
                r4.add(r6)
                boolean r6 = r4.isFull()
                if (r6 == 0) goto Lf5
                int r6 = r4.size()
                int r7 = r1.$size
                if (r6 >= r7) goto L117
                int r6 = r1.$size
                kotlin.collections.RingBuffer r4 = r4.expanded(r6)
                goto Lf5
            L117:
                boolean r6 = r1.$reuseBuffer
                if (r6 == 0) goto L11f
                r6 = r4
                java.util.List r6 = (java.util.List) r6
                goto L129
            L11f:
                java.util.ArrayList r6 = new java.util.ArrayList
                r7 = r4
                java.util.Collection r7 = (java.util.Collection) r7
                r6.<init>(r7)
                java.util.List r6 = (java.util.List) r6
            L129:
                r7 = r1
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r1.L$0 = r5
                r1.L$1 = r4
                r1.L$2 = r3
                r8 = 3
                r1.label = r8
                java.lang.Object r6 = r5.yield(r6, r7)
                if (r6 != r0) goto L13c
                return r0
            L13c:
                int r6 = r1.$step
                r4.removeFirst(r6)
                goto Lf5
            L142:
                boolean r3 = r1.$partialWindows
                if (r3 == 0) goto L19b
                r3 = r4
                r4 = r5
                r10 = r1
                r1 = r0
                r0 = r10
            L14b:
                int r5 = r3.size()
                int r6 = r0.$step
                if (r5 <= r6) goto L17e
                boolean r5 = r0.$reuseBuffer
                if (r5 == 0) goto L15b
                r5 = r3
                java.util.List r5 = (java.util.List) r5
                goto L165
            L15b:
                java.util.ArrayList r5 = new java.util.ArrayList
                r6 = r3
                java.util.Collection r6 = (java.util.Collection) r6
                r5.<init>(r6)
                java.util.List r5 = (java.util.List) r5
            L165:
                r6 = r0
                kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
                r0.L$0 = r4
                r0.L$1 = r3
                r0.L$2 = r2
                r7 = 4
                r0.label = r7
                java.lang.Object r5 = r4.yield(r5, r6)
                if (r5 != r1) goto L178
                return r1
            L178:
                int r5 = r0.$step
                r3.removeFirst(r5)
                goto L14b
            L17e:
                r5 = r3
                java.util.Collection r5 = (java.util.Collection) r5
                boolean r5 = r5.isEmpty()
                if (r5 != 0) goto L19c
                r5 = r0
                kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
                r0.L$0 = r2
                r0.L$1 = r2
                r0.L$2 = r2
                r2 = 5
                r0.label = r2
                java.lang.Object r2 = r4.yield(r3, r5)
                if (r2 != r1) goto L19a
                return r1
            L19a:
                goto L19c
            L19b:
                r0 = r1
            L19c:
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                return r1
        }
    }

    public static final void checkWindowSizeStep(int r4, int r5) {
            if (r4 <= 0) goto L6
            if (r5 <= 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 != 0) goto L52
            r0 = 0
            java.lang.String r1 = " must be greater than zero."
            if (r4 == r5) goto L30
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Both size "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r3 = " and step "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
            goto L47
        L30:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "size "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.StringBuilder r1 = r2.append(r1)
            java.lang.String r1 = r1.toString()
        L47:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L52:
            return
    }

    public static final <T> java.util.Iterator<java.util.List<T>> windowedIterator(java.util.Iterator<? extends T> r8, int r9, int r10, boolean r11, boolean r12) {
            java.lang.String r0 = "iterator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            boolean r0 = r8.hasNext()
            if (r0 != 0) goto L10
            kotlin.collections.EmptyIterator r0 = kotlin.collections.EmptyIterator.INSTANCE
            java.util.Iterator r0 = (java.util.Iterator) r0
            return r0
        L10:
            kotlin.collections.SlidingWindowKt$windowedIterator$1 r0 = new kotlin.collections.SlidingWindowKt$windowedIterator$1
            r7 = 0
            r1 = r0
            r2 = r9
            r3 = r10
            r4 = r8
            r5 = r12
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            java.util.Iterator r0 = kotlin.sequences.SequencesKt.iterator(r0)
            return r0
    }

    public static final <T> kotlin.sequences.Sequence<java.util.List<T>> windowedSequence(kotlin.sequences.Sequence<? extends T> r7, int r8, int r9, boolean r10, boolean r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            checkWindowSizeStep(r8, r9)
            kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1 r0 = new kotlin.collections.SlidingWindowKt$windowedSequence$$inlined$Sequence$1
            r1 = r0
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            kotlin.sequences.Sequence r0 = (kotlin.sequences.Sequence) r0
            return r0
    }
}
