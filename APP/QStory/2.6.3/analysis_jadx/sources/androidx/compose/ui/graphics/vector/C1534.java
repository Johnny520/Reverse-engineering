package androidx.compose.ui.graphics.vector;

import androidx.activity.AbstractC0053;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世楪哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1534 extends AbstractC1533 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4459;

    public C1534(float f) {
        super(3);
        this.f4459 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1534) && Float.compare(this.f4459, ((C1534) obj).f4459) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4459);
    }

    public final String toString() {
        return AbstractC0053.m155(new StringBuilder("VerticalTo(y="), this.f4459, ')');
    }
}
