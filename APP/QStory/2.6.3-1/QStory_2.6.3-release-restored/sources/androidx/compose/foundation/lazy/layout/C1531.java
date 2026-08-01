package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.C2188;
import androidx.compose.runtime.InterfaceC2168;
import androidx.compose.runtime.InterfaceC2230;
import androidx.window.area.AbstractC3400;
import p064.C7348;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1531 implements InterfaceC2168 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f2276;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f2277;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC2230 f2278;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f2279;

    public C1531(int i, int i2, int i3) {
        this.f2279 = i2;
        this.f2277 = i3;
        int i4 = (i / i2) * i2;
        this.f2278 = AbstractC2202.m3035(AbstractC3400.m5627(Math.max(i4 - i3, 0), i4 + i2 + i3), C2188.f4267);
        this.f2276 = i;
    }

    @Override // androidx.compose.runtime.InterfaceC2168
    public final Object getValue() {
        return (C7348) ((AbstractC2182) this.f2278).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m2054(int i) {
        if (i != this.f2276) {
            this.f2276 = i;
            int i2 = this.f2279;
            int i3 = (i / i2) * i2;
            int i4 = this.f2277;
            ((AbstractC2182) this.f2278).setValue(AbstractC3400.m5627(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }
}
