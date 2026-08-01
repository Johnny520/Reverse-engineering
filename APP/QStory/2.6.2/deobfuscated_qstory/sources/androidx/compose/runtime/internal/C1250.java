package androidx.compose.runtime.internal;

import androidx.compose.runtime.C1320;
import androidx.compose.runtime.InterfaceC1339;
import androidx.compose.runtime.collection.C1224;
import java.util.Set;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1250 implements InterfaceC1339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1224 f3624 = new C1224(0, new C1320[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f3625;

    public C1250(Set set) {
        this.f3625 = set;
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo2164() {
        C1224 c1224 = this.f3624;
        Object[] objArr = c1224.f3520;
        int i = c1224.f3519;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC1339 interfaceC1339 = ((C1320) objArr[i2]).f3823;
            this.f3625.remove(interfaceC1339);
            interfaceC1339.mo2164();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo2165() {
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2166() {
    }
}
