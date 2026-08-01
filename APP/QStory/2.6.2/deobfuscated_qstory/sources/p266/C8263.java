package p266;

import java.util.HashMap;
import p263.AbstractC8255;

/* JADX INFO: renamed from: 飘花落叶言楪哲兰苏子世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8263 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final HashMap f22880 = new HashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final double f22881;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double f22882;

    public C8263(double d, double d2) {
        this.f22882 = d;
        this.f22881 = d2;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final double m13811(int i) {
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f22880;
        Object objValueOf = map.get(numValueOf);
        if (objValueOf == null) {
            objValueOf = Double.valueOf(AbstractC8255.m13806(this.f22882, 200.0d, i).f22856);
            map.put(numValueOf, objValueOf);
        }
        return ((Number) objValueOf).doubleValue();
    }
}
