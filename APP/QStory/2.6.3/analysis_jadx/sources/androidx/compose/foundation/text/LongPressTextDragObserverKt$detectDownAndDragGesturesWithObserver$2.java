package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC0468;
import androidx.compose.foundation.gestures.AbstractC0521;
import androidx.compose.ui.input.pointer.InterfaceC1635;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC5399;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.InterfaceC5452;
import p052.InterfaceC6543;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", f = "LongPressTextDragObserver.kt", l = {}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;"}, k = 3, mv = {2, 1, 0})
final class LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ InterfaceC1013 $observer;
    final /* synthetic */ InterfaceC1635 $this_detectDownAndDragGesturesWithObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", f = "LongPressTextDragObserver.kt", l = {67}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC1013 $observer;
        final /* synthetic */ InterfaceC1635 $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC1635 interfaceC1635, InterfaceC1013 interfaceC1013, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$this_detectDownAndDragGesturesWithObserver = interfaceC1635;
            this.$observer = interfaceC1013;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C5176 c5176 = C5176.f14739;
            if (i == 0) {
                AbstractC5185.m10210(obj);
                InterfaceC1635 interfaceC1635 = this.$this_detectDownAndDragGesturesWithObserver;
                InterfaceC1013 interfaceC1013 = this.$observer;
                this.label = 1;
                Object objM1311 = AbstractC0521.m1311(interfaceC1635, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(interfaceC1013, null), this);
                if (objM1311 != coroutineSingletons) {
                    objM1311 = c5176;
                }
                if (objM1311 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC5185.m10210(obj);
            }
            return c5176;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", f = "LongPressTextDragObserver.kt", l = {68}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ InterfaceC1013 $observer;
        final /* synthetic */ InterfaceC1635 $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC1635 interfaceC1635, InterfaceC1013 interfaceC1013, InterfaceC4357<? super AnonymousClass2> interfaceC4357) {
            super(2, interfaceC4357);
            this.$this_detectDownAndDragGesturesWithObserver = interfaceC1635;
            this.$observer = interfaceC1013;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            return new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC4357);
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C5176 c5176 = C5176.f14739;
            final int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    AbstractC5185.m10210(obj);
                    return c5176;
                }
                C5925.m11311("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC5185.m10210(obj);
            InterfaceC1635 interfaceC1635 = this.$this_detectDownAndDragGesturesWithObserver;
            final InterfaceC1013 interfaceC1013 = this.$observer;
            this.label = 1;
            final int i3 = 0;
            Object objM1243 = AbstractC0468.m1243(interfaceC1635, new C0972(interfaceC1013, 1), new InterfaceC6543() { // from class: androidx.compose.foundation.text.飘花落叶言子世兰哲楪苏
                @Override // p052.InterfaceC6543
                public final Object invoke() {
                    int i4 = i3;
                    C5176 c51762 = C5176.f14739;
                    InterfaceC1013 interfaceC10132 = interfaceC1013;
                    switch (i4) {
                        case 0:
                            interfaceC10132.mo1748();
                            break;
                        default:
                            interfaceC10132.onCancel();
                            break;
                    }
                    return c51762;
                }
            }, new InterfaceC6543() { // from class: androidx.compose.foundation.text.飘花落叶言子世兰哲楪苏
                @Override // p052.InterfaceC6543
                public final Object invoke() {
                    int i4 = i2;
                    C5176 c51762 = C5176.f14739;
                    InterfaceC1013 interfaceC10132 = interfaceC1013;
                    switch (i4) {
                        case 0:
                            interfaceC10132.mo1748();
                            break;
                        default:
                            interfaceC10132.onCancel();
                            break;
                    }
                    return c51762;
                }
            }, new C0973(interfaceC1013), this);
            if (objM1243 != coroutineSingletons) {
                objM1243 = c5176;
            }
            return objM1243 == coroutineSingletons ? coroutineSingletons : c5176;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(InterfaceC1635 interfaceC1635, InterfaceC1013 interfaceC1013, InterfaceC4357<? super LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2> interfaceC4357) {
        super(2, interfaceC4357);
        this.$this_detectDownAndDragGesturesWithObserver = interfaceC1635;
        this.$observer = interfaceC1013;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 = new LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC4357);
        longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2.L$0 = obj;
        return longPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2;
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super InterfaceC5452> interfaceC4357) {
        return ((LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C5925.m11311("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC5185.m10210(obj);
        InterfaceC5401 interfaceC5401 = (InterfaceC5401) this.L$0;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        AbstractC5399.m10477(interfaceC5401, null, coroutineStart, new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
        return AbstractC5399.m10477(interfaceC5401, null, coroutineStart, new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
    }
}
