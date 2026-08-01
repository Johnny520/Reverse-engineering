package androidx.compose.p001ui.input.pointer;

import androidx.collection.C1091;
import androidx.collection.C1110;
import androidx.compose.p001ui.layout.InterfaceC2530;
import androidx.compose.runtime.collection.C2059;
import p248.C8894;

/* JADX INFO: renamed from: androidx.compose.ui.input.pointer.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C2486 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2059 f5191 = new C2059(0, new C2482[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1091 f5190 = new C1091(10);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public void mo3599(C8894 c8894) {
        C2059 c2059 = this.f5191;
        int i = c2059.f3865;
        while (true) {
            i--;
            if (-1 >= i) {
                return;
            }
            if (((C2482) c2059.f3866[i]).f5174.f659 == 0) {
                c2059.m2613(i);
            }
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public boolean mo3600(C1110 c1110, InterfaceC2530 interfaceC2530, C8894 c8894, boolean z) {
        C2059 c2059 = this.f5191;
        Object[] objArr = c2059.f3866;
        int i = c2059.f3865;
        boolean z2 = false;
        for (int i2 = 0; i2 < i; i2++) {
            z2 = ((C2482) objArr[i2]).mo3600(c1110, interfaceC2530, c8894, z) || z2;
        }
        return z2;
    }
}
