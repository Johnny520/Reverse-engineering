package l5;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 implements t5.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k5.u f7847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f5.f f7848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7849c;

    public a0(k5.u r1, f5.f r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.f7847a = r1
            r0.f7848b = r2
            r0.f7849c = r3
            return
    }

    @Override // t5.d
    public int c() {
            r1 = this;
            f5.f r0 = r1.f7848b
            int r0 = r0.f3295m
            int r0 = eh.a.c(r0)
            int r0 = r0 / 2
            return r0
    }

    @Override // t5.d
    public final f5.f i() {
            r1 = this;
            f5.f r0 = r1.f7848b
            return r0
    }
}
