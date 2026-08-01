package androidx.compose.ui.window;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2107 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f6240;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f6241;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f6242;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SecureFlagPolicy f6243;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f6244;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f6245;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f6246;

    public C2107(int i) {
        boolean z = (i & 4) != 0;
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        this.f6245 = true;
        this.f6244 = true;
        this.f6243 = secureFlagPolicy;
        this.f6242 = z;
        this.f6241 = true;
        this.f6240 = "";
        this.f6246 = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2107)) {
            return false;
        }
        C2107 c2107 = (C2107) obj;
        return this.f6245 == c2107.f6245 && this.f6244 == c2107.f6244 && this.f6243 == c2107.f6243 && this.f6242 == c2107.f6242 && this.f6241 == c2107.f6241 && this.f6246 == c2107.f6246;
    }

    public final int hashCode() {
        return (AbstractC0053.m140(AbstractC0053.m140((this.f6243.hashCode() + AbstractC0053.m140(Boolean.hashCode(this.f6245) * 31, 31, this.f6244)) * 31, 31, this.f6242), 31, this.f6241) + this.f6246) * 31;
    }
}
