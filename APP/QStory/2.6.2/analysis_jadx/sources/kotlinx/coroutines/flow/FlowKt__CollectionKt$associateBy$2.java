package kotlinx.coroutines.flow;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC5184;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "kotlinx.coroutines.flow.FlowKt__CollectionKt", f = "Collection.kt", l = {365}, m = "associateBy", v = 1)
@Metadata(k = 3, mv = {2, 2, 0}, xi = 176)
final class FlowKt__CollectionKt$associateBy$2<T, K, V> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    public FlowKt__CollectionKt$associateBy$2(InterfaceC4356<? super FlowKt__CollectionKt$associateBy$2> interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        int i = this.label | Integer.MIN_VALUE;
        this.label = i;
        if ((i & Integer.MIN_VALUE) != 0) {
            this.label = i - Integer.MIN_VALUE;
        } else {
            this = new FlowKt__CollectionKt$associateBy$2<>(this);
        }
        Object obj2 = this.result;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 != 0) {
            if (i2 != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Map map = (Map) this.L$4;
            AbstractC5184.m10206(obj2);
            return map;
        }
        AbstractC5184.m10206(obj2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = linkedHashMap;
        this.I$0 = 0;
        this.I$1 = 0;
        this.label = 1;
        throw null;
    }
}
