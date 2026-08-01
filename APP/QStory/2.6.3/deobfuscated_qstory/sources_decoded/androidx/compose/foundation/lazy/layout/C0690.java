package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import androidx.window.area.AbstractC2567;
import p048.C6519;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0690 implements InterfaceC1333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f1931;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f1932;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1395 f1933;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f1934;

    public C0690(int i, int i2, int i3) {
        this.f1934 = i2;
        this.f1932 = i3;
        int i4 = (i / i2) * i2;
        this.f1933 = AbstractC1367.m2475(AbstractC2567.m5067(Math.max(i4 - i3, 0), i4 + i2 + i3), C1353.f3922);
        this.f1931 = i;
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        return (C6519) ((AbstractC1347) this.f1933).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1494(int i) {
        if (i != this.f1931) {
            this.f1931 = i;
            int i2 = this.f1934;
            int i3 = (i / i2) * i2;
            int i4 = this.f1932;
            ((AbstractC1347) this.f1933).setValue(AbstractC2567.m5067(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }
}
