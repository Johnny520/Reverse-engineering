package io.ktor.client.plugins.sse;

import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.InterfaceC6028;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p261.C8982;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.sse.DefaultClientSSESession$_incoming$1", m556f = "DefaultClientSSESession.kt", m557l = {25, 30}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;", "L飘花落叶言楪兰哲子苏世/飘花落叶言子楪世苏哲兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/channels/飘花落叶言子楪兰世苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class DefaultClientSSESession$_incoming$1 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C4738 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultClientSSESession$_incoming$1(C4738 c4738, InterfaceC5189<? super DefaultClientSSESession$_incoming$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c4738;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DefaultClientSSESession$_incoming$1 defaultClientSSESession$_incoming$1 = new DefaultClientSSESession$_incoming$1(this.this$0, interfaceC5189);
        defaultClientSSESession$_incoming$1.L$0 = obj;
        return defaultClientSSESession$_incoming$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6028 interfaceC6028, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DefaultClientSSESession$_incoming$1) create(interfaceC6028, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0088, code lost:
    
        if (((kotlinx.coroutines.channels.AbstractC6043) r1).f15143.mo8992(r12, r11) == r0) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0061 -> B:36:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0076 -> B:36:0x0079). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x0088 -> B:36:0x0079). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC6028 interfaceC6028;
        InterfaceC6028 interfaceC60282;
        C8982 c8982;
        Object objM8844;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC6028 = (InterfaceC6028) this.L$0;
            C4738 c4738 = this.this$0;
            InterfaceC5084 interfaceC5084 = c4738.f12459;
            this.L$0 = interfaceC6028;
            this.label = 1;
            objM8844 = C4738.m8844(c4738, interfaceC5084, this);
            if (objM8844 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC60282 = (InterfaceC6028) this.L$0;
            AbstractC6017.m10769(obj);
            interfaceC6028 = interfaceC60282;
            C4738 c47382 = this.this$0;
            InterfaceC5084 interfaceC50842 = c47382.f12459;
            this.L$0 = interfaceC6028;
            this.label = 1;
            objM8844 = C4738.m8844(c47382, interfaceC50842, this);
            if (objM8844 != coroutineSingletons) {
                interfaceC60282 = interfaceC6028;
                obj = objM8844;
                c8982 = (C8982) obj;
                if (c8982 != null) {
                    return C6008.f15084;
                }
                String str = c8982.f22824;
                Long l = c8982.f22825;
                String str2 = c8982.f22826;
                String str3 = c8982.f22827;
                String str4 = c8982.f22828;
                this.this$0.getClass();
                if (str4 != null || str3 != null || str2 != null || l != null || str == null || this.this$0.f12456) {
                    this.this$0.getClass();
                    if (str4 != null || str3 != null || str2 != null || str != null || l == null || this.this$0.f12455) {
                        this.L$0 = interfaceC60282;
                        this.label = 2;
                    }
                }
                interfaceC6028 = interfaceC60282;
                C4738 c473822 = this.this$0;
                InterfaceC5084 interfaceC508422 = c473822.f12459;
                this.L$0 = interfaceC6028;
                this.label = 1;
                objM8844 = C4738.m8844(c473822, interfaceC508422, this);
                if (objM8844 != coroutineSingletons) {
                }
            }
            return coroutineSingletons;
        }
        interfaceC60282 = (InterfaceC6028) this.L$0;
        AbstractC6017.m10769(obj);
        c8982 = (C8982) obj;
        if (c8982 != null) {
        }
    }
}
