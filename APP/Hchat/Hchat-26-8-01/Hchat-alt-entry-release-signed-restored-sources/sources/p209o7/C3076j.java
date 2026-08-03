package p209o7;

import java.io.IOException;
import java.util.Iterator;
import okio.C3193a;
import p135j7.C2089e;
import p136j8.AbstractC2091b;
import p152k7.AbstractC2331a;
import p152k7.AbstractC2333c;
import p166l7.C2518f;
import p166l7.C2522j;
import p166l7.C2525m;
import p229p7.C3332b;
import p229p7.C3337g;
import p241q7.C3445b;
import p257r7.C3735y;
import p363y7.AbstractC5999a;

/* JADX INFO: renamed from: o7.j */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3076j extends AbstractC2333c implements Iterable, Comparable {

    /* JADX INFO: renamed from: k */
    public final AbstractC2331a[] f9947k;

    /* JADX INFO: renamed from: l */
    public final C2522j f9948l;

    /* JADX INFO: renamed from: m */
    public final C2089e f9949m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3076j() {
        C2522j c2522j = new C2522j(0);
        C2089e c2089e = new C2089e();
        this.f9948l = c2522j;
        this.f9949m = c2089e;
        this.f9947k = new AbstractC2331a[]{c2522j, c2089e};
        c2522j.m5546H(0);
        c2089e.m5546H(1);
        c2522j.m5548J(this);
        c2089e.m5548J(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) throws IOException {
        c3445b.getClass();
        C3332b c3332bM7054T = C3332b.m7054T(c3445b);
        if (c3332bM7054T == null) {
            return;
        }
        int iM7051Q = c3332bM7054T.m7051Q();
        if (iM7051Q == 13) {
            ((C2525m) this.f9949m.m6523P()).m5545G(c3445b);
        } else if (iM7051Q == 14) {
            this.f9948l.m5545G(c3445b);
        } else {
            C3193a.m6821j("Unexpected block: ", c3332bM7054T.toString(), ", Should be: ", AbstractC2091b.m5174u(14));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: L */
    public final AbstractC2331a[] mo5559L() {
        return this.f9947k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(((C3337g) this.f9948l.f8138m).f10739r.get(), ((C3337g) ((C3076j) obj).f9948l.f8138m).f10739r.get());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean isEmpty() {
        C2089e c2089e = this.f9949m;
        c2089e.getClass();
        Iterator itM5558j0 = c2089e.m5558j0(false);
        while (itM5558j0.hasNext()) {
            C2525m c2525m = (C2525m) itM5558j0.next();
            if (c2525m != null && c2525m.f8159o.m8125n0(true).hasNext()) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f9949m.f9926k.iterator();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        C2522j c2522j = this.f9948l;
        sb2.append(AbstractC5999a.m10751n(c2522j.m5924V()));
        sb2.append(" (");
        C2518f c2518f = (C2518f) m5553u(C2518f.class);
        C3735y c3735yM8604c0 = c2518f != null ? c2518f.f8145o.m8604c0(((C3337g) c2522j.f8138m).f10739r.get()) : null;
        if (c3735yM8604c0 != null) {
            sb2.append(c3735yM8604c0.f12101m);
        } else {
            sb2.append("null");
        }
        sb2.append(") config count=");
        sb2.append(this.f9949m.f9926k.size());
        return sb2.toString();
    }

    @Override // p152k7.AbstractC2333c
    /* JADX INFO: renamed from: N */
    public final void mo1891N() {
    }
}
