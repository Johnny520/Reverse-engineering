package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.C0362;
import androidx.compose.foundation.layout.InterfaceC0608;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.platform.InterfaceC1871;
import com.android.dx.io.Opcodes;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p075.C6957;
import p205.InterfaceC7895;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$1$1", f = "DialogContentLayout.kt", l = {124, 138, 142}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class DialogContentLayoutKt$DialogContentLayout$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $animationProgress;
    final /* synthetic */ InterfaceC1333 $currentOnDismissFinished$delegate;
    final /* synthetic */ InterfaceC7895 $density;
    final /* synthetic */ C0331 $dimProgress;
    final /* synthetic */ InterfaceC0608 $imeInsets;
    final /* synthetic */ InterfaceC1395 $internalVisible;
    final /* synthetic */ boolean $isLargeScreen;
    final /* synthetic */ InterfaceC1871 $keyboardController;
    final /* synthetic */ boolean $show;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$1$1$1", f = "DialogContentLayout.kt", l = {123}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ C0331 $dimProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0331 c0331, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$dimProgress = c0331;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$dimProgress, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                C0331 c0331 = this.$dimProgress;
                Float f = new Float(1.0f);
                C0362 c0362M1012 = AbstractC0330.m1012(300, 2, new C6957(25));
                this.label = 1;
                if (C0331.m1028(c0331, f, c0362M1012, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$1$1$2", f = "DialogContentLayout.kt", l = {137}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ C0331 $dimProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C0331 c0331, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.$dimProgress = c0331;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(this.$dimProgress, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                C0331 c0331 = this.$dimProgress;
                Float f = new Float(0.0f);
                C0362 c0362M1012 = AbstractC0330.m1012(Opcodes.INVOKE_POLYMORPHIC, 2, new C6957(25));
                this.label = 1;
                if (C0331.m1028(c0331, f, c0362M1012, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogContentLayoutKt$DialogContentLayout$1$1(boolean z, InterfaceC1395 interfaceC1395, C0331 c0331, boolean z2, InterfaceC0608 interfaceC0608, InterfaceC7895 interfaceC7895, InterfaceC1871 interfaceC1871, C0331 c03312, InterfaceC1333 interfaceC1333, InterfaceC4356<? super DialogContentLayoutKt$DialogContentLayout$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$show = z;
        this.$internalVisible = interfaceC1395;
        this.$animationProgress = c0331;
        this.$isLargeScreen = z2;
        this.$imeInsets = interfaceC0608;
        this.$density = interfaceC7895;
        this.$keyboardController = interfaceC1871;
        this.$dimProgress = c03312;
        this.$currentOnDismissFinished$delegate = interfaceC1333;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        DialogContentLayoutKt$DialogContentLayout$1$1 dialogContentLayoutKt$DialogContentLayout$1$1 = new DialogContentLayoutKt$DialogContentLayout$1$1(this.$show, this.$internalVisible, this.$animationProgress, this.$isLargeScreen, this.$imeInsets, this.$density, this.$keyboardController, this.$dimProgress, this.$currentOnDismissFinished$delegate, interfaceC4356);
        dialogContentLayoutKt$DialogContentLayout$1$1.L$0 = obj;
        return dialogContentLayoutKt$DialogContentLayout$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((DialogContentLayoutKt$DialogContentLayout$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d7, code lost:
    
        if (r0.m1035(r11) == r7) goto L35;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 239
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.extra.DialogContentLayoutKt$DialogContentLayout$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
