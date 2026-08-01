package okio.internal;

/* JADX INFO: renamed from: okio.internal.-FileSystem$commonDeleteRecursively$sequence$1, reason: invalid class name */
/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, m115d2 = {"<anonymous>", "", "Lkotlin/sequences/SequenceScope;", "Lokio/Path;"}, m116k = 3, m117mv = {1, 9, 0}, m119xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "okio.internal.-FileSystem$commonDeleteRecursively$sequence$1", m125f = "FileSystem.kt", m126i = {}, m127l = {75}, m128m = "invokeSuspend", m129n = {}, m130s = {})
final class FileSystem$commonDeleteRecursively$sequence$1 extends kotlin.coroutines.jvm.internal.RestrictedSuspendLambda implements kotlin.jvm.functions.Function2<kotlin.sequences.SequenceScope<? super okio.Path>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ okio.Path $fileOrDirectory;
    final /* synthetic */ okio.FileSystem $this_commonDeleteRecursively;
    private /* synthetic */ java.lang.Object L$0;
    int label;

    FileSystem$commonDeleteRecursively$sequence$1(okio.FileSystem r2, okio.Path r3, kotlin.coroutines.Continuation<? super okio.internal.FileSystem$commonDeleteRecursively$sequence$1> r4) {
            r1 = this;
            r1.$this_commonDeleteRecursively = r2
            r1.$fileOrDirectory = r3
            r0 = 2
            r1.<init>(r0, r4)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r0 = new okio.internal.-FileSystem$commonDeleteRecursively$sequence$1
            okio.FileSystem r1 = r3.$this_commonDeleteRecursively
            okio.Path r2 = r3.$fileOrDirectory
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
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
            okio.internal.-FileSystem$commonDeleteRecursively$sequence$1 r0 = (okio.internal.FileSystem$commonDeleteRecursively$sequence$1) r0
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            java.lang.Object r0 = r0.invokeSuspend(r1)
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.label
            switch(r1) {
                case 0: goto L16;
                case 1: goto L11;
                default: goto L9;
            }
        L9:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L11:
            r0 = r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L3a
        L16:
            kotlin.ResultKt.throwOnFailure(r11)
            r1 = r10
            java.lang.Object r2 = r1.L$0
            r3 = r2
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            okio.FileSystem r4 = r1.$this_commonDeleteRecursively
            kotlin.collections.ArrayDeque r5 = new kotlin.collections.ArrayDeque
            r5.<init>()
            okio.Path r6 = r1.$fileOrDirectory
            r9 = r1
            kotlin.coroutines.Continuation r9 = (kotlin.coroutines.Continuation) r9
            r2 = 1
            r1.label = r2
            r7 = 0
            r8 = 1
            java.lang.Object r2 = okio.internal.FileSystem.collectRecursively(r3, r4, r5, r6, r7, r8, r9)
            if (r2 != r0) goto L39
            return r0
        L39:
            r0 = r1
        L3a:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
    }
}
