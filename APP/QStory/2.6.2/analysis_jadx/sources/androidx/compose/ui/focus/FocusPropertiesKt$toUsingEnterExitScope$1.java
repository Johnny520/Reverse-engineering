package androidx.compose.ui.focus;

import kotlin.C5175;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;
import p052.InterfaceC6557;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/focus/飘花落叶言子楪世兰苏哲;", "Lkotlin/飘花落叶言子楪兰苏哲世;", "invoke", "(Landroidx/compose/ui/focus/飘花落叶言子楪世兰苏哲;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
final class FocusPropertiesKt$toUsingEnterExitScope$1 extends Lambda implements InterfaceC6557 {
    final /* synthetic */ InterfaceC6557 $this_toUsingEnterExitScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FocusPropertiesKt$toUsingEnterExitScope$1(InterfaceC6557 interfaceC6557) {
        super(1);
        this.$this_toUsingEnterExitScope = interfaceC6557;
    }

    public final void invoke(InterfaceC1463 interfaceC1463) {
        C1468 c1468 = (C1468) this.$this_toUsingEnterExitScope.invoke(new C1464(((C1467) interfaceC1463).f4165));
        if (c1468 == C1468.f4167) {
            ((C1467) interfaceC1463).f4164 = true;
        } else if (c1468 != C1468.f4168) {
            C1468.m2622(c1468);
        }
    }

    @Override // p052.InterfaceC6557
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((InterfaceC1463) obj);
        return C5175.f14739;
    }
}
