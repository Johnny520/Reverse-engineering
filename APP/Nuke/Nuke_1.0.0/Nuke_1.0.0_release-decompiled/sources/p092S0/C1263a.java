package p092S0;

import android.graphics.Canvas;
import android.text.TextUtils;
import p096T0.AbstractC1411k;
import p096T0.C1405e;
import p096T0.C1409i;
import p096T0.C1410j;
import p130a1.AbstractC1789b;
import p130a1.C1788a;
import p130a1.C1791d;
import p130a1.C1793f;
import p147d1.C1962l;
import p153e1.C2005a;
import p211o0.AbstractC2744c;
import p211o0.AbstractC2758q;
import p211o0.C2737L;
import p211o0.InterfaceC2760s;
import p222q0.AbstractC2902c;

/* JADX INFO: renamed from: S0.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1263a {

    /* JADX INFO: renamed from: a */
    public final C1791d f4545a;

    /* JADX INFO: renamed from: b */
    public final int f4546b;

    /* JADX INFO: renamed from: c */
    public final long f4547c;

    /* JADX INFO: renamed from: d */
    public final C1410j f4548d;

    /* JADX INFO: renamed from: e */
    public final CharSequence f4549e;

    /* JADX INFO: renamed from: f */
    public final Object f4550f;

    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1263a(p130a1.C1791d r21, int r22, int r23, long r24) {
        /*
            Method dump skipped, instruction units count: 838
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p092S0.C1263a.<init>(a1.d, int, int, long):void");
    }

    /* JADX INFO: renamed from: a */
    public final C1410j m2346a(int i5, int i6, TextUtils.TruncateAt truncateAt, int i7, int i8, int i9, int i10, int i11, CharSequence charSequence) {
        C1284v c1284v;
        float fM2349d = m2349d();
        C1791d c1791d = this.f4545a;
        C1793f c1793f = c1791d.f6113g;
        int i12 = c1791d.f6117k;
        C1405e c1405e = c1791d.f6115i;
        C1260M c1260m = c1791d.f6108b;
        C1788a c1788a = AbstractC1789b.f6104a;
        C1285w c1285w = c1260m.f4542c;
        return new C1410j(charSequence, fM2349d, c1793f, i5, truncateAt, i12, (c1285w == null || (c1284v = c1285w.f4618a) == null) ? false : c1284v.f4616a, i7, i9, i10, i11, i8, i6, c1405e);
    }

    /* JADX INFO: renamed from: b */
    public final float m2347b() {
        return this.f4548d.m2705a();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Type inference failed for: r13v26, types: [T0.a] */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m2348c(p204n0.C2684c r12, int r13, p029F0.C0363A r14) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p092S0.C1263a.m2348c(n0.c, int, F0.A):long");
    }

    /* JADX INFO: renamed from: d */
    public final float m2349d() {
        return C2005a.m3680h(this.f4547c);
    }

    /* JADX INFO: renamed from: e */
    public final void m2350e(InterfaceC2760s interfaceC2760s) {
        Canvas canvasM4858a = AbstractC2744c.m4858a(interfaceC2760s);
        C1410j c1410j = this.f4548d;
        if (c1410j.f5042d) {
            canvasM4858a.save();
            canvasM4858a.clipRect(0.0f, 0.0f, m2349d(), m2347b());
        }
        int i5 = c1410j.f5046h;
        if (canvasM4858a.getClipBounds(c1410j.f5054p)) {
            if (i5 != 0) {
                canvasM4858a.translate(0.0f, i5);
            }
            ThreadLocal threadLocal = AbstractC1411k.f5056a;
            Object c1409i = threadLocal.get();
            if (c1409i == null) {
                c1409i = new C1409i();
                threadLocal.set(c1409i);
            }
            C1409i c1409i2 = (C1409i) c1409i;
            c1409i2.f5038a = canvasM4858a;
            try {
                c1410j.f5044f.draw(c1409i2);
                if (i5 != 0) {
                    canvasM4858a.translate(0.0f, (-1) * i5);
                }
            } finally {
                c1409i2.f5038a = null;
            }
        }
        if (c1410j.f5042d) {
            canvasM4858a.restore();
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2351f(InterfaceC2760s interfaceC2760s, long j5, C2737L c2737l, C1962l c1962l, AbstractC2902c abstractC2902c) {
        C1793f c1793f = this.f4545a.f6113g;
        int i5 = c1793f.f6122c;
        c1793f.m3263d(j5);
        c1793f.m3265f(c2737l);
        c1793f.m3266g(c1962l);
        c1793f.m3264e(abstractC2902c);
        c1793f.m3261b(3);
        m2350e(interfaceC2760s);
        c1793f.m3261b(i5);
    }

    /* JADX INFO: renamed from: g */
    public final void m2352g(InterfaceC2760s interfaceC2760s, AbstractC2758q abstractC2758q, float f2, C2737L c2737l, C1962l c1962l, AbstractC2902c abstractC2902c) {
        C1793f c1793f = this.f4545a.f6113g;
        int i5 = c1793f.f6122c;
        float fM2349d = m2349d();
        c1793f.m3262c(abstractC2758q, (((long) Float.floatToRawIntBits(m2347b())) & 4294967295L) | (Float.floatToRawIntBits(fM2349d) << 32), f2);
        c1793f.m3265f(c2737l);
        c1793f.m3266g(c1962l);
        c1793f.m3264e(abstractC2902c);
        c1793f.m3261b(3);
        m2350e(interfaceC2760s);
        c1793f.m3261b(i5);
    }
}
