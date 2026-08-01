package p000;

/* JADX INFO: renamed from: vv */
/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0866vv {

    /* JADX INFO: renamed from: a */
    public static final float[] f6826a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b */
    public static volatile l31 f6827b = new l31();

    /* JADX INFO: renamed from: c */
    public static final Object[] f6828c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Object[] objArr = new Object[0];
        f6828c = objArr;
        synchronized (objArr) {
            f6827b.m1974c(115, new C0903wv(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f6827b.m1974c(130, new C0903wv(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f6827b.m1974c(150, new C0903wv(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f6827b.m1974c(180, new C0903wv(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f6827b.m1974c(200, new C0903wv(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f6827b.f3334d[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        y10.m5198b("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static InterfaceC0817uv m4791a(float f) {
        float f2;
        InterfaceC0817uv c0903wv;
        float[] fArr = f6826a;
        if (f < 1.03f) {
            return null;
        }
        int i = (int) (f * 100.0f);
        InterfaceC0817uv interfaceC0817uv = (InterfaceC0817uv) f6827b.m1973b(i);
        if (interfaceC0817uv != null) {
            return interfaceC0817uv;
        }
        l31 l31Var = f6827b;
        int iM2770j = o30.m2770j(l31Var.f3334d, l31Var.f3336f, i);
        if (iM2770j >= 0) {
            return (InterfaceC0817uv) f6827b.m1975d(iM2770j);
        }
        int i2 = -(iM2770j + 1);
        int i3 = i2 - 1;
        if (i2 >= f6827b.f3336f) {
            C0903wv c0903wv2 = new C0903wv(new float[]{1.0f}, new float[]{f});
            m4792b(f, c0903wv2);
            return c0903wv2;
        }
        if (i3 < 0) {
            c0903wv = new C0903wv(fArr, fArr);
            f2 = 1.0f;
        } else {
            f2 = f6827b.f3334d[i3] / 100.0f;
            c0903wv = (InterfaceC0817uv) f6827b.m1975d(i3);
        }
        float f3 = f6827b.f3334d[i2] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f2 == f3 ? 0.0f : (f - f2) / (f3 - f2))) * 1.0f) + 0.0f;
        InterfaceC0817uv interfaceC0817uv2 = (InterfaceC0817uv) f6827b.m1975d(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f4 = fArr[i4];
            float fMo2686b = c0903wv.mo2686b(f4);
            fArr2[i4] = ((interfaceC0817uv2.mo2686b(f4) - fMo2686b) * fMax) + fMo2686b;
        }
        C0903wv c0903wv3 = new C0903wv(fArr, fArr2);
        m4792b(f, c0903wv3);
        return c0903wv3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m4792b(float f, C0903wv c0903wv) {
        synchronized (f6828c) {
            l31 l31VarM1972a = f6827b.clone();
            l31VarM1972a.m1974c((int) (f * 100.0f), c0903wv);
            f6827b = l31VarM1972a;
        }
    }
}
