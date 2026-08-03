package p193n5;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import p000a.AbstractC0000a;
import p046d6.C0709f;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p150k5.C2270u;
import p207o5.AbstractC3058m;
import p207o5.C3057l;
import p228p5.C3327f;
import p228p5.C3328g;
import p228p5.C3329h;
import p239q5.C3440a;
import p312v5.C4478a;
import p327w5.InterfaceC4686a;

/* JADX INFO: renamed from: n5.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2894a extends AbstractC0000a {

    /* JADX INFO: renamed from: j */
    public final C2270u f9350j;

    /* JADX INFO: renamed from: k */
    public final int f9351k;

    /* JADX INFO: renamed from: l */
    public final int f9352l;

    /* JADX INFO: renamed from: m */
    public int f9353m = -1;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2894a(C2270u c2270u, int i9) {
        this.f9350j = c2270u;
        this.f9351k = i9;
        this.f9352l = c2270u.f7554x.m5519b(i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000a.AbstractC0000a, p312v5.InterfaceC4479b
    /* JADX INFO: renamed from: a */
    public final void mo105a() throws C4478a {
        int i9 = this.f9351k;
        if (i9 < 0 || i9 >= this.f9350j.f7554x.size()) {
            throw new C4478a(AbstractC0921a.m2249l(i9, "callsite@"));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e1 */
    public final AbstractC3058m m6294e1() {
        int i9 = this.f9353m;
        C2270u c2270u = this.f9350j;
        if (i9 < 0) {
            this.f9353m = c2270u.f7531a.m583N(this.f9352l);
        }
        int i10 = this.f9353m;
        return i10 == 0 ? AbstractC3058m.f9893a : new C3057l(c2270u, i10);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C2894a)) {
            return false;
        }
        C2894a c2894a = (C2894a) obj;
        return m6296g1().equals(c2894a.m6296g1()) && m6297h1().equals(c2894a.m6297h1()) && m6298i1().equals(c2894a.m6298i1()) && m6295f1().equals(c2894a.m6295f1());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f1 */
    public final List m6295f1() {
        ArrayList arrayList = new ArrayList();
        AbstractC3058m abstractC3058mM6294e1 = m6294e1();
        if (abstractC3058mM6294e1.mo6496a() < 3) {
            throw new C0709f(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        if (abstractC3058mM6294e1.mo6496a() != 3) {
            abstractC3058mM6294e1.mo6499d();
            abstractC3058mM6294e1.mo6499d();
            abstractC3058mM6294e1.mo6499d();
            for (InterfaceC4686a interfaceC4686aMo6497b = abstractC3058mM6294e1.mo6497b(); interfaceC4686aMo6497b != null; interfaceC4686aMo6497b = abstractC3058mM6294e1.mo6497b()) {
                arrayList.add(interfaceC4686aMo6497b);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g1 */
    public final C2896c m6296g1() {
        if (m6294e1().mo6496a() < 3) {
            throw new C0709f(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        InterfaceC4686a interfaceC4686aMo6497b = m6294e1().mo6497b();
        if (interfaceC4686aMo6497b.mo863h() == 22) {
            return ((C3327f) interfaceC4686aMo6497b).m7047a();
        }
        throw new C0709f(null, "Invalid encoded value type (%d) for the first item in call site %d", Integer.valueOf(interfaceC4686aMo6497b.mo863h()), Integer.valueOf(this.f9351k));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getName() {
        return String.format("call_site_%d", Integer.valueOf(this.f9351k));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h1 */
    public final String m6297h1() {
        AbstractC3058m abstractC3058mM6294e1 = m6294e1();
        if (abstractC3058mM6294e1.mo6496a() < 3) {
            throw new C0709f(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        abstractC3058mM6294e1.mo6499d();
        InterfaceC4686a interfaceC4686aMo6497b = abstractC3058mM6294e1.mo6497b();
        if (interfaceC4686aMo6497b.mo863h() == 23) {
            return ((C3329h) interfaceC4686aMo6497b).m7049a();
        }
        throw new C0709f(null, "Invalid encoded value type (%d) for the second item in call site %d", Integer.valueOf(interfaceC4686aMo6497b.mo863h()), Integer.valueOf(this.f9351k));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return m6295f1().hashCode() + ((m6298i1().hashCode() + ((m6297h1().hashCode() + ((m6296g1().hashCode() + (getName().hashCode() * 31)) * 31)) * 31)) * 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public final C2897d m6298i1() {
        AbstractC3058m abstractC3058mM6294e1 = m6294e1();
        if (abstractC3058mM6294e1.mo6496a() < 3) {
            throw new C0709f(null, "Invalid call site item: must contain at least 3 entries.", new Object[0]);
        }
        abstractC3058mM6294e1.mo6499d();
        abstractC3058mM6294e1.mo6499d();
        InterfaceC4686a interfaceC4686aMo6497b = abstractC3058mM6294e1.mo6497b();
        if (interfaceC4686aMo6497b.mo863h() == 21) {
            return ((C3328g) interfaceC4686aMo6497b).m7048a();
        }
        throw new C0709f(null, "Invalid encoded value type (%d) for the second item in call site %d", Integer.valueOf(interfaceC4686aMo6497b.mo863h()), Integer.valueOf(this.f9351k));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringWriter stringWriter = new StringWriter();
        try {
            new C3440a(stringWriter).mo2074c(this);
            return stringWriter.toString();
        } catch (IOException unused) {
            C2104o.m5281f("Unexpected IOException");
            return null;
        }
    }
}
