package p004a3;

import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p030c3.AbstractC1314a;
import p185m8.AbstractC5114x;

/* JADX INFO: renamed from: a3.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0054r implements Comparable {

    /* JADX INFO: renamed from: A */
    public static final C0054r f109A;

    /* JADX INFO: renamed from: B */
    public static final C0054r f110B;

    /* JADX INFO: renamed from: C */
    public static final C0054r f111C;

    /* JADX INFO: renamed from: D */
    public static final C0054r f112D;

    /* JADX INFO: renamed from: E */
    public static final C0054r f113E;

    /* JADX INFO: renamed from: F */
    public static final C0054r f114F;

    /* JADX INFO: renamed from: G */
    public static final C0054r f115G;

    /* JADX INFO: renamed from: H */
    public static final C0054r f116H;

    /* JADX INFO: renamed from: I */
    public static final C0054r f117I;

    /* JADX INFO: renamed from: J */
    public static final C0054r f118J;

    /* JADX INFO: renamed from: K */
    public static final List f119K;

    /* JADX INFO: renamed from: r */
    public static final a f120r = new a(null);

    /* JADX INFO: renamed from: s */
    public static final C0054r f121s;

    /* JADX INFO: renamed from: t */
    public static final C0054r f122t;

    /* JADX INFO: renamed from: u */
    public static final C0054r f123u;

    /* JADX INFO: renamed from: v */
    public static final C0054r f124v;

    /* JADX INFO: renamed from: w */
    public static final C0054r f125w;

    /* JADX INFO: renamed from: x */
    public static final C0054r f126x;

    /* JADX INFO: renamed from: y */
    public static final C0054r f127y;

    /* JADX INFO: renamed from: z */
    public static final C0054r f128z;

    /* JADX INFO: renamed from: q */
    public final int f129q;

    static {
        C0054r c0054r = new C0054r(100);
        f121s = c0054r;
        C0054r c0054r2 = new C0054r(200);
        f122t = c0054r2;
        C0054r c0054r3 = new C0054r(300);
        f123u = c0054r3;
        C0054r c0054r4 = new C0054r(400);
        f124v = c0054r4;
        C0054r c0054r5 = new C0054r(500);
        f125w = c0054r5;
        C0054r c0054r6 = new C0054r(600);
        f126x = c0054r6;
        C0054r c0054r7 = new C0054r(700);
        f127y = c0054r7;
        C0054r c0054r8 = new C0054r(800);
        f128z = c0054r8;
        C0054r c0054r9 = new C0054r(900);
        f109A = c0054r9;
        f110B = c0054r;
        f111C = c0054r2;
        f112D = c0054r3;
        f113E = c0054r4;
        f114F = c0054r5;
        f115G = c0054r6;
        f116H = c0054r7;
        f117I = c0054r8;
        f118J = c0054r9;
        f119K = AbstractC5114x.m20803r(c0054r, c0054r2, c0054r3, c0054r4, c0054r5, c0054r6, c0054r7, c0054r8, c0054r9);
    }

    public C0054r(int i10) {
        this.f129q = i10;
        boolean z10 = false;
        if (1 <= i10 && i10 < 1001) {
            z10 = true;
        }
        if (z10) {
            return;
        }
        AbstractC1314a.m5291a("Font weight can be in range [1, 1000]. Current value: " + i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0054r) && this.f129q == ((C0054r) obj).f129q;
    }

    public int hashCode() {
        return this.f129q;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public int compareTo(C0054r c0054r) {
        return AbstractC1061t.m3843d(this.f129q, c0054r.f129q);
    }

    /* JADX INFO: renamed from: m */
    public final int m202m() {
        return this.f129q;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f129q + ')';
    }

    /* JADX INFO: renamed from: a3.r$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0054r m203a() {
            return C0054r.f118J;
        }

        /* JADX INFO: renamed from: b */
        public final C0054r m204b() {
            return C0054r.f116H;
        }

        /* JADX INFO: renamed from: c */
        public final C0054r m205c() {
            return C0054r.f117I;
        }

        /* JADX INFO: renamed from: d */
        public final C0054r m206d() {
            return C0054r.f114F;
        }

        /* JADX INFO: renamed from: e */
        public final C0054r m207e() {
            return C0054r.f113E;
        }

        /* JADX INFO: renamed from: f */
        public final C0054r m208f() {
            return C0054r.f115G;
        }

        /* JADX INFO: renamed from: g */
        public final C0054r m209g() {
            return C0054r.f126x;
        }

        public a() {
        }
    }
}
