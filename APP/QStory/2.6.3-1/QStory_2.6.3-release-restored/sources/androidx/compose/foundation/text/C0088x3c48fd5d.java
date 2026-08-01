package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC1309;
import androidx.compose.foundation.gestures.AbstractC1362;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2", m556f = "LongPressTextDragObserver.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;"}, m152k = 3, m153mv = {2, 1, 0})
final class C0088x3c48fd5d extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC1851 $observer;
    final /* synthetic */ InterfaceC2470 $this_detectDownAndDragGesturesWithObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$1", m556f = "LongPressTextDragObserver.kt", m557l = {67}, m558m = "invokeSuspend", m559v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC1851 $observer;
        final /* synthetic */ InterfaceC2470 $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(InterfaceC2470 interfaceC2470, InterfaceC1851 interfaceC1851, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_detectDownAndDragGesturesWithObserver = interfaceC2470;
            this.$observer = interfaceC1851;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((AnonymousClass1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C6008 c6008 = C6008.f15084;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC2470 interfaceC2470 = this.$this_detectDownAndDragGesturesWithObserver;
                InterfaceC1851 interfaceC1851 = this.$observer;
                this.label = 1;
                Object objM1871 = AbstractC1362.m1871(interfaceC2470, new LongPressTextDragObserverKt$detectPreDragGesturesWithObserver$2(interfaceC1851, null), this);
                if (objM1871 != coroutineSingletons) {
                    objM1871 = c6008;
                }
                if (objM1871 == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
            }
            return c6008;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.text.LongPressTextDragObserverKt$detectDownAndDragGesturesWithObserver$2$2", m556f = "LongPressTextDragObserver.kt", m557l = {68}, m558m = "invokeSuspend", m559v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC1851 $observer;
        final /* synthetic */ InterfaceC2470 $this_detectDownAndDragGesturesWithObserver;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(InterfaceC2470 interfaceC2470, InterfaceC1851 interfaceC1851, InterfaceC5189<? super AnonymousClass2> interfaceC5189) {
            super(2, interfaceC5189);
            this.$this_detectDownAndDragGesturesWithObserver = interfaceC2470;
            this.$observer = interfaceC1851;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((AnonymousClass2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C6008 c6008 = C6008.f15084;
            final int i2 = 1;
            if (i != 0) {
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            InterfaceC2470 interfaceC2470 = this.$this_detectDownAndDragGesturesWithObserver;
            final InterfaceC1851 interfaceC1851 = this.$observer;
            this.label = 1;
            final int i3 = 0;
            Object objM1803 = AbstractC1309.m1803(interfaceC2470, new C1810(interfaceC1851, 1), new InterfaceC7372() { // from class: androidx.compose.foundation.text.飘花落叶言子世兰哲楪苏
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    int i4 = i3;
                    C6008 c60082 = C6008.f15084;
                    InterfaceC1851 interfaceC18512 = interfaceC1851;
                    switch (i4) {
                        case 0:
                            interfaceC18512.mo2308();
                            break;
                        default:
                            interfaceC18512.onCancel();
                            break;
                    }
                    return c60082;
                }
            }, new InterfaceC7372() { // from class: androidx.compose.foundation.text.飘花落叶言子世兰哲楪苏
                @Override // p068.InterfaceC7372
                public final Object invoke() {
                    int i4 = i2;
                    C6008 c60082 = C6008.f15084;
                    InterfaceC1851 interfaceC18512 = interfaceC1851;
                    switch (i4) {
                        case 0:
                            interfaceC18512.mo2308();
                            break;
                        default:
                            interfaceC18512.onCancel();
                            break;
                    }
                    return c60082;
                }
            }, new C1811(interfaceC1851), this);
            if (objM1803 != coroutineSingletons) {
                objM1803 = c6008;
            }
            return objM1803 == coroutineSingletons ? coroutineSingletons : c6008;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0088x3c48fd5d(InterfaceC2470 interfaceC2470, InterfaceC1851 interfaceC1851, InterfaceC5189<? super C0088x3c48fd5d> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_detectDownAndDragGesturesWithObserver = interfaceC2470;
        this.$observer = interfaceC1851;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        C0088x3c48fd5d c0088x3c48fd5d = new C0088x3c48fd5d(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, interfaceC5189);
        c0088x3c48fd5d.L$0 = obj;
        return c0088x3c48fd5d;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super InterfaceC6284> interfaceC5189) {
        return ((C0088x3c48fd5d) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        AbstractC6231.m11036(interfaceC6233, null, coroutineStart, new AnonymousClass1(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
        return AbstractC6231.m11036(interfaceC6233, null, coroutineStart, new AnonymousClass2(this.$this_detectDownAndDragGesturesWithObserver, this.$observer, null), 1);
    }
}
