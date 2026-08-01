package androidx.compose.p001ui.adaptive;

import android.content.Context;
import androidx.window.layout.C3419;
import androidx.window.layout.C3422;
import androidx.window.layout.C3423;
import androidx.window.layout.C3427;
import androidx.window.layout.C3431;
import androidx.window.layout.C3434;
import androidx.window.layout.InterfaceC3430;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.AbstractC6154;
import kotlinx.coroutines.flow.InterfaceC6151;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import p091.C7787;
import p151.InterfaceC8344;
import p152.AbstractC8355;
import p152.C8354;
import p152.C8356;
import p163.AbstractC8392;
import p163.C8401;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1", m556f = "MediaQuery.android.kt", m557l = {132}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class MediaQuery_androidKt$obtainUiMediaScope$1$1 extends SuspendLambda implements InterfaceC7383 {
    final /* synthetic */ Context $context;
    final /* synthetic */ AbstractC2234 $scope;
    int label;

    /* JADX INFO: renamed from: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1 */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Landroidx/window/layout/飘花落叶言子楪苏兰世哲;", "layout", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/window/layout/飘花落叶言子楪苏兰世哲;)V"}, m152k = 3, m153mv = {2, 1, 0})
    @InterfaceC7691(m555c = "androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1", m556f = "MediaQuery.android.kt", m557l = {}, m558m = "invokeSuspend", m559v = 1)
    public static final class C01711 extends SuspendLambda implements InterfaceC7383 {
        final /* synthetic */ AbstractC2234 $scope;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01711(AbstractC2234 abstractC2234, InterfaceC5189<? super C01711> interfaceC5189) {
            super(2, interfaceC5189);
            this.$scope = abstractC2234;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
            C01711 c01711 = new C01711(this.$scope, interfaceC5189);
            c01711.L$0 = obj;
            return c01711;
        }

        @Override // p068.InterfaceC7383
        public final Object invoke(C3431 c3431, InterfaceC5189<? super C6008> interfaceC5189) {
            return ((C01711) create(c3431, interfaceC5189)).invokeSuspend(C6008.f15084);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC6017.m10769(obj);
            C3431 c3431 = (C3431) this.L$0;
            AbstractC2234 abstractC2234 = this.$scope;
            List list = c3431.f8125;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof C3422) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((C3422) next).f8108 == C3423.f8113) {
                    break;
                }
            }
            abstractC2234.getClass();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$1$1(Context context, AbstractC2234 abstractC2234, InterfaceC5189<? super MediaQuery_androidKt$obtainUiMediaScope$1$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.$context = context;
        this.$scope = abstractC2234;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new MediaQuery_androidKt$obtainUiMediaScope$1$1(this.$context, this.$scope, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((MediaQuery_androidKt$obtainUiMediaScope$1$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C8356 c8356;
        C8401 c8401M13305;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC6017.m10769(obj);
            C3419 c3419 = InterfaceC3430.f8124;
            Context context = this.$context;
            c3419.getClass();
            context.getClass();
            InterfaceC8344 interfaceC8344 = (InterfaceC8344) C3419.f8101.getValue();
            if (interfaceC8344 == null) {
                C8354 c8354 = C8354.f20742;
                if (C8354.f20742 == null) {
                    ReentrantLock reentrantLock = C8354.f20741;
                    reentrantLock.lock();
                    try {
                        if (C8354.f20742 == null) {
                            try {
                                c8401M13305 = AbstractC8355.m13305();
                            } catch (Throwable unused) {
                            }
                            if (c8401M13305 != null) {
                                C8401 c8401 = C8401.f20837;
                                c8401.getClass();
                                Object value = c8401M13305.f20838.getValue();
                                value.getClass();
                                Object value2 = c8401.f20838.getValue();
                                value2.getClass();
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    c8356 = new C8356(context);
                                    if (!c8356.m13307()) {
                                    }
                                    C8354.f20742 = new C8354(c8356);
                                }
                            }
                            c8356 = null;
                            C8354.f20742 = new C8354(c8356);
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                interfaceC8344 = C8354.f20742;
                interfaceC8344.getClass();
            }
            C3427 c3427 = new C3427();
            C7787 c7787 = new C7787(4);
            AbstractC8392.m13351();
            C3434 c3434 = new C3434(c3427, interfaceC8344, c7787);
            C3419.f8100.getClass();
            InterfaceC6151 interfaceC6151M5674 = c3434.m5674(this.$context);
            C01711 c01711 = new C01711(null, null);
            this.label = 1;
            if (AbstractC6154.m10894(interfaceC6151M5674, c01711, this) == coroutineSingletons) {
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
