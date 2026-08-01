package p142;

import androidx.collection.C1082;
import androidx.compose.foundation.text.selection.C1758;
import androidx.compose.runtime.C2155;
import androidx.compose.runtime.C2224;
import androidx.compose.runtime.InterfaceC2191;
import androidx.compose.runtime.collection.C2059;
import androidx.compose.runtime.composer.gapbuffer.C2065;
import androidx.compose.runtime.composer.gapbuffer.C2070;
import androidx.compose.runtime.internal.C2086;
import p068.InterfaceC7372;
import p086.AbstractC7729;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8280 extends AbstractC7729 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C8280 f20507;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C8280 f20508;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C8280 f20509;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C8280 f20510;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f20511;

    static {
        int i = 1;
        f20508 = new C8280(i, 2, 0);
        int i2 = 1;
        f20507 = new C8280(i2, i2, 1);
        f20510 = new C8280(i, 2, 2);
        int i3 = 1;
        f20509 = new C8280(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C8280(int i, int i2, int i3) {
        super(i, i2, 1, (byte) 0);
        this.f20511 = i3;
    }

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public C2065 mo12739(C1758 c1758) {
        switch (this.f20511) {
            case 0:
                return (C2065) c1758.m2383(1);
            case 1:
                return (C2065) c1758.m2383(0);
            default:
                return super.mo12739(c1758);
        }
    }

    @Override // p086.AbstractC7729
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12741(C1758 c1758, InterfaceC2191 interfaceC2191, C2070 c2070, C2086 c2086, InterfaceC8259 interfaceC8259) {
        switch (this.f20511) {
            case 0:
                Object objInvoke = ((InterfaceC7372) c1758.m2383(0)).invoke();
                C2065 c2065 = (C2065) c1758.m2383(1);
                int iM2384 = c1758.m2384(0);
                c2065.getClass();
                c2070.m2651(c2070.m2676(c2065), objInvoke);
                interfaceC2191.mo1510(iM2384, objInvoke);
                interfaceC2191.mo1502(objInvoke);
                break;
            case 1:
                C2065 c20652 = (C2065) c1758.m2383(0);
                int iM23842 = c1758.m2384(0);
                interfaceC2191.mo1506();
                c20652.getClass();
                interfaceC2191.mo1503(iM23842, c2070.m2662(c2070.m2676(c20652)));
                break;
            case 2:
                Object objM2383 = c1758.m2383(0);
                C2065 c20653 = (C2065) c1758.m2383(1);
                int iM23843 = c1758.m2384(0);
                if (objM2383 instanceof C2155) {
                    C2155 c2155 = (C2155) objM2383;
                    ((C2059) c2086.f3974).m2607(c2155);
                    ((C1082) c2086.f3979).m1301(c2155);
                }
                Object objM2659 = c2070.m2659(objM2383, c2070.m2676(c20653), iM23843);
                if (objM2659 instanceof C2155) {
                    c2086.m2738((C2155) objM2659);
                } else if (objM2659 instanceof C2224) {
                    ((C2224) objM2659).m3088();
                }
                break;
            default:
                Object objM23832 = c1758.m2383(0);
                int iM23844 = c1758.m2384(0);
                if (objM23832 instanceof C2155) {
                    C2155 c21552 = (C2155) objM23832;
                    ((C2059) c2086.f3974).m2607(c21552);
                    ((C1082) c2086.f3979).m1301(c21552);
                }
                Object objM26592 = c2070.m2659(objM23832, c2070.f3915, iM23844);
                if (objM26592 instanceof C2155) {
                    c2086.m2738((C2155) objM26592);
                } else if (objM26592 instanceof C2224) {
                    ((C2224) objM26592).m3088();
                }
                break;
        }
    }
}
