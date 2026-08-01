package p266;

import java.util.HashMap;
import p263.AbstractC8256;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰苏子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8264 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f22879 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f22880;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f22881;

    public C8264(double d, double d2) {
        this.f22881 = d;
        this.f22880 = d2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double m13828(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f22879;
        Object objValueOf = map.get(numValueOf);
        if (objValueOf == null) {
            objValueOf = Double.valueOf(AbstractC8256.m13823(this.f22881, 200.0d, i).f22855);
            map.put(numValueOf, objValueOf);
        }
        return ((Number) objValueOf).doubleValue();
    }
}
