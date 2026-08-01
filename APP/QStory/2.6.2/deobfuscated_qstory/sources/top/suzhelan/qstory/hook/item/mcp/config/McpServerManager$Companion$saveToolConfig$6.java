package top.suzhelan.qstory.hook.item.mcp.config;

import com.bumptech.glide.AbstractC3056;
import java.util.LinkedHashMap;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p088.C7151;
import p325.AbstractC8757;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$Companion$saveToolConfig$6", f = "McpServerManager.kt", l = {175}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class McpServerManager$Companion$saveToolConfig$6 extends SuspendLambda implements InterfaceC6553 {
    int label;

    public McpServerManager$Companion$saveToolConfig$6(InterfaceC4356<? super McpServerManager$Companion$saveToolConfig$6> interfaceC4356) {
        super(2, interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new McpServerManager$Companion$saveToolConfig$6(interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((McpServerManager$Companion$saveToolConfig$6) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C5175 c5175 = C5175.f14739;
        if (i != 0) {
            if (i == 1) {
                AbstractC5184.m10206(obj);
                return c5175;
            }
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        C5866 c5866 = C5866.f16027;
        if (c5866 != null) {
            this.label = 1;
            "block";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            "$this$jsonObject";
            String strM6668 = "jsonrpc";
            String strM66682 = "2.0";
            "key";
            linkedHashMap.put(strM6668, AbstractC8757.m14431(strM66682));
            String strM66683 = "method";
            String strM66684 = "notifications/tools/list_changed";
            "key";
            linkedHashMap.put(strM66683, AbstractC8757.m14431(strM66684));
            Object objM11208 = c5866.m11208(AbstractC8757.m14430(new C7151(linkedHashMap)), this);
            if (objM11208 != coroutineSingletons) {
                objM11208 = c5175;
            }
            if (objM11208 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c5175;
    }
}
