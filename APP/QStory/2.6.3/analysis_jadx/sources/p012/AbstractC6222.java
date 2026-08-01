package p012;

import kotlin.jvm.internal.AbstractC4395;
import okio.ByteString;
import p004.C6114;
import p007.C6131;
import p013.AbstractC6230;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6222 {
    static {
        ByteString.Companion.getClass();
        C6114.m11510("\"\\");
        C6114.m11510("\t ,=");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11674(p007.C6138 r35, p007.C6149 r36, p007.C6151 r37) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p012.AbstractC6222.m11674(飘花落叶言世兰子哲苏楪.飘花落叶言子楪世苏兰哲, 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲兰苏世, 飘花落叶言世兰子哲苏楪.飘花落叶言子楪哲苏兰世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m11675(C6131 c6131) {
        if (AbstractC4395.m8907(c6131.f16773.f16715, "HEAD")) {
            return false;
        }
        int i = c6131.f16766;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || AbstractC6230.m11694(c6131) != -1) {
            return true;
        }
        String strM11551 = c6131.f16769.m11551("Transfer-Encoding");
        if (strM11551 == null) {
            strM11551 = null;
        }
        return "chunked".equalsIgnoreCase(strM11551);
    }
}
