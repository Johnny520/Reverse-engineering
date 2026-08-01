package p213oa;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p299ub.AbstractC8611a0;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: oa.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5691b {

    /* JADX INFO: renamed from: d */
    public static final a f17894d = new a(null);

    /* JADX INFO: renamed from: a */
    public final C5692c f17895a;

    /* JADX INFO: renamed from: b */
    public final C5692c f17896b;

    /* JADX INFO: renamed from: c */
    public final boolean f17897c;

    public C5691b(C5692c c5692c, C5692c c5692c2, boolean z10) {
        c5692c.getClass();
        c5692c2.getClass();
        this.f17895a = c5692c;
        this.f17896b = c5692c2;
        this.f17897c = z10;
        c5692c2.m22996c();
    }

    /* JADX INFO: renamed from: c */
    public static final String m22980c(C5692c c5692c) {
        String strM22994a = c5692c.m22994a();
        if (!AbstractC8621f0.m33124Z(strM22994a, '/', false, 2, null)) {
            return strM22994a;
        }
        return "`" + strM22994a + '`';
    }

    /* JADX INFO: renamed from: k */
    public static final C5691b m22981k(C5692c c5692c) {
        return f17894d.m22993c(c5692c);
    }

    /* JADX INFO: renamed from: a */
    public final C5692c m22982a() {
        if (this.f17895a.m22996c()) {
            return this.f17896b;
        }
        return new C5692c(this.f17895a.m22994a() + '.' + this.f17896b.m22994a());
    }

    /* JADX INFO: renamed from: b */
    public final String m22983b() {
        if (this.f17895a.m22996c()) {
            return m22980c(this.f17896b);
        }
        return AbstractC8611a0.m33068M(this.f17895a.m22994a(), '.', '/', false, 4, null) + "/" + m22980c(this.f17896b);
    }

    /* JADX INFO: renamed from: d */
    public final C5691b m22984d(C5695f c5695f) {
        c5695f.getClass();
        return new C5691b(this.f17895a, this.f17896b.m22995b(c5695f), this.f17897c);
    }

    /* JADX INFO: renamed from: e */
    public final C5691b m22985e() {
        C5692c c5692cM22997d = this.f17896b.m22997d();
        if (c5692cM22997d.m22996c()) {
            return null;
        }
        return new C5691b(this.f17895a, c5692cM22997d, this.f17897c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5691b)) {
            return false;
        }
        C5691b c5691b = (C5691b) obj;
        return AbstractC1061t.m3842c(this.f17895a, c5691b.f17895a) && AbstractC1061t.m3842c(this.f17896b, c5691b.f17896b) && this.f17897c == c5691b.f17897c;
    }

    /* JADX INFO: renamed from: f */
    public final C5692c m22986f() {
        return this.f17895a;
    }

    /* JADX INFO: renamed from: g */
    public final C5692c m22987g() {
        return this.f17896b;
    }

    /* JADX INFO: renamed from: h */
    public final C5695f m22988h() {
        return this.f17896b.m22999f();
    }

    public int hashCode() {
        return (((this.f17895a.hashCode() * 31) + this.f17896b.hashCode()) * 31) + Boolean.hashCode(this.f17897c);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m22989i() {
        return this.f17897c;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m22990j() {
        return !this.f17896b.m22997d().m22996c();
    }

    public String toString() {
        if (!this.f17895a.m22996c()) {
            return m22983b();
        }
        return "/" + m22983b();
    }

    /* JADX INFO: renamed from: oa.b$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ C5691b m22991b(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.m22992a(str, z10);
        }

        /* JADX INFO: renamed from: a */
        public final C5691b m22992a(String str, boolean z10) {
            String strM33069N;
            String str2;
            str.getClass();
            int iM33150m0 = AbstractC8621f0.m33150m0(str, '`', 0, false, 6, null);
            if (iM33150m0 == -1) {
                iM33150m0 = str.length();
            }
            int iM33166u0 = AbstractC8621f0.m33166u0(str, "/", iM33150m0, false, 4, null);
            if (iM33166u0 == -1) {
                strM33069N = AbstractC8611a0.m33069N(str, "`", _UrlKt.FRAGMENT_ENCODE_SET, false, 4, null);
                str2 = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                String strM33068M = AbstractC8611a0.m33068M(str.substring(0, iM33166u0), '/', '.', false, 4, null);
                strM33069N = AbstractC8611a0.m33069N(str.substring(iM33166u0 + 1), "`", _UrlKt.FRAGMENT_ENCODE_SET, false, 4, null);
                str2 = strM33068M;
            }
            return new C5691b(new C5692c(str2), new C5692c(strM33069N), z10);
        }

        /* JADX INFO: renamed from: c */
        public final C5691b m22993c(C5692c c5692c) {
            c5692c.getClass();
            return new C5691b(c5692c.m22997d(), c5692c.m22999f());
        }

        public a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5691b(C5692c c5692c, C5695f c5695f) {
        this(c5692c, C5692c.f17898c.m23003a(c5695f), false);
        c5692c.getClass();
        c5695f.getClass();
    }
}
