package androidx.compose.foundation.gestures;

import androidx.compose.ui.input.pointer.InterfaceC1633;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import p052.InterfaceC6551;
import p052.InterfaceC6554;
import p052.InterfaceC6558;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", l = {104}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class TapGestureDetectorKt$detectTapGestures$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC6558 $onDoubleTap;
    final /* synthetic */ InterfaceC6558 $onLongPress;
    final /* synthetic */ InterfaceC6551 $onPress;
    final /* synthetic */ InterfaceC6558 $onTap;
    final /* synthetic */ InterfaceC1635 $this_detectTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", l = {105}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends RestrictedSuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC5401 $$this$coroutineScope;
        final /* synthetic */ InterfaceC6558 $onDoubleTap;
        final /* synthetic */ InterfaceC6558 $onLongPress;
        final /* synthetic */ InterfaceC6551 $onPress;
        final /* synthetic */ InterfaceC6558 $onTap;
        final /* synthetic */ C0553 $pressScope;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC5401 interfaceC5401, C0553 c0553, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, InterfaceC6551 interfaceC6551, InterfaceC6558 interfaceC65583, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$$this$coroutineScope = interfaceC5401;
            this.$pressScope = c0553;
            this.$onDoubleTap = interfaceC6558;
            this.$onLongPress = interfaceC65582;
            this.$onPress = interfaceC6551;
            this.$onTap = interfaceC65583;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$coroutineScope, this.$pressScope, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC1633 interfaceC1633, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC1633, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                InterfaceC1633 interfaceC1633 = (InterfaceC1633) this.L$0;
                InterfaceC5401 interfaceC5401 = this.$$this$coroutineScope;
                C0553 c0553 = this.$pressScope;
                InterfaceC6558 interfaceC6558 = this.$onDoubleTap;
                InterfaceC6558 interfaceC65582 = this.$onLongPress;
                InterfaceC6551 interfaceC6551 = this.$onPress;
                InterfaceC6558 interfaceC65583 = this.$onTap;
                this.label = 1;
                if (AbstractC0503.m1280(interfaceC1633, interfaceC5401, c0553, interfaceC6558, interfaceC65582, interfaceC6551, interfaceC65583, this) == coroutineSingletons) {
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
    public TapGestureDetectorKt$detectTapGestures$2(InterfaceC1635 interfaceC1635, InterfaceC6558 interfaceC6558, InterfaceC6558 interfaceC65582, InterfaceC6551 interfaceC6551, InterfaceC6558 interfaceC65583, InterfaceC4357<? super TapGestureDetectorKt$detectTapGestures$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_detectTapGestures = interfaceC1635;
        this.$onDoubleTap = interfaceC6558;
        this.$onLongPress = interfaceC65582;
        this.$onPress = interfaceC6551;
        this.$onTap = interfaceC65583;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        TapGestureDetectorKt$detectTapGestures$2 tapGestureDetectorKt$detectTapGestures$2 = new TapGestureDetectorKt$detectTapGestures$2(this.$this_detectTapGestures, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, interfaceC4357);
        tapGestureDetectorKt$detectTapGestures$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapGestures$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((TapGestureDetectorKt$detectTapGestures$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
            C0553 c0553 = new C0553(this.$this_detectTapGestures);
            InterfaceC1635 interfaceC1635 = this.$this_detectTapGestures;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC5401, c0553, this.$onDoubleTap, this.$onLongPress, this.$onPress, this.$onTap, null);
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
