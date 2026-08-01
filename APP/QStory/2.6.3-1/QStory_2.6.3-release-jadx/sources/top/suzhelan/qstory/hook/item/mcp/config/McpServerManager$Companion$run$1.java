package top.suzhelan.qstory.hook.item.mcp.config;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p026.AbstractC7014;
import p026.AbstractC7017;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p303.AbstractC9234;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$Companion$run$1", m556f = "McpServerManager.kt", m557l = {476}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class McpServerManager$Companion$run$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ int $port;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$Companion$run$1(int i, InterfaceC5189<? super McpServerManager$Companion$run$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$port = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0$0(String str) {
        C6701 c6701 = C6701.f16379;
        AbstractC7017.m12163(str, c6701 != null ? c6701.f16384 : null);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new McpServerManager$Companion$run$1(this.$port, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((McpServerManager$Companion$run$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6215 interfaceC6215;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC6017.m10769(obj);
            C6212 c6212 = C6701.f16376;
            int i4 = this.$port;
            this.L$0 = c6212;
            this.I$0 = i4;
            this.I$1 = 0;
            this.label = 1;
            if (c6212.m10986(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC6215 = c6212;
            i = i4;
        } else {
            if (i2 != 1) {
                C6755.m11870(AbstractC9234.m14531(1261));
                return null;
            }
            i = this.I$0;
            interfaceC6215 = (InterfaceC6215) this.L$0;
            AbstractC6017.m10769(obj);
        }
        try {
            C6701 c6701 = C6701.f16379;
            if (c6701 != null) {
                C6701.m11826(c6701);
            }
            C6701 c67012 = new C6701(new C6704(i3), i);
            C6701.f16379 = c67012;
            C6701.m11827(c67012);
            AbstractC7014.m12151(AbstractC9234.m14531(2296));
            ((C6212) interfaceC6215).m10991(null);
            return C6008.f15084;
        } catch (Throwable th) {
            ((C6212) interfaceC6215).m10991(null);
            throw th;
        }
    }
}
