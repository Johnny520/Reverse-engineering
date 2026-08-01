package androidx.compose.foundation.lazy.layout;

import androidx.activity.AbstractC0053;
import androidx.appcompat.app.C0108;
import androidx.collection.C0252;
import androidx.compose.runtime.collection.C1224;
import p176.AbstractC7740;

/* JADX INFO: renamed from: androidx.compose.foundation.lazy.layout.飘花落叶言子世兰哲楪苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C0678 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public Object f1891;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object f1892;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public int f1893;

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[LOOP:1: B:28:0x00bb->B:34:0x00dd, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C0678(p048.C6518 r13, androidx.compose.foundation.lazy.C0760 r14) {
        /*
            Method dump skipped, instruction units count: 233
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.C0678.<init>(飘花落叶言世子兰楪苏哲.飘花落叶言子楪苏世哲兰, androidx.compose.foundation.lazy.飘花落叶言子楪苏世兰哲):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public int m1465(Object obj) {
        C0252 c0252 = (C0252) this.f1892;
        int iM803 = c0252.m803(obj);
        if (iM803 >= 0) {
            return c0252.f916[iM803];
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public C0720 m1466(int i) {
        if (i < 0 || i >= this.f1893) {
            StringBuilder sbM148 = AbstractC0053.m148(i, "Index ", ", size ");
            sbM148.append(this.f1893);
            AbstractC7740.m13065(sbM148.toString());
        }
        C0720 c0720 = (C0720) this.f1891;
        if (c0720 != null) {
            int i2 = c0720.f2028;
            if (i < c0720.f2027 + i2 && i2 <= i) {
                return c0720;
            }
        }
        C1224 c1224 = (C1224) this.f1892;
        C0720 c07202 = (C0720) c1224.f3520[AbstractC0722.m1507(i, c1224)];
        this.f1891 = c07202;
        return c07202;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public void m1467(int i, C0108 c0108) {
        if (i < 0) {
            AbstractC7740.m13069("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        C0720 c0720 = new C0720(this.f1893, i, c0108);
        this.f1893 += i;
        ((C1224) this.f1892).m2037(c0720);
    }

    public C0678() {
        this.f1892 = new C1224(0, new C0720[16]);
    }
}
