package io.ktor.network.sockets;

import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5081;
import java.net.SocketTimeoutException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 0, 0})
@InterfaceC7691(m555c = "io.ktor.network.sockets.CIOWriterKt$attachForWritingDirectImpl$1$timeout$1", m556f = "CIOWriter.kt", m557l = {}, m558m = "invokeSuspend")
public final class CIOWriterKt$attachForWritingDirectImpl$1$timeout$1 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ C5081 $channel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOWriterKt$attachForWritingDirectImpl$1$timeout$1(C5081 c5081, InterfaceC5189<? super CIOWriterKt$attachForWritingDirectImpl$1$timeout$1> interfaceC5189) {
        super(1, interfaceC5189);
        this.$channel = c5081;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new CIOWriterKt$attachForWritingDirectImpl$1$timeout$1(this.$channel, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CIOWriterKt$attachForWritingDirectImpl$1$timeout$1) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        AbstractC5078.m9251(this.$channel, new SocketTimeoutException());
        return C6008.f15084;
    }
}
