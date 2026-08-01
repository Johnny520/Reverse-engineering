package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C1534 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4458;

    public C1534(float f) {
        super(3);
        this.f4458 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1534) && Float.compare(this.f4458, ((C1534) obj).f4458) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4458);
    }

    public final String toString() {
        return AbstractC0053.m157(new StringBuilder("VerticalTo(y="), this.f4458, ')');
    }
}
