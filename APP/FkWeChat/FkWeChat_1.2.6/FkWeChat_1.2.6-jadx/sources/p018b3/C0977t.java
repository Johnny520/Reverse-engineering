package p018b3;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p043d3.C1869e;

/* JADX INFO: renamed from: b3.t */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0977t {

    /* JADX INFO: renamed from: g */
    public static final a f2987g = new a(null);

    /* JADX INFO: renamed from: h */
    public static final C0977t f2988h = new C0977t(false, 0, false, 0, 0, null, null, 127, null);

    /* JADX INFO: renamed from: a */
    public final boolean f2989a;

    /* JADX INFO: renamed from: b */
    public final int f2990b;

    /* JADX INFO: renamed from: c */
    public final boolean f2991c;

    /* JADX INFO: renamed from: d */
    public final int f2992d;

    /* JADX INFO: renamed from: e */
    public final int f2993e;

    /* JADX INFO: renamed from: f */
    public final C1869e f2994f;

    public /* synthetic */ C0977t(boolean z10, int i10, boolean z11, int i11, int i12, AbstractC0962l0 abstractC0962l0, C1869e c1869e, int i13, AbstractC1043k abstractC1043k) {
        this((i13 & 1) != 0 ? false : z10, (i13 & 2) != 0 ? C0987y.f3034b.m3646b() : i10, (i13 & 4) != 0 ? true : z11, (i13 & 8) != 0 ? C0989z.f3042b.m3674h() : i11, (i13 & 16) != 0 ? C0975s.f2976b.m3558a() : i12, (i13 & 32) != 0 ? null : abstractC0962l0, (i13 & 64) != 0 ? C1869e.f5201s.m6634b() : c1869e, null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m3568b() {
        return this.f2991c;
    }

    /* JADX INFO: renamed from: c */
    public final int m3569c() {
        return this.f2990b;
    }

    /* JADX INFO: renamed from: d */
    public final C1869e m3570d() {
        return this.f2994f;
    }

    /* JADX INFO: renamed from: e */
    public final int m3571e() {
        return this.f2993e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0977t)) {
            return false;
        }
        C0977t c0977t = (C0977t) obj;
        return this.f2989a == c0977t.f2989a && C0987y.m3641i(this.f2990b, c0977t.f2990b) && this.f2991c == c0977t.f2991c && C0989z.m3663n(this.f2992d, c0977t.f2992d) && C0975s.m3554m(this.f2993e, c0977t.f2993e) && AbstractC1061t.m3842c(null, null) && AbstractC1061t.m3842c(this.f2994f, c0977t.f2994f);
    }

    /* JADX INFO: renamed from: f */
    public final int m3572f() {
        return this.f2992d;
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC0962l0 m3573g() {
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m3574h() {
        return this.f2989a;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f2989a) * 31) + C0987y.m3642j(this.f2990b)) * 31) + Boolean.hashCode(this.f2991c)) * 31) + C0989z.m3664o(this.f2992d)) * 31) + C0975s.m3555n(this.f2993e)) * 961) + this.f2994f.hashCode();
    }

    public String toString() {
        return "ImeOptions(singleLine=" + this.f2989a + ", capitalization=" + ((Object) C0987y.m3643k(this.f2990b)) + ", autoCorrect=" + this.f2991c + ", keyboardType=" + ((Object) C0989z.m3665p(this.f2992d)) + ", imeAction=" + ((Object) C0975s.m3556o(this.f2993e)) + ", platformImeOptions=null, hintLocales=" + this.f2994f + ')';
    }

    /* JADX INFO: renamed from: b3.t$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0977t m3575a() {
            return C0977t.f2988h;
        }

        public a() {
        }
    }

    public C0977t(boolean z10, int i10, boolean z11, int i11, int i12, AbstractC0962l0 abstractC0962l0, C1869e c1869e) {
        this.f2989a = z10;
        this.f2990b = i10;
        this.f2991c = z11;
        this.f2992d = i11;
        this.f2993e = i12;
        this.f2994f = c1869e;
    }

    public /* synthetic */ C0977t(boolean z10, int i10, boolean z11, int i11, int i12, AbstractC0962l0 abstractC0962l0, C1869e c1869e, AbstractC1043k abstractC1043k) {
        this(z10, i10, z11, i11, i12, abstractC0962l0, c1869e);
    }
}
