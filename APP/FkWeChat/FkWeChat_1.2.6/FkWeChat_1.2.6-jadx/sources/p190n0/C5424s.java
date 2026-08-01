package p190n0;

import java.util.List;
import java.util.NoSuchElementException;
import p010a9.InterfaceC0184l;
import p117i.AbstractC3085t;
import p117i.AbstractC3091w;
import p117i.AbstractC3093x;
import p117i.C3070l0;
import p172l8.C4700i0;
import p263s.AbstractC6635e;

/* JADX INFO: renamed from: n0.s */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5424s implements InterfaceC5426s1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3085t f16734a;

    /* JADX INFO: renamed from: b */
    public final List f16735b;

    /* JADX INFO: renamed from: c */
    public final int f16736c;

    /* JADX INFO: renamed from: d */
    public final int f16737d;

    /* JADX INFO: renamed from: e */
    public final boolean f16738e;

    /* JADX INFO: renamed from: f */
    public final C5419r0 f16739f;

    /* JADX INFO: renamed from: n0.s$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f16740a;

        static {
            int[] iArr = new int[EnumC5388m.values().length];
            try {
                iArr[EnumC5388m.f16586s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC5388m.f16585r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC5388m.f16584q.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f16740a = iArr;
        }
    }

    public C5424s(AbstractC3085t abstractC3085t, List list, int i10, int i11, boolean z10, C5419r0 c5419r0) {
        this.f16734a = abstractC3085t;
        this.f16735b = list;
        this.f16736c = i10;
        this.f16737d = i11;
        this.f16738e = z10;
        this.f16739f = c5419r0;
        if (list.size() > 1) {
            return;
        }
        AbstractC6635e.m26320c("MultiSelectionLayout requires an infoList size greater than 1, was " + list.size() + '.');
    }

    /* JADX INFO: renamed from: n */
    public static C4700i0 m22146n(C5424s c5424s, C3070l0 c3070l0, C5419r0 c5419r0, C5407p0 c5407p0) {
        c5424s.m22147o(c3070l0, c5419r0, c5407p0, 0, c5407p0.m22000l());
        return C4700i0.f13910a;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: a */
    public int mo22133a() {
        return this.f16735b.size();
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: b */
    public boolean mo22134b() {
        return this.f16738e;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: c */
    public C5407p0 mo22135c() {
        return mo22134b() ? mo22144l() : mo22140h();
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: d */
    public C5419r0 mo22136d() {
        return this.f16739f;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: e */
    public C5407p0 mo22137e() {
        return mo22141i() == EnumC5388m.f16584q ? mo22140h() : mo22144l();
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: f */
    public void mo22138f(InterfaceC0184l interfaceC0184l) {
        int iM22148p = m22148p(mo22137e().m21996h());
        int iM22148p2 = m22148p(m22149q().m21996h());
        int i10 = iM22148p + 1;
        if (i10 >= iM22148p2) {
            return;
        }
        while (i10 < iM22148p2) {
            interfaceC0184l.mo27m(this.f16735b.get(i10));
            i10++;
        }
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: g */
    public int mo22139g() {
        return this.f16737d;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: h */
    public C5407p0 mo22140h() {
        return (C5407p0) this.f16735b.get(m22152t(mo22139g(), false));
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: i */
    public EnumC5388m mo22141i() {
        return mo22145m() < mo22139g() ? EnumC5388m.f16585r : mo22145m() > mo22139g() ? EnumC5388m.f16584q : ((C5407p0) this.f16735b.get(mo22145m() / 2)).m21992d();
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: j */
    public boolean mo22142j(InterfaceC5426s1 interfaceC5426s1) {
        if (mo22136d() == null || interfaceC5426s1 == null || !(interfaceC5426s1 instanceof C5424s)) {
            return true;
        }
        C5424s c5424s = (C5424s) interfaceC5426s1;
        return (mo22134b() == c5424s.mo22134b() && mo22145m() == c5424s.mo22145m() && mo22139g() == c5424s.mo22139g() && !m22150r(c5424s)) ? false : true;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: k */
    public AbstractC3091w mo22143k(final C5419r0 c5419r0) {
        if (c5419r0.m22115e().m22121e() == c5419r0.m22113c().m22121e()) {
            if (!((c5419r0.m22114d() && c5419r0.m22115e().m22120d() >= c5419r0.m22113c().m22120d()) || (!c5419r0.m22114d() && c5419r0.m22115e().m22120d() <= c5419r0.m22113c().m22120d()))) {
                AbstractC6635e.m26320c("unexpectedly miss-crossed selection: " + c5419r0);
            }
            return AbstractC3093x.m11596b(c5419r0.m22115e().m22121e(), c5419r0);
        }
        final C3070l0 c3070l0M11597c = AbstractC3093x.m11597c();
        m22147o(c3070l0M11597c, c5419r0, mo22137e(), (c5419r0.m22114d() ? c5419r0.m22113c() : c5419r0.m22115e()).m22120d(), mo22137e().m22000l());
        mo22138f(new InterfaceC0184l() { // from class: n0.r
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C5424s.m22146n(this.f16716q, c3070l0M11597c, c5419r0, (C5407p0) obj);
            }
        });
        m22147o(c3070l0M11597c, c5419r0, m22149q(), 0, (c5419r0.m22114d() ? c5419r0.m22115e() : c5419r0.m22113c()).m22120d());
        return c3070l0M11597c;
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: l */
    public C5407p0 mo22144l() {
        return (C5407p0) this.f16735b.get(m22152t(mo22145m(), true));
    }

    @Override // p190n0.InterfaceC5426s1
    /* JADX INFO: renamed from: m */
    public int mo22145m() {
        return this.f16736c;
    }

    /* JADX INFO: renamed from: o */
    public final void m22147o(C3070l0 c3070l0, C5419r0 c5419r0, C5407p0 c5407p0, int i10, int i11) {
        C5419r0 c5419r0M22001m = c5419r0.m22114d() ? c5407p0.m22001m(i11, i10) : c5407p0.m22001m(i10, i11);
        if (!(i10 <= i11)) {
            AbstractC6635e.m26320c("minOffset should be less than or equal to maxOffset: " + c5419r0M22001m);
        }
        c3070l0.m11407n(c5407p0.m21996h(), c5419r0M22001m);
    }

    /* JADX INFO: renamed from: p */
    public final int m22148p(long j10) {
        try {
            return this.f16734a.m11556b(j10);
        } catch (NoSuchElementException e10) {
            throw new IllegalStateException("Invalid selectableId: " + j10, e10);
        }
    }

    /* JADX INFO: renamed from: q */
    public C5407p0 m22149q() {
        return mo22141i() == EnumC5388m.f16584q ? mo22144l() : mo22140h();
    }

    /* JADX INFO: renamed from: r */
    public final boolean m22150r(C5424s c5424s) {
        if (mo22133a() != c5424s.mo22133a()) {
            return true;
        }
        int size = this.f16735b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (((C5407p0) this.f16735b.get(i10)).m22002n((C5407p0) c5424s.f16735b.get(i10))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final int m22151s(int i10, boolean z10) {
        return (i10 - (!z10 ? 1 : 0)) / 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m22152t(int r4, boolean r5) {
        /*
            r3 = this;
            n0.m r0 = r3.mo22141i()
            int[] r1 = p190n0.C5424s.a.f16740a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L17
            r2 = 2
            if (r0 == r2) goto L20
            r2 = 3
            if (r0 != r2) goto L1b
            if (r5 != 0) goto L19
        L17:
            r5 = r1
            goto L20
        L19:
            r5 = 0
            goto L20
        L1b:
            p215oc.C5729x.m23182a()
            r4 = 0
            return r4
        L20:
            int r4 = r3.m22151s(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p190n0.C5424s.m22152t(int, boolean):int");
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MultiSelectionLayout(isStartHandle=");
        sb2.append(mo22134b());
        sb2.append(", startPosition=");
        boolean z10 = true;
        float f10 = 2;
        sb2.append((mo22145m() + 1) / f10);
        sb2.append(", endPosition=");
        sb2.append((mo22139g() + 1) / f10);
        sb2.append(", crossed=");
        sb2.append(mo22141i());
        sb2.append(", infos=");
        StringBuilder sb3 = new StringBuilder("[\n\t");
        List list = this.f16735b;
        int size = list.size();
        int i10 = 0;
        while (i10 < size) {
            C5407p0 c5407p0 = (C5407p0) list.get(i10);
            if (z10) {
                z10 = false;
            } else {
                sb3.append(",\n\t");
            }
            StringBuilder sb4 = new StringBuilder();
            i10++;
            sb4.append(i10);
            sb4.append(" -> ");
            sb4.append(c5407p0);
            sb3.append(sb4.toString());
        }
        sb3.append("\n]");
        sb2.append(sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
