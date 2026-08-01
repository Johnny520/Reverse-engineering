package p179m2;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: m2.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C4838f extends AbstractC4818b {

    /* JADX INFO: renamed from: c */
    public static final a f14388c = new a(null);

    /* JADX INFO: renamed from: d */
    public static final int f14389d = 8;

    /* JADX INFO: renamed from: e */
    public static C4838f f14390e;

    public /* synthetic */ C4838f(AbstractC1043k abstractC1043k) {
        this();
    }

    @Override // p179m2.InterfaceC4843g
    /* JADX INFO: renamed from: a */
    public int[] mo19302a(int i10) {
        int length = m19291d().length();
        if (length <= 0 || i10 >= length) {
            return null;
        }
        if (i10 < 0) {
            i10 = 0;
        }
        while (i10 < length && m19291d().charAt(i10) == '\n' && !m19340j(i10)) {
            i10++;
        }
        if (i10 >= length) {
            return null;
        }
        int i11 = i10 + 1;
        while (i11 < length && !m19339i(i11)) {
            i11++;
        }
        return m19290c(i10, i11);
    }

    @Override // p179m2.InterfaceC4843g
    /* JADX INFO: renamed from: b */
    public int[] mo19303b(int i10) {
        int length = m19291d().length();
        if (length <= 0 || i10 <= 0) {
            return null;
        }
        if (i10 > length) {
            i10 = length;
        }
        while (i10 > 0 && m19291d().charAt(i10 - 1) == '\n' && !m19339i(i10)) {
            i10--;
        }
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        while (i11 > 0 && !m19340j(i11)) {
            i11--;
        }
        return m19290c(i11, i10);
    }

    /* JADX INFO: renamed from: i */
    public final boolean m19339i(int i10) {
        if (i10 <= 0 || m19291d().charAt(i10 - 1) == '\n') {
            return false;
        }
        return i10 == m19291d().length() || m19291d().charAt(i10) == '\n';
    }

    /* JADX INFO: renamed from: j */
    public final boolean m19340j(int i10) {
        if (m19291d().charAt(i10) != '\n') {
            return i10 == 0 || m19291d().charAt(i10 - 1) == '\n';
        }
        return false;
    }

    /* JADX INFO: renamed from: m2.f$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4838f m19341a() {
            if (C4838f.f14390e == null) {
                C4838f.f14390e = new C4838f(null);
            }
            C4838f c4838f = C4838f.f14390e;
            c4838f.getClass();
            return c4838f;
        }

        public a() {
        }
    }

    public C4838f() {
    }
}
