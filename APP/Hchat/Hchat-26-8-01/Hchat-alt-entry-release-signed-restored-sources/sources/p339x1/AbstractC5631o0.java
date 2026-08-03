package p339x1;

import gg.AbstractC1416l;
import java.util.LinkedHashMap;
import p069f.AbstractC0951o0;
import p069f.C0925b0;
import p085fg.InterfaceC1231l;
import p293u2.C4240j;
import p293u2.EnumC4243m;
import p308v1.C4406l0;
import p308v1.InterfaceC4409m0;
import p308v1.InterfaceC4415o0;
import p308v1.InterfaceC4428t;
import p332wb.AbstractC4855en;

/* JADX INFO: renamed from: x1.o0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5631o0 extends AbstractC5628n0 implements InterfaceC4409m0 {

    /* JADX INFO: renamed from: u */
    public final AbstractC5614i1 f22932u;

    /* JADX INFO: renamed from: w */
    public LinkedHashMap f22934w;

    /* JADX INFO: renamed from: y */
    public InterfaceC4415o0 f22936y;

    /* JADX INFO: renamed from: z */
    public final C0925b0 f22937z;

    /* JADX INFO: renamed from: v */
    public long f22933v = 0;

    /* JADX INFO: renamed from: x */
    public final C4406l0 f22935x = new C4406l0(this);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC5631o0(AbstractC5614i1 abstractC5614i1) {
        this.f22932u = abstractC5614i1;
        C0925b0 c0925b0 = AbstractC0951o0.f2997a;
        this.f22937z = new C0925b0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g1 */
    public static final void m10181g1(AbstractC5631o0 abstractC5631o0, InterfaceC4415o0 interfaceC4415o0) {
        LinkedHashMap linkedHashMap;
        if (interfaceC4415o0 != null) {
            abstractC5631o0.m8822C0((((long) interfaceC4415o0.mo7601g()) & 4294967295L) | (((long) interfaceC4415o0.mo7602h()) << 32));
        } else {
            abstractC5631o0.m8822C0(0L);
        }
        if (!AbstractC1416l.m3825a(abstractC5631o0.f22936y, interfaceC4415o0) && interfaceC4415o0 != null && ((((linkedHashMap = abstractC5631o0.f22934w) != null && !linkedHashMap.isEmpty()) || !interfaceC4415o0.mo7599e().isEmpty()) && !AbstractC1416l.m3825a(interfaceC4415o0.mo7599e(), abstractC5631o0.f22934w))) {
            C5640r0 c5640r0 = abstractC5631o0.f22932u.f22868u.f22779M.f22892q;
            c5640r0.getClass();
            c5640r0.f22972x.m10061f();
            LinkedHashMap linkedHashMap2 = abstractC5631o0.f22934w;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC5631o0.f22934w = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC4415o0.mo7599e());
        }
        abstractC5631o0.f22936y = interfaceC4415o0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1
    /* JADX INFO: renamed from: A0 */
    public final void mo8820A0(long j3, float f3, InterfaceC1231l interfaceC1231l) {
        m10183i1(j3);
        if (this.f22923p) {
            return;
        }
        mo10182h1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: S0 */
    public final AbstractC5628n0 mo10086S0() {
        AbstractC5614i1 abstractC5614i1 = this.f22932u.f22869v;
        if (abstractC5614i1 != null) {
            return abstractC5614i1.mo10104p1();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: T0 */
    public final InterfaceC4428t mo10088T0() {
        return this.f22935x;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.AbstractC4377b1, p308v1.InterfaceC4409m0
    /* JADX INFO: renamed from: X */
    public final Object mo8824X() {
        return this.f22932u.mo8824X();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: X0 */
    public final boolean mo10089X0() {
        return this.f22936y != null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: Y0 */
    public final C5602f0 mo10090Y0() {
        return this.f22932u.f22868u;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: Z0 */
    public final InterfaceC4415o0 mo10091Z0() {
        InterfaceC4415o0 interfaceC4415o0 = this.f22936y;
        if (interfaceC4415o0 != null) {
            return interfaceC4415o0;
        }
        throw AbstractC4855en.m9257a("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: a1 */
    public final AbstractC5628n0 mo10092a1() {
        AbstractC5614i1 abstractC5614i1 = this.f22932u.f22870w;
        if (abstractC5614i1 != null) {
            return abstractC5614i1.mo10104p1();
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: b1 */
    public final long mo10093b1() {
        return this.f22933v;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: d */
    public final float mo1333d() {
        return this.f22932u.mo1333d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0
    /* JADX INFO: renamed from: f1 */
    public final void mo10094f1() {
        mo8820A0(this.f22933v, 0.0f, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p308v1.InterfaceC4414o
    public final EnumC4243m getLayoutDirection() {
        return this.f22932u.f22868u.f22772F;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h1 */
    public void mo10182h1() {
        mo10091Z0().mo7600f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: i1 */
    public final void m10183i1(long j3) {
        if (!C4240j.m8528b(this.f22933v, j3)) {
            this.f22933v = j3;
            AbstractC5614i1 abstractC5614i1 = this.f22932u;
            C5640r0 c5640r0 = abstractC5614i1.f22868u.f22779M.f22892q;
            if (c5640r0 != null) {
                c5640r0.m10190N0();
            }
            AbstractC5628n0.m10172d1(abstractC5614i1);
        }
        if (this.f22924q) {
            return;
        }
        m10176N0(mo10091Z0());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j1 */
    public final long m10184j1(AbstractC5631o0 abstractC5631o0, boolean z9) {
        long jM8530d = 0;
        AbstractC5631o0 abstractC5631o0Mo10104p1 = this;
        while (!abstractC5631o0Mo10104p1.equals(abstractC5631o0)) {
            if (!abstractC5631o0Mo10104p1.f22922o || !z9) {
                jM8530d = C4240j.m8530d(jM8530d, abstractC5631o0Mo10104p1.f22933v);
            }
            AbstractC5614i1 abstractC5614i1 = abstractC5631o0Mo10104p1.f22932u.f22870w;
            abstractC5614i1.getClass();
            abstractC5631o0Mo10104p1 = abstractC5614i1.mo10104p1();
            abstractC5631o0Mo10104p1.getClass();
        }
        return jM8530d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p293u2.InterfaceC4233c
    /* JADX INFO: renamed from: q0 */
    public final float mo1335q0() {
        return this.f22932u.mo1335q0();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.AbstractC5628n0, p308v1.InterfaceC4414o
    /* JADX INFO: renamed from: u0 */
    public final boolean mo8009u0() {
        return true;
    }
}
