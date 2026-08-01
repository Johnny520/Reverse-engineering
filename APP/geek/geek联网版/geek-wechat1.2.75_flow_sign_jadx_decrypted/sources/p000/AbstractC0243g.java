package p000;

/* JADX INFO: renamed from: g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0243g extends C0040aq implements InterfaceC0814vd, InterfaceC0593pe {

    /* JADX INFO: renamed from: c */
    public final InterfaceC0295he f1852c;

    public AbstractC0243g(InterfaceC0295he interfaceC0295he, boolean z) {
        super(z);
        m438A((InterfaceC0641qp) interfaceC0295he.mo447b(C0893xh.f5252h));
        this.f1852c = interfaceC0295he.mo450i(this);
    }

    @Override // p000.C0040aq
    /* JADX INFO: renamed from: F */
    public final void mo442F(Object obj) {
        if (obj instanceof C0850wb) {
            C0850wb.f5078b.get((C0850wb) obj);
        }
    }

    @Override // p000.InterfaceC0814vd
    /* JADX INFO: renamed from: d */
    public final InterfaceC0295he mo1117d() {
        return this.f1852c;
    }

    @Override // p000.InterfaceC0593pe
    /* JADX INFO: renamed from: e */
    public final InterfaceC0295he mo256e() {
        return this.f1852c;
    }

    @Override // p000.InterfaceC0814vd
    /* JADX INFO: renamed from: f */
    public final void mo1118f(Object obj) {
        Throwable thM1794a = m10.m1794a(obj);
        if (thM1794a != null) {
            obj = new C0850wb(thM1794a, false);
        }
        Object objM440C = m440C(obj);
        if (objM440C == AbstractC0493mp.f3169g) {
            return;
        }
        mo453l(objM440C);
    }

    @Override // p000.C0040aq
    /* JADX INFO: renamed from: o */
    public final String mo456o() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // p000.C0040aq
    /* JADX INFO: renamed from: z */
    public final void mo467z(C0924yb c0924yb) {
        g80.m1202q(this.f1852c, c0924yb);
    }
}
