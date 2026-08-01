package androidx.compose.ui.platform;

import androidx.compose.ui.focus.C1452;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p052.InterfaceC6558;

/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;", "it", "", "invoke", "(Landroidx/compose/ui/focus/飘花落叶言子世楪兰苏哲;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class AndroidComposeView$requestFocusViewFocusFix$focusSearchResult$1 extends Lambda implements InterfaceC6558 {
    final /* synthetic */ int $focusDirection;
    final /* synthetic */ Ref$BooleanRef $foundFocusable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeView$requestFocusViewFocusFix$focusSearchResult$1(Ref$BooleanRef ref$BooleanRef, int i) {
        super(1);
        this.$foundFocusable = ref$BooleanRef;
        this.$focusDirection = i;
    }

    @Override // p052.InterfaceC6558
    public final Boolean invoke(C1452 c1452) {
        this.$foundFocusable.element = true;
        return Boolean.valueOf(c1452.m2596(this.$focusDirection));
    }
}
