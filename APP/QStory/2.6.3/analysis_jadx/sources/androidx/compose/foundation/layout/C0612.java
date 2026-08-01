package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4395;
import p205.InterfaceC7896;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0612 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f1705;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f1706;

    public C0612(C0671 c0671, String str) {
        this.f1706 = str;
        this.f1705 = AbstractC1367.m2474(c0671);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0612) {
            return AbstractC4395.m8907(m1378(), ((C0612) obj).m1378());
        }
        return false;
    }

    public final int hashCode() {
        return this.f1706.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1706);
        sb.append("(left=");
        sb.append(m1378().f1868);
        sb.append(", top=");
        sb.append(m1378().f1867);
        sb.append(", right=");
        sb.append(m1378().f1866);
        sb.append(", bottom=");
        return AbstractC0053.m156(sb, m1378().f1865, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1377(C0671 c0671) {
        ((AbstractC1347) this.f1705).setValue(c0671);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0671 m1378() {
        return (C0671) ((AbstractC1347) this.f1705).getValue();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1370(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        return m1378().f1868;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1371(InterfaceC7896 interfaceC7896) {
        return m1378().f1867;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1372(InterfaceC7896 interfaceC7896) {
        return m1378().f1865;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1373(InterfaceC7896 interfaceC7896, LayoutDirection layoutDirection) {
        return m1378().f1866;
    }
}
