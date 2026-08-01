package androidx.compose.animation;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世苏哲楪兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0395 f1325 = new C0395(new C0429((C0384) null, (C0433) null, (C0405) null, (C0375) null, (LinkedHashMap) null, 127));

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0396) && ((C0395) ((AbstractC0396) obj)).f1324.equals(((C0395) this).f1324);
    }

    public final int hashCode() {
        return ((C0395) this).f1324.hashCode();
    }

    public final String toString() {
        if (equals(f1325)) {
            return "EnterTransition.None";
        }
        StringBuilder sb = new StringBuilder("EnterTransition: \nFade - ");
        C0429 c0429 = ((C0395) this).f1324;
        C0384 c0384 = c0429.f1394;
        sb.append(c0384 != null ? c0384.toString() : null);
        sb.append(",\nSlide - ");
        C0433 c0433 = c0429.f1393;
        sb.append(c0433 != null ? c0433.toString() : null);
        sb.append(",\nShrink - ");
        C0405 c0405 = c0429.f1392;
        sb.append(c0405 != null ? c0405.toString() : null);
        sb.append(",\nScale - ");
        C0375 c0375 = c0429.f1391;
        sb.append(c0375 != null ? c0375.toString() : null);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0395 m1098(AbstractC0396 abstractC0396) {
        C0384 c0384 = ((C0395) abstractC0396).f1324.f1394;
        if (c0384 == null) {
            c0384 = ((C0395) this).f1324.f1394;
        }
        C0429 c0429 = ((C0395) abstractC0396).f1324;
        C0433 c0433 = c0429.f1393;
        if (c0433 == null) {
            c0433 = ((C0395) this).f1324.f1393;
        }
        C0405 c0405 = c0429.f1392;
        if (c0405 == null) {
            c0405 = ((C0395) this).f1324.f1392;
        }
        C0375 c0375 = c0429.f1391;
        if (c0375 == null) {
            c0375 = ((C0395) this).f1324.f1391;
        }
        Map map = ((C0395) this).f1324.f1389;
        Map map2 = c0429.f1389;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C0395(new C0429(c0384, c0433, c0405, c0375, linkedHashMap, 32));
    }
}
