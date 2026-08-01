package p190n0;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import p024b9.AbstractC1043k;
import p117i.AbstractC3087u;
import p117i.C3064j0;
import p135j2.InterfaceC3578w;
import p185m8.AbstractC5081g0;
import p215oc.C5729x;
import p319w2.C9122q3;

/* JADX INFO: renamed from: n0.t1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5432t1 {

    /* JADX INFO: renamed from: a */
    public final long f16753a;

    /* JADX INFO: renamed from: b */
    public final long f16754b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3578w f16755c;

    /* JADX INFO: renamed from: d */
    public final boolean f16756d;

    /* JADX INFO: renamed from: e */
    public final C5419r0 f16757e;

    /* JADX INFO: renamed from: f */
    public final Comparator f16758f;

    /* JADX INFO: renamed from: g */
    public final C3064j0 f16759g;

    /* JADX INFO: renamed from: h */
    public final List f16760h;

    /* JADX INFO: renamed from: i */
    public int f16761i;

    /* JADX INFO: renamed from: j */
    public int f16762j;

    /* JADX INFO: renamed from: k */
    public int f16763k;

    /* JADX INFO: renamed from: n0.t1$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16764a;

        static {
            int[] iArr = new int[EnumC5394n.values().length];
            try {
                iArr[EnumC5394n.f16595q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5394n.f16596r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5394n.f16597s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16764a = iArr;
        }
    }

    public C5432t1(long j10, long j11, InterfaceC3578w interfaceC3578w, boolean z10, C5419r0 c5419r0, Comparator comparator) {
        this.f16753a = j10;
        this.f16754b = j11;
        this.f16755c = interfaceC3578w;
        this.f16756d = z10;
        this.f16757e = c5419r0;
        this.f16758f = comparator;
        this.f16759g = AbstractC3087u.m11563a();
        this.f16760h = new ArrayList();
        this.f16761i = -1;
        this.f16762j = -1;
        this.f16763k = -1;
    }

    /* JADX INFO: renamed from: a */
    public final C5407p0 m22158a(long j10, int i10, EnumC5394n enumC5394n, EnumC5394n enumC5394n2, int i11, EnumC5394n enumC5394n3, EnumC5394n enumC5394n4, int i12, C9122q3 c9122q3) {
        this.f16763k += 2;
        C5407p0 c5407p0 = new C5407p0(j10, this.f16763k, i10, i11, i12, c9122q3);
        this.f16761i = m22166i(this.f16761i, enumC5394n, enumC5394n2);
        this.f16762j = m22166i(this.f16762j, enumC5394n3, enumC5394n4);
        this.f16759g.m11375n(j10, this.f16760h.size());
        this.f16760h.add(c5407p0);
        return c5407p0;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC5426s1 m22159b() {
        int i10 = this.f16763k + 1;
        int size = this.f16760h.size();
        if (size == 0) {
            return null;
        }
        if (size == 1) {
            C5407p0 c5407p0 = (C5407p0) AbstractC5081g0.m20537I0(this.f16760h);
            int i11 = this.f16761i;
            int i12 = i11 == -1 ? i10 : i11;
            int i13 = this.f16762j;
            return new C5422r3(this.f16756d, i12, i13 == -1 ? i10 : i13, this.f16757e, c5407p0);
        }
        C3064j0 c3064j0 = this.f16759g;
        List list = this.f16760h;
        int i14 = this.f16761i;
        int i15 = i14 == -1 ? i10 : i14;
        int i16 = this.f16762j;
        return new C5424s(c3064j0, list, i15, i16 == -1 ? i10 : i16, this.f16756d, this.f16757e);
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3578w m22160c() {
        return this.f16755c;
    }

    /* JADX INFO: renamed from: d */
    public final long m22161d() {
        return this.f16753a;
    }

    /* JADX INFO: renamed from: e */
    public final long m22162e() {
        return this.f16754b;
    }

    /* JADX INFO: renamed from: f */
    public final C5419r0 m22163f() {
        return this.f16757e;
    }

    /* JADX INFO: renamed from: g */
    public final Comparator m22164g() {
        return this.f16758f;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m22165h() {
        return this.f16756d;
    }

    /* JADX INFO: renamed from: i */
    public final int m22166i(int i10, EnumC5394n enumC5394n, EnumC5394n enumC5394n2) {
        if (i10 == -1) {
            int i11 = a.f16764a[AbstractC5444v1.m22180d(enumC5394n, enumC5394n2).ordinal()];
            if (i11 == 1) {
                return this.f16763k - 1;
            }
            if (i11 == 2) {
                return this.f16763k;
            }
            if (i11 != 3) {
                C5729x.m23182a();
                return 0;
            }
        }
        return i10;
    }

    public /* synthetic */ C5432t1(long j10, long j11, InterfaceC3578w interfaceC3578w, boolean z10, C5419r0 c5419r0, Comparator comparator, AbstractC1043k abstractC1043k) {
        this(j10, j11, interfaceC3578w, z10, c5419r0, comparator);
    }
}
