package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import p052.InterfaceC6550;
import p052.InterfaceC6553;
import p052.InterfaceC6557;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC6557 $onDoubleTap;
    final /* synthetic */ InterfaceC6557 $onLongPress;
    final /* synthetic */ InterfaceC6550 $onPress;
    final /* synthetic */ InterfaceC6557 $onTap;
    final /* synthetic */ InterfaceC1635 $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC5400 $$this$coroutineScope;
        final /* synthetic */ InterfaceC6557 $onDoubleTap;
        final /* synthetic */ InterfaceC6557 $onLongPress;
        final /* synthetic */ InterfaceC6550 $onPress;
        final /* synthetic */ InterfaceC6557 $onTap;
        final /* synthetic */ C0553 $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5400 interfaceC5400, C0553 c0553, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, InterfaceC6550 interfaceC6550, InterfaceC6557 interfaceC65573, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$$this$coroutineScope = interfaceC5400;
            this.$pressScope = c0553;
            this.$onDoubleTap = interfaceC6557;
            this.$onLongPress = interfaceC65572;
            this.$onPress = interfaceC6550;
            this.$onTap = interfaceC65573;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$pressScope, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC1633, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                InterfaceC1633 interfaceC1633 = (InterfaceC1633) this.L$0;
                InterfaceC5400 interfaceC5400 = this.$$this$coroutineScope;
                C0553 c0553 = this.$pressScope;
                InterfaceC6557 interfaceC6557 = this.$onDoubleTap;
                InterfaceC6557 interfaceC65572 = this.$onLongPress;
                InterfaceC6550 interfaceC6550 = this.$onPress;
                InterfaceC6557 interfaceC65573 = this.$onTap;
                this.label = 1;
                if (AbstractC0503.m1270(interfaceC1633, interfaceC5400, c0553, interfaceC6557, interfaceC65572, interfaceC6550, interfaceC65573, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            return C5175.f14739;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapGestures$2(InterfaceC1635 interfaceC1635, InterfaceC6557 interfaceC6557, InterfaceC6557 interfaceC65572, InterfaceC6550 interfaceC6550, InterfaceC6557 interfaceC65573, InterfaceC4356<? super TapGestureDetectorKt$detectTapGestures$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_detectTapGestures = interfaceC1635;
        this.$onDoubleTap = interfaceC6557;
        this.$onLongPress = interfaceC65572;
        this.$onPress = interfaceC6550;
        this.$onTap = interfaceC65573;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, interfaceC4356);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
            C0553 c0553 = new C0553(this.$this_detectTapGestures);
            InterfaceC1635 interfaceC1635 = this.$this_detectTapGestures;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC5400, c0553, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, null);
            this.label = 1;
            if (AbstractC0521.m1301(interfaceC1635, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
        }
        return C5175.f14739;
    }
}
