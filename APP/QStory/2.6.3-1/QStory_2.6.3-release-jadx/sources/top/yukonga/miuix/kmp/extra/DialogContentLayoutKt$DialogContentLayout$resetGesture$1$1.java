package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1208;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.InterfaceC2232;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$resetGesture$1$1", m556f = "DialogContentLayout.kt", m557l = {164, 165}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m151d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "()V"}, m152k = 3, m153mv = {2, 3, 0})
final class DialogContentLayoutKt$DialogContentLayout$resetGesture$1$1 extends SuspendLambda implements InterfaceC7387 {
    final /* synthetic */ C1177 $backProgress;
    final /* synthetic */ InterfaceC2232 $dimAlpha;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogContentLayoutKt$DialogContentLayout$resetGesture$1$1(C1177 c1177, InterfaceC2232 interfaceC2232, InterfaceC5189<? super DialogContentLayoutKt$DialogContentLayout$resetGesture$1$1> interfaceC5189) {
        super(1, interfaceC5189);
        this.$backProgress = c1177;
        this.$dimAlpha = interfaceC2232;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C6008 invokeSuspend$lambda$0(InterfaceC2232 interfaceC2232, float f, float f2) {
        ((AbstractC2184) interfaceC2232).m2995(f);
        return C6008.f15084;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(InterfaceC5189<?> interfaceC5189) {
        return new DialogContentLayoutKt$DialogContentLayout$resetGesture$1$1(this.$backProgress, this.$dimAlpha, interfaceC5189);
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DialogContentLayoutKt$DialogContentLayout$resetGesture$1$1) create(interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0059, code lost:
    
        if (androidx.compose.animation.core.AbstractC1176.m1584(r7, 1.0f, r9, r10, r11, 4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        DialogContentLayoutKt$DialogContentLayout$resetGesture$1$1 dialogContentLayoutKt$DialogContentLayout$resetGesture$1$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C1177 c1177 = this.$backProgress;
            Float f = new Float(0.0f);
            C1208 c1208M1573 = AbstractC1176.m1573(150, 6, null);
            this.label = 1;
            dialogContentLayoutKt$DialogContentLayout$resetGesture$1$1 = this;
            if (C1177.m1589(c1177, f, c1208M1573, null, null, this, 12) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                AbstractC6017.m10769(obj);
                return C6008.f15084;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        dialogContentLayoutKt$DialogContentLayout$resetGesture$1$1 = this;
        float fM2994 = ((AbstractC2184) dialogContentLayoutKt$DialogContentLayout$resetGesture$1$1.$dimAlpha).m2994();
        C1208 c1208M15732 = AbstractC1176.m1573(150, 6, null);
        C6873 c6873 = new C6873(dialogContentLayoutKt$DialogContentLayout$resetGesture$1$1.$dimAlpha, i2);
        dialogContentLayoutKt$DialogContentLayout$resetGesture$1$1.label = 2;
    }
}
