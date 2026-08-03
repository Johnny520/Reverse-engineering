package p308v1;

import p117i0.C1853l1;
import p339x1.C5602f0;

/* JADX INFO: renamed from: v1.i0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4397i0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f14642a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C4400j0 f14643b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f14644c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4397i0(C4400j0 c4400j0, Object obj, int i9) {
        this.f14642a = i9;
        this.f14643b = c4400j0;
        this.f14644c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public C4376b0 m8841b() {
        C4400j0 c4400j0 = this.f14643b;
        C5602f0 c5602f0 = (C5602f0) c4400j0.f14657p.m2320g(this.f14644c);
        if (c5602f0 != null) {
            return (C4376b0) c4400j0.f14653l.m2320g(c5602f0);
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final boolean m8842c() {
        C1853l1 c1853l1;
        switch (this.f14642a) {
            case 0:
                return true;
            default:
                C4376b0 c4376b0M8841b = m8841b();
                if (c4376b0M8841b == null || (c1853l1 = c4376b0M8841b.f14590f) == null) {
                    return true;
                }
                return c1853l1.m4570c();
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m8840a() {
    }
}
