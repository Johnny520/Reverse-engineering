package p350xd;

import ae.C0075f;
import ae.C0077h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p000a.AbstractC0000a;
import p081fc.C1203f;
import p082fd.C1212i;
import p128ic.C2036a;
import p140jd.AbstractC2124c;
import p302ud.C4320p;
import p302ud.C4322r;
import p302ud.InterfaceC4312h;
import p302ud.InterfaceC4313i;
import p302ud.InterfaceC4314j;
import p302ud.InterfaceC4318n;
import p351xe.AbstractC5798s;

/* JADX INFO: renamed from: xd.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5779f extends AbstractC5774a implements InterfaceC4313i {

    /* JADX INFO: renamed from: k */
    public final C5775b f23516k;

    /* JADX INFO: renamed from: l */
    public Map f23517l;

    /* JADX INFO: renamed from: m */
    public InterfaceC4314j f23518m;

    /* JADX INFO: renamed from: n */
    public C0077h f23519n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5779f(InterfaceC4318n interfaceC4318n, C5775b c5775b) {
        super(interfaceC4318n);
        this.f23517l = Collections.EMPTY_MAP;
        this.f23516k = c5775b;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: b */
    public final void mo8672b(C1212i c1212i, C1203f c1203f) {
        C4322r c4322r = c1212i.f4061b;
        c1203f.m3271r("try {");
        List list = this.f23519n.f245i;
        String str = AbstractC5798s.f23545a;
        C0075f c0075f = null;
        C4320p c4320pM43W = AbstractC0000a.m43W((InterfaceC4312h) (list.isEmpty() ? null : list.get(0)));
        C2036a.m4989a(c1203f, c4320pM43W);
        AbstractC2124c.m5340a(c1203f, c4322r, c4320pM43W);
        c1212i.m3330v(c1203f, this.f23516k);
        Iterator it = this.f23517l.entrySet().iterator();
        while (it.hasNext()) {
            C0075f c0075f2 = (C0075f) ((Map.Entry) it.next()).getKey();
            if (c0075f2.m444c()) {
                if (c0075f != null) {
                    C1212i.f4073h.mo6254h(c4322r, "Several 'all' handlers in try/catch block in {}");
                }
                c0075f = c0075f2;
            } else {
                c1212i.m3327s(c1203f, c0075f2);
            }
        }
        if (c0075f != null) {
            c1212i.m3327s(c1203f, c0075f);
        }
        InterfaceC4314j interfaceC4314j = this.f23518m;
        if (interfaceC4314j != null) {
            c1203f.m3271r("} finally {");
            c1212i.m3330v(c1203f, interfaceC4314j);
        }
        c1203f.m3270q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: k */
    public final String mo8644k() {
        return this.f23516k.mo8644k();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Try: ");
        sb2.append(this.f23516k);
        if (!this.f23517l.isEmpty()) {
            sb2.append(" catches: ");
            sb2.append(AbstractC5798s.m10516j(this.f23517l.values(), ", "));
        }
        if (this.f23518m != null) {
            sb2.append(" finally: ");
            sb2.append(this.f23518m);
        }
        return sb2.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4318n
    /* JADX INFO: renamed from: u */
    public final List mo8675u() {
        ArrayList arrayList = new ArrayList(this.f23517l.size() + 2);
        arrayList.add(this.f23516k);
        arrayList.addAll(this.f23517l.values());
        InterfaceC4314j interfaceC4314j = this.f23518m;
        if (interfaceC4314j != null) {
            arrayList.add(interfaceC4314j);
        }
        return Collections.unmodifiableList(arrayList);
    }
}
