package androidx.compose.foundation;

import com.android.dx.io.Opcodes;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4353;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5452;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import kotlinx.coroutines.sync.C5379;
import kotlinx.coroutines.sync.InterfaceC5382;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.MutatorMutex$mutateWith$2", f = "MutatorMutex.kt", l = {Opcodes.REM_INT_LIT16, 167}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class MutatorMutex$mutateWith$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $block;
    final /* synthetic */ MutatePriority $priority;
    final /* synthetic */ Object $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ C1087 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutateWith$2(MutatePriority mutatePriority, C1087 c1087, InterfaceC6553 interfaceC6553, Object obj, InterfaceC4356<? super MutatorMutex$mutateWith$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$priority = mutatePriority;
        this.this$0 = c1087;
        this.$block = interfaceC6553;
        this.$receiver = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        MutatorMutex$mutateWith$2 mutatorMutex$mutateWith$2 = new MutatorMutex$mutateWith$2(this.$priority, this.this$0, this.$block, this.$receiver, interfaceC4356);
        mutatorMutex$mutateWith$2.L$0 = obj;
        return mutatorMutex$mutateWith$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<Object> interfaceC4356) {
        return ((MutatorMutex$mutateWith$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1091 c1091;
        C1087 c1087;
        InterfaceC6553 interfaceC6553;
        Object obj2;
        InterfaceC5382 interfaceC5382;
        C1087 c10872;
        Throwable th;
        C1091 c10912;
        InterfaceC5382 interfaceC53822;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    AbstractC5184.m10206(obj);
                    InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    InterfaceC4353 interfaceC4353 = interfaceC5400.mo2420().get(C5452.f15105);
                    interfaceC4353.getClass();
                    c1091 = new C1091(mutatePriority, (InterfaceC5451) interfaceC4353);
                    C1087.m1992(this.this$0, c1091);
                    c1087 = this.this$0;
                    C5379 c5379 = c1087.f3213;
                    interfaceC6553 = this.$block;
                    Object obj3 = this.$receiver;
                    this.L$0 = c1091;
                    this.L$1 = c5379;
                    this.L$2 = interfaceC6553;
                    this.L$3 = obj3;
                    this.L$4 = c1087;
                    this.label = 1;
                    if (c5379.m10423(this) != coroutineSingletons) {
                        obj2 = obj3;
                        interfaceC5382 = c5379;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c10872 = (C1087) this.L$2;
                    InterfaceC5382 interfaceC53823 = (InterfaceC5382) this.L$1;
                    c10912 = (C1091) this.L$0;
                    try {
                        AbstractC5184.m10206(obj);
                        interfaceC53822 = interfaceC53823;
                        atomicReference2 = c10872.f3214;
                        while (!atomicReference2.compareAndSet(c10912, null) && atomicReference2.get() == c10912) {
                        }
                        ((C5379) interfaceC53822).m10428(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = c10872.f3214;
                        while (!atomicReference.compareAndSet(c10912, null)) {
                        }
                        throw th;
                    }
                }
                C1087 c10873 = (C1087) this.L$4;
                obj2 = this.L$3;
                InterfaceC6553 interfaceC65532 = (InterfaceC6553) this.L$2;
                InterfaceC5382 interfaceC53824 = (InterfaceC5382) this.L$1;
                C1091 c10913 = (C1091) this.L$0;
                AbstractC5184.m10206(obj);
                interfaceC6553 = interfaceC65532;
                interfaceC5382 = interfaceC53824;
                c1087 = c10873;
                c1091 = c10913;
                this.L$0 = c1091;
                this.L$1 = interfaceC5382;
                this.L$2 = c1087;
                this.L$3 = null;
                this.L$4 = null;
                this.label = 2;
                Object objInvoke = interfaceC6553.invoke(obj2, this);
                if (objInvoke != coroutineSingletons) {
                    c10872 = c1087;
                    obj = objInvoke;
                    c10912 = c1091;
                    interfaceC53822 = interfaceC5382;
                    atomicReference2 = c10872.f3214;
                    while (!atomicReference2.compareAndSet(c10912, null)) {
                    }
                    ((C5379) interfaceC53822).m10428(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                c10872 = c1087;
                th = th3;
                c10912 = c1091;
                atomicReference = c10872.f3214;
                while (!atomicReference.compareAndSet(c10912, null) && atomicReference.get() == c10912) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((C5379) r1).m10428(null);
            throw th4;
        }
    }
}
