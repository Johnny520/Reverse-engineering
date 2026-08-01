package top.suzhelan.qstory.hook.item.mcp.config;

import java.util.LinkedHashMap;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p104.C7981;
import p345.AbstractC9594;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$Companion$saveToolConfig$6", m556f = "McpServerManager.kt", m557l = {175}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class McpServerManager$Companion$saveToolConfig$6 extends SuspendLambda implements InterfaceC7383 {
    int label;

    public McpServerManager$Companion$saveToolConfig$6(InterfaceC5189<? super McpServerManager$Companion$saveToolConfig$6> interfaceC5189) {
        super(2, interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new McpServerManager$Companion$saveToolConfig$6(interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((McpServerManager$Companion$saveToolConfig$6) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C6701 c6701 = C6701.f16379;
        if (c6701 != null) {
            this.label = 1;
            "block";
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            "$this$jsonObject";
            String strM14532 = "jsonrpc";
            String strM145322 = "2.0";
            "key";
            linkedHashMap.put(strM14532, AbstractC9594.m15024(strM145322));
            String strM145323 = "method";
            String strM14531 = "notifications/tools/list_changed";
            "key";
            linkedHashMap.put(strM145323, AbstractC9594.m15024(strM14531));
            Object objM11829 = c6701.m11829(AbstractC9594.m15023(new C7981(linkedHashMap)), this);
            if (objM11829 != coroutineSingletons) {
                objM11829 = c6008;
            }
            if (objM11829 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return c6008;
    }
}
