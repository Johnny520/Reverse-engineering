package kotlinx.coroutines.channels;

/* JADX INFO: compiled from: Actor.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(m114d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u009c\u0001\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2-\b\u0002\u0010\n\u001a'\u0012\u0015\u0012\u0013\u0018\u00010\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bj\u0004\u0018\u0001`\u00112-\u0010\u0012\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00160\u0013¢\u0006\u0002\b\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, m115d2 = {"actor", "Lkotlinx/coroutines/channels/SendChannel;", "E", "Lkotlinx/coroutines/CoroutineScope;", "context", "Lkotlin/coroutines/CoroutineContext;", "capacity", "", "start", "Lkotlinx/coroutines/CoroutineStart;", "onCompletion", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "Lkotlinx/coroutines/CompletionHandler;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/channels/ActorScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Lkotlinx/coroutines/CoroutineScope;Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/channels/SendChannel;", "kotlinx-coroutines-core"}, m116k = 2, m117mv = {1, 6, 0}, m119xi = 48)
public final class ActorKt {
    public static final <E> kotlinx.coroutines.channels.SendChannel<E> actor(kotlinx.coroutines.CoroutineScope r4, kotlin.coroutines.CoroutineContext r5, int r6, kotlinx.coroutines.CoroutineStart r7, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r8, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.channels.ActorScope<E>, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r9) {
            kotlin.coroutines.CoroutineContext r0 = kotlinx.coroutines.CoroutineContextKt.newCoroutineContext(r4, r5)
            r1 = 0
            r2 = 6
            kotlinx.coroutines.channels.Channel r1 = kotlinx.coroutines.channels.ChannelKt.Channel$default(r6, r1, r1, r2, r1)
            boolean r2 = r7.isLazy()
            if (r2 == 0) goto L18
            kotlinx.coroutines.channels.LazyActorCoroutine r2 = new kotlinx.coroutines.channels.LazyActorCoroutine
            r2.<init>(r0, r1, r9)
            kotlinx.coroutines.channels.ActorCoroutine r2 = (kotlinx.coroutines.channels.ActorCoroutine) r2
            goto L1e
        L18:
            kotlinx.coroutines.channels.ActorCoroutine r2 = new kotlinx.coroutines.channels.ActorCoroutine
            r3 = 1
            r2.<init>(r0, r1, r3)
        L1e:
            if (r8 == 0) goto L24
            r2.invokeOnCompletion(r8)
        L24:
            r2.start(r7, r2, r9)
            r3 = r2
            kotlinx.coroutines.channels.SendChannel r3 = (kotlinx.coroutines.channels.SendChannel) r3
            return r3
    }

    public static /* synthetic */ kotlinx.coroutines.channels.SendChannel actor$default(kotlinx.coroutines.CoroutineScope r6, kotlin.coroutines.CoroutineContext r7, int r8, kotlinx.coroutines.CoroutineStart r9, kotlin.jvm.functions.Function1 r10, kotlin.jvm.functions.Function2 r11, int r12, java.lang.Object r13) {
            r13 = r12 & 1
            if (r13 == 0) goto La
            kotlin.coroutines.EmptyCoroutineContext r7 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            kotlin.coroutines.CoroutineContext r7 = (kotlin.coroutines.CoroutineContext) r7
            r1 = r7
            goto Lb
        La:
            r1 = r7
        Lb:
            r7 = r12 & 2
            if (r7 == 0) goto L12
            r8 = 0
            r2 = r8
            goto L13
        L12:
            r2 = r8
        L13:
            r7 = r12 & 4
            if (r7 == 0) goto L1b
            kotlinx.coroutines.CoroutineStart r9 = kotlinx.coroutines.CoroutineStart.DEFAULT
            r3 = r9
            goto L1c
        L1b:
            r3 = r9
        L1c:
            r7 = r12 & 8
            if (r7 == 0) goto L23
            r10 = 0
            r4 = r10
            goto L24
        L23:
            r4 = r10
        L24:
            r0 = r6
            r5 = r11
            kotlinx.coroutines.channels.SendChannel r6 = actor(r0, r1, r2, r3, r4, r5)
            return r6
    }
}
