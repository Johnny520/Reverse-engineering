package androidx.compose.animation;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.animation.飘花落叶言子世苏兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0394 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C0393 f1322;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C0393 f1323;

    static {
        LinkedHashMap linkedHashMap = null;
        C0384 c0384 = null;
        C0433 c0433 = null;
        C0405 c0405 = null;
        C0375 c0375 = null;
        f1323 = new C0393(new C0429(c0384, c0433, c0405, c0375, linkedHashMap, 127));
        f1322 = new C0393(new C0429(c0384, c0433, c0405, c0375, linkedHashMap, 95));
    }

    public final boolean equals(Object obj) {
        return (obj instanceof AbstractC0394) && ((C0393) ((AbstractC0394) obj)).f1321.equals(((C0393) this).f1321);
    }

    public final int hashCode() {
        return ((C0393) this).f1321.hashCode();
    }

    public final String toString() {
        if (equals(f1323)) {
            return "ExitTransition.None";
        }
        if (equals(f1322)) {
            return "ExitTransition.KeepUntilTransitionsFinished";
        }
        StringBuilder sb = new StringBuilder("ExitTransition: \nFade - ");
        C0429 c0429 = ((C0393) this).f1321;
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
        sb.append(",\nKeepUntilTransitionsFinished - ");
        sb.append(c0429.f1390);
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C0393 m1098(AbstractC0394 abstractC0394) {
        C0384 c0384 = ((C0393) abstractC0394).f1321.f1394;
        if (c0384 == null) {
            c0384 = ((C0393) this).f1321.f1394;
        }
        C0429 c0429 = ((C0393) abstractC0394).f1321;
        C0433 c0433 = c0429.f1393;
        if (c0433 == null) {
            c0433 = ((C0393) this).f1321.f1393;
        }
        C0405 c0405 = c0429.f1392;
        if (c0405 == null) {
            c0405 = ((C0393) this).f1321.f1392;
        }
        C0375 c0375 = c0429.f1391;
        if (c0375 == null) {
            c0375 = ((C0393) this).f1321.f1391;
        }
        boolean z = c0429.f1390;
        C0429 c04292 = ((C0393) this).f1321;
        boolean z2 = z || c04292.f1390;
        Map map = c04292.f1389;
        Map map2 = c0429.f1389;
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return new C0393(new C0429(c0384, c0433, c0405, c0375, z2, linkedHashMap));
    }
}
