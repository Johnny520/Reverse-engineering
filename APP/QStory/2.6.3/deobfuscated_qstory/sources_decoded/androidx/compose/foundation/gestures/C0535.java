package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import kotlinx.coroutines.C5402;
import kotlinx.coroutines.C5444;
import p052.InterfaceC6543;
import p175.AbstractC7739;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0535 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5444 f1558;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6543 f1559;

    public C0535(InterfaceC6543 interfaceC6543, C5444 c5444) {
        this.f1559 = interfaceC6543;
        this.f1558 = c5444;
    }

    public final String toString() {
        C5444 c5444 = this.f1558;
        C5402 c5402 = (C5402) c5444.f15095.get(C5402.f15044);
        String str = c5402 != null ? c5402.f15045 : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        AbstractC7739.m13083(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append(str != null ? AbstractC0053.m158("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.f1559.invoke());
        sb.append(", continuation=");
        sb.append(c5444);
        sb.append(')');
        return sb.toString();
    }
}
