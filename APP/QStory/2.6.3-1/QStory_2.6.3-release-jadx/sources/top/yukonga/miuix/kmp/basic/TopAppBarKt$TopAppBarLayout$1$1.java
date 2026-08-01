package top.yukonga.miuix.kmp.basic;

import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1177;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p356.AbstractC9638;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1", m556f = "TopAppBar.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class TopAppBarKt$TopAppBarLayout$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $smallTitleAlpha;
    final /* synthetic */ C1177 $smallTitleTranslationY;
    final /* synthetic */ boolean $smallTitleVisible;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$1", m556f = "TopAppBar.kt", m557l = {632}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08201 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1145 $showSpec;
        final /* synthetic */ C1177 $smallTitleAlpha;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08201(C1177 c1177, C1145 c1145, InterfaceC5189<? super C08201> interfaceC5189) {
            super(2, interfaceC5189);
            this.$smallTitleAlpha = c1177;
            this.$showSpec = c1145;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08201(this.$smallTitleAlpha, this.$showSpec, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08201) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$smallTitleAlpha;
                Float f = new Float(1.0f);
                C1145 c1145 = this.$showSpec;
                this.label = 1;
                if (C1177.m1589(c1177, f, c1145, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$2", m556f = "TopAppBar.kt", m557l = {633}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08212 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1145 $showSpec;
        final /* synthetic */ C1177 $smallTitleTranslationY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08212(C1177 c1177, C1145 c1145, InterfaceC5189<? super C08212> interfaceC5189) {
            super(2, interfaceC5189);
            this.$smallTitleTranslationY = c1177;
            this.$showSpec = c1145;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08212(this.$smallTitleTranslationY, this.$showSpec, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08212) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$smallTitleTranslationY;
                Float f = new Float(0.0f);
                C1145 c1145 = this.$showSpec;
                this.label = 1;
                if (C1177.m1589(c1177, f, c1145, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$3", m556f = "TopAppBar.kt", m557l = {636}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08223 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1145 $hideSpec;
        final /* synthetic */ C1177 $smallTitleAlpha;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08223(C1177 c1177, C1145 c1145, InterfaceC5189<? super C08223> interfaceC5189) {
            super(2, interfaceC5189);
            this.$smallTitleAlpha = c1177;
            this.$hideSpec = c1145;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08223(this.$smallTitleAlpha, this.$hideSpec, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08223) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$smallTitleAlpha;
                Float f = new Float(0.0f);
                C1145 c1145 = this.$hideSpec;
                this.label = 1;
                if (C1177.m1589(c1177, f, c1145, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$4 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.basic.TopAppBarKt$TopAppBarLayout$1$1$4", m556f = "TopAppBar.kt", m557l = {637}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08234 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1145 $hideSpec;
        final /* synthetic */ C1177 $smallTitleTranslationY;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08234(C1177 c1177, C1145 c1145, InterfaceC5189<? super C08234> interfaceC5189) {
            super(2, interfaceC5189);
            this.$smallTitleTranslationY = c1177;
            this.$hideSpec = c1145;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08234(this.$smallTitleTranslationY, this.$hideSpec, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08234) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$smallTitleTranslationY;
                Float f = new Float(20.0f);
                C1145 c1145 = this.$hideSpec;
                this.label = 1;
                if (C1177.m1589(c1177, f, c1145, null, null, this, 12) == coroutineSingletons) {
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
    public TopAppBarKt$TopAppBarLayout$1$1(boolean z, C1177 c1177, C1177 c11772, InterfaceC5189<? super TopAppBarKt$TopAppBarLayout$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$smallTitleVisible = z;
        this.$smallTitleAlpha = c1177;
        this.$smallTitleTranslationY = c11772;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TopAppBarKt$TopAppBarLayout$1$1 topAppBarKt$TopAppBarLayout$1$1 = new TopAppBarKt$TopAppBarLayout$1$1(this.$smallTitleVisible, this.$smallTitleAlpha, this.$smallTitleTranslationY, interfaceC5189);
        topAppBarKt$TopAppBarLayout$1$1.L$0 = obj;
        return topAppBarKt$TopAppBarLayout$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TopAppBarKt$TopAppBarLayout$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        boolean z = this.$smallTitleVisible;
        C1177 c1177 = this.$smallTitleAlpha;
        if (z) {
            C1145 c1145M15041 = AbstractC9638.m15041(1.0f, 0.3f);
            AbstractC6231.m11036(interfaceC6233, null, null, new C08201(c1177, c1145M15041, null), 3);
            AbstractC6231.m11036(interfaceC6233, null, null, new C08212(this.$smallTitleTranslationY, c1145M15041, null), 3);
        } else {
            C1145 c1145M150412 = AbstractC9638.m15041(1.0f, 0.15f);
            AbstractC6231.m11036(interfaceC6233, null, null, new C08223(c1177, c1145M150412, null), 3);
            AbstractC6231.m11036(interfaceC6233, null, null, new C08234(this.$smallTitleTranslationY, c1145M150412, null), 3);
        }
        return C6008.f15084;
    }
}
