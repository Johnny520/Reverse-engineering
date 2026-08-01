package p015;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC4394;
import kotlin.text.AbstractC5138;
import kotlin.text.Regex;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6217 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String[] f17099;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17100;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17101;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Regex f17098 = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Regex f17097 = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public C6217(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.f17101 = str;
        this.f17100 = str2;
        this.f17099 = strArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Charset m11658(C6217 c6217) {
        String str;
        String[] strArr = c6217.f17099;
        int i = 0;
        int iM1155 = AbstractC0455.m1155(0, strArr.length - 1, 2);
        if (iM1155 < 0) {
            str = null;
            break;
        }
        while (!AbstractC5138.m10130(strArr[i], "charset")) {
            if (i == iM1155) {
                str = null;
                break;
            }
            i += 2;
        }
        str = strArr[i + 1];
        if (str == null) {
            return null;
        }
        try {
            return Charset.forName(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C6217) && AbstractC4394.m8917(((C6217) obj).f17101, this.f17101);
    }

    public final int hashCode() {
        return this.f17101.hashCode();
    }

    public final String toString() {
        return this.f17101;
    }
}
