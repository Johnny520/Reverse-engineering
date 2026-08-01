package androidx.graphics.shapes;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n¢\u0006\u0002\b\u0005"}, m151d2 = {"<anonymous>", "", "it", "Lkotlin/Pair;", "", "invoke"}, m152k = 3, m153mv = {1, 8, 0}, m155xi = 48)
final class FeatureMappingKt$featureMapper$1$1 extends Lambda implements InterfaceC7387 {
    public static final FeatureMappingKt$featureMapper$1$1 INSTANCE = new FeatureMappingKt$featureMapper$1$1();

    public FeatureMappingKt$featureMapper$1$1() {
        super(1);
    }

    @Override // p068.InterfaceC7387
    public final CharSequence invoke(Pair<Float, Float> pair) {
        pair.getClass();
        return pair.getFirst().floatValue() + " -> " + pair.getSecond().floatValue();
    }
}
