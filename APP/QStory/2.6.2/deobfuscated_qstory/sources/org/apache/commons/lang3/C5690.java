package org.apache.commons.lang3;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5690 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5690 f15623 = new C5690(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f15624;

    public C5690(boolean z) {
        this.f15624 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m10998(String str, String str2, String str3) {
        if (!AbstractC5694.m11002(str) && !AbstractC5694.m11002(str2) && str3 != null) {
            if (this.f15624) {
                str2 = str2.toLowerCase();
            }
            int i = 0;
            int iM10999 = m10999(0, str, str2);
            if (iM10999 != -1) {
                int length = str2.length();
                StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
                int i2 = -1;
                while (iM10999 != -1) {
                    sb.append((CharSequence) str, i, iM10999);
                    sb.append(str3);
                    i = iM10999 + length;
                    i2--;
                    if (i2 == 0) {
                        break;
                    }
                    iM10999 = m10999(i, str, str2);
                }
                sb.append((CharSequence) str, i, str.length());
                return sb.toString();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m10999(int i, CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return -1;
        }
        return charSequence instanceof String ? ((String) charSequence).indexOf(str.toString(), i) : charSequence instanceof StringBuilder ? ((StringBuilder) charSequence).indexOf(str.toString(), i) : charSequence instanceof StringBuffer ? ((StringBuffer) charSequence).indexOf(str.toString(), i) : charSequence.toString().indexOf(str.toString(), i);
    }
}
