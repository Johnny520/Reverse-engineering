package io.ktor.client.engine.cio;

import io.ktor.http.cio.C4803;
import io.ktor.utils.p007io.C5058;
import io.ktor.utils.p007io.InterfaceC5079;
import io.ktor.utils.p007io.InterfaceC5084;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p252.C8927;
import p332.C9496;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子世楪兰苏哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
@InterfaceC7691(m555c = "io.ktor.client.engine.cio.UtilsKt$readResponse$2$1$body$httpBodyParser$1", m556f = "utils.kt", m557l = {201}, m558m = "invokeSuspend")
public final class UtilsKt$readResponse$2$1$body$httpBodyParser$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C4803 $connectionType;
    final /* synthetic */ long $contentLength;
    final /* synthetic */ InterfaceC5084 $input;
    final /* synthetic */ String $transferEncoding;
    final /* synthetic */ C8927 $version;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UtilsKt$readResponse$2$1$body$httpBodyParser$1(C8927 c8927, long j, String str, C4803 c4803, InterfaceC5084 interfaceC5084, InterfaceC5189<? super UtilsKt$readResponse$2$1$body$httpBodyParser$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$version = c8927;
        this.$contentLength = j;
        this.$transferEncoding = str;
        this.$connectionType = c4803;
        this.$input = interfaceC5084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        UtilsKt$readResponse$2$1$body$httpBodyParser$1 utilsKt$readResponse$2$1$body$httpBodyParser$1 = new UtilsKt$readResponse$2$1$body$httpBodyParser$1(this.$version, this.$contentLength, this.$transferEncoding, this.$connectionType, this.$input, interfaceC5189);
        utilsKt$readResponse$2$1$body$httpBodyParser$1.L$0 = obj;
        return utilsKt$readResponse$2$1$body$httpBodyParser$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C5058 c5058, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((UtilsKt$readResponse$2$1$body$httpBodyParser$1) create(c5058, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C5058 c5058 = (C5058) this.L$0;
            C8927 c8927 = this.$version;
            long j = this.$contentLength;
            String str = this.$transferEncoding;
            C4803 c4803 = this.$connectionType;
            InterfaceC5084 interfaceC5084 = this.$input;
            InterfaceC5079 interfaceC5079 = c5058.f13071;
            this.label = 1;
            if (C9496.m14925(c8927, j, str, c4803, interfaceC5084, interfaceC5079, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
