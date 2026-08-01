package org.apache.commons.lang3;

/* JADX INFO: renamed from: org.apache.commons.lang3.飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5691 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5691 f15623 = new C5691(false);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f15624;

    public C5691(boolean z) {
        this.f15624 = z;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String m11055(String str, String str2, String str3) {
        if (!AbstractC5695.m11059(str) && !AbstractC5695.m11059(str2) && str3 != null) {
            if (this.f15624) {
                str2 = str2.toLowerCase();
            }
            int i = 0;
            int iM11056 = m11056(0, str, str2);
            if (iM11056 != -1) {
                int length = str2.length();
                StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * 16));
                int i2 = -1;
                while (iM11056 != -1) {
                    sb.append((CharSequence) str, i, iM11056);
                    sb.append(str3);
                    i = iM11056 + length;
                    i2--;
                    if (i2 == 0) {
                        break;
                    }
                    iM11056 = m11056(i, str, str2);
                }
                sb.append((CharSequence) str, i, str.length());
                return sb.toString();
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int m11056(int i, CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return -1;
        }
        return charSequence instanceof String ? ((String) charSequence).indexOf(str.toString(), i) : charSequence instanceof StringBuilder ? ((StringBuilder) charSequence).indexOf(str.toString(), i) : charSequence instanceof StringBuffer ? ((StringBuffer) charSequence).indexOf(str.toString(), i) : charSequence.toString().indexOf(str.toString(), i);
    }
}
