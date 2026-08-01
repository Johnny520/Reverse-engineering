package top.suzhelan.qstory.hook.item.mcp.config;

import com.bumptech.glide.AbstractC3056;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.sync.C5379;
import kotlinx.coroutines.sync.InterfaceC5382;
import p010.AbstractC6157;
import p035.AbstractC6340;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.suzhelan.qstory.hook.item.mcp.config.McpServerManager$Companion$refreshServerForCurrentProcess$1", f = "McpServerManager.kt", l = {476}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class McpServerManager$Companion$refreshServerForCurrentProcess$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ int $port;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public McpServerManager$Companion$refreshServerForCurrentProcess$1(int i, InterfaceC4356<? super McpServerManager$Companion$refreshServerForCurrentProcess$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$port = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0$0(String str) {
        C5866 c5866 = C5866.f16027;
        AbstractC6157.m11573(str, c5866 != null ? c5866.f16032 : null);
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new McpServerManager$Companion$refreshServerForCurrentProcess$1(this.$port, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((McpServerManager$Companion$refreshServerForCurrentProcess$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5382 interfaceC5382;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        int i3 = 0;
        if (i2 == 0) {
            AbstractC5184.m10206(obj);
            C5379 c5379 = C5866.f16024;
            int i4 = this.$port;
            this.L$0 = c5379;
            this.I$0 = i4;
            this.I$1 = 0;
            this.label = 1;
            if (c5379.m10423(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            interfaceC5382 = c5379;
            i = i4;
        } else {
            if (i2 != 1) {
                C5919.m11250(AbstractC3056.m6668(-3937693499584152999L));
                return null;
            }
            i = this.I$0;
            interfaceC5382 = (InterfaceC5382) this.L$0;
            AbstractC5184.m10206(obj);
        }
        try {
            C5866.f16023.getClass();
            if (AbstractC6340.m11895()) {
                C5866 c5866 = C5866.f16027;
                if (c5866 != null) {
                    C5866.m11205(c5866);
                }
                C5866 c58662 = new C5866(new C5869(i3), i);
                C5866.f16027 = c58662;
                C5866.m11206(c58662);
            } else {
                C5866 c58663 = C5866.f16027;
                if (c58663 != null) {
                    C5866.m11205(c58663);
                }
                C5866.f16027 = null;
            }
            ((C5379) interfaceC5382).m10428(null);
            return C5175.f14739;
        } catch (Throwable th) {
            ((C5379) interfaceC5382).m10428(null);
            throw th;
        }
    }
}
