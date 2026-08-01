package p021;

import kotlin.jvm.internal.AbstractC4394;
import okio.ByteString;
import p005.C6123;
import p015.C6204;
import p017.AbstractC6238;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6260 {
    static {
        ByteString.Companion.getClass();
        C6123.m11517("\"\\");
        C6123.m11517("\t ,=");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m11744(p015.C6211 r35, p015.C6222 r36, p015.C6224 r37) {
        /*
            Method dump skipped, instruction units count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p021.AbstractC6260.m11744(飘花落叶言世兰楪子苏哲.飘花落叶言子楪世苏兰哲, 飘花落叶言世兰楪子苏哲.飘花落叶言子楪哲兰苏世, 飘花落叶言世兰楪子苏哲.飘花落叶言子楪哲苏兰世):void");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean m11745(C6204 c6204) {
        if (AbstractC4394.m8917(c6204.f17012.f16954, "HEAD")) {
            return false;
        }
        int i = c6204.f17005;
        if (((i < 100 || i >= 200) && i != 204 && i != 304) || AbstractC6238.m11702(c6204) != -1) {
            return true;
        }
        String strM11680 = c6204.f17008.m11680("Transfer-Encoding");
        if (strM11680 == null) {
            strM11680 = null;
        }
        return "chunked".equalsIgnoreCase(strM11680);
    }
}
