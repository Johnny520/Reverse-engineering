package io.modelcontextprotocol.kotlin.sdk.server;

import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.server.StdioServerTransport$start$2", m556f = "StdioServerTransport.kt", m557l = {55, 63, 63, 63}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class StdioServerTransport$start$2 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AbstractC5129 this$0;

    public StdioServerTransport$start$2(AbstractC5129 abstractC5129, InterfaceC5189<? super StdioServerTransport$start$2> interfaceC5189) {
        super(2, interfaceC5189);
    }

    private static final Object invokeSuspend$lambda$0() {
        return "Error reading from stdin";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        StdioServerTransport$start$2 stdioServerTransport$start$2 = new StdioServerTransport$start$2(null, interfaceC5189);
        stdioServerTransport$start$2.L$0 = obj;
        return stdioServerTransport$start$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StdioServerTransport$start$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6233 interfaceC6233;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC6233 = (InterfaceC6233) this.L$0;
        } else {
            if (i != 1) {
                if (i == 2 || i == 3) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                if (i != 4) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Throwable th = (Throwable) this.L$0;
                AbstractC6017.m10769(obj);
                throw th;
            }
            interfaceC6233 = (InterfaceC6233) this.L$0;
            try {
                AbstractC6017.m10769(obj);
            } catch (Throwable th2) {
                this.L$0 = th2;
                this.L$1 = null;
                this.label = 4;
                throw null;
            }
        }
        if (AbstractC6231.m11054(interfaceC6233)) {
            throw null;
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
        throw null;
    }
}
