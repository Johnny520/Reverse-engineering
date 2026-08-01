package androidx.compose.material3;

import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.foundation.interaction.InterfaceC0568;
import androidx.compose.ui.input.pointer.AbstractC1646;
import androidx.compose.ui.input.pointer.C1643;
import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", f = "Slider.kt", l = {2437}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
final class SliderKt$rangeSliderPressDragModifier$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ AbstractC1145 $rangeSliderLogic;
    final /* synthetic */ AbstractC1141 $state;
    final /* synthetic */ InterfaceC1635 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 0, 0})
    @InterfaceC6862(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", f = "Slider.kt", l = {2438, 2450, 2473}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC5401 $$this$coroutineScope;
        final /* synthetic */ AbstractC1145 $rangeSliderLogic;
        final /* synthetic */ AbstractC1141 $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 0, 0})
        @InterfaceC6862(c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", f = "Slider.kt", l = {2493}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
            final /* synthetic */ Ref$BooleanRef $draggingStart;
            final /* synthetic */ InterfaceC0568 $finishInteraction;
            final /* synthetic */ AbstractC1145 $rangeSliderLogic;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AbstractC1145 abstractC1145, Ref$BooleanRef ref$BooleanRef, InterfaceC0568 interfaceC0568, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
                super(2, interfaceC4357);
                this.$draggingStart = ref$BooleanRef;
                this.$finishInteraction = interfaceC0568;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
                return new AnonymousClass2(null, this.$draggingStart, this.$finishInteraction, interfaceC4357);
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
                    boolean z = this.$draggingStart.element;
                    throw null;
                }
                if (i == 1) {
                    AbstractC5185.m10210(obj);
                    return C5176.f14739;
                }
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC1141 abstractC1141, AbstractC1145 abstractC1145, InterfaceC5401 interfaceC5401, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$$this$coroutineScope = interfaceC5401;
        }

        private static final C5176 invokeSuspend$lambda$1(AbstractC1141 abstractC1141, Ref$BooleanRef ref$BooleanRef, C1643 c1643) {
            Float.intBitsToFloat((int) (AbstractC1646.m3031(c1643, false) >> 32));
            boolean z = ref$BooleanRef.element;
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, null, this.$$this$coroutineScope, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:?, code lost:
        
            throw null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:?, code lost:
        
            throw null;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r1 = r5.label
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L67
                if (r1 == r3) goto L5f
                if (r1 == r2) goto L29
                r0 = 3
                if (r1 == r0) goto L16
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                top.suzhelan.qstory.hook.item.C5925.m11311(r5)
                return r4
            L16:
                java.lang.Object r0 = r5.L$1
                kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref$BooleanRef) r0
                java.lang.Object r5 = r5.L$0
                androidx.compose.foundation.interaction.飘花落叶言子楪世苏兰哲 r5 = (androidx.compose.foundation.interaction.C0570) r5
                kotlin.AbstractC5185.m10210(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L28
                java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L28
                r6.getClass()     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L28
                throw r4
            L27:
                throw r4
            L28:
                throw r4
            L29:
                java.lang.Object r0 = r5.L$4
                kotlin.jvm.internal.Ref$BooleanRef r0 = (kotlin.jvm.internal.Ref$BooleanRef) r0
                java.lang.Object r1 = r5.L$3
                kotlin.jvm.internal.Ref$FloatRef r1 = (kotlin.jvm.internal.Ref$FloatRef) r1
                java.lang.Object r3 = r5.L$2
                androidx.compose.foundation.interaction.飘花落叶言子楪世苏兰哲 r3 = (androidx.compose.foundation.interaction.C0570) r3
                java.lang.Object r3 = r5.L$1
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r3 = (androidx.compose.ui.input.pointer.C1643) r3
                java.lang.Object r5 = r5.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r5 = (androidx.compose.ui.input.pointer.InterfaceC1633) r5
                kotlin.AbstractC5185.m10210(r6)
                kotlin.Pair r6 = (kotlin.Pair) r6
                if (r6 == 0) goto L5a
                androidx.compose.ui.input.pointer.飘花落叶言子世楪兰哲苏 r5 = (androidx.compose.ui.input.pointer.C1621) r5
                androidx.compose.ui.platform.飘花落叶言子哲兰苏世楪 r5 = r5.m2997()
                int r6 = r3.f4819
                int r0 = androidx.compose.material3.internal.AbstractC1126.f3271
                if (r6 != r2) goto L56
                r5.mo3278()
                int r5 = androidx.compose.material3.internal.AbstractC1126.f3271
                goto L59
            L56:
                r5.mo3278()
            L59:
                throw r4
            L5a:
                boolean r5 = r0.element
                float r5 = r1.element
                throw r4
            L5f:
                java.lang.Object r5 = r5.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r5 = (androidx.compose.ui.input.pointer.InterfaceC1633) r5
                kotlin.AbstractC5185.m10210(r6)
                goto L79
            L67:
                kotlin.AbstractC5185.m10210(r6)
                java.lang.Object r6 = r5.L$0
                androidx.compose.ui.input.pointer.飘花落叶言子楪世苏兰哲 r6 = (androidx.compose.ui.input.pointer.InterfaceC1633) r6
                r5.L$0 = r6
                r5.label = r3
                java.lang.Object r6 = androidx.compose.foundation.gestures.AbstractC0503.m1275(r6, r4, r5, r2)
                if (r6 != r0) goto L79
                return r0
            L79:
                androidx.compose.ui.input.pointer.飘花落叶言子楪哲兰世苏 r6 = (androidx.compose.ui.input.pointer.C1643) r6
                kotlin.jvm.internal.Ref$FloatRef r5 = new kotlin.jvm.internal.Ref$FloatRef
                r5.<init>()
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1$1(InterfaceC1635 interfaceC1635, AbstractC1141 abstractC1141, AbstractC1145 abstractC1145, InterfaceC4357<? super SliderKt$rangeSliderPressDragModifier$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_pointerInput = interfaceC1635;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        SliderKt$rangeSliderPressDragModifier$1$1 sliderKt$rangeSliderPressDragModifier$1$1 = new SliderKt$rangeSliderPressDragModifier$1$1(this.$this_pointerInput, null, null, interfaceC4357);
        sliderKt$rangeSliderPressDragModifier$1$1.L$0 = obj;
        return sliderKt$rangeSliderPressDragModifier$1$1;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((SliderKt$rangeSliderPressDragModifier$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
            InterfaceC1635 interfaceC1635 = this.$this_pointerInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, null, interfaceC5401, null);
            this.label = 1;
            if (AbstractC0521.m1311(interfaceC1635, anonymousClass1, this) == coroutineSingletons) {
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
