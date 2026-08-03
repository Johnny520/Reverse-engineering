package p151k6;

import java.io.IOException;
import java.lang.reflect.Array;
import p105h6.AbstractC1622n;
import p105h6.C1614f;
import p208o6.C3066a;

/* JADX INFO: renamed from: k6.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2279b extends AbstractC1622n {

    /* JADX INFO: renamed from: b */
    public static final C2276a f7581b = new C2276a();

    /* JADX INFO: renamed from: a */
    public final C2327y f7582a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2279b(C1614f c1614f, AbstractC1622n abstractC1622n, Class cls) {
        this.f7582a = new C2327y(c1614f, abstractC1622n, cls);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p105h6.AbstractC1622n
    /* JADX INFO: renamed from: b */
    public final void mo4127b(C3066a c3066a, Object obj) throws IOException {
        if (obj == null) {
            c3066a.m6508l();
            return;
        }
        c3066a.m6501b();
        int length = Array.getLength(obj);
        for (int i9 = 0; i9 < length; i9++) {
            this.f7582a.mo4127b(c3066a, Array.get(obj, i9));
        }
        c3066a.m6504g();
    }
}
