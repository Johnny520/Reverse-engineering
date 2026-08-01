package p000;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0243g extends C0864wp implements InterfaceC0444ld, InterfaceC0556oe {

    /* JADX INFO: renamed from: c */
    public final InterfaceC0258ge f1999c;

    public AbstractC0243g(InterfaceC0258ge interfaceC0258ge, boolean z) {
        super(z);
        m2578A((InterfaceC0493mp) interfaceC0258ge.mo1272b(C0819vh.f4849h));
        this.f1999c = interfaceC0258ge.mo1275i(this);
    }

    @Override // p000.C0864wp
    /* JADX INFO: renamed from: F */
    public final void mo1239F(Object obj) {
        if (obj instanceof C0516nb) {
            C0516nb.f3367b.get((C0516nb) obj);
        }
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: d */
    public final InterfaceC0258ge mo1240d() {
        return this.f1999c;
    }

    @Override // p000.InterfaceC0556oe
    /* JADX INFO: renamed from: e */
    public final InterfaceC0258ge mo271e() {
        return this.f1999c;
    }

    @Override // p000.InterfaceC0444ld
    /* JADX INFO: renamed from: f */
    public final void mo1241f(Object obj) {
        Throwable thM1132a = f10.m1132a(obj);
        if (thM1132a != null) {
            obj = new C0516nb(thM1132a, false);
        }
        Object objM2579C = m2579C(obj);
        if (objM2579C == AbstractC0346ip.f2478g) {
            return;
        }
        mo2003l(objM2579C);
    }

    @Override // p000.C0864wp
    /* JADX INFO: renamed from: o */
    public final String mo1242o() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p000.C0864wp
    /* JADX INFO: renamed from: z */
    public final void mo1243z(C0591pb c0591pb) throws IllegalAccessException, InvocationTargetException {
        AbstractC0222ff.m1199u(this.f1999c, c0591pb);
    }
}
