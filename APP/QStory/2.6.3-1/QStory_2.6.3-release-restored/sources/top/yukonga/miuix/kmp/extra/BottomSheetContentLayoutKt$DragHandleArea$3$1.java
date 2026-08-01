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
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$3$1", m556f = "BottomSheetContentLayout.kt", m557l = {}, m558m = "invokeSuspend", m559v = 2)
@Metadata(m150d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;", "it", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;L飘花落叶言子世哲兰楪苏/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 3, 0})
final class BottomSheetContentLayoutKt$DragHandleArea$3$1 extends SuspendLambda implements InterfaceC7380 {
    final /* synthetic */ InterfaceC6233 $coroutineScope;
    final /* synthetic */ InterfaceC2232 $isPressing;
    final /* synthetic */ C1177 $pressScale;
    final /* synthetic */ C1177 $pressWidth;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$3$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$3$1$1", m556f = "BottomSheetContentLayout.kt", m557l = {681}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08311 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $pressScale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08311(C1177 c1177, InterfaceC5189<? super C08311> interfaceC5189) {
            super(2, interfaceC5189);
            this.$pressScale = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08311(this.$pressScale, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08311) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$pressScale;
                Float f = new Float(1.15f);
                C1208 c1208M1573 = AbstractC1176.m1573(100, 6, null);
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$3$1$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 3, 0})
    @InterfaceC7691(m555c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$3$1$2", m556f = "BottomSheetContentLayout.kt", m557l = {684}, m558m = "invokeSuspend", m559v = 2)
    public static final class C08322 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ C1177 $pressWidth;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C08322(C1177 c1177, InterfaceC5189<? super C08322> interfaceC5189) {
            super(2, interfaceC5189);
            this.$pressWidth = c1177;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C08322(this.$pressWidth, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C08322) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1177 c1177 = this.$pressWidth;
                Float f = new Float(55.0f);
                C1208 c1208M1573 = AbstractC1176.m1573(100, 6, null);
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
    public BottomSheetContentLayoutKt$DragHandleArea$3$1(InterfaceC2232 interfaceC2232, InterfaceC6233 interfaceC6233, C1177 c1177, C1177 c11772, InterfaceC5189<? super BottomSheetContentLayoutKt$DragHandleArea$3$1> interfaceC5189) {
        super(3, interfaceC5189);
        this.$isPressing = interfaceC2232;
        this.$coroutineScope = interfaceC6233;
        this.$pressScale = c1177;
        this.$pressWidth = c11772;
    }

    @Override // p068.InterfaceC7380
    public /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return m11961invoked4ec7I((InterfaceC6233) obj, ((C8158) obj2).f19886, (InterfaceC5189) obj3);
    }

    /* JADX INFO: renamed from: invoke-d-4ec7I, reason: not valid java name */
    public final Object m11961invoked4ec7I(InterfaceC6233 interfaceC6233, long j, InterfaceC5189<? super C6008> interfaceC5189) {
        return new BottomSheetContentLayoutKt$DragHandleArea$3$1(this.$isPressing, this.$coroutineScope, this.$pressScale, this.$pressWidth, interfaceC5189).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        ((AbstractC2184) this.$isPressing).m2995(1.0f);
        AbstractC6231.m11036(this.$coroutineScope, null, null, new C08311(this.$pressScale, null), 3);
        AbstractC6231.m11036(this.$coroutineScope, null, null, new C08322(this.$pressWidth, null), 3);
        return C6008.f15084;
    }
}
