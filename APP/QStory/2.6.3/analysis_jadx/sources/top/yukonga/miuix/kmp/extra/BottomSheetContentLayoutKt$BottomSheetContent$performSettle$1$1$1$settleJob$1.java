package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.AbstractC0343;
import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.C0374;
import androidx.compose.animation.core.InterfaceC0358;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import p340.AbstractC8809;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
@InterfaceC6862(c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1", f = "BottomSheetContentLayout.kt", l = {379}, m = "invokeSuspend", v = 2)
public final class BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C0331 $dragOffsetY;
    final /* synthetic */ InterfaceC6558 $updateDimAlpha;
    final /* synthetic */ float $velocity;
    final /* synthetic */ float $windowHeightPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1(C0331 c0331, float f, float f2, InterfaceC6558 interfaceC6558, InterfaceC4357<? super BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$dragOffsetY = c0331;
        this.$windowHeightPx = f;
        this.$velocity = f2;
        this.$updateDimAlpha = interfaceC6558;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C5176 invokeSuspend$lambda$0(InterfaceC6558 interfaceC6558, C0331 c0331) {
        interfaceC6558.invoke(c0331.m1033());
        return C5176.f14739;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1(this.$dragOffsetY, this.$windowHeightPx, this.$velocity, this.$updateDimAlpha, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C0331 c0331 = this.$dragOffsetY;
            Float f = new Float(this.$windowHeightPx);
            C0299 c0299M14482 = AbstractC8809.m14482(0.85f, 0.4f);
            Float f2 = new Float(this.$velocity);
            C6044 c6044 = new C6044(this.$updateDimAlpha, i2);
            this.label = 1;
            Object objM1033 = c0331.m1033();
            InterfaceC0358 interfaceC0358 = c0331.f1129;
            if (c0331.m1032(new C0374(c0299M14482, interfaceC0358, objM1033, f, (AbstractC0343) interfaceC0358.mo1062().invoke(f2)), f2, c6044, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
        }
        return C5176.f14739;
    }
}
