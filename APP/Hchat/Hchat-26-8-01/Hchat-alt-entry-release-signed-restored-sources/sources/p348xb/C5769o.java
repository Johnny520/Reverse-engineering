package p348xb;

import android.graphics.RuntimeShader;
import p027c0.C0362g;
import p028c1.AbstractC0378h;
import p057e1.C0807b;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p116i.C1785r0;
import p249qg.InterfaceC3599t;
import p267s1.AbstractC3898h0;
import p356y0.C5850l;
import p356y0.InterfaceC5853o;
import sh.C4018j;

/* JADX INFO: renamed from: xb.o */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5769o {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3599t f23491a;

    /* JADX INFO: renamed from: b */
    public final C4018j f23492b;

    /* JADX INFO: renamed from: c */
    public final C1785r0 f23493c;

    /* JADX INFO: renamed from: d */
    public final C1785r0 f23494d;

    /* JADX INFO: renamed from: e */
    public final C1739c f23495e;

    /* JADX INFO: renamed from: f */
    public final C1739c f23496f;

    /* JADX INFO: renamed from: g */
    public long f23497g;

    /* JADX INFO: renamed from: h */
    public final RuntimeShader f23498h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5853o f23499i;

    /* JADX INFO: renamed from: j */
    public final InterfaceC5853o f23500j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5769o(InterfaceC3599t interfaceC3599t, C4018j c4018j) {
        interfaceC3599t.getClass();
        this.f23491a = interfaceC3599t;
        this.f23492b = c4018j;
        this.f23493c = new C1785r0(0.5f, 300.0f, Float.valueOf(0.001f));
        this.f23494d = new C1785r0(0.5f, 300.0f, new C0807b((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)));
        this.f23495e = AbstractC1742d.m4365a(0.0f, 0.001f);
        this.f23496f = new C1739c(new C0807b(0L), AbstractC1742d.f5815o, new C0807b((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L)), 8);
        this.f23497g = 0L;
        AbstractC5765k.m10459b();
        this.f23498h = AbstractC5765k.m10458a();
        C5766l c5766l = new C5766l(this, 0);
        C5850l c5850l = C5850l.f23787a;
        this.f23499i = AbstractC0378h.m1341f(c5850l, c5766l);
        this.f23500j = AbstractC3898h0.m8090a(c5850l, interfaceC3599t, new C0362g(this, 9));
    }
}
