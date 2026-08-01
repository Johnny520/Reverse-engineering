package p236;

import androidx.activity.AbstractC0053;
import io.ktor.client.plugins.AbstractC3933;
import io.ktor.http.CookieEncoding;
import java.util.Map;
import kotlin.collections.AbstractC4339;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p087.AbstractC7144;
import p087.C7077;
import p087.C7109;
import p087.C7135;
import p089.InterfaceC7181;
import p089.InterfaceC7184;
import p243.C8147;

/* JADX INFO: renamed from: 飘花落叶言楪兰世哲子苏.飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C8129 {
    public static final C8128 Companion = new C8128();

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public static final InterfaceC7184[] f22430;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f22431;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C8147 f22432;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final Integer f22433;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final CookieEncoding f22434;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final String f22435;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final String f22436;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f22437;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f22438;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean f22439;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final Map f22440;

    static {
        CookieEncoding[] cookieEncodingArrValues = CookieEncoding.values();
        cookieEncodingArrValues.getClass();
        C7109 c7109 = new C7109("io.ktor.http.CookieEncoding", cookieEncodingArrValues);
        C7135 c7135 = C7135.f19089;
        f22430 = new InterfaceC7184[]{null, null, c7109, null, null, null, null, null, null, new C7077(c7135, AbstractC3933.m8313(c7135), 1)};
    }

    public /* synthetic */ C8129(int i, String str, String str2, CookieEncoding cookieEncoding, Integer num, C8147 c8147, String str3, String str4, boolean z, boolean z2, Map map) {
        if (3 != (i & 3)) {
            AbstractC7144.m12420(i, 3, C8124.f22423.getDescriptor());
            throw null;
        }
        this.f22436 = str;
        this.f22435 = str2;
        if ((i & 4) == 0) {
            this.f22434 = CookieEncoding.URI_ENCODING;
        } else {
            this.f22434 = cookieEncoding;
        }
        if ((i & 8) == 0) {
            this.f22433 = null;
        } else {
            this.f22433 = num;
        }
        if ((i & 16) == 0) {
            this.f22432 = null;
        } else {
            this.f22432 = c8147;
        }
        if ((i & 32) == 0) {
            this.f22431 = null;
        } else {
            this.f22431 = str3;
        }
        if ((i & 64) == 0) {
            this.f22438 = null;
        } else {
            this.f22438 = str4;
        }
        if ((i & 128) == 0) {
            this.f22437 = false;
        } else {
            this.f22437 = z;
        }
        if ((i & 256) == 0) {
            this.f22439 = false;
        } else {
            this.f22439 = z2;
        }
        if ((i & 512) == 0) {
            this.f22440 = AbstractC4339.m8776();
        } else {
            this.f22440 = map;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8129)) {
            return false;
        }
        C8129 c8129 = (C8129) obj;
        return AbstractC4395.m8907(this.f22436, c8129.f22436) && AbstractC4395.m8907(this.f22435, c8129.f22435) && this.f22434 == c8129.f22434 && AbstractC4395.m8907(this.f22433, c8129.f22433) && AbstractC4395.m8907(this.f22432, c8129.f22432) && AbstractC4395.m8907(this.f22431, c8129.f22431) && AbstractC4395.m8907(this.f22438, c8129.f22438) && this.f22437 == c8129.f22437 && this.f22439 == c8129.f22439 && AbstractC4395.m8907(this.f22440, c8129.f22440);
    }

    public final int hashCode() {
        int iHashCode = (this.f22434.hashCode() + AbstractC6183.m11572(this.f22436.hashCode() * 31, 31, this.f22435)) * 31;
        Integer num = this.f22433;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C8147 c8147 = this.f22432;
        int iHashCode3 = (iHashCode2 + (c8147 == null ? 0 : c8147.hashCode())) * 31;
        String str = this.f22431;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f22438;
        return this.f22440.hashCode() + AbstractC0053.m141(AbstractC0053.m141((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f22437), 31, this.f22439);
    }

    public final String toString() {
        return "Cookie(name=" + this.f22436 + ", value=" + this.f22435 + ", encoding=" + this.f22434 + ", maxAge=" + this.f22433 + ", expires=" + this.f22432 + ", domain=" + this.f22431 + ", path=" + this.f22438 + ", secure=" + this.f22437 + ", httpOnly=" + this.f22439 + ", extensions=" + this.f22440 + ')';
    }
}
