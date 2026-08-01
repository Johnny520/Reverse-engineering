package androidx.compose.p001ui.graphics;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import androidx.activity.AbstractC0900;
import java.util.List;
import kotlin.jvm.internal.AbstractC5227;
import p128.C8158;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2423 extends AbstractC2409 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f5020;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f5021;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f5022;

    public C2423(List list, long j, long j2) {
        this.f5022 = list;
        this.f5021 = j;
        this.f5020 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2423)) {
            return false;
        }
        C2423 c2423 = (C2423) obj;
        return AbstractC5227.m9466(this.f5022, c2423.f5022) && C8158.m13087(this.f5021, c2423.f5021) && C8158.m13087(this.f5020, c2423.f5020);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0900.m702(AbstractC0900.m702(this.f5022.hashCode() * 961, 31, this.f5021), 31, this.f5020);
    }

    public final String toString() {
        String str;
        long j = this.f5021;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) C8158.m13090(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.f5020;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C8158.m13090(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.f5022 + ", stops=null, " + str + str2 + "tileMode=" + ((Object) AbstractC2416.m3437(0)) + ')';
    }

    @Override // androidx.compose.p001ui.graphics.AbstractC2409
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Shader mo3428(long j) {
        long j2 = this.f5021;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f5020;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.f5022;
        if (list.size() < 2) {
            C6755.m11869("colors must have length of at least 2 if colorStops is omitted.");
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = AbstractC2416.m3433(((C2434) list.get(i5)).f5045);
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, (float[]) null, AbstractC2416.m3434(0));
    }
}
