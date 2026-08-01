package p172h3;

import p011B4.AbstractC0231b;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p117X2.AbstractC1676u;
import p160f3.InterfaceC2158r0;
import p178i3.InterfaceC2323d;

/* JADX INFO: renamed from: h3.n */
/* JADX INFO: loaded from: classes.dex */
public final class C2254n extends C2243c {

    /* JADX INFO: renamed from: n */
    public final EnumC2241a f7395n;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2254n(int i5, EnumC2241a enumC2241a) {
        super(i5);
        this.f7395n = enumC2241a;
        if (enumC2241a != EnumC2241a.f7351d) {
            if (i5 < 1) {
                throw new IllegalArgumentException(AbstractC0231b.m397h(i5, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + AbstractC1676u.m2995a(C2243c.class).m2978b() + " instead").toString());
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /* JADX INFO: renamed from: F */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m4109F(Object obj, boolean z5) {
        EnumC2241a enumC2241a = this.f7395n;
        EnumC2241a enumC2241a2 = EnumC2241a.f7353f;
        C0891q c0891q = C0891q.f2780a;
        if (enumC2241a == enumC2241a2) {
            Object objMo4090o = super.mo4090o(obj);
            return (!(objMo4090o instanceof C2249i) || (objMo4090o instanceof C2248h)) ? objMo4090o : c0891q;
        }
        InterfaceC2323d interfaceC2323d = AbstractC2245e.f7372d;
        C2251k c2251k = (C2251k) C2243c.f7362i.get(this);
        while (true) {
            long andIncrement = C2243c.f7358e.getAndIncrement(this);
            long j5 = 1152921504606846975L & andIncrement;
            boolean zM4095u = m4095u(andIncrement, false);
            int i5 = AbstractC2245e.f7370b;
            long j6 = i5;
            long j7 = j5 / j6;
            int i6 = (int) (j5 % j6);
            if (c2251k.f7958c != j7) {
                C2251k c2251kM4071b = C2243c.m4071b(this, j7, c2251k);
                if (c2251kM4071b != null) {
                    c2251k = c2251kM4071b;
                } else if (zM4095u) {
                    return new C2248h(m4093r());
                }
            }
            int iM4073e = C2243c.m4073e(this, c2251k, i6, obj, j5, interfaceC2323d, zM4095u);
            if (iM4073e == 0) {
                c2251k.m4385a();
                return c0891q;
            }
            if (iM4073e == 1) {
                break;
            }
            if (iM4073e != 2) {
                if (iM4073e == 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iM4073e == 4) {
                    if (j5 < C2243c.f7359f.get(this)) {
                        c2251k.m4385a();
                    }
                    return new C2248h(m4093r());
                }
                if (iM4073e == 5) {
                    c2251k.m4385a();
                }
            } else {
                if (zM4095u) {
                    c2251k.m4406h();
                    return new C2248h(m4093r());
                }
                InterfaceC2158r0 interfaceC2158r0 = interfaceC2323d instanceof InterfaceC2158r0 ? (InterfaceC2158r0) interfaceC2323d : null;
                if (interfaceC2158r0 != null) {
                    interfaceC2158r0.mo3961a(c2251k, i6 + i5);
                }
                m4086k((c2251k.f7958c * j6) + ((long) i6));
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172h3.C2243c, p172h3.InterfaceC2258r
    /* JADX INFO: renamed from: a */
    public final Object mo4079a(InterfaceC1046d interfaceC1046d, Object obj) throws Throwable {
        if (m4109F(obj, true) instanceof C2248h) {
            throw m4093r();
        }
        return C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172h3.C2243c, p172h3.InterfaceC2258r
    /* JADX INFO: renamed from: o */
    public final Object mo4090o(Object obj) {
        return m4109F(obj, false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p172h3.C2243c
    /* JADX INFO: renamed from: v */
    public final boolean mo4096v() {
        return this.f7395n == EnumC2241a.f7352e;
    }
}
