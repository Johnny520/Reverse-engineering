package p000;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class em0 {

    /* JADX INFO: renamed from: a */
    public static final float[] f2505a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b */
    public static volatile nt2 f2506b = new nt2();

    /* JADX INFO: renamed from: c */
    public static final Object[] f2507c;

    static {
        Object[] objArr = new Object[0];
        f2507c = objArr;
        synchronized (objArr) {
            f2506b.m3407f(115, new fm0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f2506b.m3407f(130, new fm0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f2506b.m3407f(150, new fm0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f2506b.m3407f(180, new fm0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f2506b.m3407f(200, new fm0(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f2506b.f7325h[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        mz0.m3221b("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX INFO: renamed from: a */
    public static dm0 m1365a(float f) {
        float f2;
        dm0 fm0Var;
        float[] fArr = f2505a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        dm0 dm0Var = (dm0) f2506b.m3406d(i);
        if (dm0Var != null) {
            return dm0Var;
        }
        nt2 nt2Var = f2506b;
        int iM4480p = rg3.m4480p(nt2Var.f7325h, nt2Var.f7327j, i);
        if (iM4480p >= 0) {
            return (dm0) f2506b.m3408g(iM4480p);
        }
        int i2 = -(iM4480p + 1);
        int i3 = i2 - 1;
        if (i2 >= f2506b.f7327j) {
            fm0 fm0Var2 = new fm0(new float[]{1.0f}, new float[]{f});
            m1366b(f, fm0Var2);
            return fm0Var2;
        }
        if (i3 < 0) {
            fm0Var = new fm0(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = f2506b.f7325h[i3] / 100.0f;
            fm0Var = (dm0) f2506b.m3408g(i3);
        }
        float f3 = f2506b.f7325h[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        dm0 dm0Var2 = (dm0) f2506b.m3408g(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fMo124b = fm0Var.mo124b(f4);
            fArr2[i4] = ((dm0Var2.mo124b(f4) - fMo124b) * fMax) + fMo124b;
        }
        fm0 fm0Var3 = new fm0(fArr, fArr2);
        m1366b(f, fm0Var3);
        return fm0Var3;
    }

    /* JADX INFO: renamed from: b */
    public static void m1366b(float f, fm0 fm0Var) {
        synchronized (f2507c) {
            nt2 nt2VarM3405a = f2506b.clone();
            nt2VarM3405a.m3407f((int) (f * 100.0f), fm0Var);
            f2506b = nt2VarM3405a;
        }
    }
}
