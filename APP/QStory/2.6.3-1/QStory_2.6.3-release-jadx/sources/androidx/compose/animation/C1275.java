package androidx.compose.animation;

import androidx.activity.AbstractC0900;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子苏兰世哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1275 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Map f1734;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f1735;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C1221 f1736;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C1251 f1737;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C1279 f1738;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1230 f1739;

    public /* synthetic */ C1275(C1230 c1230, C1279 c1279, C1251 c1251, C1221 c1221, LinkedHashMap linkedHashMap, int i) {
        this((i & 1) != 0 ? null : c1230, (i & 2) != 0 ? null : c1279, (i & 4) != 0 ? null : c1251, (i & 8) != 0 ? null : c1221, (i & 32) == 0, (i & 64) != 0 ? AbstractC5171.m9335() : linkedHashMap);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1275)) {
            return false;
        }
        C1275 c1275 = (C1275) obj;
        return AbstractC5227.m9466(this.f1739, c1275.f1739) && AbstractC5227.m9466(this.f1738, c1275.f1738) && AbstractC5227.m9466(this.f1737, c1275.f1737) && AbstractC5227.m9466(this.f1736, c1275.f1736) && this.f1735 == c1275.f1735 && AbstractC5227.m9466(this.f1734, c1275.f1734);
    }

    public final int hashCode() {
        C1230 c1230 = this.f1739;
        int iHashCode = (c1230 == null ? 0 : c1230.hashCode()) * 31;
        C1279 c1279 = this.f1738;
        int iHashCode2 = (iHashCode + (c1279 == null ? 0 : c1279.hashCode())) * 31;
        C1251 c1251 = this.f1737;
        int iHashCode3 = (iHashCode2 + (c1251 == null ? 0 : c1251.hashCode())) * 31;
        C1221 c1221 = this.f1736;
        return this.f1734.hashCode() + AbstractC0900.m701((iHashCode3 + (c1221 != null ? c1221.hashCode() : 0)) * 961, 31, this.f1735);
    }

    public final String toString() {
        return "TransitionData(fade=" + this.f1739 + ", slide=" + this.f1738 + ", changeSize=" + this.f1737 + ", scale=" + this.f1736 + ", veil=null, hold=" + this.f1735 + ", effectsMap=" + this.f1734 + ')';
    }

    public C1275(C1230 c1230, C1279 c1279, C1251 c1251, C1221 c1221, boolean z, Map map) {
        this.f1739 = c1230;
        this.f1738 = c1279;
        this.f1737 = c1251;
        this.f1736 = c1221;
        this.f1735 = z;
        this.f1734 = map;
    }
}
