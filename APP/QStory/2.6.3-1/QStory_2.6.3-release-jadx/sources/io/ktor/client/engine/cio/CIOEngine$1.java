package io.ktor.client.engine.cio;

import io.ktor.network.selector.C4835;
import io.ktor.network.selector.InterfaceC4838;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.CIOEngine$1", m556f = "CIOEngine.kt", m557l = {67, 70, 70}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class CIOEngine$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6284 $requestJob;
    final /* synthetic */ InterfaceC4838 $selector;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CIOEngine$1(InterfaceC6284 interfaceC6284, InterfaceC4838 interfaceC4838, InterfaceC5189<? super CIOEngine$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$requestJob = interfaceC6284;
        this.$selector = interfaceC4838;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new CIOEngine$1(this.$requestJob, this.$selector, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CIOEngine$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6 == r0) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6285 c6285 = C6285.f15450;
        try {
        } catch (Throwable th) {
            ((C4835) this.$selector).close();
            InterfaceC5186 interfaceC5186 = ((C4835) this.$selector).f12602.get(c6285);
            interfaceC5186.getClass();
            this.L$0 = th;
            this.label = 3;
            if (((InterfaceC6284) interfaceC5186).mo11123(this) != obj2) {
                throw th;
            }
        }
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6284 interfaceC6284 = this.$requestJob;
            this.label = 1;
            if (interfaceC6284.mo11123(this) != obj2) {
            }
            return obj2;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            if (i != 3) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Throwable th2 = (Throwable) this.L$0;
            AbstractC6017.m10769(obj);
            throw th2;
        }
        AbstractC6017.m10769(obj);
        ((C4835) this.$selector).close();
        InterfaceC5186 interfaceC51862 = ((C4835) this.$selector).f12602.get(c6285);
        interfaceC51862.getClass();
        this.label = 2;
        this = ((InterfaceC6284) interfaceC51862).mo11123(this);
    }
}
