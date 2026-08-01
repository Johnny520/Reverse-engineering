package p163;

import android.graphics.Rect;
import androidx.activity.AbstractC0900;
import p025.AbstractC7012;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f20824;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20825;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20826;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20827;

    static {
        new C8396(0, 0, 0, 0);
    }

    public C8396(int i, int i2, int i3, int i4) {
        this.f20827 = i;
        this.f20826 = i2;
        this.f20825 = i3;
        this.f20824 = i4;
        if (i > i3) {
            C6755.m11873(AbstractC7012.m12150(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        C6755.m11873(AbstractC7012.m12150(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C8396.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C8396 c8396 = (C8396) obj;
        return this.f20827 == c8396.f20827 && this.f20826 == c8396.f20826 && this.f20825 == c8396.f20825 && this.f20824 == c8396.f20824;
    }

    public final int hashCode() {
        return (((((this.f20827 * 31) + this.f20826) * 31) + this.f20825) * 31) + this.f20824;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C8396.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f20827);
        sb.append(',');
        sb.append(this.f20826);
        sb.append(',');
        sb.append(this.f20825);
        sb.append(',');
        return AbstractC0900.m707(sb, "] }", this.f20824);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m13352() {
        return this.f20825 - this.f20827;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m13353() {
        return this.f20824 - this.f20826;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C8396(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
