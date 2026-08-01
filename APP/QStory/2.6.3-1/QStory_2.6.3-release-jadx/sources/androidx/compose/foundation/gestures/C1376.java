package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0900;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6276;
import p068.InterfaceC7372;
import p191.AbstractC8568;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1376 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6276 f1903;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC7372 f1904;

    public C1376(InterfaceC7372 interfaceC7372, C6276 c6276) {
        this.f1904 = interfaceC7372;
        this.f1903 = c6276;
    }

    public final String toString() {
        C6276 c6276 = this.f1903;
        C6234 c6234 = (C6234) c6276.f15440.get(C6234.f15389);
        String str = c6234 != null ? c6234.f15390 : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        AbstractC8568.m13642(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append(str != null ? AbstractC0900.m718("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.f1904.invoke());
        sb.append(", continuation=");
        sb.append(c6276);
        sb.append(')');
        return sb.toString();
    }
}
