package bsh;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: bsh.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3454 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final WeakHashMap f8202 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f8203;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f8204;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String[] f8205;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] f8206;

    public C3454(String str) {
        List listAsList = Arrays.asList(str.split("\\."));
        this.f8204 = listAsList;
        int size = listAsList.size();
        this.f8203 = size;
        this.f8206 = new String[size + 1];
        this.f8205 = new String[size + 1];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C3454 m5858(String str) {
        WeakHashMap weakHashMap = f8202;
        if (weakHashMap.containsKey(str)) {
            C3454 c3454 = (C3454) weakHashMap.get(str);
            if (c3454 != null) {
                return c3454;
            }
            weakHashMap.remove(str);
        }
        C3454 c34542 = new C3454(str);
        weakHashMap.put(str, c34542);
        String[] strArr = c34542.f8206;
        int i = c34542.f8203;
        strArr[i] = str;
        String[] strArr2 = c34542.f8205;
        strArr2[i] = str;
        if (i == 1) {
            return c34542;
        }
        List list = c34542.f8204;
        strArr[1] = (String) list.get(0);
        strArr2[1] = (String) list.get(i - 1);
        return c34542;
    }
}
