package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1564 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4606;

    public C1564(float f) {
        super(3);
        this.f4606 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1564) && Float.compare(this.f4606, ((C1564) obj).f4606) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4606);
    }

    public final String toString() {
        return AbstractC0053.m157(new StringBuilder("HorizontalTo(x="), this.f4606, ')');
    }
}
