package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e32 extends AbstractC0031au {

    /* JADX INFO: renamed from: b */
    public final d32 f2302b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e32(w41 w41Var) {
        super(w41Var);
        w41Var.getClass();
        this.f2302b = new d32(w41Var.mo168e());
    }

    @Override // p000.AbstractC0409l2, p000.w41
    /* JADX INFO: renamed from: a */
    public final Object mo165a(y40 y40Var) {
        return m2784j(y40Var);
    }

    @Override // p000.AbstractC0031au, p000.w41
    /* JADX INFO: renamed from: d */
    public final void mo167d(ve0 ve0Var, Object obj) {
        int iMo572i = mo572i(obj);
        d32 d32Var = this.f2302b;
        d32Var.getClass();
        InterfaceC0863wx interfaceC0863wxMo1177b = ve0Var.mo1177b(d32Var);
        mo575p(interfaceC0863wxMo1177b, obj, iMo572i);
        interfaceC0863wxMo1177b.mo1176a(d32Var);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        return this.f2302b;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: f */
    public final Object mo771f() {
        return (c32) mo573l(mo574o());
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: g */
    public final int mo772g(Object obj) {
        c32 c32Var = (c32) obj;
        c32Var.getClass();
        return c32Var.mo630d();
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: h */
    public final Iterator mo773h(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: m */
    public final Object mo774m(Object obj) {
        c32 c32Var = (c32) obj;
        c32Var.getClass();
        return c32Var.mo628a();
    }

    @Override // p000.AbstractC0031au
    /* JADX INFO: renamed from: n */
    public final void mo279n(int i, Object obj, Object obj2) {
        ((c32) obj).getClass();
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    /* JADX INFO: renamed from: o */
    public abstract Object mo574o();

    /* JADX INFO: renamed from: p */
    public abstract void mo575p(InterfaceC0863wx interfaceC0863wx, Object obj, int i);
}
