package p125i7;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: i7.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3234r {

    /* JADX INFO: renamed from: b */
    public static final a f8685b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final C3234r f8686c = new C3234r("HTTP");

    /* JADX INFO: renamed from: d */
    public static final C3234r f8687d = new C3234r("HTTPS");

    /* JADX INFO: renamed from: e */
    public static final C3234r f8688e = new C3234r("UNIX");

    /* JADX INFO: renamed from: a */
    public final String f8689a;

    public C3234r(String str) {
        str.getClass();
        this.f8689a = str;
    }

    /* JADX INFO: renamed from: c */
    public final String m12287c() {
        return this.f8689a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3234r) && AbstractC1061t.m3842c(this.f8689a, ((C3234r) obj).f8689a);
    }

    public int hashCode() {
        return this.f8689a.hashCode();
    }

    public String toString() {
        return "ConnectorType(name=" + this.f8689a + ')';
    }

    /* JADX INFO: renamed from: i7.r$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3234r m12288a() {
            return C3234r.f8686c;
        }

        /* JADX INFO: renamed from: b */
        public final C3234r m12289b() {
            return C3234r.f8687d;
        }

        public a() {
        }
    }
}
