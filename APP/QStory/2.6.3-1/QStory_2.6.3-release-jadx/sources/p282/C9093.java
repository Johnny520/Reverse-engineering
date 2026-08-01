package p282;

import java.util.HashMap;
import p279.AbstractC9085;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰苏子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9093 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f23224 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f23225;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f23226;

    public C9093(double d, double d2) {
        this.f23226 = d;
        this.f23225 = d2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double m14387(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f23224;
        Object objValueOf = map.get(numValueOf);
        if (objValueOf == null) {
            objValueOf = Double.valueOf(AbstractC9085.m14382(this.f23226, 200.0d, i).f23200);
            map.put(numValueOf, objValueOf);
        }
        return ((Number) objValueOf).doubleValue();
    }
}
