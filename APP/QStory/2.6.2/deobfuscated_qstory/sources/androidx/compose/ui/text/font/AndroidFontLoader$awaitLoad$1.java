package androidx.compose.ui.text.font;

import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.ui.text.font.AndroidFontLoader", f = "AndroidFontLoader.android.kt", l = {55, 57}, m = "awaitLoad", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class AndroidFontLoader$awaitLoad$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ C1978 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFontLoader$awaitLoad$1(C1978 c1978, InterfaceC4356<? super AndroidFontLoader$awaitLoad$1> interfaceC4356) {
        super(interfaceC4356);
        this.this$0 = c1978;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m3689(this);
    }
}
