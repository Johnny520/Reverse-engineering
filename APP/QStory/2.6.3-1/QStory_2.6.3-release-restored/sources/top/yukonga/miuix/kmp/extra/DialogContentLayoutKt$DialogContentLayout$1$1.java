package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.AbstractC1176;
import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1208;
import androidx.compose.foundation.layout.InterfaceC1449;
import androidx.compose.p001ui.platform.C2736;
import androidx.compose.p001ui.platform.InterfaceC2706;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import com.android.p002dx.p005io.Opcodes;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p091.C7787;
import p221.InterfaceC8725;
import p356.AbstractC9638;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$1$1", m556f = "DialogContentLayout.kt", m557l = {124, 138, 142}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class DialogContentLayoutKt$DialogContentLayout$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $animationProgress;
    final /* synthetic */ InterfaceC2168 $currentOnDismissFinished$delegate;
    final /* synthetic */ InterfaceC8725 $density;
    final /* synthetic */ C1177 $dimProgress;
    final /* synthetic */ InterfaceC1449 $imeInsets;
    final /* synthetic */ InterfaceC2230 $internalVisible;
    final /* synthetic */ boolean $isLargeScreen;
    final /* synthetic */ InterfaceC2706 $keyboardController;
    final /* synthetic */ boolean $show;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$1$1$1", m556f = "DialogContentLayout.kt", m557l = {123}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08351 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $dimProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08351(C1177 c1177, InterfaceC5189<? super C08351> interfaceC5189) {
            super(2, interfaceC5189);
            this.$dimProgress = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08351(this.$dimProgress, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08351) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$dimProgress;
                Float f = new Float(1.0f);
                C1208 c1208M1573 = AbstractC1176.m1573(300, 2, new C7787(24));
                this.label = 1;
                if (C1177.m1589(c1177, f, c1208M1573, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$1$1$2", m556f = "DialogContentLayout.kt", m557l = {137}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08362 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $dimProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08362(C1177 c1177, InterfaceC5189<? super C08362> interfaceC5189) {
            super(2, interfaceC5189);
            this.$dimProgress = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08362(this.$dimProgress, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08362) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$dimProgress;
                Float f = new Float(0.0f);
                C1208 c1208M1573 = AbstractC1176.m1573(Opcodes.INVOKE_POLYMORPHIC, 2, new C7787(24));
                this.label = 1;
                if (C1177.m1589(c1177, f, c1208M1573, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogContentLayoutKt$DialogContentLayout$1$1(boolean z, InterfaceC2230 interfaceC2230, C1177 c1177, boolean z2, InterfaceC1449 interfaceC1449, InterfaceC8725 interfaceC8725, InterfaceC2706 interfaceC2706, C1177 c11772, InterfaceC2168 interfaceC2168, InterfaceC5189<? super DialogContentLayoutKt$DialogContentLayout$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$show = z;
        this.$internalVisible = interfaceC2230;
        this.$animationProgress = c1177;
        this.$isLargeScreen = z2;
        this.$imeInsets = interfaceC1449;
        this.$density = interfaceC8725;
        this.$keyboardController = interfaceC2706;
        this.$dimProgress = c11772;
        this.$currentOnDismissFinished$delegate = interfaceC2168;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        DialogContentLayoutKt$DialogContentLayout$1$1 dialogContentLayoutKt$DialogContentLayout$1$1 = new DialogContentLayoutKt$DialogContentLayout$1$1(this.$show, this.$internalVisible, this.$animationProgress, this.$isLargeScreen, this.$imeInsets, this.$density, this.$keyboardController, this.$dimProgress, this.$currentOnDismissFinished$delegate, interfaceC5189);
        dialogContentLayoutKt$DialogContentLayout$1$1.L$0 = obj;
        return dialogContentLayoutKt$DialogContentLayout$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((DialogContentLayoutKt$DialogContentLayout$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        if (r0.m1596(r11) == r7) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InterfaceC2706 interfaceC2706;
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            boolean z = this.$show;
            InterfaceC2230 interfaceC2230 = this.$internalVisible;
            if (z) {
                interfaceC2230.setValue(Boolean.TRUE);
                AbstractC6231.m11036(interfaceC6233, null, null, new C08351(this.$dimProgress, null), 3);
                C1177 c1177 = this.$animationProgress;
                Float f = new Float(1.0f);
                C1145 c1145M15041 = this.$isLargeScreen ? AbstractC9638.m15041(0.9f, 0.3f) : new C1145(0.88f, 450.0f, new Float(1.0E-4f));
                this.L$0 = null;
                this.label = 1;
                return C1177.m1589(c1177, f, c1145M15041, null, null, this, 12) == coroutineSingletons ? coroutineSingletons : c6008;
            }
            if (((Boolean) interfaceC2230.getValue()).booleanValue()) {
                if (this.$imeInsets.mo1932(this.$density) > 0 && (interfaceC2706 = this.$keyboardController) != null) {
                    ((C2736) interfaceC2706).m4156();
                }
                AbstractC6231.m11036(interfaceC6233, null, null, new C08362(this.$dimProgress, null), 3);
                C1177 c11772 = this.$animationProgress;
                Float f2 = new Float(0.0f);
                C1208 c1208M1573 = AbstractC1176.m1573(260, 2, new C7787(24));
                this.L$0 = null;
                this.label = 2;
                if (C1177.m1589(c11772, f2, c1208M1573, null, null, this, 12) != coroutineSingletons) {
                }
            }
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
            return c6008;
        }
        if (i != 2) {
            if (i != 3) {
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
        C1177 c11773 = this.$dimProgress;
        this.L$0 = null;
        this.label = 3;
    }
}
