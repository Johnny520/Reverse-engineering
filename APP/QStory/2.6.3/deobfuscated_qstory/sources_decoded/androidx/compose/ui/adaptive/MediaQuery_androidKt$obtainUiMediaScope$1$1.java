package androidx.compose.ui.adaptive;

import android.content.Context;
import androidx.window.layout.C2586;
import androidx.window.layout.C2589;
import androidx.window.layout.C2590;
import androidx.window.layout.C2594;
import androidx.window.layout.C2598;
import androidx.window.layout.C2601;
import androidx.window.layout.InterfaceC2597;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.AbstractC5185;
import kotlin.C5176;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.InterfaceC5401;
import kotlinx.coroutines.flow.AbstractC5322;
import kotlinx.coroutines.flow.InterfaceC5319;
import p052.InterfaceC6554;
import p063.InterfaceC6862;
import p075.C6958;
import p135.InterfaceC7515;
import p136.AbstractC7526;
import p136.C7525;
import p136.C7527;
import p147.AbstractC7563;
import p147.C7572;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1", f = "MediaQuery.android.kt", l = {132}, m = "invokeSuspend", v = 1)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, k = 3, mv = {2, 1, 0})
final class MediaQuery_androidKt$obtainUiMediaScope$1$1 extends SuspendLambda implements InterfaceC6554 {
    final /* synthetic */ Context $context;
    final /* synthetic */ AbstractC1399 $scope;
    int label;

    /* JADX INFO: renamed from: androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/window/layout/飘花落叶言子楪苏兰世哲;", "layout", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Landroidx/window/layout/飘花落叶言子楪苏兰世哲;)V"}, k = 3, mv = {2, 1, 0})
    @InterfaceC6862(c = "androidx.compose.ui.adaptive.MediaQuery_androidKt$obtainUiMediaScope$1$1$1", f = "MediaQuery.android.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC6554 {
        final /* synthetic */ AbstractC1399 $scope;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(AbstractC1399 abstractC1399, InterfaceC4357<? super AnonymousClass1> interfaceC4357) {
            super(2, interfaceC4357);
            this.$scope = abstractC1399;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$scope, interfaceC4357);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // p052.InterfaceC6554
        public final Object invoke(C2598 c2598, InterfaceC4357<? super C5176> interfaceC4357) {
            return ((AnonymousClass1) create(c2598, interfaceC4357)).invokeSuspend(C5176.f14739);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object next;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC5185.m10210(obj);
            C2598 c2598 = (C2598) this.L$0;
            AbstractC1399 abstractC1399 = this.$scope;
            List list = c2598.f7780;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (obj2 instanceof C2589) {
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
                if (((C2589) next).f7763 == C2590.f7768) {
                    break;
                }
            }
            abstractC1399.getClass();
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQuery_androidKt$obtainUiMediaScope$1$1(Context context, AbstractC1399 abstractC1399, InterfaceC4357<? super MediaQuery_androidKt$obtainUiMediaScope$1$1> interfaceC4357) {
        super(2, interfaceC4357);
        this.$context = context;
        this.$scope = abstractC1399;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC4357<C5176> create(Object obj, InterfaceC4357<?> interfaceC4357) {
        return new MediaQuery_androidKt$obtainUiMediaScope$1$1(this.$context, this.$scope, interfaceC4357);
    }

    @Override // p052.InterfaceC6554
    public final Object invoke(InterfaceC5401 interfaceC5401, InterfaceC4357<? super C5176> interfaceC4357) {
        return ((MediaQuery_androidKt$obtainUiMediaScope$1$1) create(interfaceC5401, interfaceC4357)).invokeSuspend(C5176.f14739);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C7527 c7527;
        C7572 c7572M12746;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            AbstractC5185.m10210(obj);
            C2586 c2586 = InterfaceC2597.f7779;
            Context context = this.$context;
            c2586.getClass();
            context.getClass();
            InterfaceC7515 interfaceC7515 = (InterfaceC7515) C2586.f7756.getValue();
            if (interfaceC7515 == null) {
                C7525 c7525 = C7525.f20397;
                if (C7525.f20397 == null) {
                    ReentrantLock reentrantLock = C7525.f20396;
                    reentrantLock.lock();
                    try {
                        if (C7525.f20397 == null) {
                            try {
                                c7572M12746 = AbstractC7526.m12746();
                            } catch (Throwable unused) {
                            }
                            if (c7572M12746 != null) {
                                C7572 c7572 = C7572.f20492;
                                c7572.getClass();
                                Object value = c7572M12746.f20493.getValue();
                                value.getClass();
                                Object value2 = c7572.f20493.getValue();
                                value2.getClass();
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    c7527 = new C7527(context);
                                    if (!c7527.m12748()) {
                                    }
                                    C7525.f20397 = new C7525(c7527);
                                }
                            }
                            c7527 = null;
                            C7525.f20397 = new C7525(c7527);
                        }
                    } finally {
                        reentrantLock.unlock();
                    }
                }
                interfaceC7515 = C7525.f20397;
                interfaceC7515.getClass();
            }
            C2594 c2594 = new C2594();
            C6958 c6958 = new C6958(4);
            AbstractC7563.m12792();
            C2601 c2601 = new C2601(c2594, interfaceC7515, c6958);
            C2586.f7755.getClass();
            InterfaceC5319 interfaceC5319M5114 = c2601.m5114(this.$context);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, null);
            this.label = 1;
            if (AbstractC5322.m10335(interfaceC5319M5114, anonymousClass1, this) == coroutineSingletons) {
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
