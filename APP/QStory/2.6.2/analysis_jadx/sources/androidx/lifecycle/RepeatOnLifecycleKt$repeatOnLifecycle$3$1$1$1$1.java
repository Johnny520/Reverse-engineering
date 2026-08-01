package androidx.lifecycle;

import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.sync.C5379;
import kotlinx.coroutines.sync.InterfaceC5382;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.lifecycle.RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1", f = "RepeatOnLifecycle.kt", l = {166, 110}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6553 $block;
    final /* synthetic */ InterfaceC5382 $mutex;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(InterfaceC5382 interfaceC5382, InterfaceC6553 interfaceC6553, InterfaceC4356<? super RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$mutex = interfaceC5382;
        this.$block = interfaceC6553;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1(this.$mutex, this.$block, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC6553 interfaceC6553;
        InterfaceC5382 interfaceC5382;
        Throwable th;
        InterfaceC5382 interfaceC53822;
        InterfaceC5382 interfaceC53823;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                AbstractC5184.m10206(obj);
                InterfaceC5382 interfaceC53824 = this.$mutex;
                interfaceC6553 = this.$block;
                this.L$0 = interfaceC53824;
                this.L$1 = interfaceC6553;
                this.label = 1;
                C5379 c5379 = (C5379) interfaceC53824;
                Object objM10423 = c5379.m10423(this);
                interfaceC5382 = c5379;
                if (objM10423 != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC53822 = (InterfaceC5382) this.L$0;
                try {
                    AbstractC5184.m10206(obj);
                    interfaceC53823 = interfaceC53822;
                    ((C5379) interfaceC53823).m10428(null);
                    return C5175.f14739;
                } catch (Throwable th2) {
                    th = th2;
                    ((C5379) interfaceC53822).m10428(null);
                    throw th;
                }
            }
            interfaceC6553 = (InterfaceC6553) this.L$1;
            InterfaceC5382 interfaceC53825 = (InterfaceC5382) this.L$0;
            AbstractC5184.m10206(obj);
            interfaceC5382 = interfaceC53825;
            RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1 = new RepeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1(interfaceC6553, null);
            this.L$0 = interfaceC5382;
            this.L$1 = null;
            this.label = 2;
            if (AbstractC5398.m10503(repeatOnLifecycleKt$repeatOnLifecycle$3$1$1$1$1$1$1, this) != coroutineSingletons) {
                interfaceC53823 = interfaceC5382;
                ((C5379) interfaceC53823).m10428(null);
                return C5175.f14739;
            }
            return coroutineSingletons;
        } catch (Throwable th3) {
            InterfaceC5382 interfaceC53826 = interfaceC5382;
            th = th3;
            interfaceC53822 = interfaceC53826;
            ((C5379) interfaceC53822).m10428(null);
            throw th;
        }
    }
}
