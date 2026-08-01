package p037G2;

import com.bumptech.glide.AbstractC1922d;
import p000A.EnumC0052b0;
import p027E4.C0330q;
import p047I0.C0734i;
import p047I0.C0741k0;
import p047I0.InterfaceC0744l0;
import p049I2.AbstractC0797o;
import p056K2.C0891q;
import p058L.C0920W;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1184i;
import p092S0.AbstractC1251D;
import p092S0.C1259L;
import p092S0.C1269g;
import p095T.InterfaceC1347Y;
import p110W0.C1577b;
import p112W2.InterfaceC1603e;
import p127Z2.AbstractC1784a;
import p155e3.AbstractC2030a;
import p155e3.EnumC2032c;
import p160f3.AbstractC2162v;
import p160f3.InterfaceC2160t;
import p238t.AbstractC3205c;

/* JADX INFO: renamed from: G2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0502n extends AbstractC1184i implements InterfaceC1603e {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f1575h = 1;

    /* JADX INFO: renamed from: i */
    public int f1576i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f1577j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f1578k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0502n(C0920W c0920w, boolean z5, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f1578k = c0920w;
        this.f1577j = z5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        InterfaceC2160t interfaceC2160t = (InterfaceC2160t) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f1575h) {
        }
        return ((C0502n) mo7n(interfaceC1046d, interfaceC2160t)).mo8p(C0891q.f2780a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f1575h) {
            case 0:
                return new C0502n(this.f1577j, (InterfaceC1347Y) this.f1578k, interfaceC1046d);
            default:
                return new C0502n((C0920W) this.f1578k, this.f1577j, interfaceC1046d);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00dd  */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo8p(Object obj) {
        C1269g c1269gM3434p;
        InterfaceC0744l0 interfaceC0744l0;
        int i5 = this.f1575h;
        boolean z5 = this.f1577j;
        EnumC1152a enumC1152a = EnumC1152a.f3788d;
        C0891q c0891q = C0891q.f2780a;
        Object obj2 = this.f1578k;
        switch (i5) {
            case 0:
                InterfaceC1347Y interfaceC1347Y = (InterfaceC1347Y) obj2;
                int i6 = this.f1576i;
                if (i6 == 0) {
                    AbstractC1784a.m3205S(obj);
                    if (z5) {
                        interfaceC1347Y.setValue(Boolean.TRUE);
                    } else if (((Boolean) interfaceC1347Y.getValue()).booleanValue()) {
                        C1577b c1577b = AbstractC2030a.f6765d;
                        EnumC2032c enumC2032c = EnumC2032c.MILLISECONDS;
                        long jM1376D = AbstractC0797o.m1376D(150L, enumC2032c);
                        this.f1576i = 1;
                        long jM3732c = 0;
                        boolean z6 = jM1376D > 0;
                        if (z6) {
                            long jM3731b = AbstractC2030a.m3731b(jM1376D, AbstractC0797o.m1376D(999999L, EnumC2032c.NANOSECONDS));
                            if ((((int) jM3731b) & 1) != 1) {
                                jM3732c = AbstractC2030a.m3732c(jM3731b, enumC2032c);
                            } else {
                                if (!(jM3731b == AbstractC2030a.f6766e || jM3731b == AbstractC2030a.f6767f)) {
                                    jM3732c = jM3731b >> 1;
                                }
                            }
                        } else if (z6) {
                            throw new C0330q();
                        }
                        Object objM3983e = AbstractC2162v.m3983e(jM3732c, this);
                        if (objM3983e != enumC1152a) {
                            objM3983e = c0891q;
                        }
                        if (objM3983e == enumC1152a) {
                            return enumC1152a;
                        }
                    }
                    return c0891q;
                }
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1784a.m3205S(obj);
                interfaceC1347Y.setValue(Boolean.FALSE);
                return c0891q;
            default:
                C0920W c0920w = (C0920W) obj2;
                int i7 = this.f1576i;
                if (i7 == 0) {
                    AbstractC1784a.m3205S(obj);
                    if (C1259L.m2335c(c0920w.m1939n().f5651b)) {
                        c1269gM3434p = null;
                    } else {
                        c1269gM3434p = AbstractC1922d.m3434p(c0920w.m1939n());
                        if (z5) {
                            int iM2337e = C1259L.m2337e(c0920w.m1939n().f5651b);
                            c0920w.f2867c.mo1h(C0920W.m1929e(c0920w.m1939n().f5650a, AbstractC1251D.m2313b(iM2337e, iM2337e)));
                            c0920w.m1942q(EnumC0052b0.f211d);
                        }
                    }
                    if (c1269gM3434p != null && (interfaceC0744l0 = c0920w.f2871g) != null) {
                        C0741k0 c0741k0M5480a = AbstractC3205c.m5480a(c1269gM3434p);
                        this.f1576i = 1;
                        ((C0734i) interfaceC0744l0).m1230a(c0741k0M5480a);
                        if (c0891q == enumC1152a) {
                            return enumC1152a;
                        }
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1784a.m3205S(obj);
                }
                return c0891q;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0502n(boolean z5, InterfaceC1347Y interfaceC1347Y, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f1577j = z5;
        this.f1578k = interfaceC1347Y;
    }
}
