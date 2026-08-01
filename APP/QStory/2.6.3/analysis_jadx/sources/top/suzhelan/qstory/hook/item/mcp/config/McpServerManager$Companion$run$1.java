package top.suzhelan.qstory.hook.item.mcp.config;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.sync.C5380;
import kotlinx.coroutines.sync.InterfaceC5383;
import p010.AbstractC6185;
import p010.AbstractC6188;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p287.AbstractC8405;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$Companion$run$1", f = "McpServerManager.kt", l = {476}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class McpServerManager$Companion$run$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ int $port;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$Companion$run$1(int i, InterfaceC4357<? super McpServerManager$Companion$run$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$port = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0$0(String str) {
        C5871 c5871 = C5871.f16034;
        AbstractC6188.m11604(str, c5871 != null ? c5871.f16039 : null);
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new McpServerManager$Companion$run$1(this.$port, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((McpServerManager$Companion$run$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5383 interfaceC5383;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC5185.m10210(obj);
            C5380 c5380 = C5871.f16031;
            int i4 = this.$port;
            this.L$0 = c5380;
            this.I$0 = i4;
            this.I$1 = 0;
            this.label = 1;
            if (c5380.m10427(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC5383 = c5380;
            i = i4;
        } else {
            if (i2 != 1) {
                C5925.m11311(AbstractC8405.m13972(1261));
                return null;
            }
            i = this.I$0;
            interfaceC5383 = (InterfaceC5383) this.L$0;
            AbstractC5185.m10210(obj);
        }
        try {
            C5871 c5871 = C5871.f16034;
            if (c5871 != null) {
                C5871.m11267(c5871);
            }
            C5871 c58712 = new C5871(new C5874(i3), i);
            C5871.f16034 = c58712;
            C5871.m11268(c58712);
            AbstractC6185.m11592(AbstractC8405.m13972(2296));
            ((C5380) interfaceC5383).m10432(null);
            return C5176.f14739;
        } catch (Throwable th) {
            ((C5380) interfaceC5383).m10432(null);
            throw th;
        }
    }
}
