package okio.internal;

/* JADX INFO: renamed from: okio.internal.-FileSystem, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00072\u0006\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\f\u001a\u001c\u0010\r\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\nH\u0000\u001a\u001c\u0010\u0013\u001a\u00020\u0001*\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0016\u001a\u00020\n*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\"\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0018*\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0019\u001a\u00020\u001a*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u001a\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u0003*\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m115d2 = {"collectRecursively", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;", "fileSystem", "Lokio/FileSystem;", "stack", "Lkotlin/collections/ArrayDeque;", "path", "followSymlinks", "", "postorder", "(Lkotlin/sequences/SequenceScope;Lokio/FileSystem;Lkotlin/collections/ArrayDeque;Lokio/Path;ZZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commonCopy", "source", "target", "commonCreateDirectories", "dir", "mustCreate", "commonDeleteRecursively", "fileOrDirectory", "mustExist", "commonExists", "commonListRecursively", "Lkotlin/sequences/Sequence;", "commonMetadata", "Lokio/FileMetadata;", "symlinkTarget", "okio"}, m116k = 2, m117mv = {1, 9, 0}, m119xi = 48)
public final class FileSystem {

    /* JADX INFO: renamed from: okio.internal.-FileSystem$collectRecursively$1 */
    /* JADX INFO: compiled from: FileSystem.kt */
    @kotlin.Metadata(m116k = 3, m117mv = {1, 9, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "okio.internal.-FileSystem", m125f = "FileSystem.kt", m126i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m127l = {116, 135, 145}, m128m = "collectRecursively", m129n = {"$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder", "$this$collectRecursively", "fileSystem", "stack", "path", "followSymlinks", "postorder"}, m130s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1", "L$0", "L$1", "L$2", "L$3", "Z$0", "Z$1"})
    static final class C10531 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        java.lang.Object L$3;
        java.lang.Object L$4;
        boolean Z$0;
        boolean Z$1;
        int label;
        /* synthetic */ java.lang.Object result;

        C10531(kotlin.coroutines.Continuation<? super okio.internal.FileSystem.C10531> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
                r8 = this;
                r8.result = r9
                int r0 = r8.label
                r1 = -2147483648(0xffffffff80000000, float:-0.0)
                r0 = r0 | r1
                r8.label = r0
                r6 = 0
                r7 = r8
                kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
                r1 = 0
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                java.lang.Object r0 = okio.internal.FileSystem.collectRecursively(r1, r2, r3, r4, r5, r6, r7)
                return r0
        }
    }

    /* JADX INFO: renamed from: okio.internal.-FileSystem$commonListRecursively$1 */
    /* JADX INFO: compiled from: FileSystem.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m115d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, m116k = 3, m117mv = {1, 9, 0}, m119xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "okio.internal.-FileSystem$commonListRecursively$1", m125f = "FileSystem.kt", m126i = {0, 0}, m127l = {96}, m128m = "invokeSuspend", m129n = {"$this$sequence", "stack"}, m130s = {"L$0", "L$1"})
    static final class C10541 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super okio.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ okio.Path $dir;
        final /* synthetic */ boolean $followSymlinks;
        final /* synthetic */ okio.FileSystem $this_commonListRecursively;
        private /* synthetic */ java.lang.Object L$0;
        java.lang.Object L$1;
        java.lang.Object L$2;
        int label;

        C10541(okio.Path r2, okio.FileSystem r3, boolean r4, kotlin.coroutines.Continuation<? super okio.internal.FileSystem.C10541> r5) {
                r1 = this;
                r1.$dir = r2
                r1.$this_commonListRecursively = r3
                r1.$followSymlinks = r4
                r0 = 2
                r1.<init>(r0, r5)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r5, kotlin.coroutines.Continuation<?> r6) {
                r4 = this;
                okio.internal.-FileSystem$commonListRecursively$1 r0 = new okio.internal.-FileSystem$commonListRecursively$1
                okio.Path r1 = r4.$dir
                okio.FileSystem r2 = r4.$this_commonListRecursively
                boolean r3 = r4.$followSymlinks
                r0.<init>(r1, r2, r3, r6)
                r0.L$0 = r5
                kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlin.sequences.SequenceScope<? super okio.Path> r2, kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
                java.lang.Object r0 = r1.invoke2(r2, r3)
                return r0
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(kotlin.sequences.SequenceScope<? super okio.Path> r3, kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.coroutines.Continuation r0 = r2.create(r3, r4)
                okio.internal.-FileSystem$commonListRecursively$1 r0 = (okio.internal.FileSystem.C10541) r0
                kotlin.Unit r1 = kotlin.Unit.INSTANCE
                java.lang.Object r0 = r0.invokeSuspend(r1)
                return r0
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r12.label
                switch(r1) {
                    case 0: goto L24;
                    case 1: goto L11;
                    default: goto L9;
                }
            L9:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L11:
                r1 = r12
                java.lang.Object r2 = r1.L$2
                java.util.Iterator r2 = (java.util.Iterator) r2
                java.lang.Object r3 = r1.L$1
                kotlin.collections.ArrayDeque r3 = (kotlin.collections.ArrayDeque) r3
                java.lang.Object r4 = r1.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                kotlin.ResultKt.throwOnFailure(r13)
                r10 = r3
                r11 = r4
                goto L6f
            L24:
                kotlin.ResultKt.throwOnFailure(r13)
                r1 = r12
                java.lang.Object r2 = r1.L$0
                kotlin.sequences.SequenceScope r2 = (kotlin.sequences.SequenceScope) r2
                kotlin.collections.ArrayDeque r3 = new kotlin.collections.ArrayDeque
                r3.<init>()
                okio.Path r4 = r1.$dir
                r3.addLast(r4)
                okio.FileSystem r4 = r1.$this_commonListRecursively
                okio.Path r5 = r1.$dir
                java.util.List r4 = r4.list(r5)
                java.util.Iterator r4 = r4.iterator()
                r11 = r2
                r10 = r3
                r2 = r4
            L45:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L70
                java.lang.Object r3 = r2.next()
                r6 = r3
                okio.Path r6 = (okio.Path) r6
                okio.FileSystem r4 = r1.$this_commonListRecursively
                boolean r7 = r1.$followSymlinks
                r9 = r1
                kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
                r1.L$0 = r11
                r1.L$1 = r10
                r1.L$2 = r2
                r3 = 1
                r1.label = r3
                r8 = 0
                r3 = r11
                r5 = r10
                java.lang.Object r3 = okio.internal.FileSystem.collectRecursively(r3, r4, r5, r6, r7, r8, r9)
                if (r3 != r0) goto L6f
                return r0
            L6f:
                goto L45
            L70:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }
    }

    public static final java.lang.Object collectRecursively(kotlin.sequences.SequenceScope<? super okio.Path> r14, okio.FileSystem r15, kotlin.collections.ArrayDeque<okio.Path> r16, okio.Path r17, boolean r18, boolean r19, kotlin.coroutines.Continuation<? super kotlin.Unit> r20) {
            r0 = r20
            boolean r1 = r0 instanceof okio.internal.FileSystem.C10531
            if (r1 == 0) goto L16
            r1 = r0
            okio.internal.-FileSystem$collectRecursively$1 r1 = (okio.internal.FileSystem.C10531) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 & r3
            if (r2 == 0) goto L16
            int r0 = r1.label
            int r0 = r0 - r3
            r1.label = r0
            goto L1b
        L16:
            okio.internal.-FileSystem$collectRecursively$1 r1 = new okio.internal.-FileSystem$collectRecursively$1
            r1.<init>(r0)
        L1b:
            r0 = r1
            java.lang.Object r2 = r1.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r1.label
            r4 = 1
            switch(r3) {
                case 0: goto L6d;
                case 1: goto L55;
                case 2: goto L35;
                case 3: goto L30;
                default: goto L28;
            }
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L30:
            kotlin.ResultKt.throwOnFailure(r2)
            goto L143
        L35:
            boolean r3 = r1.Z$1
            boolean r5 = r1.Z$0
            java.lang.Object r6 = r1.L$4
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r1.L$3
            okio.Path r7 = (okio.Path) r7
            java.lang.Object r8 = r1.L$2
            kotlin.collections.ArrayDeque r8 = (kotlin.collections.ArrayDeque) r8
            java.lang.Object r9 = r1.L$1
            okio.FileSystem r9 = (okio.FileSystem) r9
            java.lang.Object r10 = r1.L$0
            kotlin.sequences.SequenceScope r10 = (kotlin.sequences.SequenceScope) r10
            kotlin.ResultKt.throwOnFailure(r2)     // Catch: java.lang.Throwable -> L52
            goto L11a
        L52:
            r0 = move-exception
            goto L123
        L55:
            boolean r3 = r1.Z$1
            boolean r5 = r1.Z$0
            java.lang.Object r6 = r1.L$3
            okio.Path r6 = (okio.Path) r6
            java.lang.Object r7 = r1.L$2
            kotlin.collections.ArrayDeque r7 = (kotlin.collections.ArrayDeque) r7
            java.lang.Object r8 = r1.L$1
            okio.FileSystem r8 = (okio.FileSystem) r8
            java.lang.Object r9 = r1.L$0
            kotlin.sequences.SequenceScope r9 = (kotlin.sequences.SequenceScope) r9
            kotlin.ResultKt.throwOnFailure(r2)
            goto L91
        L6d:
            kotlin.ResultKt.throwOnFailure(r2)
            r9 = r14
            r7 = r16
            r5 = r18
            r8 = r15
            r6 = r17
            r3 = r19
            if (r3 != 0) goto L92
            r1.L$0 = r9
            r1.L$1 = r8
            r1.L$2 = r7
            r1.L$3 = r6
            r1.Z$0 = r5
            r1.Z$1 = r3
            r1.label = r4
            java.lang.Object r10 = r9.yield(r6, r1)
            if (r10 != r0) goto L91
            return r0
        L91:
        L92:
            java.util.List r10 = r8.listOrNull(r6)
            if (r10 != 0) goto L9c
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
        L9c:
            r11 = r10
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 != 0) goto L12c
            r11 = r6
            r12 = 0
        La7:
            if (r5 == 0) goto Lca
            boolean r13 = r7.contains(r11)
            if (r13 != 0) goto Lb1
            goto Lca
        Lb1:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r13 = "symlink cycle at "
            java.lang.StringBuilder r4 = r4.append(r13)
            java.lang.StringBuilder r4 = r4.append(r6)
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        Lca:
            okio.Path r13 = symlinkTarget(r8, r11)
            if (r13 != 0) goto L127
            if (r5 != 0) goto Ld4
            if (r12 != 0) goto L12c
        Ld4:
            r7.addLast(r11)
            java.util.Iterator r11 = r10.iterator()     // Catch: java.lang.Throwable -> L121
            r10 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r11
        Le1:
            boolean r11 = r6.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r11 == 0) goto L11b
            java.lang.Object r11 = r6.next()     // Catch: java.lang.Throwable -> L52
            okio.Path r11 = (okio.Path) r11     // Catch: java.lang.Throwable -> L52
            r17 = r11
            r11 = 0
            if (r5 == 0) goto Lf4
            r12 = r4
            goto Lf5
        Lf4:
            r12 = r11
        Lf5:
            if (r3 == 0) goto Lf8
            r11 = r4
        Lf8:
            r1.L$0 = r10     // Catch: java.lang.Throwable -> L52
            r1.L$1 = r9     // Catch: java.lang.Throwable -> L52
            r1.L$2 = r8     // Catch: java.lang.Throwable -> L52
            r1.L$3 = r7     // Catch: java.lang.Throwable -> L52
            r1.L$4 = r6     // Catch: java.lang.Throwable -> L52
            r1.Z$0 = r5     // Catch: java.lang.Throwable -> L52
            r1.Z$1 = r3     // Catch: java.lang.Throwable -> L52
            r13 = 2
            r1.label = r13     // Catch: java.lang.Throwable -> L52
            r14 = r10
            r15 = r9
            r16 = r8
            r18 = r12
            r19 = r11
            r20 = r1
            java.lang.Object r11 = collectRecursively(r14, r15, r16, r17, r18, r19, r20)     // Catch: java.lang.Throwable -> L52
            if (r11 != r0) goto L11a
            return r0
        L11a:
            goto Le1
        L11b:
            r8.removeLast()
            r6 = r7
            r9 = r10
            goto L12c
        L121:
            r0 = move-exception
            r8 = r7
        L123:
            r8.removeLast()
            throw r0
        L127:
            r11 = r13
            int r12 = r12 + 1
            goto La7
        L12c:
            if (r3 == 0) goto L146
            r3 = 0
            r1.L$0 = r3
            r1.L$1 = r3
            r1.L$2 = r3
            r1.L$3 = r3
            r1.L$4 = r3
            r3 = 3
            r1.label = r3
            java.lang.Object r3 = r9.yield(r6, r1)
            if (r3 != r0) goto L143
            return r0
        L143:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L146:
            goto L143
    }

    public static final void commonCopy(okio.FileSystem r17, okio.Path r18, okio.Path r19) throws java.io.IOException {
            r1 = r17
            r2 = r19
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "source"
            r3 = r18
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.Source r0 = r17.source(r18)
            r4 = r0
            java.io.Closeable r4 = (java.io.Closeable) r4
            r5 = 0
            r6 = 0
            r7 = 0
            r0 = r4
            okio.Source r0 = (okio.Source) r0     // Catch: java.lang.Throwable -> L7f
            r8 = r0
            r9 = 0
            okio.Sink r0 = r1.sink(r2)     // Catch: java.lang.Throwable -> L7f
            okio.BufferedSink r0 = okio.Okio.buffer(r0)     // Catch: java.lang.Throwable -> L7f
            java.io.Closeable r0 = (java.io.Closeable) r0     // Catch: java.lang.Throwable -> L7f
            r10 = r0
            r11 = 0
            r12 = 0
            r13 = 0
            r0 = r10
            okio.BufferedSink r0 = (okio.BufferedSink) r0     // Catch: java.lang.Throwable -> L4e
            r14 = 0
            long r15 = r0.writeAll(r8)     // Catch: java.lang.Throwable -> L4e
            java.lang.Long r0 = java.lang.Long.valueOf(r15)     // Catch: java.lang.Throwable -> L4e
            r12 = r0
            if (r10 == 0) goto L5e
            r10.close()     // Catch: java.lang.Throwable -> L48
            goto L5e
        L48:
            r0 = move-exception
            r14 = r0
            r0 = r14
            r13 = r0
            goto L5e
        L4e:
            r0 = move-exception
            r13 = r0
            if (r10 == 0) goto L5e
            r10.close()     // Catch: java.lang.Throwable -> L57
            goto L5e
        L57:
            r0 = move-exception
            r14 = r0
            r0 = r14
            kotlin.ExceptionsKt.addSuppressed(r13, r0)     // Catch: java.lang.Throwable -> L7f
        L5e:
            if (r13 != 0) goto L7e
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12)     // Catch: java.lang.Throwable -> L7f
            r0 = r12
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L7f
            long r10 = r0.longValue()     // Catch: java.lang.Throwable -> L7f
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Throwable -> L7f
            r6 = r0
            if (r4 == 0) goto L8f
            r4.close()     // Catch: java.lang.Throwable -> L78
            goto L8f
        L78:
            r0 = move-exception
            r8 = r0
            r0 = r8
            r7 = r0
            goto L8f
        L7e:
            throw r13     // Catch: java.lang.Throwable -> L7f
        L7f:
            r0 = move-exception
            r7 = r0
            if (r4 == 0) goto L8f
            r4.close()     // Catch: java.lang.Throwable -> L88
            goto L8f
        L88:
            r0 = move-exception
            r8 = r0
            r0 = r8
            kotlin.ExceptionsKt.addSuppressed(r7, r0)
        L8f:
            if (r7 != 0) goto L96
            kotlin.jvm.internal.Intrinsics.checkNotNull(r6)
            return
        L96:
            throw r7
    }

    public static final void commonCreateDirectories(okio.FileSystem r5, okio.Path r6, boolean r7) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            kotlin.collections.ArrayDeque r0 = new kotlin.collections.ArrayDeque
            r0.<init>()
            r1 = r6
        L10:
            if (r1 == 0) goto L20
            boolean r2 = r5.exists(r1)
            if (r2 != 0) goto L20
            r0.addFirst(r1)
            okio.Path r1 = r1.parent()
            goto L10
        L20:
            if (r7 == 0) goto L42
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L29
            goto L42
        L29:
            java.io.IOException r2 = new java.io.IOException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r6)
            java.lang.String r4 = " already exists."
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L42:
            java.util.Iterator r2 = r0.iterator()
        L46:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r2.next()
            okio.Path r3 = (okio.Path) r3
            r5.createDirectory(r3)
            goto L46
        L56:
            return
    }

    public static final void commonDeleteRecursively(okio.FileSystem r4, okio.Path r5, boolean r6) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "fileOrDirectory"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r0 = new okio.internal.-FileSystem$commonDeleteRecursively$sequence$1
            r1 = 0
            r0.<init>(r4, r5, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequence(r0)
            java.util.Iterator r1 = r0.iterator()
        L1a:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            okio.Path r2 = (okio.Path) r2
            if (r6 == 0) goto L30
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L30
            r3 = 1
            goto L31
        L30:
            r3 = 0
        L31:
            r4.delete(r2, r3)
            goto L1a
        L35:
            return
    }

    public static final boolean commonExists(okio.FileSystem r1, okio.Path r2) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            okio.FileMetadata r0 = r1.metadataOrNull(r2)
            if (r0 == 0) goto L12
            r0 = 1
            goto L13
        L12:
            r0 = 0
        L13:
            return r0
    }

    public static final kotlin.sequences.Sequence<okio.Path> commonListRecursively(okio.FileSystem r2, okio.Path r3, boolean r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "dir"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.internal.-FileSystem$commonListRecursively$1 r0 = new okio.internal.-FileSystem$commonListRecursively$1
            r1 = 0
            r0.<init>(r3, r2, r4, r1)
            kotlin.jvm.functions.Function2 r0 = (kotlin.jvm.functions.Function2) r0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.sequence(r0)
            return r0
    }

    public static final okio.FileMetadata commonMetadata(okio.FileSystem r3, okio.Path r4) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            okio.FileMetadata r0 = r3.metadataOrNull(r4)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "no such file: "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public static final okio.Path symlinkTarget(okio.FileSystem r2, okio.Path r3) throws java.io.IOException {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            okio.FileMetadata r0 = r2.metadata(r3)
            okio.Path r0 = r0.getSymlinkTarget()
            if (r0 != 0) goto L16
            r0 = 0
            return r0
        L16:
            okio.Path r1 = r3.parent()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r1)
            okio.Path r1 = r1.resolve(r0)
            return r1
    }
}
