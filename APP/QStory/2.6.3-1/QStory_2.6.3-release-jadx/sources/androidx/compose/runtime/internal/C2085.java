package androidx.compose.runtime.internal;

import androidx.compose.runtime.C2155;
import androidx.compose.runtime.InterfaceC2174;
import androidx.compose.runtime.collection.C2059;
import java.util.Set;

/* JADX INFO: renamed from: androidx.compose.runtime.internal.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2085 implements InterfaceC2174 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final C2059 f3970 = new C2059(0, new C2155[16]);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final Set f3971;

    public C2085(Set set) {
        this.f3971 = set;
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo2734() {
        C2059 c2059 = this.f3970;
        Object[] objArr = c2059.f3866;
        int i = c2059.f3865;
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC2174 interfaceC2174 = ((C2155) objArr[i2]).f4169;
            this.f3971.remove(interfaceC2174);
            interfaceC2174.mo2734();
        }
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void mo2735() {
    }

    @Override // androidx.compose.runtime.InterfaceC2174
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void mo2736() {
    }
}
