package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C0191;
import kotlin.AbstractC5170;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p052.InterfaceC6550;
import p063.InterfaceC6861;
import p088.AbstractC7175;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {113}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, k = 3, mv = {2, 3, 0})
final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements InterfaceC6550 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C5493 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(C5493 c5493, InterfaceC4356<? super JsonTreeReader$readDeepRecursive$1> interfaceC4356) {
        super(3, interfaceC4356);
        this.this$0 = c5493;
    }

    @Override // p052.InterfaceC6550
    public final Object invoke(AbstractC5170 abstractC5170, C5175 c5175, InterfaceC4356<? super AbstractC7175> interfaceC4356) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, interfaceC4356);
        jsonTreeReader$readDeepRecursive$1.L$0 = abstractC5170;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC5170 abstractC5170 = (AbstractC5170) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            byte bM672 = this.this$0.f15185.m672();
            if (bM672 == 1) {
                return this.this$0.m10667(true);
            }
            if (bM672 == 0) {
                return this.this$0.m10667(false);
            }
            C5493 c5493 = this.this$0;
            if (bM672 != 6) {
                if (bM672 == 8) {
                    return c5493.m10668();
                }
                C0191.m651(c5493.f15185, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.L$0 = null;
            this.label = 1;
            obj = C5493.m10666(c5493, abstractC5170, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return (AbstractC7175) obj;
    }
}
