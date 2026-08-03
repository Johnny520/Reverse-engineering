package p135j7;

import java.util.Comparator;
import java.util.Iterator;
import p152k7.AbstractC2331a;
import p152k7.AbstractC2332b;
import p166l7.C2522j;
import p166l7.C2525m;
import p209o7.C3076j;
import p229p7.C3332b;
import p229p7.C3337g;
import p229p7.C3341k;
import p241q7.C3445b;

/* JADX INFO: renamed from: j7.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2089e extends AbstractC2332b implements Comparator {

    /* JADX INFO: renamed from: m */
    public byte f6993m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2332b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public final void mo1893B(C3445b c3445b) {
        int i9;
        do {
            c3445b.getClass();
            C3332b c3332bM7054T = C3332b.m7054T(c3445b);
            if (c3332bM7054T == null || c3332bM7054T.m7051Q() != 13) {
                return;
            }
            C3341k c3341kM7056U = C3341k.m7056U(c3445b);
            byte bM5145k0 = m5145k0();
            if (bM5145k0 != 0 && c3341kM7056U.f10751r.get() != bM5145k0) {
                return;
            }
            i9 = c3445b.f11162k;
            ((C2525m) m6523P()).m5545G(c3445b);
        } while (c3445b.f11162k > i9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return ((C2525m) obj).compareTo((C2525m) obj2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final byte m5145k0() {
        byte b10;
        byte bM5924V;
        C3076j c3076j = (C3076j) m5553u(C3076j.class);
        C2522j c2522j = c3076j != null ? c3076j.f9948l : null;
        if (c2522j != null && (bM5924V = c2522j.m5924V()) != 0) {
            return bM5924V;
        }
        byte b11 = this.f6993m;
        if (b11 != 0) {
            return b11;
        }
        for (C2525m c2525m : this.f9926k) {
            if (c2525m != null && (b10 = ((C3341k) c2525m.f8138m).f10751r.f12076k[0]) != 0) {
                if (c2522j != null) {
                    ((C3337g) c2522j.f8138m).f10739r.m7719P(b10);
                    C3076j c3076j2 = (C3076j) c2522j.m5553u(C3076j.class);
                    C2089e c2089e = c3076j2 != null ? c3076j2.f9949m : null;
                    c2089e.f6993m = b10;
                    Iterator it = c2089e.f9926k.iterator();
                    while (it.hasNext()) {
                        ((C3341k) ((C2525m) it.next()).f8138m).f10751r.m7719P(b10);
                    }
                }
                this.f6993m = b10;
                return b10;
            }
        }
        return (byte) 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2334d
    /* JADX INFO: renamed from: n */
    public final AbstractC2331a mo1892n() {
        byte bM5145k0 = m5145k0();
        C2525m c2525m = new C2525m();
        ((C3341k) c2525m.f8138m).f10751r.m7719P(bM5145k0);
        return c2525m;
    }

    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: X */
    public final void mo5141X() {
    }
}
