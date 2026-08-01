package androidx.compose.p001ui.platform;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: renamed from: androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$1 */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1", m556f = "PlatformTextInputModifierNode.kt", m557l = {230}, m558m = "startInputMethod", m559v = 1)
@Metadata(m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class C0204x61f42b4d extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C2754 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0204x61f42b4d(C2754 c2754, InterfaceC5189<? super C0204x61f42b4d> interfaceC5189) {
        super(interfaceC5189);
        this.this$0 = c2754;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo4027(null, this);
    }
}
