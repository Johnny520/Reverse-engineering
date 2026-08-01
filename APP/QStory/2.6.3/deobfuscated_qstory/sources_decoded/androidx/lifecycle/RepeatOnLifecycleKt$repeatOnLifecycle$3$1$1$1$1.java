package androidx.lifecycle;

import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.sync.C5380;
import kotlinx.coroutines.sync.InterfaceC5383;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6554 $block;
    final /* synthetic */ InterfaceC5383 $mutex;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(InterfaceC5383 interfaceC5383, InterfaceC6554 interfaceC6554, InterfaceC4357<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$mutex = interfaceC5383;
        this.$block = interfaceC6554;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.$mutex, this.$block, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6554 interfaceC6554;
        InterfaceC5383 interfaceC5383;
        Throwable th;
        InterfaceC5383 interfaceC53832;
        InterfaceC5383 interfaceC53833;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5185.m10210(obj);
                InterfaceC5383 interfaceC53834 = this.$mutex;
                interfaceC6554 = this.$block;
                this.L$0 = interfaceC53834;
                this.L$1 = interfaceC6554;
                this.label = 1;
                C5380 c5380 = (C5380) interfaceC53834;
                Object objM10427 = c5380.m10427(this);
                interfaceC5383 = c5380;
                if (objM10427 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC53832 = (InterfaceC5383) this.L$0;
                try {
                    AbstractC5185.m10210(obj);
                    interfaceC53833 = interfaceC53832;
                    ((C5380) interfaceC53833).m10432(null);
                    return C5176.f14739;
                } catch (Throwable th2) {
                    th = th2;
                    ((C5380) interfaceC53832).m10432(null);
                    throw th;
                }
            }
            interfaceC6554 = (InterfaceC6554) this.L$1;
            InterfaceC5383 interfaceC53835 = (InterfaceC5383) this.L$0;
            AbstractC5185.m10210(obj);
            interfaceC5383 = interfaceC53835;
            RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(interfaceC6554, null);
            this.L$0 = interfaceC5383;
            this.L$1 = null;
            this.label = 2;
            if (AbstractC5399.m10507(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != coroutineSingletons) {
                interfaceC53833 = interfaceC5383;
                ((C5380) interfaceC53833).m10432(null);
                return C5176.f14739;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            InterfaceC5383 interfaceC53836 = interfaceC5383;
            th = th3;
            interfaceC53832 = interfaceC53836;
            ((C5380) interfaceC53832).m10432(null);
            throw th;
        }
    }
}
