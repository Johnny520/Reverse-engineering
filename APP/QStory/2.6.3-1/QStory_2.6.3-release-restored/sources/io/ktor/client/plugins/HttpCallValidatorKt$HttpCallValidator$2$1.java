package io.ktor.client.plugins;

import io.ktor.util.C5036;
import io.ktor.util.C5041;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p257.C8969;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "io.ktor.client.plugins.HttpCallValidatorKt$HttpCallValidator$2$1", m556f = "HttpCallValidator.kt", m557l = {}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;", "request", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(L飘花落叶言楪兰世苏子哲/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class HttpCallValidatorKt$HttpCallValidator$2$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ boolean $expectSuccess;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HttpCallValidatorKt$HttpCallValidator$2$1(boolean z, InterfaceC5189<? super HttpCallValidatorKt$HttpCallValidator$2$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$expectSuccess = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        HttpCallValidatorKt$HttpCallValidator$2$1 httpCallValidatorKt$HttpCallValidator$2$1 = new HttpCallValidatorKt$HttpCallValidator$2$1(this.$expectSuccess, interfaceC5189);
        httpCallValidatorKt$HttpCallValidator$2$1.L$0 = obj;
        return httpCallValidatorKt$HttpCallValidator$2$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(C8969 c8969, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((HttpCallValidatorKt$HttpCallValidator$2$1) create(c8969, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C5036 c5036 = ((C8969) this.L$0).f22800;
        C5041 c5041 = AbstractC4773.f12500;
        final boolean z = this.$expectSuccess;
        c5036.m9149(c5041, new InterfaceC7372() { // from class: io.ktor.client.plugins.飘花落叶言子楪苏世兰哲
            @Override // p068.InterfaceC7372
            public final Object invoke() {
                return Boolean.valueOf(HttpCallValidatorKt$HttpCallValidator$2$1.invokeSuspend$lambda$0(z));
            }
        });
        return C6008.f15084;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invokeSuspend$lambda$0(boolean z) {
        return z;
    }
}
