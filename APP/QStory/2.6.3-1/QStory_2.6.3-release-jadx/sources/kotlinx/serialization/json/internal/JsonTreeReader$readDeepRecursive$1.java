package kotlinx.serialization.json.internal;

import androidx.appcompat.widget.C1038;
import kotlin.AbstractC6003;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p068.InterfaceC7380;
import p079.InterfaceC7691;
import p104.AbstractC8005;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", m556f = "JsonTreeReader.kt", m557l = {113}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0002*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlin/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "L飘花落叶言世苏兰哲楪子/飘花落叶言子楪苏兰哲世;", "it", "<anonymous>", "(Lkotlin/DeepRecursiveScope;V)Lkotlinx/serialization/json/JsonElement;"}, m152k = 3, m153mv = {2, 3, 0})
final class JsonTreeReader$readDeepRecursive$1 extends RestrictedSuspendLambda implements InterfaceC7380 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C6326 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonTreeReader$readDeepRecursive$1(C6326 c6326, InterfaceC5189<? super JsonTreeReader$readDeepRecursive$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.this$0 = c6326;
    }

    @Override // p068.InterfaceC7380
    public final Object invoke(AbstractC6003 abstractC6003, C6008 c6008, InterfaceC5189<? super AbstractC8005> interfaceC5189) {
        JsonTreeReader$readDeepRecursive$1 jsonTreeReader$readDeepRecursive$1 = new JsonTreeReader$readDeepRecursive$1(this.this$0, interfaceC5189);
        jsonTreeReader$readDeepRecursive$1.L$0 = abstractC6003;
        return jsonTreeReader$readDeepRecursive$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AbstractC6003 abstractC6003 = (AbstractC6003) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            byte bM1233 = this.this$0.f15530.m1233();
            if (bM1233 == 1) {
                return this.this$0.m11261(true);
            }
            if (bM1233 == 0) {
                return this.this$0.m11261(false);
            }
            C6326 c6326 = this.this$0;
            if (bM1233 != 6) {
                if (bM1233 == 8) {
                    return c6326.m11262();
                }
                C1038.m1212(c6326.f15530, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.L$0 = null;
            this.label = 1;
            obj = C6326.m11260(c6326, abstractC6003, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return (AbstractC8005) obj;
    }
}
