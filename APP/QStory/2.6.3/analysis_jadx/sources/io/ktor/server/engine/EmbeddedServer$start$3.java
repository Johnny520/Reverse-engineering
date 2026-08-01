package io.ktor.server.engine;

import io.ktor.server.cio.C4081;
import java.util.Locale;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.AbstractC5144;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p252.AbstractC8186;
import p398.InterfaceC9141;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "io.ktor.server.engine.EmbeddedServer$start$3", f = "EmbeddedServerJvm.kt", l = {285}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class EmbeddedServer$start$3 extends SuspendLambda implements InterfaceC6554 {
    int label;
    final /* synthetic */ C4102 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmbeddedServer$start$3(C4102 c4102, InterfaceC4357<? super EmbeddedServer$start$3> interfaceC4357) {
        super(2, interfaceC4357);
        this.this$0 = c4102;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new EmbeddedServer$start$3(this.this$0, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((EmbeddedServer$start$3) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C4081 c4081 = this.this$0.f12458;
            this.label = 1;
            obj = c4081.f12428.m10573(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        C4102 c4102 = this.this$0;
        for (InterfaceC4105 interfaceC4105 : (Iterable) obj) {
            String strMo8500 = interfaceC4105.mo8500();
            String str = AbstractC8186.f22557;
            strMo8500.getClass();
            if (AbstractC5144.m10176(AbstractC8186.f22557, "windows", false) && strMo8500.equals("0.0.0.0")) {
                strMo8500 = "127.0.0.1";
            }
            InterfaceC9141 interfaceC9141 = c4102.f12455.f12437;
            StringBuilder sb = new StringBuilder("Responding at ");
            String lowerCase = interfaceC4105.getType().f12477.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            sb.append(lowerCase);
            sb.append("://");
            sb.append(strMo8500);
            sb.append(':');
            sb.append(interfaceC4105.mo8501());
            interfaceC9141.info(sb.toString());
        }
        return C5176.f14739;
    }
}
