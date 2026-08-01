package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1177;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p356.AbstractC9638;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1", m556f = "BottomSheetContentLayout.kt", m557l = {139, 140, 148, 151}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $animationProgress;
    final /* synthetic */ InterfaceC2168 $currentOnDismissFinished$delegate;
    final /* synthetic */ C1177 $dragOffsetY;
    final /* synthetic */ InterfaceC2230 $internalVisible;
    final /* synthetic */ boolean $show;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1(boolean z, InterfaceC2230 interfaceC2230, C1177 c1177, C1177 c11772, InterfaceC2168 interfaceC2168, InterfaceC5189<? super BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$show = z;
        this.$internalVisible = interfaceC2230;
        this.$dragOffsetY = c1177;
        this.$animationProgress = c11772;
        this.$currentOnDismissFinished$delegate = interfaceC2168;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1(this.$show, this.$internalVisible, this.$dragOffsetY, this.$animationProgress, this.$currentOnDismissFinished$delegate, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((BottomSheetContentLayoutKt$BottomSheetContentLayout$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0094, code lost:
    
        if (r0.m1591(r1, r12) == r7) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if (androidx.compose.animation.core.C1177.m1589(r0, r4, r2, null, null, r12, 12) == r7) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c3 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$animationProgress;
                Float f = new Float(1.0f);
                C1145 c1145M15041 = AbstractC9638.m15041(0.9f, 0.38f);
                this.label = 2;
                return C1177.m1589(c1177, f, c1145M15041, null, null, this, 12) != coroutineSingletons ? coroutineSingletons : c6008;
            }
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            if (i != 3 && i != 4) {
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            this.$internalVisible.setValue(Boolean.FALSE);
            InterfaceC7372 interfaceC7372 = (InterfaceC7372) this.$currentOnDismissFinished$delegate.getValue();
            if (interfaceC7372 != null) {
                interfaceC7372.invoke();
            }
        }
        AbstractC6017.m10769(obj);
        boolean z = this.$show;
        InterfaceC2230 interfaceC2230 = this.$internalVisible;
        if (!z) {
            if (((Boolean) interfaceC2230.getValue()).booleanValue()) {
                float fFloatValue = ((Number) this.$dragOffsetY.m1593()).floatValue();
                C1177 c11772 = this.$animationProgress;
                if (fFloatValue > 0.0f) {
                    Float f2 = new Float(0.0f);
                    this.label = 3;
                } else {
                    Float f3 = new Float(0.0f);
                    C1145 c1145M150412 = AbstractC9638.m15041(0.9f, 0.38f);
                    this.label = 4;
                }
            }
        }
        interfaceC2230.setValue(Boolean.TRUE);
        C1177 c11773 = this.$dragOffsetY;
        Float f4 = new Float(0.0f);
        this.label = 1;
        if (c11773.m1591(f4, this) != coroutineSingletons) {
            C1177 c11774 = this.$animationProgress;
            Float f5 = new Float(1.0f);
            C1145 c1145M150413 = AbstractC9638.m15041(0.9f, 0.38f);
            this.label = 2;
            if (C1177.m1589(c11774, f5, c1145M150413, null, null, this, 12) != coroutineSingletons) {
            }
        }
    }
}
