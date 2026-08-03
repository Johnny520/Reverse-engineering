package p298u7;

import bsh.C0353j;
import p136j8.C2104o;
import p182m7.C2793f;
import p182m7.C2794g;
import p182m7.C2801n;
import p257r7.AbstractC3729s;
import p257r7.C3724n;
import p257r7.C3725o;
import p273s7.C3937f;
import p273s7.C3938g;

/* JADX INFO: renamed from: u7.a */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4278a extends AbstractC4280c {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p298u7.AbstractC4280c, p152k7.AbstractC2333c
    /* JADX INFO: renamed from: M */
    public final void mo5560M() {
        m8599U();
        m8599U();
        this.f14196p.m8131m0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p298u7.AbstractC4280c, p166l7.AbstractC2513a
    /* JADX INFO: renamed from: R */
    public final void mo5906R() {
        super.mo5906R();
        m8597c0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p298u7.AbstractC4280c
    /* JADX INFO: renamed from: Y */
    public final void mo8595Y(int i9, AbstractC3729s abstractC3729s) {
        C2793f c2793f = (C2793f) m5554v(C2793f.class);
        C3937f c3937f = (c2793f != null ? ((C2794g) c2793f.f9062k).f9047p : null).f9059o;
        if (i9 < c3937f.f9926k.size() - 1) {
            c3937f.m6522O(i9);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p298u7.AbstractC4280c
    /* JADX INFO: renamed from: Z */
    public final void mo8596Z() {
        super.mo8596Z();
        C2793f c2793f = (C2793f) m5554v(C2793f.class);
        (c2793f != null ? ((C2794g) c2793f.f9062k).f9047p : null).f9059o.m8130k0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c0 */
    public final void m8597c0() {
        C2793f c2793f = (C2793f) m5554v(C2793f.class);
        C2801n c2801n = c2793f != null ? ((C2794g) c2793f.f9062k).f9047p : null;
        if (c2801n == null) {
            return;
        }
        C3937f c3937f = c2801n.f9059o;
        int size = c3937f.f9926k.size();
        C3938g c3938g = this.f14196p;
        int size2 = c3938g.f9926k.size();
        if (size >= size2) {
            size = size2;
        }
        for (int i9 = 0; i9 < size; i9++) {
            C3725o c3725o = (C3725o) c3938g.m6524Q(i9);
            C3724n c3724n = (C3724n) c3937f.m6524Q(i9);
            if (c3724n == null) {
                c3725o.getClass();
                C0353j.m1305c("Can not link null id item");
                return;
            }
            C3724n c3724n2 = c3725o.f12097t;
            if (c3724n2 != c3724n) {
                if (c3724n2 != null) {
                    C2104o.m5276A("Resource id string item is already linked");
                    return;
                } else {
                    c3725o.f12097t = c3724n;
                    c3724n.f12096p = c3725o;
                }
            }
        }
    }
}
