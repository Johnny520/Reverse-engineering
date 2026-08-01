package p281t6;

import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: t6.x */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8171x {

    /* JADX INFO: renamed from: b */
    public static final a f27399b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final C8171x f27400c;

    /* JADX INFO: renamed from: d */
    public static final C8171x f27401d;

    /* JADX INFO: renamed from: e */
    public static final C8171x f27402e;

    /* JADX INFO: renamed from: f */
    public static final C8171x f27403f;

    /* JADX INFO: renamed from: g */
    public static final C8171x f27404g;

    /* JADX INFO: renamed from: h */
    public static final C8171x f27405h;

    /* JADX INFO: renamed from: i */
    public static final C8171x f27406i;

    /* JADX INFO: renamed from: j */
    public static final List f27407j;

    /* JADX INFO: renamed from: a */
    public final String f27408a;

    static {
        C8171x c8171x = new C8171x("GET");
        f27400c = c8171x;
        C8171x c8171x2 = new C8171x("POST");
        f27401d = c8171x2;
        C8171x c8171x3 = new C8171x("PUT");
        f27402e = c8171x3;
        C8171x c8171x4 = new C8171x("PATCH");
        f27403f = c8171x4;
        C8171x c8171x5 = new C8171x("DELETE");
        f27404g = c8171x5;
        C8171x c8171x6 = new C8171x("HEAD");
        f27405h = c8171x6;
        C8171x c8171x7 = new C8171x("OPTIONS");
        f27406i = c8171x7;
        f27407j = AbstractC5114x.m20803r(c8171x, c8171x2, c8171x3, c8171x4, c8171x5, c8171x6, c8171x7);
    }

    public C8171x(String str) {
        str.getClass();
        this.f27408a = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C8171x) && AbstractC1061t.m3842c(this.f27408a, ((C8171x) obj).f27408a);
    }

    public int hashCode() {
        return this.f27408a.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final String m31698i() {
        return this.f27408a;
    }

    public String toString() {
        return this.f27408a;
    }

    /* JADX INFO: renamed from: t6.x$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final List m31699a() {
            return C8171x.f27407j;
        }

        /* JADX INFO: renamed from: b */
        public final C8171x m31700b() {
            return C8171x.f27404g;
        }

        /* JADX INFO: renamed from: c */
        public final C8171x m31701c() {
            return C8171x.f27400c;
        }

        /* JADX INFO: renamed from: d */
        public final C8171x m31702d() {
            return C8171x.f27405h;
        }

        /* JADX INFO: renamed from: e */
        public final C8171x m31703e() {
            return C8171x.f27406i;
        }

        /* JADX INFO: renamed from: f */
        public final C8171x m31704f() {
            return C8171x.f27403f;
        }

        /* JADX INFO: renamed from: g */
        public final C8171x m31705g() {
            return C8171x.f27401d;
        }

        /* JADX INFO: renamed from: h */
        public final C8171x m31706h() {
            return C8171x.f27402e;
        }

        /* JADX INFO: renamed from: i */
        public final C8171x m31707i(String str) {
            str.getClass();
            return AbstractC1061t.m3842c(str, m31701c().m31698i()) ? m31701c() : AbstractC1061t.m3842c(str, m31705g().m31698i()) ? m31705g() : AbstractC1061t.m3842c(str, m31706h().m31698i()) ? m31706h() : AbstractC1061t.m3842c(str, m31704f().m31698i()) ? m31704f() : AbstractC1061t.m3842c(str, m31700b().m31698i()) ? m31700b() : AbstractC1061t.m3842c(str, m31702d().m31698i()) ? m31702d() : AbstractC1061t.m3842c(str, m31703e().m31698i()) ? m31703e() : new C8171x(str);
        }

        public a() {
        }
    }
}
