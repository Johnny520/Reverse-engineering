package org.apache.commons.lang3;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6525 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f15973 = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m11617(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m11618(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
