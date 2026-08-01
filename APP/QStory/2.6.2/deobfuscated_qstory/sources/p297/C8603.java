package p297;

import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8603 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final HashMap f24070;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8596 f24071 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class[] f24072;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24073;

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
        f24070 = map;
    }

    public C8603(String str, Class[] clsArr) {
        this.f24073 = str;
        this.f24072 = clsArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] m14211() {
        C8596 c8596 = this.f24071;
        if (c8596 == null || !c8596.f23957) {
            return new String[0];
        }
        StringBuilder sb = c8596.f23958;
        return (sb.length() != 0 ? sb.substring(1) : "").split(",");
    }
}
