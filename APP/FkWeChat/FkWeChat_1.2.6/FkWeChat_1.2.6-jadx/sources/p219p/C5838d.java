package p219p;

import ec.InterfaceC2156m;
import java.util.concurrent.CancellationException;
import p010a9.InterfaceC0184l;
import p024b9.AbstractC1061t;
import p080f9.AbstractC2368o;
import p080f9.C2363j;
import p172l8.C4700i0;
import p172l8.C4712s;
import p219p.C5852h;
import p250r1.C6457g;
import p263s.AbstractC6635e;
import p349y0.C9508c;

/* JADX INFO: renamed from: p.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C5838d {

    /* JADX INFO: renamed from: b */
    public static final int f18309b = C9508c.f32298t;

    /* JADX INFO: renamed from: a */
    public final C9508c f18310a = new C9508c(new C5852h.a[16], 0);

    /* JADX INFO: renamed from: a */
    public static C4700i0 m23524a(C5838d c5838d, C5852h.a aVar, Throwable th) {
        c5838d.f18310a.m37043p(aVar);
        return C4700i0.f13910a;
    }

    /* JADX INFO: renamed from: c */
    public final void m23526c(Throwable th) {
        C9508c c9508c = this.f18310a;
        int iM37039l = c9508c.m37039l();
        InterfaceC2156m[] interfaceC2156mArr = new InterfaceC2156m[iM37039l];
        for (int i10 = 0; i10 < iM37039l; i10++) {
            interfaceC2156mArr[i10] = ((C5852h.a) c9508c.f32299q[i10]).m23590a();
        }
        for (int i11 = 0; i11 < iM37039l; i11++) {
            interfaceC2156mArr[i11].mo7833g(th);
        }
        if (this.f18310a.m37039l() == 0) {
            return;
        }
        AbstractC6635e.m26320c("uncancelled requests present");
    }

    /* JADX INFO: renamed from: d */
    public final boolean m23527d(final C5852h.a aVar) {
        C6457g c6457g = (C6457g) aVar.m23591b().invoke();
        if (c6457g == null) {
            InterfaceC2156m interfaceC2156mM23590a = aVar.m23590a();
            C4712s.a aVar2 = C4712s.f13928r;
            interfaceC2156mM23590a.resumeWith(C4712s.m18798b(C4700i0.f13910a));
            return false;
        }
        aVar.m23590a().mo7830B(new InterfaceC0184l() { // from class: p.c
            @Override // p010a9.InterfaceC0184l
            /* JADX INFO: renamed from: m */
            public final Object mo27m(Object obj) {
                return C5838d.m23524a(this.f18305q, aVar, (Throwable) obj);
            }
        });
        C2363j c2363jM8592s = AbstractC2368o.m8592s(0, this.f18310a.m37039l());
        int iM8560o = c2363jM8592s.m8560o();
        int iM8561p = c2363jM8592s.m8561p();
        if (iM8560o <= iM8561p) {
            while (true) {
                C6457g c6457g2 = (C6457g) ((C5852h.a) this.f18310a.f32299q[iM8561p]).m23591b().invoke();
                if (c6457g2 != null) {
                    C6457g c6457gM25589r = c6457g.m25589r(c6457g2);
                    if (AbstractC1061t.m3842c(c6457gM25589r, c6457g)) {
                        this.f18310a.m37028a(iM8561p + 1, aVar);
                        return true;
                    }
                    if (!AbstractC1061t.m3842c(c6457gM25589r, c6457g2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int iM37039l = this.f18310a.m37039l() - 1;
                        if (iM37039l <= iM8561p) {
                            while (true) {
                                ((C5852h.a) this.f18310a.f32299q[iM8561p]).m23590a().mo7833g(cancellationException);
                                if (iM37039l == iM8561p) {
                                    break;
                                }
                                iM37039l++;
                            }
                        }
                    }
                }
                if (iM8561p == iM8560o) {
                    break;
                }
                iM8561p--;
            }
        }
        this.f18310a.m37028a(0, aVar);
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final void m23528e() {
        C2363j c2363jM8592s = AbstractC2368o.m8592s(0, this.f18310a.m37039l());
        int iM8560o = c2363jM8592s.m8560o();
        int iM8561p = c2363jM8592s.m8561p();
        if (iM8560o <= iM8561p) {
            while (true) {
                ((C5852h.a) this.f18310a.f32299q[iM8560o]).m23590a().resumeWith(C4712s.m18798b(C4700i0.f13910a));
                if (iM8560o == iM8561p) {
                    break;
                } else {
                    iM8560o++;
                }
            }
        }
        this.f18310a.m37035h();
    }
}
