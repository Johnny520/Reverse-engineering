package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2390 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4904;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4905;

    public C2390(float f, float f2) {
        super(3);
        this.f4905 = f;
        this.f4904 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2390)) {
            return false;
        }
        C2390 c2390 = (C2390) obj;
        return Float.compare(this.f4905, c2390.f4905) == 0 && Float.compare(this.f4904, c2390.f4904) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4904) + (Float.hashCode(this.f4905) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MoveTo(x=");
        sb.append(this.f4905);
        sb.append(", y=");
        return AbstractC0900.m715(sb, this.f4904, ')');
    }
}
