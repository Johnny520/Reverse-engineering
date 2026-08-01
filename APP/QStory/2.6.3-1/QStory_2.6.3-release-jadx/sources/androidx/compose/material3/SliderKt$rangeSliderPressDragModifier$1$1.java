package androidx.compose.material3;

import androidx.compose.foundation.gestures.AbstractC1344;
import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.foundation.interaction.InterfaceC1409;
import androidx.compose.material3.internal.AbstractC1961;
import androidx.compose.p001ui.input.pointer.AbstractC2481;
import androidx.compose.p001ui.input.pointer.C2456;
import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.platform.InterfaceC2698;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1", m556f = "Slider.kt", m557l = {2437}, m558m = "invokeSuspend")
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
final class SliderKt$rangeSliderPressDragModifier$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ AbstractC1980 $rangeSliderLogic;
    final /* synthetic */ AbstractC1976 $state;
    final /* synthetic */ InterfaceC2470 $this_pointerInput;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 0, 0})
    @InterfaceC7691(m555c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1", m556f = "Slider.kt", m557l = {2438, 2450, 2473}, m558m = "invokeSuspend")
    public static final class C01511 extends RestrictedSuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6233 $$this$coroutineScope;
        final /* synthetic */ AbstractC1980 $rangeSliderLogic;
        final /* synthetic */ AbstractC1976 $state;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX INFO: renamed from: androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 0, 0})
        @InterfaceC7691(m555c = "androidx.compose.material3.SliderKt$rangeSliderPressDragModifier$1$1$1$2", m556f = "Slider.kt", m557l = {2493}, m558m = "invokeSuspend")
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ Ref$BooleanRef $draggingStart;
            final /* synthetic */ InterfaceC1409 $finishInteraction;
            final /* synthetic */ AbstractC1980 $rangeSliderLogic;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(AbstractC1980 abstractC1980, Ref$BooleanRef ref$BooleanRef, InterfaceC1409 interfaceC1409, InterfaceC5189<? super AnonymousClass2> interfaceC5189) {
                super(2, interfaceC5189);
                this.$draggingStart = ref$BooleanRef;
                this.$finishInteraction = interfaceC1409;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass2(null, this.$draggingStart, this.$finishInteraction, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    boolean z = this.$draggingStart.element;
                    throw null;
                }
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    return C6008.f15084;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01511(AbstractC1976 abstractC1976, AbstractC1980 abstractC1980, InterfaceC6233 interfaceC6233, InterfaceC5189<? super C01511> interfaceC5189) {
            super(2, interfaceC5189);
            this.$$this$coroutineScope = interfaceC6233;
        }

        private static final C6008 invokeSuspend$lambda$1(AbstractC1976 abstractC1976, Ref$BooleanRef ref$BooleanRef, C2478 c2478) {
            Float.intBitsToFloat((int) (AbstractC2481.m3591(c2478, false) >> 32));
            boolean z = ref$BooleanRef.element;
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C01511 c01511 = new C01511(null, null, this.$$this$coroutineScope, interfaceC5189);
            c01511.L$0 = obj;
            return c01511;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01511) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
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
        */
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC2468 interfaceC2468 = (InterfaceC2468) this.L$0;
                this.L$0 = interfaceC2468;
                this.label = 1;
                obj = AbstractC1344.m1835(interfaceC2468, null, this, 2);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        try {
                            AbstractC6017.m10769(obj);
                            ((Boolean) obj).getClass();
                            throw null;
                        } catch (CancellationException unused) {
                            throw null;
                        }
                    }
                    Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) this.L$4;
                    Ref$FloatRef ref$FloatRef = (Ref$FloatRef) this.L$3;
                    C2478 c2478 = (C2478) this.L$1;
                    InterfaceC2468 interfaceC24682 = (InterfaceC2468) this.L$0;
                    AbstractC6017.m10769(obj);
                    if (((Pair) obj) == null) {
                        boolean z = ref$BooleanRef.element;
                        float f = ref$FloatRef.element;
                        throw null;
                    }
                    InterfaceC2698 interfaceC2698M3557 = ((C2456) interfaceC24682).m3557();
                    int i2 = c2478.f5164;
                    int i3 = AbstractC1961.f3616;
                    if (i2 != 2) {
                        interfaceC2698M3557.mo3838();
                        throw null;
                    }
                    interfaceC2698M3557.mo3838();
                    int i4 = AbstractC1961.f3616;
                    throw null;
                }
                AbstractC6017.m10769(obj);
            }
            new Ref$FloatRef();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderKt$rangeSliderPressDragModifier$1$1(InterfaceC2470 interfaceC2470, AbstractC1976 abstractC1976, AbstractC1980 abstractC1980, InterfaceC5189<? super SliderKt$rangeSliderPressDragModifier$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_pointerInput = interfaceC2470;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        SliderKt$rangeSliderPressDragModifier$1$1 sliderKt$rangeSliderPressDragModifier$1$1 = new SliderKt$rangeSliderPressDragModifier$1$1(this.$this_pointerInput, null, null, interfaceC5189);
        sliderKt$rangeSliderPressDragModifier$1$1.L$0 = obj;
        return sliderKt$rangeSliderPressDragModifier$1$1;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((SliderKt$rangeSliderPressDragModifier$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            InterfaceC2470 interfaceC2470 = this.$this_pointerInput;
            C01511 c01511 = new C01511(null, null, interfaceC6233, null);
            this.label = 1;
            if (AbstractC1362.m1871(interfaceC2470, c01511, this) == coroutineSingletons) {
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
