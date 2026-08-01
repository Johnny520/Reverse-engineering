package p080f9;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: f9.m */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2366m extends AbstractC2364k implements InterfaceC2360g {

    /* JADX INFO: renamed from: u */
    public static final a f6505u = new a(null);

    /* JADX INFO: renamed from: v */
    public static final C2366m f6506v = new C2366m(1, 0);

    public C2366m(long j10, long j11) {
        super(j10, j11, 1L);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2366m)) {
            return false;
        }
        if (isEmpty() && ((C2366m) obj).isEmpty()) {
            return true;
        }
        C2366m c2366m = (C2366m) obj;
        return m8570o() == c2366m.m8570o() && m8571p() == c2366m.m8571p();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (m8570o() ^ (m8570o() >>> 32))) + (m8571p() ^ (m8571p() >>> 32)));
    }

    public boolean isEmpty() {
        return m8570o() > m8571p();
    }

    /* JADX INFO: renamed from: r */
    public boolean m8573r(long j10) {
        return m8570o() <= j10 && j10 <= m8571p();
    }

    public String toString() {
        return m8570o() + ".." + m8571p();
    }

    /* JADX INFO: renamed from: f9.m$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
