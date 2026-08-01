package androidx.compose.ui.viewinterop;

import androidx.compose.foundation.lazy.layout.C0701;
import androidx.compose.ui.focus.C1452;
import androidx.compose.ui.layout.InterfaceC1710;
import androidx.compose.ui.node.AbstractC1785;
import androidx.compose.ui.node.AbstractC1788;
import androidx.compose.ui.node.InterfaceC1783;
import androidx.compose.ui.node.InterfaceC1791;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2081 extends AbstractC1788 implements InterfaceC1791, InterfaceC1783 {

    /* JADX INFO: renamed from: 飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
    public C0701 f6179;

    /* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲, reason: contains not printable characters */
    public final C1452 f6180;

    public C2081() {
        C1452 c1452 = new C1452(0, new FocusTargetInteropNode$focusTargetNode$1(this), 9);
        m3364(c1452);
        this.f6180 = c1452;
    }

    @Override // androidx.compose.ui.node.InterfaceC1791
    /* JADX INFO: renamed from: 飘花落叶言子苏世兰楪哲 */
    public final void mo1127() {
        C0701 c0701;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        AbstractC1785.m3344(this, new FocusTargetInteropNode$retrievePinnableContainer$1(ref$ObjectRef, this));
        InterfaceC1710 interfaceC1710 = (InterfaceC1710) ref$ObjectRef.element;
        if (this.f6180.m2597().isFocused()) {
            C0701 c07012 = this.f6179;
            if (c07012 != null) {
                c07012.m1499();
            }
            if (interfaceC1710 != null) {
                c0701 = (C0701) interfaceC1710;
                c0701.m1500();
            } else {
                c0701 = null;
            }
            this.f6179 = c0701;
        }
    }
}
