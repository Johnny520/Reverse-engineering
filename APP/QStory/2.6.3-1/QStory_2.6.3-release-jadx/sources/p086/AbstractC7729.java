package p086;

import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2086;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC5554;
import p142.InterfaceC8259;

/* JADX INFO: renamed from: 飘花落叶言世楪哲兰子苏.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f18748;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f18749;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f18750;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AbstractC7729(int i, int i2, int i3) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, 1, (byte) 0);
        this.f18750 = 1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static C7731 m12736() {
        return new C7731(0, 1, 0, (byte) 0);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static C7731 m12737(AbstractC7729 abstractC7729) {
        byte b = 0;
        return new C7731(abstractC7729.f18749 + abstractC7729.f18748, 1, b, b);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C7730 m12738(AbstractC7729 abstractC7729, InterfaceC5554[] interfaceC5554Arr) {
        return new C7730(abstractC7729.f18749 + abstractC7729.f18748, interfaceC5554Arr);
    }

    public String toString() {
        switch (this.f18750) {
            case 1:
                String simpleName = AbstractC5228.f13320.mo9476(getClass()).getSimpleName();
                return simpleName == null ? "" : simpleName;
            default:
                return super.toString();
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public C2065 mo12739(C1758 c1758) {
        return null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public abstract Object mo12740(int i);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public abstract void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259);

    public /* synthetic */ AbstractC7729(int i, int i2, int i3, byte b) {
        this.f18750 = i3;
        this.f18749 = i;
        this.f18748 = i2;
    }
}
