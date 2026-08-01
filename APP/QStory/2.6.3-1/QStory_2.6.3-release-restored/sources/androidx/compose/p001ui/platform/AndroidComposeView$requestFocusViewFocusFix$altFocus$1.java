package androidx.compose.p001ui.platform;

import androidx.compose.p001ui.focus.C2287;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p068.InterfaceC7387;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m150d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m151d2 = {"Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;", "it", "", "invoke", "(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)Ljava/lang/Boolean;", "<anonymous>"}, m152k = 3, m153mv = {2, 1, 0})
final class AndroidComposeView$requestFocusViewFocusFix$altFocus$1 extends Lambda implements InterfaceC7387 {
    final /* synthetic */ int $focusDirection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$requestFocusViewFocusFix$altFocus$1(int i) {
        super(1);
        this.$focusDirection = i;
    }

    @Override // p068.InterfaceC7387
    public final Boolean invoke(C2287 c2287) {
        return Boolean.valueOf(c2287.m3156(this.$focusDirection));
    }
}
