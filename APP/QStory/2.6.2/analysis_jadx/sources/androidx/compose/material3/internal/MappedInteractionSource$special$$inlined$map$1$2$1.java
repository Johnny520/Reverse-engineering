package androidx.compose.material3.internal;

import com.android.dx.io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC4356;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p063.InterfaceC6861;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC6861(c = "androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2", f = "MappedInteractionSource.kt", l = {Opcodes.DIV_INT_LIT8}, m = "emit")
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class MappedInteractionSource$special$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC1124 this$0;

    public MappedInteractionSource$special$$inlined$map$1$2$1(AbstractC1124 abstractC1124, InterfaceC4356 interfaceC4356) {
        super(interfaceC4356);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
