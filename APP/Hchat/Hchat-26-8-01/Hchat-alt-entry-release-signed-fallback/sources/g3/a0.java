package g3;

/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final android.view.animation.Interpolator f4182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4183d;

    public a0(int r1, android.view.animation.Interpolator r2, long r3) {
            r0 = this;
            r0.<init>()
            r0.f4180a = r1
            r0.f4182c = r2
            r0.f4183d = r3
            return
    }

    public float a() {
            r1 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            return r0
    }

    public long b() {
            r2 = this;
            long r0 = r2.f4183d
            return r0
    }

    public float c() {
            r2 = this;
            float r0 = r2.f4181b
            android.view.animation.Interpolator r1 = r2.f4182c
            if (r1 == 0) goto La
            float r0 = r1.getInterpolation(r0)
        La:
            return r0
    }

    public int d() {
            r1 = this;
            int r0 = r1.f4180a
            return r0
    }

    public void e(float r1) {
            r0 = this;
            r0.f4181b = r1
            return
    }
}
