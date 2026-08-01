package androidx.compose.ui;

import androidx.compose.runtime.InterfaceC1333;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6542;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class MediaQueryKt$derivedMediaQuery$1$1 extends Lambda implements InterfaceC6542 {
    final /* synthetic */ InterfaceC1333 $currentQuery$delegate;
    final /* synthetic */ InterfaceC2122 $mediaScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MediaQueryKt$derivedMediaQuery$1$1(InterfaceC2122 interfaceC2122, InterfaceC1333 interfaceC1333) {
        super(0);
        this.$mediaScope = interfaceC2122;
        this.$currentQuery$delegate = interfaceC1333;
    }

    @Override // p052.InterfaceC6542
    public final Boolean invoke() {
        InterfaceC1333 interfaceC1333 = this.$currentQuery$delegate;
        int i = AbstractC2133.f6297;
        return (Boolean) ((InterfaceC6557) interfaceC1333.getValue()).invoke(this.$mediaScope);
    }
}
