package p248;

import androidx.compose.ui.semantics.C1934;
import com.android.dx.io.Opcodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.AbstractC4335;
import kotlin.collections.AbstractC4343;
import p247.AbstractC8156;
import p253.AbstractC8189;
import p263.AbstractC8255;
import p263.C8254;

/* JADX INFO: renamed from: 飘花落叶言楪兰子世苏哲.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8157 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public HashMap f22495;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public ArrayList f22496;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public ArrayList f22497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C8254 f22498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8254 f22499;

    public C8157(C8254 c8254) {
        this.f22499 = c8254;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8157) && this.f22499.equals(((C8157) obj).f22499);
    }

    public final int hashCode() {
        return this.f22499.f22858;
    }

    public final String toString() {
        return "TemperatureCache(input=" + this.f22499 + ")";
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final C8254 m13581() {
        return (C8254) m13584().get(m13584().size() - 1);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Map m13582() {
        HashMap map = this.f22495;
        if (map != null) {
            return map;
        }
        ArrayList<C8254> arrayList = new ArrayList(m13585());
        arrayList.add(this.f22499);
        HashMap map2 = new HashMap();
        for (C8254 c8254 : arrayList) {
            c8254.getClass();
            int i = c8254.f22858;
            double dM13578 = AbstractC8156.m13578((i >> 16) & Opcodes.CONST_METHOD_TYPE);
            double dM135782 = AbstractC8156.m13578((i >> 8) & Opcodes.CONST_METHOD_TYPE);
            double dM135783 = AbstractC8156.m13578(i & Opcodes.CONST_METHOD_TYPE);
            double[][] dArr = AbstractC8156.f22494;
            double[] dArr2 = dArr[0];
            double d = (dArr2[2] * dM135783) + (dArr2[1] * dM135782) + (dArr2[0] * dM13578);
            double[] dArr3 = dArr[1];
            double d2 = (dArr3[2] * dM135783) + (dArr3[1] * dM135782) + (dArr3[0] * dM13578);
            double[] dArr4 = dArr[2];
            double d3 = (dArr4[2] * dM135783) + (dArr4[1] * dM135782) + (dArr4[0] * dM13578);
            double[] dArr5 = AbstractC8156.f22493;
            double d4 = d / dArr5[0];
            double d5 = d2 / dArr5[1];
            double d6 = d3 / dArr5[2];
            double dM13579 = AbstractC8156.m13579(d4);
            double dM135792 = AbstractC8156.m13579(d5);
            double[] dArr6 = {(116.0d * dM135792) - 16.0d, (dM13579 - dM135792) * 500.0d, (dM135792 - AbstractC8156.m13579(d6)) * 200.0d};
            double dAtan2 = (Math.atan2(dArr6[2], dArr6[1]) * 57.29577951308232d) % 360.0d;
            if (dAtan2 < 0.0d) {
                dAtan2 += 360.0d;
            }
            double dPow = Math.pow(Math.hypot(dArr6[1], dArr6[2]), 1.07d) * 0.02d;
            double d7 = (dAtan2 - 50.0d) % 360.0d;
            if (d7 < 0.0d) {
                d7 += 360.0d;
            }
            map2.put(c8254, Double.valueOf((Math.cos(d7 * 0.017453292519943295d) * dPow) - 0.5d));
        }
        this.f22495 = map2;
        return map2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final double m13583(C8254 c8254) {
        c8254.getClass();
        Object obj = ((HashMap) m13582()).get(m13581());
        obj.getClass();
        double dDoubleValue = ((Number) obj).doubleValue();
        Object obj2 = ((HashMap) m13582()).get(m13586());
        obj2.getClass();
        double dDoubleValue2 = dDoubleValue - ((Number) obj2).doubleValue();
        Object obj3 = ((HashMap) m13582()).get(c8254);
        obj3.getClass();
        double dDoubleValue3 = ((Number) obj3).doubleValue();
        Object obj4 = ((HashMap) m13582()).get(m13586());
        obj4.getClass();
        double dDoubleValue4 = dDoubleValue3 - ((Number) obj4).doubleValue();
        if (dDoubleValue2 == 0.0d) {
            return 0.5d;
        }
        return dDoubleValue4 / dDoubleValue2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List m13584() {
        ArrayList arrayList = this.f22497;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(m13585());
        arrayList2.add(this.f22499);
        AbstractC4335.m8776(arrayList2, new C1934(this, 3));
        this.f22497 = arrayList2;
        return arrayList2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final List m13585() {
        ArrayList arrayList = this.f22496;
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (double d = 0.0d; d <= 360.0d; d += 1.0d) {
            C8254 c8254 = this.f22499;
            arrayList2.add(AbstractC8255.m13806(d, c8254.f22856, c8254.f22855));
        }
        List listM13660 = AbstractC8189.m13660(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listM13660.iterator();
        while (it.hasNext()) {
            AbstractC4343.m8794((Iterable) it.next(), arrayList3);
        }
        this.f22496 = arrayList3;
        return arrayList3;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C8254 m13586() {
        return (C8254) m13584().get(0);
    }
}
