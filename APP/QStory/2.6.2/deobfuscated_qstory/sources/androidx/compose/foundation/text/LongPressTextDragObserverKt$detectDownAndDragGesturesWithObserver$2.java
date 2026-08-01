package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC0468;
import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5398;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.InterfaceC5451;
import p052.InterfaceC6542;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;"}, k = 3, mv = {2, 1, 0})
final class LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ InterfaceC1013 $observer;
    final /* synthetic */ InterfaceC1635 $this_detectDownAndDragGesturesWithObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {67}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC1013 $observer;
        final /* synthetic */ InterfaceC1635 $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1635 interfaceC1635, InterfaceC1013 interfaceC1013, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$this_detectDownAndDragGesturesWithObserver = interfaceC1635;
            this.$observer = interfaceC1013;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C5175 c5175 = C5175.f14739;
            if (i == 0) {
                AbstractC5184.m10206(obj);
                InterfaceC1635 interfaceC1635 = this.$this_detectDownAndDragGesturesWithObserver;
                InterfaceC1013 interfaceC1013 = this.$observer;
                this.label = 1;
                Object objM1301 = AbstractC0521.m1301(interfaceC1635, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(interfaceC1013, null), this);
                if (objM1301 != coroutineSingletons) {
                    objM1301 = c5175;
                }
                if (objM1301 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5184.m10206(obj);
            }
            return c5175;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {68}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ InterfaceC1013 $observer;
        final /* synthetic */ InterfaceC1635 $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC1635 interfaceC1635, InterfaceC1013 interfaceC1013, InterfaceC4356<? super AnonymousClass2> interfaceC4356) {
            super(2, interfaceC4356);
            this.$this_detectDownAndDragGesturesWithObserver = interfaceC1635;
            this.$observer = interfaceC1013;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            return new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC4356);
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C5175 c5175 = C5175.f14739;
            final int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    AbstractC5184.m10206(obj);
                    return c5175;
                }
                C5919.m11250("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5184.m10206(obj);
            InterfaceC1635 interfaceC1635 = this.$this_detectDownAndDragGesturesWithObserver;
            final InterfaceC1013 interfaceC1013 = this.$observer;
            this.label = 1;
            final int i3 = 0;
            Object objM1233 = AbstractC0468.m1233(interfaceC1635, new C0972(interfaceC1013, 1), new InterfaceC6542() { // from class: androidx.compose.foundation.text.飘花落叶言子世兰哲楪苏
                @Override // p052.InterfaceC6542
                public final Object invoke() {
                    int i4 = i3;
                    C5175 c51752 = C5175.f14739;
                    InterfaceC1013 interfaceC10132 = interfaceC1013;
                    switch (i4) {
                        case 0:
                            interfaceC10132.mo1738();
                            break;
                        default:
                            interfaceC10132.onCancel();
                            break;
                    }
                    return c51752;
                }
            }, new InterfaceC6542() { // from class: androidx.compose.foundation.text.飘花落叶言子世兰哲楪苏
                @Override // p052.InterfaceC6542
                public final Object invoke() {
                    int i4 = i2;
                    C5175 c51752 = C5175.f14739;
                    InterfaceC1013 interfaceC10132 = interfaceC1013;
                    switch (i4) {
                        case 0:
                            interfaceC10132.mo1738();
                            break;
                        default:
                            interfaceC10132.onCancel();
                            break;
                    }
                    return c51752;
                }
            }, new C0973(interfaceC1013), this);
            if (objM1233 != coroutineSingletons) {
                objM1233 = c5175;
            }
            return objM1233 == coroutineSingletons ? coroutineSingletons : c5175;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(InterfaceC1635 interfaceC1635, InterfaceC1013 interfaceC1013, InterfaceC4356<? super LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2> interfaceC4356) {
        super(2, interfaceC4356);
        this.$this_detectDownAndDragGesturesWithObserver = interfaceC1635;
        this.$observer = interfaceC1013;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC4356);
        longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2;
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super InterfaceC5451> interfaceC4356) {
        return ((LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5919.m11250("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5184.m10206(obj);
        InterfaceC5400 interfaceC5400 = (InterfaceC5400) this.L$0;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        AbstractC5398.m10473(interfaceC5400, null, coroutineStart, new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
        return AbstractC5398.m10473(interfaceC5400, null, coroutineStart, new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
    }
}
