package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.C1353;
import androidx.compose.runtime.InterfaceC1333;
import androidx.compose.runtime.InterfaceC1395;
import p000.AbstractC6087;
import p048.C6518;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世楪兰哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0690 implements InterfaceC1333 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f1930;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f1931;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final InterfaceC1395 f1932;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final int f1933;

    public C0690(int i, int i2, int i3) {
        this.f1933 = i2;
        this.f1931 = i3;
        int i4 = (i / i2) * i2;
        this.f1932 = AbstractC1367.m2466(AbstractC6087.m11422(Math.max(i4 - i3, 0), i4 + i2 + i3), C1353.f3921);
        this.f1930 = i;
    }

    @Override // androidx.compose.runtime.InterfaceC1333
    public final Object getValue() {
        return (C6518) ((AbstractC1347) this.f1932).getValue();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1484(int i) {
        if (i != this.f1930) {
            this.f1930 = i;
            int i2 = this.f1933;
            int i3 = (i / i2) * i2;
            int i4 = this.f1931;
            ((AbstractC1347) this.f1932).setValue(AbstractC6087.m11422(Math.max(i3 - i4, 0), i3 + i2 + i4));
        }
    }
}
