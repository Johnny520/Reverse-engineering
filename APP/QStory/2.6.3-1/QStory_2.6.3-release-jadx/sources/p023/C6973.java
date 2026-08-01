package p023;

import io.ktor.client.plugins.AbstractC4765;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.text.AbstractC5971;
import kotlin.text.Regex;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6973 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String[] f17205;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17206;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17207;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Regex f17204 = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Regex f17203 = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public C6973(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.f17207 = str;
        this.f17206 = str2;
        this.f17205 = strArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Charset m12088(C6973 c6973) {
        String str;
        String[] strArr = c6973.f17205;
        int i = 0;
        int iM8866 = AbstractC4765.m8866(0, strArr.length - 1, 2);
        if (iM8866 < 0) {
            str = null;
            break;
        }
        while (!AbstractC5971.m10689(strArr[i], "charset")) {
            if (i == iM8866) {
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
        return (obj instanceof C6973) && AbstractC5227.m9466(((C6973) obj).f17207, this.f17207);
    }

    public final int hashCode() {
        return this.f17207.hashCode();
    }

    public final String toString() {
        return this.f17207;
    }
}
