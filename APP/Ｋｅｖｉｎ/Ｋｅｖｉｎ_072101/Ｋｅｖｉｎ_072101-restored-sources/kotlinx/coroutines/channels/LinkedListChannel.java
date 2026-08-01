package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: LinkedListChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B'\u0012 \u0010\u0003\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u00002\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u0014H\u0014¢\u0006\u0002\u0010\u0015J/\u0010\u0016\u001a\u00020\u00052\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\nR\u0014\u0010\u000b\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\t8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\n\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006\u001e"}, m115d2 = {"Lkotlinx/coroutines/channels/LinkedListChannel;", "E", "Lkotlinx/coroutines/channels/AbstractChannel;", "onUndeliveredElement", "Lkotlin/Function1;", "", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "(Lkotlin/jvm/functions/Function1;)V", "isBufferAlwaysEmpty", "", "()Z", "isBufferAlwaysFull", "isBufferEmpty", "isBufferFull", "offerInternal", "", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "offerSelectInternal", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "(Ljava/lang/Object;Lkotlinx/coroutines/selects/SelectInstance;)Ljava/lang/Object;", "onCancelIdempotentList", "list", "Lkotlinx/coroutines/internal/InlineList;", "Lkotlinx/coroutines/channels/Send;", "closed", "Lkotlinx/coroutines/channels/Closed;", "onCancelIdempotentList-w-w6eGU", "(Ljava/lang/Object;Lkotlinx/coroutines/channels/Closed;)V", "kotlinx-coroutines-core"}, m116k = 1, m117mv = {1, 6, 0}, m119xi = 48)
public class LinkedListChannel<E> extends kotlinx.coroutines.channels.AbstractChannel<E> {
    public LinkedListChannel(kotlin.jvm.functions.Function1<? super E, kotlin.Unit> r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean isBufferAlwaysEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferAlwaysFull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    protected final boolean isBufferEmpty() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected final boolean isBufferFull() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerInternal(E r4) {
            r3 = this;
        L1:
            java.lang.Object r0 = super.offerInternal(r4)
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto Le
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r1
        Le:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r0 != r1) goto L20
            kotlinx.coroutines.channels.ReceiveOrClosed r1 = r3.sendBuffered(r4)
            if (r1 != 0) goto L1b
            kotlinx.coroutines.internal.Symbol r2 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r2
        L1b:
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.Closed
            if (r2 == 0) goto L1
            return r1
        L20:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L25
            return r0
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid offerInternal result "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.channels.AbstractSendChannel
    protected java.lang.Object offerSelectInternal(E r4, kotlinx.coroutines.selects.SelectInstance<?> r5) {
            r3 = this;
        L1:
            boolean r0 = r3.getHasReceiveOrClosed()
            if (r0 == 0) goto Ld
            java.lang.Object r0 = super.offerSelectInternal(r4, r5)
            goto L1b
        Ld:
            kotlinx.coroutines.internal.LockFreeLinkedListNode$AddLastDesc r0 = r3.describeSendBuffered(r4)
            kotlinx.coroutines.internal.AtomicDesc r0 = (kotlinx.coroutines.internal.AtomicDesc) r0
            java.lang.Object r0 = r5.performAtomicTrySelect(r0)
            if (r0 != 0) goto L1b
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
        L1b:
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            if (r0 != r1) goto L28
            java.lang.Object r1 = kotlinx.coroutines.selects.SelectKt.getALREADY_SELECTED()
            return r1
        L28:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            if (r0 != r1) goto L2f
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_SUCCESS
            return r1
        L2f:
            kotlinx.coroutines.internal.Symbol r1 = kotlinx.coroutines.channels.AbstractChannelKt.OFFER_FAILED
            if (r0 != r1) goto L34
            goto L1
        L34:
            java.lang.Object r1 = kotlinx.coroutines.internal.AtomicKt.RETRY_ATOMIC
            if (r0 != r1) goto L39
            goto L1
        L39:
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.Closed
            if (r1 == 0) goto L3e
            return r0
        L3e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Invalid result "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r0)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
    }

    @Override // kotlinx.coroutines.channels.AbstractChannel
    /* JADX INFO: renamed from: onCancelIdempotentList-w-w6eGU */
    protected void mo10171onCancelIdempotentListww6eGU(java.lang.Object r11, kotlinx.coroutines.channels.Closed<?> r12) {
            r10 = this;
            r0 = 0
            r1 = 0
            if (r11 != 0) goto L6
            goto L60
        L6:
            boolean r2 = r11 instanceof java.util.ArrayList
            r3 = 0
            if (r2 != 0) goto L2c
            r2 = r11
            kotlinx.coroutines.channels.Send r2 = (kotlinx.coroutines.channels.Send) r2
            r4 = 0
            boolean r5 = r2 instanceof kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered
            if (r5 == 0) goto L27
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r5 = r10.onUndeliveredElement
            if (r5 != 0) goto L19
            goto L25
        L19:
            r3 = r2
            kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r3 = (kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered) r3
            E r3 = r3.element
            r6 = r0
            kotlinx.coroutines.internal.UndeliveredElementException r6 = (kotlinx.coroutines.internal.UndeliveredElementException) r6
            kotlinx.coroutines.internal.UndeliveredElementException r3 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r5, r3, r6)
        L25:
            r0 = r3
            goto L2a
        L27:
            r2.resumeSendClosed(r12)
        L2a:
            goto L5f
        L2c:
            if (r11 == 0) goto L66
            r2 = r11
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r4 = r2.size()
            int r4 = r4 + (-1)
            if (r4 < 0) goto L5f
        L39:
            r5 = r4
            int r4 = r4 + (-1)
            java.lang.Object r6 = r2.get(r5)
            kotlinx.coroutines.channels.Send r6 = (kotlinx.coroutines.channels.Send) r6
            r7 = 0
            boolean r8 = r6 instanceof kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered
            if (r8 == 0) goto L59
            kotlin.jvm.functions.Function1<E, kotlin.Unit> r8 = r10.onUndeliveredElement
            if (r8 != 0) goto L4e
            r8 = r3
            goto L57
        L4e:
            r9 = r6
            kotlinx.coroutines.channels.AbstractSendChannel$SendBuffered r9 = (kotlinx.coroutines.channels.AbstractSendChannel.SendBuffered) r9
            E r9 = r9.element
            kotlinx.coroutines.internal.UndeliveredElementException r8 = kotlinx.coroutines.internal.OnUndeliveredElementKt.callUndeliveredElementCatchingException(r8, r9, r0)
        L57:
            r0 = r8
            goto L5c
        L59:
            r6.resumeSendClosed(r12)
        L5c:
            if (r4 >= 0) goto L39
        L5f:
        L60:
            if (r0 != 0) goto L63
            return
        L63:
            r1 = r0
            r2 = 0
            throw r1
        L66:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "null cannot be cast to non-null type java.util.ArrayList<E of kotlinx.coroutines.internal.InlineList>{ kotlin.collections.TypeAliasesKt.ArrayList<E of kotlinx.coroutines.internal.InlineList> }"
            r2.<init>(r3)
            throw r2
    }
}
