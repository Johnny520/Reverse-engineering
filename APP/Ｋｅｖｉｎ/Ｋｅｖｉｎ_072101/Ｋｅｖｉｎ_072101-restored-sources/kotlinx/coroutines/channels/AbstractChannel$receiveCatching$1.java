package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: AbstractChannel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.AbstractChannel", m125f = "AbstractChannel.kt", m126i = {}, m127l = {633}, m128m = "receiveCatching-JP2dKIU", m129n = {}, m130s = {})
final class AbstractChannel$receiveCatching$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.channels.AbstractChannel<E> this$0;

    AbstractChannel$receiveCatching$1(kotlinx.coroutines.channels.AbstractChannel<E> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.AbstractChannel$receiveCatching$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
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
            kotlinx.coroutines.channels.AbstractChannel<E> r0 = r2.this$0
            r1 = r2
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            java.lang.Object r0 = r0.mo10172receiveCatchingJP2dKIU(r1)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r1) goto L19
            return r0
        L19:
            kotlinx.coroutines.channels.ChannelResult r0 = kotlinx.coroutines.channels.ChannelResult.m10179boximpl(r0)
            return r0
    }
}
