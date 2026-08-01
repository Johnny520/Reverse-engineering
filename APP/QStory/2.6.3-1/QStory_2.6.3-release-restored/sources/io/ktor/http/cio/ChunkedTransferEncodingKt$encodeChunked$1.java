package io.ktor.http.cio;

import io.ktor.utils.p007io.C5061;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.http.cio.ChunkedTransferEncodingKt$encodeChunked$1", m556f = "ChunkedTransferEncoding.kt", m557l = {111}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ChunkedTransferEncodingKt$encodeChunked$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5079 $output;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChunkedTransferEncodingKt$encodeChunked$1(InterfaceC5079 interfaceC5079, InterfaceC5189<? super ChunkedTransferEncodingKt$encodeChunked$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$output = interfaceC5079;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ChunkedTransferEncodingKt$encodeChunked$1 chunkedTransferEncodingKt$encodeChunked$1 = new ChunkedTransferEncodingKt$encodeChunked$1(this.$output, interfaceC5189);
        chunkedTransferEncodingKt$encodeChunked$1.L$0 = obj;
        return chunkedTransferEncodingKt$encodeChunked$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5061 c5061, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ChunkedTransferEncodingKt$encodeChunked$1) create(c5061, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C5061 c5061 = (C5061) this.L$0;
            InterfaceC5079 interfaceC5079 = this.$output;
            InterfaceC5084 interfaceC5084 = c5061.f13076;
            this.label = 1;
            if (AbstractC4789.m8901(interfaceC5084, interfaceC5079, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
