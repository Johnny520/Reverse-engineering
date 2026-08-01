package io.ktor.util;

import io.ktor.utils.io.C4226;
import io.ktor.utils.io.InterfaceC4247;
import io.ktor.utils.io.InterfaceC4252;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p052.InterfaceC6554;
import p057.InterfaceC6851;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.util.DeflaterKt$deflated$1", f = "Deflater.kt", l = {110}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, k = 3, mv = {2, 0, 0})
final class DeflaterKt$deflated$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ boolean $gzip;
    final /* synthetic */ InterfaceC6851 $pool;
    final /* synthetic */ InterfaceC4252 $this_deflated;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeflaterKt$deflated$1(InterfaceC4252 interfaceC4252, boolean z, InterfaceC6851 interfaceC6851, InterfaceC4357<? super DeflaterKt$deflated$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_deflated = interfaceC4252;
        this.$gzip = z;
        this.$pool = interfaceC6851;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        DeflaterKt$deflated$1 deflaterKt$deflated$1 = new DeflaterKt$deflated$1(this.$this_deflated, this.$gzip, this.$pool, interfaceC4357);
        deflaterKt$deflated$1.L$0 = obj;
        return deflaterKt$deflated$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(C4226 c4226, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((DeflaterKt$deflated$1) create(c4226, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4226 c4226 = (C4226) this.L$0;
            InterfaceC4252 interfaceC4252 = this.$this_deflated;
            InterfaceC4247 interfaceC4247 = c4226.f12726;
            boolean z = this.$gzip;
            InterfaceC6851 interfaceC6851 = this.$pool;
            this.label = 1;
            if (AbstractC4217.m8626(interfaceC4252, interfaceC4247, z, interfaceC6851, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
