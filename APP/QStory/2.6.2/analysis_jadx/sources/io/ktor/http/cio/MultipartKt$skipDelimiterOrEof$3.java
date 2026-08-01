package io.ktor.http.cio;

import io.ktor.utils.io.C4239;
import java.nio.ByteBuffer;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "io.ktor.http.cio.MultipartKt$skipDelimiterOrEof$3", f = "Multipart.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子楪兰哲苏世;)V"}, k = 3, mv = {2, 0, 0})
final class MultipartKt$skipDelimiterOrEof$3 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ ByteBuffer $delimiter;
    final /* synthetic */ Ref$BooleanRef $found;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$skipDelimiterOrEof$3(Ref$BooleanRef ref$BooleanRef, ByteBuffer byteBuffer, InterfaceC4356<? super MultipartKt$skipDelimiterOrEof$3> interfaceC4356) {
        super(2, interfaceC4356);
        this.$found = ref$BooleanRef;
        this.$delimiter = byteBuffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        MultipartKt$skipDelimiterOrEof$3 multipartKt$skipDelimiterOrEof$3 = new MultipartKt$skipDelimiterOrEof$3(this.$found, this.$delimiter, interfaceC4356);
        multipartKt$skipDelimiterOrEof$3.L$0 = obj;
        return multipartKt$skipDelimiterOrEof$3;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4239 c4239, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MultipartKt$skipDelimiterOrEof$3) create(c4239, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C4239 c4239 = (C4239) this.L$0;
        this.$found.element = AbstractC3968.m8373(c4239, this.$delimiter) == this.$delimiter.remaining();
        return C5175.f14739;
    }
}
