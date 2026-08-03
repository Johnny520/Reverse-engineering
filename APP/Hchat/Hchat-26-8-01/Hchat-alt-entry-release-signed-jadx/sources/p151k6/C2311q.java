package p151k6;

import java.io.IOException;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p194n6.C2901a;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.q */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2311q extends AbstractC1622n {

    /* JADX INFO: renamed from: b */
    public static final C2309p f7630b = new C2309p(1);

    /* JADX INFO: renamed from: a */
    public final C1614f f7631a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2311q(C1614f c1614f) {
        this.f7631a = c1614f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        if (obj == null) {
            c3066a.m6508l();
            return;
        }
        Class<?> cls = obj.getClass();
        C1614f c1614f = this.f7631a;
        c1614f.getClass();
        AbstractC1622n abstractC1622nM4130b = c1614f.m4130b(new C2901a(cls));
        if (!(abstractC1622nM4130b instanceof C2311q)) {
            abstractC1622nM4130b.mo4127b(c3066a, obj);
        } else {
            c3066a.m6502c();
            c3066a.m6505h();
        }
    }
}
