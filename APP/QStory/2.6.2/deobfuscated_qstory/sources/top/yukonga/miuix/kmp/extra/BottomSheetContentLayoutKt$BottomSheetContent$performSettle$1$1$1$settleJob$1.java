package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.AbstractC0343;
import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.C0374;
import androidx.compose.animation.core.InterfaceC0358;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import p340.AbstractC8815;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
@InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1", f = "BottomSheetContentLayout.kt", l = {379}, m = "invokeSuspend", v = 2)
public final class BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $dragOffsetY;
    final /* synthetic */ InterfaceC6557 $updateDimAlpha;
    final /* synthetic */ float $velocity;
    final /* synthetic */ float $windowHeightPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1(C0331 c0331, float f, float f2, InterfaceC6557 interfaceC6557, InterfaceC4356<? super BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$dragOffsetY = c0331;
        this.$windowHeightPx = f;
        this.$velocity = f2;
        this.$updateDimAlpha = interfaceC6557;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5175 invokeSuspend$lambda$0(InterfaceC6557 interfaceC6557, C0331 c0331) {
        interfaceC6557.invoke(c0331.m1032());
        return C5175.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1(this.$dragOffsetY, this.$windowHeightPx, this.$velocity, this.$updateDimAlpha, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C0331 c0331 = this.$dragOffsetY;
            Float f = new Float(this.$windowHeightPx);
            C0299 c0299M14460 = AbstractC8815.m14460(0.85f, 0.4f);
            Float f2 = new Float(this.$velocity);
            C6038 c6038 = new C6038(this.$updateDimAlpha, i2);
            this.label = 1;
            Object objM1032 = c0331.m1032();
            InterfaceC0358 interfaceC0358 = c0331.f1129;
            if (c0331.m1031(new C0374(c0299M14460, interfaceC0358, objM1032, f, (AbstractC0343) interfaceC0358.mo1061().invoke(f2)), f2, c6038, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
