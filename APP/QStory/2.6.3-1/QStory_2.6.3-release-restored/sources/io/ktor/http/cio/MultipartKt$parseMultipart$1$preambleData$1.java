package io.ktor.http.cio;

import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.C5074;
import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p110.C8034;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
@InterfaceC7691(m555c = "io.ktor.http.cio.MultipartKt$parseMultipart$1$preambleData$1", m556f = "Multipart.kt", m557l = {182, 183}, m558m = "invokeSuspend")
public final class MultipartKt$parseMultipart$1$preambleData$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C5074 $countedInput;
    final /* synthetic */ C8034 $firstBoundary;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultipartKt$parseMultipart$1$preambleData$1(C8034 c8034, C5074 c5074, InterfaceC5189<? super MultipartKt$parseMultipart$1$preambleData$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$firstBoundary = c8034;
        this.$countedInput = c5074;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        MultipartKt$parseMultipart$1$preambleData$1 multipartKt$parseMultipart$1$preambleData$1 = new MultipartKt$parseMultipart$1$preambleData$1(this.$firstBoundary, this.$countedInput, interfaceC5189);
        multipartKt$parseMultipart$1$preambleData$1.L$0 = obj;
        return multipartKt$parseMultipart$1$preambleData$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MultipartKt$parseMultipart$1$preambleData$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        if (((io.ktor.utils.p007io.C5081) r12).m9263(r11) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        C5058 c5058;
        MultipartKt$parseMultipart$1$preambleData$1 multipartKt$parseMultipart$1$preambleData$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            c5058 = (C5058) this.L$0;
            C8034 c8034 = this.$firstBoundary;
            C5074 c5074 = this.$countedInput;
            InterfaceC5079 interfaceC5079 = c5058.f13071;
            this.L$0 = c5058;
            this.label = 1;
            C8034 c80342 = AbstractC4801.f12552;
            multipartKt$parseMultipart$1$preambleData$1 = this;
            if (AbstractC5076.m9221(c5074, c8034, interfaceC5079, 8192L, true, multipartKt$parseMultipart$1$preambleData$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c5058 = (C5058) this.L$0;
        AbstractC6017.m10769(obj);
        multipartKt$parseMultipart$1$preambleData$1 = this;
        InterfaceC5079 interfaceC50792 = c5058.f13071;
        multipartKt$parseMultipart$1$preambleData$1.L$0 = null;
        multipartKt$parseMultipart$1$preambleData$1.label = 2;
    }
}
