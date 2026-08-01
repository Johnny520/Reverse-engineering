package androidx.compose.animation;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1240 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C1239 f1667;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1239 f1668;

    static {
        LinkedHashMap linkedHashMap = null;
        C1230 c1230 = null;
        C1279 c1279 = null;
        C1251 c1251 = null;
        C1221 c1221 = null;
        f1668 = new C1239(new C1275(c1230, c1279, c1251, c1221, linkedHashMap, 127));
        f1667 = new C1239(new C1275(c1230, c1279, c1251, c1221, linkedHashMap, 95));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC1240) && ((C1239) ((AbstractC1240) obj)).f1666.equals(((C1239) this).f1666);
    }

    public final int hashCode() {
        return ((C1239) this).f1666.hashCode();
    }

    public final String toString() {
        if (equals(f1668)) {
            return "ExitTransition.None";
        }
        if (equals(f1667)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        C1275 c1275 = ((C1239) this).f1666;
        C1230 c1230 = c1275.f1739;
        sb.append(c1230 != null ? c1230.toString() : null);
        sb.append(",\nSlide - ");
        C1279 c1279 = c1275.f1738;
        sb.append(c1279 != null ? c1279.toString() : null);
        sb.append(",\nShrink - ");
        C1251 c1251 = c1275.f1737;
        sb.append(c1251 != null ? c1251.toString() : null);
        sb.append(",\nScale - ");
        C1221 c1221 = c1275.f1736;
        sb.append(c1221 != null ? c1221.toString() : null);
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(c1275.f1735);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1239 m1658(AbstractC1240 abstractC1240) {
        C1230 c1230 = ((C1239) abstractC1240).f1666.f1739;
        if (c1230 == null) {
            c1230 = ((C1239) this).f1666.f1739;
        }
        C1275 c1275 = ((C1239) abstractC1240).f1666;
        C1279 c1279 = c1275.f1738;
        if (c1279 == null) {
            c1279 = ((C1239) this).f1666.f1738;
        }
        C1251 c1251 = c1275.f1737;
        if (c1251 == null) {
            c1251 = ((C1239) this).f1666.f1737;
        }
        C1221 c1221 = c1275.f1736;
        if (c1221 == null) {
            c1221 = ((C1239) this).f1666.f1736;
        }
        boolean z = c1275.f1735;
        C1275 c12752 = ((C1239) this).f1666;
        boolean z2 = z || c12752.f1735;
        Map map = c12752.f1734;
        Map map2 = c1275.f1734;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C1239(new C1275(c1230, c1279, c1251, c1221, z2, linkedHashMap));
    }
}
