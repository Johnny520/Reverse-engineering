package p007;

import io.ktor.client.plugins.AbstractC3933;
import java.nio.charset.Charset;
import kotlin.jvm.internal.AbstractC4395;
import kotlin.text.AbstractC5139;
import kotlin.text.Regex;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6144 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String[] f16860;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16861;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16862;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Regex f16859 = new Regex("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final Regex f16858 = new Regex(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    public C6144(String str, String str2, String str3, String[] strArr) {
        str.getClass();
        strArr.getClass();
        this.f16862 = str;
        this.f16861 = str2;
        this.f16860 = strArr;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static Charset m11529(C6144 c6144) {
        String str;
        String[] strArr = c6144.f16860;
        int i = 0;
        int iM8307 = AbstractC3933.m8307(0, strArr.length - 1, 2);
        if (iM8307 < 0) {
            str = null;
            break;
        }
        while (!AbstractC5139.m10130(strArr[i], "charset")) {
            if (i == iM8307) {
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
        return (obj instanceof C6144) && AbstractC4395.m8907(((C6144) obj).f16862, this.f16862);
    }

    public final int hashCode() {
        return this.f16862.hashCode();
    }

    public final String toString() {
        return this.f16862;
    }
}
