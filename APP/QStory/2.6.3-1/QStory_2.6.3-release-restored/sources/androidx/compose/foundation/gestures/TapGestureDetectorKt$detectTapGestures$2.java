package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", m556f = "TapGestureDetector.kt", m557l = {104}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7387 $onDoubleTap;
    final /* synthetic */ InterfaceC7387 $onLongPress;
    final /* synthetic */ InterfaceC7380 $onPress;
    final /* synthetic */ InterfaceC7387 $onTap;
    final /* synthetic */ InterfaceC2470 $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", m556f = "TapGestureDetector.kt", m557l = {105}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00461 extends RestrictedSuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6233 $$this$coroutineScope;
        final /* synthetic */ InterfaceC7387 $onDoubleTap;
        final /* synthetic */ InterfaceC7387 $onLongPress;
        final /* synthetic */ InterfaceC7380 $onPress;
        final /* synthetic */ InterfaceC7387 $onTap;
        final /* synthetic */ C1394 $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00461(InterfaceC6233 interfaceC6233, C1394 c1394, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC7380 interfaceC7380, InterfaceC7387 interfaceC73873, InterfaceC5189<? super C00461> interfaceC5189) {
            super(2, interfaceC5189);
            this.$$this$coroutineScope = interfaceC6233;
            this.$pressScope = c1394;
            this.$onDoubleTap = interfaceC7387;
            this.$onLongPress = interfaceC73872;
            this.$onPress = interfaceC7380;
            this.$onTap = interfaceC73873;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00461 c00461 = new C00461(this.$$this$coroutineScope, this.$pressScope, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, interfaceC5189);
            c00461.L$0 = obj;
            return c00461;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00461) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC2468 interfaceC2468 = (InterfaceC2468) this.L$0;
                InterfaceC6233 interfaceC6233 = this.$$this$coroutineScope;
                C1394 c1394 = this.$pressScope;
                InterfaceC7387 interfaceC7387 = this.$onDoubleTap;
                InterfaceC7387 interfaceC73872 = this.$onLongPress;
                InterfaceC7380 interfaceC7380 = this.$onPress;
                InterfaceC7387 interfaceC73873 = this.$onTap;
                this.label = 1;
                if (AbstractC1344.m1840(interfaceC2468, interfaceC6233, c1394, interfaceC7387, interfaceC73872, interfaceC7380, interfaceC73873, this) == coroutineSingletons) {
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
    public TapGestureDetectorKt$detectTapGestures$2(InterfaceC2470 interfaceC2470, InterfaceC7387 interfaceC7387, InterfaceC7387 interfaceC73872, InterfaceC7380 interfaceC7380, InterfaceC7387 interfaceC73873, InterfaceC5189<? super TapGestureDetectorKt$detectTapGestures$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_detectTapGestures = interfaceC2470;
        this.$onDoubleTap = interfaceC7387;
        this.$onLongPress = interfaceC73872;
        this.$onPress = interfaceC7380;
        this.$onTap = interfaceC73873;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, interfaceC5189);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            C1394 c1394 = new C1394(this.$this_detectTapGestures);
            InterfaceC2470 interfaceC2470 = this.$this_detectTapGestures;
            C00461 c00461 = new C00461(interfaceC6233, c1394, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, null);
            this.label = 1;
            if (AbstractC1362.m1871(interfaceC2470, c00461, this) == coroutineSingletons) {
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
