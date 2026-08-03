package p144k;

import p077f8.AbstractC1089i;
import p136j8.C2104o;
import p187n.C2854h;
import p187n.C2855i;
import p187n.C2857k;
import p249qg.AbstractC3603v;
import p267s1.C3903k;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p339x1.InterfaceC5656w1;
import p352xf.EnumC5799a;
import p356y0.AbstractC5852n;
import p370yf.AbstractC6038c;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: k.t0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2211t0 extends AbstractC5852n implements InterfaceC5656w1 {

    /* JADX INFO: renamed from: u */
    public C2857k f7327u;

    /* JADX INFO: renamed from: v */
    public C2854h f7328v;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: k1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5453k1(C2211t0 c2211t0, AbstractC6038c abstractC6038c) {
        C2202q0 c2202q0;
        C2854h c2854h;
        if (abstractC6038c instanceof C2202q0) {
            c2202q0 = (C2202q0) abstractC6038c;
            int i9 = c2202q0.f7300j;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2202q0.f7300j = i9 - Integer.MIN_VALUE;
            } else {
                c2202q0 = new C2202q0(c2211t0, abstractC6038c);
            }
        }
        Object obj = c2202q0.f7298h;
        int i10 = c2202q0.f7300j;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            if (c2211t0.f7328v == null) {
                C2854h c2854h2 = new C2854h();
                C2857k c2857k = c2211t0.f7327u;
                c2202q0.f7297g = c2854h2;
                c2202q0.f7300j = 1;
                Object objM6281a = c2857k.m6281a(c2854h2, c2202q0);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM6281a == enumC5799a) {
                    return enumC5799a;
                }
                c2854h = c2854h2;
            }
            return C3967n.f12976a;
        }
        if (i10 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        c2854h = c2202q0.f7297g;
        AbstractC1089i.m2732I0(obj);
        c2211t0.f7328v = c2854h;
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX INFO: renamed from: l1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m5454l1(C2211t0 c2211t0, AbstractC6038c abstractC6038c) {
        C2205r0 c2205r0;
        if (abstractC6038c instanceof C2205r0) {
            c2205r0 = (C2205r0) abstractC6038c;
            int i9 = c2205r0.f7314i;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                c2205r0.f7314i = i9 - Integer.MIN_VALUE;
            } else {
                c2205r0 = new C2205r0(c2211t0, abstractC6038c);
            }
        }
        Object obj = c2205r0.f7312g;
        int i10 = c2205r0.f7314i;
        if (i10 == 0) {
            AbstractC1089i.m2732I0(obj);
            C2854h c2854h = c2211t0.f7328v;
            if (c2854h != null) {
                C2855i c2855i = new C2855i(c2854h);
                C2857k c2857k = c2211t0.f7327u;
                c2205r0.f7314i = 1;
                Object objM6281a = c2857k.m6281a(c2855i, c2205r0);
                EnumC5799a enumC5799a = EnumC5799a.f23547g;
                if (objM6281a == enumC5799a) {
                    return enumC5799a;
                }
            }
            return C3967n.f12976a;
        }
        if (i10 != 1) {
            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC1089i.m2732I0(obj);
        c2211t0.f7328v = null;
        return C3967n.f12976a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: P */
    public final void mo1608P(C3903k c3903k, EnumC3905l enumC3905l, long j3) {
        if (enumC3905l == EnumC3905l.f12813h) {
            int i9 = c3903k.f12805f;
            InterfaceC5557c interfaceC5557c = null;
            if (i9 == 4) {
                AbstractC3603v.m7563q(m10550Y0(), null, new C2208s0(this, interfaceC5557c, 0), 3);
            } else if (i9 == 5) {
                AbstractC3603v.m7563q(m10550Y0(), null, new C2208s0(this, interfaceC5557c, 1), 3);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: b0 */
    public final void mo1611b0() {
        m5455m1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.AbstractC5852n
    /* JADX INFO: renamed from: d1 */
    public final void mo743d1() {
        m5455m1();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public final void m5455m1() {
        C2854h c2854h = this.f7328v;
        if (c2854h != null) {
            this.f7327u.m6282b(new C2855i(c2854h));
            this.f7328v = null;
        }
    }
}
