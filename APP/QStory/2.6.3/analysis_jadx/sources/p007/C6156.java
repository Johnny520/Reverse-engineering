package p007;

import androidx.activity.AbstractC0053;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4395;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p009.AbstractC6183;
import p012.AbstractC6217;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6156 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f16927;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f16928;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f16929;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f16930;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f16931;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f16932;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f16933;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f16934;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f16935;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String f16936;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Pattern f16925 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Pattern f16926 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Pattern f16924 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Pattern f16923 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public C6156(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.f16932 = str;
        this.f16931 = str2;
        this.f16930 = j;
        this.f16929 = str3;
        this.f16928 = str4;
        this.f16927 = z;
        this.f16934 = z2;
        this.f16933 = z3;
        this.f16935 = z4;
        this.f16936 = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6156)) {
            return false;
        }
        C6156 c6156 = (C6156) obj;
        return c6156.f16932.equals(this.f16932) && c6156.f16931.equals(this.f16931) && c6156.f16930 == this.f16930 && c6156.f16929.equals(this.f16929) && c6156.f16928.equals(this.f16928) && c6156.f16927 == this.f16927 && c6156.f16934 == this.f16934 && c6156.f16933 == this.f16933 && c6156.f16935 == this.f16935 && AbstractC4395.m8907(c6156.f16936, this.f16936);
    }

    public final int hashCode() {
        int iM141 = AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m141(AbstractC0053.m141(AbstractC6183.m11572(AbstractC6183.m11572(AbstractC0053.m142(AbstractC6183.m11572(AbstractC6183.m11572(527, 31, this.f16932), 31, this.f16931), 31, this.f16930), 31, this.f16929), 31, this.f16928), 31, this.f16927), 31, this.f16934), 31, this.f16933), 31, this.f16935);
        String str = this.f16936;
        return iM141 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16932);
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(this.f16931);
        if (this.f16933) {
            long j = this.f16930;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) AbstractC6217.f17139.get()).format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.f16935) {
            sb.append("; domain=");
            sb.append(this.f16929);
        }
        sb.append("; path=");
        sb.append(this.f16928);
        if (this.f16927) {
            sb.append("; secure");
        }
        if (this.f16934) {
            sb.append("; httponly");
        }
        String str2 = this.f16936;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
