package top.yukonga.miuix.kmp.extra;

import androidx.compose.animation.core.AbstractC0330;
import androidx.compose.animation.core.C0331;
import androidx.compose.animation.core.C0362;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.InterfaceC1397;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6862(c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$4$1", f = "BottomSheetContentLayout.kt", l = {}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "", "velocity", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;F)V"}, k = 3, mv = {2, 3, 0})
final class BottomSheetContentLayoutKt$DragHandleArea$4$1 extends SuspendLambda implements InterfaceC6551 {
    final /* synthetic */ InterfaceC5401 $coroutineScope;
    final /* synthetic */ InterfaceC1397 $isPressing;
    final /* synthetic */ InterfaceC6558 $onSettle;
    final /* synthetic */ C0331 $pressScale;
    final /* synthetic */ C0331 $pressWidth;
    /* synthetic */ float F$0;
    int label;

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$4$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$4$1$1", f = "BottomSheetContentLayout.kt", l = {690}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ C0331 $pressScale;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C0331 c0331, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$pressScale = c0331;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$pressScale, interfaceC4357);
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
                C0331 c0331 = this.$pressScale;
                Float f = new Float(1.0f);
                C0362 c0362M1013 = AbstractC0330.m1013(150, 6, null);
                this.label = 1;
                if (C0331.m1029(c0331, f, c0362M1013, null, null, this, 12) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$4$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 3, 0})
    @InterfaceC6862(c = "top.yukonga.miuix.kmp.extra.BottomSheetContentLayoutKt$DragHandleArea$4$1$2", f = "BottomSheetContentLayout.kt", l = {693}, m = "invokeSuspend", v = 2)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ C0331 $pressWidth;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(C0331 c0331, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$pressWidth = c0331;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass2(this.$pressWidth, interfaceC4357);
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
                C0331 c0331 = this.$pressWidth;
                Float f = new Float(45.0f);
                C0362 c0362M1013 = AbstractC0330.m1013(150, 6, null);
                this.label = 1;
                if (C0331.m1029(c0331, f, c0362M1013, null, null, this, 12) == coroutineSingletons) {
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
    public BottomSheetContentLayoutKt$DragHandleArea$4$1(InterfaceC1397 interfaceC1397, InterfaceC5401 interfaceC5401, InterfaceC6558 interfaceC6558, C0331 c0331, C0331 c03312, InterfaceC4357<? super BottomSheetContentLayoutKt$DragHandleArea$4$1> interfaceC4357) {
        super(3, interfaceC4357);
        this.$isPressing = interfaceC1397;
        this.$coroutineScope = interfaceC5401;
        this.$onSettle = interfaceC6558;
        this.$pressScale = c0331;
        this.$pressWidth = c03312;
    }

    public final Object invoke(InterfaceC5401 interfaceC5401, float f, InterfaceC4357<? super C5176> interfaceC4357) {
        BottomSheetContentLayoutKt$DragHandleArea$4$1 bottomSheetContentLayoutKt$DragHandleArea$4$1 = new BottomSheetContentLayoutKt$DragHandleArea$4$1(this.$isPressing, this.$coroutineScope, this.$onSettle, this.$pressScale, this.$pressWidth, interfaceC4357);
        bottomSheetContentLayoutKt$DragHandleArea$4$1.F$0 = f;
        return bottomSheetContentLayoutKt$DragHandleArea$4$1.invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        float f = this.F$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        ((AbstractC1349) this.$isPressing).m2435(0.0f);
        AbstractC5399.m10477(this.$coroutineScope, null, null, new AnonymousClass1(this.$pressScale, null), 3);
        AbstractC5399.m10477(this.$coroutineScope, null, null, new AnonymousClass2(this.$pressWidth, null), 3);
        this.$onSettle.invoke(new Float(f));
        return C5176.f14739;
    }

    @Override // p052.InterfaceC6551
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((InterfaceC5401) obj, ((Number) obj2).floatValue(), (InterfaceC4357<? super C5176>) obj3);
    }
}
