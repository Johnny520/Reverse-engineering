package io.ktor.client.engine.cio;

import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.InterfaceC5192;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p257.C8968;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.UtilsKt$writeRequest$2", m556f = "utils.kt", m557l = {31, 32}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class UtilsKt$writeRequest$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC5192 $callContext;
    final /* synthetic */ boolean $closeChannel;
    final /* synthetic */ InterfaceC5079 $output;
    final /* synthetic */ boolean $overProxy;
    final /* synthetic */ C8968 $request;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$writeRequest$2(C8968 c8968, InterfaceC5079 interfaceC5079, boolean z, boolean z2, InterfaceC5192 interfaceC5192, InterfaceC5189<? super UtilsKt$writeRequest$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$request = c8968;
        this.$output = interfaceC5079;
        this.$overProxy = z;
        this.$closeChannel = z2;
        this.$callContext = interfaceC5192;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new UtilsKt$writeRequest$2(this.$request, this.$output, this.$overProxy, this.$closeChannel, this.$callContext, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((UtilsKt$writeRequest$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C8968 c8968 = this.$request;
            InterfaceC5079 interfaceC5079 = this.$output;
            boolean z = this.$overProxy;
            boolean z2 = this.$closeChannel;
            this.label = 1;
            if (AbstractC4702.m8812(c8968, interfaceC5079, z, z2, this) != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C8968 c89682 = this.$request;
        InterfaceC5079 interfaceC50792 = this.$output;
        InterfaceC5192 interfaceC5192 = this.$callContext;
        this.label = 2;
        AbstractC4702.m8813(c89682, interfaceC50792, interfaceC5192);
        return c6008 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
