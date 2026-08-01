package androidx.compose.material3.internal;

import androidx.activity.AbstractC0053;
import androidx.compose.foundation.MutatePriority;
import com.alibaba.fastjson2.C2942;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.sync.C5380;
import kotlinx.coroutines.sync.InterfaceC5383;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.internal.InternalMutatorMutex$mutate$2", f = "InternalMutatorMutex.kt", l = {179, 103}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
final class InternalMutatorMutex$mutate$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6558 $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AbstractC1128 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalMutatorMutex$mutate$2(MutatePriority mutatePriority, AbstractC1128 abstractC1128, InterfaceC6558 interfaceC6558, InterfaceC4357<? super InternalMutatorMutex$mutate$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$priority = mutatePriority;
        this.$block = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        InternalMutatorMutex$mutate$2 internalMutatorMutex$mutate$2 = new InternalMutatorMutex$mutate$2(this.$priority, null, this.$block, interfaceC4357);
        internalMutatorMutex$mutate$2.L$0 = obj;
        return internalMutatorMutex$mutate$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
        return ((InternalMutatorMutex$mutate$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC4354 interfaceC4354 = ((InterfaceC5401) this.L$0).mo2430().get(C5453.f15105);
            interfaceC4354.getClass();
            throw null;
        }
        try {
            if (i != 1) {
                if (i != 2) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (this.L$2 != null) {
                    C2942.m6394();
                    return null;
                }
                AbstractC0053.m137(this.L$0);
                try {
                    AbstractC5185.m10210(obj);
                    throw null;
                } catch (Throwable unused) {
                    throw null;
                }
            }
            if (this.L$3 != null) {
                C2942.m6394();
                return null;
            }
            InterfaceC6558 interfaceC6558 = (InterfaceC6558) this.L$2;
            InterfaceC5383 interfaceC5383 = (InterfaceC5383) this.L$1;
            AbstractC0053.m137(this.L$0);
            AbstractC5185.m10210(obj);
            try {
                this.L$0 = null;
                this.L$1 = interfaceC5383;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 2;
                if (interfaceC6558.invoke(this) == obj2) {
                    return obj2;
                }
                throw null;
            } catch (Throwable unused2) {
                throw null;
            }
        } catch (Throwable th) {
            ((C5380) obj2).m10432(null);
            throw th;
        }
    }
}
