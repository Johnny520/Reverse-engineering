package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m152k = 3, m153mv = {2, 3, 0}, m155xi = 48)
final /* synthetic */ class SequencesKt___SequencesKt$flatMapIndexed$1 extends FunctionReferenceImpl implements InterfaceC7387 {
    public static final SequencesKt___SequencesKt$flatMapIndexed$1 INSTANCE = new SequencesKt___SequencesKt$flatMapIndexed$1();

    public SequencesKt___SequencesKt$flatMapIndexed$1() {
        super(1, Iterable.class, "iterator", "iterator()Ljava/util/Iterator;", 0);
    }

    @Override // p068.InterfaceC7387
    public final Iterator<Object> invoke(Iterable<Object> iterable) {
        iterable.getClass();
        return iterable.iterator();
    }
}
