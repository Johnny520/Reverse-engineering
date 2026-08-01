package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.C0362;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;
import top.yukonga.miuix.kmp.basic.AbstractC6018;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1", f = "ListPopupLayout.kt", l = {92, 93, 94}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class ListPopupLayoutKt$ListPopupLayout$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ C0331 $alphaProgress;
    final /* synthetic */ InterfaceC1333 $currentOnDismissFinished$delegate;
    final /* synthetic */ C0331 $dimProgress;
    final /* synthetic */ C0331 $fractionProgress;
    final /* synthetic */ InterfaceC1395 $internalVisible;
    final /* synthetic */ boolean $show;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$1", f = "ListPopupLayout.kt", l = {85}, m = "invokeSuspend", v = 2)
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
                C0299 c0299 = AbstractC6018.f16442;
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$2", f = "ListPopupLayout.kt", l = {86}, m = "invokeSuspend", v = 2)
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$3", f = "ListPopupLayout.kt", l = {87}, m = "invokeSuspend", v = 2)
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$4", f = "ListPopupLayout.kt", l = {90}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ C0331 $fractionProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C0331 c0331, InterfaceC4356<? super AnonymousClass4> interfaceC4356) {
            super(2, interfaceC4356);
            this.$fractionProgress = c0331;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass4(this.$fractionProgress, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass4) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                C0331 c0331 = this.$fractionProgress;
                Float f = new Float(0.0f);
                C0299 c0299 = AbstractC6018.f16442;
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$5, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6861(c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$5", f = "ListPopupLayout.kt", l = {91}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass5 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ C0331 $dimProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(C0331 c0331, InterfaceC4356<? super AnonymousClass5> interfaceC4356) {
            super(2, interfaceC4356);
            this.$dimProgress = c0331;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass5(this.$dimProgress, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass5) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                C0331 c0331 = this.$dimProgress;
                Float f = new Float(0.0f);
                C0362 c0362 = AbstractC6018.f16438;
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
    public ListPopupLayoutKt$ListPopupLayout$1$1(boolean z, InterfaceC1395 interfaceC1395, C0331 c0331, C0331 c03312, C0331 c03313, InterfaceC1333 interfaceC1333, InterfaceC4356<? super ListPopupLayoutKt$ListPopupLayout$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$show = z;
        this.$internalVisible = interfaceC1395;
        this.$alphaProgress = c0331;
        this.$fractionProgress = c03312;
        this.$dimProgress = c03313;
        this.$currentOnDismissFinished$delegate = interfaceC1333;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        ListPopupLayoutKt$ListPopupLayout$1$1 listPopupLayoutKt$ListPopupLayout$1$1 = new ListPopupLayoutKt$ListPopupLayout$1$1(this.$show, this.$internalVisible, this.$alphaProgress, this.$fractionProgress, this.$dimProgress, this.$currentOnDismissFinished$delegate, interfaceC4356);
        listPopupLayoutKt$ListPopupLayout$1$1.L$0 = obj;
        return listPopupLayoutKt$ListPopupLayout$1$1;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((ListPopupLayoutKt$ListPopupLayout$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r0.m1035(r12) != r7) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.L$0
            kotlinx.coroutines.飘花落叶言子世楪哲兰苏 r0 = (kotlinx.coroutines.InterfaceC5400) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.label
            kotlin.飘花落叶言子楪兰苏哲世 r8 = kotlin.C5175.f14739
            r9 = 3
            r10 = 2
            r2 = 1
            r11 = 0
            if (r1 == 0) goto L2a
            if (r1 == r2) goto L26
            if (r1 == r10) goto L21
            if (r1 != r9) goto L1b
            kotlin.AbstractC5184.m10206(r13)
            goto Lad
        L1b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            top.suzhelan.qstory.hook.item.C5919.m11250(r0)
            return r11
        L21:
            kotlin.AbstractC5184.m10206(r13)
            goto La0
        L26:
            kotlin.AbstractC5184.m10206(r13)
            goto L93
        L2a:
            kotlin.AbstractC5184.m10206(r13)
            boolean r1 = r12.$show
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r3 = r12.$internalVisible
            if (r1 == 0) goto L57
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3.setValue(r1)
            top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$1 r1 = new top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$1
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r2 = r12.$fractionProgress
            r1.<init>(r2, r11)
            kotlinx.coroutines.AbstractC5398.m10473(r0, r11, r11, r1, r9)
            top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$2 r1 = new top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$2
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r2 = r12.$alphaProgress
            r1.<init>(r2, r11)
            kotlinx.coroutines.AbstractC5398.m10473(r0, r11, r11, r1, r9)
            top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$3 r1 = new top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$3
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r2 = r12.$dimProgress
            r1.<init>(r2, r11)
            kotlinx.coroutines.AbstractC5398.m10473(r0, r11, r11, r1, r9)
            return r8
        L57:
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L64
            goto Lc1
        L64:
            top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$4 r1 = new top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$4
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r3 = r12.$fractionProgress
            r1.<init>(r3, r11)
            kotlinx.coroutines.AbstractC5398.m10473(r0, r11, r11, r1, r9)
            top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$5 r1 = new top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$5
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r3 = r12.$dimProgress
            r1.<init>(r3, r11)
            kotlinx.coroutines.AbstractC5398.m10473(r0, r11, r11, r1, r9)
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r0 = r12.$alphaProgress
            java.lang.Float r1 = new java.lang.Float
            r3 = 0
            r1.<init>(r3)
            androidx.compose.animation.core.飘花落叶言子苏兰楪哲世 r3 = top.yukonga.miuix.kmp.basic.AbstractC6018.f16440
            r12.L$0 = r11
            r12.label = r2
            r2 = r3
            r3 = 0
            r4 = 0
            r6 = 12
            r5 = r12
            java.lang.Object r0 = androidx.compose.animation.core.C0331.m1028(r0, r1, r2, r3, r4, r5, r6)
            if (r0 != r7) goto L93
            goto Lac
        L93:
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r0 = r12.$fractionProgress
            r12.L$0 = r11
            r12.label = r10
            java.lang.Object r0 = r0.m1035(r12)
            if (r0 != r7) goto La0
            goto Lac
        La0:
            androidx.compose.animation.core.飘花落叶言子楪世苏兰哲 r0 = r12.$dimProgress
            r12.L$0 = r11
            r12.label = r9
            java.lang.Object r0 = r0.m1035(r12)
            if (r0 != r7) goto Lad
        Lac:
            return r7
        Lad:
            androidx.compose.runtime.飘花落叶言子苏楪兰世哲 r0 = r12.$internalVisible
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r0.setValue(r1)
            androidx.compose.runtime.飘花落叶言子哲兰世楪苏 r0 = r12.$currentOnDismissFinished$delegate
            java.lang.Object r0 = r0.getValue()
            飘花落叶言世子哲楪兰苏.飘花落叶言子楪世苏哲兰 r0 = (p052.InterfaceC6542) r0
            if (r0 == 0) goto Lc1
            r0.invoke()
        Lc1:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
