package io.modelcontextprotocol.kotlin.sdk.client;

import io.modelcontextprotocol.kotlin.sdk.shared.AbstractC5143;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.channels.C6023;
import kotlinx.coroutines.channels.InterfaceC6031;
import kotlinx.coroutines.channels.InterfaceC6044;
import kotlinx.p010io.AbstractC6310;
import kotlinx.p010io.InterfaceC6316;
import p068.InterfaceC7383;
import p072.InterfaceC7490;
import p079.InterfaceC7691;
import p104.AbstractC7988;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
@InterfaceC7691(m555c = "io.modelcontextprotocol.kotlin.sdk.client.StdioClientTransport$start$3$writeJob$1", m556f = "StdioClientTransport.kt", m557l = {131}, m558m = "invokeSuspend")
public final class StdioClientTransport$start$3$writeJob$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6316 $outputStream;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AbstractC5116 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StdioClientTransport$start$3$writeJob$1(AbstractC5116 abstractC5116, InterfaceC6316 interfaceC6316, InterfaceC5189<? super StdioClientTransport$start$3$writeJob$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$outputStream = interfaceC6316;
    }

    private static final Object invokeSuspend$lambda$0() {
        return "Write coroutine started.";
    }

    private static final Object invokeSuspend$lambda$2() {
        return "Error writing to output stream";
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        StdioClientTransport$start$3$writeJob$1 stdioClientTransport$start$3$writeJob$1 = new StdioClientTransport$start$3$writeJob$1(null, this.$outputStream, interfaceC5189);
        stdioClientTransport$start$3$writeJob$1.L$0 = obj;
        return stdioClientTransport$start$3$writeJob$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((StdioClientTransport$start$3$writeJob$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:?, code lost:
    
        throw null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.飘花落叶言子楪苏哲兰世] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlinx.coroutines.channels.飘花落叶言子楪世哲兰苏] */
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
        ?? r1 = (InterfaceC6044) this.L$3;
        InterfaceC6031 interfaceC6031 = (InterfaceC6031) this.L$2;
        InterfaceC6316 interfaceC6316 = (InterfaceC6316) this.L$1;
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        try {
            try {
                AbstractC6017.m10769(obj);
                while (((Boolean) obj).booleanValue()) {
                    r1 = (C6023) r1;
                    InterfaceC7490 interfaceC7490 = (InterfaceC7490) r1.m10821();
                    interfaceC7490.getClass();
                    AbstractC7988 abstractC7988M9302 = AbstractC5143.m9302();
                    abstractC7988M9302.getClass();
                    String strConcat = abstractC7988M9302.m12983(InterfaceC7490.Companion.serializer(), interfaceC7490).concat("\n");
                    AbstractC6310.m11185(interfaceC6316, strConcat, 0, strConcat.length());
                    this.L$0 = interfaceC6233;
                    this.L$1 = interfaceC6316;
                    this.L$2 = interfaceC6031;
                    this.L$3 = r1;
                    this.label = 1;
                    obj = r1.m10823(this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                interfaceC6031.mo10815(null);
                throw null;
            } finally {
            }
        } catch (Throwable unused) {
            if (AbstractC6231.m11054(interfaceC6233)) {
                throw null;
            }
            throw null;
        }
    }
}
