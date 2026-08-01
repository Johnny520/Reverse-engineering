package top.suzhelan.qstory.hook.item.mcp.config;

import java.util.LinkedHashMap;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p088.C7152;
import p287.AbstractC8405;
import p329.AbstractC8765;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$Companion$saveToolConfig$6", f = "McpServerManager.kt", l = {175}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class McpServerManager$Companion$saveToolConfig$6 extends SuspendLambda implements InterfaceC6554 {
    int label;

    public McpServerManager$Companion$saveToolConfig$6(InterfaceC4357<? super McpServerManager$Companion$saveToolConfig$6> interfaceC4357) {
        super(2, interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new McpServerManager$Companion$saveToolConfig$6(interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((McpServerManager$Companion$saveToolConfig$6) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5176 c5176 = C5176.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5185.m10210(obj);
                return c5176;
            }
            C5925.m11311(AbstractC8405.m13972(1261));
            return null;
        }
        AbstractC5185.m10210(obj);
        C5871 c5871 = C5871.f16034;
        if (c5871 != null) {
            this.label = 1;
            AbstractC8405.m13973("喵喵喵呜喵喵喵呜~喵喵喵呜呜喵喵呜~喵喵喵呜喵呜喵呜~喵喵喵喵呜喵呜呜~喵喵喵喵呜呜呜喵");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            AbstractC8405.m13972(2295);
            String strM13973 = AbstractC8405.m13973("喵喵喵呜呜喵喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵呜喵呜~喵喵喵喵喵呜呜喵~喵喵喵呜喵呜呜呜~喵喵喵呜呜呜喵喵~喵喵喵喵喵喵呜喵");
            String strM139732 = AbstractC8405.m13973("喵呜喵喵喵喵喵呜~喵呜喵呜呜喵呜呜~喵呜喵喵呜喵呜喵");
            AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
            linkedHashMap.put(strM13973, AbstractC8765.m14465(strM139732));
            String strM139733 = AbstractC8405.m13973("喵喵喵呜呜呜呜喵~喵喵喵呜喵喵喵喵~喵喵喵喵呜呜呜喵~喵喵喵喵喵喵喵喵~喵喵喵喵呜喵呜喵~喵喵喵喵呜喵喵喵");
            String strM13972 = AbstractC8405.m13972(2341);
            AbstractC8405.m13973("喵喵喵呜呜喵喵喵~喵喵喵呜喵喵喵喵~喵喵喵喵喵喵呜呜");
            linkedHashMap.put(strM139733, AbstractC8765.m14465(strM13972));
            Object objM11270 = c5871.m11270(AbstractC8765.m14464(new C7152(linkedHashMap)), this);
            if (objM11270 != coroutineSingletons) {
                objM11270 = c5176;
            }
            if (objM11270 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5176;
    }
}
