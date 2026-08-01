package p297;

import java.util.HashMap;

/* JADX INFO: renamed from: 飘花落叶言楪子苏兰世哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8595 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final HashMap f24061;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C8588 f24062 = null;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Class[] f24063;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f24064;

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
        f24061 = map;
    }

    public C8595(String str, Class[] clsArr) {
        this.f24064 = str;
        this.f24063 = clsArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] m14230() {
        C8588 c8588 = this.f24062;
        if (c8588 == null || !c8588.f23948) {
            return new String[0];
        }
        StringBuilder sb = c8588.f23949;
        return (sb.length() != 0 ? sb.substring(1) : "").split(",");
    }
}
