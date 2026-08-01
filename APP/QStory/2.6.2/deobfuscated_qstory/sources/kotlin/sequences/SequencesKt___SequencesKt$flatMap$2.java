package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
final /* synthetic */ class SequencesKt___SequencesKt$flatMap$2 extends FunctionReferenceImpl implements InterfaceC6557 {
    public static final SequencesKt___SequencesKt$flatMap$2 INSTANCE = new SequencesKt___SequencesKt$flatMap$2();

    public SequencesKt___SequencesKt$flatMap$2() {
        super(1, InterfaceC5126.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // p052.InterfaceC6557
    public final Iterator<Object> invoke(InterfaceC5126 interfaceC5126) {
        interfaceC5126.getClass();
        return interfaceC5126.iterator();
    }
}
