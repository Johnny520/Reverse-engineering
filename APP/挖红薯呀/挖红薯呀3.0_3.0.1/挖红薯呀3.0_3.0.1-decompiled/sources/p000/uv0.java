package p000;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uv0 {

    /* JADX INFO: renamed from: a */
    public static final C0174ej f6312a = new C0174ej(new us0(4));

    /* JADX INFO: renamed from: b */
    public static final wv0 f6313b;

    /* JADX INFO: renamed from: c */
    public static final wv0 f6314c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        long j = C0207ff.f1707g;
        f6313b = new wv0(true, Float.NaN, j);
        f6314c = new wv0(false, Float.NaN, j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static wv0 m4359a(float f, int i) {
        boolean z = (i & 1) != 0;
        if ((i & 2) != 0) {
            f = Float.NaN;
        }
        long j = C0207ff.f1707g;
        return (C0520np.m2732b(f, Float.NaN) && C0207ff.m1094c(j, j)) ? z ? f6313b : f6314c : new wv0(z, f, j);
    }
}
