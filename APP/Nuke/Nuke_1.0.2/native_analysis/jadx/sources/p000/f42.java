package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class f42 {

    /* JADX INFO: renamed from: a */
    public final e42 f2787a;

    /* JADX INFO: renamed from: b */
    public final boolean f2788b;

    /* JADX INFO: renamed from: c */
    public final ks2 f2789c;

    /* JADX INFO: renamed from: d */
    public final boolean f2790d;

    /* JADX INFO: renamed from: e */
    public final Object f2791e;

    /* JADX INFO: renamed from: f */
    public boolean f2792f = true;

    public f42(e42 e42Var, Object obj, boolean z, ks2 ks2Var, boolean z2) {
        this.f2787a = e42Var;
        this.f2788b = z;
        this.f2789c = ks2Var;
        this.f2790d = z2;
        this.f2791e = obj;
    }

    /* JADX INFO: renamed from: a */
    public final Object m1504a() {
        if (this.f2788b) {
            return null;
        }
        Object obj = this.f2791e;
        if (obj != null) {
            return obj;
        }
        AbstractC0752tx.m5444b("Unexpected form of a provided value");
        C0676s.m4644b();
        return null;
    }
}
