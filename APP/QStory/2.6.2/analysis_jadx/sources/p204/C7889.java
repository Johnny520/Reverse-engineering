package p204;

import java.util.Arrays;
import p075.C6957;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C7889 implements InterfaceC7891 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] f21857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float[] f21858;

    public C7889(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            C5919.m11249("Array lengths must match and be nonzero");
            throw null;
        }
        this.f21858 = fArr;
        this.f21857 = fArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7889)) {
            return false;
        }
        C7889 c7889 = (C7889) obj;
        return Arrays.equals(this.f21858, c7889.f21858) && Arrays.equals(this.f21857, c7889.f21857);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f21857) + (Arrays.hashCode(this.f21858) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f21858);
        string.getClass();
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f21857);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }

    @Override // p204.InterfaceC7891
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float mo13285(float f) {
        return C6957.m12231(f, this.f21858, this.f21857);
    }

    @Override // p204.InterfaceC7891
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo13286(float f) {
        return C6957.m12231(f, this.f21857, this.f21858);
    }
}
