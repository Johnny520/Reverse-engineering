package androidx.compose.ui.graphics;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import androidx.activity.AbstractC0053;
import java.util.List;
import kotlin.jvm.internal.AbstractC4395;
import p112.C7329;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: androidx.compose.ui.graphics.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1588 extends AbstractC1574 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final long f4675;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final long f4676;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f4677;

    public C1588(List list, long j, long j2) {
        this.f4677 = list;
        this.f4676 = j;
        this.f4675 = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1588)) {
            return false;
        }
        C1588 c1588 = (C1588) obj;
        return AbstractC4395.m8907(this.f4677, c1588.f4677) && C7329.m12528(this.f4676, c1588.f4676) && C7329.m12528(this.f4675, c1588.f4675);
    }

    public final int hashCode() {
        return Integer.hashCode(0) + AbstractC0053.m142(AbstractC0053.m142(this.f4677.hashCode() * 961, 31, this.f4676), 31, this.f4675);
    }

    public final String toString() {
        String str;
        long j = this.f4676;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) C7329.m12531(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.f4675;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) C7329.m12531(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.f4677 + ", stops=null, " + str + str2 + "tileMode=" + ((Object) AbstractC1581.m2877(0)) + ')';
    }

    @Override // androidx.compose.ui.graphics.AbstractC1574
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public final Shader mo2868(long j) {
        long j2 = this.f4676;
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
        long j3 = this.f4675;
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
        List list = this.f4677;
        if (list.size() < 2) {
            C5925.m11310("colors must have length of at least 2 if colorStops is omitted.");
        }
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L));
        int size = list.size();
        int[] iArr = new int[size];
        for (int i5 = 0; i5 < size; i5++) {
            iArr[i5] = AbstractC1581.m2873(((C1599) list.get(i5)).f4700);
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr, (float[]) null, AbstractC1581.m2874(0));
    }
}
