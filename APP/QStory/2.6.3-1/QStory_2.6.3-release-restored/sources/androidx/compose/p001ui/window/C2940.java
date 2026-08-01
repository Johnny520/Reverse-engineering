package androidx.compose.p001ui.window;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.window.飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2940 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f6586;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f6587;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f6588;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final SecureFlagPolicy f6589;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f6590;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f6591;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f6592;

    public C2940(int i) {
        boolean z = (i & 4) != 0;
        SecureFlagPolicy secureFlagPolicy = SecureFlagPolicy.Inherit;
        this.f6591 = true;
        this.f6590 = true;
        this.f6589 = secureFlagPolicy;
        this.f6588 = z;
        this.f6587 = true;
        this.f6586 = "";
        this.f6592 = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2940)) {
            return false;
        }
        C2940 c2940 = (C2940) obj;
        return this.f6591 == c2940.f6591 && this.f6590 == c2940.f6590 && this.f6589 == c2940.f6589 && this.f6588 == c2940.f6588 && this.f6587 == c2940.f6587 && this.f6592 == c2940.f6592;
    }

    public final int hashCode() {
        return (AbstractC0900.m701(AbstractC0900.m701((this.f6589.hashCode() + AbstractC0900.m701(Boolean.hashCode(this.f6591) * 31, 31, this.f6590)) * 31, 31, this.f6588), 31, this.f6587) + this.f6592) * 31;
    }
}
