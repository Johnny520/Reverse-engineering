package p172l8;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: l8.y */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4718y implements Comparable {

    /* JADX INFO: renamed from: r */
    public static final a f13942r = new a(null);

    /* JADX INFO: renamed from: q */
    public final byte f13943q;

    public /* synthetic */ C4718y(byte b10) {
        this.f13943q = b10;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C4718y m18816a(byte b10) {
        return new C4718y(b10);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m18818g(byte b10, Object obj) {
        return (obj instanceof C4718y) && b10 == ((C4718y) obj).m18822k();
    }

    /* JADX INFO: renamed from: h */
    public static final boolean m18819h(byte b10, byte b11) {
        return b10 == b11;
    }

    /* JADX INFO: renamed from: i */
    public static int m18820i(byte b10) {
        return Byte.hashCode(b10);
    }

    /* JADX INFO: renamed from: j */
    public static String m18821j(byte b10) {
        return String.valueOf(b10 & 255);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return AbstractC1061t.m3843d(m18822k() & 255, ((C4718y) obj).m18822k() & 255);
    }

    public boolean equals(Object obj) {
        return m18818g(this.f13943q, obj);
    }

    public int hashCode() {
        return m18820i(this.f13943q);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ byte m18822k() {
        return this.f13943q;
    }

    public String toString() {
        return m18821j(this.f13943q);
    }

    /* JADX INFO: renamed from: l8.y$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: c */
    public static byte m18817c(byte b10) {
        return b10;
    }
}
