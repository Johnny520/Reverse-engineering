package androidx.compose.foundation.layout;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1395;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC4394;
import p205.InterfaceC7895;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.飘花落叶言子哲世苏楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0612 implements InterfaceC0608 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC1395 f1704;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f1705;

    public C0612(C0671 c0671, String str) {
        this.f1705 = str;
        this.f1704 = AbstractC1367.m2465(c0671);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0612) {
            return AbstractC4394.m8917(m1368(), ((C0612) obj).m1368());
        }
        return false;
    }

    public final int hashCode() {
        return this.f1705.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1705);
        sb.append("(left=");
        sb.append(m1368().f1867);
        sb.append(", top=");
        sb.append(m1368().f1866);
        sb.append(", right=");
        sb.append(m1368().f1865);
        sb.append(", bottom=");
        return AbstractC0053.m154(sb, m1368().f1864, ')');
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1367(C0671 c0671) {
        ((AbstractC1347) this.f1704).setValue(c0671);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0671 m1368() {
        return (C0671) ((AbstractC1347) this.f1704).getValue();
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final int mo1360(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        return m1368().f1867;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰 */
    public final int mo1361(InterfaceC7895 interfaceC7895) {
        return m1368().f1866;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final int mo1362(InterfaceC7895 interfaceC7895) {
        return m1368().f1864;
    }

    @Override // androidx.compose.foundation.layout.InterfaceC0608
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public final int mo1363(InterfaceC7895 interfaceC7895, LayoutDirection layoutDirection) {
        return m1368().f1865;
    }
}
