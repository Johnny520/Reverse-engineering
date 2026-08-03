package p182m7;

import java.util.Iterator;
import p166l7.AbstractC2513a;
import p229p7.C3342l;
import p257r7.C3724n;
import p273s7.C3937f;
import p298u7.C4278a;

/* JADX INFO: renamed from: m7.n */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2801n extends AbstractC2513a implements Iterable {

    /* JADX INFO: renamed from: o */
    public final C3937f f9059o;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2801n() {
        C3342l c3342l = new C3342l();
        super(c3342l, 1);
        C3937f c3937f = new C3937f(C3724n.f12094q, c3342l.f10757r);
        this.f9059o = c3937f;
        m6539P(c3937f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: R */
    public final void mo5906R() {
        C2793f c2793f = (C2793f) m5554v(C2793f.class);
        C4278a c4278a = c2793f != null ? ((C2794g) c2793f.f9062k).f9046o : null;
        if (c4278a == null || c4278a.size() == 0) {
            return;
        }
        c4278a.m8597c0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.f9059o.f9926k.iterator();
    }

    @Override // p166l7.AbstractC2513a
    /* JADX INFO: renamed from: S */
    public final void mo5907S() {
    }
}
