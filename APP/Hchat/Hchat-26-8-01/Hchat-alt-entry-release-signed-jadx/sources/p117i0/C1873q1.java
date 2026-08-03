package p117i0;

import okio.C3193a;

/* JADX INFO: renamed from: i0.q1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1873q1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC1869p1 f6225a;

    /* JADX INFO: renamed from: b */
    public final boolean f6226b;

    /* JADX INFO: renamed from: c */
    public final C1823e f6227c;

    /* JADX INFO: renamed from: d */
    public final boolean f6228d;

    /* JADX INFO: renamed from: e */
    public final Object f6229e;

    /* JADX INFO: renamed from: f */
    public boolean f6230f = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1873q1(AbstractC1869p1 abstractC1869p1, Object obj, boolean z9, C1823e c1823e, boolean z10) {
        this.f6225a = abstractC1869p1;
        this.f6226b = z9;
        this.f6227c = c1823e;
        this.f6228d = z10;
        this.f6229e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m4614a() {
        if (this.f6226b) {
            return null;
        }
        Object obj = this.f6229e;
        if (obj != null) {
            return obj;
        }
        AbstractC1855m.m4574b("Unexpected form of a provided value");
        C3193a.m6814c();
        return null;
    }
}
