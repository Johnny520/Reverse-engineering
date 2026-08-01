package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1564 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4607;

    public C1564(float f) {
        super(3);
        this.f4607 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1564) && Float.compare(this.f4607, ((C1564) obj).f4607) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4607);
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("HorizontalTo(x="), this.f4607, ')');
    }
}
