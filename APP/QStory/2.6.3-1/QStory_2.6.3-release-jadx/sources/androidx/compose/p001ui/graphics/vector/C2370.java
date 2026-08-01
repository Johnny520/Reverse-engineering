package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子世楪苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2370 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4805;

    public C2370(float f) {
        super(3);
        this.f4805 = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2370) && Float.compare(this.f4805, ((C2370) obj).f4805) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4805);
    }

    public final String toString() {
        return AbstractC0900.m715(new StringBuilder("RelativeVerticalTo(dy="), this.f4805, ')');
    }
}
