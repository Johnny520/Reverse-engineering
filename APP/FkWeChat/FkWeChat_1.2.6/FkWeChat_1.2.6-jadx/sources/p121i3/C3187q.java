package p121i3;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: i3.q */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3187q {

    /* JADX INFO: renamed from: e */
    public static final a f8475e = new a(null);

    /* JADX INFO: renamed from: f */
    public static final C3187q f8476f = new C3187q(0, 0, 0, 0);

    /* JADX INFO: renamed from: a */
    public final int f8477a;

    /* JADX INFO: renamed from: b */
    public final int f8478b;

    /* JADX INFO: renamed from: c */
    public final int f8479c;

    /* JADX INFO: renamed from: d */
    public final int f8480d;

    public C3187q(int i10, int i11, int i12, int i13) {
        this.f8477a = i10;
        this.f8478b = i11;
        this.f8479c = i12;
        this.f8480d = i13;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ C3187q m12063c(C3187q c3187q, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = c3187q.f8477a;
        }
        if ((i14 & 2) != 0) {
            i11 = c3187q.f8478b;
        }
        if ((i14 & 4) != 0) {
            i12 = c3187q.f8479c;
        }
        if ((i14 & 8) != 0) {
            i13 = c3187q.f8480d;
        }
        return c3187q.m12064b(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: b */
    public final C3187q m12064b(int i10, int i11, int i12, int i13) {
        return new C3187q(i10, i11, i12, i13);
    }

    /* JADX INFO: renamed from: d */
    public final int m12065d() {
        return this.f8480d;
    }

    /* JADX INFO: renamed from: e */
    public final long m12066e() {
        int iM12073l = this.f8477a + (m12073l() / 2);
        return C3185o.m12044d((((long) (this.f8478b + (m12067f() / 2))) & 4294967295L) | (((long) iM12073l) << 32));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3187q)) {
            return false;
        }
        C3187q c3187q = (C3187q) obj;
        return this.f8477a == c3187q.f8477a && this.f8478b == c3187q.f8478b && this.f8479c == c3187q.f8479c && this.f8480d == c3187q.f8480d;
    }

    /* JADX INFO: renamed from: f */
    public final int m12067f() {
        return this.f8480d - this.f8478b;
    }

    /* JADX INFO: renamed from: g */
    public final int m12068g() {
        return this.f8477a;
    }

    /* JADX INFO: renamed from: h */
    public final int m12069h() {
        return this.f8479c;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f8477a) * 31) + Integer.hashCode(this.f8478b)) * 31) + Integer.hashCode(this.f8479c)) * 31) + Integer.hashCode(this.f8480d);
    }

    /* JADX INFO: renamed from: i */
    public final long m12070i() {
        return C3189s.m12082c((((long) m12067f()) & 4294967295L) | (((long) m12073l()) << 32));
    }

    /* JADX INFO: renamed from: j */
    public final int m12071j() {
        return this.f8478b;
    }

    /* JADX INFO: renamed from: k */
    public final long m12072k() {
        return C3185o.m12044d((((long) this.f8478b) & 4294967295L) | (((long) this.f8477a) << 32));
    }

    /* JADX INFO: renamed from: l */
    public final int m12073l() {
        return this.f8479c - this.f8477a;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m12074m() {
        return this.f8477a >= this.f8479c || this.f8478b >= this.f8480d;
    }

    /* JADX INFO: renamed from: n */
    public final C3187q m12075n(int i10, int i11) {
        return new C3187q(this.f8477a + i10, this.f8478b + i11, this.f8479c + i10, this.f8480d + i11);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.f8477a + ", " + this.f8478b + ", " + this.f8479c + ", " + this.f8480d + ')';
    }

    /* JADX INFO: renamed from: i3.q$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3187q m12076a() {
            return C3187q.f8476f;
        }

        public a() {
        }
    }
}
