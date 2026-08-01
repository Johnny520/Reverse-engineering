package p136j3;

import p117i.C3062i1;
import p121i3.AbstractC3184n;
import p172l8.C4700i0;

/* JADX INFO: renamed from: j3.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3591b {

    /* JADX INFO: renamed from: a */
    public static final C3591b f9979a;

    /* JADX INFO: renamed from: b */
    public static final float[] f9980b;

    /* JADX INFO: renamed from: c */
    public static volatile C3062i1 f9981c;

    /* JADX INFO: renamed from: d */
    public static final Object[] f9982d;

    /* JADX INFO: renamed from: e */
    public static final int f9983e;

    static {
        C3591b c3591b = new C3591b();
        f9979a = c3591b;
        f9980b = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        f9981c = new C3062i1(0, 1, null);
        Object[] objArr = new Object[0];
        f9982d = objArr;
        synchronized (objArr) {
            c3591b.m13442h(f9981c, 1.15f, new C3592c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            c3591b.m13442h(f9981c, 1.3f, new C3592c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            c3591b.m13442h(f9981c, 1.5f, new C3592c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            c3591b.m13442h(f9981c, 1.8f, new C3592c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            c3591b.m13442h(f9981c, 2.0f, new C3592c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
        if (!(c3591b.m13439e(f9981c.m11356f(0)) - 0.01f > 1.03f)) {
            AbstractC3184n.m12040b("You should only apply non-linear scaling to font scales > 1");
        }
        f9983e = 8;
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC3590a m13435a(InterfaceC3590a interfaceC3590a, InterfaceC3590a interfaceC3590a2, float f10) {
        float[] fArr = f9980b;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            float f11 = f9980b[i10];
            fArr2[i10] = C3593d.f9988a.m13446b(interfaceC3590a.mo12095b(f11), interfaceC3590a2.mo12095b(f11), f10);
        }
        return new C3592c(f9980b, fArr2);
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC3590a m13436b(float f10) {
        InterfaceC3590a c3592c;
        if (!m13440f(f10)) {
            return null;
        }
        InterfaceC3590a interfaceC3590aM13437c = f9979a.m13437c(f10);
        if (interfaceC3590aM13437c != null) {
            return interfaceC3590aM13437c;
        }
        int iM11355d = f9981c.m11355d(m13438d(f10));
        if (iM11355d >= 0) {
            return (InterfaceC3590a) f9981c.m11359i(iM11355d);
        }
        int i10 = -(iM11355d + 1);
        int i11 = i10 - 1;
        float fM13439e = 1.0f;
        if (i10 >= f9981c.m11358h()) {
            C3592c c3592c2 = new C3592c(new float[]{1.0f}, new float[]{f10});
            m13441g(f10, c3592c2);
            return c3592c2;
        }
        if (i11 < 0) {
            float[] fArr = f9980b;
            c3592c = new C3592c(fArr, fArr);
        } else {
            fM13439e = m13439e(f9981c.m11356f(i11));
            c3592c = (InterfaceC3590a) f9981c.m11359i(i11);
        }
        InterfaceC3590a interfaceC3590aM13435a = m13435a(c3592c, (InterfaceC3590a) f9981c.m11359i(i10), C3593d.f9988a.m13445a(0.0f, 1.0f, fM13439e, m13439e(f9981c.m11356f(i10)), f10));
        m13441g(f10, interfaceC3590aM13435a);
        return interfaceC3590aM13435a;
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC3590a m13437c(float f10) {
        return (InterfaceC3590a) f9981c.m11354c(m13438d(f10));
    }

    /* JADX INFO: renamed from: d */
    public final int m13438d(float f10) {
        return (int) (f10 * 100.0f);
    }

    /* JADX INFO: renamed from: e */
    public final float m13439e(int i10) {
        return i10 / 100.0f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m13440f(float f10) {
        return f10 >= 1.03f;
    }

    /* JADX INFO: renamed from: g */
    public final void m13441g(float f10, InterfaceC3590a interfaceC3590a) {
        synchronized (f9982d) {
            C3062i1 c3062i1Clone = f9981c.clone();
            f9979a.m13442h(c3062i1Clone, f10, interfaceC3590a);
            f9981c = c3062i1Clone;
            C4700i0 c4700i0 = C4700i0.f13910a;
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m13442h(C3062i1 c3062i1, float f10, InterfaceC3590a interfaceC3590a) {
        c3062i1.m11357g(m13438d(f10), interfaceC3590a);
    }
}
