package p159f1;

import p153e1.AbstractC2013i;
import p186k.C2418O;
import p192l.AbstractC2477a;

/* JADX INFO: renamed from: f1.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2096b {

    /* JADX INFO: renamed from: a */
    public static final float[] f7022a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};

    /* JADX INFO: renamed from: b */
    public static volatile C2418O f7023b = new C2418O();

    /* JADX INFO: renamed from: c */
    public static final Object[] f7024c;

    static {
        Object[] objArr = new Object[0];
        f7024c = objArr;
        synchronized (objArr) {
            f7023b.m4312h((int) 115.0f, new C2097c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            f7023b.m4312h((int) 130.0f, new C2097c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            f7023b.m4312h((int) 150.0f, new C2097c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            f7023b.m4312h((int) 180.0f, new C2097c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            f7023b.m4312h((int) 200.0f, new C2097c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((f7023b.f7821d[0] / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        AbstractC2013i.m3699b("You should only apply non-linear scaling to font scales > 1");
    }

    /* JADX INFO: renamed from: a */
    public static InterfaceC2095a m3873a(float f2) {
        float f5;
        InterfaceC2095a c2097c;
        float[] fArr = f7022a;
        if (f2 < 1.03f) {
            return null;
        }
        int i5 = (int) (f2 * 100.0f);
        InterfaceC2095a interfaceC2095a = (InterfaceC2095a) f7023b.m4311g(i5);
        if (interfaceC2095a != null) {
            return interfaceC2095a;
        }
        C2418O c2418o = f7023b;
        int iM4420a = AbstractC2477a.m4420a(c2418o.f7821d, c2418o.f7823f, i5);
        if (iM4420a >= 0) {
            return (InterfaceC2095a) f7023b.m4313i(iM4420a);
        }
        int i6 = -(iM4420a + 1);
        int i7 = i6 - 1;
        if (i6 >= f7023b.f7823f) {
            C2097c c2097c2 = new C2097c(new float[]{1.0f}, new float[]{f2});
            m3874b(f2, c2097c2);
            return c2097c2;
        }
        if (i7 < 0) {
            c2097c = new C2097c(fArr, fArr);
            f5 = 1.0f;
        } else {
            f5 = f7023b.f7821d[i7] / 100.0f;
            c2097c = (InterfaceC2095a) f7023b.m4313i(i7);
        }
        float f6 = f7023b.f7821d[i6] / 100.0f;
        float fMax = (Math.max(0.0f, Math.min(1.0f, f5 == f6 ? 0.0f : (f2 - f5) / (f6 - f5))) * 1.0f) + 0.0f;
        InterfaceC2095a interfaceC2095a2 = (InterfaceC2095a) f7023b.m4313i(i6);
        float[] fArr2 = new float[9];
        for (int i8 = 0; i8 < 9; i8++) {
            float f7 = fArr[i8];
            float fMo3707b = c2097c.mo3707b(f7);
            fArr2[i8] = ((interfaceC2095a2.mo3707b(f7) - fMo3707b) * fMax) + fMo3707b;
        }
        C2097c c2097c3 = new C2097c(fArr, fArr2);
        m3874b(f2, c2097c3);
        return c2097c3;
    }

    /* JADX INFO: renamed from: b */
    public static void m3874b(float f2, C2097c c2097c) {
        synchronized (f7024c) {
            C2418O c2418oM4309a = f7023b.clone();
            c2418oM4309a.m4312h((int) (f2 * 100.0f), c2097c);
            f7023b = c2418oM4309a;
        }
    }
}
