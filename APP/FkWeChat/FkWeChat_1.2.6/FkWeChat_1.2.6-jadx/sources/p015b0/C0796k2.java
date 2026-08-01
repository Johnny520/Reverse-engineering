package p015b0;

import com.alibaba.fastjson2.internal.asm.Opcodes;
import p018b3.AbstractC0962l0;
import p018b3.C0975s;
import p018b3.C0977t;
import p018b3.C0987y;
import p018b3.C0989z;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p043d3.C1869e;

/* JADX INFO: renamed from: b0.k2 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C0796k2 {

    /* JADX INFO: renamed from: g */
    public static final a f2421g = new a(null);

    /* JADX INFO: renamed from: h */
    public static final C0796k2 f2422h = new C0796k2(0, null, 0, 0, null, null, null, 127, null);

    /* JADX INFO: renamed from: i */
    public static final C0796k2 f2423i = new C0796k2(0, Boolean.FALSE, C0989z.f3042b.m3672f(), 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, Opcodes.LSHL, null);

    /* JADX INFO: renamed from: a */
    public final int f2424a;

    /* JADX INFO: renamed from: b */
    public final Boolean f2425b;

    /* JADX INFO: renamed from: c */
    public final int f2426c;

    /* JADX INFO: renamed from: d */
    public final int f2427d;

    /* JADX INFO: renamed from: e */
    public final Boolean f2428e;

    /* JADX INFO: renamed from: f */
    public final C1869e f2429f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0796k2(int i10, Boolean bool, int i11, int i12, AbstractC0962l0 abstractC0962l0, Boolean bool2, C1869e c1869e, int i13, AbstractC1043k abstractC1043k) {
        int iM3648d = (i13 & 1) != 0 ? C0987y.f3034b.m3648d() : i10;
        Boolean bool3 = (i13 & 2) != 0 ? null : bool;
        int iM3675i = (i13 & 4) != 0 ? C0989z.f3042b.m3675i() : i11;
        int iM3566i = (i13 & 8) != 0 ? C0975s.f2976b.m3566i() : i12;
        AbstractC0962l0 abstractC0962l02 = (i13 & 16) != 0 ? null : abstractC0962l0;
        Boolean bool4 = (i13 & 32) != 0 ? null : bool2;
        this(iM3648d, bool3, iM3675i, iM3566i, abstractC0962l02, bool4, (i13 & 64) == 0 ? c1869e : null, null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m2984b() {
        Boolean bool = this.f2425b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public final int m2985c() {
        C0987y c0987yM3638f = C0987y.m3638f(this.f2424a);
        int iM3644l = c0987yM3638f.m3644l();
        C0987y.a aVar = C0987y.f3034b;
        if (C0987y.m3641i(iM3644l, aVar.m3648d())) {
            c0987yM3638f = null;
        }
        return c0987yM3638f != null ? c0987yM3638f.m3644l() : aVar.m3646b();
    }

    /* JADX INFO: renamed from: d */
    public final C1869e m2986d() {
        C1869e c1869e = this.f2429f;
        return c1869e == null ? C1869e.f5201s.m6634b() : c1869e;
    }

    /* JADX INFO: renamed from: e */
    public final int m2987e() {
        C0975s c0975sM3551j = C0975s.m3551j(this.f2427d);
        int iM3557p = c0975sM3551j.m3557p();
        C0975s.a aVar = C0975s.f2976b;
        if (C0975s.m3554m(iM3557p, aVar.m3566i())) {
            c0975sM3551j = null;
        }
        return c0975sM3551j != null ? c0975sM3551j.m3557p() : aVar.m3558a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0796k2)) {
            return false;
        }
        C0796k2 c0796k2 = (C0796k2) obj;
        return C0987y.m3641i(this.f2424a, c0796k2.f2424a) && AbstractC1061t.m3842c(this.f2425b, c0796k2.f2425b) && C0989z.m3663n(this.f2426c, c0796k2.f2426c) && C0975s.m3554m(this.f2427d, c0796k2.f2427d) && AbstractC1061t.m3842c(null, null) && AbstractC1061t.m3842c(this.f2428e, c0796k2.f2428e) && AbstractC1061t.m3842c(this.f2429f, c0796k2.f2429f);
    }

    /* JADX INFO: renamed from: f */
    public final int m2988f() {
        C0989z c0989zM3660k = C0989z.m3660k(this.f2426c);
        int iM3666q = c0989zM3660k.m3666q();
        C0989z.a aVar = C0989z.f3042b;
        if (C0989z.m3663n(iM3666q, aVar.m3675i())) {
            c0989zM3660k = null;
        }
        return c0989zM3660k != null ? c0989zM3660k.m3666q() : aVar.m3674h();
    }

    /* JADX INFO: renamed from: g */
    public final C0977t m2989g(boolean z10) {
        return new C0977t(z10, m2985c(), m2984b(), m2988f(), m2987e(), null, m2986d(), null);
    }

    public int hashCode() {
        int iM3642j = C0987y.m3642j(this.f2424a) * 31;
        Boolean bool = this.f2425b;
        int iHashCode = (((((iM3642j + (bool != null ? bool.hashCode() : 0)) * 31) + C0989z.m3664o(this.f2426c)) * 31) + C0975s.m3555n(this.f2427d)) * 961;
        Boolean bool2 = this.f2428e;
        int iHashCode2 = (iHashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        C1869e c1869e = this.f2429f;
        return iHashCode2 + (c1869e != null ? c1869e.hashCode() : 0);
    }

    public String toString() {
        return "KeyboardOptions(capitalization=" + ((Object) C0987y.m3643k(this.f2424a)) + ", autoCorrectEnabled=" + this.f2425b + ", keyboardType=" + ((Object) C0989z.m3665p(this.f2426c)) + ", imeAction=" + ((Object) C0975s.m3556o(this.f2427d)) + ", platformImeOptions=nullshowKeyboardOnFocus=" + this.f2428e + ", hintLocales=" + this.f2429f + ')';
    }

    /* JADX INFO: renamed from: b0.k2$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C0796k2 m2990a() {
            return C0796k2.f2422h;
        }

        public a() {
        }
    }

    public C0796k2(int i10, Boolean bool, int i11, int i12, AbstractC0962l0 abstractC0962l0, Boolean bool2, C1869e c1869e) {
        this.f2424a = i10;
        this.f2425b = bool;
        this.f2426c = i11;
        this.f2427d = i12;
        this.f2428e = bool2;
        this.f2429f = c1869e;
    }

    public /* synthetic */ C0796k2(int i10, Boolean bool, int i11, int i12, AbstractC0962l0 abstractC0962l0, Boolean bool2, C1869e c1869e, AbstractC1043k abstractC1043k) {
        this(i10, bool, i11, i12, abstractC0962l0, bool2, c1869e);
    }
}
