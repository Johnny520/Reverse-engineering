package kotlinx.coroutines.channels;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import net.bytebuddy.pool.TypePool;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$requireNoNulls$1", f = "Deprecated.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0001H\n"}, d2 = {"<anonymous>", "E", "", "it"}, k = 3, mv = {2, 2, 0}, xi = 48)
final class ChannelsKt__DeprecatedKt$requireNoNulls$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC5199 $this_requireNoNulls;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChannelsKt__DeprecatedKt$requireNoNulls$1(InterfaceC5199 interfaceC5199, InterfaceC4357 interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_requireNoNulls = interfaceC5199;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        ChannelsKt__DeprecatedKt$requireNoNulls$1 channelsKt__DeprecatedKt$requireNoNulls$1 = new ChannelsKt__DeprecatedKt$requireNoNulls$1(this.$this_requireNoNulls, interfaceC4357);
        channelsKt__DeprecatedKt$requireNoNulls$1.L$0 = obj;
        return channelsKt__DeprecatedKt$requireNoNulls$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(Object obj, InterfaceC4357 interfaceC4357) {
        return ((ChannelsKt__DeprecatedKt$requireNoNulls$1) create(obj, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        if (obj2 != null) {
            return obj2;
        }
        throw new IllegalArgumentException("null element found in " + this.$this_requireNoNulls + TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
    }
}
