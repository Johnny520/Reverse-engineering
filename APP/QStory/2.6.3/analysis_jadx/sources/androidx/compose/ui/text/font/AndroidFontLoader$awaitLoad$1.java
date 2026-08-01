package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {55, 57}, m = "awaitLoad", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1978 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(C1978 c1978, InterfaceC4357<? super AndroidFontLoader$awaitLoad$1> interfaceC4357) {
        super(interfaceC4357);
        this.this$0 = c1978;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m3699(this);
    }
}
