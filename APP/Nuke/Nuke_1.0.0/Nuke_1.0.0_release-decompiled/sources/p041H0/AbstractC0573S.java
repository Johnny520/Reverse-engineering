package p041H0;

import java.util.LinkedHashMap;
import p011B4.AbstractC0231b;
import p029F0.C0375M;
import p029F0.InterfaceC0376N;
import p029F0.InterfaceC0378P;
import p029F0.InterfaceC0430v;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;
import p153e1.C2014j;
import p153e1.EnumC2017m;
import p186k.AbstractC2412I;
import p186k.C2444z;

/* JADX INFO: renamed from: H0.S */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0573S extends AbstractC0572Q implements InterfaceC0376N {

    /* JADX INFO: renamed from: r */
    public final AbstractC0596h0 f1785r;

    /* JADX INFO: renamed from: t */
    public LinkedHashMap f1787t;

    /* JADX INFO: renamed from: v */
    public InterfaceC0378P f1789v;

    /* JADX INFO: renamed from: w */
    public final C2444z f1790w;

    /* JADX INFO: renamed from: s */
    public long f1786s = 0;

    /* JADX INFO: renamed from: u */
    public final C0375M f1788u = new C0375M(this);

    public AbstractC0573S(AbstractC0596h0 abstractC0596h0) {
        this.f1785r = abstractC0596h0;
        C2444z c2444z = AbstractC2412I.f7812a;
        this.f1790w = new C2444z();
    }

    /* JADX INFO: renamed from: G0 */
    public static final void m895G0(AbstractC0573S abstractC0573S, InterfaceC0378P interfaceC0378P) {
        LinkedHashMap linkedHashMap;
        if (interfaceC0378P != null) {
            abstractC0573S.m667j0((((long) interfaceC0378P.mo609c()) & 4294967295L) | (((long) interfaceC0378P.mo611e()) << 32));
        } else {
            abstractC0573S.m667j0(0L);
        }
        if (!AbstractC1665j.m2981a(abstractC0573S.f1789v, interfaceC0378P) && interfaceC0378P != null && ((((linkedHashMap = abstractC0573S.f1787t) != null && !linkedHashMap.isEmpty()) || !interfaceC0378P.mo607a().isEmpty()) && !AbstractC1665j.m2981a(interfaceC0378P.mo607a(), abstractC0573S.f1787t))) {
            C0576V c0576v = abstractC0573S.f1785r.f1932r.f1700K.f1761q;
            AbstractC1665j.m2982b(c0576v);
            c0576v.f1812t.m850f();
            LinkedHashMap linkedHashMap2 = abstractC0573S.f1787t;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC0573S.f1787t = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(interfaceC0378P.mo607a());
        }
        abstractC0573S.f1789v = interfaceC0378P;
    }

    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: A0 */
    public final AbstractC0572Q mo879A0() {
        AbstractC0596h0 abstractC0596h0 = this.f1785r.f1934t;
        if (abstractC0596h0 != null) {
            return abstractC0596h0.mo979P0();
        }
        return null;
    }

    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: B0 */
    public final long mo880B0() {
        return this.f1786s;
    }

    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: F0 */
    public final void mo883F0() {
        mo666i0(this.f1786s, 0.0f, null);
    }

    /* JADX INFO: renamed from: H0 */
    public void mo896H0() {
        mo894z0().mo608b();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m897I0(long j5) {
        if (!C2014j.m3700a(this.f1786s, j5)) {
            this.f1786s = j5;
            AbstractC0596h0 abstractC0596h0 = this.f1785r;
            C0576V c0576v = abstractC0596h0.f1932r.f1700K.f1761q;
            if (c0576v != null) {
                c0576v.m906r0();
            }
            AbstractC0572Q.m878D0(abstractC0596h0);
        }
        if (this.f1781n) {
            return;
        }
        m887r0(mo894z0());
    }

    /* JADX INFO: renamed from: J0 */
    public final long m898J0(AbstractC0573S abstractC0573S, boolean z5) {
        long jM3702c = 0;
        AbstractC0573S abstractC0573SMo979P0 = this;
        while (!abstractC0573SMo979P0.equals(abstractC0573S)) {
            if (!abstractC0573SMo979P0.f1779l || !z5) {
                jM3702c = C2014j.m3702c(jM3702c, abstractC0573SMo979P0.f1786s);
            }
            AbstractC0596h0 abstractC0596h0 = abstractC0573SMo979P0.f1785r.f1934t;
            AbstractC1665j.m2982b(abstractC0596h0);
            abstractC0573SMo979P0 = abstractC0596h0.mo979P0();
            AbstractC1665j.m2982b(abstractC0573SMo979P0);
        }
        return jM3702c;
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f1785r.mo272b();
    }

    @Override // p029F0.InterfaceC0420q
    public final EnumC2017m getLayoutDirection() {
        return this.f1785r.f1932r.f1693D;
    }

    @Override // p029F0.AbstractC0391b0
    /* JADX INFO: renamed from: i0 */
    public final void mo666i0(long j5, float f2, InterfaceC1601c interfaceC1601c) {
        m897I0(j5);
        if (this.f1780m) {
            return;
        }
        mo896H0();
    }

    @Override // p029F0.AbstractC0391b0, p029F0.InterfaceC0376N
    /* JADX INFO: renamed from: l */
    public final Object mo650l() {
        return this.f1785r.mo650l();
    }

    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f1785r.mo282p();
    }

    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: t0 */
    public final AbstractC0572Q mo889t0() {
        AbstractC0596h0 abstractC0596h0 = this.f1785r.f1933s;
        if (abstractC0596h0 != null) {
            return abstractC0596h0.mo979P0();
        }
        return null;
    }

    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC0430v mo891w0() {
        return this.f1788u;
    }

    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: x0 */
    public final boolean mo892x0() {
        return this.f1789v != null;
    }

    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: y0 */
    public final C0564I mo893y0() {
        return this.f1785r.f1932r;
    }

    @Override // p041H0.AbstractC0572Q, p029F0.InterfaceC0420q
    /* JADX INFO: renamed from: z */
    public final boolean mo606z() {
        return true;
    }

    @Override // p041H0.AbstractC0572Q
    /* JADX INFO: renamed from: z0 */
    public final InterfaceC0378P mo894z0() {
        InterfaceC0378P interfaceC0378P = this.f1789v;
        if (interfaceC0378P != null) {
            return interfaceC0378P;
        }
        throw AbstractC0231b.m396g("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }
}
