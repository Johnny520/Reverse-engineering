package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: Select.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00020Y2\b\u0012\u0004\u0012\u00028\u00000Z2\b\u0012\u0004\u0012\u00028\u00000[2\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060Bj\u0002`C:\u0004TUVWB\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\u0011\u001a\u00020\b2\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0082\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\n\u0018\u00010\u0015j\u0004\u0018\u0001`\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\bH\u0002¢\u0006\u0004\b\u001d\u0010\fJ8\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 H\u0016ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u0004\u0018\u00010\u000e2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020\u0019H\u0016¢\u0006\u0004\b(\u0010\u001cJ \u0010+\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000)H\u0016ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u000f\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b.\u0010/J\u000f\u00101\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u001b\u00105\u001a\u0004\u0018\u00010\u000e2\b\u00104\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b5\u00106J5\u00108\u001a\u00020\b*\u0002072\u001c\u0010\u0010\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0 H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u00109JG\u00108\u001a\u00020\b\"\u0004\b\u0001\u0010:*\b\u0012\u0004\u0012\u00028\u00010;2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0<H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010=J[\u00108\u001a\u00020\b\"\u0004\b\u0001\u0010>\"\u0004\b\u0002\u0010:*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020?2\u0006\u0010@\u001a\u00028\u00012\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u000e0<H\u0096\u0002ø\u0001\u0000¢\u0006\u0004\b8\u0010AR\u001c\u0010F\u001a\n\u0018\u00010Bj\u0004\u0018\u0001`C8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010M\u001a\u00020J8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010N\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u00102R(\u0010R\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00068B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010\nR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010S\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006X"}, m115d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl;", "R", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/Continuation;)V", "Lkotlinx/coroutines/DisposableHandle;", "handle", "", "disposeOnSelect", "(Lkotlinx/coroutines/DisposableHandle;)V", "doAfterSelect", "()V", "Lkotlin/Function0;", "", "value", "block", "doResume", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "e", "handleBuilderException", "(Ljava/lang/Throwable;)V", "initCancellability", "", "timeMillis", "Lkotlin/Function1;", "onTimeout", "(JLkotlin/jvm/functions/Function1;)V", "Lkotlinx/coroutines/internal/AtomicDesc;", "desc", "performAtomicTrySelect", "(Lkotlinx/coroutines/internal/AtomicDesc;)Ljava/lang/Object;", "exception", "resumeSelectWithException", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "trySelect", "()Z", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "otherOp", "trySelectOther", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)Ljava/lang/Object;", "Lkotlinx/coroutines/selects/SelectClause0;", "invoke", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "getCompletion", "()Lkotlin/coroutines/Continuation;", "completion", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "context", "isSelected", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "setParentHandle", "parentHandle", "Lkotlin/coroutines/Continuation;", "AtomicSelectOp", "DisposeNode", "PairSelectOp", "SelectOnCancelling", "kotlinx-coroutines-core", "Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstance;"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public final class SelectBuilderImpl<R> extends kotlinx.coroutines.internal.LockFreeLinkedListHead implements kotlinx.coroutines.selects.SelectBuilder<R>, kotlinx.coroutines.selects.SelectInstance<R>, kotlin.coroutines.Continuation<R>, kotlin.coroutines.jvm.internal.CoroutineStackFrame {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _result$FU = null;
    static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _state$FU = null;
    private volatile /* synthetic */ java.lang.Object _parentHandle;
    private volatile /* synthetic */ java.lang.Object _result;
    volatile /* synthetic */ java.lang.Object _state;
    private final kotlin.coroutines.Continuation<R> uCont;

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(m114d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0019\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0016J\u0012\u0010\u0010\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002H\u0002J\u0014\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\rH\u0002R\u0010\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m115d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$AtomicSelectOp;", "Lkotlinx/coroutines/internal/AtomicOp;", "", "impl", "Lkotlinx/coroutines/selects/SelectBuilderImpl;", "desc", "Lkotlinx/coroutines/internal/AtomicDesc;", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;Lkotlinx/coroutines/internal/AtomicDesc;)V", "opSequence", "", "getOpSequence", "()J", "complete", "", "affected", "failure", "completeSelect", "prepare", "prepareSelectOp", "toString", "", "undoPrepare", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class AtomicSelectOp extends kotlinx.coroutines.internal.AtomicOp<java.lang.Object> {
        public final kotlinx.coroutines.internal.AtomicDesc desc;
        public final kotlinx.coroutines.selects.SelectBuilderImpl<?> impl;
        private final long opSequence;

        public AtomicSelectOp(kotlinx.coroutines.selects.SelectBuilderImpl<?> r3, kotlinx.coroutines.internal.AtomicDesc r4) {
                r2 = this;
                r2.<init>()
                r2.impl = r3
                r2.desc = r4
                kotlinx.coroutines.selects.SeqNumber r0 = kotlinx.coroutines.selects.SelectKt.access$getSelectOpSequenceNumber$p()
                long r0 = r0.next()
                r2.opSequence = r0
                kotlinx.coroutines.internal.AtomicDesc r0 = r2.desc
                r1 = r2
                kotlinx.coroutines.internal.AtomicOp r1 = (kotlinx.coroutines.internal.AtomicOp) r1
                r0.setAtomicOp(r1)
                return
        }

        private final void completeSelect(java.lang.Object r5) {
                r4 = this;
                if (r5 != 0) goto L4
                r0 = 1
                goto L5
            L4:
                r0 = 0
            L5:
                if (r0 == 0) goto L9
                r1 = 0
                goto Ld
            L9:
                java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            Ld:
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r2 = r4.impl
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
                boolean r2 = androidx.concurrent.futures.C0110xc40028dd.m9m(r3, r2, r4, r1)
                if (r2 == 0) goto L1e
                if (r0 == 0) goto L1e
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r2 = r4.impl
                kotlinx.coroutines.selects.SelectBuilderImpl.access$doAfterSelect(r2)
            L1e:
                return
        }

        private final java.lang.Object prepareSelectOp() {
                r8 = this;
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r0 = r8.impl
                r1 = 0
            L3:
                java.lang.Object r2 = r0._state
                r3 = 0
                r4 = 0
                if (r2 != r8) goto Lc
                return r4
            Lc:
                boolean r5 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
                if (r5 == 0) goto L19
                r4 = r2
                kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r5 = r8.impl
                r4.perform(r5)
                goto L2e
            L19:
                java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
                if (r2 != r5) goto L30
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r5 = r8.impl
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
                java.lang.Object r7 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
                boolean r5 = androidx.concurrent.futures.C0110xc40028dd.m9m(r6, r5, r7, r8)
                if (r5 == 0) goto L2e
                return r4
            L2e:
                goto L3
            L30:
                java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
                return r4
        }

        private final void undoPrepare() {
                r3 = this;
                kotlinx.coroutines.selects.SelectBuilderImpl<?> r0 = r3.impl
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
                java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
                androidx.concurrent.futures.C0110xc40028dd.m9m(r1, r0, r3, r2)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public void complete(java.lang.Object r3, java.lang.Object r4) {
                r2 = this;
                r2.completeSelect(r4)
                kotlinx.coroutines.internal.AtomicDesc r0 = r2.desc
                r1 = r2
                kotlinx.coroutines.internal.AtomicOp r1 = (kotlinx.coroutines.internal.AtomicOp) r1
                r0.complete(r1, r4)
                return
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public long getOpSequence() {
                r2 = this;
                long r0 = r2.opSequence
                return r0
        }

        @Override // kotlinx.coroutines.internal.AtomicOp
        public java.lang.Object prepare(java.lang.Object r3) {
                r2 = this;
                if (r3 != 0) goto Lc
                java.lang.Object r0 = r2.prepareSelectOp()
                if (r0 != 0) goto La
                goto Lc
            La:
                r1 = 0
                return r0
            Lc:
                kotlinx.coroutines.internal.AtomicDesc r0 = r2.desc     // Catch: java.lang.Throwable -> L17
                r1 = r2
                kotlinx.coroutines.internal.AtomicOp r1 = (kotlinx.coroutines.internal.AtomicOp) r1     // Catch: java.lang.Throwable -> L17
                java.lang.Object r0 = r0.prepare(r1)     // Catch: java.lang.Throwable -> L17
                return r0
            L17:
                r0 = move-exception
                if (r3 != 0) goto L1d
                r2.undoPrepare()
            L1d:
                throw r0
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public java.lang.String toString() {
                r3 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "AtomicSelectOp(sequence="
                java.lang.StringBuilder r0 = r0.append(r1)
                long r1 = r3.getOpSequence()
                java.lang.StringBuilder r0 = r0.append(r1)
                r1 = 41
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m115d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$DisposeNode;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "handle", "Lkotlinx/coroutines/DisposableHandle;", "(Lkotlinx/coroutines/DisposableHandle;)V", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class DisposeNode extends kotlinx.coroutines.internal.LockFreeLinkedListNode {
        public final kotlinx.coroutines.DisposableHandle handle;

        public DisposeNode(kotlinx.coroutines.DisposableHandle r1) {
                r0 = this;
                r0.<init>()
                r0.handle = r1
                return
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m115d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$PairSelectOp;", "Lkotlinx/coroutines/internal/OpDescriptor;", "otherOp", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;", "(Lkotlinx/coroutines/internal/LockFreeLinkedListNode$PrepareOp;)V", "atomicOp", "Lkotlinx/coroutines/internal/AtomicOp;", "getAtomicOp", "()Lkotlinx/coroutines/internal/AtomicOp;", "perform", "", "affected", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private static final class PairSelectOp extends kotlinx.coroutines.internal.OpDescriptor {
        public final kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp otherOp;

        public PairSelectOp(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r1) {
                r0 = this;
                r0.<init>()
                r0.otherOp = r1
                return
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public kotlinx.coroutines.internal.AtomicOp<?> getAtomicOp() {
                r1 = this;
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r0 = r1.otherOp
                kotlinx.coroutines.internal.AtomicOp r0 = r0.getAtomicOp()
                return r0
        }

        @Override // kotlinx.coroutines.internal.OpDescriptor
        public java.lang.Object perform(java.lang.Object r5) {
                r4 = this;
                if (r5 == 0) goto L26
                r0 = r5
                kotlinx.coroutines.selects.SelectBuilderImpl r0 = (kotlinx.coroutines.selects.SelectBuilderImpl) r0
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r1 = r4.otherOp
                r1.finishPrepare()
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r1 = r4.otherOp
                kotlinx.coroutines.internal.AtomicOp r1 = r1.getAtomicOp()
                r2 = 0
                java.lang.Object r1 = r1.decide(r2)
                if (r1 != 0) goto L1c
                kotlinx.coroutines.internal.LockFreeLinkedListNode$PrepareOp r2 = r4.otherOp
                kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r2 = r2.desc
                goto L20
            L1c:
                java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            L20:
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
                androidx.concurrent.futures.C0110xc40028dd.m9m(r3, r0, r4, r2)
                return r1
            L26:
                java.lang.NullPointerException r0 = new java.lang.NullPointerException
                java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectBuilderImpl<*>"
                r0.<init>(r1)
                throw r0
        }
    }

    /* JADX INFO: compiled from: Select.kt */
    @kotlin.Metadata(m114d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¨\u0006\u0007"}, m115d2 = {"Lkotlinx/coroutines/selects/SelectBuilderImpl$SelectOnCancelling;", "Lkotlinx/coroutines/JobCancellingNode;", "(Lkotlinx/coroutines/selects/SelectBuilderImpl;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
    private final class SelectOnCancelling extends kotlinx.coroutines.JobCancellingNode {
        final /* synthetic */ kotlinx.coroutines.selects.SelectBuilderImpl<R> this$0;

        public SelectOnCancelling(kotlinx.coroutines.selects.SelectBuilderImpl r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.Unit invoke(java.lang.Throwable r2) {
                r1 = this;
                r0 = r2
                java.lang.Throwable r0 = (java.lang.Throwable) r0
                r1.invoke2(r0)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
        }

        @Override // kotlinx.coroutines.CompletionHandlerBase
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public void invoke2(java.lang.Throwable r3) {
                r2 = this;
                kotlinx.coroutines.selects.SelectBuilderImpl<R> r0 = r2.this$0
                boolean r0 = r0.trySelect()
                if (r0 == 0) goto L17
                kotlinx.coroutines.selects.SelectBuilderImpl<R> r0 = r2.this$0
                kotlinx.coroutines.JobSupport r1 = r2.getJob()
                java.util.concurrent.CancellationException r1 = r1.getCancellationException()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.resumeSelectWithException(r1)
            L17:
                return
        }
    }

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.selects.SelectBuilderImpl> r2 = kotlinx.coroutines.selects.SelectBuilderImpl.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.selects.SelectBuilderImpl._state$FU = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_result"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.selects.SelectBuilderImpl._result$FU = r0
            return
    }

    public SelectBuilderImpl(kotlin.coroutines.Continuation<? super R> r2) {
            r1 = this;
            r1.<init>()
            r1.uCont = r2
            java.lang.Object r0 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            r1._state = r0
            java.lang.Object r0 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            r1._result = r0
            r0 = 0
            r1._parentHandle = r0
            return
    }

    public static final /* synthetic */ void access$doAfterSelect(kotlinx.coroutines.selects.SelectBuilderImpl r0) {
            r0.doAfterSelect()
            return
    }

    private final void doAfterSelect() {
            r6 = this;
            kotlinx.coroutines.DisposableHandle r0 = r6.getParentHandle()
            if (r0 != 0) goto L7
            goto La
        L7:
            r0.dispose()
        La:
            r0 = r6
            kotlinx.coroutines.internal.LockFreeLinkedListHead r0 = (kotlinx.coroutines.internal.LockFreeLinkedListHead) r0
            r1 = 0
            java.lang.Object r2 = r0.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r2
        L14:
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r0)
            if (r3 != 0) goto L2d
            boolean r3 = r2 instanceof kotlinx.coroutines.selects.SelectBuilderImpl.DisposeNode
            if (r3 == 0) goto L28
            r3 = r2
            kotlinx.coroutines.selects.SelectBuilderImpl$DisposeNode r3 = (kotlinx.coroutines.selects.SelectBuilderImpl.DisposeNode) r3
            r4 = 0
            kotlinx.coroutines.DisposableHandle r5 = r3.handle
            r5.dispose()
        L28:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r2.getNextNode()
            goto L14
        L2d:
            return
    }

    private final void doResume(kotlin.jvm.functions.Function0<? extends java.lang.Object> r9, kotlin.jvm.functions.Function0<kotlin.Unit> r10) {
            r8 = this;
            r0 = 0
            boolean r1 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r1 == 0) goto L15
            r1 = 0
            boolean r1 = r8.isSelected()
            if (r1 == 0) goto Lf
            goto L15
        Lf:
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>()
            throw r1
        L15:
            r1 = r8
            r2 = 0
        L17:
            java.lang.Object r3 = r1._result
            r4 = 0
            java.lang.Object r5 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            if (r3 != r5) goto L33
            java.lang.Object r5 = r9.invoke()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r7 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            boolean r6 = androidx.concurrent.futures.C0110xc40028dd.m9m(r6, r8, r7, r5)
            if (r6 == 0) goto L4d
            return
        L33:
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r3 != r5) goto L4f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r7 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
            boolean r5 = androidx.concurrent.futures.C0110xc40028dd.m9m(r5, r8, r6, r7)
            if (r5 == 0) goto L4d
            r10.invoke()
            return
        L4d:
            goto L17
        L4f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Already resumed"
            r5.<init>(r6)
            throw r5
    }

    private final kotlinx.coroutines.DisposableHandle getParentHandle() {
            r1 = this;
            java.lang.Object r0 = r1._parentHandle
            kotlinx.coroutines.DisposableHandle r0 = (kotlinx.coroutines.DisposableHandle) r0
            return r0
    }

    private final void initCancellability() {
            r7 = this;
            kotlin.coroutines.CoroutineContext r0 = r7.getContext()
            kotlinx.coroutines.Job$Key r1 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.CoroutineContext$Key r1 = (kotlin.coroutines.CoroutineContext.Key) r1
            kotlin.coroutines.CoroutineContext$Element r0 = r0.get(r1)
            r1 = r0
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            if (r1 != 0) goto L12
            return
        L12:
            kotlinx.coroutines.selects.SelectBuilderImpl$SelectOnCancelling r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$SelectOnCancelling
            r0.<init>(r7)
            kotlinx.coroutines.CompletionHandlerBase r0 = (kotlinx.coroutines.CompletionHandlerBase) r0
            r2 = 0
            r4 = r0
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            r5 = 2
            r6 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.DisposableHandle r0 = kotlinx.coroutines.Job.DefaultImpls.invokeOnCompletion$default(r1, r2, r3, r4, r5, r6)
            r7.setParentHandle(r0)
            boolean r2 = r7.isSelected()
            if (r2 == 0) goto L34
            r0.dispose()
        L34:
            return
    }

    private final void setParentHandle(kotlinx.coroutines.DisposableHandle r1) {
            r0 = this;
            r0._parentHandle = r1
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void disposeOnSelect(kotlinx.coroutines.DisposableHandle r3) {
            r2 = this;
            kotlinx.coroutines.selects.SelectBuilderImpl$DisposeNode r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$DisposeNode
            r0.<init>(r3)
            boolean r1 = r2.isSelected()
            if (r1 != 0) goto L18
            r1 = r0
            kotlinx.coroutines.internal.LockFreeLinkedListNode r1 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r1
            r2.addLast(r1)
            boolean r1 = r2.isSelected()
            if (r1 != 0) goto L18
            return
        L18:
            r3.dispose()
            return
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public kotlin.coroutines.jvm.internal.CoroutineStackFrame getCallerFrame() {
            r2 = this;
            kotlin.coroutines.Continuation<R> r0 = r2.uCont
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r0 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r0
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public kotlin.coroutines.Continuation<R> getCompletion() {
            r1 = this;
            r0 = r1
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            return r0
    }

    @Override // kotlin.coroutines.Continuation
    public kotlin.coroutines.CoroutineContext getContext() {
            r1 = this;
            kotlin.coroutines.Continuation<R> r0 = r1.uCont
            kotlin.coroutines.CoroutineContext r0 = r0.getContext()
            return r0
    }

    public final java.lang.Object getResult() {
            r4 = this;
            boolean r0 = r4.isSelected()
            if (r0 != 0) goto L9
            r4.initCancellability()
        L9:
            java.lang.Object r0 = r4._result
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            if (r0 != r1) goto L28
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r2 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            boolean r1 = androidx.concurrent.futures.C0110xc40028dd.m9m(r1, r4, r2, r3)
            if (r1 == 0) goto L26
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            return r1
        L26:
            java.lang.Object r0 = r4._result
        L28:
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
            if (r0 == r1) goto L3a
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 != 0) goto L34
            return r0
        L34:
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            throw r1
        L3a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Already resumed"
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final void handleBuilderException(java.lang.Throwable r5) {
            r4 = this;
            boolean r0 = r4.trySelect()
            if (r0 == 0) goto L17
            r0 = r4
            kotlin.coroutines.Continuation r0 = (kotlin.coroutines.Continuation) r0
            kotlin.Result$Companion r1 = kotlin.Result.Companion
            java.lang.Object r1 = kotlin.ResultKt.createFailure(r5)
            java.lang.Object r1 = kotlin.Result.m8669constructorimpl(r1)
            r0.resumeWith(r1)
            goto L4b
        L17:
            boolean r0 = r5 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L4b
            java.lang.Object r0 = r4.getResult()
            boolean r1 = r0 instanceof kotlinx.coroutines.CompletedExceptionally
            if (r1 == 0) goto L44
            r1 = r0
            kotlinx.coroutines.CompletedExceptionally r1 = (kotlinx.coroutines.CompletedExceptionally) r1
            java.lang.Throwable r1 = r1.cause
            r2 = 0
            boolean r3 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r3 != 0) goto L30
            goto L35
        L30:
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r1)
            r1 = r3
        L35:
            r2 = 0
            boolean r3 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r3 != 0) goto L3e
            r3 = r5
            goto L42
        L3e:
            java.lang.Throwable r3 = kotlinx.coroutines.internal.StackTraceRecoveryKt.unwrapImpl(r5)
        L42:
            if (r1 == r3) goto L4b
        L44:
            kotlin.coroutines.CoroutineContext r1 = r4.getContext()
            kotlinx.coroutines.CoroutineExceptionHandlerKt.handleCoroutineException(r1, r5)
        L4b:
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(kotlinx.coroutines.selects.SelectClause0 r2, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectInstance r0 = (kotlinx.coroutines.selects.SelectInstance) r0
            r2.registerSelectClause0(r0, r3)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(kotlinx.coroutines.selects.SelectClause1<? extends Q> r2, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectInstance r0 = (kotlinx.coroutines.selects.SelectInstance) r0
            r2.registerSelectClause1(r0, r3)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> r2, P r3, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectInstance r0 = (kotlinx.coroutines.selects.SelectInstance) r0
            r2.registerSelectClause2(r0, r3, r4)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> r2, kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r3) {
            r1 = this;
            r0 = r1
            kotlinx.coroutines.selects.SelectBuilder r0 = (kotlinx.coroutines.selects.SelectBuilder) r0
            kotlinx.coroutines.selects.SelectBuilder.DefaultImpls.invoke(r0, r2, r3)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean isSelected() {
            r5 = this;
            r0 = r5
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            if (r2 != r4) goto Lf
            r4 = 0
            return r4
        Lf:
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r4 == 0) goto L1b
            r4 = r2
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r5)
            goto L2
        L1b:
            r4 = 1
            return r4
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void onTimeout(long r4, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r6) {
            r3 = this;
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L14
            boolean r0 = r3.trySelect()
            if (r0 == 0) goto L13
            kotlin.coroutines.Continuation r0 = r3.getCompletion()
            kotlinx.coroutines.intrinsics.UndispatchedKt.startCoroutineUnintercepted(r6, r0)
        L13:
            return
        L14:
            r0 = 0
            kotlinx.coroutines.selects.SelectBuilderImpl$onTimeout$$inlined$Runnable$1 r1 = new kotlinx.coroutines.selects.SelectBuilderImpl$onTimeout$$inlined$Runnable$1
            r1.<init>(r3, r6)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = r1
            kotlin.coroutines.CoroutineContext r1 = r3.getContext()
            kotlinx.coroutines.Delay r1 = kotlinx.coroutines.DelayKt.getDelay(r1)
            kotlin.coroutines.CoroutineContext r2 = r3.getContext()
            kotlinx.coroutines.DisposableHandle r1 = r1.invokeOnTimeout(r4, r0, r2)
            r3.disposeOnSelect(r1)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public java.lang.Object performAtomicTrySelect(kotlinx.coroutines.internal.AtomicDesc r3) {
            r2 = this;
            kotlinx.coroutines.selects.SelectBuilderImpl$AtomicSelectOp r0 = new kotlinx.coroutines.selects.SelectBuilderImpl$AtomicSelectOp
            r0.<init>(r2, r3)
            r1 = 0
            java.lang.Object r0 = r0.perform(r1)
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public void resumeSelectWithException(java.lang.Throwable r13) {
            r12 = this;
            r0 = r12
            r1 = 0
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L16
            r2 = 0
            boolean r2 = r0.isSelected()
            if (r2 == 0) goto L10
            goto L16
        L10:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L16:
            r2 = r0
            r3 = 0
        L18:
            java.lang.Object r4 = r2._result
            r5 = 0
            java.lang.Object r6 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            if (r4 != r6) goto L51
            r6 = 0
            kotlinx.coroutines.CompletedExceptionally r7 = new kotlinx.coroutines.CompletedExceptionally
            kotlin.coroutines.Continuation<R> r8 = r12.uCont
            r9 = 0
            boolean r10 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r10 == 0) goto L3c
            boolean r10 = r8 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r10 != 0) goto L34
            goto L3c
        L34:
            r10 = r8
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r10 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r10
            java.lang.Throwable r10 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r13, r10)
            goto L3d
        L3c:
            r10 = r13
        L3d:
            r8 = 2
            r9 = 0
            r11 = 0
            r7.<init>(r10, r11, r8, r9)
            r6 = r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r8 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            boolean r7 = androidx.concurrent.futures.C0110xc40028dd.m9m(r7, r0, r8, r6)
            if (r7 == 0) goto L7e
            goto L7d
        L51:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r6) goto L80
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r8 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
            boolean r6 = androidx.concurrent.futures.C0110xc40028dd.m9m(r6, r0, r7, r8)
            if (r6 == 0) goto L7e
            r6 = 0
            kotlin.coroutines.Continuation<R> r7 = r12.uCont
            kotlin.coroutines.Continuation r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.intercepted(r7)
            kotlin.Result$Companion r8 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r13)
            java.lang.Object r8 = kotlin.Result.m8669constructorimpl(r8)
            r7.resumeWith(r8)
        L7d:
            return
        L7e:
            goto L18
        L80:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Already resumed"
            r6.<init>(r7)
            throw r6
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object r13) {
            r12 = this;
            r0 = r12
            r1 = 0
            boolean r2 = kotlinx.coroutines.DebugKt.getASSERTIONS_ENABLED()
            if (r2 == 0) goto L16
            r2 = 0
            boolean r2 = r0.isSelected()
            if (r2 == 0) goto L10
            goto L16
        L10:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            r2.<init>()
            throw r2
        L16:
            r2 = r0
            r3 = 0
        L18:
            java.lang.Object r4 = r2._result
            r5 = 0
            java.lang.Object r6 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            if (r4 != r6) goto L37
            r6 = 0
            r7 = 1
            r8 = 0
            java.lang.Object r6 = kotlinx.coroutines.CompletionStateKt.toState$default(r13, r8, r7, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r7 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r8 = kotlinx.coroutines.selects.SelectKt.access$getUNDECIDED$p()
            boolean r7 = androidx.concurrent.futures.C0110xc40028dd.m9m(r7, r0, r8, r6)
            if (r7 == 0) goto L8a
            goto L89
        L37:
            java.lang.Object r6 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r4 != r6) goto L8c
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r6 = kotlinx.coroutines.selects.SelectBuilderImpl._result$FU
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            java.lang.Object r8 = kotlinx.coroutines.selects.SelectKt.access$getRESUMED$p()
            boolean r6 = androidx.concurrent.futures.C0110xc40028dd.m9m(r6, r0, r7, r8)
            if (r6 == 0) goto L8a
            r6 = 0
            boolean r7 = kotlin.Result.m8675isFailureimpl(r13)
            if (r7 == 0) goto L82
            kotlin.coroutines.Continuation<R> r7 = r12.uCont
            java.lang.Throwable r8 = kotlin.Result.m8672exceptionOrNullimpl(r13)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
            r9 = 0
            kotlin.Result$Companion r10 = kotlin.Result.Companion
            r10 = 0
            boolean r11 = kotlinx.coroutines.DebugKt.getRECOVER_STACK_TRACES()
            if (r11 == 0) goto L74
            boolean r11 = r7 instanceof kotlin.coroutines.jvm.internal.CoroutineStackFrame
            if (r11 != 0) goto L6c
            goto L74
        L6c:
            r11 = r7
            kotlin.coroutines.jvm.internal.CoroutineStackFrame r11 = (kotlin.coroutines.jvm.internal.CoroutineStackFrame) r11
            java.lang.Throwable r11 = kotlinx.coroutines.internal.StackTraceRecoveryKt.access$recoverFromStackFrame(r8, r11)
            goto L75
        L74:
            r11 = r8
        L75:
            java.lang.Object r10 = kotlin.ResultKt.createFailure(r11)
            java.lang.Object r10 = kotlin.Result.m8669constructorimpl(r10)
            r7.resumeWith(r10)
            goto L87
        L82:
            kotlin.coroutines.Continuation<R> r7 = r12.uCont
            r7.resumeWith(r13)
        L87:
        L89:
            return
        L8a:
            goto L18
        L8c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Already resumed"
            r6.<init>(r7)
            throw r6
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SelectInstance(state="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2._state
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r1 = ", result="
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.Object r1 = r2._result
            java.lang.StringBuilder r0 = r0.append(r1)
            r1 = 41
            java.lang.StringBuilder r0 = r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public boolean trySelect() {
            r3 = this;
            r0 = 0
            java.lang.Object r0 = r3.trySelectOther(r0)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            if (r0 != r1) goto Lc
            r1 = 1
            goto Lf
        Lc:
            if (r0 != 0) goto L10
            r1 = 0
        Lf:
            return r1
        L10:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected trySelectIdempotent result "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.selects.SelectInstance
    public java.lang.Object trySelectOther(kotlinx.coroutines.internal.LockFreeLinkedListNode.PrepareOp r8) {
            r7 = this;
            r0 = r7
            r1 = 0
        L2:
            java.lang.Object r2 = r0._state
            r3 = 0
            java.lang.Object r4 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            r5 = 0
            if (r2 != r4) goto L3c
            if (r8 != 0) goto L1d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
            java.lang.Object r6 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            boolean r4 = androidx.concurrent.futures.C0110xc40028dd.m9m(r4, r7, r6, r5)
            if (r4 != 0) goto L36
            goto L72
        L1d:
            kotlinx.coroutines.selects.SelectBuilderImpl$PairSelectOp r4 = new kotlinx.coroutines.selects.SelectBuilderImpl$PairSelectOp
            r4.<init>(r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.selects.SelectBuilderImpl._state$FU
            java.lang.Object r6 = kotlinx.coroutines.selects.SelectKt.getNOT_SELECTED()
            boolean r5 = androidx.concurrent.futures.C0110xc40028dd.m9m(r5, r7, r6, r4)
            if (r5 != 0) goto L2f
            goto L72
        L2f:
            java.lang.Object r5 = r4.perform(r7)
            if (r5 == 0) goto L36
            return r5
        L36:
            r7.doAfterSelect()
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r4
        L3c:
            boolean r4 = r2 instanceof kotlinx.coroutines.internal.OpDescriptor
            if (r4 == 0) goto L73
            if (r8 == 0) goto L6b
            kotlinx.coroutines.internal.AtomicOp r4 = r8.getAtomicOp()
            boolean r5 = r4 instanceof kotlinx.coroutines.selects.SelectBuilderImpl.AtomicSelectOp
            if (r5 == 0) goto L5f
            r5 = r4
            kotlinx.coroutines.selects.SelectBuilderImpl$AtomicSelectOp r5 = (kotlinx.coroutines.selects.SelectBuilderImpl.AtomicSelectOp) r5
            kotlinx.coroutines.selects.SelectBuilderImpl<?> r5 = r5.impl
            if (r5 == r7) goto L53
            goto L5f
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Cannot use matching select clauses on the same object"
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L5f:
            r5 = r2
            kotlinx.coroutines.internal.OpDescriptor r5 = (kotlinx.coroutines.internal.OpDescriptor) r5
            boolean r5 = r4.isEarlierThan(r5)
            if (r5 == 0) goto L6b
            java.lang.Object r5 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            return r5
        L6b:
            r4 = r2
            kotlinx.coroutines.internal.OpDescriptor r4 = (kotlinx.coroutines.internal.OpDescriptor) r4
            r4.perform(r7)
        L72:
            goto L2
        L73:
            if (r8 != 0) goto L76
            return r5
        L76:
            kotlinx.coroutines.internal.LockFreeLinkedListNode$AbstractAtomicDesc r4 = r8.desc
            if (r2 != r4) goto L7d
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.CancellableContinuationImplKt.RESUME_TOKEN
            return r4
        L7d:
            return r5
    }
}
