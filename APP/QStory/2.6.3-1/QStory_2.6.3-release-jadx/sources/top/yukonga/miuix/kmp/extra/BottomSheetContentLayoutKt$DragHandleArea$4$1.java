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
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$4$1", m556f = "BottomSheetContentLayout.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "velocity", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, m152k = 3, m153mv = {2, 3, 0})
final class BottomSheetContentLayoutKt$DragHandleArea$4$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC6233 $coroutineScope;
    final /* synthetic */ InterfaceC2232 $isPressing;
    final /* synthetic */ InterfaceC7387 $onSettle;
    final /* synthetic */ C1177 $pressScale;
    final /* synthetic */ C1177 $pressWidth;
    /* synthetic */ float F$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$4$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$4$1$1", m556f = "BottomSheetContentLayout.kt", m557l = {690}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08331 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $pressScale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08331(C1177 c1177, InterfaceC5189<? super C08331> interfaceC5189) {
            super(2, interfaceC5189);
            this.$pressScale = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08331(this.$pressScale, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08331) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$pressScale;
                Float f = new Float(1.0f);
                C1208 c1208M1573 = AbstractC1176.m1573(150, 6, null);
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$4$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$4$1$2", m556f = "BottomSheetContentLayout.kt", m557l = {693}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08342 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $pressWidth;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08342(C1177 c1177, InterfaceC5189<? super C08342> interfaceC5189) {
            super(2, interfaceC5189);
            this.$pressWidth = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08342(this.$pressWidth, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08342) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$pressWidth;
                Float f = new Float(45.0f);
                C1208 c1208M1573 = AbstractC1176.m1573(150, 6, null);
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
    public BottomSheetContentLayoutKt$DragHandleArea$4$1(InterfaceC2232 interfaceC2232, InterfaceC6233 interfaceC6233, InterfaceC7387 interfaceC7387, C1177 c1177, C1177 c11772, InterfaceC5189<? super BottomSheetContentLayoutKt$DragHandleArea$4$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$isPressing = interfaceC2232;
        this.$coroutineScope = interfaceC6233;
        this.$onSettle = interfaceC7387;
        this.$pressScale = c1177;
        this.$pressWidth = c11772;
    }

    public final Object invoke(InterfaceC6233 interfaceC6233, float f, InterfaceC5189<? super C6008> interfaceC5189) {
        BottomSheetContentLayoutKt$DragHandleArea$4$1 bottomSheetContentLayoutKt$DragHandleArea$4$1 = new BottomSheetContentLayoutKt$DragHandleArea$4$1(this.$isPressing, this.$coroutineScope, this.$onSettle, this.$pressScale, this.$pressWidth, interfaceC5189);
        bottomSheetContentLayoutKt$DragHandleArea$4$1.F$0 = f;
        return bottomSheetContentLayoutKt$DragHandleArea$4$1.invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.F$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        ((AbstractC2184) this.$isPressing).m2995(0.0f);
        AbstractC6231.m11036(this.$coroutineScope, null, null, new C08331(this.$pressScale, null), 3);
        AbstractC6231.m11036(this.$coroutineScope, null, null, new C08342(this.$pressWidth, null), 3);
        this.$onSettle.invoke(new Float(f));
        return C6008.f15084;
    }

    @Override // p068.InterfaceC7380
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC6233) obj, ((Number) obj2).floatValue(), (InterfaceC5189<? super C6008>) obj3);
    }
}
