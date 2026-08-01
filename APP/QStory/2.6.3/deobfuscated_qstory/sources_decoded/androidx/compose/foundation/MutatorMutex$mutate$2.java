package androidx.compose.foundation;

import com.android.dx.io.Opcodes;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4354;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C5453;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import kotlinx.coroutines.sync.C5380;
import kotlinx.coroutines.sync.InterfaceC5383;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.MutatorMutex$mutate$2", f = "MutatorMutex.kt", l = {Opcodes.REM_INT_LIT16, 127}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"R", "Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class MutatorMutex$mutate$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6558 $block;
    final /* synthetic */ MutatePriority $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ C1087 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MutatorMutex$mutate$2(MutatePriority mutatePriority, C1087 c1087, InterfaceC6558 interfaceC6558, InterfaceC4357<? super MutatorMutex$mutate$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$priority = mutatePriority;
        this.this$0 = c1087;
        this.$block = interfaceC6558;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(this.$priority, this.this$0, this.$block, interfaceC4357);
        mutatorMutex$mutate$2.L$0 = obj;
        return mutatorMutex$mutate$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<Object> interfaceC4357) {
        return ((MutatorMutex$mutate$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C1091 c1091;
        C1087 c1087;
        InterfaceC6558 interfaceC6558;
        InterfaceC5383 interfaceC5383;
        C1087 c10872;
        Throwable th;
        C1091 c10912;
        InterfaceC5383 interfaceC53832;
        AtomicReference atomicReference;
        AtomicReference atomicReference2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        ?? r1 = this.label;
        try {
            try {
                if (r1 == 0) {
                    AbstractC5185.m10210(obj);
                    InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
                    MutatePriority mutatePriority = this.$priority;
                    InterfaceC4354 interfaceC4354 = interfaceC5401.mo2430().get(C5453.f15105);
                    interfaceC4354.getClass();
                    c1091 = new C1091(mutatePriority, (InterfaceC5452) interfaceC4354);
                    C1087.m2002(this.this$0, c1091);
                    c1087 = this.this$0;
                    C5380 c5380 = c1087.f3214;
                    InterfaceC6558 interfaceC65582 = this.$block;
                    this.L$0 = c1091;
                    this.L$1 = c5380;
                    this.L$2 = interfaceC65582;
                    this.L$3 = c1087;
                    this.label = 1;
                    if (c5380.m10427(this) != coroutineSingletons) {
                        interfaceC6558 = interfaceC65582;
                        interfaceC5383 = c5380;
                    }
                    return coroutineSingletons;
                }
                if (r1 != 1) {
                    if (r1 != 2) {
                        C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    c10872 = (C1087) this.L$2;
                    InterfaceC5383 interfaceC53833 = (InterfaceC5383) this.L$1;
                    c10912 = (C1091) this.L$0;
                    try {
                        AbstractC5185.m10210(obj);
                        interfaceC53832 = interfaceC53833;
                        atomicReference2 = c10872.f3215;
                        while (!atomicReference2.compareAndSet(c10912, null) && atomicReference2.get() == c10912) {
                        }
                        ((C5380) interfaceC53832).m10432(null);
                        return obj;
                    } catch (Throwable th2) {
                        th = th2;
                        atomicReference = c10872.f3215;
                        while (!atomicReference.compareAndSet(c10912, null)) {
                        }
                        throw th;
                    }
                }
                C1087 c10873 = (C1087) this.L$3;
                interfaceC6558 = (InterfaceC6558) this.L$2;
                InterfaceC5383 interfaceC53834 = (InterfaceC5383) this.L$1;
                C1091 c10913 = (C1091) this.L$0;
                AbstractC5185.m10210(obj);
                c1087 = c10873;
                c1091 = c10913;
                interfaceC5383 = interfaceC53834;
                this.L$0 = c1091;
                this.L$1 = interfaceC5383;
                this.L$2 = c1087;
                this.L$3 = null;
                this.label = 2;
                Object objInvoke = interfaceC6558.invoke(this);
                if (objInvoke != coroutineSingletons) {
                    c10872 = c1087;
                    obj = objInvoke;
                    c10912 = c1091;
                    interfaceC53832 = interfaceC5383;
                    atomicReference2 = c10872.f3215;
                    while (!atomicReference2.compareAndSet(c10912, null)) {
                    }
                    ((C5380) interfaceC53832).m10432(null);
                    return obj;
                }
                return coroutineSingletons;
            } catch (Throwable th3) {
                c10872 = c1087;
                th = th3;
                c10912 = c1091;
                atomicReference = c10872.f3215;
                while (!atomicReference.compareAndSet(c10912, null) && atomicReference.get() == c10912) {
                }
                throw th;
            }
        } catch (Throwable th4) {
            ((C5380) r1).m10432(null);
            throw th4;
        }
    }
}
