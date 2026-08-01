package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import p068.InterfaceC7383;
import p069.AbstractC7390;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m152k = 3, m153mv = {2, 0, 0}, m155xi = 48)
final /* synthetic */ class InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1 extends FunctionReferenceImpl implements InterfaceC7383 {
    public static final InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1 INSTANCE = new InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1();

    public InteractiveComponentSizeKt$MinimumInteractiveTopAlignmentLine$1() {
        super(2, AbstractC7390.class, "min", "min(II)I", 1);
    }

    @Override // p068.InterfaceC7383
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }

    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.min(i, i2));
    }
}
