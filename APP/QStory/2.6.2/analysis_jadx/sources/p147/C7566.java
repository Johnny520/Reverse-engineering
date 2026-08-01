package p147;

import android.graphics.Rect;
import androidx.activity.AbstractC0053;
import p007.AbstractC6136;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f20484;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20486;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20487;

    static {
        new C7566(0, 0, 0, 0);
    }

    public C7566(int i, int i2, int i3, int i4) {
        this.f20487 = i;
        this.f20486 = i2;
        this.f20485 = i3;
        this.f20484 = i4;
        if (i > i3) {
            C5919.m11253(AbstractC6136.m11559(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        C5919.m11253(AbstractC6136.m11559(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7566.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C7566 c7566 = (C7566) obj;
        return this.f20487 == c7566.f20487 && this.f20486 == c7566.f20486 && this.f20485 == c7566.f20485 && this.f20484 == c7566.f20484;
    }

    public final int hashCode() {
        return (((((this.f20487 * 31) + this.f20486) * 31) + this.f20485) * 31) + this.f20484;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C7566.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f20487);
        sb.append(',');
        sb.append(this.f20486);
        sb.append(',');
        sb.append(this.f20485);
        sb.append(',');
        return AbstractC0053.m147(sb, "] }", this.f20484);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12764() {
        return this.f20485 - this.f20487;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12765() {
        return this.f20484 - this.f20486;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7566(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
