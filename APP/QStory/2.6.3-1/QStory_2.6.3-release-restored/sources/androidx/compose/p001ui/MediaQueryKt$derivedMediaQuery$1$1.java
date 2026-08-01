package androidx.compose.p001ui;

import androidx.compose.runtime.InterfaceC2168;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m151d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class MediaQueryKt$derivedMediaQuery$1$1 extends Lambda implements InterfaceC7372 {
    final /* synthetic */ InterfaceC2168 $currentQuery$delegate;
    final /* synthetic */ InterfaceC2955 $mediaScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQueryKt$derivedMediaQuery$1$1(InterfaceC2955 interfaceC2955, InterfaceC2168 interfaceC2168) {
        super(0);
        this.$mediaScope = interfaceC2955;
        this.$currentQuery$delegate = interfaceC2168;
    }

    @Override // p068.InterfaceC7372
    public final Boolean invoke() {
        InterfaceC2168 interfaceC2168 = this.$currentQuery$delegate;
        int i = AbstractC2966.f6643;
        return (Boolean) ((InterfaceC7387) interfaceC2168.getValue()).invoke(this.$mediaScope);
    }
}
