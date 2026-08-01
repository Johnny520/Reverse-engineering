package p136j3;

/* JADX INFO: renamed from: j3.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3593d {

    /* JADX INFO: renamed from: a */
    public static final C3593d f9988a = new C3593d();

    /* JADX INFO: renamed from: a */
    public final float m13445a(float f10, float f11, float f12, float f13, float f14) {
        return m13446b(f10, f11, Math.max(0.0f, Math.min(1.0f, m13447c(f12, f13, f14))));
    }

    /* JADX INFO: renamed from: b */
    public final float m13446b(float f10, float f11, float f12) {
        return f10 + ((f11 - f10) * f12);
    }

    /* JADX INFO: renamed from: c */
    public final float m13447c(float f10, float f11, float f12) {
        if (f10 == f11) {
            return 0.0f;
        }
        return (f12 - f10) / (f11 - f10);
    }
}
