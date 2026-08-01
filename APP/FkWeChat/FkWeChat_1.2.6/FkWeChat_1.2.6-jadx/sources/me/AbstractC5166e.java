package me;

import be.C1116d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me.C5164c;
import ne.AbstractC5591c;
import ne.InterfaceC5590b;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0188p;
import p024b9.AbstractC1061t;
import p024b9.AbstractC1067w;
import p175le.C4752a;
import p185m8.AbstractC5081g0;
import p185m8.AbstractC5112w;
import p185m8.AbstractC5114x;
import p217oe.InterfaceC5740b;
import p217oe.InterfaceC5742d;
import pe.C6077j;

/* JADX INFO: renamed from: me.e */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5166e {

    /* JADX INFO: renamed from: a */
    public final C5168g f15774a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5590b f15775b;

    /* JADX INFO: renamed from: c */
    public final List f15776c;

    /* JADX INFO: renamed from: d */
    public final List f15777d;

    /* JADX INFO: renamed from: e */
    public InterfaceC5590b f15778e;

    /* JADX INFO: renamed from: f */
    public int f15779f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC0188p f15780g;

    /* JADX INFO: renamed from: me.e$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final InterfaceC5590b f15781a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC5590b f15782b;

        /* JADX INFO: renamed from: c */
        public final List f15783c;

        public a(InterfaceC5590b interfaceC5590b, InterfaceC5590b interfaceC5590b2, List list) {
            interfaceC5590b.getClass();
            interfaceC5590b2.getClass();
            list.getClass();
            this.f15781a = interfaceC5590b;
            this.f15782b = interfaceC5590b2;
            this.f15783c = list;
        }

        /* JADX INFO: renamed from: a */
        public final InterfaceC5590b m21216a() {
            return this.f15781a;
        }

        /* JADX INFO: renamed from: b */
        public final InterfaceC5740b m21217b() {
            return (InterfaceC5740b) AbstractC5081g0.m20589w0(this.f15783c);
        }

        /* JADX INFO: renamed from: c */
        public final InterfaceC5590b m21218c() {
            return this.f15782b;
        }

        /* JADX INFO: renamed from: d */
        public final C6077j m21219d() {
            Object next;
            Iterator it = this.f15783c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((InterfaceC5740b) next) instanceof C6077j) {
                    break;
                }
            }
            return (C6077j) next;
        }

        public boolean equals(Object obj) {
            a aVar = obj instanceof a ? (a) obj : null;
            return aVar != null && AbstractC1061t.m3842c(this.f15781a, aVar.f15781a) && AbstractC1061t.m3842c(this.f15782b, aVar.f15782b) && AbstractC1061t.m3842c(this.f15783c, aVar.f15783c);
        }

        public int hashCode() {
            return (((this.f15781a.hashCode() * 37) + this.f15782b.hashCode()) * 37) + this.f15783c.hashCode();
        }
    }

    /* JADX INFO: renamed from: me.e$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC1067w implements InterfaceC0188p {
        public b() {
            super(2);
        }

        @Override // p010a9.InterfaceC0188p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C5164c.a aVar, InterfaceC5590b interfaceC5590b) {
            boolean z10;
            aVar.getClass();
            interfaceC5590b.getClass();
            Iterator it = AbstractC5166e.this.mo8788g().iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                if (((InterfaceC5742d) it.next()).mo12785b(aVar, interfaceC5590b)) {
                    z10 = true;
                    break;
                }
            }
            return Boolean.valueOf(z10);
        }
    }

    public AbstractC5166e(C5168g c5168g, InterfaceC5590b interfaceC5590b) {
        c5168g.getClass();
        interfaceC5590b.getClass();
        this.f15774a = c5168g;
        this.f15775b = interfaceC5590b;
        this.f15776c = AbstractC5114x.m20800o();
        this.f15777d = new ArrayList();
        this.f15778e = interfaceC5590b;
        this.f15779f = -1;
        this.f15780g = new b();
    }

    /* JADX INFO: renamed from: a */
    public final void m21204a(InterfaceC5740b interfaceC5740b) {
        interfaceC5740b.getClass();
        this.f15777d.add(interfaceC5740b);
        m21215p();
    }

    /* JADX INFO: renamed from: b */
    public final void m21205b(int i10, InterfaceC5740b interfaceC5740b, InterfaceC5740b.c cVar) {
        m21207d(i10, cVar.m23232d());
        if (interfaceC5740b.mo23225f(cVar.m23234f())) {
            this.f15777d.remove(i10);
            m21215p();
        }
    }

    /* JADX INFO: renamed from: c */
    public final int m21206c(C5164c.a aVar) {
        InterfaceC5740b interfaceC5740b = (InterfaceC5740b) AbstractC5081g0.m20589w0(this.f15777d);
        int iMo23224e = interfaceC5740b != null ? interfaceC5740b.mo23224e(aVar) : aVar.m21190g();
        if (iMo23224e == -1) {
            return Integer.MAX_VALUE;
        }
        return iMo23224e;
    }

    /* JADX INFO: renamed from: d */
    public final void m21207d(int i10, InterfaceC5740b.a aVar) {
        if (aVar != InterfaceC5740b.a.f18095t) {
            for (int size = this.f15777d.size() - 1; size > i10; size--) {
                boolean zMo23225f = ((InterfaceC5740b) this.f15777d.get(size)).mo23225f(aVar);
                C4752a c4752a = C4752a.f14072a;
                if (!zMo23225f) {
                    throw new C1116d("If closing action is not NOTHING, marker should be gone");
                }
                this.f15777d.remove(size);
            }
            m21215p();
        }
    }

    /* JADX INFO: renamed from: e */
    public List mo8787e(C5164c.a aVar, C5168g c5168g) {
        aVar.getClass();
        c5168g.getClass();
        C4752a c4752a = C4752a.f14072a;
        if (!InterfaceC5742d.f18111a.m23241a(aVar, mo8789k().m21216a())) {
            throw new C1116d(_UrlKt.FRAGMENT_ENCODE_SET);
        }
        Iterator it = mo8788g().iterator();
        while (it.hasNext()) {
            List listMo12784a = ((InterfaceC5742d) it.next()).mo12784a(aVar, c5168g, mo8789k());
            if (!listMo12784a.isEmpty()) {
                return listMo12784a;
            }
        }
        return (aVar.m21192i() < AbstractC5591c.m22694f(mo8789k().m21218c(), aVar.m21186c()) || aVar.m21184a() == null) ? AbstractC5114x.m20800o() : AbstractC5112w.m20789e(new C6077j(mo8789k().m21216a(), c5168g.m21225e(), this.f15780g));
    }

    /* JADX INFO: renamed from: f */
    public final void m21208f() {
        m21207d(-1, InterfaceC5740b.a.f18094s);
    }

    /* JADX INFO: renamed from: g */
    public abstract List mo8788g();

    /* JADX INFO: renamed from: h */
    public final List m21209h() {
        return this.f15777d;
    }

    /* JADX INFO: renamed from: i */
    public final List m21210i() {
        return this.f15776c;
    }

    /* JADX INFO: renamed from: j */
    public final InterfaceC5590b m21211j() {
        return this.f15775b;
    }

    /* JADX INFO: renamed from: k */
    public abstract a mo8789k();

    /* JADX INFO: renamed from: l */
    public final InterfaceC5590b m21212l() {
        return this.f15778e;
    }

    /* JADX INFO: renamed from: m */
    public abstract void mo8790m(C5164c.a aVar, InterfaceC5590b interfaceC5590b, C5168g c5168g);

    /* JADX INFO: renamed from: n */
    public final boolean m21213n(C5164c.a aVar) {
        int size = this.f15777d.size();
        while (size > 0) {
            size--;
            if (size < this.f15777d.size()) {
                InterfaceC5740b interfaceC5740b = (InterfaceC5740b) this.f15777d.get(size);
                InterfaceC5740b.c cVarMo23222a = interfaceC5740b.mo23222a(aVar, mo8789k().m21216a());
                if (AbstractC1061t.m3842c(cVarMo23222a, InterfaceC5740b.c.f18100d.m23237c())) {
                    continue;
                } else {
                    m21205b(size, interfaceC5740b, cVarMo23222a);
                    if (cVarMo23222a.m23233e() == InterfaceC5740b.b.CANCEL) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final C5164c.a m21214o(C5164c.a aVar) {
        boolean z10;
        int iM22694f;
        InterfaceC5740b interfaceC5740b;
        aVar.getClass();
        mo8791q(aVar);
        if (aVar.m21191h() >= this.f15779f) {
            m21213n(aVar);
            z10 = true;
        } else {
            z10 = false;
        }
        if (InterfaceC5742d.f18111a.m23241a(aVar, mo8789k().m21216a()) && ((interfaceC5740b = (InterfaceC5740b) AbstractC5081g0.m20589w0(this.f15777d)) == null || interfaceC5740b.mo12775b())) {
            Iterator it = mo8787e(aVar, this.f15774a).iterator();
            while (it.hasNext()) {
                m21204a((InterfaceC5740b) it.next());
                z10 = true;
            }
        }
        if (z10) {
            this.f15779f = m21206c(aVar);
        }
        if ((aVar.m21192i() != -1 && !InterfaceC5742d.f18111a.m23241a(aVar, mo8789k().m21216a())) || (iM22694f = AbstractC5591c.m22694f(mo8789k().m21218c(), aVar.m21186c()) - aVar.m21192i()) <= 0) {
            return aVar.m21196m(this.f15779f - aVar.m21191h());
        }
        if (aVar.m21192i() != -1 && mo8789k().m21218c().mo22668a() <= this.f15778e.mo22668a()) {
            mo8790m(aVar, mo8789k().m21218c(), this.f15774a);
        }
        return aVar.m21196m(iM22694f);
    }

    /* JADX INFO: renamed from: p */
    public final void m21215p() {
        this.f15778e = this.f15777d.isEmpty() ? this.f15775b : ((InterfaceC5740b) AbstractC5081g0.m20587u0(this.f15777d)).mo23223d();
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo8791q(C5164c.a aVar);
}
