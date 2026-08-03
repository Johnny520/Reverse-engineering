package p350xd;

import af.C0084g;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import me.C2833a;
import mh.InterfaceC2844b;
import p000a.AbstractC0000a;
import p081fc.C1203f;
import p082fd.AbstractC1213j;
import p082fd.C1212i;
import p128ic.C2036a;
import p140jd.AbstractC2124c;
import p215od.C3130c;
import p233pd.C3408s;
import p246qd.AbstractC3506j;
import p246qd.AbstractC3508l;
import p302ud.C4305a;
import p302ud.C4311g;
import p302ud.C4322r;
import p302ud.InterfaceC4313i;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p304uf.C4330d;
import p332wb.AbstractC4855en;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: xd.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5777d extends AbstractC5774a implements InterfaceC4313i {

    /* JADX INFO: renamed from: m */
    public static final C4330d f23510m = new C4330d(7);

    /* JADX INFO: renamed from: k */
    public final C4305a f23511k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f23512l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5777d(InterfaceC4318n interfaceC4318n, C4305a c4305a) {
        super(interfaceC4318n);
        this.f23511k = c4305a;
        this.f23512l = new ArrayList();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: b */
    public final void mo8672b(C1212i c1212i, C1203f c1203f) {
        C3408s c3408s = (C3408s) AbstractC0000a.m57c0(this.f23511k);
        Objects.requireNonNull(c3408s, "Switch insn not found in header");
        AbstractC3508l abstractC3508lMo7179S = c3408s.mo7179S(0);
        c1203f.m3271r("switch (");
        c1212i.m3298b(c1203f, abstractC3508lMo7179S, false);
        c1203f.mo3255e(") {");
        C2036a.m4989a(c1203f, c3408s);
        C4322r c4322r = c1212i.f4061b;
        AbstractC2124c.m5340a(c1203f, c4322r, c3408s);
        c1203f.m3268o();
        for (C5776c c5776c : this.f23512l) {
            List list = c5776c.f23508a;
            InterfaceC4314j interfaceC4314j = c5776c.f23509b;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next == f23510m) {
                    c1203f.m3271r("default:");
                } else {
                    c1203f.m3271r("case ");
                    if (next instanceof C4311g) {
                        C4311g c4311g = (C4311g) next;
                        c1212i.m3331w(c1203f, c4311g.f14390l, c4311g);
                    } else if (next instanceof C3130c) {
                        c1212i.m3331w(c1203f, (C3130c) next, null);
                    } else if (next instanceof Integer) {
                        long jIntValue = ((Integer) next).intValue();
                        AbstractC3506j abstractC3506jMo7375I = abstractC3508lMo7179S.mo7375I();
                        boolean z9 = c1212i.f4063d;
                        InterfaceC2844b interfaceC2844b = AbstractC1213j.f4074a;
                        c1203f.mo3255e(AbstractC1213j.m3332a(jIntValue, abstractC3506jMo7375I, c4322r.mo8668n().f14437c, z9, false));
                    } else {
                        if (!(next instanceof String)) {
                            throw new C0084g("Unexpected key in switch: ".concat(String.valueOf(next != null ? next.getClass() : null)));
                        }
                        c1203f.mo3254d('\"').mo3255e((String) next).mo3254d('\"');
                    }
                    c1203f.mo3254d(':');
                }
            }
            c1212i.m3330v(c1203f, interfaceC4314j);
        }
        c1203f.m3267n();
        c1203f.m3270q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p350xd.AbstractC5774a, p302ud.InterfaceC4313i
    /* JADX INFO: renamed from: i */
    public final List mo8673i() {
        return Collections.unmodifiableList(AbstractC5798s.m10509c(this.f23512l, new C2833a(24)));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: k */
    public final String mo8644k() {
        return AbstractC4855en.m9263g("SW:", Integer.toString(this.f23511k.f14348i));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Switch: ");
        sb2.append(Integer.toString(this.f23511k.f14348i));
        for (C5776c c5776c : this.f23512l) {
            List listM10509c = AbstractC5798s.m10509c(c5776c.f23508a, new C2833a(25));
            sb2.append("\n case ");
            sb2.append(AbstractC5798s.m10516j(listM10509c, ", "));
            sb2.append(" -> ");
            sb2.append(c5776c.f23509b);
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4318n
    /* JADX INFO: renamed from: u */
    public final List mo8675u() {
        ArrayList arrayList = this.f23512l;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
        arrayList2.add(this.f23511k);
        arrayList2.addAll(AbstractC5798s.m10509c(arrayList, new C2833a(24)));
        return Collections.unmodifiableList(arrayList2);
    }
}
