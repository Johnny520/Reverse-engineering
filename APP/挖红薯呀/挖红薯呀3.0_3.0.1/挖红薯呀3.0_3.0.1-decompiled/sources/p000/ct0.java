package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class ct0 {

    /* JADX INFO: renamed from: a */
    public final at0 f886a;

    /* JADX INFO: renamed from: b */
    public final boolean f887b;

    /* JADX INFO: renamed from: c */
    public final C0496n2 f888c;

    /* JADX INFO: renamed from: d */
    public final boolean f889d;

    /* JADX INFO: renamed from: e */
    public final Object f890e;

    /* JADX INFO: renamed from: f */
    public boolean f891f = true;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ct0(at0 at0Var, Object obj, boolean z, C0496n2 c0496n2, boolean z2) {
        this.f886a = at0Var;
        this.f887b = z;
        this.f888c = c0496n2;
        this.f889d = z2;
        this.f890e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Object m602a() {
        if (this.f887b) {
            return null;
        }
        Object obj = this.f890e;
        if (obj != null) {
            return obj;
        }
        AbstractC0653qi.m3253b("Unexpected form of a provided value");
        throw new C0725sg();
    }
}
