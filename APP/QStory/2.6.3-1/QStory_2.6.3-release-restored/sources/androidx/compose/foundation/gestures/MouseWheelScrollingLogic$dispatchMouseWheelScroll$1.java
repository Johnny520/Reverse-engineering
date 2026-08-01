package androidx.compose.foundation.gestures;

import com.android.p002dx.p005io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic", m556f = "MouseWheelScrollingLogic.kt", m557l = {Opcodes.DIV_INT_LIT8, 273}, m558m = "dispatchMouseWheelScroll", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class MouseWheelScrollingLogic$dispatchMouseWheelScroll$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1395 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$dispatchMouseWheelScroll$1(C1395 c1395, InterfaceC5189<? super MouseWheelScrollingLogic$dispatchMouseWheelScroll$1> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c1395;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C1395.m1906(this.this$0, null, null, 0.0f, 0.0f, this);
    }
}
