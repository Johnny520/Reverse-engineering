package androidx.compose.animation;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/飘花落叶言子楪兰苏哲世;", "it", "", "invoke", "(Lkotlin/飘花落叶言子楪兰苏哲世;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ boolean $visible;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedTransitionScopeImpl$sharedElementWithCallerManagedVisibility$1(boolean z) {
        super(1);
        this.$visible = z;
    }

    @Override // p052.InterfaceC6557
    public final Boolean invoke(C5175 c5175) {
        return Boolean.valueOf(this.$visible);
    }
}
