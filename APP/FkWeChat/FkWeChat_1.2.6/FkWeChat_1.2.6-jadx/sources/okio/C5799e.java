package okio;

import ae.AbstractC0308g;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p376zd.C10000k0;
import p376zd.C10003m;
import p376zd.C9995i;

/* JADX INFO: renamed from: okio.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5799e implements Comparable {

    /* JADX INFO: renamed from: r */
    public static final a f18171r = new a(null);

    /* JADX INFO: renamed from: s */
    public static final String f18172s;

    /* JADX INFO: renamed from: q */
    public final C10003m f18173q;

    static {
        String str = File.separator;
        str.getClass();
        f18172s = str;
    }

    public C5799e(C10003m c10003m) {
        c10003m.getClass();
        this.f18173q = c10003m;
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ C5799e m23295r(C5799e c5799e, C5799e c5799e2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return c5799e.m23306p(c5799e2, z10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C5799e c5799e) {
        c5799e.getClass();
        return m23297c().compareTo(c5799e.m23297c());
    }

    /* JADX INFO: renamed from: c */
    public final C10003m m23297c() {
        return this.f18173q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof C5799e) && AbstractC1061t.m3842c(((C5799e) obj).m23297c(), m23297c());
    }

    /* JADX INFO: renamed from: g */
    public final C5799e m23298g() {
        int iM938o = AbstractC0308g.m938o(this);
        if (iM938o == -1) {
            return null;
        }
        return new C5799e(m23297c().mo38768J(0, iM938o));
    }

    /* JADX INFO: renamed from: h */
    public final List m23299h() {
        ArrayList arrayList = new ArrayList();
        int iM938o = AbstractC0308g.m938o(this);
        if (iM938o == -1) {
            iM938o = 0;
        } else if (iM938o < m23297c().m38765G() && m23297c().m38777j(iM938o) == 92) {
            iM938o++;
        }
        int iM38765G = m23297c().m38765G();
        int i10 = iM938o;
        while (iM938o < iM38765G) {
            if (m23297c().m38777j(iM938o) == 47 || m23297c().m38777j(iM938o) == 92) {
                arrayList.add(m23297c().mo38768J(i10, iM938o));
                i10 = iM938o + 1;
            }
            iM938o++;
        }
        if (i10 < m23297c().m38765G()) {
            arrayList.add(m23297c().mo38768J(i10, m23297c().m38765G()));
        }
        return arrayList;
    }

    public int hashCode() {
        return m23297c().hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final String m23300i() {
        return m23301j().m38770M();
    }

    public final boolean isAbsolute() {
        return AbstractC0308g.m938o(this) != -1;
    }

    /* JADX INFO: renamed from: j */
    public final C10003m m23301j() {
        int iM935l = AbstractC0308g.m935l(this);
        return iM935l != -1 ? C10003m.m38756K(m23297c(), iM935l + 1, 0, 2, null) : (m23308t() == null || m23297c().m38765G() != 2) ? m23297c() : C10003m.f33583u;
    }

    /* JADX INFO: renamed from: k */
    public final C5799e m23302k() {
        if (AbstractC1061t.m3842c(m23297c(), AbstractC0308g.f768d) || AbstractC1061t.m3842c(m23297c(), AbstractC0308g.f765a) || AbstractC1061t.m3842c(m23297c(), AbstractC0308g.f766b) || AbstractC0308g.m937n(this)) {
            return null;
        }
        int iM935l = AbstractC0308g.m935l(this);
        if (iM935l == 2 && m23308t() != null) {
            if (m23297c().m38765G() == 3) {
                return null;
            }
            return new C5799e(C10003m.m38756K(m23297c(), 0, 3, 1, null));
        }
        if (iM935l == 1 && m23297c().m38766H(AbstractC0308g.f766b)) {
            return null;
        }
        if (iM935l != -1 || m23308t() == null) {
            return iM935l == -1 ? new C5799e(AbstractC0308g.f768d) : iM935l == 0 ? new C5799e(C10003m.m38756K(m23297c(), 0, 1, 1, null)) : new C5799e(C10003m.m38756K(m23297c(), 0, iM935l, 1, null));
        }
        if (m23297c().m38765G() == 2) {
            return null;
        }
        return new C5799e(C10003m.m38756K(m23297c(), 0, 2, 1, null));
    }

    /* JADX INFO: renamed from: l */
    public final C5799e m23303l(C5799e c5799e) {
        c5799e.getClass();
        if (!AbstractC1061t.m3842c(m23298g(), c5799e.m23298g())) {
            C10000k0.m38754a("Paths of different roots cannot be relative to each other: ", this, " and ", c5799e);
            return null;
        }
        List listM23299h = m23299h();
        List listM23299h2 = c5799e.m23299h();
        int iMin = Math.min(listM23299h.size(), listM23299h2.size());
        int i10 = 0;
        while (i10 < iMin && AbstractC1061t.m3842c(listM23299h.get(i10), listM23299h2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && m23297c().m38765G() == c5799e.m23297c().m38765G()) {
            return a.m23310e(f18171r, ".", false, 1, null);
        }
        if (listM23299h2.subList(i10, listM23299h2.size()).indexOf(AbstractC0308g.f769e) != -1) {
            C10000k0.m38754a("Impossible relative path to resolve: ", this, " and ", c5799e);
            return null;
        }
        if (AbstractC1061t.m3842c(c5799e.m23297c(), AbstractC0308g.f768d)) {
            return this;
        }
        C9995i c9995i = new C9995i();
        C10003m c10003mM936m = AbstractC0308g.m936m(c5799e);
        if (c10003mM936m == null && (c10003mM936m = AbstractC0308g.m936m(this)) == null) {
            c10003mM936m = AbstractC0308g.m942s(f18172s);
        }
        int size = listM23299h2.size();
        for (int i11 = i10; i11 < size; i11++) {
            c9995i.mo38736y0(AbstractC0308g.f769e);
            c9995i.mo38736y0(c10003mM936m);
        }
        int size2 = listM23299h.size();
        while (i10 < size2) {
            c9995i.mo38736y0((C10003m) listM23299h.get(i10));
            c9995i.mo38736y0(c10003mM936m);
            i10++;
        }
        return AbstractC0308g.m940q(c9995i, false);
    }

    /* JADX INFO: renamed from: m */
    public final C5799e m23304m(String str) {
        str.getClass();
        return AbstractC0308g.m933j(this, AbstractC0308g.m940q(new C9995i().mo38698a0(str), false), false);
    }

    /* JADX INFO: renamed from: n */
    public final C5799e m23305n(C5799e c5799e) {
        c5799e.getClass();
        return AbstractC0308g.m933j(this, c5799e, false);
    }

    /* JADX INFO: renamed from: p */
    public final C5799e m23306p(C5799e c5799e, boolean z10) {
        c5799e.getClass();
        return AbstractC0308g.m933j(this, c5799e, z10);
    }

    /* JADX INFO: renamed from: s */
    public final Path m23307s() {
        Path path = Paths.get(toString(), new String[0]);
        path.getClass();
        return path;
    }

    /* JADX INFO: renamed from: t */
    public final Character m23308t() {
        if (C10003m.m38757t(m23297c(), AbstractC0308g.f765a, 0, 2, null) != -1 || m23297c().m38765G() < 2 || m23297c().m38777j(1) != 58) {
            return null;
        }
        char cM38777j = (char) m23297c().m38777j(0);
        if (('a' > cM38777j || cM38777j >= '{') && ('A' > cM38777j || cM38777j >= '[')) {
            return null;
        }
        return Character.valueOf(cM38777j);
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return m23297c().m38770M();
    }

    /* JADX INFO: renamed from: okio.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ C5799e m23309d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.m23312a(file, z10);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ C5799e m23310e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.m23313b(str, z10);
        }

        /* JADX INFO: renamed from: f */
        public static /* synthetic */ C5799e m23311f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.m23314c(path, z10);
        }

        /* JADX INFO: renamed from: a */
        public final C5799e m23312a(File file, boolean z10) {
            file.getClass();
            String string = file.toString();
            string.getClass();
            return m23313b(string, z10);
        }

        /* JADX INFO: renamed from: b */
        public final C5799e m23313b(String str, boolean z10) {
            str.getClass();
            return AbstractC0308g.m934k(str, z10);
        }

        /* JADX INFO: renamed from: c */
        public final C5799e m23314c(Path path, boolean z10) {
            path.getClass();
            return m23313b(path.toString(), z10);
        }

        public a() {
        }
    }
}
