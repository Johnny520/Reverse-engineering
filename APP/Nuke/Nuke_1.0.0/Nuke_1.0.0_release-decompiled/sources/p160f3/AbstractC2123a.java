package p160f3;

import com.bumptech.glide.AbstractC1923e;
import p027E4.C0330q;
import p056K2.AbstractC0885k;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p074O2.InterfaceC1051i;
import p079P2.EnumC1152a;
import p084Q2.AbstractC1176a;
import p112W2.InterfaceC1603e;
import p117X2.AbstractC1665j;
import p117X2.AbstractC1678w;
import p127Z2.AbstractC1784a;
import p190k3.AbstractC2453a;

/* JADX INFO: renamed from: f3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2123a extends C2122Z implements InterfaceC1046d, InterfaceC2160t {

    /* JADX INFO: renamed from: f */
    public final InterfaceC1051i f7064f;

    public AbstractC2123a(InterfaceC1051i interfaceC1051i, boolean z5) {
        super(z5);
        m3932O((InterfaceC2115S) interfaceC1051i.mo1166C(C2155q.f7102e));
        this.f7064f = interfaceC1051i.mo1168m(this);
    }

    @Override // p160f3.C2122Z
    /* JADX INFO: renamed from: D */
    public final String mo3923D() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p160f3.C2122Z
    /* JADX INFO: renamed from: N */
    public final void mo3931N(C0330q c0330q) {
        AbstractC2162v.m3990l(this.f7064f, c0330q);
    }

    @Override // p160f3.C2122Z
    /* JADX INFO: renamed from: V */
    public final void mo3938V(Object obj) {
        if (!(obj instanceof C2149n)) {
            mo3948e0(obj);
        } else {
            C2149n c2149n = (C2149n) obj;
            mo3947d0(c2149n.f7092a, C2149n.f7091b.get(c2149n) != 0);
        }
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: e */
    public final InterfaceC1051i mo275e() {
        return this.f7064f;
    }

    @Override // p160f3.InterfaceC2160t
    /* JADX INFO: renamed from: f */
    public final InterfaceC1051i mo1202f() {
        return this.f7064f;
    }

    /* JADX INFO: renamed from: f0 */
    public final void m3949f0(EnumC2161u enumC2161u, AbstractC2123a abstractC2123a, InterfaceC1603e interfaceC1603e) {
        Object objMo0g;
        int iOrdinal = enumC2161u.ordinal();
        C0891q c0891q = C0891q.f2780a;
        if (iOrdinal == 0) {
            try {
                AbstractC2453a.m4380h(AbstractC1923e.m3448G(AbstractC1923e.m3479q(abstractC2123a, this, interfaceC1603e)), c0891q);
                return;
            } finally {
                mo278i(AbstractC1784a.m3229o(th));
            }
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                AbstractC1665j.m2985e(interfaceC1603e, "<this>");
                AbstractC1923e.m3448G(AbstractC1923e.m3479q(abstractC2123a, this, interfaceC1603e)).mo278i(c0891q);
                return;
            }
            if (iOrdinal != 3) {
                throw new C0330q();
            }
            try {
                InterfaceC1051i interfaceC1051i = this.f7064f;
                Object objM4384l = AbstractC2453a.m4384l(interfaceC1051i, null);
                try {
                    if (interfaceC1603e instanceof AbstractC1176a) {
                        AbstractC1678w.m2998b(2, interfaceC1603e);
                        objMo0g = interfaceC1603e.mo0g(abstractC2123a, this);
                    } else {
                        objMo0g = AbstractC1923e.m3462V(interfaceC1603e, abstractC2123a, this);
                    }
                    AbstractC2453a.m4379g(interfaceC1051i, objM4384l);
                    if (objMo0g != EnumC1152a.f3788d) {
                        mo278i(objMo0g);
                    }
                } catch (Throwable th) {
                    AbstractC2453a.m4379g(interfaceC1051i, objM4384l);
                    throw th;
                }
            } catch (Throwable th2) {
            }
        }
    }

    @Override // p074O2.InterfaceC1046d
    /* JADX INFO: renamed from: i */
    public final void mo278i(Object obj) {
        Throwable thM1902a = AbstractC0885k.m1902a(obj);
        if (thM1902a != null) {
            obj = new C2149n(thM1902a, false);
        }
        Object objM3935R = m3935R(obj);
        if (objM3935R == AbstractC2162v.f7114e) {
            return;
        }
        mo3876u(objM3935R);
    }

    /* JADX INFO: renamed from: e0 */
    public void mo3948e0(Object obj) {
    }

    /* JADX INFO: renamed from: d0 */
    public void mo3947d0(Throwable th, boolean z5) {
    }
}
