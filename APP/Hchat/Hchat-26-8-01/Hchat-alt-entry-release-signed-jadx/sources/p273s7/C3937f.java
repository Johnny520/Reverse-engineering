package p273s7;

import java.util.Iterator;
import p038ce.C0561n;
import p182m7.C2794g;
import p209o7.C3069c;
import p257r7.C3724n;
import p257r7.C3725o;

/* JADX INFO: renamed from: s7.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3937f extends C3069c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b
    /* JADX INFO: renamed from: d0 */
    public final void mo6520d0(int i9, boolean z9) {
        super.mo6520d0(i9, true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k0 */
    public final void m8130k0() {
        int i9;
        super.m6533e0();
        Iterator itM10866b = this.f9926k.m10866b();
        boolean z9 = false;
        while (itM10866b.hasNext()) {
            C3724n c3724n = (C3724n) itM10866b.next();
            C3725o c3725oM7734N = c3724n.m7734N();
            if (c3725oM7734N != null && (i9 = c3725oM7734N.f7657g) != c3724n.f7657g) {
                m6527T(i9, c3724n);
                z9 = true;
            }
        }
        if (z9) {
            ((C2794g) m5554v(C2794g.class)).f9046o.m8597c0();
        }
        if (z9) {
            super.m6533e0();
        }
        m6534f0(new C0561n(28));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p209o7.C3068b, p152k7.AbstractC2331a
    /* JADX INFO: renamed from: p */
    public final int mo5551p() {
        int size = this.f9926k.size();
        return size != 0 ? ((C3724n) m6524Q(0)).mo5551p() * size : size;
    }
}
