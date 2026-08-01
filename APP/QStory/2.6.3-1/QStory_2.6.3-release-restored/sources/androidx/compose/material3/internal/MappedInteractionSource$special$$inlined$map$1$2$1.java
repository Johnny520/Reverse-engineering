package androidx.compose.material3.internal;

import com.android.p002dx.p005io.Opcodes;
import kotlin.Metadata;
import kotlin.coroutines.InterfaceC5189;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p079.InterfaceC7691;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7691(m555c = "androidx.compose.material3.internal.MappedInteractionSource$special$$inlined$map$1$2", m556f = "MappedInteractionSource.kt", m557l = {Opcodes.DIV_INT_LIT8}, m558m = "emit")
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
public final class MappedInteractionSource$special$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractC1959 this$0;

    public MappedInteractionSource$special$$inlined$map$1$2$1(AbstractC1959 abstractC1959, InterfaceC5189 interfaceC5189) {
        super(interfaceC5189);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        throw null;
    }
}
