package p350xd;

import java.util.ArrayList;
import java.util.List;
import p081fc.C1203f;
import p082fd.C1212i;
import p128ic.C2036a;
import p140jd.AbstractC2124c;
import p302ud.C4320p;

/* JADX INFO: renamed from: xd.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5778e extends AbstractC5774a {

    /* JADX INFO: renamed from: k */
    public final C4320p f23513k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f23514l;

    /* JADX INFO: renamed from: m */
    public final C5775b f23515m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5778e(C5775b c5775b, C4320p c4320p) {
        super(c5775b);
        this.f23514l = new ArrayList();
        this.f23513k = c4320p;
        this.f23515m = new C5775b(this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: b */
    public final void mo8672b(C1212i c1212i, C1203f c1203f) {
        c1203f.m3271r("synchronized (");
        C4320p c4320p = this.f23513k;
        c1212i.m3298b(c1203f, c4320p.mo7179S(0), true);
        c1203f.mo3255e(") {");
        C2036a.m4989a(c1203f, c4320p);
        AbstractC2124c.m5340a(c1203f, c1212i.f4061b, c4320p);
        c1212i.m3330v(c1203f, this.f23515m);
        c1203f.m3270q();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4314j
    /* JADX INFO: renamed from: k */
    public final String mo8644k() {
        return Integer.toHexString(this.f23513k.f14399n);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "Synchronized:".concat(String.valueOf(this.f23515m));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p302ud.InterfaceC4318n
    /* JADX INFO: renamed from: u */
    public final List mo8675u() {
        return this.f23515m.f23507k;
    }
}
