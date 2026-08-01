package androidx.compose.material.ripple;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material.ripple.RippleAnimation", m556f = "RippleAnimation.kt", m557l = {77, 79, 80}, m558m = "animate", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class RippleAnimation$animate$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC1937 this$0;

    public RippleAnimation$animate$1(AbstractC1937 abstractC1937, InterfaceC5189<? super RippleAnimation$animate$1> interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
