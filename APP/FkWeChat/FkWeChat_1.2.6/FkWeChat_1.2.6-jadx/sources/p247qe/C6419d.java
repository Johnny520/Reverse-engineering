package p247qe;

import be.AbstractC1117e;
import java.util.List;
import me.AbstractC5166e;
import me.C5164c;
import me.C5168g;
import ne.InterfaceC5590b;
import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p080f9.C2363j;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p217oe.InterfaceC5742d;
import p299ub.C8622g;
import p299ub.C8632n;
import p299ub.InterfaceC8626i;
import pe.C6071d;
import re.InterfaceC6627f;

/* JADX INFO: renamed from: qe.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C6419d implements InterfaceC5742d {

    /* JADX INFO: renamed from: b */
    public static final a f20211b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final C8632n f20212c = new C8632n("^ {0,3}(~~~+|```+)([^`]*)$");

    /* JADX INFO: renamed from: qe.d$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final String f20213a;

        /* JADX INFO: renamed from: b */
        public final String f20214b;

        public b(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.f20213a = str;
            this.f20214b = str2;
        }

        /* JADX INFO: renamed from: a */
        public final String m25440a() {
            return this.f20214b;
        }

        /* JADX INFO: renamed from: b */
        public final String m25441b() {
            return this.f20213a;
        }

        /* JADX INFO: renamed from: c */
        public final String m25442c() {
            return this.f20214b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return AbstractC1061t.m3842c(this.f20213a, bVar.f20213a) && AbstractC1061t.m3842c(this.f20214b, bVar.f20214b);
        }

        public int hashCode() {
            return (this.f20213a.hashCode() * 31) + this.f20214b.hashCode();
        }

        public String toString() {
            return "OpeningInfo(delimiter=" + this.f20213a + ", info=" + this.f20214b + ')';
        }
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: a */
    public List mo12784a(C5164c.a aVar, C5168g c5168g, AbstractC5166e.a aVar2) {
        aVar.getClass();
        c5168g.getClass();
        aVar2.getClass();
        b bVarM25439d = m25439d(aVar, aVar2.m21216a());
        if (bVarM25439d == null) {
            return AbstractC5114x.m20800o();
        }
        m25438c(aVar, bVarM25439d, c5168g);
        return AbstractC5112w.m20789e(new C6071d(aVar2.m21216a(), c5168g, bVarM25439d.m25441b()));
    }

    @Override // p217oe.InterfaceC5742d
    /* JADX INFO: renamed from: b */
    public boolean mo12785b(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        aVar.getClass();
        interfaceC5590b.getClass();
        return m25439d(aVar, interfaceC5590b) != null;
    }

    /* JADX INFO: renamed from: c */
    public final void m25438c(C5164c.a aVar, b bVar, C5168g c5168g) {
        int iM21190g = aVar.m21190g() - bVar.m25440a().length();
        c5168g.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(aVar.m21191h(), iM21190g), AbstractC1117e.f3382F)));
        if (bVar.m25442c().length() > 0) {
            c5168g.m21222b(AbstractC5112w.m20789e(new InterfaceC6627f.a(new C2363j(iM21190g, aVar.m21190g()), AbstractC1117e.f3381E)));
        }
    }

    /* JADX INFO: renamed from: d */
    public b m25439d(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
        InterfaceC8626i interfaceC8626iM33210c;
        aVar.getClass();
        interfaceC5590b.getClass();
        if (!InterfaceC5742d.f18111a.m23241a(aVar, interfaceC5590b) || (interfaceC8626iM33210c = C8632n.m33210c(f20212c, aVar.m21187d(), 0, 2, null)) == null) {
            return null;
        }
        C8622g c8622g = interfaceC8626iM33210c.mo33183c().get(1);
        String strM33172a = c8622g != null ? c8622g.m33172a() : null;
        strM33172a.getClass();
        C8622g c8622g2 = interfaceC8626iM33210c.mo33183c().get(2);
        String strM33172a2 = c8622g2 != null ? c8622g2.m33172a() : null;
        strM33172a2.getClass();
        return new b(strM33172a, strM33172a2);
    }

    /* JADX INFO: renamed from: qe.d$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
