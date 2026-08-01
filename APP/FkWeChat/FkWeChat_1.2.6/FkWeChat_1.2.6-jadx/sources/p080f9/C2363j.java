package p080f9;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: f9.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2363j extends C2361h implements InterfaceC2360g {

    /* JADX INFO: renamed from: u */
    public static final a f6495u = new a(null);

    /* JADX INFO: renamed from: v */
    public static final C2363j f6496v = new C2363j(1, 0);

    public C2363j(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // p080f9.C2361h
    public boolean equals(Object obj) {
        if (!(obj instanceof C2363j)) {
            return false;
        }
        if (isEmpty() && ((C2363j) obj).isEmpty()) {
            return true;
        }
        C2363j c2363j = (C2363j) obj;
        return m8560o() == c2363j.m8560o() && m8561p() == c2363j.m8561p();
    }

    @Override // p080f9.C2361h
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m8560o() * 31) + m8561p();
    }

    @Override // p080f9.C2361h
    public boolean isEmpty() {
        return m8560o() > m8561p();
    }

    /* JADX INFO: renamed from: t */
    public boolean m8566t(int i10) {
        return m8560o() <= i10 && i10 <= m8561p();
    }

    @Override // p080f9.C2361h
    public String toString() {
        return m8560o() + ".." + m8561p();
    }

    /* JADX INFO: renamed from: u */
    public Integer m8567u() {
        return Integer.valueOf(m8561p());
    }

    /* JADX INFO: renamed from: v */
    public Integer m8568v() {
        return Integer.valueOf(m8560o());
    }

    /* JADX INFO: renamed from: f9.j$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C2363j m8569a() {
            return C2363j.f6496v;
        }

        public a() {
        }
    }
}
