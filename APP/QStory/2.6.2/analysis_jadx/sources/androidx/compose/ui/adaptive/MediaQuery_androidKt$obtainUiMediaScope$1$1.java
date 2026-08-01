package androidx.compose.ui.adaptive;

import android.content.Context;
import androidx.window.layout.C2585;
import androidx.window.layout.C2588;
import androidx.window.layout.C2589;
import androidx.window.layout.C2593;
import androidx.window.layout.C2597;
import androidx.window.layout.C2600;
import androidx.window.layout.InterfaceC2596;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.AbstractC5184;
import kotlin.C5175;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5400;
import kotlinx.coroutines.flow.AbstractC5321;
import kotlinx.coroutines.flow.InterfaceC5318;
import p052.InterfaceC6553;
import p063.InterfaceC6861;
import p075.C6957;
import p135.InterfaceC7514;
import p136.AbstractC7525;
import p136.C7524;
import p136.C7526;
import p147.AbstractC7562;
import p147.C7571;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1", f = "MediaQuery.android.kt", l = {132}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class MediaQuery_androidKt$obtainUiMediaScope$1$1 extends SuspendLambda implements InterfaceC6553 {
    final /* synthetic */ Context $context;
    final /* synthetic */ AbstractC1399 $scope;
    int label;

    /* JADX INFO: renamed from: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/window/layout/飘花落叶言子楪苏兰世哲;", "layout", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/window/layout/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6861(c = "androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1", f = "MediaQuery.android.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6553 {
        final /* synthetic */ AbstractC1399 $scope;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC1399 abstractC1399, InterfaceC4356<? super AnonymousClass1> interfaceC4356) {
            super(2, interfaceC4356);
            this.$scope = abstractC1399;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, interfaceC4356);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6553
        public final Object invoke(C2597 c2597, InterfaceC4356<? super C5175> interfaceC4356) {
            return ((AnonymousClass1) create(c2597, interfaceC4356)).invokeSuspend(C5175.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5184.m10206(obj);
            C2597 c2597 = (C2597) this.L$0;
            AbstractC1399 abstractC1399 = this.$scope;
            List list = c2597.f7778;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof C2588) {
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
                if (((C2588) next).f7761 == C2589.f7766) {
                    break;
                }
            }
            abstractC1399.getClass();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$1$1(Context context, AbstractC1399 abstractC1399, InterfaceC4356<? super MediaQuery_androidKt$obtainUiMediaScope$1$1> interfaceC4356) {
        super(2, interfaceC4356);
        this.$context = context;
        this.$scope = abstractC1399;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4356<C5175> create(Object obj, InterfaceC4356<?> interfaceC4356) {
        return new MediaQuery_androidKt$obtainUiMediaScope$1$1(this.$context, this.$scope, interfaceC4356);
    }

    @Override // p052.InterfaceC6553
    public final Object invoke(InterfaceC5400 interfaceC5400, InterfaceC4356<? super C5175> interfaceC4356) {
        return ((MediaQuery_androidKt$obtainUiMediaScope$1$1) create(interfaceC5400, interfaceC4356)).invokeSuspend(C5175.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C7526 c7526;
        C7571 c7571M12717;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5184.m10206(obj);
            C2585 c2585 = InterfaceC2596.f7777;
            Context context = this.$context;
            c2585.getClass();
            context.getClass();
            InterfaceC7514 interfaceC7514 = (InterfaceC7514) C2585.f7754.getValue();
            if (interfaceC7514 == null) {
                C7524 c7524 = C7524.f20402;
                if (C7524.f20402 == null) {
                    ReentrantLock reentrantLock = C7524.f20401;
                    reentrantLock.lock();
                    try {
                        if (C7524.f20402 == null) {
                            try {
                                c7571M12717 = AbstractC7525.m12717();
                            } catch (Throwable unused) {
                            }
                            if (c7571M12717 != null) {
                                C7571 c7571 = C7571.f20497;
                                c7571.getClass();
                                Object value = c7571M12717.f20498.getValue();
                                value.getClass();
                                Object value2 = c7571.f20498.getValue();
                                value2.getClass();
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    c7526 = new C7526(context);
                                    if (!c7526.m12719()) {
                                    }
                                    C7524.f20402 = new C7524(c7526);
                                }
                            }
                            c7526 = null;
                            C7524.f20402 = new C7524(c7526);
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                interfaceC7514 = C7524.f20402;
                interfaceC7514.getClass();
            }
            C2593 c2593 = new C2593();
            C6957 c6957 = new C6957(4);
            AbstractC7562.m12763();
            C2600 c2600 = new C2600(c2593, interfaceC7514, c6957);
            C2585.f7753.getClass();
            InterfaceC5318 interfaceC5318M5069 = c2600.m5069(this.$context);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, null);
            this.label = 1;
            if (AbstractC5321.m10331(interfaceC5318M5069, anonymousClass1, this) == coroutineSingletons) {
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
