package p100h0;

import ac.AbstractC0063p;
import p015b0.C0147m;
import p020b5.C0192k;
import p057e1.C0808c;
import p085fg.InterfaceC1231l;
import p119i2.C1939m0;
import p276sf.C3967n;
import p308v1.AbstractC4434w;
import p308v1.InterfaceC4428t;
import p321w.C4618m1;
import p321w.C4629q0;

/* JADX INFO: renamed from: h0.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1551t0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5176g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C1511d1 f5177h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1551t0(C1511d1 c1511d1, int i9) {
        this.f5176g = i9;
        this.f5177h = c1511d1;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0141  */
    @Override // p085fg.InterfaceC1231l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        C0808c c0808c;
        InterfaceC4428t interfaceC4428tM9050c;
        char c10;
        long j3;
        long j4;
        float fIntBitsToFloat;
        InterfaceC4428t interfaceC4428tM9050c2;
        InterfaceC4428t interfaceC4428tM9050c3;
        InterfaceC4428t interfaceC4428tM9050c4;
        InterfaceC4428t interfaceC4428tM9050c5;
        int i9 = this.f5176g;
        C1511d1 c1511d1 = this.f5177h;
        switch (i9) {
            case 0:
                InterfaceC4428t interfaceC4428t = (InterfaceC4428t) obj;
                C4629q0 c4629q0 = c1511d1.f5032d;
                C0808c c0808c2 = C0808c.f2415e;
                if (c4629q0 == null) {
                    c0808c = c0808c2;
                } else {
                    if (c4629q0.f15341p) {
                        c4629q0 = null;
                    }
                    if (c4629q0 != null) {
                        C0192k c0192k = c1511d1.f5030b;
                        long j5 = c1511d1.m4028n().f9317b;
                        int i10 = C1939m0.f6574c;
                        int i11 = (int) (j5 >> 32);
                        c0192k.m859l(i11);
                        C0192k c0192k2 = c1511d1.f5030b;
                        int i12 = (int) (c1511d1.m4028n().f9317b & 4294967295L);
                        c0192k2.m859l(i12);
                        C4629q0 c4629q02 = c1511d1.f5032d;
                        long jMo8868m0 = 0;
                        long jMo8868m02 = (c4629q02 == null || (interfaceC4428tM9050c5 = c4629q02.m9050c()) == null) ? 0L : interfaceC4428tM9050c5.mo8868m0(c1511d1.m4026l(true));
                        C4629q0 c4629q03 = c1511d1.f5032d;
                        if (c4629q03 != null && (interfaceC4428tM9050c4 = c4629q03.m9050c()) != null) {
                            jMo8868m0 = interfaceC4428tM9050c4.mo8868m0(c1511d1.m4026l(false));
                        }
                        C4629q0 c4629q04 = c1511d1.f5032d;
                        float fIntBitsToFloat2 = 0.0f;
                        if (c4629q04 == null || (interfaceC4428tM9050c3 = c4629q04.m9050c()) == null) {
                            c10 = ' ';
                            j3 = jMo8868m0;
                            j4 = 4294967295L;
                            fIntBitsToFloat = 0.0f;
                        } else {
                            C4618m1 c4618m1M9051d = c4629q0.m9051d();
                            c10 = ' ';
                            j3 = jMo8868m0;
                            j4 = 4294967295L;
                            fIntBitsToFloat = Float.intBitsToFloat((int) (interfaceC4428tM9050c3.mo8868m0((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(c4618m1M9051d != null ? c4618m1M9051d.f15293a.m4803c(i11).f2417b : 0.0f)) & 4294967295L)) & 4294967295L));
                        }
                        C4629q0 c4629q05 = c1511d1.f5032d;
                        if (c4629q05 != null && (interfaceC4428tM9050c2 = c4629q05.m9050c()) != null) {
                            C4618m1 c4618m1M9051d2 = c4629q0.m9051d();
                            fIntBitsToFloat2 = Float.intBitsToFloat((int) (interfaceC4428tM9050c2.mo8868m0((((long) Float.floatToRawIntBits(0.0f)) << c10) | (((long) Float.floatToRawIntBits(c4618m1M9051d2 != null ? c4618m1M9051d2.f15293a.m4803c(i12).f2417b : 0.0f)) & j4)) & j4));
                        }
                        int i13 = (int) (jMo8868m02 >> c10);
                        int i14 = (int) (j3 >> c10);
                        c0808c = new C0808c(Math.min(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i13), Float.intBitsToFloat(i14)), (c4629q0.f15326a.f15442g.mo1333d() * 25) + Math.max(Float.intBitsToFloat((int) (jMo8868m02 & j4)), Float.intBitsToFloat((int) (j3 & j4))));
                    }
                }
                C4629q0 c4629q06 = c1511d1.f5032d;
                if (c4629q06 == null || (interfaceC4428tM9050c = c4629q06.m9050c()) == null) {
                    return null;
                }
                return (interfaceC4428tM9050c.mo8856C() && interfaceC4428t.mo8856C()) ? AbstractC0063p.m408a(interfaceC4428t.mo8869w(AbstractC4434w.m8884h(interfaceC4428tM9050c), c0808c.m2048d()), c0808c.m2047c()) : c0808c2;
            case 1:
                return new C0147m(c1511d1, 6);
            default:
                c1511d1.m4032r();
                return C3967n.f12976a;
        }
    }
}
