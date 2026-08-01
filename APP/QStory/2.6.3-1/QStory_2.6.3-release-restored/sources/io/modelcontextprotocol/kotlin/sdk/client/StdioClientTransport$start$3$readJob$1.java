package io.modelcontextprotocol.kotlin.sdk.client;

import com.alibaba.fastjson2.C3775;
import com.bumptech.glide.AbstractC3897;
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
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.client.StdioClientTransport$start$3$readJob$1", m556f = "StdioClientTransport.kt", m557l = {60}, m558m = "invokeSuspend")
public final class StdioClientTransport$start$3$readJob$1 extends SuspendLambda implements InterfaceC7383 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AbstractC5116 this$0;

    public StdioClientTransport$start$3$readJob$1(AbstractC5116 abstractC5116, InterfaceC5189<? super StdioClientTransport$start$3$readJob$1> interfaceC5189) {
        super(2, interfaceC5189);
    }

    private static final Object invokeSuspend$lambda$0() {
        return "Read coroutine started.";
    }

    private static final Object invokeSuspend$lambda$2() {
        return "Error reading from input stream";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        StdioClientTransport$start$3$readJob$1 stdioClientTransport$start$3$readJob$1 = new StdioClientTransport$start$3$readJob$1(null, interfaceC5189);
        stdioClientTransport$start$3$readJob$1.L$0 = obj;
        return stdioClientTransport$start$3$readJob$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StdioClientTransport$start$3$readJob$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:?, code lost:
    
        throw null;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            throw null;
        }
        if (i != 1) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        if (this.L$2 != null) {
            C3775.m6954();
            return null;
        }
        AutoCloseable autoCloseable = (AutoCloseable) this.L$1;
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        try {
            try {
                AbstractC6017.m10769(obj);
                if (AbstractC6231.m11054(interfaceC6233)) {
                    throw null;
                }
                AbstractC3897.m7396(autoCloseable, null);
                return C6008.f15084;
            } finally {
            }
        } catch (Exception unused) {
            throw null;
        }
    }
}
