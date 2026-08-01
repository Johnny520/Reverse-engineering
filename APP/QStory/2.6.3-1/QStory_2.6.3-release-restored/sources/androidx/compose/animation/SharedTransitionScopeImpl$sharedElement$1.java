package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m151d2 = {"<anonymous>", "", "it", "Landroidx/compose/animation/EnterExitState;", "invoke", "(Landroidx/compose/animation/EnterExitState;)Ljava/lang/Boolean;"}, m152k = 3, m153mv = {2, 1, 0}, m155xi = 48)
final class SharedTransitionScopeImpl$sharedElement$1 extends Lambda implements InterfaceC7387 {
    public static final SharedTransitionScopeImpl$sharedElement$1 INSTANCE = new SharedTransitionScopeImpl$sharedElement$1();

    public SharedTransitionScopeImpl$sharedElement$1() {
        super(1);
    }

    @Override // p068.InterfaceC7387
    public final Boolean invoke(EnterExitState enterExitState) {
        return Boolean.valueOf(enterExitState == EnterExitState.Visible);
    }
}
