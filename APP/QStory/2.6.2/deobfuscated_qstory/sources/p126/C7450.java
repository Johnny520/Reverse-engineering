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
import p052.InterfaceC6542;
import p070.AbstractC6899;

/* JADX INFO: renamed from: 飘花落叶言子世苏楪兰哲.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7450 extends AbstractC6899 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public static final C7450 f20167;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7450 f20168;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public static final C7450 f20169;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public static final C7450 f20170;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final /* synthetic */ int f20171;

    static {
        int i = 1;
        f20168 = new C7450(i, 2, 0);
        int i2 = 1;
        f20167 = new C7450(i2, i2, 1);
        f20170 = new C7450(i, 2, 2);
        int i3 = 1;
        f20169 = new C7450(i3, i3, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7450(int i, int i2, int i3) {
        super(i, i2, 1, (byte) 0);
        this.f20171 = i3;
    }

    @Override // p070.AbstractC6899
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏 */
    public C1230 mo12152(C0920 c0920) {
        switch (this.f20171) {
            case 0:
                return (C1230) c0920.m1813(1);
            case 1:
                return (C1230) c0920.m1813(0);
            default:
                return super.mo12152(c0920);
        }
    }

    @Override // p070.AbstractC6899
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final void mo12154(C0920 c0920, InterfaceC1356 interfaceC1356, C1235 c1235, C1251 c1251, InterfaceC7429 interfaceC7429) {
        switch (this.f20171) {
            case 0:
                Object objInvoke = ((InterfaceC6542) c0920.m1813(0)).invoke();
                C1230 c1230 = (C1230) c0920.m1813(1);
                int iM1814 = c0920.m1814(0);
                c1230.getClass();
                c1235.m2081(c1235.m2106(c1230), objInvoke);
                interfaceC1356.mo949(iM1814, objInvoke);
                interfaceC1356.mo941(objInvoke);
                break;
            case 1:
                C1230 c12302 = (C1230) c0920.m1813(0);
                int iM18142 = c0920.m1814(0);
                interfaceC1356.mo946();
                c12302.getClass();
                interfaceC1356.mo942(iM18142, c1235.m2092(c1235.m2106(c12302)));
                break;
            case 2:
                Object objM1813 = c0920.m1813(0);
                C1230 c12303 = (C1230) c0920.m1813(1);
                int iM18143 = c0920.m1814(0);
                if (objM1813 instanceof C1320) {
                    C1320 c1320 = (C1320) objM1813;
                    ((C1224) c1251.f3628).m2037(c1320);
                    ((C0235) c1251.f3633).m740(c1320);
                }
                Object objM2089 = c1235.m2089(objM1813, c1235.m2106(c12303), iM18143);
                if (objM2089 instanceof C1320) {
                    c1251.m2168((C1320) objM2089);
                } else if (objM2089 instanceof C1389) {
                    ((C1389) objM2089).m2518();
                }
                break;
            default:
                Object objM18132 = c0920.m1813(0);
                int iM18144 = c0920.m1814(0);
                if (objM18132 instanceof C1320) {
                    C1320 c13202 = (C1320) objM18132;
                    ((C1224) c1251.f3628).m2037(c13202);
                    ((C0235) c1251.f3633).m740(c13202);
                }
                Object objM20892 = c1235.m2089(objM18132, c1235.f3569, iM18144);
                if (objM20892 instanceof C1320) {
                    c1251.m2168((C1320) objM20892);
                } else if (objM20892 instanceof C1389) {
                    ((C1389) objM20892).m2518();
                }
                break;
        }
    }
}
