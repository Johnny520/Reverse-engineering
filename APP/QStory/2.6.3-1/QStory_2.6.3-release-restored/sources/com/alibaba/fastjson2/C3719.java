package com.alibaba.fastjson2;

/* JADX INFO: renamed from: com.alibaba.fastjson2.飘花落叶言子世苏兰哲楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3719 extends AbstractC3713 {

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String f9466;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int f9467;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public final boolean f9468;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final String f9469;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String[] f9470;

    public C3719(String str, long j, String str2, String str3, String[] strArr, boolean z) {
        super(str, j);
        this.f9466 = str2;
        this.f9469 = str3;
        this.f9470 = strArr;
        this.f9468 = z;
        int length = str2 != null ? str2.length() : 0;
        length = str3 != null ? length + str3.length() : length;
        if (strArr != null) {
            for (String str4 : strArr) {
                length += str4.length();
            }
        }
        this.f9467 = length;
    }

    @Override // com.alibaba.fastjson2.AbstractC3713
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏 */
    public final boolean mo6517(Object obj) {
        int length;
        if (!(obj instanceof String)) {
            return false;
        }
        String str = (String) obj;
        int length2 = str.length();
        int i = this.f9467;
        boolean z = this.f9468;
        if (length2 < i) {
            return z;
        }
        String str2 = this.f9466;
        if (str2 == null) {
            length = 0;
        } else {
            if (!str.startsWith(str2)) {
                return z;
            }
            length = str2.length();
        }
        String[] strArr = this.f9470;
        if (strArr != null) {
            for (String str3 : strArr) {
                int iIndexOf = str.indexOf(str3, length);
                if (iIndexOf == -1) {
                    return z;
                }
                length = iIndexOf + str3.length();
            }
        }
        String str4 = this.f9469;
        return (str4 == null || str.endsWith(str4)) ? !z : z;
    }
}
