package io.ktor.server.engine;

import com.android.dx.io.Opcodes;
import io.ktor.utils.io.AbstractC4243;
import io.ktor.utils.io.InterfaceC4246;
import io.ktor.utils.io.InterfaceC4251;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "io.ktor.server.engine.BaseApplicationResponse$respondFromChannel$2$copied$1", f = "BaseApplicationResponse.kt", l = {Opcodes.XOR_INT_LIT16}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)J"}, k = 3, mv = {2, 0, 0})
final class BaseApplicationResponse$respondFromChannel$2$copied$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Long $length;
    final /* synthetic */ InterfaceC4251 $readChannel;
    final /* synthetic */ InterfaceC4246 $this_use;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplicationResponse$respondFromChannel$2$copied$1(InterfaceC4251 interfaceC4251, InterfaceC4246 interfaceC4246, Long l, InterfaceC4356<? super BaseApplicationResponse$respondFromChannel$2$copied$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$readChannel = interfaceC4251;
        this.$this_use = interfaceC4246;
        this.$length = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new BaseApplicationResponse$respondFromChannel$2$copied$1(this.$readChannel, this.$this_use, this.$length, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super Long> interfaceC4356) {
        return ((BaseApplicationResponse$respondFromChannel$2$copied$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return obj;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC4251 interfaceC4251 = this.$readChannel;
        InterfaceC4246 interfaceC4246 = this.$this_use;
        Long l = this.$length;
        long jLongValue = l != null ? l.longValue() : Long.MAX_VALUE;
        this.label = 1;
        Object objM8673 = AbstractC4243.m8673(interfaceC4251, interfaceC4246, jLongValue, this);
        return objM8673 == coroutineSingletons ? coroutineSingletons : objM8673;
    }
}
