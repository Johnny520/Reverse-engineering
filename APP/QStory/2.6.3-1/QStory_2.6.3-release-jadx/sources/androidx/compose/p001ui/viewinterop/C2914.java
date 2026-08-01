package androidx.compose.p001ui.viewinterop;

import androidx.compose.foundation.lazy.layout.C1542;
import androidx.compose.p001ui.focus.C2287;
import androidx.compose.p001ui.layout.InterfaceC2545;
import androidx.compose.p001ui.node.AbstractC2620;
import androidx.compose.p001ui.node.AbstractC2623;
import androidx.compose.p001ui.node.InterfaceC2618;
import androidx.compose.p001ui.node.InterfaceC2626;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2914 extends AbstractC2623 implements InterfaceC2626, InterfaceC2618 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C1542 f6524;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C2287 f6525;

    public C2914() {
        C2287 c2287 = new C2287(0, new FocusTargetInteropNode$focusTargetNode$1(this), 9);
        m3924(c2287);
        this.f6525 = c2287;
    }

    @Override // androidx.compose.p001ui.node.InterfaceC2626
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1687() {
        C1542 c1542;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC2620.m3904(this, new FocusTargetInteropNode$retrievePinnableContainer$1(ref$ObjectRef, this));
        InterfaceC2545 interfaceC2545 = (InterfaceC2545) ref$ObjectRef.element;
        if (this.f6525.m3157().isFocused()) {
            C1542 c15422 = this.f6524;
            if (c15422 != null) {
                c15422.m2059();
            }
            if (interfaceC2545 != null) {
                c1542 = (C1542) interfaceC2545;
                c1542.m2060();
            } else {
                c1542 = null;
            }
            this.f6524 = c1542;
        }
    }
}
