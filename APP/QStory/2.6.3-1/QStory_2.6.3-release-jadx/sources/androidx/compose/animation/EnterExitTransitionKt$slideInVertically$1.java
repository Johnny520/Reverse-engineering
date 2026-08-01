package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\n\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"<anonymous>", "", "it", "invoke", "(I)Ljava/lang/Integer;"}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class EnterExitTransitionKt$slideInVertically$1 extends Lambda implements InterfaceC7387 {
    public static final EnterExitTransitionKt$slideInVertically$1 INSTANCE = new EnterExitTransitionKt$slideInVertically$1();

    public EnterExitTransitionKt$slideInVertically$1() {
        super(1);
    }

    @Override // p068.InterfaceC7387
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }

    public final Integer invoke(int i) {
        return Integer.valueOf((-i) / 2);
    }
}
