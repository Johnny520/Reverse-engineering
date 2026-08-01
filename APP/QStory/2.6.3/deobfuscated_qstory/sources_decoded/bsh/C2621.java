package bsh;

import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: bsh.飘花落叶言子世哲兰苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2621 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final WeakHashMap f7857 = new WeakHashMap();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final int f7858;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final List f7859;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String[] f7860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String[] f7861;

    public C2621(String str) {
        List listAsList = Arrays.asList(str.split("\\."));
        this.f7859 = listAsList;
        int size = listAsList.size();
        this.f7858 = size;
        this.f7861 = new String[size + 1];
        this.f7860 = new String[size + 1];
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C2621 m5298(String str) {
        WeakHashMap weakHashMap = f7857;
        if (weakHashMap.containsKey(str)) {
            C2621 c2621 = (C2621) weakHashMap.get(str);
            if (c2621 != null) {
                return c2621;
            }
            weakHashMap.remove(str);
        }
        C2621 c26212 = new C2621(str);
        weakHashMap.put(str, c26212);
        String[] strArr = c26212.f7861;
        int i = c26212.f7858;
        strArr[i] = str;
        String[] strArr2 = c26212.f7860;
        strArr2[i] = str;
        if (i == 1) {
            return c26212;
        }
        List list = c26212.f7859;
        strArr[1] = (String) list.get(0);
        strArr2[1] = (String) list.get(i - 1);
        return c26212;
    }
}
