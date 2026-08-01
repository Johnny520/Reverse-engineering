package androidx.graphics.shapes;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
final class FeatureMappingKt$featureMapper$1$1 extends Lambda implements InterfaceC6557 {
    public static final FeatureMappingKt$featureMapper$1$1 INSTANCE = new FeatureMappingKt$featureMapper$1$1();

    public FeatureMappingKt$featureMapper$1$1() {
        super(1);
    }

    @Override // p052.InterfaceC6557
    public final CharSequence invoke(Pair<Float, Float> pair) {
        pair.getClass();
        return pair.getFirst().floatValue() + " -> " + pair.getSecond().floatValue();
    }
}
