package org.apache.commons.lang3;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5694 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final /* synthetic */ int f15628 = 0;

    static {
        Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static int m11001(String str) {
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static boolean m11002(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }
}
