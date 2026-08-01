package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/EnterExitState;", "invoke", "(Landroidx/compose/animation/EnterExitState;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0}, xi = 48)
final class SharedTransitionScopeImpl$sharedBounds$1 extends Lambda implements InterfaceC6557 {
    public static final SharedTransitionScopeImpl$sharedBounds$1 INSTANCE = new SharedTransitionScopeImpl$sharedBounds$1();

    public SharedTransitionScopeImpl$sharedBounds$1() {
        super(1);
    }

    @Override // p052.InterfaceC6557
    public final Boolean invoke(EnterExitState enterExitState) {
        return Boolean.valueOf(enterExitState == EnterExitState.Visible);
    }
}
