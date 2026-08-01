package p236;

import androidx.activity.AbstractC0053;
import io.ktor.http.CookieEncoding;
import java.util.Map;
import kotlin.collections.AbstractC4338;
import kotlin.jvm.internal.AbstractC4394;
import p007.AbstractC6136;
import p087.AbstractC7143;
import p087.C7076;
import p087.C7108;
import p087.C7134;
import p089.InterfaceC7180;
import p089.InterfaceC7183;
import p243.C8146;
import p316.C8675;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7180
public final class C8128 {
    public static final C8127 Companion = new C8127();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC7183[] f22432;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f22433;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8146 f22434;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Integer f22435;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final CookieEncoding f22436;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22437;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22438;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f22439;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f22440;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f22441;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Map f22442;

    static {
        CookieEncoding[] cookieEncodingArrValues = CookieEncoding.values();
        cookieEncodingArrValues.getClass();
        C7108 c7108 = new C7108("io.ktor.http.CookieEncoding", cookieEncodingArrValues);
        C7134 c7134 = C7134.f19094;
        f22432 = new InterfaceC7183[]{null, null, c7108, null, null, null, null, null, null, new C7076(c7134, C8675.m14355(c7134), 1)};
    }

    public /* synthetic */ C8128(int i, String str, String str2, CookieEncoding cookieEncoding, Integer num, C8146 c8146, String str3, String str4, boolean z, boolean z2, Map map) {
        if (3 != (i & 3)) {
            AbstractC7143.m12393(i, 3, C8123.f22425.getDescriptor());
            throw null;
        }
        this.f22438 = str;
        this.f22437 = str2;
        if ((i & 4) == 0) {
            this.f22436 = CookieEncoding.URI_ENCODING;
        } else {
            this.f22436 = cookieEncoding;
        }
        if ((i & 8) == 0) {
            this.f22435 = null;
        } else {
            this.f22435 = num;
        }
        if ((i & 16) == 0) {
            this.f22434 = null;
        } else {
            this.f22434 = c8146;
        }
        if ((i & 32) == 0) {
            this.f22433 = null;
        } else {
            this.f22433 = str3;
        }
        if ((i & 64) == 0) {
            this.f22440 = null;
        } else {
            this.f22440 = str4;
        }
        if ((i & 128) == 0) {
            this.f22439 = false;
        } else {
            this.f22439 = z;
        }
        if ((i & 256) == 0) {
            this.f22441 = false;
        } else {
            this.f22441 = z2;
        }
        if ((i & 512) == 0) {
            this.f22442 = AbstractC4338.m8781();
        } else {
            this.f22442 = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8128)) {
            return false;
        }
        C8128 c8128 = (C8128) obj;
        return AbstractC4394.m8917(this.f22438, c8128.f22438) && AbstractC4394.m8917(this.f22437, c8128.f22437) && this.f22436 == c8128.f22436 && AbstractC4394.m8917(this.f22435, c8128.f22435) && AbstractC4394.m8917(this.f22434, c8128.f22434) && AbstractC4394.m8917(this.f22433, c8128.f22433) && AbstractC4394.m8917(this.f22440, c8128.f22440) && this.f22439 == c8128.f22439 && this.f22441 == c8128.f22441 && AbstractC4394.m8917(this.f22442, c8128.f22442);
    }

    public final int hashCode() {
        int iHashCode = (this.f22436.hashCode() + AbstractC6136.m11539(this.f22438.hashCode() * 31, 31, this.f22437)) * 31;
        Integer num = this.f22435;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C8146 c8146 = this.f22434;
        int iHashCode3 = (iHashCode2 + (c8146 == null ? 0 : c8146.hashCode())) * 31;
        String str = this.f22433;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22440;
        return this.f22442.hashCode() + AbstractC0053.m140(AbstractC0053.m140((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f22439), 31, this.f22441);
    }

    public final String toString() {
        return "Cookie(name=" + this.f22438 + ", value=" + this.f22437 + ", encoding=" + this.f22436 + ", maxAge=" + this.f22435 + ", expires=" + this.f22434 + ", domain=" + this.f22433 + ", path=" + this.f22440 + ", secure=" + this.f22439 + ", httpOnly=" + this.f22441 + ", extensions=" + this.f22442 + ')';
    }
}
