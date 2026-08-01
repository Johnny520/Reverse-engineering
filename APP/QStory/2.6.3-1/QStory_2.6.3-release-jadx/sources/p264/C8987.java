package p264;

import androidx.compose.p001ui.semantics.C2769;
import com.android.p002dx.p005io.Opcodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC5168;
import kotlin.collections.AbstractC5176;
import p050.AbstractC7176;
import p263.AbstractC8986;
import p279.AbstractC9085;
import p279.C9084;

/* JADX INFO: renamed from: 飘花落叶言楪兰子世苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8987 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public HashMap f22838;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f22839;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ArrayList f22840;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C9084 f22841;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9084 f22842;

    public C8987(C9084 c9084) {
        this.f22842 = c9084;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8987) && this.f22842.equals(((C8987) obj).f22842);
    }

    public final int hashCode() {
        return this.f22842.f23202;
    }

    public final String toString() {
        return "TemperatureCache(input=" + this.f22842 + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C9084 m14169() {
        return (C9084) m14172().get(m14172().size() - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map m14170() {
        HashMap map = this.f22838;
        if (map != null) {
            return map;
        }
        ArrayList<C9084> arrayList = new ArrayList(m14173());
        arrayList.add(this.f22842);
        HashMap map2 = new HashMap();
        for (C9084 c9084 : arrayList) {
            c9084.getClass();
            int i = c9084.f23202;
            double dM14166 = AbstractC8986.m14166((i >> 16) & Opcodes.CONST_METHOD_TYPE);
            double dM141662 = AbstractC8986.m14166((i >> 8) & Opcodes.CONST_METHOD_TYPE);
            double dM141663 = AbstractC8986.m14166(i & Opcodes.CONST_METHOD_TYPE);
            double[][] dArr = AbstractC8986.f22837;
            double[] dArr2 = dArr[0];
            double d = (dArr2[2] * dM141663) + (dArr2[1] * dM141662) + (dArr2[0] * dM14166);
            double[] dArr3 = dArr[1];
            double d2 = (dArr3[2] * dM141663) + (dArr3[1] * dM141662) + (dArr3[0] * dM14166);
            double[] dArr4 = dArr[2];
            double d3 = (dArr4[2] * dM141663) + (dArr4[1] * dM141662) + (dArr4[0] * dM14166);
            double[] dArr5 = AbstractC8986.f22836;
            double d4 = d / dArr5[0];
            double d5 = d2 / dArr5[1];
            double d6 = d3 / dArr5[2];
            double dM14167 = AbstractC8986.m14167(d4);
            double dM141672 = AbstractC8986.m14167(d5);
            double[] dArr6 = {(116.0d * dM141672) - 16.0d, (dM14167 - dM141672) * 500.0d, (dM141672 - AbstractC8986.m14167(d6)) * 200.0d};
            double dAtan2 = (Math.atan2(dArr6[2], dArr6[1]) * 57.29577951308232d) % 360.0d;
            if (dAtan2 < 0.0d) {
                dAtan2 += 360.0d;
            }
            double dPow = Math.pow(Math.hypot(dArr6[1], dArr6[2]), 1.07d) * 0.02d;
            double d7 = (dAtan2 - 50.0d) % 360.0d;
            if (d7 < 0.0d) {
                d7 += 360.0d;
            }
            map2.put(c9084, Double.valueOf((Math.cos(d7 * 0.017453292519943295d) * dPow) - 0.5d));
        }
        this.f22838 = map2;
        return map2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double m14171(C9084 c9084) {
        c9084.getClass();
        Object obj = ((HashMap) m14170()).get(m14169());
        obj.getClass();
        double dDoubleValue = ((Number) obj).doubleValue();
        Object obj2 = ((HashMap) m14170()).get(m14174());
        obj2.getClass();
        double dDoubleValue2 = dDoubleValue - ((Number) obj2).doubleValue();
        Object obj3 = ((HashMap) m14170()).get(c9084);
        obj3.getClass();
        double dDoubleValue3 = ((Number) obj3).doubleValue();
        Object obj4 = ((HashMap) m14170()).get(m14174());
        obj4.getClass();
        double dDoubleValue4 = dDoubleValue3 - ((Number) obj4).doubleValue();
        if (dDoubleValue2 == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue4 / dDoubleValue2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List m14172() {
        ArrayList arrayList = this.f22840;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(m14173());
        arrayList2.add(this.f22842);
        AbstractC5168.m9325(arrayList2, new C2769(this, 3));
        this.f22840 = arrayList2;
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m14173() {
        ArrayList arrayList = this.f22839;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            C9084 c9084 = this.f22842;
            arrayList2.add(AbstractC9085.m14382(d, c9084.f23200, c9084.f23199));
        }
        List listM12487 = AbstractC7176.m12487(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listM12487.iterator();
        while (it.hasNext()) {
            AbstractC5176.m9363((Iterable) it.next(), arrayList3);
        }
        this.f22839 = arrayList3;
        return arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C9084 m14174() {
        return (C9084) m14172().get(0);
    }
}
