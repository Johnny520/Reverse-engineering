package io.ktor.server.engine;

import com.android.p002dx.p005io.Opcodes;
import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.engine.BaseApplicationResponse$respondFromChannel$2$copied$1", m556f = "BaseApplicationResponse.kt", m557l = {Opcodes.XOR_INT_LIT16}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)J"}, m152k = 3, m153mv = {2, 0, 0})
final class BaseApplicationResponse$respondFromChannel$2$copied$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Long $length;
    final /* synthetic */ InterfaceC5084 $readChannel;
    final /* synthetic */ InterfaceC5079 $this_use;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseApplicationResponse$respondFromChannel$2$copied$1(InterfaceC5084 interfaceC5084, InterfaceC5079 interfaceC5079, Long l, InterfaceC5189<? super BaseApplicationResponse$respondFromChannel$2$copied$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$readChannel = interfaceC5084;
        this.$this_use = interfaceC5079;
        this.$length = l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new BaseApplicationResponse$respondFromChannel$2$copied$1(this.$readChannel, this.$this_use, this.$length, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super Long> interfaceC5189) {
        return ((BaseApplicationResponse$respondFromChannel$2$copied$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return obj;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC5084 interfaceC5084 = this.$readChannel;
        InterfaceC5079 interfaceC5079 = this.$this_use;
        Long l = this.$length;
        long jLongValue = l != null ? l.longValue() : Long.MAX_VALUE;
        this.label = 1;
        Object objM9222 = AbstractC5076.m9222(interfaceC5084, interfaceC5079, jLongValue, this);
        return objM9222 == coroutineSingletons ? coroutineSingletons : objM9222;
    }
}
