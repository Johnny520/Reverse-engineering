package androidx.compose.material3.internal;

import androidx.activity.AbstractC0900;
import androidx.compose.foundation.MutatePriority;
import com.alibaba.fastjson2.C3775;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5186;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C6285;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.sync.C6212;
import kotlinx.coroutines.sync.InterfaceC6215;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.internal.InternalMutatorMutex$mutateWith$2", m556f = "InternalMutatorMutex.kt", m557l = {179, 142}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, m151d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, m152k = 3, m153mv = {2, 0, 0})
final class InternalMutatorMutex$mutateWith$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7383 $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ Object $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ AbstractC1963 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InternalMutatorMutex$mutateWith$2(MutatePriority mutatePriority, AbstractC1963 abstractC1963, InterfaceC7383 interfaceC7383, Object obj, InterfaceC5189<? super InternalMutatorMutex$mutateWith$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$priority = mutatePriority;
        this.$block = interfaceC7383;
        this.$receiver = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        InternalMutatorMutex$mutateWith$2 internalMutatorMutex$mutateWith$2 = new InternalMutatorMutex$mutateWith$2(this.$priority, null, this.$block, this.$receiver, interfaceC5189);
        internalMutatorMutex$mutateWith$2.L$0 = obj;
        return internalMutatorMutex$mutateWith$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<Object> interfaceC5189) {
        return ((InternalMutatorMutex$mutateWith$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC5186 interfaceC5186 = ((InterfaceC6233) this.L$0).mo2990().get(C6285.f15450);
            interfaceC5186.getClass();
            throw null;
        }
        try {
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (this.L$2 != null) {
                    C3775.m6954();
                    return null;
                }
                AbstractC0900.m697(this.L$0);
                try {
                    AbstractC6017.m10769(obj);
                    throw null;
                } catch (Throwable unused) {
                    throw null;
                }
            }
            if (this.L$4 != null) {
                C3775.m6954();
                return null;
            }
            Object obj3 = this.L$3;
            InterfaceC7383 interfaceC7383 = (InterfaceC7383) this.L$2;
            InterfaceC6215 interfaceC6215 = (InterfaceC6215) this.L$1;
            AbstractC0900.m697(this.L$0);
            AbstractC6017.m10769(obj);
            try {
                this.L$0 = null;
                this.L$1 = interfaceC6215;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                if (interfaceC7383.invoke(obj3, this) == obj2) {
                    return obj2;
                }
                throw null;
            } catch (Throwable unused2) {
                throw null;
            }
        } catch (Throwable th) {
            ((C6212) obj2).m10991(null);
            throw th;
        }
    }
}
