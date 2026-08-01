package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2391 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4906;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4907;

    public C2391(float f, float f2) {
        super(3);
        this.f4907 = f;
        this.f4906 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2391)) {
            return false;
        }
        C2391 c2391 = (C2391) obj;
        return Float.compare(this.f4907, c2391.f4907) == 0 && Float.compare(this.f4906, c2391.f4906) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4906) + (Float.hashCode(this.f4907) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineTo(x=");
        sb.append(this.f4907);
        sb.append(", y=");
        return AbstractC0900.m715(sb, this.f4906, ')');
    }
}
