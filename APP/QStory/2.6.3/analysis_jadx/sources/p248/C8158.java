package p248;

import androidx.compose.ui.semantics.C1934;
import com.android.dx.io.Opcodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4336;
import kotlin.collections.AbstractC4344;
import p034.AbstractC6347;
import p247.AbstractC8157;
import p263.AbstractC8256;
import p263.C8255;

/* JADX INFO: renamed from: 飘花落叶言楪兰子世苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8158 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public HashMap f22493;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f22494;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ArrayList f22495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8255 f22496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8255 f22497;

    public C8158(C8255 c8255) {
        this.f22497 = c8255;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8158) && this.f22497.equals(((C8158) obj).f22497);
    }

    public final int hashCode() {
        return this.f22497.f22857;
    }

    public final String toString() {
        return "TemperatureCache(input=" + this.f22497 + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8255 m13610() {
        return (C8255) m13613().get(m13613().size() - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map m13611() {
        HashMap map = this.f22493;
        if (map != null) {
            return map;
        }
        ArrayList<C8255> arrayList = new ArrayList(m13614());
        arrayList.add(this.f22497);
        HashMap map2 = new HashMap();
        for (C8255 c8255 : arrayList) {
            c8255.getClass();
            int i = c8255.f22857;
            double dM13607 = AbstractC8157.m13607((i >> 16) & Opcodes.CONST_METHOD_TYPE);
            double dM136072 = AbstractC8157.m13607((i >> 8) & Opcodes.CONST_METHOD_TYPE);
            double dM136073 = AbstractC8157.m13607(i & Opcodes.CONST_METHOD_TYPE);
            double[][] dArr = AbstractC8157.f22492;
            double[] dArr2 = dArr[0];
            double d = (dArr2[2] * dM136073) + (dArr2[1] * dM136072) + (dArr2[0] * dM13607);
            double[] dArr3 = dArr[1];
            double d2 = (dArr3[2] * dM136073) + (dArr3[1] * dM136072) + (dArr3[0] * dM13607);
            double[] dArr4 = dArr[2];
            double d3 = (dArr4[2] * dM136073) + (dArr4[1] * dM136072) + (dArr4[0] * dM13607);
            double[] dArr5 = AbstractC8157.f22491;
            double d4 = d / dArr5[0];
            double d5 = d2 / dArr5[1];
            double d6 = d3 / dArr5[2];
            double dM13608 = AbstractC8157.m13608(d4);
            double dM136082 = AbstractC8157.m13608(d5);
            double[] dArr6 = {(116.0d * dM136082) - 16.0d, (dM13608 - dM136082) * 500.0d, (dM136082 - AbstractC8157.m13608(d6)) * 200.0d};
            double dAtan2 = (Math.atan2(dArr6[2], dArr6[1]) * 57.29577951308232d) % 360.0d;
            if (dAtan2 < 0.0d) {
                dAtan2 += 360.0d;
            }
            double dPow = Math.pow(Math.hypot(dArr6[1], dArr6[2]), 1.07d) * 0.02d;
            double d7 = (dAtan2 - 50.0d) % 360.0d;
            if (d7 < 0.0d) {
                d7 += 360.0d;
            }
            map2.put(c8255, Double.valueOf((Math.cos(d7 * 0.017453292519943295d) * dPow) - 0.5d));
        }
        this.f22493 = map2;
        return map2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double m13612(C8255 c8255) {
        c8255.getClass();
        Object obj = ((HashMap) m13611()).get(m13610());
        obj.getClass();
        double dDoubleValue = ((Number) obj).doubleValue();
        Object obj2 = ((HashMap) m13611()).get(m13615());
        obj2.getClass();
        double dDoubleValue2 = dDoubleValue - ((Number) obj2).doubleValue();
        Object obj3 = ((HashMap) m13611()).get(c8255);
        obj3.getClass();
        double dDoubleValue3 = ((Number) obj3).doubleValue();
        Object obj4 = ((HashMap) m13611()).get(m13615());
        obj4.getClass();
        double dDoubleValue4 = dDoubleValue3 - ((Number) obj4).doubleValue();
        if (dDoubleValue2 == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue4 / dDoubleValue2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List m13613() {
        ArrayList arrayList = this.f22495;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(m13614());
        arrayList2.add(this.f22497);
        AbstractC4336.m8766(arrayList2, new C1934(this, 3));
        this.f22495 = arrayList2;
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m13614() {
        ArrayList arrayList = this.f22494;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            C8255 c8255 = this.f22497;
            arrayList2.add(AbstractC8256.m13823(d, c8255.f22855, c8255.f22854));
        }
        List listM11928 = AbstractC6347.m11928(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listM11928.iterator();
        while (it.hasNext()) {
            AbstractC4344.m8804((Iterable) it.next(), arrayList3);
        }
        this.f22494 = arrayList3;
        return arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8255 m13615() {
        return (C8255) m13613().get(0);
    }
}
