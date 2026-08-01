package com.alibaba.fastjson2;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C2885 extends AbstractC2879 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String f9119;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f9120;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f9121;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f9122;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String[] f9123;

    public C2885(String str, long j, String str2, String str3, String[] strArr, boolean z) {
        super(str, j);
        this.f9119 = str2;
        this.f9122 = str3;
        this.f9123 = strArr;
        this.f9121 = z;
        int length = str2 != null ? str2.length() : 0;
        length = str3 != null ? length + str3.length() : length;
        if (strArr != null) {
            for (String str4 : strArr) {
                length += str4.length();
            }
        }
        this.f9120 = length;
    }

    @Override // com.alibaba.fastjson2.AbstractC2879
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo5912(Object obj) {
        int length;
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        int length2 = str.length();
        int i = this.f9120;
        boolean z = this.f9121;
        if (length2 < i) {
            return z;
        }
        String str2 = this.f9119;
        if (str2 == null) {
            length = 0;
        } else {
            if (!str.startsWith(str2)) {
                return z;
            }
            length = str2.length();
        }
        String[] strArr = this.f9123;
        if (strArr != null) {
            for (String str3 : strArr) {
                int iIndexOf = str.indexOf(str3, length);
                if (iIndexOf == -1) {
                    return z;
                }
                length = iIndexOf + str3.length();
            }
        }
        String str4 = this.f9122;
        return (str4 == null || str.endsWith(str4)) ? !z : z;
    }
}
