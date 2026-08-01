package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final /* synthetic */ class SequencesKt___SequencesKt$flatMap$2 extends FunctionReferenceImpl implements InterfaceC7387 {
    public static final SequencesKt___SequencesKt$flatMap$2 INSTANCE = new SequencesKt___SequencesKt$flatMap$2();

    public SequencesKt___SequencesKt$flatMap$2() {
        super(1, InterfaceC5959.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // p068.InterfaceC7387
    public final Iterator<Object> invoke(InterfaceC5959 interfaceC5959) {
        interfaceC5959.getClass();
        return interfaceC5959.iterator();
    }
}
