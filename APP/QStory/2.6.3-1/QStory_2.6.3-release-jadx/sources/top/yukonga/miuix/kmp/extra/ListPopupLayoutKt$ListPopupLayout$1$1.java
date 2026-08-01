package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.C1145;
import androidx.compose.animation.core.C1177;
import androidx.compose.animation.core.C1208;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
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
import top.suzhelan.qstory.hook.item.C6755;
import top.yukonga.miuix.kmp.basic.AbstractC6854;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1", m556f = "ListPopupLayout.kt", m557l = {92, 93, 94}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class ListPopupLayoutKt$ListPopupLayout$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ C1177 $alphaProgress;
    final /* synthetic */ InterfaceC2168 $currentOnDismissFinished$delegate;
    final /* synthetic */ C1177 $dimProgress;
    final /* synthetic */ C1177 $fractionProgress;
    final /* synthetic */ InterfaceC2230 $internalVisible;
    final /* synthetic */ boolean $show;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$1", m556f = "ListPopupLayout.kt", m557l = {85}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08371 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $fractionProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08371(C1177 c1177, InterfaceC5189<? super C08371> interfaceC5189) {
            super(2, interfaceC5189);
            this.$fractionProgress = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08371(this.$fractionProgress, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08371) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$fractionProgress;
                Float f = new Float(1.0f);
                C1145 c1145 = AbstractC6854.f16796;
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$2", m556f = "ListPopupLayout.kt", m557l = {86}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08382 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $alphaProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08382(C1177 c1177, InterfaceC5189<? super C08382> interfaceC5189) {
            super(2, interfaceC5189);
            this.$alphaProgress = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08382(this.$alphaProgress, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08382) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$3 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$3", m556f = "ListPopupLayout.kt", m557l = {87}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08393 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $dimProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08393(C1177 c1177, InterfaceC5189<? super C08393> interfaceC5189) {
            super(2, interfaceC5189);
            this.$dimProgress = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08393(this.$dimProgress, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08393) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$4 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$4", m556f = "ListPopupLayout.kt", m557l = {90}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08404 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $fractionProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08404(C1177 c1177, InterfaceC5189<? super C08404> interfaceC5189) {
            super(2, interfaceC5189);
            this.$fractionProgress = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08404(this.$fractionProgress, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08404) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$fractionProgress;
                Float f = new Float(0.0f);
                C1145 c1145 = AbstractC6854.f16796;
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$5 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.ListPopupLayoutKt$ListPopupLayout$1$1$5", m556f = "ListPopupLayout.kt", m557l = {91}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08415 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $dimProgress;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08415(C1177 c1177, InterfaceC5189<? super C08415> interfaceC5189) {
            super(2, interfaceC5189);
            this.$dimProgress = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08415(this.$dimProgress, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08415) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$dimProgress;
                Float f = new Float(0.0f);
                C1208 c1208 = AbstractC6854.f16792;
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
    public ListPopupLayoutKt$ListPopupLayout$1$1(boolean z, InterfaceC2230 interfaceC2230, C1177 c1177, C1177 c11772, C1177 c11773, InterfaceC2168 interfaceC2168, InterfaceC5189<? super ListPopupLayoutKt$ListPopupLayout$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$show = z;
        this.$internalVisible = interfaceC2230;
        this.$alphaProgress = c1177;
        this.$fractionProgress = c11772;
        this.$dimProgress = c11773;
        this.$currentOnDismissFinished$delegate = interfaceC2168;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        ListPopupLayoutKt$ListPopupLayout$1$1 listPopupLayoutKt$ListPopupLayout$1$1 = new ListPopupLayoutKt$ListPopupLayout$1$1(this.$show, this.$internalVisible, this.$alphaProgress, this.$fractionProgress, this.$dimProgress, this.$currentOnDismissFinished$delegate, interfaceC5189);
        listPopupLayoutKt$ListPopupLayout$1$1.L$0 = obj;
        return listPopupLayoutKt$ListPopupLayout$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((ListPopupLayoutKt$ListPopupLayout$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00aa, code lost:
    
        if (r0.m1596(r12) != r7) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
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
                AbstractC6231.m11036(interfaceC6233, null, null, new C08371(this.$fractionProgress, null), 3);
                AbstractC6231.m11036(interfaceC6233, null, null, new C08382(this.$alphaProgress, null), 3);
                AbstractC6231.m11036(interfaceC6233, null, null, new C08393(this.$dimProgress, null), 3);
                return c6008;
            }
            if (((Boolean) interfaceC2230.getValue()).booleanValue()) {
                AbstractC6231.m11036(interfaceC6233, null, null, new C08404(this.$fractionProgress, null), 3);
                AbstractC6231.m11036(interfaceC6233, null, null, new C08415(this.$dimProgress, null), 3);
                C1177 c1177 = this.$alphaProgress;
                Float f = new Float(0.0f);
                C1208 c1208 = AbstractC6854.f16794;
                this.L$0 = null;
                this.label = 1;
                if (C1177.m1589(c1177, f, c1208, null, null, this, 12) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            return c6008;
        }
        if (i == 1) {
            AbstractC6017.m10769(obj);
        } else {
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
                return c6008;
            }
            AbstractC6017.m10769(obj);
            C1177 c11772 = this.$dimProgress;
            this.L$0 = null;
            this.label = 3;
        }
        C1177 c11773 = this.$fractionProgress;
        this.L$0 = null;
        this.label = 2;
        if (c11773.m1596(this) != coroutineSingletons) {
            C1177 c117722 = this.$dimProgress;
            this.L$0 = null;
            this.label = 3;
        }
        return coroutineSingletons;
    }
}
