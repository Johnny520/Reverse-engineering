package p313;

import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9424 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final HashMap f24406;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C9417 f24407 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class[] f24408;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24409;

    static {
        HashMap map = new HashMap();
        map.put("int", "I");
        map.put("boolean", "Z");
        map.put("byte", "B");
        map.put("char", "C");
        map.put("short", "S");
        map.put("float", "F");
        map.put("long", "J");
        map.put("double", "D");
        f24406 = map;
    }

    public C9424(String str, Class[] clsArr) {
        this.f24409 = str;
        this.f24408 = clsArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] m14789() {
        C9417 c9417 = this.f24407;
        if (c9417 == null || !c9417.f24293) {
            return new String[0];
        }
        StringBuilder sb = c9417.f24294;
        return (sb.length() != 0 ? sb.substring(1) : "").split(",");
    }
}
