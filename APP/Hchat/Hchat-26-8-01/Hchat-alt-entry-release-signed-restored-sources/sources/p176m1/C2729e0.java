package p176m1;

import android.graphics.Bitmap;
import gg.AbstractC1417m;
import okhttp3.HttpUrl;
import p057e1.C0810e;
import p071f1.AbstractC0996c0;
import p071f1.C0993b;
import p071f1.C1003g;
import p071f1.C1017n;
import p071f1.C1034w;
import p071f1.InterfaceC1031u;
import p101h1.C1564a;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p117i0.AbstractC1874r;
import p117i0.C1845j1;
import p259r9.AbstractC3754e0;
import p292u1.AbstractC4229a;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: m1.e0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2729e0 extends AbstractC2725c0 {

    /* JADX INFO: renamed from: b */
    public final C2724c f8850b;

    /* JADX INFO: renamed from: c */
    public String f8851c;

    /* JADX INFO: renamed from: d */
    public boolean f8852d;

    /* JADX INFO: renamed from: e */
    public final C2720a f8853e;

    /* JADX INFO: renamed from: f */
    public AbstractC1417m f8854f;

    /* JADX INFO: renamed from: g */
    public final C1845j1 f8855g;

    /* JADX INFO: renamed from: h */
    public C1017n f8856h;

    /* JADX INFO: renamed from: i */
    public final C1845j1 f8857i;

    /* JADX INFO: renamed from: j */
    public long f8858j;

    /* JADX INFO: renamed from: k */
    public float f8859k;

    /* JADX INFO: renamed from: l */
    public float f8860l;

    /* JADX INFO: renamed from: m */
    public final C2727d0 f8861m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2729e0(C2724c c2724c) {
        this.f8850b = c2724c;
        c2724c.f8815i = new C2727d0(this, 0);
        this.f8851c = HttpUrl.FRAGMENT_ENCODE_SET;
        this.f8852d = true;
        this.f8853e = new C2720a();
        this.f8854f = C2732g.f8877i;
        this.f8855g = AbstractC1874r.m4639u(null);
        this.f8857i = AbstractC1874r.m4639u(new C0810e(0L));
        this.f8858j = 9205357640488583168L;
        this.f8859k = 1.0f;
        this.f8860l = 1.0f;
        this.f8861m = new C2727d0(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p176m1.AbstractC2725c0
    /* JADX INFO: renamed from: a */
    public final void mo6141a(InterfaceC1567d interfaceC1567d) {
        m6150e(interfaceC1567d, 1.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m6150e(InterfaceC1567d interfaceC1567d, float f3, C1017n c1017n) {
        int i9;
        C1017n c1017n2;
        char c10;
        long j3;
        int i10;
        int i11;
        C1017n c1017n3 = c1017n;
        C2724c c2724c = this.f8850b;
        boolean z9 = c2724c.f8810d;
        C1845j1 c1845j1 = this.f8855g;
        if (!z9 || c2724c.f8811e == 16) {
            i9 = 0;
        } else {
            C1017n c1017n4 = (C1017n) c1845j1.getValue();
            int i12 = AbstractC2735h0.f8909a;
            if (!(c1017n4 instanceof C1017n) ? c1017n4 == null : !((i11 = c1017n4.f3203c) != 5 && i11 != 3)) {
                if (!(c1017n3 instanceof C1017n) ? c1017n3 == null : !((i10 = c1017n3.f3203c) != 5 && i10 != 3)) {
                    i9 = 1;
                }
            }
        }
        boolean z10 = this.f8852d;
        C2720a c2720a = this.f8853e;
        if (z10 || !C0810e.m2054a(this.f8858j, interfaceC1567d.mo4091a())) {
            if (i9 == 1) {
                long jM2634b = c2724c.f8811e;
                int i13 = AbstractC2735h0.f8909a;
                if (C1034w.m2636d(jM2634b) != 1.0f) {
                    jM2634b = C1034w.m2634b(jM2634b, 1.0f);
                }
                c1017n2 = new C1017n(jM2634b, 5);
            } else {
                c1017n2 = null;
            }
            this.f8856h = c1017n2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC1567d.mo4091a() >> 32));
            C1845j1 c1845j12 = this.f8857i;
            this.f8859k = fIntBitsToFloat / Float.intBitsToFloat((int) (((C0810e) c1845j12.getValue()).f2428a >> 32));
            this.f8860l = Float.intBitsToFloat((int) (interfaceC1567d.mo4091a() & 4294967295L)) / Float.intBitsToFloat((int) (((C0810e) c1845j12.getValue()).f2428a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC1567d.mo4091a() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC1567d.mo4091a() & 4294967295L))))) & 4294967295L);
            EnumC4243m layoutDirection = interfaceC1567d.getLayoutDirection();
            C1003g c1003gM2509e = c2720a.f8798a;
            C0993b c0993bM2505a = c2720a.f8799b;
            if (c1003gM2509e == null || c0993bM2505a == null) {
                c10 = ' ';
                j3 = 4294967295L;
            } else {
                int i14 = (int) (jCeil >> 32);
                Bitmap bitmap = c1003gM2509e.f3179a;
                c10 = ' ';
                j3 = 4294967295L;
                if (i14 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || c2720a.f8801d != i9) {
                }
                c2720a.f8800c = jCeil;
                C1565b c1565b = c2720a.f8802e;
                long jM7908q0 = AbstractC3754e0.m7908q0(jCeil);
                C1564a c1564a = c1565b.f5219g;
                InterfaceC4233c interfaceC4233c = c1564a.f5215a;
                EnumC4243m enumC4243m = c1564a.f5216b;
                InterfaceC1031u interfaceC1031u = c1564a.f5217c;
                C0993b c0993b = c0993bM2505a;
                long j4 = c1564a.f5218d;
                c1564a.f5215a = interfaceC1567d;
                c1564a.f5216b = layoutDirection;
                c1564a.f5217c = c0993b;
                c1564a.f5218d = jM7908q0;
                c0993b.mo2487e();
                InterfaceC1567d.m4087Z(c1565b, C1034w.f3258b, 0L, 0.0f, 0, 62);
                this.f8861m.invoke(c1565b);
                c0993b.mo2497p();
                C1564a c1564a2 = c1565b.f5219g;
                c1564a2.f5215a = interfaceC4233c;
                c1564a2.f5216b = enumC4243m;
                c1564a2.f5217c = interfaceC1031u;
                c1564a2.f5218d = j4;
                c1003gM2509e.f3179a.prepareToDraw();
                this.f8852d = false;
                this.f8858j = interfaceC1567d.mo4091a();
            }
            c1003gM2509e = AbstractC0996c0.m2509e((int) (jCeil >> c10), (int) (jCeil & j3), i9);
            c0993bM2505a = AbstractC0996c0.m2505a(c1003gM2509e);
            c2720a.f8798a = c1003gM2509e;
            c2720a.f8799b = c0993bM2505a;
            c2720a.f8801d = i9;
            c2720a.f8800c = jCeil;
            C1565b c1565b2 = c2720a.f8802e;
            long jM7908q02 = AbstractC3754e0.m7908q0(jCeil);
            C1564a c1564a3 = c1565b2.f5219g;
            InterfaceC4233c interfaceC4233c2 = c1564a3.f5215a;
            EnumC4243m enumC4243m2 = c1564a3.f5216b;
            InterfaceC1031u interfaceC1031u2 = c1564a3.f5217c;
            C0993b c0993b2 = c0993bM2505a;
            long j42 = c1564a3.f5218d;
            c1564a3.f5215a = interfaceC1567d;
            c1564a3.f5216b = layoutDirection;
            c1564a3.f5217c = c0993b2;
            c1564a3.f5218d = jM7908q02;
            c0993b2.mo2487e();
            InterfaceC1567d.m4087Z(c1565b2, C1034w.f3258b, 0L, 0.0f, 0, 62);
            this.f8861m.invoke(c1565b2);
            c0993b2.mo2497p();
            C1564a c1564a22 = c1565b2.f5219g;
            c1564a22.f5215a = interfaceC4233c2;
            c1564a22.f5216b = enumC4243m2;
            c1564a22.f5217c = interfaceC1031u2;
            c1564a22.f5218d = j42;
            c1003gM2509e.f3179a.prepareToDraw();
            this.f8852d = false;
            this.f8858j = interfaceC1567d.mo4091a();
        } else {
            C1003g c1003g = c2720a.f8798a;
            if (i9 != (c1003g != null ? c1003g.m2559a() : 0)) {
            }
        }
        if (c1017n3 == null) {
            c1017n3 = ((C1017n) c1845j1.getValue()) != null ? (C1017n) c1845j1.getValue() : this.f8856h;
        }
        C1017n c1017n5 = c1017n3;
        C1003g c1003g2 = c2720a.f8798a;
        if (c1003g2 == null) {
            AbstractC4229a.m8494b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        InterfaceC1567d.m4085U0(interfaceC1567d, c1003g2, c2720a.f8800c, 0L, f3, c1017n5, 0, 858);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f8851c);
        sb2.append("\n\tviewportWidth: ");
        C1845j1 c1845j1 = this.f8857i;
        sb2.append(Float.intBitsToFloat((int) (((C0810e) c1845j1.getValue()).f2428a >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((C0810e) c1845j1.getValue()).f2428a & 4294967295L)));
        sb2.append("\n");
        return sb2.toString();
    }
}
