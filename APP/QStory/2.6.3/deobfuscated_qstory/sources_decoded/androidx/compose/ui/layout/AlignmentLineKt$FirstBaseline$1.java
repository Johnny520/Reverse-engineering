package androidx.compose.ui.layout;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6554;
import p053.AbstractC6561;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements InterfaceC6554 {
    public static final AlignmentLineKt$FirstBaseline$1 INSTANCE = new AlignmentLineKt$FirstBaseline$1();

    public AlignmentLineKt$FirstBaseline$1() {
        super(2, AbstractC6561.class, "min", "min(II)I", 1);
    }

    @Override // p052.InterfaceC6554
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }

    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.min(i, i2));
    }
}
