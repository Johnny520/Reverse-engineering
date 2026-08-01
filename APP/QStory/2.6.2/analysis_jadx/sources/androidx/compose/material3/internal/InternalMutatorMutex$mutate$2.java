package androidx.compose.material3.internal;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.MutatePriority;
import com.alibaba.fastjson2.C2941;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.sync.C5379;
import kotlinx.coroutines.sync.InterfaceC5382;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {179, 103}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class InternalMutatorMutex$mutate$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6557 $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AbstractC1128 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, AbstractC1128 abstractC1128, InterfaceC6557 interfaceC6557, InterfaceC4356<? super InternalMutatorMutex$mutate$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$priority = mutatePriority;
        this.$block = interfaceC6557;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.$priority, null, this.$block, interfaceC4356);
        internalMutatorMutex$mutate$2.L$0 = obj;
        return internalMutatorMutex$mutate$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<Object> interfaceC4356) {
        return ((InternalMutatorMutex$mutate$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC4353 interfaceC4353 = ((InterfaceC5400) this.L$0).mo2420().get(C5452.f15105);
            interfaceC4353.getClass();
            throw null;
        }
        try {
            if (i != 1) {
                if (i != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (this.L$2 != null) {
                    C2941.m6336();
                    return null;
                }
                AbstractC0053.m137(this.L$0);
                try {
                    AbstractC5184.m10206(obj);
                    throw null;
                } catch (Throwable unused) {
                    throw null;
                }
            }
            if (this.L$3 != null) {
                C2941.m6336();
                return null;
            }
            InterfaceC6557 interfaceC6557 = (InterfaceC6557) this.L$2;
            InterfaceC5382 interfaceC5382 = (InterfaceC5382) this.L$1;
            AbstractC0053.m137(this.L$0);
            AbstractC5184.m10206(obj);
            try {
                this.L$0 = null;
                this.L$1 = interfaceC5382;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (interfaceC6557.invoke(this) == obj2) {
                    return obj2;
                }
                throw null;
            } catch (Throwable unused2) {
                throw null;
            }
        } catch (Throwable th) {
            ((C5379) obj2).m10428(null);
            throw th;
        }
    }
}
