package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.AbstractC2202;
import kotlin.AbstractC6017;
import kotlin.C6008;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.InterfaceC6233;
import kotlinx.coroutines.flow.C6077;
import kotlinx.coroutines.flow.C6116;
import kotlinx.coroutines.flow.C6120;
import p068.InterfaceC7383;
import p079.InterfaceC7691;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.text.input.internal.CursorAnchorInfoController$startOrStopMonitoring$1", m556f = "CursorAnchorInfoController.android.kt", m557l = {154}, m558m = "invokeSuspend", m559v = 1)
@Metadata(m150d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "<anonymous>", "(Lkotlinx/coroutines/飘花落叶言子世楪哲兰苏;)V"}, m152k = 3, m153mv = {2, 1, 0})
final class CursorAnchorInfoController$startOrStopMonitoring$1 extends SuspendLambda implements InterfaceC7383 {
    int label;
    final /* synthetic */ C1711 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CursorAnchorInfoController$startOrStopMonitoring$1(C1711 c1711, InterfaceC5189<? super CursorAnchorInfoController$startOrStopMonitoring$1> interfaceC5189) {
        super(2, interfaceC5189);
        this.this$0 = c1711;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CursorAnchorInfo invokeSuspend$lambda$0(C1711 c1711) {
        c1711.getClass();
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final InterfaceC5189<C6008> create(Object obj, InterfaceC5189<?> interfaceC5189) {
        return new CursorAnchorInfoController$startOrStopMonitoring$1(this.this$0, interfaceC5189);
    }

    @Override // p068.InterfaceC7383
    public final Object invoke(InterfaceC6233 interfaceC6233, InterfaceC5189<? super C6008> interfaceC5189) {
        return ((CursorAnchorInfoController$startOrStopMonitoring$1) create(interfaceC6233, interfaceC5189)).invokeSuspend(C6008.f15084);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        C6008 c6008 = C6008.f15084;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                AbstractC6017.m10769(obj);
                return c6008;
            }
            C6755.m11870("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC6017.m10769(obj);
        C6116 c6116M3030 = AbstractC2202.m3030(new C1707(this.this$0, 0));
        C1699 c1699 = new C1699(this.this$0, i2);
        this.label = 1;
        Object objMo9012 = c6116M3030.mo9012(new C6077(new Ref$IntRef(), new C6120(c1699)), this);
        if (objMo9012 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            objMo9012 = c6008;
        }
        if (objMo9012 != coroutineSingletons) {
            objMo9012 = c6008;
        }
        return objMo9012 == coroutineSingletons ? coroutineSingletons : c6008;
    }
}
