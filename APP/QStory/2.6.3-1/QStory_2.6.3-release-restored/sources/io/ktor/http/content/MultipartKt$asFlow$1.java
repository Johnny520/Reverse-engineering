package io.ktor.http.content;

import io.ktor.http.cio.C4791;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC6150;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.http.content.MultipartKt$asFlow$1", m556f = "Multipart.kt", m557l = {112, 113}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;", "Lio/ktor/http/content/飘花落叶言子楪哲兰苏世;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/flow/飘花落叶言子楪苏世兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class MultipartKt$asFlow$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC4809 $this_asFlow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$asFlow$1(InterfaceC4809 interfaceC4809, InterfaceC5189<? super MultipartKt$asFlow$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_asFlow = interfaceC4809;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MultipartKt$asFlow$1 multipartKt$asFlow$1 = new MultipartKt$asFlow$1(this.$this_asFlow, interfaceC5189);
        multipartKt$asFlow$1.L$0 = obj;
        return multipartKt$asFlow$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6150 interfaceC6150, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MultipartKt$asFlow$1) create(interfaceC6150, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004c -> B:7:0x0013). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6150 interfaceC6150;
        InterfaceC6150 interfaceC61502;
        AbstractC4821 abstractC4821;
        Object objM8908;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            interfaceC6150 = (InterfaceC6150) this.L$0;
            InterfaceC4809 interfaceC4809 = this.$this_asFlow;
            this.L$0 = interfaceC6150;
            this.label = 1;
            objM8908 = ((C4791) interfaceC4809).m8908(this);
            if (objM8908 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            interfaceC61502 = (InterfaceC6150) this.L$0;
            AbstractC6017.m10769(obj);
            interfaceC6150 = interfaceC61502;
            InterfaceC4809 interfaceC48092 = this.$this_asFlow;
            this.L$0 = interfaceC6150;
            this.label = 1;
            objM8908 = ((C4791) interfaceC48092).m8908(this);
            if (objM8908 != coroutineSingletons) {
                interfaceC61502 = interfaceC6150;
                obj = objM8908;
                abstractC4821 = (AbstractC4821) obj;
                if (abstractC4821 != null) {
                    return C6008.f15084;
                }
                this.L$0 = interfaceC61502;
                this.label = 2;
            }
            return coroutineSingletons;
        }
        interfaceC61502 = (InterfaceC6150) this.L$0;
        AbstractC6017.m10769(obj);
        abstractC4821 = (AbstractC4821) obj;
        if (abstractC4821 != null) {
        }
    }
}
