package p252;

import androidx.activity.AbstractC0900;
import io.ktor.client.plugins.AbstractC4765;
import io.ktor.http.CookieEncoding;
import java.util.Map;
import kotlin.collections.AbstractC5171;
import kotlin.jvm.internal.AbstractC5227;
import p025.AbstractC7012;
import p103.AbstractC7973;
import p103.C7906;
import p103.C7938;
import p103.C7964;
import p105.InterfaceC8010;
import p105.InterfaceC8013;
import p259.C8976;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC8010
public final class C8958 {
    public static final C8957 Companion = new C8957();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC8013[] f22775;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f22776;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8976 f22777;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Integer f22778;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final CookieEncoding f22779;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22780;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22781;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f22782;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f22783;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f22784;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Map f22785;

    static {
        CookieEncoding[] cookieEncodingArrValues = CookieEncoding.values();
        cookieEncodingArrValues.getClass();
        C7938 c7938 = new C7938("io.ktor.http.CookieEncoding", cookieEncodingArrValues);
        C7964 c7964 = C7964.f19434;
        f22775 = new InterfaceC8013[]{null, null, c7938, null, null, null, null, null, null, new C7906(c7964, AbstractC4765.m8872(c7964), 1)};
    }

    public /* synthetic */ C8958(int i, String str, String str2, CookieEncoding cookieEncoding, Integer num, C8976 c8976, String str3, String str4, boolean z, boolean z2, Map map) {
        if (3 != (i & 3)) {
            AbstractC7973.m12979(i, 3, C8953.f22768.getDescriptor());
            throw null;
        }
        this.f22781 = str;
        this.f22780 = str2;
        if ((i & 4) == 0) {
            this.f22779 = CookieEncoding.URI_ENCODING;
        } else {
            this.f22779 = cookieEncoding;
        }
        if ((i & 8) == 0) {
            this.f22778 = null;
        } else {
            this.f22778 = num;
        }
        if ((i & 16) == 0) {
            this.f22777 = null;
        } else {
            this.f22777 = c8976;
        }
        if ((i & 32) == 0) {
            this.f22776 = null;
        } else {
            this.f22776 = str3;
        }
        if ((i & 64) == 0) {
            this.f22783 = null;
        } else {
            this.f22783 = str4;
        }
        if ((i & 128) == 0) {
            this.f22782 = false;
        } else {
            this.f22782 = z;
        }
        if ((i & 256) == 0) {
            this.f22784 = false;
        } else {
            this.f22784 = z2;
        }
        if ((i & 512) == 0) {
            this.f22785 = AbstractC5171.m9335();
        } else {
            this.f22785 = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8958)) {
            return false;
        }
        C8958 c8958 = (C8958) obj;
        return AbstractC5227.m9466(this.f22781, c8958.f22781) && AbstractC5227.m9466(this.f22780, c8958.f22780) && this.f22779 == c8958.f22779 && AbstractC5227.m9466(this.f22778, c8958.f22778) && AbstractC5227.m9466(this.f22777, c8958.f22777) && AbstractC5227.m9466(this.f22776, c8958.f22776) && AbstractC5227.m9466(this.f22783, c8958.f22783) && this.f22782 == c8958.f22782 && this.f22784 == c8958.f22784 && AbstractC5227.m9466(this.f22785, c8958.f22785);
    }

    public final int hashCode() {
        int iHashCode = (this.f22779.hashCode() + AbstractC7012.m12131(this.f22781.hashCode() * 31, 31, this.f22780)) * 31;
        Integer num = this.f22778;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C8976 c8976 = this.f22777;
        int iHashCode3 = (iHashCode2 + (c8976 == null ? 0 : c8976.hashCode())) * 31;
        String str = this.f22776;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22783;
        return this.f22785.hashCode() + AbstractC0900.m701(AbstractC0900.m701((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f22782), 31, this.f22784);
    }

    public final String toString() {
        return "Cookie(name=" + this.f22781 + ", value=" + this.f22780 + ", encoding=" + this.f22779 + ", maxAge=" + this.f22778 + ", expires=" + this.f22777 + ", domain=" + this.f22776 + ", path=" + this.f22783 + ", secure=" + this.f22782 + ", httpOnly=" + this.f22784 + ", extensions=" + this.f22785 + ')';
    }
}
