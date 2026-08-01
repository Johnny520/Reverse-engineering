package p000;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class fb1 extends bb1 {

    /* JADX INFO: renamed from: b */
    public final C0035ay f1653b;

    /* JADX INFO: renamed from: c */
    public String f1654c;

    /* JADX INFO: renamed from: d */
    public boolean f1655d;

    /* JADX INFO: renamed from: e */
    public final C0698rq f1656e;

    /* JADX INFO: renamed from: f */
    public InterfaceC0298hw f1657f;

    /* JADX INFO: renamed from: g */
    public final gp0 f1658g;

    /* JADX INFO: renamed from: h */
    public C0348ja f1659h;

    /* JADX INFO: renamed from: i */
    public final gp0 f1660i;

    /* JADX INFO: renamed from: j */
    public long f1661j;

    /* JADX INFO: renamed from: k */
    public float f1662k;

    /* JADX INFO: renamed from: l */
    public float f1663l;

    /* JADX INFO: renamed from: m */
    public final eb1 f1664m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public fb1(C0035ay c0035ay) {
        this.f1653b = c0035ay;
        c0035ay.f294i = new eb1(this, 0);
        this.f1654c = "";
        this.f1655d = true;
        this.f1656e = new C0698rq();
        this.f1657f = C0094cj.f826l;
        this.f1658g = r60.m3419u(null);
        this.f1660i = r60.m3419u(new q11(0L));
        this.f1661j = 9205357640488583168L;
        this.f1662k = 1.0f;
        this.f1663l = 1.0f;
        this.f1664m = new eb1(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p000.bb1
    /* JADX INFO: renamed from: a */
    public final void mo218a(InterfaceC0812uq interfaceC0812uq) {
        m1077e(interfaceC0812uq, 1.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0108  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1077e(InterfaceC0812uq interfaceC0812uq, float f, C0348ja c0348ja) {
        int i;
        C0348ja c0348ja2;
        long j;
        C0348ja c0348ja3;
        int i2;
        int i3;
        C0035ay c0035ay = this.f1653b;
        boolean z = c0035ay.f289d;
        gp0 gp0Var = this.f1658g;
        if (!z || c0035ay.f290e == 16) {
            i = 0;
        } else {
            C0348ja c0348ja4 = (C0348ja) gp0Var.getValue();
            int i4 = ib1.f2505a;
            if (!(c0348ja4 instanceof C0348ja) ? c0348ja4 == null : !((i3 = c0348ja4.f2777c) != 5 && i3 != 3)) {
                if (!(c0348ja instanceof C0348ja) ? c0348ja == null : !((i2 = c0348ja.f2777c) != 5 && i2 != 3)) {
                    i = 1;
                }
            }
        }
        boolean z2 = this.f1655d;
        C0698rq c0698rq = this.f1656e;
        if (z2 || !q11.m3185a(this.f1661j, interfaceC0812uq.mo649c())) {
            if (i == 1) {
                long jM1093b = c0035ay.f290e;
                int i5 = ib1.f2505a;
                if (C0207ff.m1095d(jM1093b) != 1.0f) {
                    jM1093b = C0207ff.m1093b(1.0f, jM1093b);
                }
                c0348ja2 = new C0348ja(5, jM1093b);
            } else {
                c0348ja2 = null;
            }
            this.f1659h = c0348ja2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC0812uq.mo649c() >> 32));
            gp0 gp0Var2 = this.f1660i;
            this.f1662k = fIntBitsToFloat / Float.intBitsToFloat((int) (((q11) gp0Var2.getValue()).f5022a >> 32));
            this.f1663l = Float.intBitsToFloat((int) (interfaceC0812uq.mo649c() & 4294967295L)) / Float.intBitsToFloat((int) (((q11) gp0Var2.getValue()).f5022a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC0812uq.mo649c() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC0812uq.mo649c() & 4294967295L))))) & 4294967295L);
            k50 layoutDirection = interfaceC0812uq.getLayoutDirection();
            C0752t5 c0752t5M1918d = c0698rq.f5531a;
            C0041b3 c0041b3 = c0698rq.f5532b;
            if (c0752t5M1918d != null) {
                Bitmap bitmap = c0752t5M1918d.f5913a;
                if (c0041b3 != null) {
                    j = 4294967295L;
                    if (((int) (jCeil >> 32)) > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || c0698rq.f5534d != i) {
                    }
                    c0698rq.f5533c = jCeil;
                    C0125dd c0125dd = c0698rq.f5535e;
                    long jM2759C = o30.m2759C(jCeil);
                    C0087cd c0087cd = c0125dd.f1052d;
                    InterfaceC0968ym interfaceC0968ym = c0087cd.f787a;
                    k50 k50Var = c0087cd.f788b;
                    InterfaceC0051bd interfaceC0051bd = c0087cd.f789c;
                    C0041b3 c0041b32 = c0041b3;
                    long j2 = c0087cd.f790d;
                    c0087cd.f787a = interfaceC0812uq;
                    c0087cd.f788b = layoutDirection;
                    c0087cd.f789c = c0041b32;
                    c0087cd.f790d = jM2759C;
                    c0041b32.mo243i();
                    InterfaceC0812uq.m4339v(c0125dd, C0207ff.f1702b, 0L, 62);
                    this.f1664m.invoke(c0125dd);
                    c0041b32.mo241g();
                    C0087cd c0087cd2 = c0125dd.f1052d;
                    c0087cd2.f787a = interfaceC0968ym;
                    c0087cd2.f788b = k50Var;
                    c0087cd2.f789c = interfaceC0051bd;
                    c0087cd2.f790d = j2;
                    c0752t5M1918d.f5913a.prepareToDraw();
                    this.f1655d = false;
                    this.f1661j = interfaceC0812uq.mo649c();
                } else {
                    j = 4294967295L;
                }
                c0752t5M1918d = AbstractC0398kl.m1918d((int) (jCeil >> 32), (int) (jCeil & j), i);
                Canvas canvas = AbstractC0077c3.f648a;
                c0041b3 = new C0041b3();
                c0041b3.f362a = new Canvas(c0752t5M1918d.f5913a);
                c0698rq.f5531a = c0752t5M1918d;
                c0698rq.f5532b = c0041b3;
                c0698rq.f5534d = i;
                c0698rq.f5533c = jCeil;
                C0125dd c0125dd2 = c0698rq.f5535e;
                long jM2759C2 = o30.m2759C(jCeil);
                C0087cd c0087cd3 = c0125dd2.f1052d;
                InterfaceC0968ym interfaceC0968ym2 = c0087cd3.f787a;
                k50 k50Var2 = c0087cd3.f788b;
                InterfaceC0051bd interfaceC0051bd2 = c0087cd3.f789c;
                C0041b3 c0041b322 = c0041b3;
                long j22 = c0087cd3.f790d;
                c0087cd3.f787a = interfaceC0812uq;
                c0087cd3.f788b = layoutDirection;
                c0087cd3.f789c = c0041b322;
                c0087cd3.f790d = jM2759C2;
                c0041b322.mo243i();
                InterfaceC0812uq.m4339v(c0125dd2, C0207ff.f1702b, 0L, 62);
                this.f1664m.invoke(c0125dd2);
                c0041b322.mo241g();
                C0087cd c0087cd22 = c0125dd2.f1052d;
                c0087cd22.f787a = interfaceC0968ym2;
                c0087cd22.f788b = k50Var2;
                c0087cd22.f789c = interfaceC0051bd2;
                c0087cd22.f790d = j22;
                c0752t5M1918d.f5913a.prepareToDraw();
                this.f1655d = false;
                this.f1661j = interfaceC0812uq.mo649c();
            }
        } else {
            C0752t5 c0752t5 = c0698rq.f5531a;
            if (i != (c0752t5 != null ? c0752t5.m4187a() : 0)) {
            }
        }
        if (c0348ja != null) {
            c0348ja3 = c0348ja;
        } else {
            c0348ja3 = ((C0348ja) gp0Var.getValue()) != null ? (C0348ja) gp0Var.getValue() : this.f1659h;
        }
        C0752t5 c0752t52 = c0698rq.f5531a;
        if (c0752t52 == null) {
            w10.m4824b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        InterfaceC0812uq.m4334H(interfaceC0812uq, c0752t52, c0698rq.f5533c, 0L, f, c0348ja3, 0, 858);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f1654c);
        sb.append("\n\tviewportWidth: ");
        gp0 gp0Var = this.f1660i;
        sb.append(Float.intBitsToFloat((int) (((q11) gp0Var.getValue()).f5022a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((q11) gp0Var.getValue()).f5022a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
