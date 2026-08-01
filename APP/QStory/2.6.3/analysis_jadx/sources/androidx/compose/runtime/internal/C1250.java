package androidx.compose.runtime.internal;

import androidx.compose.runtime.C1320;
import androidx.compose.runtime.InterfaceC1339;
import androidx.compose.runtime.collection.C1224;
import java.util.Set;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1250 implements InterfaceC1339 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C1224 f3625 = new C1224(0, new C1320[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f3626;

    public C1250(Set set) {
        this.f3626 = set;
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo2174() {
        C1224 c1224 = this.f3625;
        Object[] objArr = c1224.f3521;
        int i = c1224.f3520;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC1339 interfaceC1339 = ((C1320) objArr[i2]).f3824;
            this.f3626.remove(interfaceC1339);
            interfaceC1339.mo2174();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo2175() {
    }

    @Override // androidx.compose.runtime.InterfaceC1339
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2176() {
    }
}
