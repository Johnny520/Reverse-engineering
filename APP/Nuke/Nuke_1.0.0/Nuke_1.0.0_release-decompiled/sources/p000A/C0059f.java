package p000A;

import me.dartcv.nuke.BuildConfig;
import p056K2.C0891q;
import p058L.AbstractC0903E;
import p058L.C0902D;
import p058L.EnumC0901C;
import p077P0.InterfaceC1136w;
import p095T.C1355d;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p127Z2.AbstractC1784a;
import p160f3.C2135g;
import p193l0.C2481d;
import p204n0.C2686e;
import p211o0.AbstractC2752k;
import p211o0.C2750i;
import p211o0.C2762u;
import p222q0.C2906g;
import p222q0.InterfaceC2903d;

/* JADX INFO: renamed from: A.f */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0059f implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f235d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f236e;

    public /* synthetic */ C0059f(long j5) {
        this.f235d = 2;
        this.f236e = j5;
    }

    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        C2135g c2135g;
        Object objM3229o;
        switch (this.f235d) {
            case 0:
                C2481d c2481d = (C2481d) obj;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (c2481d.f7981d.mo946c() >> 32)) / 2.0f;
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                ((InterfaceC1136w) obj).mo1128a(AbstractC0903E.f2811c, new C0902D(EnumC0050a0.f204d, this.f236e, EnumC0901C.f2802e, true));
                break;
            case 2:
                InterfaceC2903d interfaceC2903d = (InterfaceC2903d) obj;
                AbstractC1665j.m2985e(interfaceC2903d, "$this$Canvas");
                float fMo268G = interfaceC2903d.mo268G((float) 1.9d);
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() >> 32)) * 0.38f;
                float fIntBitsToFloat3 = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() >> 32)) * 0.62f;
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L)) * 0.28f;
                float fIntBitsToFloat5 = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L)) * 0.5f;
                float fIntBitsToFloat6 = Float.intBitsToFloat((int) (interfaceC2903d.mo859c() & 4294967295L)) * 0.72f;
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
                long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat5)) & 4294967295L);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat6)));
                long j5 = this.f236e;
                interfaceC2903d.mo855V(j5, jFloatToRawIntBits, jFloatToRawIntBits2, fMo268G, (480 & 16) != 0 ? 0 : 1);
                interfaceC2903d.mo855V(j5, jFloatToRawIntBits2, jFloatToRawIntBits3, fMo268G, (480 & 16) != 0 ? 0 : 1);
                break;
            case 3:
                InterfaceC2903d interfaceC2903d2 = (InterfaceC2903d) obj;
                AbstractC1665j.m2985e(interfaceC2903d2, "$this$Canvas");
                float fMo268G2 = interfaceC2903d2.mo268G(2);
                C2750i c2750iM4885a = AbstractC2752k.m4885a();
                c2750iM4885a.f8742a.moveTo(Float.intBitsToFloat((int) (interfaceC2903d2.mo859c() >> 32)) * 0.22f, Float.intBitsToFloat((int) (interfaceC2903d2.mo859c() & 4294967295L)) * 0.52f);
                c2750iM4885a.m4881e(Float.intBitsToFloat((int) (interfaceC2903d2.mo859c() >> 32)) * 0.42f, Float.intBitsToFloat((int) (interfaceC2903d2.mo859c() & 4294967295L)) * 0.72f);
                c2750iM4885a.m4881e(Float.intBitsToFloat((int) (interfaceC2903d2.mo859c() >> 32)) * 0.78f, Float.intBitsToFloat((int) (interfaceC2903d2.mo859c() & 4294967295L)) * 0.28f);
                interfaceC2903d2.mo862o(c2750iM4885a, this.f236e, new C2906g(fMo268G2, 0.0f, 1, 1, 18));
                break;
            case 4:
                InterfaceC2903d interfaceC2903d3 = (InterfaceC2903d) obj;
                AbstractC1665j.m2985e(interfaceC2903d3, "$this$Canvas");
                float fMo268G3 = interfaceC2903d3.mo268G((float) 1.8d);
                long jFloatToRawIntBits4 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d3.mo859c() & 4294967295L)) * 0.38f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d3.mo859c() >> 32)) * 0.25f)) << 32);
                long jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d3.mo859c() >> 32)) * 0.5f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d3.mo859c() & 4294967295L)) * 0.62f)) & 4294967295L);
                float fIntBitsToFloat7 = Float.intBitsToFloat((int) (interfaceC2903d3.mo859c() >> 32)) * 0.75f;
                float fIntBitsToFloat8 = Float.intBitsToFloat((int) (interfaceC2903d3.mo859c() & 4294967295L)) * 0.38f;
                long jFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat7);
                long jFloatToRawIntBits7 = Float.floatToRawIntBits(fIntBitsToFloat8);
                long j6 = this.f236e;
                interfaceC2903d3.mo855V(j6, jFloatToRawIntBits4, jFloatToRawIntBits5, fMo268G3, (480 & 16) != 0 ? 0 : 1);
                interfaceC2903d3.mo855V(j6, jFloatToRawIntBits5, (jFloatToRawIntBits6 << 32) | (jFloatToRawIntBits7 & 4294967295L), fMo268G3, (480 & 16) != 0 ? 0 : 1);
                break;
            case 5:
                InterfaceC2903d interfaceC2903d4 = (InterfaceC2903d) obj;
                AbstractC1665j.m2985e(interfaceC2903d4, "$this$Canvas");
                float fMo268G4 = interfaceC2903d4.mo268G(2);
                long jFloatToRawIntBits8 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d4.mo859c() & 4294967295L)) * 0.24f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d4.mo859c() >> 32)) * 0.66f)) << 32);
                long jFloatToRawIntBits9 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d4.mo859c() >> 32)) * 0.34f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d4.mo859c() & 4294967295L)) * 0.5f)) & 4294967295L);
                long jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d4.mo859c() >> 32)) * 0.66f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d4.mo859c() & 4294967295L)) * 0.76f)) & 4294967295L);
                long j7 = this.f236e;
                interfaceC2903d4.mo855V(j7, jFloatToRawIntBits8, jFloatToRawIntBits9, fMo268G4, (480 & 16) != 0 ? 0 : 1);
                interfaceC2903d4.mo855V(j7, jFloatToRawIntBits9, jFloatToRawIntBits10, fMo268G4, (480 & 16) != 0 ? 0 : 1);
                break;
            case 6:
                long j8 = this.f236e;
                C1355d c1355d = (C1355d) obj;
                InterfaceC1601c interfaceC1601c = c1355d.f4791b;
                if (interfaceC1601c != null && (c2135g = c1355d.f4790a) != null) {
                    try {
                        objM3229o = interfaceC1601c.mo1h(Long.valueOf(j8));
                    } catch (Throwable th) {
                        objM3229o = AbstractC1784a.m3229o(th);
                    }
                    c2135g.mo278i(objM3229o);
                }
                break;
            default:
                InterfaceC2903d interfaceC2903d5 = (InterfaceC2903d) obj;
                AbstractC1665j.m2985e(interfaceC2903d5, "$this$Canvas");
                float fM4662b = C2686e.m4662b(interfaceC2903d5.mo859c()) * 0.18f;
                long jFloatToRawIntBits11 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d5.mo859c() >> 32)) * 0.5f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d5.mo859c() & 4294967295L)) * 0.34f)) & 4294967295L);
                long j9 = this.f236e;
                InterfaceC2903d.m5100A(interfaceC2903d5, j9, fM4662b, jFloatToRawIntBits11, null, 120);
                InterfaceC2903d.m5100A(interfaceC2903d5, C2762u.m4920b(0.82f, j9), C2686e.m4662b(interfaceC2903d5.mo859c()) * 0.32f, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d5.mo859c() & 4294967295L)) * 0.88f)) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (interfaceC2903d5.mo859c() >> 32)) * 0.5f)) << 32), null, 120);
                break;
        }
        return C0891q.f2780a;
    }

    public /* synthetic */ C0059f(long j5, int i5) {
        this.f235d = i5;
        this.f236e = j5;
    }
}
