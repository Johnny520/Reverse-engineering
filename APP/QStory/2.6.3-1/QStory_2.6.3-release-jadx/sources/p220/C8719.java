package p220;

import java.util.Arrays;
import p091.C7787;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8719 implements InterfaceC8721 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float[] f22199;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float[] f22200;

    public C8719(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            C6755.m11869("Array lengths must match and be nonzero");
            throw null;
        }
        this.f22200 = fArr;
        this.f22199 = fArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8719)) {
            return false;
        }
        C8719 c8719 = (C8719) obj;
        return Arrays.equals(this.f22200, c8719.f22200) && Arrays.equals(this.f22199, c8719.f22199);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f22199) + (Arrays.hashCode(this.f22200) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f22200);
        string.getClass();
        sb.append(string);
        sb.append(", toDpValues=");
        String string2 = Arrays.toString(this.f22199);
        string2.getClass();
        sb.append(string2);
        sb.append('}');
        return sb.toString();
    }

    @Override // p220.InterfaceC8721
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final float mo13872(float f) {
        return C7787.m12817(f, this.f22200, this.f22199);
    }

    @Override // p220.InterfaceC8721
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final float mo13873(float f) {
        return C7787.m12817(f, this.f22199, this.f22200);
    }
}
