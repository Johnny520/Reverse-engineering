package p245u0;

import android.graphics.Bitmap;
import com.bumptech.glide.AbstractC1925g;
import p023E0.AbstractC0277a;
import p095T.AbstractC1385s;
import p095T.C1366i0;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1666k;
import p153e1.EnumC2017m;
import p153e1.InterfaceC2007c;
import p204n0.C2686e;
import p211o0.AbstractC2767z;
import p211o0.C2743b;
import p211o0.C2747f;
import p211o0.C2753l;
import p211o0.C2762u;
import p211o0.InterfaceC2760s;
import p222q0.C2900a;
import p222q0.C2901b;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: u0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C3298E extends AbstractC3296C {

    /* JADX INFO: renamed from: b */
    public final C3306c f10186b;

    /* JADX INFO: renamed from: c */
    public String f10187c;

    /* JADX INFO: renamed from: d */
    public boolean f10188d;

    /* JADX INFO: renamed from: e */
    public final C3304a f10189e;

    /* JADX INFO: renamed from: f */
    public AbstractC1666k f10190f;

    /* JADX INFO: renamed from: g */
    public final C1366i0 f10191g;

    /* JADX INFO: renamed from: h */
    public C2753l f10192h;

    /* JADX INFO: renamed from: i */
    public final C1366i0 f10193i;

    /* JADX INFO: renamed from: j */
    public long f10194j;

    /* JADX INFO: renamed from: k */
    public float f10195k;

    /* JADX INFO: renamed from: l */
    public float f10196l;

    /* JADX INFO: renamed from: m */
    public final C3297D f10197m;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3298E(C3306c c3306c) {
        this.f10186b = c3306c;
        c3306c.f10243i = new C3297D(this, 0);
        this.f10187c = "";
        this.f10188d = true;
        this.f10189e = new C3304a();
        this.f10190f = C3310g.f10288g;
        this.f10191g = AbstractC1385s.m2629s(null);
        this.f10193i = AbstractC1385s.m2629s(new C2686e(0L));
        this.f10194j = 9205357640488583168L;
        this.f10195k = 1.0f;
        this.f10196l = 1.0f;
        this.f10197m = new C3297D(this, 1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p245u0.AbstractC3296C
    /* JADX INFO: renamed from: a */
    public final void mo5565a(InterfaceC2903d interfaceC2903d) {
        m5569e(interfaceC2903d, 1.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5569e(InterfaceC2903d interfaceC2903d, float f2, C2753l c2753l) {
        int i5;
        C2753l c2753l2;
        char c5;
        long j5;
        int i6;
        int i7;
        C2753l c2753l3 = c2753l;
        C3306c c3306c = this.f10186b;
        boolean z5 = c3306c.f10238d;
        C1366i0 c1366i0 = this.f10191g;
        if (!z5 || c3306c.f10239e == 16) {
            i5 = 0;
        } else {
            C2753l c2753l4 = (C2753l) c1366i0.getValue();
            int i8 = AbstractC3300G.f10208a;
            if (!(c2753l4 instanceof C2753l) ? c2753l4 == null : !((i7 = c2753l4.f8748c) != 5 && i7 != 3)) {
                if (!(c2753l3 instanceof C2753l) ? c2753l3 == null : !((i6 = c2753l3.f8748c) != 5 && i6 != 3)) {
                    i5 = 1;
                }
            }
        }
        boolean z6 = this.f10188d;
        C3304a c3304a = this.f10189e;
        if (z6 || !C2686e.m4661a(this.f10194j, interfaceC2903d.mo859c())) {
            if (i5 == 1) {
                long jM4920b = c3306c.f10239e;
                int i9 = AbstractC3300G.f10208a;
                if (C2762u.m4922d(jM4920b) != 1.0f) {
                    jM4920b = C2762u.m4920b(1.0f, jM4920b);
                }
                c2753l2 = new C2753l(jM4920b, 5);
            } else {
                c2753l2 = null;
            }
            this.f10192h = c2753l2;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() >> 32));
            C1366i0 c1366i02 = this.f10193i;
            this.f10195k = fIntBitsToFloat / Float.intBitsToFloat((int) (((C2686e) c1366i02.getValue()).f8570a >> 32));
            this.f10196l = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L)) / Float.intBitsToFloat((int) (((C2686e) c1366i02.getValue()).f8570a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2903d.mo859c() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L))))) & 4294967295L);
            EnumC2017m layoutDirection = interfaceC2903d.getLayoutDirection();
            C2747f c2747fM4936f = c3304a.f10229a;
            C2743b c2743bM4931a = c3304a.f10230b;
            if (c2747fM4936f == null || c2743bM4931a == null) {
                c5 = ' ';
                j5 = 4294967295L;
            } else {
                int i10 = (int) (jCeil >> 32);
                Bitmap bitmap = c2747fM4936f.f8734a;
                c5 = ' ';
                j5 = 4294967295L;
                if (i10 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || c3304a.f10232d != i5) {
                }
                c3304a.f10231c = jCeil;
                C2901b c2901b = c3304a.f10233e;
                long jM3523F = AbstractC1925g.m3523F(jCeil);
                C2900a c2900a = c2901b.f9184d;
                InterfaceC2007c interfaceC2007c = c2900a.f9180a;
                EnumC2017m enumC2017m = c2900a.f9181b;
                InterfaceC2760s interfaceC2760s = c2900a.f9182c;
                C2743b c2743b = c2743bM4931a;
                long j6 = c2900a.f9183d;
                c2900a.f9180a = interfaceC2903d;
                c2900a.f9181b = layoutDirection;
                c2900a.f9182c = c2743b;
                c2900a.f9183d = jM3523F;
                c2743b.mo4852n();
                InterfaceC2903d.m5104h(c2901b, C2762u.f8757b, 0L, 0L, 62);
                this.f10197m.mo1h(c2901b);
                c2743b.mo4851l();
                C2900a c2900a2 = c2901b.f9184d;
                c2900a2.f9180a = interfaceC2007c;
                c2900a2.f9181b = enumC2017m;
                c2900a2.f9182c = interfaceC2760s;
                c2900a2.f9183d = j6;
                c2747fM4936f.f8734a.prepareToDraw();
                this.f10188d = false;
                this.f10194j = interfaceC2903d.mo859c();
            }
            c2747fM4936f = AbstractC2767z.m4936f((int) (jCeil >> c5), (int) (jCeil & j5), i5);
            c2743bM4931a = AbstractC2767z.m4931a(c2747fM4936f);
            c3304a.f10229a = c2747fM4936f;
            c3304a.f10230b = c2743bM4931a;
            c3304a.f10232d = i5;
            c3304a.f10231c = jCeil;
            C2901b c2901b2 = c3304a.f10233e;
            long jM3523F2 = AbstractC1925g.m3523F(jCeil);
            C2900a c2900a3 = c2901b2.f9184d;
            InterfaceC2007c interfaceC2007c2 = c2900a3.f9180a;
            EnumC2017m enumC2017m2 = c2900a3.f9181b;
            InterfaceC2760s interfaceC2760s2 = c2900a3.f9182c;
            C2743b c2743b2 = c2743bM4931a;
            long j62 = c2900a3.f9183d;
            c2900a3.f9180a = interfaceC2903d;
            c2900a3.f9181b = layoutDirection;
            c2900a3.f9182c = c2743b2;
            c2900a3.f9183d = jM3523F2;
            c2743b2.mo4852n();
            InterfaceC2903d.m5104h(c2901b2, C2762u.f8757b, 0L, 0L, 62);
            this.f10197m.mo1h(c2901b2);
            c2743b2.mo4851l();
            C2900a c2900a22 = c2901b2.f9184d;
            c2900a22.f9180a = interfaceC2007c2;
            c2900a22.f9181b = enumC2017m2;
            c2900a22.f9182c = interfaceC2760s2;
            c2900a22.f9183d = j62;
            c2747fM4936f.f8734a.prepareToDraw();
            this.f10188d = false;
            this.f10194j = interfaceC2903d.mo859c();
        } else {
            C2747f c2747f = c3304a.f10229a;
            if (i5 != (c2747f != null ? c2747f.m4862a() : 0)) {
            }
        }
        if (c2753l3 == null) {
            c2753l3 = ((C2753l) c1366i0.getValue()) != null ? (C2753l) c1366i0.getValue() : this.f10192h;
        }
        C2753l c2753l5 = c2753l3;
        C2747f c2747f2 = c3304a.f10229a;
        if (c2747f2 == null) {
            AbstractC0277a.m483b("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        InterfaceC2903d.m5102b0(interfaceC2903d, c2747f2, c3304a.f10231c, 0L, f2, c2753l5, 0, 858);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.f10187c);
        sb.append("\n\tviewportWidth: ");
        C1366i0 c1366i0 = this.f10193i;
        sb.append(Float.intBitsToFloat((int) (((C2686e) c1366i0.getValue()).f8570a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((C2686e) c1366i0.getValue()).f8570a & 4294967295L)));
        sb.append("\n");
        String string = sb.toString();
        AbstractC1665j.m2984d(string, "toString(...)");
        return string;
    }
}
