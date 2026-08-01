package bsh;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: bsh.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2620 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final WeakHashMap f7855 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f7856;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f7857;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String[] f7858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] f7859;

    public C2620(String str) {
        List listAsList = Arrays.asList(str.split("\\."));
        this.f7857 = listAsList;
        int size = listAsList.size();
        this.f7856 = size;
        this.f7859 = new String[size + 1];
        this.f7858 = new String[size + 1];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2620 m5253(String str) {
        WeakHashMap weakHashMap = f7855;
        if (weakHashMap.containsKey(str)) {
            C2620 c2620 = (C2620) weakHashMap.get(str);
            if (c2620 != null) {
                return c2620;
            }
            weakHashMap.remove(str);
        }
        C2620 c26202 = new C2620(str);
        weakHashMap.put(str, c26202);
        String[] strArr = c26202.f7859;
        int i = c26202.f7856;
        strArr[i] = str;
        String[] strArr2 = c26202.f7858;
        strArr2[i] = str;
        if (i == 1) {
            return c26202;
        }
        List list = c26202.f7857;
        strArr[1] = (String) list.get(0);
        strArr2[1] = (String) list.get(i - 1);
        return c26202;
    }
}
