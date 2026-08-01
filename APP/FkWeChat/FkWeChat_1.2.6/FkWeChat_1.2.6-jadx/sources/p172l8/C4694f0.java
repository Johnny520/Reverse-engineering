package p172l8;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l8.f0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4694f0 implements Comparable {

    /* JADX INFO: renamed from: r */
    public static final a f13904r = new a(null);

    /* JADX INFO: renamed from: q */
    public final short f13905q;

    public /* synthetic */ C4694f0(short s10) {
        this.f13905q = s10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4694f0 m18756a(short s10) {
        return new C4694f0(s10);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18758g(short s10, Object obj) {
        return (obj instanceof C4694f0) && s10 == ((C4694f0) obj).m18761j();
    }

    /* JADX INFO: renamed from: h */
    public static int m18759h(short s10) {
        return Short.hashCode(s10);
    }

    /* JADX INFO: renamed from: i */
    public static String m18760i(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC1061t.m3843d(m18761j() & 65535, ((C4694f0) obj).m18761j() & 65535);
    }

    public boolean equals(Object obj) {
        return m18758g(this.f13905q, obj);
    }

    public int hashCode() {
        return m18759h(this.f13905q);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ short m18761j() {
        return this.f13905q;
    }

    public String toString() {
        return m18760i(this.f13905q);
    }

    /* JADX INFO: renamed from: l8.f0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static short m18757c(short s10) {
        return s10;
    }
}
