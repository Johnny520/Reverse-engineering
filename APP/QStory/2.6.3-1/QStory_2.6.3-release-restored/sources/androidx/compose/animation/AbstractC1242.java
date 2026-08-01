package androidx.compose.animation;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1242 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C1241 f1670 = new C1241(new C1275((C1230) null, (C1279) null, (C1251) null, (C1221) null, (LinkedHashMap) null, 127));

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC1242) && ((C1241) ((AbstractC1242) obj)).f1669.equals(((C1241) this).f1669);
    }

    public final int hashCode() {
        return ((C1241) this).f1669.hashCode();
    }

    public final String toString() {
        if (equals(f1670)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        C1275 c1275 = ((C1241) this).f1669;
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
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C1241 m1659(AbstractC1242 abstractC1242) {
        C1230 c1230 = ((C1241) abstractC1242).f1669.f1739;
        if (c1230 == null) {
            c1230 = ((C1241) this).f1669.f1739;
        }
        C1275 c1275 = ((C1241) abstractC1242).f1669;
        C1279 c1279 = c1275.f1738;
        if (c1279 == null) {
            c1279 = ((C1241) this).f1669.f1738;
        }
        C1251 c1251 = c1275.f1737;
        if (c1251 == null) {
            c1251 = ((C1241) this).f1669.f1737;
        }
        C1221 c1221 = c1275.f1736;
        if (c1221 == null) {
            c1221 = ((C1241) this).f1669.f1736;
        }
        Map map = ((C1241) this).f1669.f1734;
        Map map2 = c1275.f1734;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C1241(new C1275(c1230, c1279, c1251, c1221, linkedHashMap, 32));
    }
}
