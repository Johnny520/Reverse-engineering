package io.ktor.http.cio;

import io.ktor.utils.p007io.C5072;
import java.nio.ByteBuffer;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.http.cio.MultipartKt$skipDelimiterOrEof$3", m556f = "Multipart.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class MultipartKt$skipDelimiterOrEof$3 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ ByteBuffer $delimiter;
    final /* synthetic */ Ref$BooleanRef $found;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$skipDelimiterOrEof$3(Ref$BooleanRef ref$BooleanRef, ByteBuffer byteBuffer, InterfaceC5189<? super MultipartKt$skipDelimiterOrEof$3> interfaceC5189) {
        super(2, interfaceC5189);
        this.$found = ref$BooleanRef;
        this.$delimiter = byteBuffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MultipartKt$skipDelimiterOrEof$3 multipartKt$skipDelimiterOrEof$3 = new MultipartKt$skipDelimiterOrEof$3(this.$found, this.$delimiter, interfaceC5189);
        multipartKt$skipDelimiterOrEof$3.L$0 = obj;
        return multipartKt$skipDelimiterOrEof$3;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5072 c5072, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MultipartKt$skipDelimiterOrEof$3) create(c5072, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C5072 c5072 = (C5072) this.L$0;
        this.$found.element = AbstractC4801.m8922(c5072, this.$delimiter) == this.$delimiter.remaining();
        return C6008.f15084;
    }
}
