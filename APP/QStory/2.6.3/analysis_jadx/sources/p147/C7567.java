package p147;

import android.graphics.Rect;
import androidx.activity.AbstractC0053;
import p009.AbstractC6183;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言子兰苏哲世楪.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C7567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f20479;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f20480;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int f20481;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f20482;

    static {
        new C7567(0, 0, 0, 0);
    }

    public C7567(int i, int i2, int i3, int i4) {
        this.f20482 = i;
        this.f20481 = i2;
        this.f20480 = i3;
        this.f20479 = i4;
        if (i > i3) {
            C5925.m11314(AbstractC6183.m11591(i, i3, "Left must be less than or equal to right, left: ", ", right: "));
            throw null;
        }
        if (i2 <= i4) {
            return;
        }
        C5925.m11314(AbstractC6183.m11591(i2, i4, "top must be less than or equal to bottom, top: ", ", bottom: "));
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C7567.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        C7567 c7567 = (C7567) obj;
        return this.f20482 == c7567.f20482 && this.f20481 == c7567.f20481 && this.f20480 == c7567.f20480 && this.f20479 == c7567.f20479;
    }

    public final int hashCode() {
        return (((((this.f20482 * 31) + this.f20481) * 31) + this.f20480) * 31) + this.f20479;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C7567.class.getSimpleName());
        sb.append(" { [");
        sb.append(this.f20482);
        sb.append(',');
        sb.append(this.f20481);
        sb.append(',');
        sb.append(this.f20480);
        sb.append(',');
        return AbstractC0053.m147(sb, "] }", this.f20479);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final int m12793() {
        return this.f20480 - this.f20482;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m12794() {
        return this.f20479 - this.f20481;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7567(Rect rect) {
        this(rect.left, rect.top, rect.right, rect.bottom);
        rect.getClass();
    }
}
