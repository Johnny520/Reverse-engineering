package p281t6;

import java.util.List;
import okhttp3.C5753h;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p299ub.AbstractC8621f0;

/* JADX INFO: renamed from: t6.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C8172y {

    /* JADX INFO: renamed from: d */
    public static final a f27409d = new a(null);

    /* JADX INFO: renamed from: e */
    public static final C8172y f27410e = new C8172y("HTTP", 2, 0);

    /* JADX INFO: renamed from: f */
    public static final C8172y f27411f = new C8172y("HTTP", 1, 1);

    /* JADX INFO: renamed from: g */
    public static final C8172y f27412g = new C8172y("HTTP", 1, 0);

    /* JADX INFO: renamed from: h */
    public static final C8172y f27413h = new C8172y("SPDY", 3, 0);

    /* JADX INFO: renamed from: i */
    public static final C8172y f27414i = new C8172y("QUIC", 1, 0);

    /* JADX INFO: renamed from: a */
    public final String f27415a;

    /* JADX INFO: renamed from: b */
    public final int f27416b;

    /* JADX INFO: renamed from: c */
    public final int f27417c;

    public C8172y(String str, int i10, int i11) {
        str.getClass();
        this.f27415a = str;
        this.f27416b = i10;
        this.f27417c = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C8172y)) {
            return false;
        }
        C8172y c8172y = (C8172y) obj;
        return AbstractC1061t.m3842c(this.f27415a, c8172y.f27415a) && this.f27416b == c8172y.f27416b && this.f27417c == c8172y.f27417c;
    }

    public int hashCode() {
        return (((this.f27415a.hashCode() * 31) + Integer.hashCode(this.f27416b)) * 31) + Integer.hashCode(this.f27417c);
    }

    public String toString() {
        return this.f27415a + '/' + this.f27416b + '.' + this.f27417c;
    }

    /* JADX INFO: renamed from: t6.y$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C8172y m31711a(String str, int i10, int i11) {
            str.getClass();
            return (AbstractC1061t.m3842c(str, "HTTP") && i10 == 1 && i11 == 0) ? m31712b() : (AbstractC1061t.m3842c(str, "HTTP") && i10 == 1 && i11 == 1) ? m31713c() : (AbstractC1061t.m3842c(str, "HTTP") && i10 == 2 && i11 == 0) ? m31714d() : new C8172y(str, i10, i11);
        }

        /* JADX INFO: renamed from: b */
        public final C8172y m31712b() {
            return C8172y.f27412g;
        }

        /* JADX INFO: renamed from: c */
        public final C8172y m31713c() {
            return C8172y.f27411f;
        }

        /* JADX INFO: renamed from: d */
        public final C8172y m31714d() {
            return C8172y.f27410e;
        }

        /* JADX INFO: renamed from: e */
        public final C8172y m31715e(CharSequence charSequence) {
            charSequence.getClass();
            List listM33112S0 = AbstractC8621f0.m33112S0(charSequence, new String[]{"/", "."}, false, 0, 6, null);
            if (listM33112S0.size() != 3) {
                C5753h.m23254a("Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: ", charSequence);
                return null;
            }
            return m31711a((String) listM33112S0.get(0), Integer.parseInt((String) listM33112S0.get(1)), Integer.parseInt((String) listM33112S0.get(2)));
        }

        public a() {
        }
    }
}
