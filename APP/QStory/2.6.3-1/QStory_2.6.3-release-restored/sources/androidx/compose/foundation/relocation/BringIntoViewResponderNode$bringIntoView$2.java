package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.C1357;
import androidx.compose.foundation.gestures.C1365;
import androidx.compose.foundation.gestures.C1376;
import androidx.compose.foundation.gestures.C1382;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.p001ui.relocation.AbstractC2760;
import androidx.compose.runtime.collection.C2059;
import androidx.window.area.AbstractC3400;
import java.util.concurrent.CancellationException;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AbstractC5214;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6276;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.InterfaceC6284;
import p064.C7348;
import p068.InterfaceC7372;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p128.C8157;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2", m556f = "BringIntoViewResponder.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)Lkotlinx/coroutines/飘花落叶言子苏世楪兰哲;"}, m152k = 3, m153mv = {2, 1, 0})
final class BringIntoViewResponderNode$bringIntoView$2 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ InterfaceC7372 $boundsProvider;
    final /* synthetic */ InterfaceC2530 $childCoordinates;
    final /* synthetic */ InterfaceC7372 $parentRect;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ C1611 this$0;

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1", m556f = "BringIntoViewResponder.kt", m557l = {183}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00781 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7372 $boundsProvider;
        final /* synthetic */ InterfaceC2530 $childCoordinates;
        int label;
        final /* synthetic */ C1611 this$0;

        /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$1$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
        @Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
        public static final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements InterfaceC7372 {
            final /* synthetic */ InterfaceC7372 $boundsProvider;
            final /* synthetic */ InterfaceC2530 $childCoordinates;
            final /* synthetic */ C1611 this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(C1611 c1611, InterfaceC2530 interfaceC2530, InterfaceC7372 interfaceC7372) {
                super(0, AbstractC5214.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
                this.this$0 = c1611;
                this.$childCoordinates = interfaceC2530;
                this.$boundsProvider = interfaceC7372;
            }

            @Override // p068.InterfaceC7372
            public final C8157 invoke() {
                return C1611.m2134(this.this$0, this.$childCoordinates, this.$boundsProvider);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00781(C1611 c1611, InterfaceC2530 interfaceC2530, InterfaceC7372 interfaceC7372, InterfaceC5189<? super C00781> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c1611;
            this.$childCoordinates = interfaceC2530;
            this.$boundsProvider = interfaceC7372;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C00781(this.this$0, this.$childCoordinates, this.$boundsProvider, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00781) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00d7  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws DispatchException {
            Object objM11099;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            C6008 c6008 = C6008.f15084;
            if (i != 0) {
                if (i == 1) {
                    AbstractC6017.m10769(obj);
                    return c6008;
                }
                C6755.m11870("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC6017.m10769(obj);
            C1365 c1365 = this.this$0.f2586;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$childCoordinates, this.$boundsProvider);
            this.label = 1;
            c1365.getClass();
            C8157 c8157 = (C8157) anonymousClass1.invoke();
            if (c8157 == null || C1365.m1877(c1365, c8157, 0L, 0L, 3)) {
                objM11099 = c6008;
            } else {
                C6276 c6276 = new C6276(1, AbstractC3400.m5624(this));
                c6276.m11102();
                C1376 c1376 = new C1376(anonymousClass1, c6276);
                C1382 c1382 = c1365.f1885;
                C2059 c2059 = c1382.f1912;
                C8157 c81572 = (C8157) anonymousClass1.invoke();
                if (c81572 == null) {
                    c6276.resumeWith(Result.m9304constructorimpl(c6008));
                } else {
                    c6276.m11100(new C1357(c1382, 1, c1376));
                    C7348 c7348M5627 = AbstractC3400.m5627(0, c2059.f3865);
                    int i2 = c7348M5627.f18163;
                    int i3 = c7348M5627.f18161;
                    if (i2 <= i3) {
                        while (true) {
                            C8157 c81573 = (C8157) ((C1376) c2059.f3866[i3]).f1904.invoke();
                            if (c81573 != null) {
                                C8157 c8157M13076 = c81572.m13076(c81573);
                                if (c8157M13076.equals(c81572)) {
                                    c2059.m2608(i3 + 1, c1376);
                                    break;
                                }
                                if (!c8157M13076.equals(c81573)) {
                                    CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                                    int i4 = c2059.f3865 - 1;
                                    if (i4 <= i3) {
                                        while (true) {
                                            ((C1376) c2059.f3866[i3]).f1903.mo10994(cancellationException);
                                            if (i4 == i3) {
                                                break;
                                            }
                                            i4++;
                                        }
                                    }
                                }
                            }
                            if (i3 == i2) {
                                break;
                            }
                            i3--;
                        }
                        c2059.m2608(0, c1376);
                        if (!c1365.f1881) {
                            c1365.m1879(0L);
                        }
                    } else {
                        c2059.m2608(0, c1376);
                        if (!c1365.f1881) {
                        }
                    }
                }
                objM11099 = c6276.m11099();
                if (objM11099 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
            }
            return objM11099 == coroutineSingletons ? coroutineSingletons : c6008;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.foundation.relocation.BringIntoViewResponderNode$bringIntoView$2$2", m556f = "BringIntoViewResponder.kt", m557l = {191}, m558m = "invokeSuspend", m559v = 1)
    public static final class C00792 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ InterfaceC7372 $parentRect;
        int label;
        final /* synthetic */ C1611 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00792(C1611 c1611, InterfaceC7372 interfaceC7372, InterfaceC5189<? super C00792> interfaceC5189) {
            super(2, interfaceC5189);
            this.this$0 = c1611;
            this.$parentRect = interfaceC7372;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            return new C00792(this.this$0, this.$parentRect, interfaceC5189);
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C00792) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                AbstractC6017.m10769(obj);
                C1611 c1611 = this.this$0;
                InterfaceC7372 interfaceC7372 = this.$parentRect;
                this.label = 1;
                if (AbstractC2760.m4195(c1611, interfaceC7372, this) == coroutineSingletons) {
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
    public BringIntoViewResponderNode$bringIntoView$2(C1611 c1611, InterfaceC2530 interfaceC2530, InterfaceC7372 interfaceC7372, InterfaceC7372 interfaceC73722, InterfaceC5189<? super BringIntoViewResponderNode$bringIntoView$2> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1611;
        this.$childCoordinates = interfaceC2530;
        this.$boundsProvider = interfaceC7372;
        this.$parentRect = interfaceC73722;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        BringIntoViewResponderNode$bringIntoView$2 bringIntoViewResponderNode$bringIntoView$2 = new BringIntoViewResponderNode$bringIntoView$2(this.this$0, this.$childCoordinates, this.$boundsProvider, this.$parentRect, interfaceC5189);
        bringIntoViewResponderNode$bringIntoView$2.L$0 = obj;
        return bringIntoViewResponderNode$bringIntoView$2;
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super InterfaceC6284> interfaceC5189) {
        return ((BringIntoViewResponderNode$bringIntoView$2) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
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
        AbstractC6231.m11036(interfaceC6233, null, null, new C00781(this.this$0, this.$childCoordinates, this.$boundsProvider, null), 3);
        return AbstractC6231.m11036(interfaceC6233, null, null, new C00792(this.this$0, this.$parentRect, null), 3);
    }
}
