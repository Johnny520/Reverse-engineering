package org.apache.commons.lang3;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6521 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C6521 f15968 = new C6521(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f15969;

    public C6521(boolean z) {
        this.f15969 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m11614(String str, String str2, String str3) {
        if (!AbstractC6525.m11618(str) && !AbstractC6525.m11618(str2) && str3 != null) {
            if (this.f15969) {
                str2 = str2.toLowerCase();
            }
            int i = 0;
            int iM11615 = m11615(0, str, str2);
            if (iM11615 != -1) {
                int length = str2.length();
                StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
                int i2 = -1;
                while (iM11615 != -1) {
                    sb.append((CharSequence) str, i, iM11615);
                    sb.append(str3);
                    i = iM11615 + length;
                    i2--;
                    if (i2 == 0) {
                        break;
                    }
                    iM11615 = m11615(i, str, str2);
                }
                sb.append((CharSequence) str, i, str.length());
                return sb.toString();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m11615(int i, CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return -1;
        }
        return charSequence instanceof String ? ((String) charSequence).indexOf(str.toString(), i) : charSequence instanceof StringBuilder ? ((StringBuilder) charSequence).indexOf(str.toString(), i) : charSequence instanceof StringBuffer ? ((StringBuffer) charSequence).indexOf(str.toString(), i) : charSequence.toString().indexOf(str.toString(), i);
    }
}
