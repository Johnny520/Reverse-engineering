package androidx.compose.foundation.gestures;

import androidx.compose.p001ui.input.pointer.C2478;
import androidx.compose.p001ui.input.pointer.InterfaceC2468;
import androidx.compose.p001ui.input.pointer.InterfaceC2470;
import androidx.compose.p001ui.input.pointer.PointerEventPass;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p068.InterfaceC7380;
import p068.InterfaceC7383;
import p068.InterfaceC7387;
import p079.InterfaceC7691;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", m556f = "TapGestureDetector.kt", m557l = {274}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class TapGestureDetectorKt$detectTapAndPress$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7380 $onPress;
    final /* synthetic */ InterfaceC7387 $onTap;
    final /* synthetic */ C1394 $pressScope;
    final /* synthetic */ InterfaceC2470 $this_detectTapAndPress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/飘花落叶言子楪世苏兰哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", m556f = "TapGestureDetector.kt", m557l = {277, 283}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00451 extends RestrictedSuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC6233 $$this$coroutineScope;
        final /* synthetic */ InterfaceC7380 $onPress;
        final /* synthetic */ InterfaceC7387 $onTap;
        final /* synthetic */ C1394 $pressScope;
        private /* synthetic */ Object L$0;
        Object L$1;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
        @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", m556f = "TapGestureDetector.kt", m557l = {280}, m558m = "invokeSuspend", m559v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ C2478 $down;
            final /* synthetic */ InterfaceC7380 $onPress;
            final /* synthetic */ C1394 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(InterfaceC7380 interfaceC7380, C1394 c1394, C2478 c2478, InterfaceC5189<? super AnonymousClass1> interfaceC5189) {
                super(2, interfaceC5189);
                this.$onPress = interfaceC7380;
                this.$pressScope = c1394;
                this.$down = c2478;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass1(this.$onPress, this.$pressScope, this.$down, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    AbstractC6017.m10769(obj);
                    InterfaceC7380 interfaceC7380 = this.$onPress;
                    C1394 c1394 = this.$pressScope;
                    C8158 c8158 = new C8158(this.$down.f5152);
                    this.label = 1;
                    if (interfaceC7380.invoke(c1394, c8158, this) == coroutineSingletons) {
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

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
        @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", m556f = "TapGestureDetector.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
        public static final class AnonymousClass2 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ C1394 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(C1394 c1394, InterfaceC5189<? super AnonymousClass2> interfaceC5189) {
                super(2, interfaceC5189);
                this.$pressScope = c1394;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass2(this.$pressScope, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                this.$pressScope.m1898();
                return C6008.f15084;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
        @InterfaceC7691(m555c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", m556f = "TapGestureDetector.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
        public static final class AnonymousClass3 extends SuspendLambda implements InterfaceC7383 {
            final /* synthetic */ C1394 $pressScope;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(C1394 c1394, InterfaceC5189<? super AnonymousClass3> interfaceC5189) {
                super(2, interfaceC5189);
                this.$pressScope = c1394;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
                return new AnonymousClass3(this.$pressScope, interfaceC5189);
            }

            @Override // p068.InterfaceC7383
            public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
                return ((AnonymousClass3) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC6017.m10769(obj);
                this.$pressScope.m1897();
                return C6008.f15084;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00451(InterfaceC6233 interfaceC6233, InterfaceC7380 interfaceC7380, InterfaceC7387 interfaceC7387, C1394 c1394, InterfaceC5189<? super C00451> interfaceC5189) {
            super(2, interfaceC5189);
            this.$$this$coroutineScope = interfaceC6233;
            this.$onPress = interfaceC7380;
            this.$onTap = interfaceC7387;
            this.$pressScope = c1394;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C00451 c00451 = new C00451(this.$$this$coroutineScope, this.$onPress, this.$onTap, this.$pressScope, interfaceC5189);
            c00451.L$0 = obj;
            return c00451;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC2468 interfaceC2468, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00451) create(interfaceC2468, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            InterfaceC6284 interfaceC6284M11036;
            InterfaceC2468 interfaceC2468;
            InterfaceC6284 interfaceC6284;
            C2478 c2478;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                InterfaceC2468 interfaceC24682 = (InterfaceC2468) this.L$0;
                interfaceC6284M11036 = AbstractC6231.m11036(this.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$detectTapAndPress$2$1$resetJob$1(this.$pressScope, null), 1);
                this.L$0 = interfaceC24682;
                this.L$1 = interfaceC6284M11036;
                this.label = 1;
                Object objM1835 = AbstractC1344.m1835(interfaceC24682, null, this, 3);
                if (objM1835 != coroutineSingletons) {
                    interfaceC2468 = interfaceC24682;
                    obj = objM1835;
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                interfaceC6284 = (InterfaceC6284) this.L$0;
                AbstractC6017.m10769(obj);
                c2478 = (C2478) obj;
                if (c2478 != null) {
                    AbstractC1344.m1837(this.$$this$coroutineScope, interfaceC6284, new AnonymousClass2(this.$pressScope, null));
                } else {
                    c2478.m3584();
                    AbstractC1344.m1837(this.$$this$coroutineScope, interfaceC6284, new AnonymousClass3(this.$pressScope, null));
                    InterfaceC7387 interfaceC7387 = this.$onTap;
                    if (interfaceC7387 != null) {
                        interfaceC7387.invoke(new C8158(c2478.f5152));
                    }
                }
                return C6008.f15084;
            }
            interfaceC6284M11036 = (InterfaceC6284) this.L$1;
            interfaceC2468 = (InterfaceC2468) this.L$0;
            AbstractC6017.m10769(obj);
            C2478 c24782 = (C2478) obj;
            c24782.m3584();
            InterfaceC7380 interfaceC7380 = this.$onPress;
            if (interfaceC7380 != AbstractC1344.f1845) {
                AbstractC1344.m1837(this.$$this$coroutineScope, interfaceC6284M11036, new AnonymousClass1(interfaceC7380, this.$pressScope, c24782, null));
            }
            this.L$0 = interfaceC6284M11036;
            this.L$1 = null;
            this.label = 2;
            obj = AbstractC1344.m1839(interfaceC2468, PointerEventPass.Main, this);
            if (obj != coroutineSingletons) {
                interfaceC6284 = interfaceC6284M11036;
                c2478 = (C2478) obj;
                if (c2478 != null) {
                }
                return C6008.f15084;
            }
            return coroutineSingletons;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2(InterfaceC2470 interfaceC2470, InterfaceC7380 interfaceC7380, InterfaceC7387 interfaceC7387, C1394 c1394, InterfaceC5189<? super TapGestureDetectorKt$detectTapAndPress$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.$this_detectTapAndPress = interfaceC2470;
        this.$onPress = interfaceC7380;
        this.$onTap = interfaceC7387;
        this.$pressScope = c1394;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        TapGestureDetectorKt$detectTapAndPress$2 tapGestureDetectorKt$detectTapAndPress$2 = new TapGestureDetectorKt$detectTapAndPress$2(this.$this_detectTapAndPress, this.$onPress, this.$onTap, this.$pressScope, interfaceC5189);
        tapGestureDetectorKt$detectTapAndPress$2.L$0 = obj;
        return tapGestureDetectorKt$detectTapAndPress$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((TapGestureDetectorKt$detectTapAndPress$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            InterfaceC6233 interfaceC6233 = (InterfaceC6233) this.L$0;
            InterfaceC2470 interfaceC2470 = this.$this_detectTapAndPress;
            C00451 c00451 = new C00451(interfaceC6233, this.$onPress, this.$onTap, this.$pressScope, null);
            this.label = 1;
            if (AbstractC1362.m1871(interfaceC2470, c00451, this) == coroutineSingletons) {
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
