package p126;

import androidx.collection.C0235;
import androidx.compose.foundation.text.selection.C0920;
import androidx.compose.runtime.C1320;
import androidx.compose.runtime.C1389;
import androidx.compose.runtime.InterfaceC1356;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.runtime.composer.gapbuffer.C1230;
import androidx.compose.runtime.composer.gapbuffer.C1235;
import androidx.compose.runtime.internal.C1251;
import p052.InterfaceC6543;
import p070.AbstractC6900;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7451 extends AbstractC6900 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7451 f20162;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7451 f20163;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C7451 f20164;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C7451 f20165;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f20166;

    static {
        int i = 1;
        f20163 = new C7451(i, 2, 0);
        int i2 = 1;
        f20162 = new C7451(i2, i2, 1);
        f20165 = new C7451(i, 2, 2);
        int i3 = 1;
        f20164 = new C7451(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7451(int i, int i2, int i3) {
        super(i, i2, 1, (byte) 0);
        this.f20166 = i3;
    }

    @Override // p070.AbstractC6900
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public C1230 mo12180(C0920 c0920) {
        switch (this.f20166) {
            case 0:
                return (C1230) c0920.m1823(1);
            case 1:
                return (C1230) c0920.m1823(0);
            default:
                return super.mo12180(c0920);
        }
    }

    @Override // p070.AbstractC6900
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12182(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7430 interfaceC7430) {
        switch (this.f20166) {
            case 0:
                Object objInvoke = ((InterfaceC6543) c0920.m1823(0)).invoke();
                C1230 c1230 = (C1230) c0920.m1823(1);
                int iM1824 = c0920.m1824(0);
                c1230.getClass();
                c1235.m2091(c1235.m2116(c1230), objInvoke);
                interfaceC1356.mo950(iM1824, objInvoke);
                interfaceC1356.mo942(objInvoke);
                break;
            case 1:
                C1230 c12302 = (C1230) c0920.m1823(0);
                int iM18242 = c0920.m1824(0);
                interfaceC1356.mo946();
                c12302.getClass();
                interfaceC1356.mo943(iM18242, c1235.m2102(c1235.m2116(c12302)));
                break;
            case 2:
                Object objM1823 = c0920.m1823(0);
                C1230 c12303 = (C1230) c0920.m1823(1);
                int iM18243 = c0920.m1824(0);
                if (objM1823 instanceof C1320) {
                    C1320 c1320 = (C1320) objM1823;
                    ((C1224) c1251.f3629).m2047(c1320);
                    ((C0235) c1251.f3634).m741(c1320);
                }
                Object objM2099 = c1235.m2099(objM1823, c1235.m2116(c12303), iM18243);
                if (objM2099 instanceof C1320) {
                    c1251.m2178((C1320) objM2099);
                } else if (objM2099 instanceof C1389) {
                    ((C1389) objM2099).m2528();
                }
                break;
            default:
                Object objM18232 = c0920.m1823(0);
                int iM18244 = c0920.m1824(0);
                if (objM18232 instanceof C1320) {
                    C1320 c13202 = (C1320) objM18232;
                    ((C1224) c1251.f3629).m2047(c13202);
                    ((C0235) c1251.f3634).m741(c13202);
                }
                Object objM20992 = c1235.m2099(objM18232, c1235.f3570, iM18244);
                if (objM20992 instanceof C1320) {
                    c1251.m2178((C1320) objM20992);
                } else if (objM20992 instanceof C1389) {
                    ((C1389) objM20992).m2528();
                }
                break;
        }
    }
}
