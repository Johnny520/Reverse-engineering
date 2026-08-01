package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C0191;
import kotlin.AbstractC5171;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6551;
import p063.InterfaceC6862;
import p088.AbstractC7176;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {113}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, k = 3, mv = {2, 3, 0})
final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements InterfaceC6551 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5494 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(C5494 c5494, InterfaceC4357<? super JsonTreeReader$readDeepRecursive$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.this$0 = c5494;
    }

    @Override // p052.InterfaceC6551
    public final Object invoke(AbstractC5171 abstractC5171, C5176 c5176, InterfaceC4357<? super AbstractC7176> interfaceC4357) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, interfaceC4357);
        jsonTreeReader$readDeepRecursive$1.L$0 = abstractC5171;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC5171 abstractC5171 = (AbstractC5171) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            byte bM673 = this.this$0.f15185.m673();
            if (bM673 == 1) {
                return this.this$0.m10702(true);
            }
            if (bM673 == 0) {
                return this.this$0.m10702(false);
            }
            C5494 c5494 = this.this$0;
            if (bM673 != 6) {
                if (bM673 == 8) {
                    return c5494.m10703();
                }
                C0191.m652(c5494.f15185, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.L$0 = null;
            this.label = 1;
            obj = C5494.m10701(c5494, abstractC5171, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return (AbstractC7176) obj;
    }
}
