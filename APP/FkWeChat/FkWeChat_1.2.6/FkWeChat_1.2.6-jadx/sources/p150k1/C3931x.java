package p150k1;

import okhttp3.internal.url._UrlKt;
import p215oc.C5706c;
import p299ub.AbstractC8621f0;
import p299ub.AbstractC8644z;

/* JADX INFO: renamed from: k1.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3931x {

    /* JADX INFO: renamed from: a */
    public final String f11398a;

    /* JADX INFO: renamed from: b */
    public int f11399b;

    public C3931x(String str) {
        this.f11398a = str;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m15607b(C3931x c3931x, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 1;
        }
        c3931x.m15608a(i10);
    }

    /* JADX INFO: renamed from: a */
    public final void m15608a(int i10) {
        this.f11399b += i10;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15609c() {
        return this.f11399b >= this.f11398a.length();
    }

    /* JADX INFO: renamed from: d */
    public final char m15610d() {
        return this.f11398a.charAt(this.f11399b);
    }

    /* JADX INFO: renamed from: e */
    public final void m15611e(char c10) throws C3929v {
        if (m15614h(c10)) {
            return;
        }
        m15619m("expected " + c10);
        C5706c.m23089a();
    }

    /* JADX INFO: renamed from: f */
    public final String m15612f() {
        return this.f11398a;
    }

    /* JADX INFO: renamed from: g */
    public final int m15613g() {
        return this.f11399b;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m15614h(char c10) {
        return this.f11399b < this.f11398a.length() && this.f11398a.charAt(this.f11399b) == c10;
    }

    /* JADX INFO: renamed from: i */
    public final void m15615i(String str) {
        while (this.f11399b < this.f11398a.length() && !AbstractC8621f0.m33124Z(str, this.f11398a.charAt(this.f11399b), false, 2, null)) {
            this.f11399b++;
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m15616j(String str) throws C3929v {
        Integer numM33252s = AbstractC8644z.m33252s(m15617k(str));
        if (numM33252s != null) {
            return numM33252s.intValue();
        }
        m15619m("expected int");
        C5706c.m23089a();
        return 0;
    }

    /* JADX INFO: renamed from: k */
    public final String m15617k(String str) {
        int i10 = this.f11399b;
        m15615i(str);
        int i11 = this.f11399b;
        return i11 > i10 ? this.f11398a.substring(i10, i11) : _UrlKt.FRAGMENT_ENCODE_SET;
    }

    /* JADX INFO: renamed from: l */
    public final String m15618l() {
        String str = this.f11398a;
        return str.substring(this.f11399b, str.length());
    }

    /* JADX INFO: renamed from: m */
    public final Void m15619m(String str) throws C3929v {
        int iMin = Math.min(this.f11399b, this.f11398a.length());
        throw new C3929v("Error while parsing source information: " + str + " at " + this.f11398a.substring(0, iMin) + '|' + this.f11398a.substring(iMin));
    }
}
