package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p052.InterfaceC6553;
import p053.AbstractC6560;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
final /* synthetic */ class SliderKt$CornerSizeAlignmentLine$1 extends FunctionReferenceImpl implements InterfaceC6553 {
    public static final SliderKt$CornerSizeAlignmentLine$1 INSTANCE = new SliderKt$CornerSizeAlignmentLine$1();

    public SliderKt$CornerSizeAlignmentLine$1() {
        super(2, AbstractC6560.class, "min", "min(II)I", 1);
    }

    @Override // p052.InterfaceC6553
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }

    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.min(i, i2));
    }
}
