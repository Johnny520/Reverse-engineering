package io.ktor.util;

import io.ktor.utils.io.C4228;
import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6553;
import p057.InterfaceC6850;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.util.DeflaterKt$deflated$2", f = "Deflater.kt", l = {123}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
final class DeflaterKt$deflated$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ boolean $gzip;
    final /* synthetic */ InterfaceC6850 $pool;
    final /* synthetic */ InterfaceC4246 $this_deflated;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeflaterKt$deflated$2(InterfaceC4246 interfaceC4246, boolean z, InterfaceC6850 interfaceC6850, InterfaceC4356<? super DeflaterKt$deflated$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_deflated = interfaceC4246;
        this.$gzip = z;
        this.$pool = interfaceC6850;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DeflaterKt$deflated$2 deflaterKt$deflated$2 = new DeflaterKt$deflated$2(this.$this_deflated, this.$gzip, this.$pool, interfaceC4356);
        deflaterKt$deflated$2.L$0 = obj;
        return deflaterKt$deflated$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(C4228 c4228, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DeflaterKt$deflated$2) create(c4228, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC4251 interfaceC4251 = ((C4228) this.L$0).f12727;
            InterfaceC4246 interfaceC4246 = this.$this_deflated;
            boolean z = this.$gzip;
            InterfaceC6850 interfaceC6850 = this.$pool;
            this.label = 1;
            if (AbstractC4216.m8636(interfaceC4251, interfaceC4246, z, interfaceC6850, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
