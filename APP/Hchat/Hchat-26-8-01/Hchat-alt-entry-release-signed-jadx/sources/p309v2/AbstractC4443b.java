package p309v2;

import p069f.C0961t0;
import p087g.AbstractC1256a;
import p293u2.AbstractC4239i;

/* JADX INFO: renamed from: v2.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4443b {

    /* JADX INFO: renamed from: a */
    public static final float[] f14751a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b */
    public static volatile C0961t0 f14752b = new C0961t0();

    /* JADX INFO: renamed from: c */
    public static final Object[] f14753c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        Object[] objArr = new Object[0];
        f14753c = objArr;
        synchronized (objArr) {
            f14752b.m2361c((int) 115.0f, new C4444c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f14752b.m2361c((int) 130.0f, new C4444c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f14752b.m2361c((int) 150.0f, new C4444c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f14752b.m2361c((int) 180.0f, new C4444c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f14752b.m2361c((int) 200.0f, new C4444c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f14752b.f3024g[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        AbstractC4239i.m8526b("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static InterfaceC4442a m8893a(float f3) {
        float f10;
        InterfaceC4442a c4444c;
        float[] fArr = f14751a;
        if (f3 < 1.03f) {
            return null;
        }
        int i9 = (int) (f3 * 100.0f);
        InterfaceC4442a interfaceC4442a = (InterfaceC4442a) f14752b.m2360b(i9);
        if (interfaceC4442a != null) {
            return interfaceC4442a;
        }
        C0961t0 c0961t0 = f14752b;
        int iM3379a = AbstractC1256a.m3379a(c0961t0.f3024g, c0961t0.f3026i, i9);
        if (iM3379a >= 0) {
            return (InterfaceC4442a) f14752b.m2362d(iM3379a);
        }
        int i10 = -(iM3379a + 1);
        int i11 = i10 - 1;
        if (i10 >= f14752b.f3026i) {
            C4444c c4444c2 = new C4444c(new float[]{1.0f}, new float[]{f3});
            m8894b(f3, c4444c2);
            return c4444c2;
        }
        if (i11 < 0) {
            c4444c = new C4444c(fArr, fArr);
            f10 = 1.0f;
        } else {
            f10 = f14752b.f3024g[i11] / 100.0f;
            c4444c = (InterfaceC4442a) f14752b.m2362d(i11);
        }
        float f11 = f14752b.f3024g[i10] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f10 == f11 ? 0.0f : (f3 - f10) / (f11 - f10))) * 1.0f) + 0.0f;
        InterfaceC4442a interfaceC4442a2 = (InterfaceC4442a) f14752b.m2362d(i10);
        float[] fArr2 = new float[9];
        for (int i12 = 0; i12 < 9; i12++) {
            float f12 = fArr[i12];
            float fMo8537b = c4444c.mo8537b(f12);
            fArr2[i12] = ((interfaceC4442a2.mo8537b(f12) - fMo8537b) * fMax) + fMo8537b;
        }
        C4444c c4444c3 = new C4444c(fArr, fArr2);
        m8894b(f3, c4444c3);
        return c4444c3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m8894b(float f3, C4444c c4444c) {
        synchronized (f14753c) {
            C0961t0 c0961t0M2359a = f14752b.clone();
            c0961t0M2359a.m2361c((int) (f3 * 100.0f), c4444c);
            f14752b = c0961t0M2359a;
        }
    }
}
