package p000;

/* JADX INFO: renamed from: le */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0445le extends AbstractC0280h implements InterfaceC0852wd {

    /* JADX INFO: renamed from: b */
    public static final C0408ke f2998b = new C0408ke(C0893xh.f5246b, C0371je.f2713b);

    public AbstractC0445le() {
        super(C0893xh.f5246b);
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [gq, um] */
    @Override // p000.AbstractC0280h, p000.InterfaceC0295he
    /* JADX INFO: renamed from: b */
    public final InterfaceC0221fe mo447b(InterfaceC0258ge interfaceC0258ge) {
        InterfaceC0221fe interfaceC0221fe;
        AbstractC0493mp.m1857g("key", interfaceC0258ge);
        if (interfaceC0258ge instanceof C0408ke) {
            C0408ke c0408ke = (C0408ke) interfaceC0258ge;
            InterfaceC0258ge interfaceC0258ge2 = this.f2067a;
            if ((interfaceC0258ge2 == c0408ke || c0408ke.f2826b == interfaceC0258ge2) && (interfaceC0221fe = (InterfaceC0221fe) c0408ke.f2825a.mo26f(this)) != null) {
                return interfaceC0221fe;
            }
        } else if (C0893xh.f5246b == interfaceC0258ge) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo584d(InterfaceC0295he interfaceC0295he, Runnable runnable);

    /* JADX INFO: renamed from: e */
    public boolean mo1760e() {
        return !(this instanceof s80);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
    
        if (((p000.InterfaceC0221fe) r3.f2825a.mo26f(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
    
        if (p000.C0893xh.f5246b == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        return p000.C0931yi.f5432a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        return r2;
     */
    /* JADX WARN: Type inference failed for: r3v3, types: [gq, um] */
    @Override // p000.AbstractC0280h, p000.InterfaceC0295he
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p000.InterfaceC0295he mo448g(p000.InterfaceC0258ge r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            p000.AbstractC0493mp.m1857g(r0, r3)
            boolean r0 = r3 instanceof p000.C0408ke
            if (r0 == 0) goto L20
            ke r3 = (p000.C0408ke) r3
            ge r0 = r2.f2067a
            if (r0 == r3) goto L15
            ge r1 = r3.f2826b
            if (r1 != r0) goto L14
            goto L15
        L14:
            return r2
        L15:
            gq r3 = r3.f2825a
            java.lang.Object r3 = r3.mo26f(r2)
            fe r3 = (p000.InterfaceC0221fe) r3
            if (r3 == 0) goto L27
            goto L24
        L20:
            xh r0 = p000.C0893xh.f5246b
            if (r0 != r3) goto L27
        L24:
            yi r3 = p000.C0931yi.f5432a
            return r3
        L27:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.AbstractC0445le.mo448g(ge):he");
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0259gf.m1262x(this);
    }
}
