package androidx.compose.ui.window;

import androidx.activity.AbstractC0053;
import androidx.compose.runtime.C1358;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子世楪苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2090 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f6190;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f6191;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f6192;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f6193;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f6194;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f6195;

    public C2090(boolean z, SecureFlagPolicy secureFlagPolicy, boolean z2) {
        C1358 c1358 = AbstractC2091.f6197;
        int i = !z ? 262152 : 262144;
        i = secureFlagPolicy == SecureFlagPolicy.SecureOn ? i | 8192 : i;
        i = z2 ? i : i | 512;
        boolean z3 = secureFlagPolicy == SecureFlagPolicy.Inherit;
        this.f6195 = i;
        this.f6194 = z3;
        this.f6193 = true;
        this.f6192 = true;
        this.f6191 = true;
        this.f6190 = 1002;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2090)) {
            return false;
        }
        C2090 c2090 = (C2090) obj;
        return this.f6195 == c2090.f6195 && this.f6194 == c2090.f6194 && this.f6193 == c2090.f6193 && this.f6192 == c2090.f6192 && this.f6191 == c2090.f6191 && this.f6190 == c2090.f6190;
    }

    public final int hashCode() {
        return (AbstractC0053.m140(AbstractC0053.m140(AbstractC0053.m140(AbstractC0053.m140(AbstractC0053.m140(this.f6195 * 31, 31, this.f6194), 31, this.f6193), 31, this.f6192), 31, this.f6191), 31, false) + this.f6190) * 31;
    }

    public C2090(int i) {
        this((i & 1) == 0, SecureFlagPolicy.Inherit, true);
    }
}
