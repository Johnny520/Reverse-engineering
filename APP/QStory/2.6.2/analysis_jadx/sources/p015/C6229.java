package p015;

import androidx.activity.AbstractC0053;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC4394;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p007.AbstractC6136;
import p021.AbstractC6255;

/* JADX INFO: renamed from: 飘花落叶言世兰楪子苏哲.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6229 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f17166;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f17167;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f17168;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f17169;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17170;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17171;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f17172;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f17173;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f17174;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String f17175;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Pattern f17164 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Pattern f17165 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Pattern f17163 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Pattern f17162 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public C6229(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.f17171 = str;
        this.f17170 = str2;
        this.f17169 = j;
        this.f17168 = str3;
        this.f17167 = str4;
        this.f17166 = z;
        this.f17173 = z2;
        this.f17172 = z3;
        this.f17174 = z4;
        this.f17175 = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6229)) {
            return false;
        }
        C6229 c6229 = (C6229) obj;
        return c6229.f17171.equals(this.f17171) && c6229.f17170.equals(this.f17170) && c6229.f17169 == this.f17169 && c6229.f17168.equals(this.f17168) && c6229.f17167.equals(this.f17167) && c6229.f17166 == this.f17166 && c6229.f17173 == this.f17173 && c6229.f17172 == this.f17172 && c6229.f17174 == this.f17174 && AbstractC4394.m8917(c6229.f17175, this.f17175);
    }

    public final int hashCode() {
        int iM140 = AbstractC0053.m140(AbstractC0053.m140(AbstractC0053.m140(AbstractC0053.m140(AbstractC6136.m11539(AbstractC6136.m11539(AbstractC0053.m141(AbstractC6136.m11539(AbstractC6136.m11539(527, 31, this.f17171), 31, this.f17170), 31, this.f17169), 31, this.f17168), 31, this.f17167), 31, this.f17166), 31, this.f17173), 31, this.f17172), 31, this.f17174);
        String str = this.f17175;
        return iM140 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17171);
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(this.f17170);
        if (this.f17172) {
            long j = this.f17169;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) AbstractC6255.f17225.get()).format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.f17174) {
            sb.append("; domain=");
            sb.append(this.f17168);
        }
        sb.append("; path=");
        sb.append(this.f17167);
        if (this.f17166) {
            sb.append("; secure");
        }
        if (this.f17173) {
            sb.append("; httponly");
        }
        String str2 = this.f17175;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
