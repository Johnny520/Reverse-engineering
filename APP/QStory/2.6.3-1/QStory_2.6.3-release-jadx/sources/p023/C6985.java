package p023;

import androidx.activity.AbstractC0900;
import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC5227;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p025.AbstractC7012;
import p028.AbstractC7046;

/* JADX INFO: renamed from: 飘花落叶言世兰子哲苏楪.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6985 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean f17272;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final String f17273;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String f17274;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final long f17275;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f17276;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f17277;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f17278;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final boolean f17279;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f17280;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String f17281;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final Pattern f17270 = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public static final Pattern f17271 = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public static final Pattern f17269 = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public static final Pattern f17268 = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    public C6985(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, String str5) {
        this.f17277 = str;
        this.f17276 = str2;
        this.f17275 = j;
        this.f17274 = str3;
        this.f17273 = str4;
        this.f17272 = z;
        this.f17279 = z2;
        this.f17278 = z3;
        this.f17280 = z4;
        this.f17281 = str5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6985)) {
            return false;
        }
        C6985 c6985 = (C6985) obj;
        return c6985.f17277.equals(this.f17277) && c6985.f17276.equals(this.f17276) && c6985.f17275 == this.f17275 && c6985.f17274.equals(this.f17274) && c6985.f17273.equals(this.f17273) && c6985.f17272 == this.f17272 && c6985.f17279 == this.f17279 && c6985.f17278 == this.f17278 && c6985.f17280 == this.f17280 && AbstractC5227.m9466(c6985.f17281, this.f17281);
    }

    public final int hashCode() {
        int iM701 = AbstractC0900.m701(AbstractC0900.m701(AbstractC0900.m701(AbstractC0900.m701(AbstractC7012.m12131(AbstractC7012.m12131(AbstractC0900.m702(AbstractC7012.m12131(AbstractC7012.m12131(527, 31, this.f17277), 31, this.f17276), 31, this.f17275), 31, this.f17274), 31, this.f17273), 31, this.f17272), 31, this.f17279), 31, this.f17278), 31, this.f17280);
        String str = this.f17281;
        return iM701 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f17277);
        sb.append(SignatureVisitor.INSTANCEOF);
        sb.append(this.f17276);
        if (this.f17278) {
            long j = this.f17275;
            if (j == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String str = ((DateFormat) AbstractC7046.f17484.get()).format(new Date(j));
                str.getClass();
                sb.append(str);
            }
        }
        if (!this.f17280) {
            sb.append("; domain=");
            sb.append(this.f17274);
        }
        sb.append("; path=");
        sb.append(this.f17273);
        if (this.f17272) {
            sb.append("; secure");
        }
        if (this.f17279) {
            sb.append("; httponly");
        }
        String str2 = this.f17281;
        if (str2 != null) {
            sb.append("; samesite=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
