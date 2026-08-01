package io.ktor.server.response;

import io.ktor.utils.p007io.AbstractC5076;
import io.ktor.utils.p007io.AbstractC5078;
import io.ktor.utils.p007io.C5077;
import io.ktor.utils.p007io.C5081;
import io.ktor.utils.p007io.InterfaceC5079;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.p010io.InterfaceC6306;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "io.ktor.server.response.ApplicationResponseFunctionsKt$respondSource$2", m556f = "ApplicationResponseFunctions.kt", m557l = {168}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lio/ktor/utils/io/飘花落叶言子楪哲苏世兰;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class ApplicationResponseFunctionsKt$respondSource$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC6306 $source;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplicationResponseFunctionsKt$respondSource$2(InterfaceC6306 interfaceC6306, InterfaceC5189<? super ApplicationResponseFunctionsKt$respondSource$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$source = interfaceC6306;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ApplicationResponseFunctionsKt$respondSource$2 applicationResponseFunctionsKt$respondSource$2 = new ApplicationResponseFunctionsKt$respondSource$2(this.$source, interfaceC5189);
        applicationResponseFunctionsKt$respondSource$2.L$0 = obj;
        return applicationResponseFunctionsKt$respondSource$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC5079 interfaceC5079, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ApplicationResponseFunctionsKt$respondSource$2) create(interfaceC5079, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC5079 interfaceC5079 = (InterfaceC5079) this.L$0;
        InterfaceC6306 interfaceC6306 = this.$source;
        this.label = 1;
        C5077 c5077 = AbstractC5078.f13099;
        C5081 c5081 = (C5081) interfaceC5079;
        c5081.m9261().m11172(interfaceC6306);
        Object objM9245 = AbstractC5076.m9245(c5081, this);
        if (objM9245 != coroutineSingletons) {
            objM9245 = c6008;
        }
        return objM9245 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
