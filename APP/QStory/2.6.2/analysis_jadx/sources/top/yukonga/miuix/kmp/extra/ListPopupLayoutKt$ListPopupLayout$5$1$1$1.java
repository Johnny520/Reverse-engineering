package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.C0362;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;
import top.yukonga.miuix.kmp.basic.AbstractC6018;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1", f = "ListPopupLayout.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ListPopupLayoutKt$ListPopupLayout$5$1$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $alphaProgress;
    final /* synthetic */ C0331 $dimProgress;
    final /* synthetic */ C0331 $fractionProgress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$1", f = "ListPopupLayout.kt", l = {138}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ C0331 $fractionProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0331 c0331, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$fractionProgress = c0331;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$fractionProgress, interfaceC4356);
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
                C0331 c0331 = this.$fractionProgress;
                Float f = new Float(1.0f);
                C0299 c0299 = AbstractC6018.f16437;
                this.label = 1;
                if (C0331.m1028(c0331, f, c0299, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$2", f = "ListPopupLayout.kt", l = {139}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ C0331 $alphaProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C0331 c0331, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.$alphaProgress = c0331;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(this.$alphaProgress, interfaceC4356);
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
                C0331 c0331 = this.$alphaProgress;
                Float f = new Float(1.0f);
                C0362 c0362 = AbstractC6018.f16441;
                this.label = 1;
                if (C0331.m1028(c0331, f, c0362, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$3", f = "ListPopupLayout.kt", l = {140}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ C0331 $dimProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C0331 c0331, InterfaceC4356<? super AnonymousClass3> interfaceC4356) {
            super(2, interfaceC4356);
            this.$dimProgress = c0331;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass3(this.$dimProgress, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass3) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                C0331 c0331 = this.$dimProgress;
                Float f = new Float(1.0f);
                C0362 c0362 = AbstractC6018.f16439;
                this.label = 1;
                if (C0331.m1028(c0331, f, c0362, null, null, this, 12) == coroutineSingletons) {
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
    public ListPopupLayoutKt$ListPopupLayout$5$1$1$1(C0331 c0331, C0331 c03312, C0331 c03313, InterfaceC4356<? super ListPopupLayoutKt$ListPopupLayout$5$1$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$fractionProgress = c0331;
        this.$alphaProgress = c03312;
        this.$dimProgress = c03313;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ListPopupLayoutKt$ListPopupLayout$5$1$1$1 listPopupLayoutKt$ListPopupLayout$5$1$1$1 = new ListPopupLayoutKt$ListPopupLayout$5$1$1$1(this.$fractionProgress, this.$alphaProgress, this.$dimProgress, interfaceC4356);
        listPopupLayoutKt$ListPopupLayout$5$1$1$1.L$0 = obj;
        return listPopupLayoutKt$ListPopupLayout$5$1$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ListPopupLayoutKt$ListPopupLayout$5$1$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        AbstractC5398.m10473(interfaceC5400, null, null, new AnonymousClass1(this.$fractionProgress, null), 3);
        AbstractC5398.m10473(interfaceC5400, null, null, new AnonymousClass2(this.$alphaProgress, null), 3);
        AbstractC5398.m10473(interfaceC5400, null, null, new AnonymousClass3(this.$dimProgress, null), 3);
        return C5175.f14739;
    }
}
