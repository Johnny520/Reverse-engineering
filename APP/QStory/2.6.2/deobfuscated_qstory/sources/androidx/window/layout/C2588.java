package androidx.window.layout;

import p147.C7566;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: androidx.window.layout.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2588 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C2589 f7761;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2589 f7762;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7566 f7763;

    public C2588(C7566 c7566, C2589 c2589, C2589 c25892) {
        this.f7763 = c7566;
        this.f7762 = c2589;
        this.f7761 = c25892;
        if (c7566.m12764() == 0 && c7566.m12765() == 0) {
            C5919.m11249("Bounds must be non zero");
            throw null;
        }
        if (c7566.f20487 == 0 || c7566.f20486 == 0) {
            return;
        }
        C5919.m11249("Bounding rectangle must start at the top or left window edge for folding features");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (C2588.class.equals(obj != null ? obj.getClass() : null)) {
            obj.getClass();
            C2588 c2588 = (C2588) obj;
            return this.f7763.equals(c2588.f7763) && this.f7762 == c2588.f7762 && this.f7761 == c2588.f7761;
        }
        return false;
    }

    public final int hashCode() {
        return this.f7761.hashCode() + ((this.f7762.hashCode() + (this.f7763.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return C2588.class.getSimpleName() + " { " + this.f7763 + ", type=" + this.f7762 + ", state=" + this.f7761 + " }";
    }
}
