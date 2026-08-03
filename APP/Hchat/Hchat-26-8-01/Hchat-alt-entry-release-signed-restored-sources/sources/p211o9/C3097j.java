package p211o9;

import gg.AbstractC1416l;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p068eh.AbstractC0921a;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;

/* JADX INFO: renamed from: o9.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3097j {

    /* JADX INFO: renamed from: a */
    public final String f10001a;

    /* JADX INFO: renamed from: b */
    public final String f10002b;

    /* JADX INFO: renamed from: c */
    public final String f10003c;

    /* JADX INFO: renamed from: d */
    public final String f10004d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3097j(String str, String str2, String str3, String str4) {
        str4.getClass();
        this.f10001a = str;
        this.f10002b = str2;
        this.f10003c = str3;
        this.f10004d = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final String m6572a() {
        String str = this.f10003c;
        boolean zM6721t0 = AbstractC3149m.m6721t0(str);
        boolean z9 = false;
        String str2 = this.f10004d;
        if (!((zM6721t0 || str.equals(str2)) ? false : true)) {
            str = null;
        }
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String str4 = this.f10001a;
        if (!AbstractC3149m.m6721t0(str4) && !str4.equals(str2)) {
            z9 = true;
        }
        String str5 = z9 ? str4 : null;
        if (str5 != null) {
            str3 = str5;
        }
        if (!AbstractC3149m.m6721t0(str)) {
            return str;
        }
        if (!AbstractC3149m.m6721t0(str3)) {
            return str3;
        }
        String str6 = this.f10002b;
        return AbstractC3149m.m6721t0(str6) ? str2 : str6;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final String m6573b() {
        String str = this.f10001a;
        boolean zM6721t0 = AbstractC3149m.m6721t0(str);
        String str2 = this.f10003c;
        String str3 = this.f10004d;
        if (!((zM6721t0 || str.equals(str3) || str.equals(str2)) ? false : true)) {
            str = null;
        }
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        if (AbstractC3149m.m6721t0(str)) {
            str = this.f10002b;
            if (AbstractC3149m.m6721t0(str)) {
                return AbstractC3149m.m6721t0(str2) ? str3 : str2;
            }
        }
        return str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3097j)) {
            return false;
        }
        C3097j c3097j = (C3097j) obj;
        return this.f10001a.equals(c3097j.f10001a) && this.f10002b.equals(c3097j.f10002b) && this.f10003c.equals(c3097j.f10003c) && AbstractC1416l.m3825a(this.f10004d, c3097j.f10004d);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f10004d.hashCode() + AbstractC0921a.m2244g(AbstractC0921a.m2244g(this.f10001a.hashCode() * 31, 31, this.f10002b), 31, this.f10003c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return AbstractC2091b.m5164k(AbstractC0255e.m1027p("MemberDisplay(groupNick=", this.f10001a, ", wechatNick=", this.f10002b, ", remarkName="), this.f10003c, ", memberId=", this.f10004d, ")");
    }
}
