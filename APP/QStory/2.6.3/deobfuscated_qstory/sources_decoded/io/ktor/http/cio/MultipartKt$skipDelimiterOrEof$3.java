package io.ktor.http.cio;

import io.ktor.utils.io.C4240;
import java.nio.ByteBuffer;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "io.ktor.http.cio.MultipartKt$skipDelimiterOrEof$3", f = "Multipart.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;)V"}, k = 3, mv = {2, 0, 0})
final class MultipartKt$skipDelimiterOrEof$3 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ ByteBuffer $delimiter;
    final /* synthetic */ Ref$BooleanRef $found;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$skipDelimiterOrEof$3(Ref$BooleanRef ref$BooleanRef, ByteBuffer byteBuffer, InterfaceC4357<? super MultipartKt$skipDelimiterOrEof$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.$found = ref$BooleanRef;
        this.$delimiter = byteBuffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        MultipartKt$skipDelimiterOrEof$3 multipartKt$skipDelimiterOrEof$3 = new MultipartKt$skipDelimiterOrEof$3(this.$found, this.$delimiter, interfaceC4357);
        multipartKt$skipDelimiterOrEof$3.L$0 = obj;
        return multipartKt$skipDelimiterOrEof$3;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4240 c4240, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MultipartKt$skipDelimiterOrEof$3) create(c4240, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        C4240 c4240 = (C4240) this.L$0;
        this.$found.element = AbstractC3969.m8363(c4240, this.$delimiter) == this.$delimiter.remaining();
        return C5176.f14739;
    }
}
