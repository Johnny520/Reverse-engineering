package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Channel.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m116k = 3, m117mv = {1, 6, 0}, m119xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m124c = "kotlinx.coroutines.channels.ChannelIterator$DefaultImpls", m125f = "Channel.kt", m126i = {0}, m127l = {584}, m128m = "next", m129n = {"this"}, m130s = {"L$0"})
final class ChannelIterator$next0$1<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;

    ChannelIterator$next0$1(kotlin.coroutines.Continuation<? super kotlinx.coroutines.channels.ChannelIterator$next0$1> r1) {
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
            java.lang.Object r0 = kotlinx.coroutines.channels.ChannelIterator.DefaultImpls.next(r0, r1)
            return r0
    }
}
