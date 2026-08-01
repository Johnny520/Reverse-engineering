package androidx.compose.ui.input.pointer;

import androidx.collection.C0244;
import androidx.collection.C0263;
import androidx.compose.runtime.collection.C1224;
import androidx.compose.ui.layout.InterfaceC1695;
import p232.C8064;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C1651 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1224 f4845 = new C1224(0, new C1647[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0244 f4844 = new C0244(10);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo3029(C8064 c8064) {
        C1224 c1224 = this.f4845;
        int i = c1224.f3519;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((C1647) c1224.f3520[i]).f4828.f314 == 0) {
                c1224.m2043(i);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo3030(C0263 c0263, InterfaceC1695 interfaceC1695, C8064 c8064, boolean z) {
        C1224 c1224 = this.f4845;
        Object[] objArr = c1224.f3520;
        int i = c1224.f3519;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((C1647) objArr[i2]).mo3030(c0263, interfaceC1695, c8064, z) || z2;
        }
        return z2;
    }
}
