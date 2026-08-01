package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1208;
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
import top.suzhelan.qstory.hook.item.C6755;
import top.yukonga.miuix.kmp.basic.AbstractC6854;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1", m556f = "ListPopupLayout.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class ListPopupLayoutKt$ListPopupLayout$5$1$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $alphaProgress;
    final /* synthetic */ C1177 $dimProgress;
    final /* synthetic */ C1177 $fractionProgress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$1", m556f = "ListPopupLayout.kt", m557l = {138}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08421 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $fractionProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08421(C1177 c1177, InterfaceC5189<? super C08421> interfaceC5189) {
            super(2, interfaceC5189);
            this.$fractionProgress = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08421(this.$fractionProgress, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08421) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$fractionProgress;
                Float f = new Float(1.0f);
                C1145 c1145 = AbstractC6854.f16791;
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$2", m556f = "ListPopupLayout.kt", m557l = {139}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08432 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $alphaProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08432(C1177 c1177, InterfaceC5189<? super C08432> interfaceC5189) {
            super(2, interfaceC5189);
            this.$alphaProgress = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08432(this.$alphaProgress, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08432) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$alphaProgress;
                Float f = new Float(1.0f);
                C1208 c1208 = AbstractC6854.f16795;
                this.label = 1;
                if (C1177.m1589(c1177, f, c1208, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$5$1$1$1$3", m556f = "ListPopupLayout.kt", m557l = {140}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08443 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $dimProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08443(C1177 c1177, InterfaceC5189<? super C08443> interfaceC5189) {
            super(2, interfaceC5189);
            this.$dimProgress = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08443(this.$dimProgress, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08443) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$dimProgress;
                Float f = new Float(1.0f);
                C1208 c1208 = AbstractC6854.f16793;
                this.label = 1;
                if (C1177.m1589(c1177, f, c1208, null, null, this, 12) == coroutineSingletons) {
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
    public ListPopupLayoutKt$ListPopupLayout$5$1$1$1(C1177 c1177, C1177 c11772, C1177 c11773, InterfaceC5189<? super ListPopupLayoutKt$ListPopupLayout$5$1$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$fractionProgress = c1177;
        this.$alphaProgress = c11772;
        this.$dimProgress = c11773;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ListPopupLayoutKt$ListPopupLayout$5$1$1$1 listPopupLayoutKt$ListPopupLayout$5$1$1$1 = new ListPopupLayoutKt$ListPopupLayout$5$1$1$1(this.$fractionProgress, this.$alphaProgress, this.$dimProgress, interfaceC5189);
        listPopupLayoutKt$ListPopupLayout$5$1$1$1.L$0 = obj;
        return listPopupLayoutKt$ListPopupLayout$5$1$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ListPopupLayoutKt$ListPopupLayout$5$1$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
        AbstractC6231.m11036(interfaceC6233, null, null, new C08421(this.$fractionProgress, null), 3);
        AbstractC6231.m11036(interfaceC6233, null, null, new C08432(this.$alphaProgress, null), 3);
        AbstractC6231.m11036(interfaceC6233, null, null, new C08443(this.$dimProgress, null), 3);
        return C6008.f15084;
    }
}
