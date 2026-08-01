package androidx.compose.foundation.gestures;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import kotlinx.coroutines.C5401;
import kotlinx.coroutines.C5443;
import p052.InterfaceC6542;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0535 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C5443 f1557;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final InterfaceC6542 f1558;

    public C0535(InterfaceC6542 interfaceC6542, C5443 c5443) {
        this.f1558 = interfaceC6542;
        this.f1557 = c5443;
    }

    public final String toString() {
        C5443 c5443 = this.f1557;
        C5401 c5401 = (C5401) c5443.f15095.get(C5401.f15044);
        String str = c5401 != null ? c5401.f15045 : null;
        StringBuilder sb = new StringBuilder("Request@");
        int iHashCode = hashCode();
        AbstractC3056.m6677(16);
        String string = Integer.toString(iHashCode, 16);
        string.getClass();
        sb.append(string);
        sb.append(str != null ? AbstractC0053.m156("[", str, "](") : "(");
        sb.append("currentBounds()=");
        sb.append(this.f1558.invoke());
        sb.append(", continuation=");
        sb.append(c5443);
        sb.append(')');
        return sb.toString();
    }
}
