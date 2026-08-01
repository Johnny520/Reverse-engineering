package androidx.compose.foundation.text;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4357;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6862;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6862(c = "androidx.compose.foundation.text.CommonContextMenuAreaKt", f = "CommonContextMenuArea.kt", l = {Opcodes.REM_INT_LIT16}, m = "getContextMenuItemsAvailability", v = 1)
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final class CommonContextMenuAreaKt$getContextMenuItemsAvailability$2 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public CommonContextMenuAreaKt$getContextMenuItemsAvailability$2(InterfaceC4357<? super CommonContextMenuAreaKt$getContextMenuItemsAvailability$2> interfaceC4357) {
        super(interfaceC4357);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AbstractC0983.m1904(null, this);
    }
}
