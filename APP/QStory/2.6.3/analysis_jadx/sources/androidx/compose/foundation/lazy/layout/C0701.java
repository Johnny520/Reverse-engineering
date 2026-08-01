package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.layout.InterfaceC1710;
import p176.AbstractC7741;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0701 implements InterfaceC1710 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f1971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0701 f1972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f1973;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0699 f1975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f1976;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f1974 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f1977 = AbstractC1367.m2474(null);

    public C0701(Object obj, C0699 c0699) {
        this.f1976 = obj;
        this.f1975 = c0699;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1499() {
        if (this.f1971) {
            return;
        }
        if (this.f1973 <= 0) {
            AbstractC7741.m13095("Release should only be called once");
        }
        int i = this.f1973 - 1;
        this.f1973 = i;
        if (i == 0) {
            this.f1975.f1965.remove(this);
            C0701 c0701 = this.f1972;
            if (c0701 != null) {
                c0701.m1499();
            }
            this.f1972 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0701 m1500() {
        C0701 c0701;
        if (this.f1971) {
            AbstractC7741.m13095("Pin should not be called on an already disposed item ");
        }
        if (this.f1973 == 0) {
            this.f1975.f1965.add(this);
            InterfaceC1710 interfaceC1710 = (InterfaceC1710) ((AbstractC1347) this.f1977).getValue();
            if (interfaceC1710 != null) {
                c0701 = (C0701) interfaceC1710;
                c0701.m1500();
            } else {
                c0701 = null;
            }
            this.f1972 = c0701;
        }
        this.f1973++;
        return this;
    }
}
