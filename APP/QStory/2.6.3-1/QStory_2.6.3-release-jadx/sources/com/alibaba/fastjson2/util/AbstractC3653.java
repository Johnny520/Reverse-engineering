package com.alibaba.fastjson2.util;

/* JADX INFO: renamed from: com.alibaba.fastjson2.util.飘花落叶言子世兰哲苏楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3653 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final String[] f9126;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final String[] f9127;

    static {
        String[] strArr = new String[128];
        for (char c = 0; c < 128; c = (char) (c + 1)) {
            strArr[c] = Character.toString(c);
        }
        f9127 = strArr;
        String[] strArr2 = new String[9025];
        for (char c2 = ' '; c2 <= '~'; c2 = (char) (c2 + 1)) {
            for (char c3 = ' '; c3 <= '~'; c3 = (char) (c3 + 1)) {
                strArr2[(c3 - ' ') + ((c2 - ' ') * 95)] = new String(new char[]{c2, c3});
            }
        }
        f9126 = strArr2;
    }
}
