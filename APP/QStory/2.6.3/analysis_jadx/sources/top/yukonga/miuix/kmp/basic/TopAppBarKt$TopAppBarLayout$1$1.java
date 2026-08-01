package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C0299;
import androidx.compose.animation.core.C0331;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p340.AbstractC8809;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1", f = "TopAppBar.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
final class TopAppBarKt$TopAppBarLayout$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ C0331 $smallTitleAlpha;
    final /* synthetic */ C0331 $smallTitleTranslationY;
    final /* synthetic */ boolean $smallTitleVisible;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$1", f = "TopAppBar.kt", l = {632}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ C0299 $showSpec;
        final /* synthetic */ C0331 $smallTitleAlpha;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0331 c0331, C0299 c0299, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$smallTitleAlpha = c0331;
            this.$showSpec = c0299;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$smallTitleAlpha, this.$showSpec, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                C0331 c0331 = this.$smallTitleAlpha;
                Float f = new Float(1.0f);
                C0299 c0299 = this.$showSpec;
                this.label = 1;
                if (C0331.m1029(c0331, f, c0299, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$2", f = "TopAppBar.kt", l = {633}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ C0299 $showSpec;
        final /* synthetic */ C0331 $smallTitleTranslationY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C0331 c0331, C0299 c0299, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$smallTitleTranslationY = c0331;
            this.$showSpec = c0299;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass2(this.$smallTitleTranslationY, this.$showSpec, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                C0331 c0331 = this.$smallTitleTranslationY;
                Float f = new Float(0.0f);
                C0299 c0299 = this.$showSpec;
                this.label = 1;
                if (C0331.m1029(c0331, f, c0299, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$3", f = "TopAppBar.kt", l = {636}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ C0299 $hideSpec;
        final /* synthetic */ C0331 $smallTitleAlpha;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(C0331 c0331, C0299 c0299, InterfaceC4357<? super AnonymousClass3> interfaceC4357) {
            super(2, interfaceC4357);
            this.$smallTitleAlpha = c0331;
            this.$hideSpec = c0299;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass3(this.$smallTitleAlpha, this.$hideSpec, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass3) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                C0331 c0331 = this.$smallTitleAlpha;
                Float f = new Float(0.0f);
                C0299 c0299 = this.$hideSpec;
                this.label = 1;
                if (C0331.m1029(c0331, f, c0299, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$4", f = "TopAppBar.kt", l = {637}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass4 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ C0299 $hideSpec;
        final /* synthetic */ C0331 $smallTitleTranslationY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(C0331 c0331, C0299 c0299, InterfaceC4357<? super AnonymousClass4> interfaceC4357) {
            super(2, interfaceC4357);
            this.$smallTitleTranslationY = c0331;
            this.$hideSpec = c0299;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass4(this.$smallTitleTranslationY, this.$hideSpec, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass4) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                C0331 c0331 = this.$smallTitleTranslationY;
                Float f = new Float(20.0f);
                C0299 c0299 = this.$hideSpec;
                this.label = 1;
                if (C0331.m1029(c0331, f, c0299, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TopAppBarKt$TopAppBarLayout$1$1(boolean z, C0331 c0331, C0331 c03312, InterfaceC4357<? super TopAppBarKt$TopAppBarLayout$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$smallTitleVisible = z;
        this.$smallTitleAlpha = c0331;
        this.$smallTitleTranslationY = c03312;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TopAppBarKt$TopAppBarLayout$1$1 topAppBarKt$TopAppBarLayout$1$1 = new TopAppBarKt$TopAppBarLayout$1$1(this.$smallTitleVisible, this.$smallTitleAlpha, this.$smallTitleTranslationY, interfaceC4357);
        topAppBarKt$TopAppBarLayout$1$1.L$0 = obj;
        return topAppBarKt$TopAppBarLayout$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TopAppBarKt$TopAppBarLayout$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        boolean z = this.$smallTitleVisible;
        C0331 c0331 = this.$smallTitleAlpha;
        if (z) {
            C0299 c0299M14482 = AbstractC8809.m14482(1.0f, 0.3f);
            AbstractC5399.m10477(interfaceC5401, null, null, new AnonymousClass1(c0331, c0299M14482, null), 3);
            AbstractC5399.m10477(interfaceC5401, null, null, new AnonymousClass2(this.$smallTitleTranslationY, c0299M14482, null), 3);
        } else {
            C0299 c0299M144822 = AbstractC8809.m14482(1.0f, 0.15f);
            AbstractC5399.m10477(interfaceC5401, null, null, new AnonymousClass3(c0331, c0299M144822, null), 3);
            AbstractC5399.m10477(interfaceC5401, null, null, new AnonymousClass4(this.$smallTitleTranslationY, c0299M144822, null), 3);
        }
        return C5176.f14739;
    }
}
