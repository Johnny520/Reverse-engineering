package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.layout.InterfaceC1710;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世苏楪哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0701 implements InterfaceC1710 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public boolean f1970;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public C0701 f1971;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public int f1972;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C0699 f1974;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object f1975;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int f1973 = -1;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final InterfaceC1395 f1976 = AbstractC1367.m2465(null);

    public C0701(Object obj, C0699 c0699) {
        this.f1975 = obj;
        this.f1974 = c0699;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m1489() {
        if (this.f1970) {
            return;
        }
        if (this.f1972 <= 0) {
            AbstractC7740.m13067("Release should only be called once");
        }
        int i = this.f1972 - 1;
        this.f1972 = i;
        if (i == 0) {
            this.f1974.f1964.remove(this);
            C0701 c0701 = this.f1971;
            if (c0701 != null) {
                c0701.m1489();
            }
            this.f1971 = null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0701 m1490() {
        C0701 c0701;
        if (this.f1970) {
            AbstractC7740.m13067("Pin should not be called on an already disposed item ");
        }
        if (this.f1972 == 0) {
            this.f1974.f1964.add(this);
            InterfaceC1710 interfaceC1710 = (InterfaceC1710) ((AbstractC1347) this.f1976).getValue();
            if (interfaceC1710 != null) {
                c0701 = (C0701) interfaceC1710;
                c0701.m1490();
            } else {
                c0701 = null;
            }
            this.f1971 = c0701;
        }
        this.f1972++;
        return this;
    }
}
