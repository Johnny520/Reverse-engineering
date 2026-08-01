package p274t;

import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: t.x3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7923x3 {

    /* JADX INFO: renamed from: a */
    public static final a f26388a = new a(null);

    /* JADX INFO: renamed from: b */
    public static final int f26389b;

    /* JADX INFO: renamed from: c */
    public static final int f26390c;

    /* JADX INFO: renamed from: d */
    public static final int f26391d;

    /* JADX INFO: renamed from: e */
    public static final int f26392e;

    /* JADX INFO: renamed from: f */
    public static final int f26393f;

    /* JADX INFO: renamed from: g */
    public static final int f26394g;

    /* JADX INFO: renamed from: h */
    public static final int f26395h;

    /* JADX INFO: renamed from: i */
    public static final int f26396i;

    /* JADX INFO: renamed from: j */
    public static final int f26397j;

    /* JADX INFO: renamed from: k */
    public static final int f26398k;

    /* JADX INFO: renamed from: l */
    public static final int f26399l;

    /* JADX INFO: renamed from: m */
    public static final int f26400m;

    static {
        int iM30584h = m30584h(8);
        f26389b = iM30584h;
        int iM30584h2 = m30584h(4);
        f26390c = iM30584h2;
        int iM30584h3 = m30584h(2);
        f26391d = iM30584h3;
        int iM30584h4 = m30584h(1);
        f26392e = iM30584h4;
        f26393f = m30588l(iM30584h, iM30584h4);
        f26394g = m30588l(iM30584h2, iM30584h3);
        int iM30584h5 = m30584h(16);
        f26395h = iM30584h5;
        int iM30584h6 = m30584h(32);
        f26396i = iM30584h6;
        int iM30588l = m30588l(iM30584h, iM30584h3);
        f26397j = iM30588l;
        int iM30588l2 = m30588l(iM30584h2, iM30584h4);
        f26398k = iM30588l2;
        f26399l = m30588l(iM30588l, iM30588l2);
        f26400m = m30588l(iM30584h5, iM30584h6);
    }

    /* JADX INFO: renamed from: i */
    public static final boolean m30585i(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX INFO: renamed from: j */
    public static final boolean m30586j(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    /* JADX INFO: renamed from: k */
    public static int m30587k(int i10) {
        return Integer.hashCode(i10);
    }

    /* JADX INFO: renamed from: l */
    public static final int m30588l(int i10, int i11) {
        return m30584h(i10 | i11);
    }

    /* JADX INFO: renamed from: m */
    public static String m30589m(int i10) {
        return "WindowInsetsSides(" + m30590n(i10) + ')';
    }

    /* JADX INFO: renamed from: n */
    public static final String m30590n(int i10) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = f26393f;
        if ((i10 & i11) == i11) {
            m30591o(sb2, "Start");
        }
        int i12 = f26397j;
        if ((i10 & i12) == i12) {
            m30591o(sb2, "Left");
        }
        int i13 = f26395h;
        if ((i10 & i13) == i13) {
            m30591o(sb2, "Top");
        }
        int i14 = f26394g;
        if ((i10 & i14) == i14) {
            m30591o(sb2, "End");
        }
        int i15 = f26398k;
        if ((i10 & i15) == i15) {
            m30591o(sb2, "Right");
        }
        int i16 = f26396i;
        if ((i10 & i16) == i16) {
            m30591o(sb2, "Bottom");
        }
        return sb2.toString();
    }

    /* JADX INFO: renamed from: o */
    public static final void m30591o(StringBuilder sb2, String str) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }

    /* JADX INFO: renamed from: t.x3$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final int m30592a() {
            return AbstractC7923x3.f26389b;
        }

        /* JADX INFO: renamed from: b */
        public final int m30593b() {
            return AbstractC7923x3.f26391d;
        }

        /* JADX INFO: renamed from: c */
        public final int m30594c() {
            return AbstractC7923x3.f26390c;
        }

        /* JADX INFO: renamed from: d */
        public final int m30595d() {
            return AbstractC7923x3.f26392e;
        }

        /* JADX INFO: renamed from: e */
        public final int m30596e() {
            return AbstractC7923x3.f26396i;
        }

        /* JADX INFO: renamed from: f */
        public final int m30597f() {
            return AbstractC7923x3.f26399l;
        }

        /* JADX INFO: renamed from: g */
        public final int m30598g() {
            return AbstractC7923x3.f26395h;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: h */
    public static int m30584h(int i10) {
        return i10;
    }
}
