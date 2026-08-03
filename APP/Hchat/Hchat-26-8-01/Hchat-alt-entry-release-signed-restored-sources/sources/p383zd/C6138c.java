package p383zd;

import androidx.lifecycle.C0119x;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import md.C2825b;
import p000a.AbstractC0000a;
import p012ah.C0086a;
import p068eh.AbstractC0921a;
import p081fc.C1203f;
import p082fd.C1206c;
import p082fd.C1210g;
import p082fd.C1211h;
import p082fd.C1212i;
import p082fd.EnumC1207d;
import p092g4.AbstractC1341a;
import p128ic.C2036a;
import p140jd.AbstractC2124c;
import p199nd.C2988t;
import p199nd.C2989u;
import p233pd.C3398i;
import p246qd.C3507k;
import p302ud.C4305a;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4314j;
import p350xd.C5775b;
import p351xe.C5784e;
import p369yd.AbstractC6027a;
import p369yd.C6028b;

/* JADX INFO: renamed from: zd.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C6138c extends AbstractC6027a {

    /* JADX INFO: renamed from: m */
    public final C2988t f24724m;

    /* JADX INFO: renamed from: n */
    public final boolean f24725n;

    /* JADX INFO: renamed from: o */
    public final C4305a f24726o;

    /* JADX INFO: renamed from: p */
    public C4305a f24727p;

    /* JADX INFO: renamed from: q */
    public C5775b f24728q;

    /* JADX INFO: renamed from: r */
    public AbstractC1341a f24729r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C6138c(C5775b c5775b, C2988t c2988t, C4305a c4305a, boolean z9) {
        super(c5775b);
        this.f24724m = c2988t;
        this.f24726o = c4305a;
        this.f24725n = z9;
        if (c4305a != null) {
            C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a);
            this.f24475k = c4320pM57c0 == null ? null : new C6028b(new C5784e((C3398i) c4320pM57c0));
            this.f24476l = Collections.singletonList(c4305a);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: b */
    public final void mo8672b(C1212i c1212i, C1203f c1203f) {
        C1210g c1210g = c1212i.f4060a;
        C4322r c4322r = c1212i.f4061b;
        C4305a c4305a = this.f24726o;
        C4320p c4320pM57c0 = AbstractC0000a.m57c0(c4305a);
        int iM10789H = c4320pM57c0 == null ? 0 : c4320pM57c0.f9752i;
        if (iM10789H == 0) {
            iM10789H = m10789H();
        }
        c1203f.m3272s(iM10789H);
        C2989u c2989u = (C2989u) this.f24724m.f9755a.f9217g.mo6237c(C2825b.f9180G);
        if (c2989u != null) {
            C1211h c1211h = c1210g.f4070d;
            c1211h.getClass();
            String strM2249l = AbstractC0921a.m2249l(c2989u.f9760g.f9758d, "loop");
            ((HashSet) c1211h.f4072h).add(strM2249l);
            c1203f.mo3255e(strM2249l).mo3255e(": ");
        }
        C6028b c6028b = this.f24475k;
        if (c6028b == null) {
            c1203f.mo3255e("while (true) {");
            c1212i.m3330v(c1203f, this.f24728q);
            c1203f.m3270q();
            return;
        }
        C4320p c4320pM10794I = c6028b.m10794I();
        C2036a.m4989a(c1203f, c4320pM10794I);
        C1206c c1206c = new C1206c(c1210g, c1212i.f4063d);
        AbstractC1341a abstractC1341a = this.f24729r;
        if (abstractC1341a == null) {
            if (!this.f24725n) {
                c1203f.mo3255e("while (");
                c1206c.m3294r(c1203f, new C0119x(12), c6028b);
                c1203f.mo3255e(") {");
                AbstractC2124c.m5340a(c1203f, c4322r, c4320pM10794I);
                c1212i.m3330v(c1203f, this.f24728q);
                c1203f.m3270q();
                return;
            }
            c1203f.mo3255e("do {");
            AbstractC2124c.m5340a(c1203f, c4322r, c4320pM10794I);
            c1212i.m3330v(c1203f, this.f24728q);
            C4320p c4320pM57c02 = AbstractC0000a.m57c0(c4305a);
            int iM10789H2 = c4320pM57c02 != null ? c4320pM57c02.f9752i : 0;
            if (iM10789H2 == 0) {
                iM10789H2 = m10789H();
            }
            c1203f.m3272s(iM10789H2);
            c1203f.mo3255e("} while (");
            c1206c.m3294r(c1203f, new C0119x(12), c6028b);
            c1203f.mo3255e(");");
            return;
        }
        if (abstractC1341a instanceof C6137b) {
            C6137b c6137b = (C6137b) abstractC1341a;
            c1203f.mo3255e("for (");
            C4320p c4320p = c6137b.f24722a;
            EnumC1207d enumC1207d = EnumC1207d.f4055i;
            c1212i.m3306j(c4320p, c1203f, enumC1207d);
            c1203f.mo3255e("; ");
            c1206c.m3294r(c1203f, new C0119x(12), c6028b);
            c1203f.mo3255e("; ");
            c1212i.m3306j(c6137b.f24723b, c1203f, enumC1207d);
            c1203f.mo3255e(") {");
            AbstractC2124c.m5340a(c1203f, c4322r, c4320pM10794I);
            c1212i.m3330v(c1203f, this.f24728q);
            c1203f.m3270q();
            return;
        }
        if (!(abstractC1341a instanceof C6136a)) {
            C0086a.m452k("Unknown loop type: ".concat(String.valueOf(abstractC1341a.getClass())));
            return;
        }
        C6136a c6136a = (C6136a) abstractC1341a;
        c1203f.mo3255e("for (");
        C3507k c3507kM7398b = c6136a.f24720a.f14397l.f11440m.m7398b();
        if (c3507kM7398b.f11414d) {
            c1203f.mo3255e("final ");
        }
        c1212i.m3312q(c1203f, c3507kM7398b.f11412b);
        c1203f.mo3254d(' ');
        c1212i.m3300d(c1203f, c3507kM7398b);
        c1203f.mo3255e(" : ");
        c1212i.m3298b(c1203f, c6136a.f24721b.mo7179S(0), false);
        c1203f.mo3255e(") {");
        AbstractC2124c.m5340a(c1203f, c4322r, c4320pM10794I);
        c1212i.m3330v(c1203f, this.f24728q);
        c1203f.m3270q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: k */
    public final String mo8644k() {
        C5775b c5775b = this.f24728q;
        return c5775b == null ? "-" : c5775b.mo8644k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p350xd.AbstractC5774a, p302ud.InterfaceC4318n
    /* JADX INFO: renamed from: l */
    public final boolean mo8674l(InterfaceC4314j interfaceC4314j, InterfaceC4314j interfaceC4314j2) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "LOOP:" + this.f24724m.f9758d + ": " + mo8644k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4318n
    /* JADX INFO: renamed from: u */
    public final List mo8675u() {
        ArrayList arrayList = new ArrayList(this.f24476l.size() + 2);
        C4305a c4305a = this.f24727p;
        if (c4305a != null) {
            arrayList.add(c4305a);
        }
        arrayList.addAll(this.f24476l);
        C5775b c5775b = this.f24728q;
        if (c5775b != null) {
            arrayList.add(c5775b);
        }
        return arrayList;
    }
}
