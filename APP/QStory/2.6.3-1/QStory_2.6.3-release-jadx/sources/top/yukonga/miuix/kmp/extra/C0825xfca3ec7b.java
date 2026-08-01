package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.AbstractC1189;
import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1220;
import androidx.compose.animation.core.InterfaceC1204;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p356.AbstractC9638;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContent$performSettle$1$1$1$settleJob$1", m556f = "BottomSheetContentLayout.kt", m557l = {379}, m558m = "invokeSuspend", m559v = 2)
public final class C0825xfca3ec7b extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $dragOffsetY;
    final /* synthetic */ InterfaceC7387 $updateDimAlpha;
    final /* synthetic */ float $velocity;
    final /* synthetic */ float $windowHeightPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0825xfca3ec7b(C1177 c1177, float f, float f2, InterfaceC7387 interfaceC7387, InterfaceC5189<? super C0825xfca3ec7b> interfaceC5189) {
        super(2, interfaceC5189);
        this.$dragOffsetY = c1177;
        this.$windowHeightPx = f;
        this.$velocity = f2;
        this.$updateDimAlpha = interfaceC7387;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(InterfaceC7387 interfaceC7387, C1177 c1177) {
        interfaceC7387.invoke(c1177.m1593());
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new C0825xfca3ec7b(this.$dragOffsetY, this.$windowHeightPx, this.$velocity, this.$updateDimAlpha, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((C0825xfca3ec7b) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1177 c1177 = this.$dragOffsetY;
            Float f = new Float(this.$windowHeightPx);
            C1145 c1145M15041 = AbstractC9638.m15041(0.85f, 0.4f);
            Float f2 = new Float(this.$velocity);
            C6874 c6874 = new C6874(this.$updateDimAlpha, i2);
            this.label = 1;
            Object objM1593 = c1177.m1593();
            InterfaceC1204 interfaceC1204 = c1177.f1474;
            if (c1177.m1592(new C1220(c1145M15041, interfaceC1204, objM1593, f, (AbstractC1189) interfaceC1204.mo1622().invoke(f2)), f2, c6874, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
        }
        return C6008.f15084;
    }
}
