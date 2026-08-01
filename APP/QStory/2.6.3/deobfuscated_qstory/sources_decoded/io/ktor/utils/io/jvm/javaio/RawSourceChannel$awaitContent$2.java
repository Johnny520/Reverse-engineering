package io.ktor.utils.io.jvm.javaio;

import io.ktor.utils.io.C4237;
import java.io.EOFException;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.utils.io.jvm.javaio.RawSourceChannel$awaitContent$2", f = "Reading.kt", l = {}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class RawSourceChannel$awaitContent$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ int $min;
    int label;
    final /* synthetic */ C4222 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RawSourceChannel$awaitContent$2(C4222 c4222, int i, InterfaceC4357<? super RawSourceChannel$awaitContent$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c4222;
        this.$min = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new RawSourceChannel$awaitContent$2(this.this$0, this.$min, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((RawSourceChannel$awaitContent$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        long jMo10605 = 0;
        while (this.this$0.f12720.f15142 < this.$min && jMo10605 >= 0) {
            try {
                C4222 c4222 = this.this$0;
                jMo10605 = c4222.f12722.mo10605(c4222.f12720, Long.MAX_VALUE);
            } catch (EOFException unused) {
                jMo10605 = -1;
            }
        }
        if (jMo10605 == -1) {
            this.this$0.f12722.close();
            this.this$0.f12719.m10555();
            this.this$0.f12721 = new C4237(null);
        }
        return C5176.f14739;
    }
}
