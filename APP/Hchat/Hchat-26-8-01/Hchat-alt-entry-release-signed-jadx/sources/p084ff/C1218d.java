package p084ff;

import ac.C0058k;
import java.util.List;
import lc.InterfaceC2550a;
import p069f.C0956r;
import p141jf.C2126b;
import p141jf.C2129e;
import p302ud.C4324t;

/* JADX INFO: renamed from: ff.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1218d implements InterfaceC2550a {

    /* JADX INFO: renamed from: g */
    public final List f4083g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1218d(List list) {
        this.f4083g = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // lc.InterfaceC2550a
    public final boolean isEmpty() {
        return this.f4083g.isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // lc.InterfaceC2550a
    /* JADX INFO: renamed from: n */
    public final void mo3354n(C4324t c4324t) {
        for (C1219e c1219e : this.f4083g) {
            C2129e c2129e = c1219e.f4087d;
            int i9 = c2129e.f7097a;
            if (i9 != 0) {
                C0058k c0058k = new C0058k(c1219e, c2129e.f7098b);
                C2126b c2126b = new C2126b(c0058k, new C0956r(c0058k.m356g(), c0058k.m356g()));
                for (int i10 = 0; i10 < i9; i10++) {
                    c4324t.accept(c2126b);
                    c0058k.f176h += 32;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
