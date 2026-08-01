package androidx.compose.p001ui.graphics.vector;

import androidx.activity.AbstractC0900;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.vector.飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2392 extends AbstractC2368 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final float f4908;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final float f4909;

    public C2392(float f, float f2) {
        super(1);
        this.f4909 = f;
        this.f4908 = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2392)) {
            return false;
        }
        C2392 c2392 = (C2392) obj;
        return Float.compare(this.f4909, c2392.f4909) == 0 && Float.compare(this.f4908, c2392.f4908) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f4908) + (Float.hashCode(this.f4909) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReflectiveQuadTo(x=");
        sb.append(this.f4909);
        sb.append(", y=");
        return AbstractC0900.m715(sb, this.f4908, ')');
    }
}
