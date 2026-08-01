package io.ktor.util;

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
import p073.InterfaceC7680;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.util.DeflaterKt$deflated$2", m556f = "Deflater.kt", m557l = {123}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DeflaterKt$deflated$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ boolean $gzip;
    final /* synthetic */ InterfaceC7680 $pool;
    final /* synthetic */ InterfaceC5079 $this_deflated;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeflaterKt$deflated$2(InterfaceC5079 interfaceC5079, boolean z, InterfaceC7680 interfaceC7680, InterfaceC5189<? super DeflaterKt$deflated$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_deflated = interfaceC5079;
        this.$gzip = z;
        this.$pool = interfaceC7680;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DeflaterKt$deflated$2 deflaterKt$deflated$2 = new DeflaterKt$deflated$2(this.$this_deflated, this.$gzip, this.$pool, interfaceC5189);
        deflaterKt$deflated$2.L$0 = obj;
        return deflaterKt$deflated$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5061 c5061, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DeflaterKt$deflated$2) create(c5061, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC5084 interfaceC5084 = ((C5061) this.L$0).f13076;
            InterfaceC5079 interfaceC5079 = this.$this_deflated;
            boolean z = this.$gzip;
            InterfaceC7680 interfaceC7680 = this.$pool;
            this.label = 1;
            if (AbstractC5049.m9185(interfaceC5084, interfaceC5079, z, interfaceC7680, this) == coroutineSingletons) {
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
